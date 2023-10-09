package citytech.global.resource.payload;


import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import io.soabase.recordbuilder.core.RecordBuilder;

@Introspected
@Serdeable
@RecordBuilder
public record CreateUserPayload(
        String firstName,
        String lastName,
        String email,
        String userType
) {
}
