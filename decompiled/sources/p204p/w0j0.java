package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class w0j0 implements j1j0 {

    /* JADX INFO: renamed from: a */
    public static final w0j0 f246746a = new w0j0();

    /* JADX INFO: renamed from: b */
    public static final String f246747b;

    static {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        f246747b = xgg1.m90662N1("NOWPLAYING_QUEUE", "nowplaying/queue", 1313, "nowplaying").f36166c;
    }

    @Override // p204p.j1j0
    /* JADX INFO: renamed from: a */
    public final String mo24455a() {
        return f246747b;
    }

    @Override // p204p.j1j0
    public final String getUri() {
        return "spotify:queue";
    }
}
