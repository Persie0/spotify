package p204p;

import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes10.dex */
public final class kvv implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wfx f126964a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ m011 f126965b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gwv f126966c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ qnd f126967d;

    public kvv(wfx wfxVar, m011 m011Var, gwv gwvVar, qnd qndVar) {
        this.f126964a = wfxVar;
        this.f126965b = m011Var;
        this.f126966c = gwvVar;
        this.f126967d = qndVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020e A[Catch: all -> 0x0215, TRY_ENTER, TryCatch #3 {all -> 0x0215, blocks: (B:66:0x017d, B:84:0x01d9, B:100:0x020e, B:103:0x0218), top: B:172:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0218 A[Catch: all -> 0x0215, TRY_LEAVE, TryCatch #3 {all -> 0x0215, blocks: (B:66:0x017d, B:84:0x01d9, B:100:0x020e, B:103:0x0218), top: B:172:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:111:0x023e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0260  */
    /* JADX WARN: Code duplicated, block: B:135:0x026e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0270  */
    /* JADX WARN: Code duplicated, block: B:139:0x0275  */
    /* JADX WARN: Code duplicated, block: B:142:0x027d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0286 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:151:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:164:0x0314  */
    /* JADX WARN: Code duplicated, block: B:175:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:42:0x010e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0112  */
    /* JADX WARN: Code duplicated, block: B:45:0x012f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0133  */
    /* JADX WARN: Code duplicated, block: B:52:0x0140 A[Catch: all -> 0x014a, TRY_LEAVE, TryCatch #5 {all -> 0x014a, blocks: (B:50:0x013c, B:52:0x0140), top: B:175:0x013c }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0151  */
    /* JADX WARN: Code duplicated, block: B:64:0x0173  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ae A[Catch: all -> 0x0249, TryCatch #4 {all -> 0x0249, blocks: (B:68:0x01aa, B:70:0x01ae, B:72:0x01b5, B:74:0x01b9, B:80:0x01c6), top: B:173:0x01aa }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e9 A[Catch: all -> 0x01ed, TryCatch #8 {all -> 0x01ed, blocks: (B:65:0x0178, B:67:0x0181, B:83:0x01d7, B:85:0x01e3, B:87:0x01e9, B:105:0x021b, B:91:0x01f0, B:93:0x01f4, B:96:0x01fa), top: B:181:0x0178 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f0 A[Catch: all -> 0x01ed, TryCatch #8 {all -> 0x01ed, blocks: (B:65:0x0178, B:67:0x0181, B:83:0x01d7, B:85:0x01e3, B:87:0x01e9, B:105:0x021b, B:91:0x01f0, B:93:0x01f4, B:96:0x01fa), top: B:181:0x0178 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01f4 A[Catch: all -> 0x01ed, TryCatch #8 {all -> 0x01ed, blocks: (B:65:0x0178, B:67:0x0181, B:83:0x01d7, B:85:0x01e3, B:87:0x01e9, B:105:0x021b, B:91:0x01f0, B:93:0x01f4, B:96:0x01fa), top: B:181:0x0178 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fa A[Catch: all -> 0x01ed, TRY_LEAVE, TryCatch #8 {all -> 0x01ed, blocks: (B:65:0x0178, B:67:0x0181, B:83:0x01d7, B:85:0x01e3, B:87:0x01e9, B:105:0x021b, B:91:0x01f0, B:93:0x01f4, B:96:0x01fa), top: B:181:0x0178 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x020b  */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x00fb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x0112, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.String, java.util.List, p.bqz0, p.fq01, p.gvv, p.pm80] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List, p.fq01] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.String, java.util.List, p.fbk, p.fq01, p.pm80] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.String, java.util.List, p.fbk, p.fq01, p.gvv, p.pm80] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r5v5, types: [p.gwv] */
    /* JADX WARN: Type inference failed for: r6v10, types: [p.wqg1] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [p.awv] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v8, types: [p.scl0] */
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
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        jvv jvvVar;
        bqz0 bqz0Var2;
        yuk yukVar;
        ?? r13;
        gvv gvvVar;
        List list;
        pm80 pm80Var;
        int i;
        fq01 fq01Var;
        boolean z;
        gvv gvvVar2;
        fq01 fq01Var2;
        List list2;
        int i2;
        dwv dwvVar;
        String str;
        gvv gvvVar3;
        yuk yukVar2;
        int i3;
        ?? r5;
        dwv dwvVar2;
        String str2;
        ?? r8;
        Object objMo45982a;
        String str3;
        pm80 pm80Var2;
        int i4;
        ?? r14;
        bqz0 bqz0Var3;
        dwv dwvVar3;
        ?? scl0Var;
        ?? r6;
        ?? r7;
        l7l s0cVar;
        v401 v401VarM94361X;
        awv awvVar;
        jvv jvvVar2;
        mrp0 mrp0Var;
        Object c6x0Var;
        ?? r15;
        Throwable thM77348a;
        boolean z2;
        ?? r4;
        v2r v2rVar;
        int i5;
        dwv dwvVar4;
        z0r z0rVar;
        Throwable thM77348a2;
        hpg1 a3rVar;
        acr0 acr0Var;
        fiz nzx0Var;
        ?? r16;
        xpt xptVar;
        ?? r17;
        if (ibkVar instanceof jvv) {
            jvvVar = (jvv) ibkVar;
            int i6 = jvvVar.f116494b;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                jvvVar.f116494b = i6 - Integer.MIN_VALUE;
            } else {
                jvvVar = new jvv(this, ibkVar);
            }
        } else {
            jvvVar = new jvv(this, ibkVar);
        }
        jvv jvvVar3 = jvvVar;
        Object objM26511t = jvvVar3.f116493a;
        int i7 = jvvVar3.f116494b;
        yuk yukVar3 = yuk.f276404a;
        try {
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int i8 = jvvVar3.f116492X;
                        int i9 = jvvVar3.f116502t;
                        str3 = jvvVar3.f116501i;
                        pm80Var2 = jvvVar3.f116500h;
                        gvv gvvVar4 = jvvVar3.f116497e;
                        bqz0Var2 = jvvVar3.f116496d;
                        try {
                            bga.m29073P(objM26511t);
                            i4 = i8;
                            gvvVar3 = gvvVar4;
                            yukVar = yukVar3;
                            i3 = i9;
                            r13 = 0;
                            try {
                                ho01 ho01Var = (ho01) objM26511t;
                                z0r z0rVar2 = gvvVar3.f84841d;
                                try {
                                    dwvVar3 = gvvVar3.f84840c;
                                    gs3 gs3Var = new gs3(this.f126967d, gvvVar3, r13, 28);
                                    jn8 jn8Var = new jn8(pm80Var2, r13, 2);
                                    String str4 = "State[" + str3 + "], ShareData=[" + ho01Var + "]";
                                    try {
                                        if ((dwvVar3 instanceof awv) || (mrp0Var = ((awv) dwvVar3).f20711e) == null) {
                                            scl0Var = r13;
                                        } else {
                                            if ((mrp0Var instanceof krp0) && ((krp0) mrp0Var).f125705d) {
                                                scl0Var = new scl0(dwvVar3.mo27345c().f213201a.f201918a.f136946a);
                                            } else {
                                                scl0Var = r13;
                                            }
                                        }
                                        Set set = zw81.f286946a;
                                        if (zw81.m97114a(dwvVar3.mo27345c().f213201a.f201918a.f136946a)) {
                                            s0cVar = r0c.f194427e;
                                        } else {
                                            if (dwvVar3 instanceof awv) {
                                                awvVar = (awv) dwvVar3;
                                            } else {
                                                r6 = r13;
                                            }
                                            if (r6 != 0) {
                                                v401VarM94361X = yqg1.m94361X(r6.f20712f, r6.m27347j(), r6.f20707a.f213202b.f154746c);
                                            } else {
                                                r7 = r13;
                                            }
                                            if (r7 != 0) {
                                                r6 = awvVar;
                                                r6 = awvVar;
                                                r7 = v401VarM94361X;
                                                s0cVar = new s0c(r7);
                                            } else {
                                                r6 = awvVar;
                                                r6 = awvVar;
                                                r7 = v401VarM94361X;
                                                s0cVar = t0c.f215839e;
                                            }
                                        }
                                        l7l l7lVar = s0cVar;
                                        jvvVar3.f116496d = bqz0Var2;
                                        jvvVar3.f116497e = gvvVar3;
                                        jvvVar3.f116498f = r13;
                                        jvvVar3.f116499g = r13;
                                        jvvVar3.f116500h = r13;
                                        jvvVar3.f116501i = r13;
                                        jvvVar3.f116502t = i3;
                                        jvvVar3.f116492X = i4;
                                        jvvVar3.f116494b = 3;
                                        jvvVar2 = jvvVar3;
                                        ?? r9 = scl0Var;
                                        yukVar2 = yukVar;
                                        try {
                                            objM26511t = ang1.m26511t(z0rVar2, ho01Var, gs3Var, jn8Var, str4, r9, l7lVar, jvvVar2);
                                            jvvVar3 = jvvVar2;
                                            if (objM26511t == yukVar2) {
                                                return yukVar2;
                                            }
                                            bqz0Var3 = bqz0Var2;
                                            r14 = r13;
                                            c6x0Var = (v2r) objM26511t;
                                            r15 = r14;
                                            thM77348a = s6x0.m77348a(c6x0Var);
                                            if (thM77348a == null) {
                                            }
                                            z2 = c6x0Var instanceof c6x0;
                                            if (z2) {
                                                r4 = r15;
                                            } else {
                                                r4 = c6x0Var;
                                            }
                                            v2rVar = (v2r) r4;
                                            if (v2rVar == null) {
                                                i5 = 0;
                                            } else {
                                                i5 = 0;
                                            }
                                            dwvVar4 = gvvVar3.f84840c;
                                            z0rVar = gvvVar3.f84841d;
                                            if (dwvVar4 instanceof cwv) {
                                            }
                                            if (z2) {
                                                thM77348a2 = s6x0.m77348a(c6x0Var);
                                                if (thM77348a2 == null) {
                                                    thM77348a2 = new IllegalStateException("Failed to collect share data");
                                                }
                                                a3rVar = new a3r(gvvVar3.f84840c.mo27345c().f213201a.f201918a.f136946a, z0rVar.mo89604c(), thM77348a2, z0rVar.mo89605g());
                                            } else {
                                                bga.m29073P(c6x0Var);
                                                a3rVar = new b3r((v2r) c6x0Var);
                                            }
                                            acr0Var = new acr0(a3rVar);
                                            jvvVar3.f116496d = bqz0Var3;
                                            jvvVar3.f116497e = r15;
                                            jvvVar3.f116498f = r15;
                                            jvvVar3.f116499g = r15;
                                            jvvVar3.f116500h = r15;
                                            jvvVar3.f116501i = r15;
                                            jvvVar3.f116502t = i3;
                                            jvvVar3.f116492X = i5;
                                            jvvVar3.f116494b = 4;
                                            r17 = r15;
                                            if (this.f126965b.m60397a(acr0Var, jvvVar3) == yukVar2) {
                                                return yukVar2;
                                            }
                                            nzx0Var = gau.f78095a;
                                            r16 = r17;
                                            xptVar = new xpt(bqz0Var3, 1);
                                            jvvVar3.f116496d = r16;
                                            jvvVar3.f116497e = r16;
                                            jvvVar3.f116498f = r16;
                                            jvvVar3.f116499g = r16;
                                            jvvVar3.f116500h = r16;
                                            jvvVar3.f116501i = r16;
                                            jvvVar3.f116494b = 5;
                                            if (nzx0Var.collect(xptVar, jvvVar3) == yukVar2) {
                                                return yukVar2;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            jvvVar3 = jvvVar2;
                                            r14 = r13;
                                            bqz0Var3 = bqz0Var2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        yukVar2 = yukVar;
                                        r14 = r13;
                                        bqz0Var3 = bqz0Var2;
                                        c6x0Var = new c6x0(th);
                                        r15 = r14;
                                        thM77348a = s6x0.m77348a(c6x0Var);
                                        if (thM77348a == null) {
                                        }
                                        z2 = c6x0Var instanceof c6x0;
                                        if (z2) {
                                            r4 = r15;
                                        } else {
                                            r4 = c6x0Var;
                                        }
                                        v2rVar = (v2r) r4;
                                        if (v2rVar == null) {
                                            i5 = 0;
                                        } else {
                                            i5 = 0;
                                        }
                                        dwvVar4 = gvvVar3.f84840c;
                                        z0rVar = gvvVar3.f84841d;
                                        if (dwvVar4 instanceof cwv) {
                                        }
                                        if (z2) {
                                            bga.m29073P(c6x0Var);
                                            a3rVar = new b3r((v2r) c6x0Var);
                                        } else {
                                            thM77348a2 = s6x0.m77348a(c6x0Var);
                                            if (thM77348a2 == null) {
                                                thM77348a2 = new IllegalStateException("Failed to collect share data");
                                            }
                                            a3rVar = new a3r(gvvVar3.f84840c.mo27345c().f213201a.f201918a.f136946a, z0rVar.mo89604c(), thM77348a2, z0rVar.mo89605g());
                                        }
                                        acr0Var = new acr0(a3rVar);
                                        jvvVar3.f116496d = bqz0Var3;
                                        jvvVar3.f116497e = r15;
                                        jvvVar3.f116498f = r15;
                                        jvvVar3.f116499g = r15;
                                        jvvVar3.f116500h = r15;
                                        jvvVar3.f116501i = r15;
                                        jvvVar3.f116502t = i3;
                                        jvvVar3.f116492X = i5;
                                        jvvVar3.f116494b = 4;
                                        r17 = r15;
                                        if (this.f126965b.m60397a(acr0Var, jvvVar3) == yukVar2) {
                                            return yukVar2;
                                        }
                                        nzx0Var = gau.f78095a;
                                        r16 = r17;
                                        xptVar = new xpt(bqz0Var3, 1);
                                        jvvVar3.f116496d = r16;
                                        jvvVar3.f116497e = r16;
                                        jvvVar3.f116498f = r16;
                                        jvvVar3.f116499g = r16;
                                        jvvVar3.f116500h = r16;
                                        jvvVar3.f116501i = r16;
                                        jvvVar3.f116494b = 5;
                                        if (nzx0Var.collect(xptVar, jvvVar3) == yukVar2) {
                                            return yukVar2;
                                        }
                                        return w2a1.f247311a;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            gvvVar3 = gvvVar4;
                            yukVar2 = yukVar3;
                            i3 = i9;
                            bqz0Var3 = bqz0Var2;
                            r14 = 0;
                        }
                    } else if (i7 == 3) {
                        int i10 = jvvVar3.f116502t;
                        gvv gvvVar5 = jvvVar3.f116497e;
                        bqz0Var3 = jvvVar3.f116496d;
                        try {
                            bga.m29073P(objM26511t);
                            gvvVar3 = gvvVar5;
                            r14 = 0;
                            i3 = i10;
                            yukVar2 = yukVar3;
                            try {
                                c6x0Var = (v2r) objM26511t;
                                r15 = r14;
                            } catch (Throwable th6) {
                                th = th6;
                                c6x0Var = new c6x0(th);
                                r15 = r14;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            gvvVar3 = gvvVar5;
                            r14 = 0;
                            i3 = i10;
                            yukVar2 = yukVar3;
                        }
                        thM77348a = s6x0.m77348a(c6x0Var);
                        if (thM77348a == null && !(thM77348a instanceof TimeoutCancellationException) && (thM77348a instanceof CancellationException)) {
                            throw thM77348a;
                        }
                        z2 = c6x0Var instanceof c6x0;
                        if (z2) {
                            r4 = r15;
                        } else {
                            r4 = c6x0Var;
                        }
                        v2rVar = (v2r) r4;
                        if (v2rVar == null && v2rVar.mo79932a() == null) {
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        dwvVar4 = gvvVar3.f84840c;
                        z0rVar = gvvVar3.f84841d;
                        if ((dwvVar4 instanceof cwv) || i5 == 0 || gvvVar3.f84844g >= 10) {
                            if (z2) {
                                bga.m29073P(c6x0Var);
                                a3rVar = new b3r((v2r) c6x0Var);
                            } else {
                                thM77348a2 = s6x0.m77348a(c6x0Var);
                                if (thM77348a2 == null) {
                                    thM77348a2 = new IllegalStateException("Failed to collect share data");
                                }
                                a3rVar = new a3r(gvvVar3.f84840c.mo27345c().f213201a.f201918a.f136946a, z0rVar.mo89604c(), thM77348a2, z0rVar.mo89605g());
                            }
                            acr0Var = new acr0(a3rVar);
                            jvvVar3.f116496d = bqz0Var3;
                            jvvVar3.f116497e = r15;
                            jvvVar3.f116498f = r15;
                            jvvVar3.f116499g = r15;
                            jvvVar3.f116500h = r15;
                            jvvVar3.f116501i = r15;
                            jvvVar3.f116502t = i3;
                            jvvVar3.f116492X = i5;
                            jvvVar3.f116494b = 4;
                            r17 = r15;
                            if (this.f126965b.m60397a(acr0Var, jvvVar3) == yukVar2) {
                                return yukVar2;
                            }
                            nzx0Var = gau.f78095a;
                            r16 = r17;
                        } else {
                            nzx0Var = new nzx0(new lzr(gvvVar3, r15, 25));
                            r16 = r15;
                        }
                        xptVar = new xpt(bqz0Var3, 1);
                        jvvVar3.f116496d = r16;
                        jvvVar3.f116497e = r16;
                        jvvVar3.f116498f = r16;
                        jvvVar3.f116499g = r16;
                        jvvVar3.f116500h = r16;
                        jvvVar3.f116501i = r16;
                        jvvVar3.f116494b = 5;
                        if (nzx0Var.collect(xptVar, jvvVar3) == yukVar2) {
                            return yukVar2;
                        }
                    } else if (i7 == 4) {
                        bqz0 bqz0Var4 = jvvVar3.f116496d;
                        bga.m29073P(objM26511t);
                        bqz0Var3 = bqz0Var4;
                        yukVar2 = yukVar3;
                        r17 = 0;
                        nzx0Var = gau.f78095a;
                        r16 = r17;
                        xptVar = new xpt(bqz0Var3, 1);
                        jvvVar3.f116496d = r16;
                        jvvVar3.f116497e = r16;
                        jvvVar3.f116498f = r16;
                        jvvVar3.f116499g = r16;
                        jvvVar3.f116500h = r16;
                        jvvVar3.f116501i = r16;
                        jvvVar3.f116494b = 5;
                        if (nzx0Var.collect(xptVar, jvvVar3) == yukVar2) {
                            return yukVar2;
                        }
                    } else {
                        if (i7 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(objM26511t);
                    }
                    c6x0Var = new c6x0(th);
                    r15 = r14;
                    thM77348a = s6x0.m77348a(c6x0Var);
                    if (thM77348a == null) {
                    }
                    z2 = c6x0Var instanceof c6x0;
                    if (z2) {
                        r4 = r15;
                    } else {
                        r4 = c6x0Var;
                    }
                    v2rVar = (v2r) r4;
                    if (v2rVar == null) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                    }
                    dwvVar4 = gvvVar3.f84840c;
                    z0rVar = gvvVar3.f84841d;
                    if (dwvVar4 instanceof cwv) {
                    }
                    if (z2) {
                        bga.m29073P(c6x0Var);
                        a3rVar = new b3r((v2r) c6x0Var);
                    } else {
                        thM77348a2 = s6x0.m77348a(c6x0Var);
                        if (thM77348a2 == null) {
                            thM77348a2 = new IllegalStateException("Failed to collect share data");
                        }
                        a3rVar = new a3r(gvvVar3.f84840c.mo27345c().f213201a.f201918a.f136946a, z0rVar.mo89604c(), thM77348a2, z0rVar.mo89605g());
                    }
                    acr0Var = new acr0(a3rVar);
                    jvvVar3.f116496d = bqz0Var3;
                    jvvVar3.f116497e = r15;
                    jvvVar3.f116498f = r15;
                    jvvVar3.f116499g = r15;
                    jvvVar3.f116500h = r15;
                    jvvVar3.f116501i = r15;
                    jvvVar3.f116502t = i3;
                    jvvVar3.f116492X = i5;
                    jvvVar3.f116494b = 4;
                    r17 = r15;
                    if (this.f126965b.m60397a(acr0Var, jvvVar3) == yukVar2) {
                        return yukVar2;
                    }
                    nzx0Var = gau.f78095a;
                    r16 = r17;
                    xptVar = new xpt(bqz0Var3, 1);
                    jvvVar3.f116496d = r16;
                    jvvVar3.f116497e = r16;
                    jvvVar3.f116498f = r16;
                    jvvVar3.f116499g = r16;
                    jvvVar3.f116500h = r16;
                    jvvVar3.f116501i = r16;
                    jvvVar3.f116494b = 5;
                    if (nzx0Var.collect(xptVar, jvvVar3) == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    int i11 = jvvVar3.f116502t;
                    list2 = jvvVar3.f116499g;
                    fq01Var2 = jvvVar3.f116498f;
                    gvvVar2 = jvvVar3.f116497e;
                    bqz0 bqz0Var5 = jvvVar3.f116496d;
                    bga.m29073P(objM26511t);
                    i2 = i11;
                    yukVar = yukVar3;
                    bqz0Var2 = bqz0Var5;
                    z = false;
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM26511t);
            gvv gvvVar6 = (gvv) obj;
            fq01 fq01VarMo89604c = gvvVar6.f84841d.mo89604c();
            List listM43728j1 = g6f.m43728j1(gvvVar6.f84841d.mo89606h());
            dwv dwvVar5 = gvvVar6.f84840c;
            if (!(dwvVar5 instanceof awv)) {
                bqz0Var2 = bqz0Var;
                yukVar = yukVar3;
                r13 = 0;
                gvvVar = gvvVar6;
                list = listM43728j1;
                pm80Var = null;
                i = 0;
                fq01Var = fq01VarMo89604c;
                dwvVar = gvvVar.f84840c;
                if (dwvVar instanceof awv) {
                    str = "Loaded: " + ((awv) dwvVar).f20712f;
                } else if (dwvVar instanceof yvv) {
                    yvv yvvVar = (yvv) dwvVar;
                    str = "Error: " + yvvVar.f276778e + ", " + yvvVar.f276779f;
                } else {
                    if (dwvVar instanceof cwv) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "Loading";
                }
                r5 = this.f126966c;
                dwvVar2 = gvvVar.f84840c;
                if (pm80Var == null) {
                    try {
                        str2 = pm80Var.f178974a;
                        if (str2 != null) {
                            r8 = Uri.parse(str2);
                        } else {
                            r8 = r13;
                        }
                        jvvVar3.f116496d = bqz0Var2;
                        jvvVar3.f116497e = gvvVar;
                        jvvVar3.f116498f = r13;
                        jvvVar3.f116499g = r13;
                        jvvVar3.f116500h = pm80Var;
                        jvvVar3.f116501i = str;
                        jvvVar3.f116502t = i;
                        jvvVar3.f116492X = 0;
                        jvvVar3.f116494b = 2;
                        gvvVar3 = gvvVar;
                        try {
                            objMo45982a = r5.mo45982a(dwvVar2, fq01Var, list, r8, jvvVar3);
                            if (objMo45982a != yukVar) {
                                str3 = str;
                                i3 = i;
                                pm80Var2 = pm80Var;
                                objM26511t = objMo45982a;
                                i4 = 0;
                                r13 = r13;
                                ho01 ho01Var2 = (ho01) objM26511t;
                                z0r z0rVar3 = gvvVar3.f84841d;
                                dwvVar3 = gvvVar3.f84840c;
                                gs3 gs3Var2 = new gs3(this.f126967d, gvvVar3, r13, 28);
                                jn8 jn8Var2 = new jn8(pm80Var2, r13, 2);
                                String str5 = "State[" + str3 + "], ShareData=[" + ho01Var2 + "]";
                                if (dwvVar3 instanceof awv) {
                                    scl0Var = r13;
                                } else {
                                    scl0Var = r13;
                                }
                                Set set2 = zw81.f286946a;
                                if (zw81.m97114a(dwvVar3.mo27345c().f213201a.f201918a.f136946a)) {
                                    s0cVar = r0c.f194427e;
                                } else {
                                    if (dwvVar3 instanceof awv) {
                                        awvVar = (awv) dwvVar3;
                                    } else {
                                        r6 = r13;
                                    }
                                    if (r6 != 0) {
                                        v401VarM94361X = yqg1.m94361X(r6.f20712f, r6.m27347j(), r6.f20707a.f213202b.f154746c);
                                    } else {
                                        r7 = r13;
                                    }
                                    if (r7 != 0) {
                                        r6 = awvVar;
                                        r6 = awvVar;
                                        r7 = v401VarM94361X;
                                        s0cVar = new s0c(r7);
                                    } else {
                                        r6 = awvVar;
                                        r6 = awvVar;
                                        r7 = v401VarM94361X;
                                        s0cVar = t0c.f215839e;
                                    }
                                }
                                l7l l7lVar2 = s0cVar;
                                jvvVar3.f116496d = bqz0Var2;
                                jvvVar3.f116497e = gvvVar3;
                                jvvVar3.f116498f = r13;
                                jvvVar3.f116499g = r13;
                                jvvVar3.f116500h = r13;
                                jvvVar3.f116501i = r13;
                                jvvVar3.f116502t = i3;
                                jvvVar3.f116492X = i4;
                                jvvVar3.f116494b = 3;
                                jvvVar2 = jvvVar3;
                                ?? r10 = scl0Var;
                                yukVar2 = yukVar;
                                objM26511t = ang1.m26511t(z0rVar3, ho01Var2, gs3Var2, jn8Var2, str5, r10, l7lVar2, jvvVar2);
                                jvvVar3 = jvvVar2;
                                if (objM26511t == yukVar2) {
                                    return yukVar2;
                                }
                                bqz0Var3 = bqz0Var2;
                                r14 = r13;
                                c6x0Var = (v2r) objM26511t;
                                r15 = r14;
                                thM77348a = s6x0.m77348a(c6x0Var);
                                if (thM77348a == null) {
                                }
                                z2 = c6x0Var instanceof c6x0;
                                if (z2) {
                                    r4 = r15;
                                } else {
                                    r4 = c6x0Var;
                                }
                                v2rVar = (v2r) r4;
                                if (v2rVar == null) {
                                    i5 = 0;
                                } else {
                                    i5 = 0;
                                }
                                dwvVar4 = gvvVar3.f84840c;
                                z0rVar = gvvVar3.f84841d;
                                if (dwvVar4 instanceof cwv) {
                                }
                                if (z2) {
                                    bga.m29073P(c6x0Var);
                                    a3rVar = new b3r((v2r) c6x0Var);
                                } else {
                                    thM77348a2 = s6x0.m77348a(c6x0Var);
                                    if (thM77348a2 == null) {
                                        thM77348a2 = new IllegalStateException("Failed to collect share data");
                                    }
                                    a3rVar = new a3r(gvvVar3.f84840c.mo27345c().f213201a.f201918a.f136946a, z0rVar.mo89604c(), thM77348a2, z0rVar.mo89605g());
                                }
                                acr0Var = new acr0(a3rVar);
                                jvvVar3.f116496d = bqz0Var3;
                                jvvVar3.f116497e = r15;
                                jvvVar3.f116498f = r15;
                                jvvVar3.f116499g = r15;
                                jvvVar3.f116500h = r15;
                                jvvVar3.f116501i = r15;
                                jvvVar3.f116502t = i3;
                                jvvVar3.f116492X = i5;
                                jvvVar3.f116494b = 4;
                                r17 = r15;
                                if (this.f126965b.m60397a(acr0Var, jvvVar3) == yukVar2) {
                                    return yukVar2;
                                }
                                nzx0Var = gau.f78095a;
                                r16 = r17;
                                xptVar = new xpt(bqz0Var3, 1);
                                jvvVar3.f116496d = r16;
                                jvvVar3.f116497e = r16;
                                jvvVar3.f116498f = r16;
                                jvvVar3.f116499g = r16;
                                jvvVar3.f116500h = r16;
                                jvvVar3.f116501i = r16;
                                jvvVar3.f116494b = 5;
                                if (nzx0Var.collect(xptVar, jvvVar3) == yukVar2) {
                                    return yukVar2;
                                }
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            yukVar2 = yukVar;
                            i3 = i;
                            r14 = r13;
                            bqz0Var3 = bqz0Var2;
                            c6x0Var = new c6x0(th);
                            r15 = r14;
                            thM77348a = s6x0.m77348a(c6x0Var);
                            if (thM77348a == null) {
                            }
                            z2 = c6x0Var instanceof c6x0;
                            if (z2) {
                                r4 = r15;
                            } else {
                                r4 = c6x0Var;
                            }
                            v2rVar = (v2r) r4;
                            if (v2rVar == null) {
                                i5 = 0;
                            } else {
                                i5 = 0;
                            }
                            dwvVar4 = gvvVar3.f84840c;
                            z0rVar = gvvVar3.f84841d;
                            if (dwvVar4 instanceof cwv) {
                            }
                            if (z2) {
                                bga.m29073P(c6x0Var);
                                a3rVar = new b3r((v2r) c6x0Var);
                            } else {
                                thM77348a2 = s6x0.m77348a(c6x0Var);
                                if (thM77348a2 == null) {
                                    thM77348a2 = new IllegalStateException("Failed to collect share data");
                                }
                                a3rVar = new a3r(gvvVar3.f84840c.mo27345c().f213201a.f201918a.f136946a, z0rVar.mo89604c(), thM77348a2, z0rVar.mo89605g());
                            }
                            acr0Var = new acr0(a3rVar);
                            jvvVar3.f116496d = bqz0Var3;
                            jvvVar3.f116497e = r15;
                            jvvVar3.f116498f = r15;
                            jvvVar3.f116499g = r15;
                            jvvVar3.f116500h = r15;
                            jvvVar3.f116501i = r15;
                            jvvVar3.f116502t = i3;
                            jvvVar3.f116492X = i5;
                            jvvVar3.f116494b = 4;
                            r17 = r15;
                            if (this.f126965b.m60397a(acr0Var, jvvVar3) == yukVar2) {
                                return yukVar2;
                            }
                            nzx0Var = gau.f78095a;
                            r16 = r17;
                            xptVar = new xpt(bqz0Var3, 1);
                            jvvVar3.f116496d = r16;
                            jvvVar3.f116497e = r16;
                            jvvVar3.f116498f = r16;
                            jvvVar3.f116499g = r16;
                            jvvVar3.f116500h = r16;
                            jvvVar3.f116501i = r16;
                            jvvVar3.f116494b = 5;
                            if (nzx0Var.collect(xptVar, jvvVar3) == yukVar2) {
                                return yukVar2;
                            }
                            return w2a1.f247311a;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        gvvVar3 = gvvVar;
                        i3 = i;
                        yukVar2 = yukVar;
                        r14 = r13;
                        bqz0Var3 = bqz0Var2;
                        c6x0Var = new c6x0(th);
                        r15 = r14;
                        thM77348a = s6x0.m77348a(c6x0Var);
                        if (thM77348a == null) {
                        }
                        z2 = c6x0Var instanceof c6x0;
                        if (z2) {
                            r4 = r15;
                        } else {
                            r4 = c6x0Var;
                        }
                        v2rVar = (v2r) r4;
                        if (v2rVar == null) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                        }
                        dwvVar4 = gvvVar3.f84840c;
                        z0rVar = gvvVar3.f84841d;
                        if (dwvVar4 instanceof cwv) {
                        }
                        if (z2) {
                            bga.m29073P(c6x0Var);
                            a3rVar = new b3r((v2r) c6x0Var);
                        } else {
                            thM77348a2 = s6x0.m77348a(c6x0Var);
                            if (thM77348a2 == null) {
                                thM77348a2 = new IllegalStateException("Failed to collect share data");
                            }
                            a3rVar = new a3r(gvvVar3.f84840c.mo27345c().f213201a.f201918a.f136946a, z0rVar.mo89604c(), thM77348a2, z0rVar.mo89605g());
                        }
                        acr0Var = new acr0(a3rVar);
                        jvvVar3.f116496d = bqz0Var3;
                        jvvVar3.f116497e = r15;
                        jvvVar3.f116498f = r15;
                        jvvVar3.f116499g = r15;
                        jvvVar3.f116500h = r15;
                        jvvVar3.f116501i = r15;
                        jvvVar3.f116502t = i3;
                        jvvVar3.f116492X = i5;
                        jvvVar3.f116494b = 4;
                        r17 = r15;
                        if (this.f126965b.m60397a(acr0Var, jvvVar3) == yukVar2) {
                            return yukVar2;
                        }
                        nzx0Var = gau.f78095a;
                        r16 = r17;
                        xptVar = new xpt(bqz0Var3, 1);
                        jvvVar3.f116496d = r16;
                        jvvVar3.f116497e = r16;
                        jvvVar3.f116498f = r16;
                        jvvVar3.f116499g = r16;
                        jvvVar3.f116500h = r16;
                        jvvVar3.f116501i = r16;
                        jvvVar3.f116494b = 5;
                        if (nzx0Var.collect(xptVar, jvvVar3) == yukVar2) {
                            return yukVar2;
                        }
                        return w2a1.f247311a;
                    }
                } else {
                    r8 = r13;
                    jvvVar3.f116496d = bqz0Var2;
                    jvvVar3.f116497e = gvvVar;
                    jvvVar3.f116498f = r13;
                    jvvVar3.f116499g = r13;
                    jvvVar3.f116500h = pm80Var;
                    jvvVar3.f116501i = str;
                    jvvVar3.f116502t = i;
                    jvvVar3.f116492X = 0;
                    jvvVar3.f116494b = 2;
                    gvvVar3 = gvvVar;
                    objMo45982a = r5.mo45982a(dwvVar2, fq01Var, list, r8, jvvVar3);
                    if (objMo45982a != yukVar) {
                        str3 = str;
                        i3 = i;
                        pm80Var2 = pm80Var;
                        objM26511t = objMo45982a;
                        i4 = 0;
                        r13 = r13;
                        ho01 ho01Var3 = (ho01) objM26511t;
                        z0r z0rVar4 = gvvVar3.f84841d;
                        dwvVar3 = gvvVar3.f84840c;
                        gs3 gs3Var3 = new gs3(this.f126967d, gvvVar3, r13, 28);
                        jn8 jn8Var3 = new jn8(pm80Var2, r13, 2);
                        String str6 = "State[" + str3 + "], ShareData=[" + ho01Var3 + "]";
                        if (dwvVar3 instanceof awv) {
                            scl0Var = r13;
                        } else {
                            scl0Var = r13;
                        }
                        Set set3 = zw81.f286946a;
                        if (zw81.m97114a(dwvVar3.mo27345c().f213201a.f201918a.f136946a)) {
                            s0cVar = r0c.f194427e;
                        } else {
                            if (dwvVar3 instanceof awv) {
                                awvVar = (awv) dwvVar3;
                            } else {
                                r6 = r13;
                            }
                            if (r6 != 0) {
                                v401VarM94361X = yqg1.m94361X(r6.f20712f, r6.m27347j(), r6.f20707a.f213202b.f154746c);
                            } else {
                                r7 = r13;
                            }
                            if (r7 != 0) {
                                r6 = awvVar;
                                r6 = awvVar;
                                r7 = v401VarM94361X;
                                s0cVar = new s0c(r7);
                            } else {
                                r6 = awvVar;
                                r6 = awvVar;
                                r7 = v401VarM94361X;
                                s0cVar = t0c.f215839e;
                            }
                        }
                        l7l l7lVar3 = s0cVar;
                        jvvVar3.f116496d = bqz0Var2;
                        jvvVar3.f116497e = gvvVar3;
                        jvvVar3.f116498f = r13;
                        jvvVar3.f116499g = r13;
                        jvvVar3.f116500h = r13;
                        jvvVar3.f116501i = r13;
                        jvvVar3.f116502t = i3;
                        jvvVar3.f116492X = i4;
                        jvvVar3.f116494b = 3;
                        jvvVar2 = jvvVar3;
                        ?? r11 = scl0Var;
                        yukVar2 = yukVar;
                        objM26511t = ang1.m26511t(z0rVar4, ho01Var3, gs3Var3, jn8Var3, str6, r11, l7lVar3, jvvVar2);
                        jvvVar3 = jvvVar2;
                        if (objM26511t == yukVar2) {
                            return yukVar2;
                        }
                        bqz0Var3 = bqz0Var2;
                        r14 = r13;
                        c6x0Var = (v2r) objM26511t;
                        r15 = r14;
                        thM77348a = s6x0.m77348a(c6x0Var);
                        if (thM77348a == null) {
                        }
                        z2 = c6x0Var instanceof c6x0;
                        if (z2) {
                            r4 = r15;
                        } else {
                            r4 = c6x0Var;
                        }
                        v2rVar = (v2r) r4;
                        if (v2rVar == null) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                        }
                        dwvVar4 = gvvVar3.f84840c;
                        z0rVar = gvvVar3.f84841d;
                        if (dwvVar4 instanceof cwv) {
                        }
                        if (z2) {
                            bga.m29073P(c6x0Var);
                            a3rVar = new b3r((v2r) c6x0Var);
                        } else {
                            thM77348a2 = s6x0.m77348a(c6x0Var);
                            if (thM77348a2 == null) {
                                thM77348a2 = new IllegalStateException("Failed to collect share data");
                            }
                            a3rVar = new a3r(gvvVar3.f84840c.mo27345c().f213201a.f201918a.f136946a, z0rVar.mo89604c(), thM77348a2, z0rVar.mo89605g());
                        }
                        acr0Var = new acr0(a3rVar);
                        jvvVar3.f116496d = bqz0Var3;
                        jvvVar3.f116497e = r15;
                        jvvVar3.f116498f = r15;
                        jvvVar3.f116499g = r15;
                        jvvVar3.f116500h = r15;
                        jvvVar3.f116501i = r15;
                        jvvVar3.f116502t = i3;
                        jvvVar3.f116492X = i5;
                        jvvVar3.f116494b = 4;
                        r17 = r15;
                        if (this.f126965b.m60397a(acr0Var, jvvVar3) == yukVar2) {
                            return yukVar2;
                        }
                        nzx0Var = gau.f78095a;
                        r16 = r17;
                        xptVar = new xpt(bqz0Var3, 1);
                        jvvVar3.f116496d = r16;
                        jvvVar3.f116497e = r16;
                        jvvVar3.f116498f = r16;
                        jvvVar3.f116499g = r16;
                        jvvVar3.f116500h = r16;
                        jvvVar3.f116501i = r16;
                        jvvVar3.f116494b = 5;
                        if (nzx0Var.collect(xptVar, jvvVar3) == yukVar2) {
                            return yukVar2;
                        }
                    }
                }
                return w2a1.f247311a;
            }
            Uri uri = gvvVar6.f84842e;
            Uri uri2 = gvvVar6.f84843f;
            bqz0Var2 = bqz0Var;
            jvvVar3.f116496d = bqz0Var2;
            jvvVar3.f116497e = gvvVar6;
            jvvVar3.f116498f = fq01VarMo89604c;
            jvvVar3.f116499g = listM43728j1;
            jvvVar3.f116502t = 0;
            jvvVar3.f116494b = 1;
            yukVar = yukVar3;
            z = false;
            Object objM87995i = this.f126964a.m87995i(fq01VarMo89604c, listM43728j1, (awv) dwvVar5, uri, uri2, jvvVar3);
            if (objM87995i != yukVar) {
                jvvVar3 = jvvVar3;
                gvvVar2 = gvvVar6;
                objM26511t = objM87995i;
                fq01Var2 = fq01VarMo89604c;
                list2 = listM43728j1;
                i2 = 0;
            }
            jvvVar3 = jvvVar3;
            return yukVar;
            r5 = this.f126966c;
            dwvVar2 = gvvVar.f84840c;
            if (pm80Var == null) {
                r8 = r13;
                jvvVar3.f116496d = bqz0Var2;
                jvvVar3.f116497e = gvvVar;
                jvvVar3.f116498f = r13;
                jvvVar3.f116499g = r13;
                jvvVar3.f116500h = pm80Var;
                jvvVar3.f116501i = str;
                jvvVar3.f116502t = i;
                jvvVar3.f116492X = 0;
                jvvVar3.f116494b = 2;
                gvvVar3 = gvvVar;
                objMo45982a = r5.mo45982a(dwvVar2, fq01Var, list, r8, jvvVar3);
                if (objMo45982a != yukVar) {
                    str3 = str;
                    i3 = i;
                    pm80Var2 = pm80Var;
                    objM26511t = objMo45982a;
                    i4 = 0;
                    r13 = r13;
                    ho01 ho01Var4 = (ho01) objM26511t;
                    z0r z0rVar5 = gvvVar3.f84841d;
                    dwvVar3 = gvvVar3.f84840c;
                    gs3 gs3Var4 = new gs3(this.f126967d, gvvVar3, r13, 28);
                    jn8 jn8Var4 = new jn8(pm80Var2, r13, 2);
                    String str7 = "State[" + str3 + "], ShareData=[" + ho01Var4 + "]";
                    if (dwvVar3 instanceof awv) {
                        scl0Var = r13;
                    } else {
                        scl0Var = r13;
                    }
                    Set set4 = zw81.f286946a;
                    if (zw81.m97114a(dwvVar3.mo27345c().f213201a.f201918a.f136946a)) {
                        s0cVar = r0c.f194427e;
                    } else {
                        if (dwvVar3 instanceof awv) {
                            awvVar = (awv) dwvVar3;
                        } else {
                            r6 = r13;
                        }
                        if (r6 != 0) {
                            v401VarM94361X = yqg1.m94361X(r6.f20712f, r6.m27347j(), r6.f20707a.f213202b.f154746c);
                        } else {
                            r7 = r13;
                        }
                        if (r7 != 0) {
                            r6 = awvVar;
                            r6 = awvVar;
                            r7 = v401VarM94361X;
                            s0cVar = new s0c(r7);
                        } else {
                            r6 = awvVar;
                            r6 = awvVar;
                            r7 = v401VarM94361X;
                            s0cVar = t0c.f215839e;
                        }
                    }
                    l7l l7lVar4 = s0cVar;
                    jvvVar3.f116496d = bqz0Var2;
                    jvvVar3.f116497e = gvvVar3;
                    jvvVar3.f116498f = r13;
                    jvvVar3.f116499g = r13;
                    jvvVar3.f116500h = r13;
                    jvvVar3.f116501i = r13;
                    jvvVar3.f116502t = i3;
                    jvvVar3.f116492X = i4;
                    jvvVar3.f116494b = 3;
                    jvvVar2 = jvvVar3;
                    ?? r12 = scl0Var;
                    yukVar2 = yukVar;
                    objM26511t = ang1.m26511t(z0rVar5, ho01Var4, gs3Var4, jn8Var4, str7, r12, l7lVar4, jvvVar2);
                    jvvVar3 = jvvVar2;
                    if (objM26511t == yukVar2) {
                        return yukVar2;
                    }
                    bqz0Var3 = bqz0Var2;
                    r14 = r13;
                    c6x0Var = (v2r) objM26511t;
                    r15 = r14;
                    thM77348a = s6x0.m77348a(c6x0Var);
                    if (thM77348a == null) {
                    }
                    z2 = c6x0Var instanceof c6x0;
                    if (z2) {
                        r4 = r15;
                    } else {
                        r4 = c6x0Var;
                    }
                    v2rVar = (v2r) r4;
                    if (v2rVar == null) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                    }
                    dwvVar4 = gvvVar3.f84840c;
                    z0rVar = gvvVar3.f84841d;
                    if (dwvVar4 instanceof cwv) {
                    }
                    if (z2) {
                        bga.m29073P(c6x0Var);
                        a3rVar = new b3r((v2r) c6x0Var);
                    } else {
                        thM77348a2 = s6x0.m77348a(c6x0Var);
                        if (thM77348a2 == null) {
                            thM77348a2 = new IllegalStateException("Failed to collect share data");
                        }
                        a3rVar = new a3r(gvvVar3.f84840c.mo27345c().f213201a.f201918a.f136946a, z0rVar.mo89604c(), thM77348a2, z0rVar.mo89605g());
                    }
                    acr0Var = new acr0(a3rVar);
                    jvvVar3.f116496d = bqz0Var3;
                    jvvVar3.f116497e = r15;
                    jvvVar3.f116498f = r15;
                    jvvVar3.f116499g = r15;
                    jvvVar3.f116500h = r15;
                    jvvVar3.f116501i = r15;
                    jvvVar3.f116502t = i3;
                    jvvVar3.f116492X = i5;
                    jvvVar3.f116494b = 4;
                    r17 = r15;
                    if (this.f126965b.m60397a(acr0Var, jvvVar3) == yukVar2) {
                        return yukVar2;
                    }
                    nzx0Var = gau.f78095a;
                    r16 = r17;
                    xptVar = new xpt(bqz0Var3, 1);
                    jvvVar3.f116496d = r16;
                    jvvVar3.f116497e = r16;
                    jvvVar3.f116498f = r16;
                    jvvVar3.f116499g = r16;
                    jvvVar3.f116500h = r16;
                    jvvVar3.f116501i = r16;
                    jvvVar3.f116494b = 5;
                    if (nzx0Var.collect(xptVar, jvvVar3) == yukVar2) {
                        return yukVar2;
                    }
                }
                jvvVar3 = jvvVar3;
                return yukVar;
            }
            str2 = pm80Var.f178974a;
            if (str2 != null) {
                r8 = Uri.parse(str2);
            } else {
                r8 = r13;
            }
            jvvVar3.f116496d = bqz0Var2;
            jvvVar3.f116497e = gvvVar;
            jvvVar3.f116498f = r13;
            jvvVar3.f116499g = r13;
            jvvVar3.f116500h = pm80Var;
            jvvVar3.f116501i = str;
            jvvVar3.f116502t = i;
            jvvVar3.f116492X = 0;
            jvvVar3.f116494b = 2;
            gvvVar3 = gvvVar;
            objMo45982a = r5.mo45982a(dwvVar2, fq01Var, list, r8, jvvVar3);
            if (objMo45982a != yukVar) {
                str3 = str;
                i3 = i;
                pm80Var2 = pm80Var;
                objM26511t = objMo45982a;
                i4 = 0;
                r13 = r13;
                ho01 ho01Var5 = (ho01) objM26511t;
                z0r z0rVar6 = gvvVar3.f84841d;
                dwvVar3 = gvvVar3.f84840c;
                gs3 gs3Var5 = new gs3(this.f126967d, gvvVar3, r13, 28);
                jn8 jn8Var5 = new jn8(pm80Var2, r13, 2);
                String str8 = "State[" + str3 + "], ShareData=[" + ho01Var5 + "]";
                if (dwvVar3 instanceof awv) {
                    scl0Var = r13;
                } else {
                    scl0Var = r13;
                }
                Set set5 = zw81.f286946a;
                if (zw81.m97114a(dwvVar3.mo27345c().f213201a.f201918a.f136946a)) {
                    s0cVar = r0c.f194427e;
                } else {
                    if (dwvVar3 instanceof awv) {
                        awvVar = (awv) dwvVar3;
                    } else {
                        r6 = r13;
                    }
                    if (r6 != 0) {
                        v401VarM94361X = yqg1.m94361X(r6.f20712f, r6.m27347j(), r6.f20707a.f213202b.f154746c);
                    } else {
                        r7 = r13;
                    }
                    if (r7 != 0) {
                        r6 = awvVar;
                        r6 = awvVar;
                        r7 = v401VarM94361X;
                        s0cVar = new s0c(r7);
                    } else {
                        r6 = awvVar;
                        r6 = awvVar;
                        r7 = v401VarM94361X;
                        s0cVar = t0c.f215839e;
                    }
                }
                l7l l7lVar5 = s0cVar;
                jvvVar3.f116496d = bqz0Var2;
                jvvVar3.f116497e = gvvVar3;
                jvvVar3.f116498f = r13;
                jvvVar3.f116499g = r13;
                jvvVar3.f116500h = r13;
                jvvVar3.f116501i = r13;
                jvvVar3.f116502t = i3;
                jvvVar3.f116492X = i4;
                jvvVar3.f116494b = 3;
                jvvVar2 = jvvVar3;
                ?? r18 = scl0Var;
                yukVar2 = yukVar;
                objM26511t = ang1.m26511t(z0rVar6, ho01Var5, gs3Var5, jn8Var5, str8, r18, l7lVar5, jvvVar2);
                jvvVar3 = jvvVar2;
                if (objM26511t == yukVar2) {
                    return yukVar2;
                }
                bqz0Var3 = bqz0Var2;
                r14 = r13;
                c6x0Var = (v2r) objM26511t;
                r15 = r14;
                thM77348a = s6x0.m77348a(c6x0Var);
                if (thM77348a == null) {
                }
                z2 = c6x0Var instanceof c6x0;
                if (z2) {
                    r4 = r15;
                } else {
                    r4 = c6x0Var;
                }
                v2rVar = (v2r) r4;
                if (v2rVar == null) {
                    i5 = 0;
                } else {
                    i5 = 0;
                }
                dwvVar4 = gvvVar3.f84840c;
                z0rVar = gvvVar3.f84841d;
                if (dwvVar4 instanceof cwv) {
                }
                if (z2) {
                    bga.m29073P(c6x0Var);
                    a3rVar = new b3r((v2r) c6x0Var);
                } else {
                    thM77348a2 = s6x0.m77348a(c6x0Var);
                    if (thM77348a2 == null) {
                        thM77348a2 = new IllegalStateException("Failed to collect share data");
                    }
                    a3rVar = new a3r(gvvVar3.f84840c.mo27345c().f213201a.f201918a.f136946a, z0rVar.mo89604c(), thM77348a2, z0rVar.mo89605g());
                }
                acr0Var = new acr0(a3rVar);
                jvvVar3.f116496d = bqz0Var3;
                jvvVar3.f116497e = r15;
                jvvVar3.f116498f = r15;
                jvvVar3.f116499g = r15;
                jvvVar3.f116500h = r15;
                jvvVar3.f116501i = r15;
                jvvVar3.f116502t = i3;
                jvvVar3.f116492X = i5;
                jvvVar3.f116494b = 4;
                r17 = r15;
                if (this.f126965b.m60397a(acr0Var, jvvVar3) == yukVar2) {
                    return yukVar2;
                }
                nzx0Var = gau.f78095a;
                r16 = r17;
                xptVar = new xpt(bqz0Var3, 1);
                jvvVar3.f116496d = r16;
                jvvVar3.f116497e = r16;
                jvvVar3.f116498f = r16;
                jvvVar3.f116499g = r16;
                jvvVar3.f116500h = r16;
                jvvVar3.f116501i = r16;
                jvvVar3.f116494b = 5;
                if (nzx0Var.collect(xptVar, jvvVar3) == yukVar2) {
                    return yukVar2;
                }
            }
            jvvVar3 = jvvVar3;
            return yukVar;
        } catch (Throwable th10) {
            th = th10;
            gvvVar3 = gvvVar;
        }
        pm80Var = (pm80) objM26511t;
        i = i2;
        fq01Var = fq01Var2;
        gvvVar = gvvVar2;
        list = list2;
        r13 = z;
        dwvVar = gvvVar.f84840c;
        if (dwvVar instanceof awv) {
            str = "Loaded: " + ((awv) dwvVar).f20712f;
        } else if (dwvVar instanceof yvv) {
            yvv yvvVar2 = (yvv) dwvVar;
            str = "Error: " + yvvVar2.f276778e + ", " + yvvVar2.f276779f;
        } else {
            if (dwvVar instanceof cwv) {
                throw new NoWhenBranchMatchedException();
            }
            str = "Loading";
        }
        return w2a1.f247311a;
    }
}
