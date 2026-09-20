package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class x0j0 implements j1j0 {

    /* JADX INFO: renamed from: a */
    public static final x0j0 f256888a = new x0j0();

    /* JADX INFO: renamed from: b */
    public static final String f256889b;

    static {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        f256889b = xgg1.m90662N1("RECENTLYPLAYED", "recentlyplayed", 1575, "recentlyplayed").f36166c;
    }

    @Override // p204p.j1j0
    /* JADX INFO: renamed from: a */
    public final String mo24455a() {
        return f256889b;
    }

    @Override // p204p.j1j0
    public final String getUri() {
        return "spotify:recently-played";
    }
}
