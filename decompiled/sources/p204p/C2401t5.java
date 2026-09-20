package p204p;

import com.spotify.encoreconsumermobile.elements.badge.badgegroup.BadgeGroupView;

/* JADX INFO: renamed from: p.t5 */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2401t5 extends ri00 implements gh00 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f217182h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2401t5(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f217182h = i4;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:298:0x08cb  */
    /* JADX WARN: Code duplicated, block: B:299:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:359:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0152  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v144, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r6v8, types: [p.fbk, p.juk] */
    /* JADX WARN: Type inference failed for: r7v0, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v18 java.lang.Object, still in use, count: 2, list:
          (r2v18 java.lang.Object) from 0x08c7: PHI (r2 I:??) = (r2v15 java.lang.Object), (r2v18 java.lang.Object) binds: [B:295:0x08c5, B:389:0x08c7] A[DONT_GENERATE, DONT_INLINE]
          (r2v18 java.lang.Object) from 0x08bf: CHECK_CAST (byte[]) (r2v18 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 2598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.C2401t5.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2401t5(BadgeGroupView badgeGroupView, int i) {
        super(1, badgeGroupView, BadgeGroupView.class, "replaceFirstBadge", "replaceFirstBadge(Lcom/spotify/encoreconsumermobile/elements/badge/badgegroup/BadgeGroup$BadgeType;)V", 0, 0);
        this.f217182h = i;
        switch (i) {
            case 22:
                super(1, badgeGroupView, BadgeGroupView.class, "replaceSecondBadge", "replaceSecondBadge(Lcom/spotify/encoreconsumermobile/elements/badge/badgegroup/BadgeGroup$BadgeType;)V", 0, 0);
                break;
            case 23:
                super(1, badgeGroupView, BadgeGroupView.class, "replaceThirdBadge", "replaceThirdBadge(Lcom/spotify/encoreconsumermobile/elements/badge/badgegroup/BadgeGroup$BadgeType;)V", 0, 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2401t5(AbstractC2203o6 abstractC2203o6) {
        super(1, abstractC2203o6, AbstractC2203o6.class, "onFocusChange", "onFocusChange(Z)V", 0, 0);
        this.f217182h = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2401t5(mm1 mm1Var) {
        super(1, mm1Var, mm1.class, "resolveItems", "resolveItems(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0);
        this.f217182h = 6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2401t5(k59 k59Var) {
        super(1, k59Var, k59.class, "handleUpdates", "handleUpdates(Ljava/util/Map;)V", 0, 0);
        this.f217182h = 24;
    }
}
