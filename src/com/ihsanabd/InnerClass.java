package com.ihsanabd;

public class InnerClass {
    private String innerName;

    public InnerClass(String innerName) {
        this.innerName = innerName;
    }

    public String getInnerName() {
        return innerName;
    }

    public void setInnerName(String innerName) {
        this.innerName = innerName;
    }

    public class Inner {
        private String name;

        public Inner(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
