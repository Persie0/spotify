package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class lgf1 extends adf1 {

    /* JADX INFO: renamed from: h */
    public final transient zgf1 f133216h;

    /* JADX INFO: renamed from: i */
    public final transient Object[] f133217i;

    /* JADX INFO: renamed from: t */
    public final transient int f133218t;

    public lgf1(zgf1 zgf1Var, Object[] objArr, int i) {
        super(1);
        this.f133216h = zgf1Var;
        this.f133217i = objArr;
        this.f133218t = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f133216h.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: f */
    public final int mo35478f(Object[] objArr) {
        daf1 xff1Var = this.f14616g;
        if (xff1Var == null) {
            xff1Var = new xff1(this);
            this.f14616g = xff1Var;
        }
        return xff1Var.mo35478f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        daf1 xff1Var = this.f14616g;
        if (xff1Var == null) {
            xff1Var = new xff1(this);
            this.f14616g = xff1Var;
        }
        return xff1Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f133218t;
    }
}
