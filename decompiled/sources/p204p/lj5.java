package p204p;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class lj5 extends AbstractC2283q7 {

    /* JADX INFO: renamed from: g */
    public transient int f133987g;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f133987g = 3;
        int i = objectInputStream.readInt();
        m43937k(nqf.m65414a());
        kjg1.m56594q(this, objectInputStream, i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        kjg1.m56597t(this, objectOutputStream);
    }

    @Override // p204p.AbstractC1888g8
    /* JADX INFO: renamed from: i */
    public final Collection mo43935i() {
        return new ArrayList(this.f133987g);
    }
}
