package p204p;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class qd20 extends AbstractC1888g8 {

    /* JADX INFO: renamed from: g */
    public transient int f187464g;

    public qd20() {
        super(nqf.m65415b(12));
        this.f187464g = 2;
        this.f187464g = 2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f187464g = 2;
        int i = objectInputStream.readInt();
        m43937k(nqf.m65415b(12));
        kjg1.m56594q(this, objectInputStream, i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        kjg1.m56597t(this, objectOutputStream);
    }

    @Override // p204p.AbstractC2329r8, p204p.eai0
    /* JADX INFO: renamed from: a */
    public final Collection mo38299a() {
        return (Set) super.mo38299a();
    }

    @Override // p204p.AbstractC1888g8, p204p.eai0
    public final Collection get(Object obj) {
        return (Set) super.get(obj);
    }

    @Override // p204p.AbstractC1888g8
    /* JADX INFO: renamed from: i */
    public final Collection mo43935i() {
        return pqf.m70647a(this.f187464g);
    }

    @Override // p204p.AbstractC1888g8
    /* JADX INFO: renamed from: l */
    public final Collection mo43938l(Object obj, Collection collection) {
        return new C1851f8(this, obj, (Set) collection);
    }
}
