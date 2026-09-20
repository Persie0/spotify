package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ykz0 {

    /* JADX INFO: renamed from: a */
    public final String f273866a;

    /* JADX INFO: renamed from: b */
    public final String f273867b;

    public ykz0(String str, String str2) {
        this.f273866a = str;
        this.f273867b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m94130a() {
        return this.f273867b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykz0)) {
            return false;
        }
        ykz0 ykz0Var = (ykz0) obj;
        return wj50.m88271j(this.f273866a, ykz0Var.f273866a) && wj50.m88271j(this.f273867b, ykz0Var.f273867b);
    }

    public final int hashCode() {
        int iHashCode = this.f273866a.hashCode() * 31;
        String str = this.f273867b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
