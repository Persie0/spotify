package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ree0 {

    /* JADX INFO: renamed from: a */
    public final String f198354a;

    /* JADX INFO: renamed from: b */
    public final String f198355b;

    /* JADX INFO: renamed from: c */
    public final String f198356c;

    public ree0(String str, String str2, String str3) {
        this.f198354a = str;
        this.f198355b = str2;
        this.f198356c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ree0)) {
            return false;
        }
        ree0 ree0Var = (ree0) obj;
        return wj50.m88271j(this.f198354a, ree0Var.f198354a) && wj50.m88271j(this.f198355b, ree0Var.f198355b) && this.f198356c.equals(ree0Var.f198356c);
    }

    public final int hashCode() {
        return this.f198356c.hashCode() + s571.m77243b(this.f198354a.hashCode() * 31, 961, this.f198355b);
    }
}
