package p204p;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class x401 extends AbstractC2444u8 implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final x401 f257924b;

    /* JADX INFO: renamed from: a */
    public final mec0 f257925a;

    static {
        mec0 mec0Var = mec0.f142663L0;
        f257924b = new x401(t36.m79970p());
    }

    public x401(mec0 mec0Var) {
        this.f257925a = mec0Var;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f257925a.f142666Z) {
            return new wtz0(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // p204p.AbstractC2444u8
    /* JADX INFO: renamed from: a */
    public final int mo59769a() {
        return this.f257925a.f142675i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f257925a.m61539a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        this.f257925a.m61541c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f257925a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f257925a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f257925a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        mec0 mec0Var = this.f257925a;
        mec0Var.getClass();
        return new lec0(mec0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        mec0 mec0Var = this.f257925a;
        mec0Var.m61541c();
        int iM61544f = mec0Var.m61544f(obj);
        if (iM61544f < 0) {
            return false;
        }
        mec0Var.m61548j(iM61544f);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        this.f257925a.m61541c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        this.f257925a.m61541c();
        return super.retainAll(collection);
    }

    public x401() {
        this(new mec0());
    }
}
