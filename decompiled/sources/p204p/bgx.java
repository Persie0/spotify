package p204p;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* JADX INFO: loaded from: classes14.dex */
public final class bgx implements Serializable {

    /* JADX INFO: renamed from: a */
    public Throwable f27021a;

    /* JADX INFO: renamed from: b */
    public ArrayList f27022b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ArrayList f27023c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public HashMap f27024d = new HashMap();

    public bgx(RuntimeException runtimeException) {
        this.f27021a = runtimeException;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f27021a = (Throwable) objectInputStream.readObject();
        int i = objectInputStream.readInt();
        this.f27022b = new ArrayList(i);
        this.f27023c = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f27022b.add((lfa0) objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            Object[] objArr = new Object[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                objArr[i4] = objectInputStream.readObject();
            }
            this.f27023c.add(objArr);
        }
        int i5 = objectInputStream.readInt();
        this.f27024d = new HashMap();
        for (int i6 = 0; i6 < i5; i6++) {
            this.f27024d.put((String) objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.f27021a);
        int size = this.f27022b.size();
        objectOutputStream.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutputStream.writeObject((lfa0) this.f27022b.get(i));
            Object[] objArr = (Object[]) this.f27023c.get(i);
            objectOutputStream.writeInt(objArr.length);
            for (Object obj : objArr) {
                if (obj instanceof Serializable) {
                    objectOutputStream.writeObject(obj);
                } else {
                    objectOutputStream.writeObject("[Object could not be serialized: " + obj.getClass().getName() + "]");
                }
            }
        }
        objectOutputStream.writeInt(this.f27024d.keySet().size());
        for (String str : this.f27024d.keySet()) {
            objectOutputStream.writeObject(str);
            Object obj2 = this.f27024d.get(str);
            if (obj2 instanceof Serializable) {
                objectOutputStream.writeObject(obj2);
            } else {
                objectOutputStream.writeObject("[Object could not be serialized: " + obj2.getClass().getName() + "]");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m29152a(lfa0 lfa0Var, Object... objArr) {
        this.f27022b.add(lfa0Var);
        this.f27023c.add(ni5.m64553a(objArr));
    }

    /* JADX INFO: renamed from: b */
    public final String m29153b(Locale locale) {
        String string;
        StringBuilder sb = new StringBuilder();
        int size = this.f27022b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            lfa0 lfa0Var = (lfa0) this.f27022b.get(i2);
            Object[] objArr = (Object[]) this.f27023c.get(i2);
            lfa0Var.getClass();
            try {
                ResourceBundle bundle = ResourceBundle.getBundle("assets/" + lfa0.class.getName().replaceAll("\\.", "/"), locale);
                string = bundle.getLocale().getLanguage().equals(locale.getLanguage()) ? bundle.getString(lfa0Var.toString()) : lfa0Var.f132879a;
            } catch (MissingResourceException unused) {
            }
            sb.append(new MessageFormat(string, locale).format(objArr));
            i++;
            if (i < size) {
                sb.append(": ");
            }
        }
        return sb.toString();
    }
}
