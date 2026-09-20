package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ib81 implements j7f0 {

    /* JADX INFO: renamed from: a */
    public final bb81 f100471a;

    /* JADX INFO: renamed from: b */
    public final List f100472b;

    /* JADX INFO: renamed from: c */
    public final boolean f100473c;

    /* JADX INFO: renamed from: d */
    public final boolean f100474d;

    /* JADX INFO: renamed from: e */
    public final hto0 f100475e;

    /* JADX INFO: renamed from: f */
    public final boolean f100476f;

    /* JADX INFO: renamed from: g */
    public final boolean f100477g;

    /* JADX INFO: renamed from: h */
    public final boolean f100478h;

    /* JADX INFO: renamed from: i */
    public final String f100479i;

    /* JADX INFO: renamed from: j */
    public final int f100480j;

    public ib81(bb81 bb81Var, List list, boolean z, boolean z2, hto0 hto0Var, boolean z3, boolean z4, boolean z5, String str, int i) {
        this.f100471a = bb81Var;
        this.f100472b = list;
        this.f100473c = z;
        this.f100474d = z2;
        this.f100475e = hto0Var;
        this.f100476f = z3;
        this.f100477g = z4;
        this.f100478h = z5;
        this.f100479i = str;
        this.f100480j = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib81)) {
            return false;
        }
        ib81 ib81Var = (ib81) obj;
        return wj50.m88271j(this.f100471a, ib81Var.f100471a) && wj50.m88271j(this.f100472b, ib81Var.f100472b) && this.f100473c == ib81Var.f100473c && this.f100474d == ib81Var.f100474d && this.f100475e == ib81Var.f100475e && this.f100476f == ib81Var.f100476f && this.f100477g == ib81Var.f100477g && this.f100478h == ib81Var.f100478h && wj50.m88271j(this.f100479i, ib81Var.f100479i) && this.f100480j == ib81Var.f100480j;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d((this.f100475e.hashCode() + s571.m77245d(s571.m77245d(s571.m77244c(this.f100471a.hashCode() * 31, 31, this.f100472b), 31, this.f100473c), 31, this.f100474d)) * 31, 31, this.f100476f), 31, this.f100477g), 31, this.f100478h);
        String str = this.f100479i;
        return Integer.hashCode(this.f100480j) + ((iM77245d + (str == null ? 0 : str.hashCode())) * 31);
    }
}
