package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ds90 {

    /* JADX INFO: renamed from: a */
    public final String f52521a;

    /* JADX INFO: renamed from: b */
    public final String f52522b;

    /* JADX INFO: renamed from: c */
    public final boolean f52523c;

    public ds90(String str, String str2, boolean z) {
        this.f52521a = str;
        this.f52522b = str2;
        this.f52523c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds90)) {
            return false;
        }
        ds90 ds90Var = (ds90) obj;
        return wj50.m88271j(this.f52521a, ds90Var.f52521a) && wj50.m88271j(this.f52522b, ds90Var.f52522b) && this.f52523c == ds90Var.f52523c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52523c) + s571.m77243b(this.f52521a.hashCode() * 31, 31, this.f52522b);
    }
}
