import axios from "axios";

const EMPLOYE_API_BASE_URL = "http://localhost:8084/api/v1/addEmployee";

class EmployeeService {
  saveEmployee(employee) {
    return axios.post(EMPLOYE_API_BASE_URL, employee);
  }
}
export default new EmployeeService();
