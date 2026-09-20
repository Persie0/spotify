package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class f1j0 implements j1j0 {

    /* JADX INFO: renamed from: a */
    public static final f1j0 f64908a = new f1j0();

    /* JADX INFO: renamed from: b */
    public static final String f64909b;

    static {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        f64909b = xgg1.m90662N1("YOURLIBRARY_DOWNLOADS", "yourlibrary/downloads", 2179, "yourlibrary").f36166c;
    }

    @Override // p204p.j1j0
    /* JADX INFO: renamed from: a */
    public final String mo24455a() {
        return f64909b;
    }

    @Override // p204p.j1j0
    public final String getUri() {
        return "spotify:collection:downloads";
    }
}
