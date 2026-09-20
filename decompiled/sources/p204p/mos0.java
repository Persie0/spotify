package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mos0 implements oos0 {

    /* JADX INFO: renamed from: a */
    public final String f145737a;

    /* JADX INFO: renamed from: b */
    public final String f145738b;

    public mos0(String str, String str2) {
        this.f145737a = str;
        this.f145738b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mos0)) {
            return false;
        }
        mos0 mos0Var = (mos0) obj;
        return wj50.m88271j(this.f145737a, mos0Var.f145737a) && wj50.m88271j(this.f145738b, mos0Var.f145738b);
    }

    public final int hashCode() {
        String str = this.f145737a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f145738b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
