package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class i7i implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f99565a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f99566b;

    public /* synthetic */ i7i(niz nizVar, int i) {
        this.f99565a = i;
        this.f99566b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    private final Object m49868b(Object obj, fbk fbkVar) {
        ivi iviVar;
        if (fbkVar instanceof ivi) {
            iviVar = (ivi) fbkVar;
            int i = iviVar.f106225b;
            if ((i & Integer.MIN_VALUE) != 0) {
                iviVar.f106225b = i - Integer.MIN_VALUE;
            } else {
                iviVar = new ivi(this, fbkVar);
            }
        } else {
            iviVar = new ivi(this, fbkVar);
        }
        Object obj2 = iviVar.f106224a;
        int i2 = iviVar.f106225b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            api apiVar = (api) ((xul0) obj).mo49283h();
            boolean z = false;
            if (apiVar != null && !apiVar.mo26697m()) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            iviVar.f106225b = 1;
            Object objEmit = this.f99566b.emit(boolValueOf, iviVar);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:137:0x022f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0286  */
    /* JADX WARN: Code duplicated, block: B:181:0x02df  */
    /* JADX WARN: Code duplicated, block: B:197:0x031f  */
    /* JADX WARN: Code duplicated, block: B:208:0x0344  */
    /* JADX WARN: Code duplicated, block: B:232:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:245:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:264:0x0433  */
    /* JADX WARN: Code duplicated, block: B:281:0x047a  */
    /* JADX WARN: Code duplicated, block: B:298:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:317:0x0526  */
    /* JADX WARN: Code duplicated, block: B:339:0x057c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX WARN: Code duplicated, block: B:355:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:356:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:373:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:376:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:377:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:380:0x0601  */
    /* JADX WARN: Code duplicated, block: B:387:0x061a  */
    /* JADX WARN: Code duplicated, block: B:388:0x061c  */
    /* JADX WARN: Code duplicated, block: B:391:0x0626  */
    /* JADX WARN: Code duplicated, block: B:408:0x0657  */
    /* JADX WARN: Code duplicated, block: B:431:0x069d  */
    /* JADX WARN: Code duplicated, block: B:433:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:434:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:439:0x06af  */
    /* JADX WARN: Code duplicated, block: B:450:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:467:0x0724  */
    /* JADX WARN: Code duplicated, block: B:484:0x076d  */
    /* JADX WARN: Code duplicated, block: B:507:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:526:0x080b  */
    /* JADX WARN: Code duplicated, block: B:545:0x0854  */
    /* JADX WARN: Code duplicated, block: B:562:0x089b  */
    /* JADX WARN: Code duplicated, block: B:609:0x0943  */
    /* JADX WARN: Code duplicated, block: B:637:0x099e  */
    /* JADX WARN: Code duplicated, block: B:656:0x09e5  */
    /* JADX WARN: Code duplicated, block: B:675:0x0a2c  */
    /* JADX WARN: Code duplicated, block: B:692:0x0a73  */
    /* JADX WARN: Code duplicated, block: B:709:0x0abe  */
    /* JADX WARN: Code duplicated, block: B:72:0x0122  */
    /* JADX WARN: Code duplicated, block: B:742:0x03c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:0x03ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:0x0665 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:760:0x0663 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:? A[LOOP:8: B:406:0x0651->B:761:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:0x061a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:0x05f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0180  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v58 java.lang.Object, still in use, count: 2, list:
          (r4v58 java.lang.Object) from 0x05b9: PHI (r4 I:??) = (r4v46 java.lang.Object), (r4v58 java.lang.Object) binds: [B:352:0x05b8, B:747:0x05b9] A[DONT_GENERATE, DONT_INLINE]
          (r4v58 java.lang.Object) from 0x05af: CHECK_CAST (p.api) (r4v58 java.lang.Object)
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
    public final java.lang.Object emit(java.lang.Object r20, p204p.fbk r21) {
        /*
            Method dump skipped, instruction units count: 2886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.i7i.emit(java.lang.Object, p.fbk):java.lang.Object");
    }

    public /* synthetic */ i7i(niz nizVar, Object obj, int i) {
        this.f99565a = i;
        this.f99566b = nizVar;
    }
}
