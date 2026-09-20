package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class i3x0 implements m3x0 {

    /* JADX INFO: renamed from: a */
    public final String f98346a;

    /* JADX INFO: renamed from: b */
    public final String f98347b;

    public i3x0(String str, String str2) {
        this.f98346a = str;
        this.f98347b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3x0)) {
            return false;
        }
        i3x0 i3x0Var = (i3x0) obj;
        return wj50.m88271j(this.f98346a, i3x0Var.f98346a) && wj50.m88271j(this.f98347b, i3x0Var.f98347b);
    }

    public final int hashCode() {
        int iHashCode = this.f98346a.hashCode() * 31;
        String str = this.f98347b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
