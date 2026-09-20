package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ie80 {

    /* JADX INFO: renamed from: a */
    public final String f101344a;

    /* JADX INFO: renamed from: b */
    public final String f101345b;

    /* JADX INFO: renamed from: c */
    public final boolean f101346c;

    public ie80(String str, String str2, boolean z) {
        this.f101344a = str;
        this.f101345b = str2;
        this.f101346c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie80)) {
            return false;
        }
        ie80 ie80Var = (ie80) obj;
        return wj50.m88271j(this.f101344a, ie80Var.f101344a) && wj50.m88271j(this.f101345b, ie80Var.f101345b) && this.f101346c == ie80Var.f101346c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101346c) + s571.m77243b(this.f101344a.hashCode() * 31, 31, this.f101345b);
    }
}
