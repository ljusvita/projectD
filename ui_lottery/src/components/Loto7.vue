<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <p>
      1, 2, 3, 4, 5, 6, 7
    </p>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  }
}
</script>
