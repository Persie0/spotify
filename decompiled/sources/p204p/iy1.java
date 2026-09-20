package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class iy1 implements ky1 {

    /* JADX INFO: renamed from: a */
    public final String f106816a;

    /* JADX INFO: renamed from: b */
    public final int f106817b;

    public iy1(String str, int i) {
        this.f106816a = str;
        this.f106817b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy1)) {
            return false;
        }
        iy1 iy1Var = (iy1) obj;
        return wj50.m88271j(this.f106816a, iy1Var.f106816a) && this.f106817b == iy1Var.f106817b;
    }

    public final int hashCode() {
        String str = this.f106816a;
        return Integer.hashCode(this.f106817b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
