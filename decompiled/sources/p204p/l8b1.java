package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l8b1 {

    /* JADX INFO: renamed from: a */
    public final String f130836a;

    /* JADX INFO: renamed from: b */
    public final String f130837b;

    /* JADX INFO: renamed from: c */
    public final String f130838c;

    public l8b1(String str, String str2, String str3) {
        this.f130836a = str;
        this.f130837b = str2;
        this.f130838c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8b1)) {
            return false;
        }
        l8b1 l8b1Var = (l8b1) obj;
        return wj50.m88271j(this.f130836a, l8b1Var.f130836a) && wj50.m88271j(this.f130837b, l8b1Var.f130837b) && wj50.m88271j(this.f130838c, l8b1Var.f130838c);
    }

    public final int hashCode() {
        return this.f130838c.hashCode() + s571.m77243b(this.f130836a.hashCode() * 31, 31, this.f130837b);
    }
}
