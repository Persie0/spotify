package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class icp0 {

    /* JADX INFO: renamed from: a */
    public final String f100860a;

    /* JADX INFO: renamed from: b */
    public final boolean f100861b;

    /* JADX INFO: renamed from: c */
    public final boolean f100862c;

    /* JADX INFO: renamed from: d */
    public final boolean f100863d;

    /* JADX INFO: renamed from: e */
    public final boolean f100864e;

    /* JADX INFO: renamed from: f */
    public final boolean f100865f;

    /* JADX INFO: renamed from: g */
    public final boolean f100866g;

    /* JADX INFO: renamed from: h */
    public final t5m f100867h;

    public icp0(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, t5m t5mVar) {
        this.f100860a = str;
        this.f100861b = z;
        this.f100862c = z2;
        this.f100863d = z3;
        this.f100864e = z4;
        this.f100865f = z5;
        this.f100866g = z6;
        this.f100867h = t5mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icp0)) {
            return false;
        }
        icp0 icp0Var = (icp0) obj;
        return wj50.m88271j(this.f100860a, icp0Var.f100860a) && this.f100861b == icp0Var.f100861b && this.f100862c == icp0Var.f100862c && this.f100863d == icp0Var.f100863d && this.f100864e == icp0Var.f100864e && this.f100865f == icp0Var.f100865f && this.f100866g == icp0Var.f100866g && this.f100867h == icp0Var.f100867h;
    }

    public final int hashCode() {
        return this.f100867h.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f100860a.hashCode() * 31, 31, this.f100861b), 31, this.f100862c), 31, this.f100863d), 31, this.f100864e), 31, this.f100865f), 31, this.f100866g);
    }
}
