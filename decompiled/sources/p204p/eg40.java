package p204p;

import com.google.common.collect.C0151a;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eg40 extends ef40 implements qci0 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f59211d = 0;

    /* JADX INFO: renamed from: b */
    public transient wsv0 f59212b;

    /* JADX INFO: renamed from: c */
    public transient hg40 f59213c;

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: a */
    public final pf40 mo38714a() {
        wsv0 wsv0Var = this.f59212b;
        if (wsv0Var != null) {
            return wsv0Var;
        }
        pf40 pf40VarMo38714a = super.mo38714a();
        this.f59212b = (wsv0) pf40VarMo38714a;
        return pf40VarMo38714a;
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: b */
    public final int mo38715b(int i, Object[] objArr) {
        o3a1 it = m38771m().iterator();
        while (it.hasNext()) {
            xlk0 xlk0Var = (xlk0) it.next();
            Arrays.fill(objArr, i, xlk0Var.m91436a() + i, xlk0Var.f263159a);
            i += xlk0Var.m91436a();
        }
        return i;
    }

    @Override // p204p.ef40, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return ((etv0) this).f62811e.m94165b(obj) > 0;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qci0)) {
            return false;
        }
        qci0 qci0Var = (qci0) obj;
        etv0 etv0Var = (etv0) this;
        if (etv0Var.size() != qci0Var.size()) {
            return false;
        }
        eg40 eg40Var = (eg40) qci0Var;
        if (m38771m().size() != eg40Var.m38771m().size()) {
            return false;
        }
        for (xlk0 xlk0Var : eg40Var.m38771m()) {
            if (etv0Var.f62811e.m94165b(xlk0Var.f263159a) != xlk0Var.m91436a()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return gmg1.m45263y(m38771m());
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: j */
    public final o3a1 iterator() {
        return new bg40(m38771m().iterator());
    }

    /* JADX INFO: renamed from: l */
    public abstract hg40 mo38770l();

    /* JADX INFO: renamed from: m */
    public final hg40 m38771m() {
        hg40 c0151a = this.f59213c;
        if (c0151a == null) {
            c0151a = isEmpty() ? ftv0.f73317t : new C0151a(this);
            this.f59213c = c0151a;
        }
        return c0151a;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return m38771m().toString();
    }

    @Override // p204p.ef40
    public abstract Object writeReplace();
}
