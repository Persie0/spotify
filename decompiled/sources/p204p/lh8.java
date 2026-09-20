package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class lh8 implements th8 {

    /* JADX INFO: renamed from: a */
    public final String f133411a;

    /* JADX INFO: renamed from: b */
    public final UUID f133412b;

    public lh8(String str, UUID uuid) {
        this.f133411a = str;
        this.f133412b = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh8)) {
            return false;
        }
        lh8 lh8Var = (lh8) obj;
        return wj50.m88271j(this.f133411a, lh8Var.f133411a) && wj50.m88271j(this.f133412b, lh8Var.f133412b);
    }

    public final int hashCode() {
        return this.f133412b.hashCode() + (this.f133411a.hashCode() * 31);
    }
}
