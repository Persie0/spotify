package p204p;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes4.dex */
public final class gai0 extends AbstractC2283q7 {

    /* JADX INFO: renamed from: g */
    public transient j561 f78058g;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        this.f78058g = (j561) object;
        Object object2 = objectInputStream.readObject();
        Objects.requireNonNull(object2);
        m43937k((Map) object2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f78058g);
        objectOutputStream.writeObject(this.f77371e);
    }

    @Override // p204p.AbstractC1888g8, p204p.AbstractC2329r8
    /* JADX INFO: renamed from: e */
    public final Map mo43931e() {
        Map map = this.f77371e;
        if (map instanceof NavigableMap) {
            return new C2562x7(this, (NavigableMap) this.f77371e);
        }
        return map instanceof SortedMap ? new C1658a8(this, (SortedMap) this.f77371e) : new C2485v7(this, this.f77371e, 0);
    }

    @Override // p204p.AbstractC1888g8, p204p.AbstractC2329r8
    /* JADX INFO: renamed from: g */
    public final Set mo43933g() {
        Map map = this.f77371e;
        if (map instanceof NavigableMap) {
            return new C2603y7(this, (NavigableMap) this.f77371e);
        }
        return map instanceof SortedMap ? new C1695b8(this, (SortedMap) this.f77371e) : new C2523w7(this, this.f77371e);
    }

    @Override // p204p.AbstractC1888g8
    /* JADX INFO: renamed from: i */
    public final Collection mo43935i() {
        return (List) this.f78058g.get();
    }
}
