package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ds81 {

    /* JADX INFO: renamed from: a */
    public final String f52519a;

    /* JADX INFO: renamed from: b */
    public final String f52520b;

    public ds81(String str, String str2) {
        this.f52519a = str;
        this.f52520b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds81)) {
            return false;
        }
        ds81 ds81Var = (ds81) obj;
        return wj50.m88271j(this.f52519a, ds81Var.f52519a) && wj50.m88271j(this.f52520b, ds81Var.f52520b);
    }

    public final int hashCode() {
        return this.f52520b.hashCode() + (this.f52519a.hashCode() * 31);
    }
}
