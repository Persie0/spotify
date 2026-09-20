package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class e1j0 implements j1j0 {

    /* JADX INFO: renamed from: a */
    public static final e1j0 f55209a = new e1j0();

    /* JADX INFO: renamed from: b */
    public static final String f55210b;

    static {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        f55210b = xgg1.m90662N1("YOURLIBRARY_AUDIOBOOKS", "yourlibrary/audiobooks", 2178, "yourlibrary").f36166c;
    }

    @Override // p204p.j1j0
    /* JADX INFO: renamed from: a */
    public final String mo24455a() {
        return f55210b;
    }

    @Override // p204p.j1j0
    public final String getUri() {
        return "spotify:collection:audiobooks";
    }
}
