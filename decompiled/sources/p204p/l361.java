package p204p;

import com.spotify.music.R;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class l361 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final pkh f129214a;

    /* JADX INFO: renamed from: b */
    public final n361 f129215b;

    /* JADX INFO: renamed from: c */
    public final a531 f129216c;

    /* JADX INFO: renamed from: d */
    public final kw20 f129217d;

    /* JADX INFO: renamed from: e */
    public final pfm0 f129218e;

    public l361(pkh pkhVar, n361 n361Var, a531 a531Var, kw20 kw20Var) {
        this.f129214a = pkhVar;
        this.f129215b = n361Var;
        this.f129216c = a531Var;
        this.f129217d = kw20Var;
        pw71 pw71Var = new pw71(new p1x0(R.string.timeline_page_title_GM));
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f129218e = new pfm0(new qfm0[]{pw71Var, new q040(xgg1.m90600E2(), xoc1.f264179r4.m83614b("spotify:listeningstats:" + n361Var.m63589c()), new afm0(vkf1.m85876v()))}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f129218e;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f129214a.m70217a(tky.m81027c(new v4a0[0], new bya0(this, null, 25)), rkk.m75763o(new k361(this, 0), true, -790145672), new hlh(null, null, null, false, 63));
    }
}
