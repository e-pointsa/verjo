package pl.ppiorkowski.verjo.model;

import lombok.AllArgsConstructor;
import pl.ppiorkowski.verjo.model.provider.DatabaseModelProvider;
import pl.ppiorkowski.verjo.xsd.DatabaseModel;

import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor(access = PRIVATE)
public class DbModelFactory {

    public static DbModel build(String xmlFilePath) {
        DatabaseModel model = new DatabaseModelProvider(xmlFilePath).getModel();
        return new DbModel(model);
    }

}