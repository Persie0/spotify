package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class w660 implements y660 {

    /* JADX INFO: renamed from: a */
    public final Set f248263a;

    /* JADX INFO: renamed from: b */
    public final xw50 f248264b;

    public w660(Set set, xw50 xw50Var) {
        this.f248263a = set;
        this.f248264b = xw50Var;
    }

    @Override // p204p.y660
    /* JADX INFO: renamed from: a */
    public final xw50 mo87268a() {
        return this.f248264b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w660)) {
            return false;
        }
        w660 w660Var = (w660) obj;
        return wj50.m88271j(this.f248263a, w660Var.f248263a) && this.f248264b == w660Var.f248264b;
    }

    public final int hashCode() {
        return this.f248264b.hashCode() + (this.f248263a.hashCode() * 31);
    }
}
