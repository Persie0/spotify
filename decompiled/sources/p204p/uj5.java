package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class uj5 extends ab21 implements Map {

    /* JADX INFO: renamed from: d */
    public nj5 f230903d;

    /* JADX INFO: renamed from: e */
    public pj5 f230904e;

    /* JADX INFO: renamed from: f */
    public rj5 f230905f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj5(ab21 ab21Var) {
        super(0);
        int i = ab21Var.f13976c;
        m25308b(this.f13976c + i);
        if (this.f13976c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(ab21Var.m25312f(i2), ab21Var.m25315i(i2));
            }
        } else if (i > 0) {
            bk5.m29627o0(0, 0, i, ab21Var.f13974a, this.f13974a);
            bk5.m29629p0(0, 0, i << 1, ab21Var.f13975b, this.f13975b);
            this.f13976c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        nj5 nj5Var = this.f230903d;
        if (nj5Var != null) {
            return nj5Var;
        }
        nj5 nj5Var2 = new nj5(this);
        this.f230903d = nj5Var2;
        return nj5Var2;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m83229j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m83230k(Collection collection) {
        int i = this.f13976c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f13976c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        pj5 pj5Var = this.f230904e;
        if (pj5Var != null) {
            return pj5Var;
        }
        pj5 pj5Var2 = new pj5(this);
        this.f230904e = pj5Var2;
        return pj5Var2;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m83231l(Collection collection) {
        int i = this.f13976c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(m25312f(i2))) {
                m25313g(i2);
            }
        }
        return i != this.f13976c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m25308b(map.size() + this.f13976c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        rj5 rj5Var = this.f230905f;
        if (rj5Var != null) {
            return rj5Var;
        }
        rj5 rj5Var2 = new rj5(this);
        this.f230905f = rj5Var2;
        return rj5Var2;
    }
}
