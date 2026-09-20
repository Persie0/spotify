package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zty0 extends puy0 {

    /* JADX INFO: renamed from: a */
    public final String f286288a;

    /* JADX INFO: renamed from: b */
    public final String f286289b;

    /* JADX INFO: renamed from: c */
    public final yzy0 f286290c;

    public zty0(String str, String str2, yzy0 yzy0Var) {
        this.f286288a = str;
        this.f286289b = str2;
        this.f286290c = yzy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zty0)) {
            return false;
        }
        zty0 zty0Var = (zty0) obj;
        return wj50.m88271j(this.f286288a, zty0Var.f286288a) && wj50.m88271j(this.f286289b, zty0Var.f286289b) && wj50.m88271j(this.f286290c, zty0Var.f286290c);
    }

    public final int hashCode() {
        return this.f286290c.hashCode() + s571.m77243b(this.f286288a.hashCode() * 31, 31, this.f286289b);
    }
}
