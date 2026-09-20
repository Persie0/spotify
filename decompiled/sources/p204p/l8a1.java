package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l8a1 {

    /* JADX INFO: renamed from: a */
    public final String f130830a;

    /* JADX INFO: renamed from: b */
    public final String f130831b;

    /* JADX INFO: renamed from: c */
    public final String f130832c;

    /* JADX INFO: renamed from: d */
    public final v8a1 f130833d;

    public l8a1(String str, String str2, String str3, v8a1 v8a1Var) {
        this.f130830a = str;
        this.f130831b = str2;
        this.f130832c = str3;
        this.f130833d = v8a1Var;
    }

    /* JADX INFO: renamed from: a */
    public static l8a1 m58466a(l8a1 l8a1Var, v8a1 v8a1Var) {
        String str = l8a1Var.f130830a;
        String str2 = l8a1Var.f130831b;
        String str3 = l8a1Var.f130832c;
        l8a1Var.getClass();
        return new l8a1(str, str2, str3, v8a1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8a1)) {
            return false;
        }
        l8a1 l8a1Var = (l8a1) obj;
        return wj50.m88271j(this.f130830a, l8a1Var.f130830a) && wj50.m88271j(this.f130831b, l8a1Var.f130831b) && wj50.m88271j(this.f130832c, l8a1Var.f130832c) && wj50.m88271j(this.f130833d, l8a1Var.f130833d);
    }

    public final int hashCode() {
        return this.f130833d.hashCode() + s571.m77243b(s571.m77243b(this.f130830a.hashCode() * 31, 31, this.f130831b), 31, this.f130832c);
    }
}
