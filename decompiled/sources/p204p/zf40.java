package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zf40 extends ef40 {

    /* JADX INFO: renamed from: b */
    public final sf40 f282205b;

    public zf40(sf40 sf40Var) {
        this.f282205b = sf40Var;
    }

    @Override // p204p.ef40, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f282205b.m74959c(entry.getKey(), entry.getValue());
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: j */
    public final o3a1 iterator() {
        sf40 sf40Var = this.f282205b;
        sf40Var.getClass();
        return new yf40(sf40Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f282205b.f208461f;
    }

    @Override // p204p.ef40
    public Object writeReplace() {
        return super.writeReplace();
    }
}
