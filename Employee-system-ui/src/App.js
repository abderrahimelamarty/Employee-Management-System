import "./App.css";
import AddEmployee from "./Components/AddEmployee";
import NavBar from "./Components/NavBar";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import EmployeeList from "./Components/EmployeeList";
import UpdateEmployee from "./Components/UpdateEmployee";

function App() {
  return (
    <>
      <BrowserRouter>
        <NavBar />
        <Routes>
          <Route index element={<EmployeeList />}></Route>

          <Route path="/" element={<EmployeeList />}></Route>
          <Route path="/employeelist" element={<EmployeeList />}></Route>
          <Route path="/addEmployee" element={<AddEmployee />}></Route>
          <Route path="/editEmployee/:id" element={<UpdateEmployee />} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
