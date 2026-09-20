package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class m0j0 implements j1j0 {

    /* JADX INFO: renamed from: a */
    public static final m0j0 f138690a = new m0j0();

    /* JADX INFO: renamed from: b */
    public static final String f138691b;

    static {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        f138691b = xgg1.m90662N1("JAM_MANAGEPARTICIPANTSSHEET", "jam/manageparticipantssheet", 843, "jam").f36166c;
    }

    @Override // p204p.j1j0
    /* JADX INFO: renamed from: a */
    public final String mo24455a() {
        return f138691b;
    }

    @Override // p204p.j1j0
    public final String getUri() {
        return "spotify:jam:participants";
    }
}
