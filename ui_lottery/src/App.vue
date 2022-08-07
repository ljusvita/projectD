<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <Loto7 msg="Welcome to our Lottery App"/>
</template>

<script>
import Loto7 from './components/Loto7.vue'

export default {
  name: 'App',
  components: {
    Loto7
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
