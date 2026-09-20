package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qz31 implements b041 {

    /* JADX INFO: renamed from: a */
    public final String f194104a;

    /* JADX INFO: renamed from: b */
    public final String f194105b;

    /* JADX INFO: renamed from: c */
    public final String f194106c;

    /* JADX INFO: renamed from: d */
    public final float f194107d;

    public qz31(String str, String str2, String str3, float f) {
        this.f194104a = str;
        this.f194105b = str2;
        this.f194106c = str3;
        this.f194107d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz31)) {
            return false;
        }
        qz31 qz31Var = (qz31) obj;
        return wj50.m88271j(this.f194104a, qz31Var.f194104a) && wj50.m88271j(this.f194105b, qz31Var.f194105b) && wj50.m88271j(this.f194106c, qz31Var.f194106c) && Float.compare(this.f194107d, qz31Var.f194107d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f194107d) + s571.m77243b(s571.m77243b(this.f194104a.hashCode() * 31, 31, this.f194105b), 31, this.f194106c);
    }
}
