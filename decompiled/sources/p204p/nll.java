package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class nll implements pll {

    /* JADX INFO: renamed from: a */
    public final List f155107a;

    /* JADX INFO: renamed from: b */
    public final List f155108b;

    public nll(List list) {
        this.f155107a = list;
        this.f155108b = list;
    }

    @Override // p204p.pll
    /* JADX INFO: renamed from: a */
    public final List mo62235a() {
        return this.f155108b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nll) && wj50.m88271j(this.f155107a, ((nll) obj).f155107a);
    }

    public final int hashCode() {
        return this.f155107a.hashCode();
    }
}
