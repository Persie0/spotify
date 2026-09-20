package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class z6v extends AbstractC1895gf {

    /* JADX INFO: renamed from: c */
    public final String f279994c;

    /* JADX INFO: renamed from: d */
    public final List f279995d;

    public z6v(String str, List list) {
        super(list, qte.f192367a);
        this.f279994c = str;
        this.f279995d = list;
    }

    /* JADX INFO: renamed from: t */
    public static z6v m95516t(z6v z6vVar, ArrayList arrayList) {
        return new z6v(z6vVar.f279994c, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6v)) {
            return false;
        }
        z6v z6vVar = (z6v) obj;
        return wj50.m88271j(this.f279994c, z6vVar.f279994c) && wj50.m88271j(this.f279995d, z6vVar.f279995d);
    }

    @Override // p204p.AbstractC1895gf
    /* JADX INFO: renamed from: h */
    public final List mo44552h() {
        return this.f279995d;
    }

    public final int hashCode() {
        return this.f279995d.hashCode() + (this.f279994c.hashCode() * 31);
    }

    /* JADX INFO: renamed from: u */
    public final String m95517u() {
        return this.f279994c;
    }
}
