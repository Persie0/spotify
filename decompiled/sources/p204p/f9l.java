package p204p;

import com.spotify.music.R;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class f9l implements r4m0 {

    /* JADX INFO: renamed from: j */
    public static final String f67286j = xoc1.f264223x0.f243453a;

    /* JADX INFO: renamed from: a */
    public final z9j0 f67287a;

    /* JADX INFO: renamed from: b */
    public final doh f67288b;

    /* JADX INFO: renamed from: c */
    public final h9l f67289c;

    /* JADX INFO: renamed from: d */
    public final er70 f67290d;

    /* JADX INFO: renamed from: e */
    public final a9l f67291e;

    /* JADX INFO: renamed from: f */
    public final j9l f67292f;

    /* JADX INFO: renamed from: g */
    public final boolean f67293g;

    /* JADX INFO: renamed from: h */
    public final er70 f67294h;

    /* JADX INFO: renamed from: i */
    public final pfm0 f67295i;

    public f9l(z9j0 z9j0Var, doh dohVar, h9l h9lVar, er70 er70Var, a9l a9lVar, j9l j9lVar, boolean z, er70 er70Var2) {
        this.f67287a = z9j0Var;
        this.f67288b = dohVar;
        this.f67289c = h9lVar;
        this.f67290d = er70Var;
        this.f67291e = a9lVar;
        this.f67292f = j9lVar;
        this.f67293g = z;
        this.f67294h = er70Var2;
        pw71 pw71Var = new pw71(new p1x0(R.string.create_menu_title));
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f67295i = new pfm0(new qfm0[]{pw71Var, new q040(xgg1.m90881t1(), xoc1.f263915J4, null), new h380(k0e1.f118018Y), new v69(t5j0.f217312e), new tkm0(rkm0.f200124a, 0, 2), new e6m0(true), new sw91(14, true, false, false)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f67295i;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f67288b.m36532a(rkk.m75763o(new e9l(this, 0), true, -1957803071));
    }
}
