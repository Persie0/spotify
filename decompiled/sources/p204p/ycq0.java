package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ycq0 {

    /* JADX INFO: renamed from: a */
    public final String f271546a;

    /* JADX INFO: renamed from: b */
    public final String f271547b;

    /* JADX INFO: renamed from: c */
    public final Long f271548c;

    /* JADX INFO: renamed from: d */
    public final gh00 f271549d;

    public ycq0(String str, String str2, Long l, gh00 gh00Var) {
        this.f271546a = str;
        this.f271547b = str2;
        this.f271548c = l;
        this.f271549d = gh00Var;
    }

    /* JADX INFO: renamed from: a */
    public static ycq0 m93377a(ycq0 ycq0Var, gh00 gh00Var) {
        String str = ycq0Var.f271546a;
        String str2 = ycq0Var.f271547b;
        Long l = ycq0Var.f271548c;
        ycq0Var.getClass();
        return new ycq0(str, str2, l, gh00Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycq0)) {
            return false;
        }
        ycq0 ycq0Var = (ycq0) obj;
        return wj50.m88271j(this.f271546a, ycq0Var.f271546a) && wj50.m88271j(this.f271547b, ycq0Var.f271547b) && wj50.m88271j(this.f271548c, ycq0Var.f271548c) && wj50.m88271j(this.f271549d, ycq0Var.f271549d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f271546a.hashCode() * 31, 31, this.f271547b);
        Long l = this.f271548c;
        int iHashCode = (iM77243b + (l == null ? 0 : l.hashCode())) * 31;
        gh00 gh00Var = this.f271549d;
        return iHashCode + (gh00Var != null ? gh00Var.hashCode() : 0);
    }

    public /* synthetic */ ycq0(Long l, String str, String str2) {
        this(str, str2, l, null);
    }
}
