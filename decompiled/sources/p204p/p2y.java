package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes10.dex */
public final class p2y {

    /* JADX INFO: renamed from: a */
    public final PlayerState f173455a;

    /* JADX INFO: renamed from: b */
    public final boolean f173456b;

    /* JADX INFO: renamed from: c */
    public final boolean f173457c;

    /* JADX INFO: renamed from: d */
    public final boolean f173458d;

    /* JADX INFO: renamed from: e */
    public final boolean f173459e;

    /* JADX INFO: renamed from: f */
    public final boolean f173460f;

    /* JADX INFO: renamed from: g */
    public final boolean f173461g;

    /* JADX INFO: renamed from: h */
    public final boolean f173462h;

    /* JADX INFO: renamed from: i */
    public final boolean f173463i;

    /* JADX INFO: renamed from: j */
    public final c92 f173464j;

    /* JADX INFO: renamed from: k */
    public final boolean f173465k;

    /* JADX INFO: renamed from: l */
    public final Integer f173466l;

    /* JADX INFO: renamed from: m */
    public final boolean f173467m;

    public p2y(PlayerState playerState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, c92 c92Var, boolean z9, Integer num, boolean z10) {
        this.f173455a = playerState;
        this.f173456b = z;
        this.f173457c = z2;
        this.f173458d = z3;
        this.f173459e = z4;
        this.f173460f = z5;
        this.f173461g = z6;
        this.f173462h = z7;
        this.f173463i = z8;
        this.f173464j = c92Var;
        this.f173465k = z9;
        this.f173466l = num;
        this.f173467m = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2y)) {
            return false;
        }
        p2y p2yVar = (p2y) obj;
        return wj50.m88271j(this.f173455a, p2yVar.f173455a) && this.f173456b == p2yVar.f173456b && this.f173457c == p2yVar.f173457c && this.f173458d == p2yVar.f173458d && this.f173459e == p2yVar.f173459e && this.f173460f == p2yVar.f173460f && this.f173461g == p2yVar.f173461g && this.f173462h == p2yVar.f173462h && this.f173463i == p2yVar.f173463i && this.f173464j.equals(p2yVar.f173464j) && this.f173465k == p2yVar.f173465k && wj50.m88271j(this.f173466l, p2yVar.f173466l) && this.f173467m == p2yVar.f173467m;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f173464j.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f173455a.hashCode() * 31, 31, this.f173456b), 31, this.f173457c), 31, this.f173458d), 31, this.f173459e), 31, this.f173460f), 31, this.f173461g), 31, this.f173462h), 31, this.f173463i)) * 31, 31, this.f173465k);
        Integer num = this.f173466l;
        return Boolean.hashCode(this.f173467m) + ((iM77245d + (num == null ? 0 : num.hashCode())) * 31);
    }
}
