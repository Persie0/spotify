package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lg40 {

    /* JADX INFO: renamed from: a */
    public final String f133069a;

    /* JADX INFO: renamed from: b */
    public final String f133070b;

    /* JADX INFO: renamed from: c */
    public final String f133071c;

    /* JADX INFO: renamed from: d */
    public final int f133072d;

    /* JADX INFO: renamed from: e */
    public final String f133073e;

    public lg40(int i, String str, String str2, String str3, String str4) {
        this.f133069a = str;
        this.f133070b = str2;
        this.f133071c = str3;
        this.f133072d = i;
        this.f133073e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg40)) {
            return false;
        }
        lg40 lg40Var = (lg40) obj;
        return wj50.m88271j(this.f133069a, lg40Var.f133069a) && wj50.m88271j(this.f133070b, lg40Var.f133070b) && wj50.m88271j(this.f133071c, lg40Var.f133071c) && this.f133072d == lg40Var.f133072d && wj50.m88271j(this.f133073e, lg40Var.f133073e);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f133072d, s571.m77243b(s571.m77243b(this.f133069a.hashCode() * 31, 31, this.f133070b), 31, this.f133071c), 31);
        String str = this.f133073e;
        return iM62800g + (str == null ? 0 : str.hashCode());
    }
}
