<template>
    <div class="container">
        <h1 class="text-center">Airplane List</h1>
        <table class="table table-striped">
            <thead>
                <th>Airplane Id</th>
                <th>Model</th>
                <th>AirLine</th>
                <th>Manufacturer</th>
            </thead>
            <tbody>
                <tr v-for="airplane in airplanes" v-bind:key="airplane.id">
                    <td>{{airplane.id}}</td>
                    <td>{{airplane.planeType}}</td>
                    <td>{{airplane.airline}}</td>
                    <td>{{airplane.manufacturer}}</td>
                </tr>
            </tbody>

        </table>
    </div>
</template>

<script>
import AirplaneService from '../services/AirplaneService'
    export default {
        name: "Airplanes",
        data(){
            return {
                airplanes : []
            }
        },
        methods: {
            getAirplanes(){
                AirplaneService.getAirplanes().then((res) => this.airplanes = res.data)
            }
        },
        created() {
            this.getAirplanes()
        }
    }
</script>


