package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class h1j0 implements j1j0 {

    /* JADX INFO: renamed from: a */
    public static final h1j0 f86645a = new h1j0();

    /* JADX INFO: renamed from: b */
    public static final String f86646b;

    static {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        f86646b = xgg1.m90662N1("YOURLIBRARY_PLAYLISTS", "yourlibrary/playlists", 2185, "yourlibrary").f36166c;
    }

    @Override // p204p.j1j0
    /* JADX INFO: renamed from: a */
    public final String mo24455a() {
        return f86646b;
    }

    @Override // p204p.j1j0
    public final String getUri() {
        return "spotify:collection:playlists";
    }
}
