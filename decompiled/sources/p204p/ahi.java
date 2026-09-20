package p204p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ahi {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15698a = AtomicReferenceFieldUpdater.newUpdater(ahi.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15699b = AtomicReferenceFieldUpdater.newUpdater(ahi.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public ahi(ffz0 ffz0Var) {
        this._prev$volatile = ffz0Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m25984b() {
        f15699b.set(this, null);
    }

    /* JADX INFO: renamed from: c */
    public final ahi m25985c() {
        Object obj = f15698a.get(this);
        if (obj == sam.f207235a) {
            return null;
        }
        return (ahi) obj;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo25986d();

    /* JADX INFO: renamed from: e */
    public final void m25987e() {
        Object obj;
        ahi ahiVarM25985c;
        if (m25985c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15699b;
            ahi ahiVar = (ahi) atomicReferenceFieldUpdater.get(this);
            while (ahiVar != null && ahiVar.mo25986d()) {
                ahiVar = (ahi) atomicReferenceFieldUpdater.get(ahiVar);
            }
            ahi ahiVarM25985c2 = m25985c();
            wj50.m88279p(ahiVarM25985c2);
            while (ahiVarM25985c2.mo25986d() && (ahiVarM25985c = ahiVarM25985c2.m25985c()) != null) {
                ahiVarM25985c2 = ahiVarM25985c;
            }
            do {
                obj = atomicReferenceFieldUpdater.get(ahiVarM25985c2);
            } while (!tfe.m80661s(atomicReferenceFieldUpdater, ahiVarM25985c2, obj, ((ahi) obj) == null ? null : ahiVar));
            if (ahiVar != null) {
                f15698a.set(ahiVar, ahiVarM25985c2);
            }
            if (!ahiVarM25985c2.mo25986d() || ahiVarM25985c2.m25985c() == null) {
                if (ahiVar == null || !ahiVar.mo25986d()) {
                    return;
                }
            }
        }
    }
}
