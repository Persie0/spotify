package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gip0 implements iip0 {

    /* JADX INFO: renamed from: a */
    public final String f80227a;

    /* JADX INFO: renamed from: b */
    public final String f80228b;

    public gip0(String str, String str2) {
        this.f80227a = str;
        this.f80228b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gip0)) {
            return false;
        }
        gip0 gip0Var = (gip0) obj;
        return wj50.m88271j(this.f80227a, gip0Var.f80227a) && wj50.m88271j(this.f80228b, gip0Var.f80228b);
    }

    public final int hashCode() {
        return this.f80228b.hashCode() + (this.f80227a.hashCode() * 31);
    }
}
