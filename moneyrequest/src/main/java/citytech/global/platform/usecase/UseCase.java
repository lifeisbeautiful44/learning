package citytech.global.platform.usecase;

import freemarker.template.TemplateException;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Optional;

public interface UseCase <I extends UseCaseRequest, O extends UseCaseResponse> {
    Optional<O> execute(I request) throws IOException, URISyntaxException, InterruptedException, TemplateException;

}
