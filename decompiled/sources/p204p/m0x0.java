package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m0x0 {

    /* JADX INFO: renamed from: a */
    public final String f138771a;

    /* JADX INFO: renamed from: b */
    public final boolean f138772b;

    public m0x0(String str, boolean z) {
        this.f138771a = str;
        this.f138772b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0x0)) {
            return false;
        }
        m0x0 m0x0Var = (m0x0) obj;
        return wj50.m88271j(this.f138771a, m0x0Var.f138771a) && this.f138772b == m0x0Var.f138772b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f138772b) + (this.f138771a.hashCode() * 31);
    }
}
