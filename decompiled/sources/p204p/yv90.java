package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yv90 implements ow90 {

    /* JADX INFO: renamed from: a */
    public final boolean f276589a;

    /* JADX INFO: renamed from: b */
    public final String f276590b;

    /* JADX INFO: renamed from: c */
    public final String f276591c;

    public yv90(boolean z, String str, String str2) {
        this.f276589a = z;
        this.f276590b = str;
        this.f276591c = str2;
    }

    /* JADX INFO: renamed from: a */
    public static yv90 m94677a(yv90 yv90Var, String str) {
        boolean z = yv90Var.f276589a;
        String str2 = yv90Var.f276590b;
        yv90Var.getClass();
        yv90Var.getClass();
        return new yv90(z, str2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv90)) {
            return false;
        }
        yv90 yv90Var = (yv90) obj;
        return this.f276589a == yv90Var.f276589a && wj50.m88271j(this.f276590b, yv90Var.f276590b) && wj50.m88271j(this.f276591c, yv90Var.f276591c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(Boolean.hashCode(this.f276589a) * 31, 31, this.f276590b);
        String str = this.f276591c;
        return (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
    }
}
