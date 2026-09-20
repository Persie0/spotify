package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class y6v extends AbstractC1895gf {

    /* JADX INFO: renamed from: c */
    public final List f269901c;

    public y6v(List list) {
        super(list, qte.f192368b);
        this.f269901c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y6v) && wj50.m88271j(this.f269901c, ((y6v) obj).f269901c);
    }

    @Override // p204p.AbstractC1895gf
    /* JADX INFO: renamed from: h */
    public final List mo44552h() {
        return this.f269901c;
    }

    public final int hashCode() {
        return this.f269901c.hashCode();
    }
}
