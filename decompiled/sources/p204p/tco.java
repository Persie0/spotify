package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tco {

    /* JADX INFO: renamed from: a */
    public final List f219119a;

    /* JADX INFO: renamed from: b */
    public final kbz0 f219120b;

    /* JADX INFO: renamed from: c */
    public final boolean f219121c;

    /* JADX INFO: renamed from: d */
    public final boolean f219122d;

    /* JADX INFO: renamed from: e */
    public final boolean f219123e;

    /* JADX INFO: renamed from: f */
    public final boolean f219124f;

    /* JADX INFO: renamed from: g */
    public final boolean f219125g;

    /* JADX INFO: renamed from: h */
    public final bep0 f219126h;

    /* JADX INFO: renamed from: i */
    public final boolean f219127i;

    /* JADX INFO: renamed from: j */
    public final boolean f219128j;

    /* JADX INFO: renamed from: k */
    public final boolean f219129k;

    public tco(List list, kbz0 kbz0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bep0 bep0Var, boolean z6, boolean z7, boolean z8) {
        this.f219119a = list;
        this.f219120b = kbz0Var;
        this.f219121c = z;
        this.f219122d = z2;
        this.f219123e = z3;
        this.f219124f = z4;
        this.f219125g = z5;
        this.f219126h = bep0Var;
        this.f219127i = z6;
        this.f219128j = z7;
        this.f219129k = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tco)) {
            return false;
        }
        tco tcoVar = (tco) obj;
        return wj50.m88271j(this.f219119a, tcoVar.f219119a) && wj50.m88271j(this.f219120b, tcoVar.f219120b) && this.f219121c == tcoVar.f219121c && this.f219122d == tcoVar.f219122d && this.f219123e == tcoVar.f219123e && this.f219124f == tcoVar.f219124f && this.f219125g == tcoVar.f219125g && wj50.m88271j(this.f219126h, tcoVar.f219126h) && this.f219127i == tcoVar.f219127i && this.f219128j == tcoVar.f219128j && this.f219129k == tcoVar.f219129k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f219129k) + s571.m77245d(s571.m77245d((this.f219126h.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((this.f219120b.hashCode() + (this.f219119a.hashCode() * 31)) * 31, 31, this.f219121c), 31, this.f219122d), 31, this.f219123e), 31, this.f219124f), 31, this.f219125g)) * 31, 31, this.f219127i), 31, this.f219128j);
    }
}
