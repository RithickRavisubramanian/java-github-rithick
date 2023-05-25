package com.Java;

interface Vehicle {
    void start();
    void stop();
}

// Child interface extending the parent interface
interface Car extends Vehicle {
    void accelerate();
    void brake();
}

