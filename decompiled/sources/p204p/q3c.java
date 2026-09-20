package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class q3c extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f184835a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f184836b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f184837c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3c(int i, Object obj, Object obj2) {
        super(0);
        this.f184835a = i;
        this.f184836b = obj;
        this.f184837c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:110:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:113:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:119:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:126:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:150:0x03d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v11 java.lang.Object, still in use, count: 2, list:
          (r4v11 java.lang.Object) from 0x03a3: PHI (r4 I:??) = (r4v2 java.lang.Object), (r4v11 java.lang.Object) binds: [B:103:0x03a2, B:147:0x03a3] A[DONT_GENERATE, DONT_INLINE]
          (r4v11 java.lang.Object) from 0x0395: CHECK_CAST (p.tld0) (r4v11 java.lang.Object)
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
    @Override // p204p.eh00
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instruction units count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.q3c.invoke():java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3c(yac yacVar, String str, xac xacVar) {
        super(0);
        this.f184835a = 6;
        this.f184836b = str;
        this.f184837c = xacVar;
    }
}
