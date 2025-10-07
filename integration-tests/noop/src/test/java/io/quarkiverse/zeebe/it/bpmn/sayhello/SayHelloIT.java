package io.quarkiverse.zeebe.it.bpmn.sayhello;

import io.quarkus.test.junit.QuarkusIntegrationTest;
import io.quarkus.test.junit.TestProfile;

@QuarkusIntegrationTest
@TestProfile(value = io.quarkiverse.zeebe.it.bpmn.sayhello.TestProfile.class)
public class SayHelloIT extends SayHelloTest {
}
