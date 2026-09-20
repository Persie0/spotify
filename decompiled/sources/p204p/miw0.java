package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class miw0 {

    /* JADX INFO: renamed from: a */
    public final String f144108a;

    /* JADX INFO: renamed from: b */
    public final String f144109b;

    /* JADX INFO: renamed from: c */
    public final String f144110c;

    /* JADX INFO: renamed from: d */
    public final String f144111d;

    /* JADX INFO: renamed from: e */
    public final boolean f144112e;

    /* JADX INFO: renamed from: f */
    public final ciw0 f144113f;

    /* JADX INFO: renamed from: g */
    public final int f144114g;

    public miw0(String str, String str2, String str3, String str4, boolean z, ciw0 ciw0Var, int i) {
        this.f144108a = str;
        this.f144109b = str2;
        this.f144110c = str3;
        this.f144111d = str4;
        this.f144112e = z;
        this.f144113f = ciw0Var;
        this.f144114g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof miw0)) {
            return false;
        }
        miw0 miw0Var = (miw0) obj;
        return wj50.m88271j(this.f144108a, miw0Var.f144108a) && wj50.m88271j(this.f144109b, miw0Var.f144109b) && wj50.m88271j(this.f144110c, miw0Var.f144110c) && wj50.m88271j(this.f144111d, miw0Var.f144111d) && this.f144112e == miw0Var.f144112e && wj50.m88271j(this.f144113f, miw0Var.f144113f) && this.f144114g == miw0Var.f144114g;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(this.f144108a.hashCode() * 31, 31, this.f144109b), 31, this.f144110c), 31, this.f144111d), 31, this.f144112e);
        ciw0 ciw0Var = this.f144113f;
        return Integer.hashCode(this.f144114g) + ((iM77245d + (ciw0Var == null ? 0 : ciw0Var.hashCode())) * 31);
    }
}
