package p204p;

import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes8.dex */
public final class rki0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nha0 f200077a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ m011 f200078b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bzo f200079c;

    public rki0(nha0 nha0Var, m011 m011Var, bzo bzoVar) {
        this.f200077a = nha0Var;
        this.f200078b = m011Var;
        this.f200079c = bzoVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0240  */
    /* JADX WARN: Code duplicated, block: B:113:0x024e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0250  */
    /* JADX WARN: Code duplicated, block: B:117:0x0255  */
    /* JADX WARN: Code duplicated, block: B:119:0x025b  */
    /* JADX WARN: Code duplicated, block: B:120:0x025e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0263  */
    /* JADX WARN: Code duplicated, block: B:125:0x026c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x0287  */
    /* JADX WARN: Code duplicated, block: B:131:0x0292  */
    /* JADX WARN: Code duplicated, block: B:133:0x0298  */
    /* JADX WARN: Code duplicated, block: B:144:0x0302  */
    /* JADX WARN: Code duplicated, block: B:150:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:43:0x0106  */
    /* JADX WARN: Code duplicated, block: B:45:0x010a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0128  */
    /* JADX WARN: Code duplicated, block: B:48:0x012c  */
    /* JADX WARN: Code duplicated, block: B:55:0x013b  */
    /* JADX WARN: Code duplicated, block: B:58:0x014c A[Catch: all -> 0x0136, TRY_ENTER, TryCatch #2 {all -> 0x0136, blocks: (B:51:0x0132, B:58:0x014c, B:61:0x0152, B:64:0x015e, B:66:0x0162), top: B:150:0x0132 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x014f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0152 A[Catch: all -> 0x0136, TryCatch #2 {all -> 0x0136, blocks: (B:51:0x0132, B:58:0x014c, B:61:0x0152, B:64:0x015e, B:66:0x0162), top: B:150:0x0132 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x015a  */
    /* JADX WARN: Code duplicated, block: B:64:0x015e A[Catch: all -> 0x0136, TryCatch #2 {all -> 0x0136, blocks: (B:51:0x0132, B:58:0x014c, B:61:0x0152, B:64:0x015e, B:66:0x0162), top: B:150:0x0132 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0162 A[Catch: all -> 0x0136, TRY_LEAVE, TryCatch #2 {all -> 0x0136, blocks: (B:51:0x0132, B:58:0x014c, B:61:0x0152, B:64:0x015e, B:66:0x0162), top: B:150:0x0132 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x016c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0191  */
    /* JADX WARN: Code duplicated, block: B:74:0x0193  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d9 A[Catch: all -> 0x01dc, TryCatch #4 {all -> 0x01dc, blocks: (B:75:0x0198, B:77:0x01d9, B:86:0x01fe, B:81:0x01e3, B:84:0x01f5, B:85:0x01fc, B:71:0x018b), top: B:154:0x018b }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01e3 A[Catch: all -> 0x01dc, TryCatch #4 {all -> 0x01dc, blocks: (B:75:0x0198, B:77:0x01d9, B:86:0x01fe, B:81:0x01e3, B:84:0x01f5, B:85:0x01fc, B:71:0x018b), top: B:154:0x018b }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f5 A[Catch: all -> 0x01dc, TryCatch #4 {all -> 0x01dc, blocks: (B:75:0x0198, B:77:0x01d9, B:86:0x01fe, B:81:0x01e3, B:84:0x01f5, B:85:0x01fc, B:71:0x018b), top: B:154:0x018b }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01fc A[Catch: all -> 0x01dc, TryCatch #4 {all -> 0x01dc, blocks: (B:75:0x0198, B:77:0x01d9, B:86:0x01fe, B:81:0x01e3, B:84:0x01f5, B:85:0x01fc, B:71:0x018b), top: B:154:0x018b }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0223  */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02da, code lost:
    
        if (r19.f200078b.m60397a(r4, r9) == r14) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02fc, code lost:
    
        if (r3.collect(r0, r9) == r14) goto L141;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00f2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x010a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [p.x2r] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v6, types: [p.eli0] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List, p.fq01] */
    /* JADX WARN: Type inference failed for: r6v3, types: [p.icr0] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13, types: [p.eli0] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [p.gcr0] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        qki0 qki0Var;
        List listM43728j1;
        bqz0 bqz0Var2;
        yuk yukVar;
        ?? r3;
        pki0 pki0Var;
        fq01 fq01Var;
        List list;
        int i;
        pm80 pm80Var;
        fq01 fq01Var2;
        boolean z;
        pki0 pki0Var2;
        gli0 gli0Var;
        String str;
        int i2;
        pki0 pki0Var3;
        int i3;
        ?? r11;
        ?? r8;
        ?? r7;
        ?? r9;
        pm80 pm80Var2;
        Object objMo34037c;
        String str2;
        ?? r10;
        pm80 pm80Var3;
        int i4;
        String str3;
        icr0 icr0Var;
        bqz0 bqz0Var3;
        v401 v401VarM94361X;
        l7l s0cVar;
        Object c6x0Var;
        bqz0 bqz0Var4;
        Throwable thM77348a;
        boolean z2;
        Object obj2;
        v2r v2rVar;
        int i5;
        gli0 gli0Var2;
        z0r z0rVar;
        Throwable thM77348a2;
        hpg1 a3rVar;
        fiz nzx0Var;
        int i6;
        if (ibkVar instanceof qki0) {
            qki0Var = (qki0) ibkVar;
            int i7 = qki0Var.f189568b;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                qki0Var.f189568b = i7 - Integer.MIN_VALUE;
            } else {
                qki0Var = new qki0(this, ibkVar);
            }
        } else {
            qki0Var = new qki0(this, ibkVar);
        }
        qki0 qki0Var2 = qki0Var;
        Object objM26511t = qki0Var2.f189567a;
        int i8 = qki0Var2.f189568b;
        yuk yukVar2 = yuk.f276404a;
        try {
            try {
                if (i8 == 0) {
                    bga.m29073P(objM26511t);
                    pki0 pki0Var4 = (pki0) obj;
                    fq01 fq01VarMo89604c = pki0Var4.f178467e.mo89604c();
                    listM43728j1 = g6f.m43728j1(pki0Var4.f178467e.mo89606h());
                    if (pki0Var4.f178466d instanceof eli0) {
                        Uri uri = pki0Var4.f178468f;
                        Uri uri2 = pki0Var4.f178469g;
                        bqz0Var2 = bqz0Var;
                        qki0Var2.f189570d = bqz0Var2;
                        qki0Var2.f189571e = pki0Var4;
                        qki0Var2.f189572f = fq01VarMo89604c;
                        qki0Var2.f189573g = listM43728j1;
                        qki0Var2.f189565X = 0;
                        qki0Var2.f189568b = 1;
                        yukVar = yukVar2;
                        fq01Var2 = fq01VarMo89604c;
                        z = false;
                        Object objM64456f = this.f200077a.m64456f(fq01Var2, listM43728j1, uri, uri2, qki0Var2);
                        if (objM64456f != yukVar) {
                            pki0Var2 = pki0Var4;
                            objM26511t = objM64456f;
                            i = 0;
                        }
                    } else {
                        bqz0Var2 = bqz0Var;
                        yukVar = yukVar2;
                        r3 = 0;
                        pki0Var = pki0Var4;
                        fq01Var = fq01VarMo89604c;
                        list = listM43728j1;
                        i = 0;
                        pm80Var = null;
                        gli0Var = pki0Var.f178466d;
                        if (gli0Var instanceof eli0) {
                            str = "Loaded: " + ((eli0) gli0Var).f60721e;
                        } else if (gli0Var instanceof dli0) {
                            dli0 dli0Var = (dli0) gli0Var;
                            str = "Error: " + dli0Var.f50216e + ", " + dli0Var.f50217f;
                        } else {
                            if (gli0Var instanceof fli0) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "Loading";
                        }
                        if (gli0Var instanceof eli0) {
                            try {
                                r11 = (eli0) gli0Var;
                            } catch (Throwable th) {
                                th = th;
                                i3 = i;
                                pki0Var3 = pki0Var;
                                bqz0Var3 = bqz0Var2;
                                c6x0Var = new c6x0(th);
                                int i9 = i3;
                                bqz0Var4 = bqz0Var3;
                                thM77348a = s6x0.m77348a(c6x0Var);
                                if (thM77348a == null) {
                                }
                                z2 = c6x0Var instanceof c6x0;
                                if (z2) {
                                    obj2 = null;
                                } else {
                                    obj2 = c6x0Var;
                                }
                                v2rVar = (v2r) obj2;
                                if (v2rVar != null) {
                                    if (v2rVar.mo79932a() == null) {
                                        i6 = 1;
                                    } else {
                                        i6 = 0;
                                    }
                                    i5 = i6;
                                } else {
                                    i5 = 0;
                                }
                                gli0Var2 = pki0Var3.f178466d;
                                z0rVar = pki0Var3.f178467e;
                                if (gli0Var2 instanceof fli0) {
                                }
                                if (z2) {
                                    thM77348a2 = s6x0.m77348a(c6x0Var);
                                    if (thM77348a2 == null) {
                                        thM77348a2 = new IllegalStateException("Failed to collect share data");
                                    }
                                    a3rVar = new a3r(pki0Var3.f178466d.mo36364g().f213201a.f201918a.f136946a, z0rVar.mo89604c(), thM77348a2, z0rVar.mo89605g());
                                } else {
                                    bga.m29073P(c6x0Var);
                                    a3rVar = new b3r((v2r) c6x0Var);
                                }
                                acr0 acr0Var = new acr0(a3rVar);
                                qki0Var2.f189570d = bqz0Var4;
                                qki0Var2.f189571e = null;
                                qki0Var2.f189572f = null;
                                qki0Var2.f189573g = null;
                                qki0Var2.f189574h = null;
                                qki0Var2.f189575i = null;
                                qki0Var2.f189576t = null;
                                qki0Var2.f189565X = i9;
                                qki0Var2.f189566Y = i5;
                                qki0Var2.f189568b = 4;
                            }
                        } else {
                            r11 = r3;
                        }
                        ?? M31048c = this.f200079c.m31048c(fq01Var, list, new f2r(3));
                        lu01 lu01Var = gli0Var.mo36364g().f213201a.f201918a;
                        if (r11 != 0) {
                            icr0Var = r11.f60721e;
                        } else {
                            r8 = r3;
                        }
                        if (r11 != 0) {
                            r7 = r11.f60722f;
                        } else {
                            r7 = r3;
                        }
                        if (pm80Var != null) {
                            r8 = icr0Var;
                            str3 = pm80Var.f178974a;
                            if (str3 != null) {
                                r8 = icr0Var;
                                r9 = Uri.parse(str3);
                            } else {
                                r8 = icr0Var;
                                r8 = icr0Var;
                                r8 = icr0Var;
                                r9 = r3;
                            }
                        } else {
                            r8 = icr0Var;
                            r8 = icr0Var;
                            r8 = icr0Var;
                            r9 = r3;
                        }
                        qki0Var2.f189570d = bqz0Var2;
                        qki0Var2.f189571e = pki0Var;
                        qki0Var2.f189572f = r3;
                        qki0Var2.f189573g = r3;
                        qki0Var2.f189574h = pm80Var;
                        qki0Var2.f189575i = str;
                        qki0Var2.f189576t = r11;
                        qki0Var2.f189565X = i;
                        qki0Var2.f189566Y = 0;
                        qki0Var2.f189568b = 2;
                        pm80Var2 = pm80Var;
                        i2 = i;
                        pki0Var3 = pki0Var;
                        objMo34037c = M31048c.mo34037c(lu01Var, r8, r7, r9, qki0Var2);
                        if (objMo34037c == yukVar) {
                            str2 = str;
                            r10 = r11;
                            pm80Var3 = pm80Var2;
                            objM26511t = objMo34037c;
                            i4 = 0;
                            ho01 ho01Var = (ho01) objM26511t;
                            z0r z0rVar2 = pki0Var3.f178467e;
                            fbk fbkVar = null;
                            dw4 dw4Var = new dw4(pki0Var3, pm80Var3, fbkVar, 6);
                            jn8 jn8Var = new jn8(pm80Var3, fbkVar, 3);
                            String str4 = "State[" + str2 + "], ShareData=[" + ho01Var + "]";
                            Set set = zw81.f286946a;
                            if (zw81.m97114a(pki0Var3.f178466d.mo36364g().f213201a.f201918a.f136946a)) {
                                s0cVar = r0c.f194427e;
                            } else {
                                if (r10 != 0) {
                                    v401VarM94361X = yqg1.m94361X(r10.f60721e, r10.f60722f, r10.f60717a.f213202b.f154746c);
                                } else {
                                    v401VarM94361X = null;
                                }
                                if (v401VarM94361X != null) {
                                    s0cVar = new s0c(v401VarM94361X);
                                } else {
                                    s0cVar = t0c.f215839e;
                                }
                            }
                            qki0Var2.f189570d = bqz0Var2;
                            qki0Var2.f189571e = pki0Var3;
                            qki0Var2.f189572f = null;
                            qki0Var2.f189573g = null;
                            qki0Var2.f189574h = null;
                            qki0Var2.f189575i = null;
                            qki0Var2.f189576t = null;
                            qki0Var2.f189565X = i2;
                            qki0Var2.f189566Y = i4;
                            qki0Var2.f189568b = 3;
                            objM26511t = ang1.m26511t(z0rVar2, ho01Var, dw4Var, jn8Var, str4, null, s0cVar, qki0Var2);
                            qki0Var2 = qki0Var2;
                            if (objM26511t != yukVar) {
                                bqz0Var3 = bqz0Var2;
                                i3 = i2;
                                c6x0Var = (v2r) objM26511t;
                                int i10 = i3;
                                bqz0Var4 = bqz0Var3;
                                thM77348a = s6x0.m77348a(c6x0Var);
                                if (thM77348a == null) {
                                }
                                z2 = c6x0Var instanceof c6x0;
                                if (z2) {
                                    obj2 = null;
                                } else {
                                    obj2 = c6x0Var;
                                }
                                v2rVar = (v2r) obj2;
                                if (v2rVar != null) {
                                    if (v2rVar.mo79932a() == null) {
                                        i6 = 1;
                                    } else {
                                        i6 = 0;
                                    }
                                    i5 = i6;
                                } else {
                                    i5 = 0;
                                }
                                gli0Var2 = pki0Var3.f178466d;
                                z0rVar = pki0Var3.f178467e;
                                if (gli0Var2 instanceof fli0) {
                                }
                                if (z2) {
                                    bga.m29073P(c6x0Var);
                                    a3rVar = new b3r((v2r) c6x0Var);
                                } else {
                                    thM77348a2 = s6x0.m77348a(c6x0Var);
                                    if (thM77348a2 == null) {
                                        thM77348a2 = new IllegalStateException("Failed to collect share data");
                                    }
                                    a3rVar = new a3r(pki0Var3.f178466d.mo36364g().f213201a.f201918a.f136946a, z0rVar.mo89604c(), thM77348a2, z0rVar.mo89605g());
                                }
                                acr0 acr0Var2 = new acr0(a3rVar);
                                qki0Var2.f189570d = bqz0Var4;
                                qki0Var2.f189571e = null;
                                qki0Var2.f189572f = null;
                                qki0Var2.f189573g = null;
                                qki0Var2.f189574h = null;
                                qki0Var2.f189575i = null;
                                qki0Var2.f189576t = null;
                                qki0Var2.f189565X = i10;
                                qki0Var2.f189566Y = i5;
                                qki0Var2.f189568b = 4;
                            }
                        }
                    }
                    return yukVar;
                }
                if (i8 == 1) {
                    int i11 = qki0Var2.f189565X;
                    List list2 = qki0Var2.f189573g;
                    fq01 fq01Var3 = qki0Var2.f189572f;
                    pki0Var2 = qki0Var2.f189571e;
                    bqz0 bqz0Var5 = qki0Var2.f189570d;
                    bga.m29073P(objM26511t);
                    yukVar = yukVar2;
                    fq01Var2 = fq01Var3;
                    bqz0Var2 = bqz0Var5;
                    listM43728j1 = list2;
                    i = i11;
                    z = false;
                } else {
                    if (i8 == 2) {
                        int i12 = qki0Var2.f189566Y;
                        int i13 = qki0Var2.f189565X;
                        eli0 eli0Var = qki0Var2.f189576t;
                        str2 = qki0Var2.f189575i;
                        pm80Var3 = qki0Var2.f189574h;
                        pki0 pki0Var5 = qki0Var2.f189571e;
                        bqz0Var2 = qki0Var2.f189570d;
                        try {
                            bga.m29073P(objM26511t);
                            i4 = i12;
                            pki0Var3 = pki0Var5;
                            yukVar = yukVar2;
                            i2 = i13;
                            r10 = eli0Var;
                            ho01 ho01Var2 = (ho01) objM26511t;
                            z0r z0rVar3 = pki0Var3.f178467e;
                            fbk fbkVar2 = null;
                            dw4 dw4Var2 = new dw4(pki0Var3, pm80Var3, fbkVar2, 6);
                            jn8 jn8Var2 = new jn8(pm80Var3, fbkVar2, 3);
                            String str5 = "State[" + str2 + "], ShareData=[" + ho01Var2 + "]";
                            Set set2 = zw81.f286946a;
                            if (zw81.m97114a(pki0Var3.f178466d.mo36364g().f213201a.f201918a.f136946a)) {
                                s0cVar = r0c.f194427e;
                            } else {
                                if (r10 != 0) {
                                    v401VarM94361X = yqg1.m94361X(r10.f60721e, r10.f60722f, r10.f60717a.f213202b.f154746c);
                                } else {
                                    v401VarM94361X = null;
                                }
                                if (v401VarM94361X != null) {
                                    s0cVar = new s0c(v401VarM94361X);
                                } else {
                                    s0cVar = t0c.f215839e;
                                }
                            }
                            qki0Var2.f189570d = bqz0Var2;
                            qki0Var2.f189571e = pki0Var3;
                            qki0Var2.f189572f = null;
                            qki0Var2.f189573g = null;
                            qki0Var2.f189574h = null;
                            qki0Var2.f189575i = null;
                            qki0Var2.f189576t = null;
                            qki0Var2.f189565X = i2;
                            qki0Var2.f189566Y = i4;
                            qki0Var2.f189568b = 3;
                            try {
                                objM26511t = ang1.m26511t(z0rVar3, ho01Var2, dw4Var2, jn8Var2, str5, null, s0cVar, qki0Var2);
                                qki0Var2 = qki0Var2;
                                if (objM26511t != yukVar) {
                                    bqz0Var3 = bqz0Var2;
                                    i3 = i2;
                                    c6x0Var = (v2r) objM26511t;
                                    int i14 = i3;
                                    bqz0Var4 = bqz0Var3;
                                    thM77348a = s6x0.m77348a(c6x0Var);
                                    if (thM77348a == null) {
                                    }
                                    z2 = c6x0Var instanceof c6x0;
                                    if (z2) {
                                        obj2 = null;
                                    } else {
                                        obj2 = c6x0Var;
                                    }
                                    v2rVar = (v2r) obj2;
                                    if (v2rVar != null) {
                                        if (v2rVar.mo79932a() == null) {
                                            i6 = 1;
                                        } else {
                                            i6 = 0;
                                        }
                                        i5 = i6;
                                    } else {
                                        i5 = 0;
                                    }
                                    gli0Var2 = pki0Var3.f178466d;
                                    z0rVar = pki0Var3.f178467e;
                                    if (gli0Var2 instanceof fli0) {
                                    }
                                    if (z2) {
                                        bga.m29073P(c6x0Var);
                                        a3rVar = new b3r((v2r) c6x0Var);
                                    } else {
                                        thM77348a2 = s6x0.m77348a(c6x0Var);
                                        if (thM77348a2 == null) {
                                            thM77348a2 = new IllegalStateException("Failed to collect share data");
                                        }
                                        a3rVar = new a3r(pki0Var3.f178466d.mo36364g().f213201a.f201918a.f136946a, z0rVar.mo89604c(), thM77348a2, z0rVar.mo89605g());
                                    }
                                    acr0 acr0Var3 = new acr0(a3rVar);
                                    qki0Var2.f189570d = bqz0Var4;
                                    qki0Var2.f189571e = null;
                                    qki0Var2.f189572f = null;
                                    qki0Var2.f189573g = null;
                                    qki0Var2.f189574h = null;
                                    qki0Var2.f189575i = null;
                                    qki0Var2.f189576t = null;
                                    qki0Var2.f189565X = i14;
                                    qki0Var2.f189566Y = i5;
                                    qki0Var2.f189568b = 4;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                qki0Var2 = qki0Var2;
                                bqz0Var3 = bqz0Var2;
                                i3 = i2;
                                c6x0Var = new c6x0(th);
                                int i15 = i3;
                                bqz0Var4 = bqz0Var3;
                                thM77348a = s6x0.m77348a(c6x0Var);
                                if (thM77348a == null) {
                                }
                                z2 = c6x0Var instanceof c6x0;
                                if (z2) {
                                    obj2 = null;
                                } else {
                                    obj2 = c6x0Var;
                                }
                                v2rVar = (v2r) obj2;
                                if (v2rVar != null) {
                                    if (v2rVar.mo79932a() == null) {
                                        i6 = 1;
                                    } else {
                                        i6 = 0;
                                    }
                                    i5 = i6;
                                } else {
                                    i5 = 0;
                                }
                                gli0Var2 = pki0Var3.f178466d;
                                z0rVar = pki0Var3.f178467e;
                                if (gli0Var2 instanceof fli0) {
                                }
                                if (z2) {
                                    bga.m29073P(c6x0Var);
                                    a3rVar = new b3r((v2r) c6x0Var);
                                } else {
                                    thM77348a2 = s6x0.m77348a(c6x0Var);
                                    if (thM77348a2 == null) {
                                        thM77348a2 = new IllegalStateException("Failed to collect share data");
                                    }
                                    a3rVar = new a3r(pki0Var3.f178466d.mo36364g().f213201a.f201918a.f136946a, z0rVar.mo89604c(), thM77348a2, z0rVar.mo89605g());
                                }
                                acr0 acr0Var4 = new acr0(a3rVar);
                                qki0Var2.f189570d = bqz0Var4;
                                qki0Var2.f189571e = null;
                                qki0Var2.f189572f = null;
                                qki0Var2.f189573g = null;
                                qki0Var2.f189574h = null;
                                qki0Var2.f189575i = null;
                                qki0Var2.f189576t = null;
                                qki0Var2.f189565X = i15;
                                qki0Var2.f189566Y = i5;
                                qki0Var2.f189568b = 4;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            pki0Var3 = pki0Var5;
                            yukVar = yukVar2;
                            i3 = i13;
                            bqz0Var3 = bqz0Var2;
                            c6x0Var = new c6x0(th);
                            int i16 = i3;
                            bqz0Var4 = bqz0Var3;
                            thM77348a = s6x0.m77348a(c6x0Var);
                            if (thM77348a == null) {
                            }
                            z2 = c6x0Var instanceof c6x0;
                            if (z2) {
                                obj2 = null;
                            } else {
                                obj2 = c6x0Var;
                            }
                            v2rVar = (v2r) obj2;
                            if (v2rVar != null) {
                                if (v2rVar.mo79932a() == null) {
                                    i6 = 1;
                                } else {
                                    i6 = 0;
                                }
                                i5 = i6;
                            } else {
                                i5 = 0;
                            }
                            gli0Var2 = pki0Var3.f178466d;
                            z0rVar = pki0Var3.f178467e;
                            if (gli0Var2 instanceof fli0) {
                            }
                            if (z2) {
                                bga.m29073P(c6x0Var);
                                a3rVar = new b3r((v2r) c6x0Var);
                            } else {
                                thM77348a2 = s6x0.m77348a(c6x0Var);
                                if (thM77348a2 == null) {
                                    thM77348a2 = new IllegalStateException("Failed to collect share data");
                                }
                                a3rVar = new a3r(pki0Var3.f178466d.mo36364g().f213201a.f201918a.f136946a, z0rVar.mo89604c(), thM77348a2, z0rVar.mo89605g());
                            }
                            acr0 acr0Var5 = new acr0(a3rVar);
                            qki0Var2.f189570d = bqz0Var4;
                            qki0Var2.f189571e = null;
                            qki0Var2.f189572f = null;
                            qki0Var2.f189573g = null;
                            qki0Var2.f189574h = null;
                            qki0Var2.f189575i = null;
                            qki0Var2.f189576t = null;
                            qki0Var2.f189565X = i16;
                            qki0Var2.f189566Y = i5;
                            qki0Var2.f189568b = 4;
                        }
                        return yukVar;
                    }
                    if (i8 == 3) {
                        i3 = qki0Var2.f189565X;
                        pki0Var3 = qki0Var2.f189571e;
                        bqz0Var3 = qki0Var2.f189570d;
                        try {
                            bga.m29073P(objM26511t);
                            yukVar = yukVar2;
                            try {
                                c6x0Var = (v2r) objM26511t;
                            } catch (Throwable th4) {
                                th = th4;
                                c6x0Var = new c6x0(th);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            yukVar = yukVar2;
                            c6x0Var = new c6x0(th);
                            int i17 = i3;
                            bqz0Var4 = bqz0Var3;
                            thM77348a = s6x0.m77348a(c6x0Var);
                            if (thM77348a == null) {
                            }
                            z2 = c6x0Var instanceof c6x0;
                            if (z2) {
                                obj2 = null;
                            } else {
                                obj2 = c6x0Var;
                            }
                            v2rVar = (v2r) obj2;
                            if (v2rVar != null) {
                                if (v2rVar.mo79932a() == null) {
                                    i6 = 1;
                                } else {
                                    i6 = 0;
                                }
                                i5 = i6;
                            } else {
                                i5 = 0;
                            }
                            gli0Var2 = pki0Var3.f178466d;
                            z0rVar = pki0Var3.f178467e;
                            if (gli0Var2 instanceof fli0) {
                            }
                            if (z2) {
                                bga.m29073P(c6x0Var);
                                a3rVar = new b3r((v2r) c6x0Var);
                            } else {
                                thM77348a2 = s6x0.m77348a(c6x0Var);
                                if (thM77348a2 == null) {
                                    thM77348a2 = new IllegalStateException("Failed to collect share data");
                                }
                                a3rVar = new a3r(pki0Var3.f178466d.mo36364g().f213201a.f201918a.f136946a, z0rVar.mo89604c(), thM77348a2, z0rVar.mo89605g());
                            }
                            acr0 acr0Var6 = new acr0(a3rVar);
                            qki0Var2.f189570d = bqz0Var4;
                            qki0Var2.f189571e = null;
                            qki0Var2.f189572f = null;
                            qki0Var2.f189573g = null;
                            qki0Var2.f189574h = null;
                            qki0Var2.f189575i = null;
                            qki0Var2.f189576t = null;
                            qki0Var2.f189565X = i17;
                            qki0Var2.f189566Y = i5;
                            qki0Var2.f189568b = 4;
                        }
                        int i18 = i3;
                        bqz0Var4 = bqz0Var3;
                        thM77348a = s6x0.m77348a(c6x0Var);
                        if (thM77348a == null && !(thM77348a instanceof TimeoutCancellationException) && (thM77348a instanceof CancellationException)) {
                            throw thM77348a;
                        }
                        z2 = c6x0Var instanceof c6x0;
                        if (z2) {
                            obj2 = null;
                        } else {
                            obj2 = c6x0Var;
                        }
                        v2rVar = (v2r) obj2;
                        if (v2rVar != null) {
                            if (v2rVar.mo79932a() == null) {
                                i6 = 1;
                            } else {
                                i6 = 0;
                            }
                            i5 = i6;
                        } else {
                            i5 = 0;
                        }
                        gli0Var2 = pki0Var3.f178466d;
                        z0rVar = pki0Var3.f178467e;
                        if ((gli0Var2 instanceof fli0) || i5 == 0 || pki0Var3.f178470h >= 10) {
                            if (z2) {
                                bga.m29073P(c6x0Var);
                                a3rVar = new b3r((v2r) c6x0Var);
                            } else {
                                thM77348a2 = s6x0.m77348a(c6x0Var);
                                if (thM77348a2 == null) {
                                    thM77348a2 = new IllegalStateException("Failed to collect share data");
                                }
                                a3rVar = new a3r(pki0Var3.f178466d.mo36364g().f213201a.f201918a.f136946a, z0rVar.mo89604c(), thM77348a2, z0rVar.mo89605g());
                            }
                            acr0 acr0Var7 = new acr0(a3rVar);
                            qki0Var2.f189570d = bqz0Var4;
                            qki0Var2.f189571e = null;
                            qki0Var2.f189572f = null;
                            qki0Var2.f189573g = null;
                            qki0Var2.f189574h = null;
                            qki0Var2.f189575i = null;
                            qki0Var2.f189576t = null;
                            qki0Var2.f189565X = i18;
                            qki0Var2.f189566Y = i5;
                            qki0Var2.f189568b = 4;
                        } else {
                            nzx0Var = new nzx0(new rph0(pki0Var3, null, 8));
                            mwa0 mwa0Var = new mwa0(bqz0Var4, 20);
                            qki0Var2.f189570d = null;
                            qki0Var2.f189571e = null;
                            qki0Var2.f189572f = null;
                            qki0Var2.f189573g = null;
                            qki0Var2.f189574h = null;
                            qki0Var2.f189575i = null;
                            qki0Var2.f189576t = null;
                            qki0Var2.f189568b = 5;
                        }
                        return yukVar;
                    }
                    if (i8 == 4) {
                        bqz0Var4 = qki0Var2.f189570d;
                        bga.m29073P(objM26511t);
                        yukVar = yukVar2;
                        nzx0Var = gau.f78095a;
                        mwa0 mwa0Var2 = new mwa0(bqz0Var4, 20);
                        qki0Var2.f189570d = null;
                        qki0Var2.f189571e = null;
                        qki0Var2.f189572f = null;
                        qki0Var2.f189573g = null;
                        qki0Var2.f189574h = null;
                        qki0Var2.f189575i = null;
                        qki0Var2.f189576t = null;
                        qki0Var2.f189568b = 5;
                    } else {
                        if (i8 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(objM26511t);
                    }
                }
                return w2a1.f247311a;
                objMo34037c = M31048c.mo34037c(lu01Var, r8, r7, r9, qki0Var2);
                if (objMo34037c == yukVar) {
                    str2 = str;
                    r10 = r11;
                    pm80Var3 = pm80Var2;
                    objM26511t = objMo34037c;
                    i4 = 0;
                    ho01 ho01Var3 = (ho01) objM26511t;
                    z0r z0rVar4 = pki0Var3.f178467e;
                    fbk fbkVar3 = null;
                    dw4 dw4Var3 = new dw4(pki0Var3, pm80Var3, fbkVar3, 6);
                    jn8 jn8Var3 = new jn8(pm80Var3, fbkVar3, 3);
                    String str6 = "State[" + str2 + "], ShareData=[" + ho01Var3 + "]";
                    Set set3 = zw81.f286946a;
                    if (zw81.m97114a(pki0Var3.f178466d.mo36364g().f213201a.f201918a.f136946a)) {
                        s0cVar = r0c.f194427e;
                    } else {
                        if (r10 != 0) {
                            v401VarM94361X = yqg1.m94361X(r10.f60721e, r10.f60722f, r10.f60717a.f213202b.f154746c);
                        } else {
                            v401VarM94361X = null;
                        }
                        if (v401VarM94361X != null) {
                            s0cVar = new s0c(v401VarM94361X);
                        } else {
                            s0cVar = t0c.f215839e;
                        }
                    }
                    qki0Var2.f189570d = bqz0Var2;
                    qki0Var2.f189571e = pki0Var3;
                    qki0Var2.f189572f = null;
                    qki0Var2.f189573g = null;
                    qki0Var2.f189574h = null;
                    qki0Var2.f189575i = null;
                    qki0Var2.f189576t = null;
                    qki0Var2.f189565X = i2;
                    qki0Var2.f189566Y = i4;
                    qki0Var2.f189568b = 3;
                    objM26511t = ang1.m26511t(z0rVar4, ho01Var3, dw4Var3, jn8Var3, str6, null, s0cVar, qki0Var2);
                    qki0Var2 = qki0Var2;
                    if (objM26511t != yukVar) {
                        bqz0Var3 = bqz0Var2;
                        i3 = i2;
                        c6x0Var = (v2r) objM26511t;
                        int i19 = i3;
                        bqz0Var4 = bqz0Var3;
                        thM77348a = s6x0.m77348a(c6x0Var);
                        if (thM77348a == null) {
                        }
                        z2 = c6x0Var instanceof c6x0;
                        if (z2) {
                            obj2 = null;
                        } else {
                            obj2 = c6x0Var;
                        }
                        v2rVar = (v2r) obj2;
                        if (v2rVar != null) {
                            if (v2rVar.mo79932a() == null) {
                                i6 = 1;
                            } else {
                                i6 = 0;
                            }
                            i5 = i6;
                        } else {
                            i5 = 0;
                        }
                        gli0Var2 = pki0Var3.f178466d;
                        z0rVar = pki0Var3.f178467e;
                        if (gli0Var2 instanceof fli0) {
                        }
                        if (z2) {
                            bga.m29073P(c6x0Var);
                            a3rVar = new b3r((v2r) c6x0Var);
                        } else {
                            thM77348a2 = s6x0.m77348a(c6x0Var);
                            if (thM77348a2 == null) {
                                thM77348a2 = new IllegalStateException("Failed to collect share data");
                            }
                            a3rVar = new a3r(pki0Var3.f178466d.mo36364g().f213201a.f201918a.f136946a, z0rVar.mo89604c(), thM77348a2, z0rVar.mo89605g());
                        }
                        acr0 acr0Var8 = new acr0(a3rVar);
                        qki0Var2.f189570d = bqz0Var4;
                        qki0Var2.f189571e = null;
                        qki0Var2.f189572f = null;
                        qki0Var2.f189573g = null;
                        qki0Var2.f189574h = null;
                        qki0Var2.f189575i = null;
                        qki0Var2.f189576t = null;
                        qki0Var2.f189565X = i19;
                        qki0Var2.f189566Y = i5;
                        qki0Var2.f189568b = 4;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                bqz0Var3 = bqz0Var2;
                i3 = i2;
                c6x0Var = new c6x0(th);
                int i110 = i3;
                bqz0Var4 = bqz0Var3;
                thM77348a = s6x0.m77348a(c6x0Var);
                if (thM77348a == null) {
                }
                z2 = c6x0Var instanceof c6x0;
                if (z2) {
                    obj2 = null;
                } else {
                    obj2 = c6x0Var;
                }
                v2rVar = (v2r) obj2;
                if (v2rVar != null) {
                    if (v2rVar.mo79932a() == null) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    i5 = i6;
                } else {
                    i5 = 0;
                }
                gli0Var2 = pki0Var3.f178466d;
                z0rVar = pki0Var3.f178467e;
                if (gli0Var2 instanceof fli0) {
                }
                if (z2) {
                    bga.m29073P(c6x0Var);
                    a3rVar = new b3r((v2r) c6x0Var);
                } else {
                    thM77348a2 = s6x0.m77348a(c6x0Var);
                    if (thM77348a2 == null) {
                        thM77348a2 = new IllegalStateException("Failed to collect share data");
                    }
                    a3rVar = new a3r(pki0Var3.f178466d.mo36364g().f213201a.f201918a.f136946a, z0rVar.mo89604c(), thM77348a2, z0rVar.mo89605g());
                }
                acr0 acr0Var9 = new acr0(a3rVar);
                qki0Var2.f189570d = bqz0Var4;
                qki0Var2.f189571e = null;
                qki0Var2.f189572f = null;
                qki0Var2.f189573g = null;
                qki0Var2.f189574h = null;
                qki0Var2.f189575i = null;
                qki0Var2.f189576t = null;
                qki0Var2.f189565X = i110;
                qki0Var2.f189566Y = i5;
                qki0Var2.f189568b = 4;
            }
            if (gli0Var instanceof eli0) {
                r11 = (eli0) gli0Var;
            } else {
                r11 = r3;
            }
            ?? M31048c2 = this.f200079c.m31048c(fq01Var, list, new f2r(3));
            lu01 lu01Var2 = gli0Var.mo36364g().f213201a.f201918a;
            if (r11 != 0) {
                icr0Var = r11.f60721e;
            } else {
                r8 = r3;
            }
            if (r11 != 0) {
                r7 = r11.f60722f;
            } else {
                r7 = r3;
            }
            if (pm80Var != null) {
                r8 = icr0Var;
                str3 = pm80Var.f178974a;
                if (str3 != null) {
                    r8 = icr0Var;
                    r9 = Uri.parse(str3);
                } else {
                    r8 = icr0Var;
                    r8 = icr0Var;
                    r8 = icr0Var;
                    r9 = r3;
                }
            } else {
                r8 = icr0Var;
                r8 = icr0Var;
                r8 = icr0Var;
                r9 = r3;
            }
            qki0Var2.f189570d = bqz0Var2;
            qki0Var2.f189571e = pki0Var;
            qki0Var2.f189572f = r3;
            qki0Var2.f189573g = r3;
            qki0Var2.f189574h = pm80Var;
            qki0Var2.f189575i = str;
            qki0Var2.f189576t = r11;
            qki0Var2.f189565X = i;
            qki0Var2.f189566Y = 0;
            qki0Var2.f189568b = 2;
            pm80Var2 = pm80Var;
            i2 = i;
            pki0Var3 = pki0Var;
        } catch (Throwable th7) {
            th = th7;
            i2 = i;
            pki0Var3 = pki0Var;
            bqz0Var3 = bqz0Var2;
            i3 = i2;
            c6x0Var = new c6x0(th);
            int i111 = i3;
            bqz0Var4 = bqz0Var3;
            thM77348a = s6x0.m77348a(c6x0Var);
            if (thM77348a == null) {
            }
            z2 = c6x0Var instanceof c6x0;
            if (z2) {
                obj2 = null;
            } else {
                obj2 = c6x0Var;
            }
            v2rVar = (v2r) obj2;
            if (v2rVar != null) {
                if (v2rVar.mo79932a() == null) {
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                i5 = i6;
            } else {
                i5 = 0;
            }
            gli0Var2 = pki0Var3.f178466d;
            z0rVar = pki0Var3.f178467e;
            if (gli0Var2 instanceof fli0) {
            }
            if (z2) {
                bga.m29073P(c6x0Var);
                a3rVar = new b3r((v2r) c6x0Var);
            } else {
                thM77348a2 = s6x0.m77348a(c6x0Var);
                if (thM77348a2 == null) {
                    thM77348a2 = new IllegalStateException("Failed to collect share data");
                }
                a3rVar = new a3r(pki0Var3.f178466d.mo36364g().f213201a.f201918a.f136946a, z0rVar.mo89604c(), thM77348a2, z0rVar.mo89605g());
            }
            acr0 acr0Var10 = new acr0(a3rVar);
            qki0Var2.f189570d = bqz0Var4;
            qki0Var2.f189571e = null;
            qki0Var2.f189572f = null;
            qki0Var2.f189573g = null;
            qki0Var2.f189574h = null;
            qki0Var2.f189575i = null;
            qki0Var2.f189576t = null;
            qki0Var2.f189565X = i111;
            qki0Var2.f189566Y = i5;
            qki0Var2.f189568b = 4;
        }
        List list3 = listM43728j1;
        pm80Var = (pm80) objM26511t;
        fq01Var = fq01Var2;
        pki0Var = pki0Var2;
        list = list3;
        r3 = z;
        gli0Var = pki0Var.f178466d;
        if (gli0Var instanceof eli0) {
            str = "Loaded: " + ((eli0) gli0Var).f60721e;
        } else if (gli0Var instanceof dli0) {
            dli0 dli0Var2 = (dli0) gli0Var;
            str = "Error: " + dli0Var2.f50216e + ", " + dli0Var2.f50217f;
        } else {
            if (gli0Var instanceof fli0) {
                throw new NoWhenBranchMatchedException();
            }
            str = "Loading";
        }
        return yukVar;
    }
}
