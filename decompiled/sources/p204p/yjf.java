package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yjf implements ekf {

    /* JADX INFO: renamed from: a */
    public final String f273356a;

    /* JADX INFO: renamed from: b */
    public final String f273357b;

    /* JADX INFO: renamed from: c */
    public final boolean f273358c;

    public yjf(String str, String str2, boolean z) {
        this.f273356a = str;
        this.f273357b = str2;
        this.f273358c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjf)) {
            return false;
        }
        yjf yjfVar = (yjf) obj;
        return wj50.m88271j(this.f273356a, yjfVar.f273356a) && wj50.m88271j(this.f273357b, yjfVar.f273357b) && this.f273358c == yjfVar.f273358c;
    }

    public final int hashCode() {
        int iHashCode = this.f273356a.hashCode() * 31;
        String str = this.f273357b;
        return Boolean.hashCode(this.f273358c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
