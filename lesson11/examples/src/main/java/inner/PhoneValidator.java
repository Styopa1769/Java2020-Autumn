package inner;

public class PhoneValidator {

    public void validatePhoneNumber(final String number) {

        class PhoneNumber {

            private String phoneNumber;

            public PhoneNumber() {
                this.phoneNumber = number;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }
        }

        PhoneNumber phoneNumber = new PhoneNumber();
    }
}

