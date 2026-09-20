package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class f5b0 {

    /* JADX INFO: renamed from: a */
    public final String f66005a;

    /* JADX INFO: renamed from: b */
    public final String f66006b;

    public /* synthetic */ f5b0() {
        this("", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5b0)) {
            return false;
        }
        f5b0 f5b0Var = (f5b0) obj;
        return wj50.m88271j(this.f66005a, f5b0Var.f66005a) && wj50.m88271j(this.f66006b, f5b0Var.f66006b);
    }

    public final int hashCode() {
        return this.f66006b.hashCode() + (this.f66005a.hashCode() * 31);
    }

    public f5b0(String str, String str2) {
        this.f66005a = str;
        this.f66006b = str2;
    }
}
