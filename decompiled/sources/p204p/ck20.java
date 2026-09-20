package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ck20 {

    /* JADX INFO: renamed from: a */
    public final String f38788a;

    /* JADX INFO: renamed from: b */
    public final String f38789b;

    public ck20(String str, String str2) {
        this.f38788a = str;
        this.f38789b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck20)) {
            return false;
        }
        ck20 ck20Var = (ck20) obj;
        return wj50.m88271j(this.f38788a, ck20Var.f38788a) && wj50.m88271j(this.f38789b, ck20Var.f38789b);
    }

    public final int hashCode() {
        return this.f38789b.hashCode() + (this.f38788a.hashCode() * 31);
    }
}
