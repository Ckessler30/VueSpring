<template>
  <div id="app">
    <Airplane />
  </div>
</template>

<script>
import Airplane from './components/Airplane.vue'

export default {
  name: 'App',
  components: {
    Airplane
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
