package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class yrb implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f275439a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f275440b;

    public /* synthetic */ yrb(Object obj, int i) {
        this.f275439a = i;
        this.f275440b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r0.m80016d(r7, r1) == r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0.m80017e(r6, r1) == r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        return r2;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m94414b(vab vabVar, fbk fbkVar) {
        s3p s3pVar;
        t3p t3pVar = (t3p) this.f275440b;
        if (fbkVar instanceof s3p) {
            s3pVar = (s3p) fbkVar;
            int i = s3pVar.f205313d;
            if ((i & Integer.MIN_VALUE) != 0) {
                s3pVar.f205313d = i - Integer.MIN_VALUE;
            } else {
                s3pVar = new s3p(this, fbkVar);
            }
        } else {
            s3pVar = new s3p(this, fbkVar);
        }
        Object obj = s3pVar.f205311b;
        int i2 = s3pVar.f205313d;
        if (i2 == 0) {
            bga.m29073P(obj);
            boolean z = vabVar instanceof rab;
            yuk yukVar = yuk.f276404a;
            if (z) {
                ArrayList arrayList = ((rab) vabVar).f197247c;
                s3pVar.f205310a = vabVar;
                s3pVar.f205313d = 1;
            } else {
                s3pVar.f205310a = vabVar;
                s3pVar.f205313d = 2;
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vabVar = s3pVar.f205310a;
            bga.m29073P(obj);
        }
        zv41 zv41Var = t3pVar.f216819h;
        if (zv41Var != null) {
            zv41Var.m97091m(null, fm8.m42076s(vabVar.mo63979b(), t3pVar.f216812a));
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:190:0x04db  */
    /* JADX WARN: Code duplicated, block: B:197:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:231:0x0598  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String, p.fbk] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v16 */
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v8 java.lang.Object, still in use, count: 2, list:
          (r8v8 java.lang.Object) from 0x00bc: PHI (r8 I:??) = (r8v5 java.lang.Object), (r8v8 java.lang.Object) binds: [B:28:0x00bb, B:257:0x00bc] A[DONT_GENERATE, DONT_INLINE]
          (r8v8 java.lang.Object) from 0x00ac: CHECK_CAST (p.rmx0) (r8v8 java.lang.Object)
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
    public final java.lang.Object emit(java.lang.Object r26, p204p.fbk r27) {
        /*
            Method dump skipped, instruction units count: 1654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.yrb.emit(java.lang.Object, p.fbk):java.lang.Object");
    }

    public yrb(niz nizVar, h5q h5qVar) {
        this.f275439a = 2;
        this.f275440b = h5qVar;
    }
}
