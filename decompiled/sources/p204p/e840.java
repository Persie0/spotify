package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e840 extends ri00 implements gh00 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f57066h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e840(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f57066h = i4;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0296 A[Catch: all -> 0x028e, TRY_LEAVE, TryCatch #1 {all -> 0x028e, blocks: (B:95:0x0277, B:96:0x027d, B:98:0x0283, B:104:0x0292, B:106:0x0296), top: B:156:0x0277 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c4  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v14 java.lang.Object, still in use, count: 2, list:
          (r2v14 java.lang.Object) from 0x0292: PHI (r2 I:??) = (r2v11 java.lang.Object), (r2v14 java.lang.Object) binds: [B:103:0x0291, B:161:0x0292] A[DONT_GENERATE, DONT_INLINE]
          (r2v14 java.lang.Object) from 0x0288: CHECK_CAST (byte[]) (r2v14 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.e840.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e840(Object obj, int i) {
        super(1, obj, f250.class, "createContribution", "createContribution(Lcom/spotify/element/core/instrumentation/InstrumentationEnvironment;)Lcom/spotify/element/core/instrumentation/InstrumentationEnvironment;", 0, 0);
        this.f57066h = i;
        switch (i) {
            case 22:
                super(1, obj, ovf.class, "render", "render(Ljava/lang/Object;)V", 0, 0);
                break;
            case 23:
                super(1, obj, ovf.class, "onEvent", "onEvent(Lkotlin/jvm/functions/Function1;)V", 0, 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e840(f250 f250Var) {
        super(1, f250Var, f250.class, "createContribution", "createContribution(Lcom/spotify/element/core/instrumentation/InstrumentationEnvironment;)Lcom/spotify/element/core/instrumentation/InstrumentationEnvironment;", 0, 0);
        this.f57066h = 4;
    }
}
