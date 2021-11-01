package ru.tn.courses.nzarudniy.v5.task_2.users;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
public class UserXml extends User {
    public UserXml() {
        super();
    }

    public UserXml(User user) {
        super(user);
    }

    public UserXml(Long id, Type type, String username, String email, String password) {
        super(id, type, username, email, password);
    }

    @Override
    public String convert() {
        try {
            StringWriter res = new StringWriter();
            Marshaller marshaller = JAXBContext.newInstance(UserXml.class).createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(this, res);
            return res.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }
}
