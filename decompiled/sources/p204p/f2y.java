package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes10.dex */
public final class f2y {

    /* JADX INFO: renamed from: a */
    public final PlayerState f65278a;

    /* JADX INFO: renamed from: b */
    public final boolean f65279b;

    /* JADX INFO: renamed from: c */
    public final boolean f65280c;

    /* JADX INFO: renamed from: d */
    public final boolean f65281d;

    /* JADX INFO: renamed from: e */
    public final boolean f65282e;

    /* JADX INFO: renamed from: f */
    public final t0v0 f65283f;

    /* JADX INFO: renamed from: g */
    public final boolean f65284g;

    /* JADX INFO: renamed from: h */
    public final boolean f65285h;

    /* JADX INFO: renamed from: i */
    public final c92 f65286i;

    /* JADX INFO: renamed from: j */
    public final boolean f65287j;

    /* JADX INFO: renamed from: k */
    public final Integer f65288k;

    /* JADX INFO: renamed from: l */
    public final boolean f65289l;

    /* JADX INFO: renamed from: m */
    public final Integer f65290m;

    public f2y(PlayerState playerState, boolean z, boolean z2, boolean z3, boolean z4, t0v0 t0v0Var, boolean z5, boolean z6, c92 c92Var, boolean z7, Integer num, boolean z8, Integer num2) {
        this.f65278a = playerState;
        this.f65279b = z;
        this.f65280c = z2;
        this.f65281d = z3;
        this.f65282e = z4;
        this.f65283f = t0v0Var;
        this.f65284g = z5;
        this.f65285h = z6;
        this.f65286i = c92Var;
        this.f65287j = z7;
        this.f65288k = num;
        this.f65289l = z8;
        this.f65290m = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2y)) {
            return false;
        }
        f2y f2yVar = (f2y) obj;
        return this.f65278a.equals(f2yVar.f65278a) && this.f65279b == f2yVar.f65279b && this.f65280c == f2yVar.f65280c && this.f65281d == f2yVar.f65281d && this.f65282e == f2yVar.f65282e && this.f65283f.equals(f2yVar.f65283f) && this.f65284g == f2yVar.f65284g && this.f65285h == f2yVar.f65285h && this.f65286i.equals(f2yVar.f65286i) && this.f65287j == f2yVar.f65287j && wj50.m88271j(this.f65288k, f2yVar.f65288k) && this.f65289l == f2yVar.f65289l && wj50.m88271j(this.f65290m, f2yVar.f65290m);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f65286i.hashCode() + s571.m77245d(s571.m77245d((this.f65283f.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f65278a.hashCode() * 31, 31, this.f65279b), 31, this.f65280c), 31, this.f65281d), 31, this.f65282e)) * 31, 31, this.f65284g), 31, this.f65285h)) * 31, 31, this.f65287j);
        Integer num = this.f65288k;
        int iM77245d2 = s571.m77245d((iM77245d + (num == null ? 0 : num.hashCode())) * 31, 31, this.f65289l);
        Integer num2 = this.f65290m;
        return iM77245d2 + (num2 != null ? num2.hashCode() : 0);
    }
}
