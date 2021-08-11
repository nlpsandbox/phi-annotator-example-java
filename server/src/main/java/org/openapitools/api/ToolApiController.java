package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-02-25T15:53:35.186246-08:00[America/Los_Angeles]")
@Controller
@RequestMapping("${openapi.nLPSandboxDateAnnotator.base-path:/api/v1}")
public class ToolApiController implements ToolApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ToolApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
