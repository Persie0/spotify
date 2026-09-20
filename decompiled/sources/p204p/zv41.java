package p204p;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class zv41 extends AbstractC2330r9 implements lqi0, iqb, dk00 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f286608f = AtomicReferenceFieldUpdater.newUpdater(zv41.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e */
    public int f286609e;

    public zv41(Object obj) {
        this._state$volatile = obj;
    }

    @Override // p204p.hqi0
    /* JADX INFO: renamed from: a */
    public final boolean mo46962a(Object obj) {
        m97090l(obj);
        return true;
    }

    @Override // p204p.dk00
    /* JADX INFO: renamed from: b */
    public final fiz mo36243b(juk jukVar, int i, int i2) {
        return jag1.m52835t(this, jukVar, i, i2);
    }

    @Override // p204p.eb11
    /* JADX INFO: renamed from: c */
    public final List mo27502c() {
        return geg1.m44518y(getValue());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0090 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:33:0x0088, B:35:0x0090, B:37:0x0095, B:47:0x00b9, B:50:0x00c9, B:52:0x00ee, B:53:0x00f1, B:39:0x009b, B:43:0x00a2, B:21:0x004d, B:24:0x0056, B:32:0x0079, B:27:0x0064, B:29:0x0068), top: B:60:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0095 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:33:0x0088, B:35:0x0090, B:37:0x0095, B:47:0x00b9, B:50:0x00c9, B:52:0x00ee, B:53:0x00f1, B:39:0x009b, B:43:0x00a2, B:21:0x004d, B:24:0x0056, B:32:0x0079, B:27:0x0064, B:29:0x0068), top: B:60:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:33:0x0088, B:35:0x0090, B:37:0x0095, B:47:0x00b9, B:50:0x00c9, B:52:0x00ee, B:53:0x00f1, B:39:0x009b, B:43:0x00a2, B:21:0x004d, B:24:0x0056, B:32:0x0079, B:27:0x0064, B:29:0x0068), top: B:60:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:33:0x0088, B:35:0x0090, B:37:0x0095, B:47:0x00b9, B:50:0x00c9, B:52:0x00ee, B:53:0x00f1, B:39:0x009b, B:43:0x00a2, B:21:0x004d, B:24:0x0056, B:32:0x0079, B:27:0x0064, B:29:0x0068), top: B:60:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00c8 -> B:33:0x0088). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p204p.fiz
    public final java.lang.Object collect(p204p.niz r12, p204p.fbk r13) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.zv41.collect(p.niz, p.fbk):java.lang.Object");
    }

    @Override // p204p.hqi0
    /* JADX INFO: renamed from: e */
    public final void mo46963e() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // p204p.hqi0, p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        m97090l(obj);
        return w2a1.f247311a;
    }

    @Override // p204p.AbstractC2330r9
    /* JADX INFO: renamed from: g */
    public final AbstractC2368s9 mo46964g() {
        return new fw41();
    }

    @Override // p204p.xv41
    public final Object getValue() {
        Object obj = f286608f.get(this);
        if (obj == qkf1.f189548a) {
            return null;
        }
        return obj;
    }

    @Override // p204p.AbstractC2330r9
    /* JADX INFO: renamed from: h */
    public final AbstractC2368s9[] mo46965h() {
        return new fw41[2];
    }

    /* JADX INFO: renamed from: k */
    public final boolean m97089k(Object obj, Object obj2) {
        C2617yl c2617yl = qkf1.f189548a;
        if (obj == null) {
            obj = c2617yl;
        }
        if (obj2 == null) {
            obj2 = c2617yl;
        }
        return m97091m(obj, obj2);
    }

    /* JADX INFO: renamed from: l */
    public final void m97090l(Object obj) {
        if (obj == null) {
            obj = qkf1.f189548a;
        }
        m97091m(null, obj);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m97091m(Object obj, Object obj2) {
        int i;
        AbstractC2368s9[] abstractC2368s9Arr;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f286608f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !wj50.m88271j(obj3, obj)) {
                return false;
            }
            if (wj50.m88271j(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.f286609e;
            if ((i2 & 1) != 0) {
                this.f286609e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.f286609e = i3;
            AbstractC2368s9[] abstractC2368s9Arr2 = this.f196875a;
            while (true) {
                fw41[] fw41VarArr = (fw41[]) abstractC2368s9Arr2;
                if (fw41VarArr != null) {
                    for (fw41 fw41Var : fw41VarArr) {
                        if (fw41Var != null) {
                            AtomicReference atomicReference = fw41Var.f73936a;
                            while (true) {
                                Object objM42665y = ftg1.m42665y(atomicReference);
                                if (objM42665y == null || objM42665y == jag1.f110463b) {
                                    break;
                                }
                                if (objM42665y != jag1.f110462a) {
                                    if (a831.m25022n(atomicReference, objM42665y)) {
                                        ((hqb) objM42665y).resumeWith(w2a1.f247311a);
                                        break;
                                    }
                                } else {
                                    if (a831.m25019k(atomicReference, objM42665y)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f286609e;
                    if (i == i3) {
                        this.f286609e = i3 + 1;
                        return true;
                    }
                    abstractC2368s9Arr = this.f196875a;
                }
                abstractC2368s9Arr2 = abstractC2368s9Arr;
                i3 = i;
            }
        }
    }
}
