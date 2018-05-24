package pl.ppiorkowski.verjo.model.table;

import java.util.List;
import java.util.stream.Collectors;

import lombok.Builder;
import lombok.Singular;
import lombok.Value;
import pl.ppiorkowski.verjo.xsd.Column;

@Value
@Builder
public class AlternateKeyModel {
    private String name;
    @Singular
    private List<Column> columns;

    public List<String> getColumnNames() {
        return getColumns().stream()
                .map(Column::getName)
                .collect(Collectors.toList());
    }
}
