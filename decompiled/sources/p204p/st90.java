package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class st90 extends yt90 {

    /* JADX INFO: renamed from: b */
    public final String f213861b;

    /* JADX INFO: renamed from: c */
    public final knd f213862c;

    /* JADX INFO: renamed from: d */
    public final boolean f213863d;

    /* JADX INFO: renamed from: e */
    public final abd f213864e;

    public st90(String str, knd kndVar, boolean z, abd abdVar) {
        super(is90.f105198f);
        this.f213861b = str;
        this.f213862c = kndVar;
        this.f213863d = z;
        this.f213864e = abdVar;
    }

    /* JADX INFO: renamed from: c */
    public static st90 m79237c(st90 st90Var, knd kndVar, boolean z, abd abdVar, int i) {
        String str = st90Var.f213861b;
        if ((i & 4) != 0) {
            kndVar = st90Var.f213862c;
        }
        if ((i & 8) != 0) {
            z = st90Var.f213863d;
        }
        return new st90(str, kndVar, z, abdVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st90)) {
            return false;
        }
        st90 st90Var = (st90) obj;
        return wj50.m88271j(this.f213861b, st90Var.f213861b) && this.f213862c == st90Var.f213862c && this.f213863d == st90Var.f213863d && this.f213864e.equals(st90Var.f213864e);
    }

    public final int hashCode() {
        return this.f213864e.hashCode() + s571.m77245d((this.f213862c.hashCode() + s571.m77243b(is90.f105198f.hashCode() * 31, 31, this.f213861b)) * 31, 31, this.f213863d);
    }
}
