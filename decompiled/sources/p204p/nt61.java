package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nt61 {

    /* JADX INFO: renamed from: a */
    public final String f157994a;

    /* JADX INFO: renamed from: b */
    public final String f157995b;

    /* JADX INFO: renamed from: c */
    public final String f157996c;

    public nt61(String str, String str2, String str3) {
        this.f157994a = str;
        this.f157995b = str2;
        this.f157996c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt61)) {
            return false;
        }
        nt61 nt61Var = (nt61) obj;
        return wj50.m88271j(this.f157994a, nt61Var.f157994a) && wj50.m88271j(this.f157995b, nt61Var.f157995b) && wj50.m88271j(this.f157996c, nt61Var.f157996c);
    }

    public final int hashCode() {
        return this.f157996c.hashCode() + s571.m77243b(this.f157994a.hashCode() * 31, 31, this.f157995b);
    }
}
