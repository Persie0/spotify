package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes10.dex */
public final class c2y {

    /* JADX INFO: renamed from: a */
    public final PlayerState f33484a;

    /* JADX INFO: renamed from: b */
    public final boolean f33485b;

    /* JADX INFO: renamed from: c */
    public final boolean f33486c;

    /* JADX INFO: renamed from: d */
    public final boolean f33487d;

    /* JADX INFO: renamed from: e */
    public final boolean f33488e;

    /* JADX INFO: renamed from: f */
    public final boolean f33489f;

    /* JADX INFO: renamed from: g */
    public final boolean f33490g;

    /* JADX INFO: renamed from: h */
    public final c92 f33491h;

    /* JADX INFO: renamed from: i */
    public final boolean f33492i;

    /* JADX INFO: renamed from: j */
    public final Integer f33493j;

    /* JADX INFO: renamed from: k */
    public final boolean f33494k;

    public c2y(PlayerState playerState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, c92 c92Var, boolean z7, Integer num, boolean z8) {
        this.f33484a = playerState;
        this.f33485b = z;
        this.f33486c = z2;
        this.f33487d = z3;
        this.f33488e = z4;
        this.f33489f = z5;
        this.f33490g = z6;
        this.f33491h = c92Var;
        this.f33492i = z7;
        this.f33493j = num;
        this.f33494k = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2y)) {
            return false;
        }
        c2y c2yVar = (c2y) obj;
        return wj50.m88271j(this.f33484a, c2yVar.f33484a) && this.f33485b == c2yVar.f33485b && this.f33486c == c2yVar.f33486c && this.f33487d == c2yVar.f33487d && this.f33488e == c2yVar.f33488e && this.f33489f == c2yVar.f33489f && this.f33490g == c2yVar.f33490g && this.f33491h.equals(c2yVar.f33491h) && this.f33492i == c2yVar.f33492i && wj50.m88271j(this.f33493j, c2yVar.f33493j) && this.f33494k == c2yVar.f33494k;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f33491h.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f33484a.hashCode() * 31, 31, this.f33485b), 31, this.f33486c), 31, this.f33487d), 31, this.f33488e), 31, this.f33489f), 31, this.f33490g)) * 31, 31, this.f33492i);
        Integer num = this.f33493j;
        return Boolean.hashCode(this.f33494k) + ((iM77245d + (num == null ? 0 : num.hashCode())) * 31);
    }
}
