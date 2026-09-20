package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class d1j0 implements j1j0 {

    /* JADX INFO: renamed from: a */
    public static final d1j0 f44304a = new d1j0();

    /* JADX INFO: renamed from: b */
    public static final String f44305b;

    static {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        f44305b = xgg1.m90662N1("YOURLIBRARY_ARTISTS", "yourlibrary/artists", 2176, "yourlibrary").f36166c;
    }

    @Override // p204p.j1j0
    /* JADX INFO: renamed from: a */
    public final String mo24455a() {
        return f44305b;
    }

    @Override // p204p.j1j0
    public final String getUri() {
        return "spotify:collection:artists";
    }
}
