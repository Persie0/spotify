package p204p;

import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.betamax.player.exception.BetamaxException;
import com.spotify.betamax.player.exception.BetamaxPlaybackException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e4p0 implements ozo0 {

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ qr60[] f56125t = {new spi0(e4p0.class, "_state", "get_state()Lcom/spotify/betamax/player/events/PlaybackState;", 0)};

    /* JADX INFO: renamed from: a */
    public final yzo0 f56126a;

    /* JADX INFO: renamed from: b */
    public final noo0 f56127b;

    /* JADX INFO: renamed from: d */
    public VideoSurfaceView f56129d;

    /* JADX INFO: renamed from: g */
    public boolean f56132g;

    /* JADX INFO: renamed from: h */
    public boolean f56133h;

    /* JADX INFO: renamed from: i */
    public Boolean f56134i;

    /* JADX INFO: renamed from: c */
    public final pc0 f56128c = new pc0(this, 20);

    /* JADX INFO: renamed from: e */
    public vk51 f56130e = vk51.UNKNOWN;

    /* JADX INFO: renamed from: f */
    public int f56131f = 1;

    public e4p0(yzo0 yzo0Var, noo0 noo0Var) {
        this.f56126a = yzo0Var;
        this.f56127b = noo0Var;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: E */
    public void mo28573E(float f, long j, long j2) {
        m37790y(new y6f(1, j2, f, j));
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: F */
    public void mo36163F(VideoSurfaceView videoSurfaceView, long j, long j2) {
        this.f56129d = videoSurfaceView;
        if (this.f56133h) {
            videoSurfaceView = null;
        }
        m37790y(new raj(this, videoSurfaceView, j2, j));
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: G */
    public void mo29149G(long j, long j2) {
        m37790y(new m99(16, j2, j));
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: H */
    public void mo25534H(long j, long j2) {
        m37790y(new m99(12, j2, j));
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: I */
    public void mo25535I(BetamaxException betamaxException, long j, long j2) {
        m37790y(new m99(13, j2, j));
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: K */
    public final void mo28574K(long j, long j2, mxb1 mxb1Var) {
        m37790y(new m99(19, j2, j));
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: L */
    public void mo28575L(rx6 rx6Var, long j, long j2) {
        m37790y(new raj(rx6Var, j2, j, 3));
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: M */
    public void mo29150M(long j, long j2) {
        m37790y(new c4p0(j2, j));
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: O */
    public void mo25536O(BetamaxPlaybackException betamaxPlaybackException, long j, long j2) {
        m37790y(new m99(15, j2, j));
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: Q */
    public void mo25537Q(clq clqVar, int i, long j, long j2) {
        m37790y(new m99(14, j2, j));
    }

    /* JADX INFO: renamed from: a */
    public final z3p0 m37787a() {
        qr60 qr60Var = f56125t[0];
        return (z3p0) this.f56128c.f61172a;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: d */
    public void mo28577d(long j, long j2, boolean z) {
        this.f56133h = z;
        m37790y(new k99(this, z, j2, j));
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: i */
    public void mo36173i(int i, vk51 vk51Var, long j) {
        this.f56131f = i;
        this.f56130e = vk51Var;
        m37790y(new C2580xm(vk51Var, i, 18));
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: j */
    public void mo33818j(long j, long j2) {
        m37790y(new q22(15, j));
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: k */
    public void mo27128k(boolean z, boolean z2, float f, long j) {
        this.f56134i = Boolean.valueOf(z2);
        this.f56133h = z;
        this.f56128c.m39516c(f56125t[0], this, new z3p0(this.f56126a, j, null, null, false, f, !this.f56127b.f156768c, null, null, "unknown", this.f56130e, this.f56131f, z2, z));
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: m */
    public void mo25538m(long j, long j2) {
        this.f56132g = true;
        m37790y(new raj(this.f56134i, j2, j, 4));
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: n */
    public void mo28578n(long j, long j2, boolean z) {
        this.f56134i = Boolean.valueOf(z);
        if (this.f56132g) {
            m37790y(new d4p0(j2, j, z));
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: p */
    public void mo36175p(long j, long j2, long j3, boolean z) {
        m37790y(new m99(17, j3, j2));
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: q */
    public final void mo37788q(fv51 fv51Var, long j, long j2) {
        m37790y(new m99(18, j2, j));
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: r */
    public void mo37789r(nbc0 nbc0Var, long j) {
        m37790y(new jfo0(nbc0Var, 22));
    }

    /* JADX INFO: renamed from: y */
    public final void m37790y(gh00 gh00Var) {
        z3p0 z3p0VarM37787a = m37787a();
        this.f56128c.m39516c(f56125t[0], this, z3p0VarM37787a != null ? (z3p0) gh00Var.invoke(z3p0VarM37787a) : null);
    }

    /* JADX INFO: renamed from: w */
    public void mo35353w(z3p0 z3p0Var) {
    }
}
