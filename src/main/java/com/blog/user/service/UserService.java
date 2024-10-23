package com.blog.user.service;

import com.blog.user.entity.User;
import com.blog.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
//        ClassGraphph.CIRCUMVENT_ENCAPSULATION = ClassGraph.CircumventEncapsulationMethod.NARCISSUS;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public void generateClassDependencyGraph() {
//        try (ScanResult scanResult = new ClassGraph()
//                .enableClassInfo()
//                .enableInterClassDependencies()  // Enable inter-class dependency analysis
//                .acceptPackages("com.example")  // Specify the package to scan
//                .scan()) {
//
//            for (ClassInfo classInfo : scanResult.getAllClasses()) {
//                System.out.println("Class: " + classInfo.getName());
//
//                // Get direct dependencies of this class
//                classInfo.getClassDependencies().forEach(dependency ->
//                        System.out.println(" -> Depends on: " + dependency.getName())
//                );
//            }
//        } DONE
//        StringBuilder dot = new StringBuilder("digraph G {\n");
//
//        try (ScanResult scanResult = new ClassGraph()
//                .enableClassInfo()
//                .enableInterClassDependencies()
//                .acceptPackages("com.example")
//                .scan()) {
//
//            for (ClassInfo classInfo : scanResult.getAllClasses()) {
//                for (ClassInfo dependency : classInfo.getClassDependencies()) {
//                    dot.append("    \"").append(classInfo.getName()).append("\"")
//                            .append(" -> ")
//                            .append("\"").append(dependency.getName()).append("\"")
//                            .append(";\n");
//                }
//            }
//        }
//
//        dot.append("}");
//
//        // Output the DOT format to a file
//        try (FileWriter writer = new FileWriter("class_dependencies.dot")) {
//            writer.write(dot.toString());
//            System.out.println("Dependency graph written to class_dependencies.dot");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
