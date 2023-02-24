package dio.web.api.handler;

public class FieldFailureException extends BusinessException{
    public FieldFailureException(String field) {
        super("O campo %s é obrigatório", field);
    }
}
