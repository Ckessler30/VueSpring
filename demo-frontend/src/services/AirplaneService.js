import axios from "axios";

const AIRPLANE_API_BASE_URL = "http://localhost:8080/api/airplanes"

class AirplaneServce{
    getAirplanes(){
        return axios.get(AIRPLANE_API_BASE_URL)
    }
}

export default new AirplaneServce()