package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gtp0 {

    /* JADX INFO: renamed from: a */
    public final int f84256a;

    /* JADX INFO: renamed from: b */
    public final String f84257b;

    public gtp0(int i, String str) {
        this.f84256a = i;
        this.f84257b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtp0)) {
            return false;
        }
        gtp0 gtp0Var = (gtp0) obj;
        return this.f84256a == gtp0Var.f84256a && wj50.m88271j(this.f84257b, gtp0Var.f84257b);
    }

    public final int hashCode() {
        return this.f84257b.hashCode() + (edb.m38547C(this.f84256a) * 31);
    }

    public /* synthetic */ gtp0() {
        this(1, "");
    }
}
