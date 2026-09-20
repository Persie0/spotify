package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class gk80 implements fte, Iterable, pq60 {

    /* JADX INFO: renamed from: a */
    public final int f80750a;

    /* JADX INFO: renamed from: b */
    public final int f80751b;

    public gk80(int i, int i2) {
        this.f80750a = i;
        this.f80751b = i2;
    }

    @Override // p204p.fte
    public final boolean isEmpty() {
        return ((fk80) mo28071n()).compareTo(mo28072o()) > 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b450 b450Var = new b450(this.f80750a, this.f80751b, 1);
        ArrayList arrayList = new ArrayList(i6f.m49804T(b450Var, 10));
        Iterator it = b450Var.iterator();
        while (it.hasNext()) {
            arrayList.add(new fk80(((t350) it).nextInt()));
        }
        return arrayList.iterator();
    }

    @Override // p204p.fte
    /* JADX INFO: renamed from: n */
    public final Comparable mo28071n() {
        return new fk80(this.f80750a);
    }

    @Override // p204p.fte
    /* JADX INFO: renamed from: o */
    public final Comparable mo28072o() {
        return new fk80(this.f80751b);
    }
}
