package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class q0j0 implements j1j0 {

    /* JADX INFO: renamed from: a */
    public static final q0j0 f184014a = new q0j0();

    /* JADX INFO: renamed from: b */
    public static final String f184015b;

    static {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        f184015b = xgg1.m90662N1("SIGNUP", "signup", 1823, "signup").f36166c;
    }

    @Override // p204p.j1j0
    /* JADX INFO: renamed from: a */
    public final String mo24455a() {
        return f184015b;
    }

    @Override // p204p.j1j0
    public final String getUri() {
        return "spotify:signup-v1:login";
    }
}
