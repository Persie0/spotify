package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class n0j0 implements j1j0 {

    /* JADX INFO: renamed from: a */
    public static final n0j0 f149102a = new n0j0();

    /* JADX INFO: renamed from: b */
    public static final String f149103b;

    static {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        f149103b = xgg1.m90662N1("JAM_PARTICIPANTSETTINGSSHEET", "jam/participantsettingssheet", 844, "jam").f36166c;
    }

    @Override // p204p.j1j0
    /* JADX INFO: renamed from: a */
    public final String mo24455a() {
        return f149103b;
    }

    @Override // p204p.j1j0
    public final String getUri() {
        return "spotify:jam:settings";
    }
}
