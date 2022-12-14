package by.tms.SpringBootCalculator.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class FindHistoryUsernameModel {
    @NotBlank
    @NotEmpty
    private String username;
}
