package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fyn0 {

    /* JADX INFO: renamed from: g */
    public static final fyn0 f74778g;

    /* JADX INFO: renamed from: a */
    public final String f74779a;

    /* JADX INFO: renamed from: b */
    public final boolean f74780b;

    /* JADX INFO: renamed from: c */
    public final String f74781c;

    /* JADX INFO: renamed from: d */
    public final List f74782d;

    /* JADX INFO: renamed from: e */
    public final Integer f74783e;

    /* JADX INFO: renamed from: f */
    public final float f74784f;

    static {
        String str = "";
        f74778g = new fyn0(str, str, lau.f131415a, false);
    }

    public /* synthetic */ fyn0(String str, String str2, List list, boolean z) {
        this(str, z, str2, list, null, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyn0)) {
            return false;
        }
        fyn0 fyn0Var = (fyn0) obj;
        return wj50.m88271j(this.f74779a, fyn0Var.f74779a) && this.f74780b == fyn0Var.f74780b && wj50.m88271j(this.f74781c, fyn0Var.f74781c) && wj50.m88271j(this.f74782d, fyn0Var.f74782d) && wj50.m88271j(this.f74783e, fyn0Var.f74783e) && Float.compare(this.f74784f, fyn0Var.f74784f) == 0;
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(s571.m77245d(this.f74779a.hashCode() * 31, 31, this.f74780b), 31, this.f74781c), 31, this.f74782d);
        Integer num = this.f74783e;
        return Float.hashCode(this.f74784f) + ((iM77244c + (num == null ? 0 : num.hashCode())) * 31);
    }

    public fyn0(String str, boolean z, String str2, List list, Integer num, float f) {
        this.f74779a = str;
        this.f74780b = z;
        this.f74781c = str2;
        this.f74782d = list;
        this.f74783e = num;
        this.f74784f = f;
    }
}
