package p204p;

import com.google.protobuf.Duration;

/* JADX INFO: loaded from: classes.dex */
public final class x430 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f257968a;

    /* JADX INFO: renamed from: b */
    public final String f257969b;

    /* JADX INFO: renamed from: c */
    public final String f257970c;

    /* JADX INFO: renamed from: d */
    public final m4l0 f257971d;

    /* JADX INFO: renamed from: e */
    public final String f257972e;

    /* JADX INFO: renamed from: f */
    public final Duration f257973f;

    /* JADX INFO: renamed from: g */
    public final Duration f257974g;

    /* JADX INFO: renamed from: h */
    public final String f257975h;

    /* JADX INFO: renamed from: i */
    public final int f257976i;

    public x430(String str, String str2, String str3, m4l0 m4l0Var, String str4, Duration duration, Duration duration2, String str5, int i) {
        this.f257968a = str;
        this.f257969b = str2;
        this.f257970c = str3;
        this.f257971d = m4l0Var;
        this.f257972e = str4;
        this.f257973f = duration;
        this.f257974g = duration2;
        this.f257975h = str5;
        this.f257976i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x430)) {
            return false;
        }
        x430 x430Var = (x430) obj;
        return wj50.m88271j(this.f257968a, x430Var.f257968a) && wj50.m88271j(this.f257969b, x430Var.f257969b) && this.f257970c.equals(x430Var.f257970c) && this.f257971d.equals(x430Var.f257971d) && wj50.m88271j(this.f257972e, x430Var.f257972e) && wj50.m88271j(this.f257973f, x430Var.f257973f) && wj50.m88271j(this.f257974g, x430Var.f257974g) && wj50.m88271j(this.f257975h, x430Var.f257975h) && this.f257976i == x430Var.f257976i;
    }

    public final int hashCode() {
        int iHashCode = this.f257968a.hashCode() * 31;
        String str = this.f257969b;
        int iHashCode2 = (this.f257971d.hashCode() + s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f257970c)) * 31;
        String str2 = this.f257972e;
        return edb.m38547C(this.f257976i) + s571.m77243b((this.f257974g.hashCode() + ((this.f257973f.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f257975h);
    }

    public final String toString() {
        return klh.m56834f(this.f257968a, ", ", this.f257969b);
    }
}
