package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a4l0 {

    /* JADX INFO: renamed from: a */
    public final String f12277a;

    /* JADX INFO: renamed from: b */
    public final String f12278b;

    public a4l0(String str, String str2) {
        this.f12277a = str;
        this.f12278b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m24704a() {
        return this.f12277a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4l0)) {
            return false;
        }
        a4l0 a4l0Var = (a4l0) obj;
        return wj50.m88271j(this.f12277a, a4l0Var.f12277a) && wj50.m88271j(this.f12278b, a4l0Var.f12278b);
    }

    public final int hashCode() {
        int iHashCode = this.f12277a.hashCode() * 31;
        String str = this.f12278b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
