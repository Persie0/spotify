package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class c780 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34790a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f34791b;

    public /* synthetic */ c780(niz nizVar, int i) {
        this.f34790a = i;
        this.f34791b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    private final Object m31684b(Object obj, fbk fbkVar) {
        e990 e990Var;
        if (fbkVar instanceof e990) {
            e990Var = (e990) fbkVar;
            int i = e990Var.f57396b;
            if ((i & Integer.MIN_VALUE) != 0) {
                e990Var.f57396b = i - Integer.MIN_VALUE;
            } else {
                e990Var = new e990(this, fbkVar);
            }
        } else {
            e990Var = new e990(this, fbkVar);
        }
        Object obj2 = e990Var.f57395a;
        int i2 = e990Var.f57396b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            Boolean boolValueOf = Boolean.valueOf(wj50.m88271j((String) obj, "ENABLED"));
            e990Var.f57396b = 1;
            Object objEmit = this.f34791b.emit(boolValueOf, e990Var);
            yuk yukVar = yuk.f276404a;
            if (objEmit == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01af  */
    /* JADX WARN: Code duplicated, block: B:141:0x0203  */
    /* JADX WARN: Code duplicated, block: B:165:0x0257  */
    /* JADX WARN: Code duplicated, block: B:182:0x029b  */
    /* JADX WARN: Code duplicated, block: B:206:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:232:0x0355  */
    /* JADX WARN: Code duplicated, block: B:263:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:290:0x0429  */
    /* JADX WARN: Code duplicated, block: B:307:0x046d  */
    /* JADX WARN: Code duplicated, block: B:324:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:349:0x051d  */
    /* JADX WARN: Code duplicated, block: B:366:0x0561  */
    /* JADX WARN: Code duplicated, block: B:383:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:400:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:417:0x063e  */
    /* JADX WARN: Code duplicated, block: B:438:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:489:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:506:0x0810  */
    /* JADX WARN: Code duplicated, block: B:523:0x0859  */
    /* JADX WARN: Code duplicated, block: B:554:0x08ec  */
    /* JADX WARN: Code duplicated, block: B:571:0x0937  */
    /* JADX WARN: Code duplicated, block: B:591:0x099d  */
    /* JADX WARN: Code duplicated, block: B:602:0x09d0  */
    /* JADX WARN: Code duplicated, block: B:626:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:650:0x0a78  */
    /* JADX WARN: Code duplicated, block: B:698:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0107  */
    /* JADX WARN: Code duplicated, block: B:700:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x015b  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v26 java.lang.Object, still in use, count: 2, list:
          (r4v26 java.lang.Object) from 0x0999: PHI (r4 I:??) = (r4v22 java.lang.Object), (r4v26 java.lang.Object) binds: [B:588:0x0998, B:671:0x0999] A[DONT_GENERATE, DONT_INLINE]
          (r4v26 java.lang.Object) from 0x0991: CHECK_CAST (p.j6z) (r4v26 java.lang.Object)
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
    @Override // p204p.niz
    public final java.lang.Object emit(java.lang.Object r19, p204p.fbk r20) {
        /*
            Method dump skipped, instruction units count: 2806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.c780.emit(java.lang.Object, p.fbk):java.lang.Object");
    }
}
