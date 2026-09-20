package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtMaybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapCompletable;

/* JADX INFO: loaded from: classes4.dex */
public final class dnb1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ u4u f50727a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f50728b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ up0 f50729c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hrw f50730d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ hun0 f50731e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ i4t0 f50732f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ gt0 f50733g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ra9 f50734h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ zon f50735i;

    public dnb1(u4u u4uVar, boolean z, up0 up0Var, hrw hrwVar, hun0 hun0Var, i4t0 i4t0Var, gt0 gt0Var, ra9 ra9Var, zon zonVar) {
        this.f50727a = u4uVar;
        this.f50728b = z;
        this.f50729c = up0Var;
        this.f50730d = hrwVar;
        this.f50731e = hun0Var;
        this.f50732f = i4t0Var;
        this.f50733g = gt0Var;
        this.f50734h = ra9Var;
        this.f50735i = zonVar;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0107  */
    /* JADX WARN: Code duplicated, block: B:48:0x0129 A[PHI: r4
      0x0129: PHI (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:46:0x0125, B:36:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0179  */
    /* JADX WARN: Code duplicated, block: B:59:0x0199  */
    /* JADX WARN: Code duplicated, block: B:60:0x019b  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ba A[Catch: all -> 0x008f, PHI: r1 r8 r13 r14
      0x01ba: PHI (r1v22 ??) = (r1v37 ??), (r1v38 ??) binds: [B:62:0x01b6, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r8v16 p.lt0) = (r8v14 p.lt0), (r8v17 p.lt0) binds: [B:62:0x01b6, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r13v25 ??) = (r13v44 ??), (r13v45 ??) binds: [B:62:0x01b6, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r14v35 java.lang.Object) = (r14v34 java.lang.Object), (r14v1 java.lang.Object) binds: [B:62:0x01b6, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE], TryCatch #5 {all -> 0x008f, blocks: (B:22:0x008a, B:64:0x01ba, B:66:0x01be, B:73:0x01d0, B:27:0x009d, B:61:0x019c, B:57:0x017b), top: B:108:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01be A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #5 {all -> 0x008f, blocks: (B:22:0x008a, B:64:0x01ba, B:66:0x01be, B:73:0x01d0, B:27:0x009d, B:61:0x019c, B:57:0x017b), top: B:108:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fc A[PHI: r13
      0x01fc: PHI (r13v28 ??) = (r13v42 ??), (r13v43 ??) binds: [B:76:0x01f9, B:20:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x0218 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:95:0x0263 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0261, code lost:
    
        if (p204p.x0h1.m89557A(r14, r1, r0) == r7) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [p.ilb1] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v25, types: [int] */
    /* JADX WARN: Type inference failed for: r13v28, types: [int] */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v8, types: [p.ilb1, p.ro0] */
    /* JADX WARN: Type inference failed for: r14v14, types: [p.gt0] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, p.pa9] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [p.pa9] */
    /* JADX WARN: Type inference failed for: r1v2, types: [p.pa9] */
    /* JADX WARN: Type inference failed for: r1v22, types: [p.pa9] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v9, types: [p.pa9] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
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
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m36464a(ilb1 ilb1Var, ibk ibkVar) throws Throwable {
        anb1 anb1Var;
        Throwable th;
        ?? r3;
        lt0 lt0Var;
        ?? r13;
        l1p0 l1p0VarM45673b;
        CompletableOnErrorComplete completableOnErrorCompleteM23299p;
        l1p0 l1p0Var;
        int i;
        juk jukVarM67570t;
        bnb1 bnb1Var;
        rnj0 rnj0Var;
        wm81 wm81Var;
        ?? r1;
        rb20 rb20Var;
        zm81 zm81Var;
        lt0 lt0Var2;
        int i2;
        ?? r2;
        jt0 jt0Var;
        juk jukVarM67570t2;
        bnb1 bnb1Var2;
        ?? r14;
        rnj0 rnj0Var2;
        wm81 wm81Var2;
        if (ibkVar instanceof anb1) {
            anb1Var = (anb1) ibkVar;
            int i3 = anb1Var.f17362h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anb1Var.f17362h = i3 - Integer.MIN_VALUE;
            } else {
                anb1Var = new anb1(this, ibkVar);
            }
        } else {
            anb1Var = new anb1(this, ibkVar);
        }
        Object objM76980u = anb1Var.f17360f;
        ?? r4 = anb1Var.f17362h;
        int i4 = 26;
        ?? r5 = 1;
        int i5 = 0;
        hun0 hun0Var = this.f50731e;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        try {
            switch (r4) {
                case 0:
                    bga.m29073P(objM76980u);
                    lt0 lt0Var3 = (lt0) this.f50732f.get();
                    hh0 hh0VarM96631a = this.f50735i.m96631a("video-ad-overlay");
                    n5q n5qVar = xsr.f265651a;
                    rb20 rb20Var2 = pvb0.f181680a;
                    w9a1 w9a1Var = new w9a1(hh0VarM96631a, lt0Var3, fbkVar, 9);
                    anb1Var.f17355a = ilb1Var;
                    anb1Var.f17356b = lt0Var3;
                    anb1Var.f17362h = 1;
                    Object objM89557A = x0h1.m89557A(rb20Var2, w9a1Var, anb1Var);
                    if (objM89557A != yukVar) {
                        lt0Var = lt0Var3;
                        objM76980u = objM89557A;
                        r13 = ilb1Var;
                        r4 = (pa9) objM76980u;
                        try {
                            l1p0VarM45673b = this.f50733g.m45673b(r13, r13.f103346e);
                            if (l1p0VarM45673b == null) {
                                rnj0 rnj0Var3 = rnj0.f200934b;
                                n5q n5qVar2 = xsr.f265651a;
                                jukVarM67570t = opo.m67570t(rnj0Var3, pvb0.f181680a);
                                bnb1Var = new bnb1(r4, fbkVar, i5);
                                anb1Var.f17355a = null;
                                anb1Var.f17356b = null;
                                anb1Var.f17357c = null;
                                anb1Var.f17359e = 0;
                                anb1Var.f17362h = 2;
                                if (x0h1.m89557A(jukVarM67570t, bnb1Var, anb1Var) != yukVar) {
                                    rnj0Var = rnj0.f200934b;
                                    wm81Var = new wm81(hun0Var, fbkVar, i4);
                                    anb1Var.f17355a = null;
                                    anb1Var.f17356b = null;
                                    anb1Var.f17357c = null;
                                    anb1Var.f17359e = i5;
                                    anb1Var.f17362h = 3;
                                    if (x0h1.m89557A(rnj0Var, wm81Var, anb1Var) != yukVar) {
                                        return null;
                                    }
                                }
                            } else {
                                try {
                                    try {
                                        completableOnErrorCompleteM23299p = new MaybeFlatMapCompletable(new FlowableElementAtMaybe(((Flowable) hun0Var.f95431b).m23348j(d3v.f45011Y)), new ezk0(hun0Var, 14)).m23299p(Functions.f7232h);
                                        anb1Var.f17355a = null;
                                        anb1Var.f17356b = lt0Var;
                                        anb1Var.f17357c = r4;
                                        anb1Var.f17358d = l1p0VarM45673b;
                                        anb1Var.f17359e = 0;
                                        anb1Var.f17362h = 4;
                                        if (zn91.m96565n(completableOnErrorCompleteM23299p, anb1Var) != yukVar) {
                                            l1p0Var = l1p0VarM45673b;
                                            i = 0;
                                            r1 = r4;
                                            n5q n5qVar3 = xsr.f265651a;
                                            rb20Var = pvb0.f181680a;
                                            zm81Var = new zm81(r1, l1p0Var, fbkVar, 16);
                                            anb1Var.f17355a = null;
                                            anb1Var.f17356b = lt0Var;
                                            anb1Var.f17357c = r1;
                                            anb1Var.f17358d = null;
                                            anb1Var.f17359e = i;
                                            anb1Var.f17362h = 5;
                                            if (x0h1.m89557A(rb20Var, zm81Var, anb1Var) != yukVar) {
                                                lt0Var2 = lt0Var;
                                                r2 = r1;
                                                i2 = i;
                                                wm81 wm81Var3 = new wm81(lt0Var2, fbkVar, 27);
                                                anb1Var.f17355a = null;
                                                anb1Var.f17356b = lt0Var2;
                                                anb1Var.f17357c = r2;
                                                anb1Var.f17358d = null;
                                                anb1Var.f17359e = i2;
                                                anb1Var.f17362h = 6;
                                                objM76980u = s1h1.m76980u(3000L, wm81Var3, anb1Var);
                                                r4 = r2;
                                                ilb1Var = i2;
                                                if (objM76980u == yukVar) {
                                                    jt0Var = (jt0) objM76980u;
                                                    if (jt0Var != null || jt0Var.m54258b()) {
                                                        Logger.m3973i("Overlay video prebuffering failed", new Object[0]);
                                                        if (ilb1Var == 0) {
                                                            rnj0 rnj0Var4 = rnj0.f200934b;
                                                            n5q n5qVar4 = xsr.f265651a;
                                                            jukVarM67570t2 = opo.m67570t(rnj0Var4, pvb0.f181680a);
                                                            bnb1Var2 = new bnb1(r4, fbkVar, i5);
                                                            anb1Var.f17355a = null;
                                                            anb1Var.f17356b = null;
                                                            anb1Var.f17357c = null;
                                                            anb1Var.f17358d = null;
                                                            anb1Var.f17359e = ilb1Var;
                                                            anb1Var.f17362h = 7;
                                                            if (x0h1.m89557A(jukVarM67570t2, bnb1Var2, anb1Var) != yukVar) {
                                                                r14 = ilb1Var;
                                                                rnj0Var2 = rnj0.f200934b;
                                                                wm81Var2 = new wm81(hun0Var, fbkVar, i4);
                                                                anb1Var.f17355a = null;
                                                                anb1Var.f17356b = null;
                                                                anb1Var.f17357c = null;
                                                                anb1Var.f17358d = null;
                                                                anb1Var.f17359e = r14;
                                                                anb1Var.f17362h = 8;
                                                                if (x0h1.m89557A(rnj0Var2, wm81Var2, anb1Var) != yukVar) {
                                                                }
                                                            }
                                                        }
                                                        return null;
                                                    }
                                                    try {
                                                        wj50.m88279p(lt0Var2);
                                                        return new zmb1(r4, lt0Var2, false);
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                    }
                                                    if (r5 != 0) {
                                                        throw th;
                                                    }
                                                    rnj0 rnj0Var5 = rnj0.f200934b;
                                                    n5q n5qVar5 = xsr.f265651a;
                                                    juk jukVarM67570t3 = opo.m67570t(rnj0Var5, pvb0.f181680a);
                                                    bnb1 bnb1Var3 = new bnb1(r4, fbkVar, i5);
                                                    anb1Var.f17355a = null;
                                                    anb1Var.f17356b = null;
                                                    anb1Var.f17357c = null;
                                                    anb1Var.f17358d = th;
                                                    anb1Var.f17359e = r5 == true ? 1 : 0;
                                                    anb1Var.f17362h = 11;
                                                    if (x0h1.m89557A(jukVarM67570t3, bnb1Var3, anb1Var) != yukVar) {
                                                        th = th;
                                                        r3 = r5;
                                                        rnj0 rnj0Var6 = rnj0.f200934b;
                                                        wm81 wm81Var4 = new wm81(hun0Var, fbkVar, i4);
                                                        anb1Var.f17355a = null;
                                                        anb1Var.f17356b = null;
                                                        anb1Var.f17357c = null;
                                                        anb1Var.f17358d = th;
                                                        anb1Var.f17359e = r3;
                                                        anb1Var.f17362h = 12;
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        th = th;
                                        r5 = 0;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                    r14 = ilb1Var;
                    return yukVar;
                case 1:
                    lt0 lt0Var4 = anb1Var.f17356b;
                    ilb1 ilb1Var2 = anb1Var.f17355a;
                    bga.m29073P(objM76980u);
                    lt0Var = lt0Var4;
                    r13 = ilb1Var2;
                    r4 = (pa9) objM76980u;
                    l1p0VarM45673b = this.f50733g.m45673b(r13, r13.f103346e);
                    if (l1p0VarM45673b == null) {
                        rnj0 rnj0Var7 = rnj0.f200934b;
                        n5q n5qVar6 = xsr.f265651a;
                        jukVarM67570t = opo.m67570t(rnj0Var7, pvb0.f181680a);
                        bnb1Var = new bnb1(r4, fbkVar, i5);
                        anb1Var.f17355a = null;
                        anb1Var.f17356b = null;
                        anb1Var.f17357c = null;
                        anb1Var.f17359e = 0;
                        anb1Var.f17362h = 2;
                        if (x0h1.m89557A(jukVarM67570t, bnb1Var, anb1Var) != yukVar) {
                            rnj0Var = rnj0.f200934b;
                            wm81Var = new wm81(hun0Var, fbkVar, i4);
                            anb1Var.f17355a = null;
                            anb1Var.f17356b = null;
                            anb1Var.f17357c = null;
                            anb1Var.f17359e = i5;
                            anb1Var.f17362h = 3;
                            if (x0h1.m89557A(rnj0Var, wm81Var, anb1Var) != yukVar) {
                                return null;
                            }
                        }
                    } else {
                        completableOnErrorCompleteM23299p = new MaybeFlatMapCompletable(new FlowableElementAtMaybe(((Flowable) hun0Var.f95431b).m23348j(d3v.f45011Y)), new ezk0(hun0Var, 14)).m23299p(Functions.f7232h);
                        anb1Var.f17355a = null;
                        anb1Var.f17356b = lt0Var;
                        anb1Var.f17357c = r4;
                        anb1Var.f17358d = l1p0VarM45673b;
                        anb1Var.f17359e = 0;
                        anb1Var.f17362h = 4;
                        if (zn91.m96565n(completableOnErrorCompleteM23299p, anb1Var) != yukVar) {
                            l1p0Var = l1p0VarM45673b;
                            i = 0;
                            r1 = r4;
                            n5q n5qVar7 = xsr.f265651a;
                            rb20Var = pvb0.f181680a;
                            zm81Var = new zm81(r1, l1p0Var, fbkVar, 16);
                            anb1Var.f17355a = null;
                            anb1Var.f17356b = lt0Var;
                            anb1Var.f17357c = r1;
                            anb1Var.f17358d = null;
                            anb1Var.f17359e = i;
                            anb1Var.f17362h = 5;
                            if (x0h1.m89557A(rb20Var, zm81Var, anb1Var) != yukVar) {
                                lt0Var2 = lt0Var;
                                r2 = r1;
                                i2 = i;
                                wm81 wm81Var5 = new wm81(lt0Var2, fbkVar, 27);
                                anb1Var.f17355a = null;
                                anb1Var.f17356b = lt0Var2;
                                anb1Var.f17357c = r2;
                                anb1Var.f17358d = null;
                                anb1Var.f17359e = i2;
                                anb1Var.f17362h = 6;
                                objM76980u = s1h1.m76980u(3000L, wm81Var5, anb1Var);
                                r4 = r2;
                                ilb1Var = i2;
                                if (objM76980u == yukVar) {
                                    jt0Var = (jt0) objM76980u;
                                    if (jt0Var != null) {
                                        break;
                                    }
                                    Logger.m3973i("Overlay video prebuffering failed", new Object[0]);
                                    if (ilb1Var == 0) {
                                        rnj0 rnj0Var8 = rnj0.f200934b;
                                        n5q n5qVar8 = xsr.f265651a;
                                        jukVarM67570t2 = opo.m67570t(rnj0Var8, pvb0.f181680a);
                                        bnb1Var2 = new bnb1(r4, fbkVar, i5);
                                        anb1Var.f17355a = null;
                                        anb1Var.f17356b = null;
                                        anb1Var.f17357c = null;
                                        anb1Var.f17358d = null;
                                        anb1Var.f17359e = ilb1Var;
                                        anb1Var.f17362h = 7;
                                        if (x0h1.m89557A(jukVarM67570t2, bnb1Var2, anb1Var) != yukVar) {
                                            r14 = ilb1Var;
                                            rnj0Var2 = rnj0.f200934b;
                                            wm81Var2 = new wm81(hun0Var, fbkVar, i4);
                                            anb1Var.f17355a = null;
                                            anb1Var.f17356b = null;
                                            anb1Var.f17357c = null;
                                            anb1Var.f17358d = null;
                                            anb1Var.f17359e = r14;
                                            anb1Var.f17362h = 8;
                                            if (x0h1.m89557A(rnj0Var2, wm81Var2, anb1Var) != yukVar) {
                                            }
                                        }
                                    }
                                    return null;
                                }
                            }
                        }
                    }
                    r14 = ilb1Var;
                    return yukVar;
                case 2:
                    i5 = anb1Var.f17359e;
                    bga.m29073P(objM76980u);
                    rnj0Var = rnj0.f200934b;
                    wm81Var = new wm81(hun0Var, fbkVar, i4);
                    anb1Var.f17355a = null;
                    anb1Var.f17356b = null;
                    anb1Var.f17357c = null;
                    anb1Var.f17359e = i5;
                    anb1Var.f17362h = 3;
                    if (x0h1.m89557A(rnj0Var, wm81Var, anb1Var) != yukVar) {
                        return null;
                    }
                    r14 = ilb1Var;
                    return yukVar;
                case 3:
                    bga.m29073P(objM76980u);
                    return null;
                case 4:
                    int i6 = anb1Var.f17359e;
                    l1p0 l1p0Var2 = (l1p0) anb1Var.f17358d;
                    pa9 pa9Var = anb1Var.f17357c;
                    lt0Var = anb1Var.f17356b;
                    try {
                        bga.m29073P(objM76980u);
                        l1p0Var = l1p0Var2;
                        r1 = pa9Var;
                        i = i6;
                        n5q n5qVar9 = xsr.f265651a;
                        rb20Var = pvb0.f181680a;
                        zm81Var = new zm81(r1, l1p0Var, fbkVar, 16);
                        anb1Var.f17355a = null;
                        anb1Var.f17356b = lt0Var;
                        anb1Var.f17357c = r1;
                        anb1Var.f17358d = null;
                        anb1Var.f17359e = i;
                        anb1Var.f17362h = 5;
                        if (x0h1.m89557A(rb20Var, zm81Var, anb1Var) != yukVar) {
                            lt0Var2 = lt0Var;
                            r2 = r1;
                            i2 = i;
                            wm81 wm81Var6 = new wm81(lt0Var2, fbkVar, 27);
                            anb1Var.f17355a = null;
                            anb1Var.f17356b = lt0Var2;
                            anb1Var.f17357c = r2;
                            anb1Var.f17358d = null;
                            anb1Var.f17359e = i2;
                            anb1Var.f17362h = 6;
                            objM76980u = s1h1.m76980u(3000L, wm81Var6, anb1Var);
                            r4 = r2;
                            ilb1Var = i2;
                            if (objM76980u == yukVar) {
                                jt0Var = (jt0) objM76980u;
                                if (jt0Var != null) {
                                    break;
                                }
                                Logger.m3973i("Overlay video prebuffering failed", new Object[0]);
                                if (ilb1Var == 0) {
                                    rnj0 rnj0Var9 = rnj0.f200934b;
                                    n5q n5qVar10 = xsr.f265651a;
                                    jukVarM67570t2 = opo.m67570t(rnj0Var9, pvb0.f181680a);
                                    bnb1Var2 = new bnb1(r4, fbkVar, i5);
                                    anb1Var.f17355a = null;
                                    anb1Var.f17356b = null;
                                    anb1Var.f17357c = null;
                                    anb1Var.f17358d = null;
                                    anb1Var.f17359e = ilb1Var;
                                    anb1Var.f17362h = 7;
                                    if (x0h1.m89557A(jukVarM67570t2, bnb1Var2, anb1Var) != yukVar) {
                                        r14 = ilb1Var;
                                        rnj0Var2 = rnj0.f200934b;
                                        wm81Var2 = new wm81(hun0Var, fbkVar, i4);
                                        anb1Var.f17355a = null;
                                        anb1Var.f17356b = null;
                                        anb1Var.f17357c = null;
                                        anb1Var.f17358d = null;
                                        anb1Var.f17359e = r14;
                                        anb1Var.f17362h = 8;
                                        if (x0h1.m89557A(rnj0Var2, wm81Var2, anb1Var) != yukVar) {
                                        }
                                    }
                                }
                                return null;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r5 = i6;
                        r4 = pa9Var;
                        break;
                    }
                    r14 = ilb1Var;
                    return yukVar;
                case 5:
                    int i7 = anb1Var.f17359e;
                    pa9 pa9Var2 = anb1Var.f17357c;
                    lt0Var2 = anb1Var.f17356b;
                    bga.m29073P(objM76980u);
                    r2 = pa9Var2;
                    i2 = i7;
                    wm81 wm81Var7 = new wm81(lt0Var2, fbkVar, 27);
                    anb1Var.f17355a = null;
                    anb1Var.f17356b = lt0Var2;
                    anb1Var.f17357c = r2;
                    anb1Var.f17358d = null;
                    anb1Var.f17359e = i2;
                    anb1Var.f17362h = 6;
                    objM76980u = s1h1.m76980u(3000L, wm81Var7, anb1Var);
                    r4 = r2;
                    ilb1Var = i2;
                    if (objM76980u == yukVar) {
                        jt0Var = (jt0) objM76980u;
                        if (jt0Var != null) {
                            break;
                        }
                        Logger.m3973i("Overlay video prebuffering failed", new Object[0]);
                        if (ilb1Var == 0) {
                            rnj0 rnj0Var10 = rnj0.f200934b;
                            n5q n5qVar11 = xsr.f265651a;
                            jukVarM67570t2 = opo.m67570t(rnj0Var10, pvb0.f181680a);
                            bnb1Var2 = new bnb1(r4, fbkVar, i5);
                            anb1Var.f17355a = null;
                            anb1Var.f17356b = null;
                            anb1Var.f17357c = null;
                            anb1Var.f17358d = null;
                            anb1Var.f17359e = ilb1Var;
                            anb1Var.f17362h = 7;
                            if (x0h1.m89557A(jukVarM67570t2, bnb1Var2, anb1Var) != yukVar) {
                                r14 = ilb1Var;
                                rnj0Var2 = rnj0.f200934b;
                                wm81Var2 = new wm81(hun0Var, fbkVar, i4);
                                anb1Var.f17355a = null;
                                anb1Var.f17356b = null;
                                anb1Var.f17357c = null;
                                anb1Var.f17358d = null;
                                anb1Var.f17359e = r14;
                                anb1Var.f17362h = 8;
                                if (x0h1.m89557A(rnj0Var2, wm81Var2, anb1Var) != yukVar) {
                                }
                            }
                        }
                        return null;
                    }
                    r14 = ilb1Var;
                    return yukVar;
                case 6:
                    int i8 = anb1Var.f17359e;
                    pa9 pa9Var3 = anb1Var.f17357c;
                    lt0Var2 = anb1Var.f17356b;
                    bga.m29073P(objM76980u);
                    r4 = pa9Var3;
                    ilb1Var = i8;
                    jt0Var = (jt0) objM76980u;
                    if (jt0Var != null) {
                        break;
                    }
                    Logger.m3973i("Overlay video prebuffering failed", new Object[0]);
                    if (ilb1Var == 0) {
                        rnj0 rnj0Var11 = rnj0.f200934b;
                        n5q n5qVar12 = xsr.f265651a;
                        jukVarM67570t2 = opo.m67570t(rnj0Var11, pvb0.f181680a);
                        bnb1Var2 = new bnb1(r4, fbkVar, i5);
                        anb1Var.f17355a = null;
                        anb1Var.f17356b = null;
                        anb1Var.f17357c = null;
                        anb1Var.f17358d = null;
                        anb1Var.f17359e = ilb1Var;
                        anb1Var.f17362h = 7;
                        if (x0h1.m89557A(jukVarM67570t2, bnb1Var2, anb1Var) != yukVar) {
                            r14 = ilb1Var;
                            rnj0Var2 = rnj0.f200934b;
                            wm81Var2 = new wm81(hun0Var, fbkVar, i4);
                            anb1Var.f17355a = null;
                            anb1Var.f17356b = null;
                            anb1Var.f17357c = null;
                            anb1Var.f17358d = null;
                            anb1Var.f17359e = r14;
                            anb1Var.f17362h = 8;
                            if (x0h1.m89557A(rnj0Var2, wm81Var2, anb1Var) != yukVar) {
                            }
                        }
                        r14 = ilb1Var;
                        return yukVar;
                    }
                    return null;
                case 7:
                    int i9 = anb1Var.f17359e;
                    bga.m29073P(objM76980u);
                    r14 = i9;
                    r14 = ilb1Var;
                    rnj0Var2 = rnj0.f200934b;
                    wm81Var2 = new wm81(hun0Var, fbkVar, i4);
                    anb1Var.f17355a = null;
                    anb1Var.f17356b = null;
                    anb1Var.f17357c = null;
                    anb1Var.f17358d = null;
                    anb1Var.f17359e = r14;
                    anb1Var.f17362h = 8;
                    if (x0h1.m89557A(rnj0Var2, wm81Var2, anb1Var) != yukVar) {
                        return null;
                    }
                    r14 = ilb1Var;
                    return yukVar;
                case 8:
                case 10:
                    bga.m29073P(objM76980u);
                    return null;
                case 9:
                    int i10 = anb1Var.f17359e;
                    bga.m29073P(objM76980u);
                    rnj0 rnj0Var12 = rnj0.f200934b;
                    wm81 wm81Var8 = new wm81(hun0Var, fbkVar, i4);
                    anb1Var.f17355a = null;
                    anb1Var.f17356b = null;
                    anb1Var.f17357c = null;
                    anb1Var.f17358d = null;
                    anb1Var.f17359e = i10;
                    anb1Var.f17362h = 10;
                    if (x0h1.m89557A(rnj0Var12, wm81Var8, anb1Var) != yukVar) {
                        return null;
                    }
                    r14 = ilb1Var;
                    return yukVar;
                case 11:
                    int i11 = anb1Var.f17359e;
                    Throwable th7 = (Throwable) anb1Var.f17358d;
                    bga.m29073P(objM76980u);
                    r3 = i11;
                    th = th7;
                    rnj0 rnj0Var13 = rnj0.f200934b;
                    wm81 wm81Var9 = new wm81(hun0Var, fbkVar, i4);
                    anb1Var.f17355a = null;
                    anb1Var.f17356b = null;
                    anb1Var.f17357c = null;
                    anb1Var.f17358d = th;
                    anb1Var.f17359e = r3;
                    anb1Var.f17362h = 12;
                    break;
                case 12:
                    th = (Throwable) anb1Var.f17358d;
                    bga.m29073P(objM76980u);
                    throw th;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th8) {
            th = th8;
            r5 = ilb1Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m36465b(ilb1 ilb1Var, dnc dncVar) {
        return this.f50728b ? m36466c(ilb1Var, dncVar) : m36464a(ilb1Var, dncVar);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m36466c(ilb1 ilb1Var, ibk ibkVar) throws Throwable {
        cnb1 cnb1Var;
        lt0 lt0Var;
        lt0 lt0Var2;
        pa9 pa9Var;
        boolean zBooleanValue;
        lt0 lt0Var3;
        if (ibkVar instanceof cnb1) {
            cnb1Var = (cnb1) ibkVar;
            int i = cnb1Var.f39940e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cnb1Var.f39940e = i - Integer.MIN_VALUE;
            } else {
                cnb1Var = new cnb1(this, ibkVar);
            }
        } else {
            cnb1Var = new cnb1(this, ibkVar);
        }
        Object objM89557A = cnb1Var.f39938c;
        int i2 = cnb1Var.f39940e;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            lt0 lt0Var4 = (lt0) this.f50732f.get();
            l1p0 l1p0VarM45673b = this.f50733g.m45673b(ilb1Var, ilb1Var.f103346e);
            fbk fbkVar = null;
            if (l1p0VarM45673b == null) {
                return null;
            }
            n5q n5qVar = xsr.f265651a;
            rb20 rb20Var = pvb0.f181680a;
            qw11 qw11Var = new qw11(this.f50734h, l1p0VarM45673b, lt0Var4, fbkVar, 23);
            cnb1Var.f39936a = lt0Var4;
            cnb1Var.f39940e = 1;
            objM89557A = x0h1.m89557A(rb20Var, qw11Var, cnb1Var);
            if (objM89557A != yukVar) {
                lt0Var = lt0Var4;
            }
            return yukVar;
        }
        if (i2 == 1) {
            lt0Var = cnb1Var.f39936a;
            bga.m29073P(objM89557A);
        } else {
            if (i2 == 2) {
                pa9Var = cnb1Var.f39937b;
                lt0Var2 = cnb1Var.f39936a;
                bga.m29073P(objM89557A);
                zBooleanValue = ((Boolean) objM89557A).booleanValue();
                cnb1Var.f39936a = lt0Var2;
                cnb1Var.f39937b = pa9Var;
                cnb1Var.f39940e = 3;
                if (this.f50729c.m83640a(this.f50730d, zBooleanValue, cnb1Var) != yukVar) {
                    lt0Var3 = lt0Var2;
                }
                return yukVar;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pa9Var = cnb1Var.f39937b;
            lt0Var3 = cnb1Var.f39936a;
            bga.m29073P(objM89557A);
        }
        wj50.m88279p(lt0Var3);
        return new zmb1(pa9Var, lt0Var3, true);
        pa9 pa9Var2 = (pa9) objM89557A;
        Single singleM23327A = ((Flowable) this.f50731e.f95431b).m23348j(d3v.f45011Y).m23327A();
        cnb1Var.f39936a = lt0Var;
        cnb1Var.f39937b = pa9Var2;
        cnb1Var.f39940e = 2;
        Object objM96567o = zn91.m96567o(singleM23327A, cnb1Var);
        if (objM96567o != yukVar) {
            lt0Var2 = lt0Var;
            pa9Var = pa9Var2;
            objM89557A = objM96567o;
            zBooleanValue = ((Boolean) objM89557A).booleanValue();
            cnb1Var.f39936a = lt0Var2;
            cnb1Var.f39937b = pa9Var;
            cnb1Var.f39940e = 3;
            if (this.f50729c.m83640a(this.f50730d, zBooleanValue, cnb1Var) != yukVar) {
                lt0Var3 = lt0Var2;
                wj50.m88279p(lt0Var3);
                return new zmb1(pa9Var, lt0Var3, true);
            }
        }
        return yukVar;
    }
}
