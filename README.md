# 📌 Distributed Microservices with Kafka

Welcome to **DistributedMicroservices\_Kafka**, a project that demonstrates how to build distributed microservices using **Apache Kafka** as the event streaming platform. This repository contains microservices that communicate asynchronously via Kafka topics, enabling **scalability, fault tolerance, and event-driven architecture**.

## 🚀 Features

- **Microservices Architecture**: Independently deployable services.
- **Apache Kafka Integration**: Reliable event streaming.
- **Scalability & Resilience**: Event-driven design for high availability.
- **Decoupled Services**: Loose coupling using Kafka topics.

## 🏗️ Project Structure

```
DistributedMicroservices_Kafka/
│── service-A/B/C    # fraud, customer, notification microservices
│── api-gw/          # api gateway
│── kafka/amqp       # kafka/rabbitmq setup & configuration
│── clients/         # interface
└── eureka/          # service registry
```

## 📦 Prerequisites

Ensure you have the following installed:

- **Java 11+**
- **Apache Kafka**
- **Docker & Docker Compose**


## 🎯 Usage

- Services communicate via Kafka topics.
- Events are published/subscribed to Kafka.
- Microservices can scale independently.

## 📜 License

This project is licensed under the **MIT License**.

## 🤝 Contributing

Contributions are welcome! Please open an issue or submit a pull request.
