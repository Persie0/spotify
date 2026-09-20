package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class y3o0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f268968a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f268969b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3o0(C2065kt c2065kt, kqi0 kqi0Var) {
        super(1);
        this.f268968a = 16;
        this.f268969b = kqi0Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:96:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x007a A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v6 java.lang.Object, still in use, count: 2, list:
          (r3v6 java.lang.Object) from 0x0068: PHI (r3 I:??) = (r3v2 java.lang.Object), (r3v6 java.lang.Object) binds: [B:23:0x0067, B:100:0x0068] A[DONT_GENERATE, DONT_INLINE]
          (r3v6 java.lang.Object) from 0x005c: CHECK_CAST (p.tf01) (r3v6 java.lang.Object)
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
    @Override // p204p.gh00
    public final java.lang.Object invoke(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.y3o0.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3o0(kqi0 kqi0Var, int i) {
        super(1);
        this.f268968a = i;
        this.f268969b = kqi0Var;
    }
}
