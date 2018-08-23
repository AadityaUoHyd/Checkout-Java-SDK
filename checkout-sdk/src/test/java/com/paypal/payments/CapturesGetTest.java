package com.paypal.payments;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.serializer.Json;
import com.paypal.TestHarness;
import java.io.File;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.fail;

public class CapturesGetTest extends TestHarness {

    @Test(enabled=false)
    public void testCapturesGetRequest() throws IOException {
        CapturesGetRequest request = new CapturesGetRequest("CAPTURE-ID");

        HttpResponse<Capture> response = client().execute(request);
        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());
    }
}
