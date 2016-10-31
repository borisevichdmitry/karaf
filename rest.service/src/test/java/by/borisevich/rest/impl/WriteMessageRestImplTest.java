package by.borisevich.rest.impl;

import by.borisevich.rest.WriteMessageRest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.Configuration;
import org.ops4j.pax.exam.Option;
import org.ops4j.pax.exam.junit.PaxExam;
import org.ops4j.pax.exam.spi.reactors.ExamReactorStrategy;
import org.ops4j.pax.exam.spi.reactors.PerMethod;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

import static org.ops4j.pax.exam.CoreOptions.*;

/**
 * Created by dima on 10/31/16.
 */
@RunWith(PaxExam.class)
@ExamReactorStrategy(PerMethod.class)
public class WriteMessageRestImplTest {

    @Inject
    private WriteMessageRest writeMessageRest;

    @Configuration
    public Option[] config() {

        return options(
                mavenBundle("by.borisevich.karaf", "by.borisevich.rest.boundle", "1.0-SNAPSHOT"),
                junitBundles()
        );
    }

    @Test
    public void testPost() throws Exception {
        Response response = writeMessageRest.handlePost("Test1");
        Assert.assertEquals(200, response.getStatus());
    }

    @Test
    public void testGet() throws Exception {
        Response response = writeMessageRest.handleGet("100");
        Assert.assertEquals(200, response.getStatus());
    }

}