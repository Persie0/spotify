package p204p;

import android.os.Build;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class zm10 implements ssi {

    /* JADX INFO: renamed from: a */
    public final ui10 f284118a;

    /* JADX INFO: renamed from: b */
    public final an10 f284119b;

    /* JADX INFO: renamed from: c */
    public final g94 f284120c;

    /* JADX INFO: renamed from: d */
    public final voi f284121d;

    /* JADX INFO: renamed from: e */
    public final l480 f284122e;

    /* JADX INFO: renamed from: f */
    public final lsi0 f284123f = msi0.m62770a();

    /* JADX INFO: renamed from: g */
    public final c9k f284124g;

    /* JADX INFO: renamed from: h */
    public fuf f284125h;

    /* JADX INFO: renamed from: i */
    public tm10 f284126i;

    /* JADX INFO: renamed from: t */
    public di41 f284127t;

    public zm10(ui10 ui10Var, an10 an10Var, g94 g94Var, voi voiVar, l480 l480Var, luk lukVar) {
        this.f284118a = ui10Var;
        this.f284119b = an10Var;
        this.f284120c = g94Var;
        this.f284121d = voiVar;
        this.f284122e = l480Var;
        this.f284124g = edb.m38577z(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final void m96394c(zm10 zm10Var, ibk ibkVar) {
        wm10 wm10Var;
        if (ibkVar instanceof wm10) {
            wm10Var = (wm10) ibkVar;
            int i = wm10Var.f252683c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wm10Var.f252683c = i - Integer.MIN_VALUE;
            } else {
                wm10Var = new wm10(zm10Var, ibkVar);
            }
        } else {
            wm10Var = new wm10(zm10Var, ibkVar);
        }
        Object obj = wm10Var.f252681a;
        int i2 = wm10Var.f252683c;
        if (i2 == 0) {
            bga.m29073P(obj);
            luu0 luu0VarM31020l = bzf1.m31020l(zm10Var.f284118a.f230565e);
            ncp ncpVar = new ncp(zm10Var, 29);
            wm10Var.f252683c = 1;
            if (luu0VarM31020l.f137156a.collect(ncpVar, wm10Var) == yuk.f276404a) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: a */
    public final void mo24869a() {
        if (m96396g()) {
            this.f284122e.m58131a(null);
            c9k c9kVar = this.f284124g;
            qlg1.m73215t(c9kVar.f35578a);
            x0h1.m89578u(c9kVar, null, 0, new ym10(this, null, 2), 3);
            x0h1.m89578u(c9kVar, null, 0, new sqt(this, new xm10(this, 1), (fbk) null), 3);
        }
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: b */
    public final void mo24870b() {
        if (m96396g()) {
            fbk fbkVar = null;
            ym10 ym10Var = new ym10(this, fbkVar, 0);
            c9k c9kVar = this.f284124g;
            x0h1.m89578u(c9kVar, null, 0, ym10Var, 3);
            x0h1.m89578u(c9kVar, null, 0, new ym10(this, fbkVar, 1), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ae A[Catch: all -> 0x01b8, TryCatch #5 {all -> 0x01b8, blocks: (B:98:0x01aa, B:100:0x01ae, B:102:0x01b4, B:105:0x01ba), top: B:134:0x01aa }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b4 A[Catch: all -> 0x01b8, TryCatch #5 {all -> 0x01b8, blocks: (B:98:0x01aa, B:100:0x01ae, B:102:0x01b4, B:105:0x01ba), top: B:134:0x01aa }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01dd A[Catch: all -> 0x01e7, TryCatch #4 {all -> 0x01e7, blocks: (B:114:0x01d9, B:116:0x01dd, B:118:0x01e3, B:121:0x01e9), top: B:132:0x01d9 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01e3 A[Catch: all -> 0x01e7, TryCatch #4 {all -> 0x01e7, blocks: (B:114:0x01d9, B:116:0x01dd, B:118:0x01e3, B:121:0x01e9), top: B:132:0x01d9 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d5 A[Catch: all -> 0x008d, TryCatch #8 {all -> 0x008d, blocks: (B:26:0x0084, B:47:0x00f1, B:49:0x00f7, B:41:0x00d1, B:43:0x00d5, B:44:0x00d8), top: B:131:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1 A[Catch: all -> 0x008d, PHI: r1 r6 r10
      0x00f1: PHI (r1v10 ??) = (r1v37 ??), (r1v38 ??) binds: [B:45:0x00ed, B:26:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r6v5 p.fuf) = (r6v2 p.fuf), (r6v8 p.fuf) binds: [B:45:0x00ed, B:26:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r10v18 java.lang.Object) = (r10v16 java.lang.Object), (r10v27 java.lang.Object) binds: [B:45:0x00ed, B:26:0x0084] A[DONT_GENERATE, DONT_INLINE], TryCatch #8 {all -> 0x008d, blocks: (B:26:0x0084, B:47:0x00f1, B:49:0x00f7, B:41:0x00d1, B:43:0x00d5, B:44:0x00d8), top: B:131:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7 A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #8 {all -> 0x008d, blocks: (B:26:0x0084, B:47:0x00f1, B:49:0x00f7, B:41:0x00d1, B:43:0x00d5, B:44:0x00d8), top: B:131:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0120  */
    /* JADX WARN: Code duplicated, block: B:59:0x013a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0140 A[Catch: all -> 0x014a, TryCatch #7 {all -> 0x014a, blocks: (B:60:0x013c, B:62:0x0140, B:64:0x0146, B:67:0x014c), top: B:136:0x013c }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0146 A[Catch: all -> 0x014a, TryCatch #7 {all -> 0x014a, blocks: (B:60:0x013c, B:62:0x0140, B:64:0x0146, B:67:0x014c), top: B:136:0x013c }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0160  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0174  */
    /* JADX WARN: Code duplicated, block: B:83:0x0179 A[Catch: all -> 0x0183, TryCatch #2 {all -> 0x0183, blocks: (B:81:0x0175, B:83:0x0179, B:85:0x017f, B:88:0x0185), top: B:129:0x0175 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x017f A[Catch: all -> 0x0183, TryCatch #2 {all -> 0x0183, blocks: (B:81:0x0175, B:83:0x0179, B:85:0x017f, B:88:0x0185), top: B:129:0x0175 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x018f A[Catch: all -> 0x0156, TRY_ENTER, TryCatch #3 {all -> 0x0156, blocks: (B:75:0x015a, B:92:0x018f, B:93:0x0190, B:51:0x0102), top: B:131:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01a9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r1v10, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX INFO: renamed from: d */
    public final Object m96395d(ibk ibkVar) throws Throwable {
        vm10 vm10Var;
        Throwable th;
        fuf fufVar;
        lsi0 lsi0Var;
        fuf fufVar2;
        jsi0 jsi0Var;
        int i;
        int i2;
        fuf fufVar3;
        Object objM83172b;
        fuf fufVar4;
        fuf fufVar5;
        fuf fufVar6;
        um10 um10Var;
        fuf fufVar7;
        um10 um10Var2;
        lsi0 lsi0Var2;
        jsi0 jsi0Var2;
        jsi0 jsi0Var3;
        jsi0 jsi0Var4;
        if (ibkVar instanceof vm10) {
            vm10Var = (vm10) ibkVar;
            int i3 = vm10Var.f242666i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vm10Var.f242666i = i3 - Integer.MIN_VALUE;
            } else {
                vm10Var = new vm10(this, ibkVar);
            }
        } else {
            vm10Var = new vm10(this, ibkVar);
        }
        Object objM76978s = vm10Var.f242664g;
        ?? r1 = vm10Var.f242666i;
        lsi0 lsi0Var3 = this.f284123f;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                switch (r1) {
                    case 0:
                        bga.m29073P(objM76978s);
                        if (m96396g()) {
                            tm10 tm10Var = this.f284126i;
                            if (tm10Var != null) {
                                return tm10Var;
                            }
                            guf gufVarM62210c = mlg1.m62210c();
                            vm10Var.f242658a = gufVarM62210c;
                            vm10Var.f242659b = null;
                            vm10Var.f242660c = lsi0Var3;
                            vm10Var.f242662e = 0;
                            vm10Var.f242663f = 0;
                            vm10Var.f242666i = 1;
                            if (lsi0Var3.mo54248a(vm10Var) != yukVar) {
                                fufVar2 = gufVarM62210c;
                                jsi0Var = lsi0Var3;
                                i = 0;
                                i2 = 0;
                                fufVar3 = this.f284125h;
                                if (fufVar3 != null) {
                                    fufVar3.mo26601e(null);
                                }
                                this.f284125h = fufVar2;
                                ui10 ui10Var = this.f284118a;
                                vm10Var.f242658a = fufVar2;
                                vm10Var.f242659b = null;
                                vm10Var.f242660c = jsi0Var;
                                vm10Var.f242662e = i2;
                                vm10Var.f242663f = i;
                                vm10Var.f242666i = 2;
                                objM83172b = ui10Var.m83172b(vm10Var);
                                r1 = jsi0Var;
                                if (objM83172b == yukVar) {
                                    if (s6x0.m77348a(objM83172b) != null) {
                                        ((guf) fufVar2).m38797k0(sm10.f210538a);
                                    }
                                    r1.mo54249c(null);
                                    try {
                                        long jM43975g = this.f284120c.m43975g();
                                        s47 s47Var = new s47(fufVar2, fbkVar, 4);
                                        vm10Var.f242658a = fufVar2;
                                        vm10Var.f242659b = null;
                                        vm10Var.f242660c = null;
                                        vm10Var.f242666i = 3;
                                        objM76978s = s1h1.m76978s(jM43975g, s47Var, vm10Var);
                                        if (objM76978s != yukVar) {
                                            fufVar4 = fufVar2;
                                            um10Var = (um10) objM76978s;
                                            vm10Var.f242658a = fufVar4;
                                            vm10Var.f242659b = um10Var;
                                            vm10Var.f242660c = null;
                                            vm10Var.f242661d = lsi0Var3;
                                            vm10Var.f242662e = 0;
                                            vm10Var.f242663f = 0;
                                            vm10Var.f242666i = 4;
                                            if (lsi0Var3.mo54248a(vm10Var) != yukVar) {
                                                fufVar7 = fufVar4;
                                                um10Var2 = um10Var;
                                                lsi0Var2 = lsi0Var3;
                                                try {
                                                    if (this.f284125h == fufVar7) {
                                                        if (fufVar7.isActive()) {
                                                            fufVar7.mo26601e(null);
                                                        }
                                                        this.f284125h = null;
                                                        break;
                                                    }
                                                    return um10Var2;
                                                } finally {
                                                    lsi0Var2.mo54249c(null);
                                                }
                                            }
                                        }
                                    } catch (TimeoutCancellationException unused) {
                                        this.f284119b.m26456c();
                                        vm10Var.f242658a = fufVar2;
                                        vm10Var.f242659b = null;
                                        vm10Var.f242660c = lsi0Var3;
                                        vm10Var.f242662e = 0;
                                        vm10Var.f242663f = 0;
                                        vm10Var.f242666i = 5;
                                        if (lsi0Var3.mo54248a(vm10Var) != yukVar) {
                                            fufVar6 = fufVar2;
                                            jsi0Var2 = lsi0Var3;
                                            try {
                                                jsi0Var3 = jsi0Var2;
                                                if (this.f284125h == fufVar6) {
                                                    if (fufVar6.isActive()) {
                                                        fufVar6.mo26601e(null);
                                                    }
                                                    this.f284125h = null;
                                                    jsi0Var3 = jsi0Var2;
                                                    break;
                                                }
                                                return null;
                                            } finally {
                                                jsi0Var2.mo54249c(null);
                                            }
                                        }
                                    } catch (CancellationException e) {
                                        e = e;
                                        if (fufVar2.isCancelled()) {
                                            throw e;
                                        }
                                        vm10Var.f242658a = fufVar2;
                                        vm10Var.f242659b = null;
                                        vm10Var.f242660c = lsi0Var3;
                                        vm10Var.f242662e = 0;
                                        vm10Var.f242663f = 0;
                                        vm10Var.f242666i = 6;
                                        if (lsi0Var3.mo54248a(vm10Var) != yukVar) {
                                            fufVar5 = fufVar2;
                                            jsi0Var4 = lsi0Var3;
                                            try {
                                                jsi0Var3 = jsi0Var4;
                                                if (this.f284125h == fufVar5) {
                                                    if (fufVar5.isActive()) {
                                                        fufVar5.mo26601e(null);
                                                    }
                                                    this.f284125h = null;
                                                    jsi0Var3 = jsi0Var4;
                                                    break;
                                                }
                                                return null;
                                            } finally {
                                                jsi0Var4.mo54249c(null);
                                            }
                                        }
                                    }
                                    break;
                                }
                            }
                            return yukVar;
                        }
                        return null;
                    case 1:
                        int i4 = vm10Var.f242663f;
                        int i5 = vm10Var.f242662e;
                        jsi0 jsi0Var5 = vm10Var.f242660c;
                        fuf fufVar8 = vm10Var.f242658a;
                        bga.m29073P(objM76978s);
                        i = i4;
                        jsi0Var = jsi0Var5;
                        i2 = i5;
                        fufVar2 = fufVar8;
                        fufVar3 = this.f284125h;
                        if (fufVar3 != null) {
                            fufVar3.mo26601e(null);
                        }
                        this.f284125h = fufVar2;
                        ui10 ui10Var2 = this.f284118a;
                        vm10Var.f242658a = fufVar2;
                        vm10Var.f242659b = null;
                        vm10Var.f242660c = jsi0Var;
                        vm10Var.f242662e = i2;
                        vm10Var.f242663f = i;
                        vm10Var.f242666i = 2;
                        objM83172b = ui10Var2.m83172b(vm10Var);
                        r1 = jsi0Var;
                        if (objM83172b == yukVar) {
                            if (s6x0.m77348a(objM83172b) != null) {
                                ((guf) fufVar2).m38797k0(sm10.f210538a);
                            }
                            r1.mo54249c(null);
                            long jM43975g2 = this.f284120c.m43975g();
                            s47 s47Var2 = new s47(fufVar2, fbkVar, 4);
                            vm10Var.f242658a = fufVar2;
                            vm10Var.f242659b = null;
                            vm10Var.f242660c = null;
                            vm10Var.f242666i = 3;
                            objM76978s = s1h1.m76978s(jM43975g2, s47Var2, vm10Var);
                            if (objM76978s != yukVar) {
                                fufVar4 = fufVar2;
                                um10Var = (um10) objM76978s;
                                vm10Var.f242658a = fufVar4;
                                vm10Var.f242659b = um10Var;
                                vm10Var.f242660c = null;
                                vm10Var.f242661d = lsi0Var3;
                                vm10Var.f242662e = 0;
                                vm10Var.f242663f = 0;
                                vm10Var.f242666i = 4;
                                if (lsi0Var3.mo54248a(vm10Var) != yukVar) {
                                    fufVar7 = fufVar4;
                                    um10Var2 = um10Var;
                                    lsi0Var2 = lsi0Var3;
                                    if (this.f284125h == fufVar7) {
                                        if (fufVar7.isActive()) {
                                            fufVar7.mo26601e(null);
                                        }
                                        this.f284125h = null;
                                        break;
                                    }
                                    return um10Var2;
                                }
                            }
                            break;
                        }
                        return yukVar;
                    case 2:
                        jsi0 jsi0Var6 = vm10Var.f242660c;
                        fufVar2 = vm10Var.f242658a;
                        bga.m29073P(objM76978s);
                        objM83172b = ((s6x0) objM76978s).f206218a;
                        r1 = jsi0Var6;
                        if (s6x0.m77348a(objM83172b) != null) {
                            ((guf) fufVar2).m38797k0(sm10.f210538a);
                            break;
                        }
                        r1.mo54249c(null);
                        long jM43975g3 = this.f284120c.m43975g();
                        s47 s47Var3 = new s47(fufVar2, fbkVar, 4);
                        vm10Var.f242658a = fufVar2;
                        vm10Var.f242659b = null;
                        vm10Var.f242660c = null;
                        vm10Var.f242666i = 3;
                        objM76978s = s1h1.m76978s(jM43975g3, s47Var3, vm10Var);
                        if (objM76978s != yukVar) {
                            fufVar4 = fufVar2;
                            um10Var = (um10) objM76978s;
                            vm10Var.f242658a = fufVar4;
                            vm10Var.f242659b = um10Var;
                            vm10Var.f242660c = null;
                            vm10Var.f242661d = lsi0Var3;
                            vm10Var.f242662e = 0;
                            vm10Var.f242663f = 0;
                            vm10Var.f242666i = 4;
                            if (lsi0Var3.mo54248a(vm10Var) != yukVar) {
                                fufVar7 = fufVar4;
                                um10Var2 = um10Var;
                                lsi0Var2 = lsi0Var3;
                                if (this.f284125h == fufVar7) {
                                    if (fufVar7.isActive()) {
                                        fufVar7.mo26601e(null);
                                    }
                                    this.f284125h = null;
                                    break;
                                }
                                return um10Var2;
                            }
                        }
                        return yukVar;
                    case 3:
                        fufVar4 = vm10Var.f242658a;
                        try {
                            bga.m29073P(objM76978s);
                            um10Var = (um10) objM76978s;
                            vm10Var.f242658a = fufVar4;
                            vm10Var.f242659b = um10Var;
                            vm10Var.f242660c = null;
                            vm10Var.f242661d = lsi0Var3;
                            vm10Var.f242662e = 0;
                            vm10Var.f242663f = 0;
                            vm10Var.f242666i = 4;
                            if (lsi0Var3.mo54248a(vm10Var) != yukVar) {
                                fufVar7 = fufVar4;
                                um10Var2 = um10Var;
                                lsi0Var2 = lsi0Var3;
                                if (this.f284125h == fufVar7) {
                                    if (fufVar7.isActive()) {
                                        fufVar7.mo26601e(null);
                                    }
                                    this.f284125h = null;
                                    break;
                                }
                                return um10Var2;
                            }
                        } catch (TimeoutCancellationException unused2) {
                            fufVar2 = fufVar4;
                            this.f284119b.m26456c();
                            vm10Var.f242658a = fufVar2;
                            vm10Var.f242659b = null;
                            vm10Var.f242660c = lsi0Var3;
                            vm10Var.f242662e = 0;
                            vm10Var.f242663f = 0;
                            vm10Var.f242666i = 5;
                            if (lsi0Var3.mo54248a(vm10Var) != yukVar) {
                                fufVar6 = fufVar2;
                                jsi0Var2 = lsi0Var3;
                                jsi0Var3 = jsi0Var2;
                                if (this.f284125h == fufVar6) {
                                    if (fufVar6.isActive()) {
                                        fufVar6.mo26601e(null);
                                    }
                                    this.f284125h = null;
                                    jsi0Var3 = jsi0Var2;
                                    break;
                                }
                                return null;
                            }
                        } catch (CancellationException e2) {
                            e = e2;
                            fufVar2 = fufVar4;
                            if (fufVar2.isCancelled()) {
                                throw e;
                            }
                            vm10Var.f242658a = fufVar2;
                            vm10Var.f242659b = null;
                            vm10Var.f242660c = lsi0Var3;
                            vm10Var.f242662e = 0;
                            vm10Var.f242663f = 0;
                            vm10Var.f242666i = 6;
                            if (lsi0Var3.mo54248a(vm10Var) != yukVar) {
                                fufVar5 = fufVar2;
                                jsi0Var4 = lsi0Var3;
                                jsi0Var3 = jsi0Var4;
                                if (this.f284125h == fufVar5) {
                                    if (fufVar5.isActive()) {
                                        fufVar5.mo26601e(null);
                                    }
                                    this.f284125h = null;
                                    jsi0Var3 = jsi0Var4;
                                    break;
                                }
                                return null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fuf fufVar9 = fufVar4;
                            th = th;
                            vm10Var.f242658a = fufVar9;
                            vm10Var.f242659b = th;
                            vm10Var.f242660c = null;
                            vm10Var.f242661d = lsi0Var3;
                            vm10Var.f242662e = 0;
                            vm10Var.f242663f = 0;
                            vm10Var.f242666i = 7;
                            if (lsi0Var3.mo54248a(vm10Var) != yukVar) {
                                fufVar = fufVar9;
                                lsi0Var = lsi0Var3;
                                try {
                                    if (this.f284125h == fufVar) {
                                        if (fufVar.isActive()) {
                                            fufVar.mo26601e(null);
                                        }
                                        this.f284125h = null;
                                        break;
                                    }
                                    throw th;
                                } finally {
                                    lsi0Var.mo54249c(null);
                                }
                            }
                        }
                        return yukVar;
                    case 4:
                        lsi0 lsi0Var4 = vm10Var.f242661d;
                        um10Var2 = (um10) vm10Var.f242659b;
                        fufVar7 = vm10Var.f242658a;
                        bga.m29073P(objM76978s);
                        lsi0Var2 = lsi0Var4;
                        if (this.f284125h == fufVar7) {
                            if (fufVar7.isActive()) {
                                fufVar7.mo26601e(null);
                            }
                            this.f284125h = null;
                            break;
                        }
                        return um10Var2;
                    case 5:
                        jsi0 jsi0Var7 = vm10Var.f242660c;
                        fufVar6 = vm10Var.f242658a;
                        bga.m29073P(objM76978s);
                        jsi0Var2 = jsi0Var7;
                        jsi0Var3 = jsi0Var2;
                        if (this.f284125h == fufVar6) {
                            if (fufVar6.isActive()) {
                                fufVar6.mo26601e(null);
                            }
                            this.f284125h = null;
                            jsi0Var3 = jsi0Var2;
                            break;
                        }
                        return null;
                    case 6:
                        jsi0 jsi0Var8 = vm10Var.f242660c;
                        fufVar5 = vm10Var.f242658a;
                        bga.m29073P(objM76978s);
                        jsi0Var4 = jsi0Var8;
                        jsi0Var3 = jsi0Var4;
                        if (this.f284125h == fufVar5) {
                            if (fufVar5.isActive()) {
                                fufVar5.mo26601e(null);
                            }
                            this.f284125h = null;
                            jsi0Var3 = jsi0Var4;
                            break;
                        }
                        return null;
                    case 7:
                        lsi0 lsi0Var5 = vm10Var.f242661d;
                        th = (Throwable) vm10Var.f242659b;
                        fufVar = vm10Var.f242658a;
                        bga.m29073P(objM76978s);
                        lsi0Var = lsi0Var5;
                        if (this.f284125h == fufVar) {
                            if (fufVar.isActive()) {
                                fufVar.mo26601e(null);
                            }
                            this.f284125h = null;
                            break;
                        }
                        throw th;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            r1.mo54249c(null);
            throw th4;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m96396g() {
        return this.f284120c.m43971c() && Build.VERSION.SDK_INT >= 34;
    }
}
