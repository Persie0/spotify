package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class c1j0 implements j1j0 {

    /* JADX INFO: renamed from: a */
    public static final c1j0 f33145a = new c1j0();

    /* JADX INFO: renamed from: b */
    public static final String f33146b;

    static {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        f33146b = xgg1.m90662N1("YOURLIBRARY_ALBUMS", "yourlibrary/albums", 2175, "yourlibrary").f36166c;
    }

    @Override // p204p.j1j0
    /* JADX INFO: renamed from: a */
    public final String mo24455a() {
        return f33146b;
    }

    @Override // p204p.j1j0
    public final String getUri() {
        return "spotify:collection:albums";
    }
}
