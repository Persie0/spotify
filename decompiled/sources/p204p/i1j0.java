package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class i1j0 implements j1j0 {

    /* JADX INFO: renamed from: a */
    public static final i1j0 f97538a = new i1j0();

    /* JADX INFO: renamed from: b */
    public static final String f97539b;

    static {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        f97539b = xgg1.m90662N1("YOURLIBRARY_SHOWS", "yourlibrary/shows", 2188, "yourlibrary").f36166c;
    }

    @Override // p204p.j1j0
    /* JADX INFO: renamed from: a */
    public final String mo24455a() {
        return f97539b;
    }

    @Override // p204p.j1j0
    public final String getUri() {
        return "spotify:collection:podcasts";
    }
}
