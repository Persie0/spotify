package p204p;

import io.reactivex.rxjava3.functions.Function;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class t1h1 implements Function {

    /* JADX INFO: renamed from: c */
    public static final t1h1 f216271c;

    /* JADX INFO: renamed from: d */
    public static final t1h1 f216272d;

    /* JADX INFO: renamed from: e */
    public static final t1h1 f216273e;

    /* JADX INFO: renamed from: f */
    public static final t1h1 f216274f;

    /* JADX INFO: renamed from: g */
    public static final t1h1 f216275g;

    /* JADX INFO: renamed from: h */
    public static final t1h1 f216276h;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f216277a;

    /* JADX INFO: renamed from: b */
    public final String f216278b;

    static {
        int i = 0;
        f216271c = new t1h1("UNKNOWN_PREFIX", i);
        f216272d = new t1h1("TINK", i);
        f216273e = new t1h1("LEGACY", i);
        f216274f = new t1h1("RAW", i);
        f216275g = new t1h1("CRUNCHY", i);
        f216276h = new t1h1("WITH_ID_REQUIREMENT", i);
    }

    public /* synthetic */ t1h1(String str, int i) {
        this.f216277a = i;
        this.f216278b = str;
    }

    /* JADX INFO: renamed from: a */
    public String m79876a() {
        return this.f216278b;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v6 java.lang.Object, still in use, count: 2, list:
          (r3v6 java.lang.Object) from 0x0099: PHI (r3 I:??) = (r3v3 java.lang.Object), (r3v6 java.lang.Object) binds: [B:39:0x0098, B:78:0x0099] A[DONT_GENERATE, DONT_INLINE]
          (r3v6 java.lang.Object) from 0x0091: CHECK_CAST (p.bx50) (r3v6 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public java.lang.Object mo98394apply(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.t1h1.mo98394apply(java.lang.Object):java.lang.Object");
    }

    public String toString() {
        switch (this.f216277a) {
            case 0:
                return this.f216278b;
            default:
                return super.toString();
        }
    }

    public t1h1(String str, g96 g96Var) {
        this.f216277a = 2;
        this.f216278b = str;
    }

    public t1h1() {
        this.f216277a = 1;
        this.f216278b = UUID.randomUUID().toString();
    }
}
