package br.com.rodrigss.dto.response;
import lombok.*;
/**
 * @author Rodrigo Estanislau
 */
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T> {
    private Boolean success;
    private String message;
    private T result;
    private ErrorResponse error;
    private T data;

    // Getters
    public boolean isSuccess() { return success; }
    public String getMessage() { return message; }
    public T getData() { return data; }

    // Builder
    public static class Builder<T> {
        private boolean success;
        private String message;
        private T data;

        public Builder<T> success(boolean success) {
            this.success = success;
            return this;
        }

        public Builder<T> message(String message) {
            this.message = message;
            return this;
        }

        public Builder<T> data(T data) {
            this.data = data;
            return this;
        }

        public BaseResponse<T> build() {
            BaseResponse<T> response = new BaseResponse<>();
            response.success = this.success;
            response.message = this.message;
            response.data = this.data;
            return response;
        }
    }

    public static <T> Builder<T> builder() {
        return new Builder<>();
    }
}




