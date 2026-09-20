package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class w7h1 extends m0h1 {

    /* JADX INFO: renamed from: c */
    public final transient jof1 f248686c;

    /* JADX INFO: renamed from: d */
    public final transient Object[] f248687d;

    /* JADX INFO: renamed from: e */
    public final transient int f248688e = 1;

    public w7h1(jof1 jof1Var, Object[] objArr) {
        this.f248686c = jof1Var;
        this.f248687d = objArr;
    }

    @Override // p204p.dlg1
    /* JADX INFO: renamed from: a */
    public final int mo36358a(Object[] objArr) {
        ptg1 j6h1Var = this.f138680b;
        if (j6h1Var == null) {
            j6h1Var = new j6h1(this);
            this.f138680b = j6h1Var;
        }
        return j6h1Var.mo36358a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f248686c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ptg1 j6h1Var = this.f138680b;
        if (j6h1Var == null) {
            j6h1Var = new j6h1(this);
            this.f138680b = j6h1Var;
        }
        return j6h1Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f248688e;
    }
}
