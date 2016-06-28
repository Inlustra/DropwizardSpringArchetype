#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.resources;

import io.dropwizard.testing.junit.ResourceTestRule;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BasicHealthResourceUTest {

    @Rule
    public ResourceTestRule resources = ResourceTestRule.builder()
            .addResource(new BasicHealthResource())
            .build();

    @Test
    public void shouldReturnOk() {
        assertThat(resources.client().target("/health").request().get().getStatus(), is(200));
    }
}
