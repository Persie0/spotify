package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes2.dex */
public final class f341 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final zc21 f65350a;

    /* JADX INFO: renamed from: b */
    public final o341 f65351b;

    /* JADX INFO: renamed from: c */
    public final m341 f65352c;

    /* JADX INFO: renamed from: d */
    public final hb5 f65353d;

    /* JADX INFO: renamed from: e */
    public final pfm0 f65354e;

    public f341(zc21 zc21Var, o341 o341Var, m341 m341Var, hb5 hb5Var, n6q n6qVar) {
        this.f65350a = zc21Var;
        this.f65351b = o341Var;
        this.f65352c = m341Var;
        this.f65353d = hb5Var;
        this.f65354e = new pfm0(new qfm0[]{new pw71(new p1x0(R.string.bottom_sheet_speed_control_title)), new fda(null, bda.f26062b, null, 0, null, n6qVar, false, false, false, 2013)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f65354e;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f65350a.m95896a(new d341(this, 0), new wc21(new e341(this), new d341(this, 1), dxq0.f54049P0));
    }
}
