package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class vtf1 extends rqf1 {

    /* JADX INFO: renamed from: c */
    public final transient jof1 f244637c;

    /* JADX INFO: renamed from: d */
    public final transient Object[] f244638d;

    /* JADX INFO: renamed from: e */
    public final transient int f244639e = 1;

    public vtf1(jof1 jof1Var, Object[] objArr) {
        this.f244637c = jof1Var;
        this.f244638d = objArr;
    }

    @Override // p204p.jpf1
    /* JADX INFO: renamed from: a */
    public final int mo27177a(int i, Object[] objArr) {
        gqf1 qtf1Var = this.f201826b;
        if (qtf1Var == null) {
            qtf1Var = new qtf1(this);
            this.f201826b = qtf1Var;
        }
        return qtf1Var.mo27177a(i, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f244637c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        gqf1 qtf1Var = this.f201826b;
        if (qtf1Var == null) {
            qtf1Var = new qtf1(this);
            this.f201826b = qtf1Var;
        }
        return qtf1Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f244639e;
    }
}
