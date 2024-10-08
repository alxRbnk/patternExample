package org.rbnk.pattern.builder;

public class Person {
    private long id;
    private String firstName;
    private String lastName;
    private int age;

    private Person() {
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public static Builder newBuilder() {
        return new Person().new Builder();
    }

    public class Builder {

        private Builder() {
        }

        public Builder id(long id) {
            Person.this.id = id;
            return this;
        }

        public Builder firstName(String firstName) {
            Person.this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            Person.this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            Person.this.age = age;
            return this;
        }

        public Person build() {
            return Person.this;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
