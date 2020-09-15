package pl.skrzypekjan.drivers.model;



import static pl.skrzypekjan.drivers.service.DriverServiceImpl.count;

public class Driver {

    private long id;
    private String carNumber;
    private String company;
    private String gatewayNumber;
    private String status;



    public Driver(String carNumber, String company, String gatewayNumber, String status) {
        this.id = count;
        this.carNumber = carNumber;
        this.company = company;
        this.gatewayNumber = gatewayNumber;
        this.status = status;
        count++;
    }

    public Driver() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public java.lang.String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(java.lang.String carNumber) {
        this.carNumber = carNumber;
    }

    public java.lang.String getCompany() {
        return company;
    }

    public void setCompany(java.lang.String company) {
        this.company = company;
    }

    public java.lang.String getGatewayNumber() {
        return gatewayNumber;
    }

    public void setGatewayNumber(java.lang.String gatewayNumber) {
        this.gatewayNumber = gatewayNumber;
    }

    public java.lang.String getStatus() {
        return status;
    }

    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Driver{" +
                "id=" + id +
                ", carNumber=" + carNumber +
                ", company=" + company +
                ", gatewayNumber=" + gatewayNumber +
                ", status=" + status +
                '}';
    }
}
