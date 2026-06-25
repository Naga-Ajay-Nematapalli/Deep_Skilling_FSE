public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {
        if (id == 101) {
            return "Customer Found: Ajay";
        } else if (id == 102) {
            return "Customer Found: Ravi";
        } else if (id == 103) {
            return "Customer Found: Sneha";
        } else {
            return "Customer not found";
        }
    }
}