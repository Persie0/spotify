package p204p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: classes6.dex */
public final class ggl {

    /* JADX INFO: renamed from: a */
    public final boolean f79691a;

    /* JADX INFO: renamed from: b */
    public final boolean f79692b;

    /* JADX INFO: renamed from: c */
    public final boolean f79693c;

    /* JADX INFO: renamed from: d */
    public final r1b f79694d;

    /* JADX INFO: renamed from: e */
    public final boolean f79695e;

    /* JADX INFO: renamed from: f */
    public final boolean f79696f;

    /* JADX INFO: renamed from: g */
    public final boolean f79697g;

    /* JADX INFO: renamed from: h */
    public final boolean f79698h;

    /* JADX INFO: renamed from: i */
    public final PlayOrigin f79699i;

    /* JADX INFO: renamed from: j */
    public final boolean f79700j;

    /* JADX INFO: renamed from: k */
    public final fiz f79701k;

    /* JADX INFO: renamed from: l */
    public final skd0 f79702l;

    public ggl(boolean z, boolean z2, boolean z3, r1b r1bVar, boolean z4, boolean z5, PlayOrigin playOrigin, boolean z6, fiz fizVar, skd0 skd0Var, int i) {
        boolean z7 = (i & 16) == 0;
        z4 = (i & 32) != 0 ? false : z4;
        boolean z8 = (i & 64) == 0;
        z5 = (i & 128) != 0 ? false : z5;
        z6 = (i & 512) != 0 ? false : z6;
        fizVar = (i & 1024) != 0 ? new ysk(Boolean.TRUE, 27) : fizVar;
        skd0Var = (i & 2048) != 0 ? null : skd0Var;
        this.f79691a = z;
        this.f79692b = z2;
        this.f79693c = z3;
        this.f79694d = r1bVar;
        this.f79695e = z7;
        this.f79696f = z4;
        this.f79697g = z8;
        this.f79698h = z5;
        this.f79699i = playOrigin;
        this.f79700j = z6;
        this.f79701k = fizVar;
        this.f79702l = skd0Var;
    }
}
