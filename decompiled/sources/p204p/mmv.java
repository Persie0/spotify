package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mmv {

    /* JADX INFO: renamed from: a */
    public final String f145260a;

    /* JADX INFO: renamed from: b */
    public final String f145261b;

    /* JADX INFO: renamed from: c */
    public final String f145262c;

    /* JADX INFO: renamed from: d */
    public final int f145263d;

    /* JADX INFO: renamed from: e */
    public final ha3 f145264e;

    public mmv(String str, String str2, String str3, int i, ha3 ha3Var) {
        this.f145260a = str;
        this.f145261b = str2;
        this.f145262c = str3;
        this.f145263d = i;
        this.f145264e = ha3Var;
    }

    /* JADX INFO: renamed from: a */
    public static mmv m62337a(mmv mmvVar, ha3 ha3Var) {
        String str = mmvVar.f145260a;
        String str2 = mmvVar.f145261b;
        String str3 = mmvVar.f145262c;
        int i = mmvVar.f145263d;
        mmvVar.getClass();
        return new mmv(str, str2, str3, i, ha3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmv)) {
            return false;
        }
        mmv mmvVar = (mmv) obj;
        return wj50.m88271j(this.f145260a, mmvVar.f145260a) && wj50.m88271j(this.f145261b, mmvVar.f145261b) && wj50.m88271j(this.f145262c, mmvVar.f145262c) && this.f145263d == mmvVar.f145263d && wj50.m88271j(this.f145264e, mmvVar.f145264e);
    }

    public final int hashCode() {
        return this.f145264e.hashCode() + f710.m40938f(this.f145263d, s571.m77243b(s571.m77243b(this.f145260a.hashCode() * 31, 31, this.f145261b), 31, this.f145262c), 31);
    }

    public /* synthetic */ mmv(String str, String str2, int i, String str3) {
        this(str, str2, str3, i, da3.f46966a);
    }
}
