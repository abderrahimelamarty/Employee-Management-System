import axios from "axios";

const EMPLOYE_API_BASE_URL = "http://localhost:8084/api/v1";

class EmployeeService {
  saveEmployee(employee) {
    return axios.post(EMPLOYE_API_BASE_URL + "/addEmployee", employee);
  }
  getEmployees() {
    return axios.get(EMPLOYE_API_BASE_URL + "/Employees");
  }
  deleteEmployee(id) {
    return axios.delete(EMPLOYE_API_BASE_URL + "/deleteEmployee/" + id);
  }
  getEmployeeById(id) {
    return axios.get(EMPLOYE_API_BASE_URL + "/Employee/" + id);
  }
  updateEmployee(employee, id) {
    return axios.put(EMPLOYE_API_BASE_URL + "/updateEmployee/" + id, employee);
  }
}
export default new EmployeeService();
