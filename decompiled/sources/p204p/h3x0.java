package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class h3x0 implements m3x0 {

    /* JADX INFO: renamed from: a */
    public final String f87353a;

    /* JADX INFO: renamed from: b */
    public final String f87354b;

    public h3x0(String str, String str2) {
        this.f87353a = str;
        this.f87354b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3x0)) {
            return false;
        }
        h3x0 h3x0Var = (h3x0) obj;
        return wj50.m88271j(this.f87353a, h3x0Var.f87353a) && wj50.m88271j(this.f87354b, h3x0Var.f87354b);
    }

    public final int hashCode() {
        return this.f87354b.hashCode() + (this.f87353a.hashCode() * 31);
    }
}
