package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class r351 {

    /* JADX INFO: renamed from: a */
    public final String f195427a;

    /* JADX INFO: renamed from: b */
    public final List f195428b;

    public r351(String str, ro80 ro80Var) {
        this.f195427a = str;
        this.f195428b = ro80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r351)) {
            return false;
        }
        r351 r351Var = (r351) obj;
        return wj50.m88271j(this.f195427a, r351Var.f195427a) && wj50.m88271j(this.f195428b, r351Var.f195428b);
    }

    public final int hashCode() {
        return this.f195428b.hashCode() + (this.f195427a.hashCode() * 31);
    }
}
