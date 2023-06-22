<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <ul v-if="!loading && data && data.length">
      {{ data }}
    </ul>
  </div>
  <p v-if="loading">
    Still loading..
  </p>
  <p v-if="error">
    error! error!
  </p>
</template>

<script>
import {onMounted, ref} from "vue";

export default {
  name: 'Loto7Post',
  props: {
    msg: String
  },
  setup() {
    const data = ref(null);
    const loading = ref(true);
    const error = ref(null);

    function fetchData() {
      loading.value = true;
      // I prefer to use fetch
      // you can use use axios as an alternative
      return fetch('http://localhost:18080/loto7', {
        method: 'get',
        headers: {
          'content-type': 'application/json'
        }
      })
          .then(res => {
            // a non-200 response code
            if (!res.ok) {
              // create error instance with HTTP status text
              const error = new Error(res.statusText);
              error.json = res.json();
              throw error;
            }
            console.log(res);

            return res.json();
          })
          .then(json => {
            // set the response data
            console.log(json)
            data.value = json.numbers;
          })
          .catch(err => {
            error.value = err;
            // In case a custom JSON error response was provided
            if (err.json) {
              return err.json.then(json => {
                // set the JSON response message
                error.value.message = json.message;
              });
            }
          })
          .then(() => {
            loading.value = false;
          });
    }

    onMounted(() => {
      fetchData();
    });

    return {
      data,
      loading,
      error
    };
  }
}
</script>
