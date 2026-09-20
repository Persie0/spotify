package p204p;

import com.spotify.music.R;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class ac00 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final h6a0 f14211a;

    /* JADX INFO: renamed from: b */
    public final String f14212b;

    /* JADX INFO: renamed from: c */
    public final yb00 f14213c;

    /* JADX INFO: renamed from: d */
    public final whl f14214d;

    /* JADX INFO: renamed from: e */
    public final pfm0 f14215e;

    public ac00(h6a0 h6a0Var, String str, yb00 yb00Var, whl whlVar) {
        this.f14211a = h6a0Var;
        this.f14212b = str;
        this.f14213c = yb00Var;
        this.f14214d = whlVar;
        pw71 pw71Var = new pw71(new p1x0(R.string.track_default_title));
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f14215e = new pfm0(new qfm0[]{pw71Var, new q040(xgg1.m90655M1(), xoc1.f264158p.m83614b(str), null), new e6m0(true), new sw91(14, true, false, false)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f14215e;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return h6a0.m46706b(this.f14211a, v3h1.m84575H(this.f14213c.m93229a(this.f14212b).firstOrError()), new gfx(this, 2));
    }
}
