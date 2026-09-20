package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class bj1 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27584a = 2;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f27585b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f27586c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f27587d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f27588e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f27589f;

    public bj1(String str, boolean z, jxs0 jxs0Var, gh00 gh00Var, kqi0 kqi0Var) {
        this.f27586c = str;
        this.f27585b = z;
        this.f27587d = jxs0Var;
        this.f27588e = gh00Var;
        this.f27589f = kqi0Var;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00bf  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        u8m0 u8m0Var;
        switch (this.f27584a) {
            case 0:
                ej1 ej1Var = (ej1) this.f27587d;
                boolean z = this.f27585b;
                w2a1 w2a1Var = w2a1.f247311a;
                if (z) {
                    ej1Var.f60105g.f59315b.mo46962a(w2a1Var);
                    return w2a1Var;
                }
                lwf lwfVar = (lwf) this.f27588e;
                String str = (String) this.f27589f;
                String str2 = this.f27586c;
                Object objM39158d = ej1.m39158d(ej1Var, lwfVar, str2, false, str, new C2255pg(ej1Var, lwfVar, str2, 6), fbkVar);
                return objM39158d == yuk.f276404a ? objM39158d : w2a1Var;
            case 1:
                if (fbkVar instanceof u8m0) {
                    u8m0Var = (u8m0) fbkVar;
                    int i = u8m0Var.f227981b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        u8m0Var.f227981b = i - Integer.MIN_VALUE;
                    } else {
                        u8m0Var = new u8m0(this, fbkVar);
                    }
                } else {
                    u8m0Var = new u8m0(this, fbkVar);
                }
                Object obj2 = u8m0Var.f227980a;
                int i2 = u8m0Var.f227981b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    niz nizVar = (niz) this.f27587d;
                    List listM46834b = h8m0.m46834b(this.f27585b, this.f27586c, (zt91) this.f27588e, (vdm) this.f27589f, (List) obj);
                    u8m0Var.f227981b = 1;
                    Object objEmit = nizVar.emit(listM46834b, u8m0Var);
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
            default:
                gh00 gh00Var = (gh00) this.f27588e;
                kqi0 kqi0Var = (kqi0) this.f27589f;
                jxs0 jxs0Var = (jxs0) this.f27587d;
                erc1 erc1Var = (erc1) ((gqx) obj).mo45449a(erc1.class, this.f27586c).f72301b;
                if (erc1Var != null) {
                    if (this.f27585b) {
                        m340 m340Var = erc1Var.f62083e;
                        if (m340Var == null && (m340Var = erc1Var.f62080b) == null) {
                            m340Var = erc1Var.f62079a;
                        }
                        z240 z240VarM60640a = m340Var.m60640a(a340.f11862c);
                        jxs0 jxs0VarM54725g = null;
                        String str3 = z240VarM60640a != null ? z240VarM60640a.f278475a.f198763a : null;
                        if (str3 == null || str3.length() == 0) {
                            jxs0 jxs0VarM47535n = hhg1.m47535n(jxs0Var, (mxs0) kqi0Var.getValue(), hhg1.m47527f(erc1Var));
                            if (jxs0VarM47535n != null) {
                                gh00Var.invoke(jxs0VarM47535n);
                            }
                        } else {
                            mxs0 mxs0Var = (mxs0) kqi0Var.getValue();
                            jxs0 jxs0Var2 = mxs0Var instanceof jxs0 ? (jxs0) mxs0Var : null;
                            if (jxs0Var2 != null) {
                                jxs0 jxs0Var3 = (wj50.m88271j(jxs0Var2.f117211a, jxs0Var.f117211a) && wj50.m88271j(jxs0Var2.f117213c, jxs0Var.f117213c)) ? jxs0Var2 : null;
                                if (jxs0Var3 != null) {
                                    jxs0VarM54725g = jxs0.m54725g(jxs0Var3, str3, null, true, false, 703);
                                }
                            }
                            if (jxs0VarM54725g != null) {
                                gh00Var.invoke(jxs0VarM54725g);
                            }
                        }
                    } else {
                        jxs0 jxs0VarM47535n2 = hhg1.m47535n(jxs0Var, (mxs0) kqi0Var.getValue(), hhg1.m47527f(erc1Var));
                        if (jxs0VarM47535n2 != null) {
                            gh00Var.invoke(jxs0VarM47535n2);
                        }
                    }
                }
                return w2a1.f247311a;
        }
    }

    public bj1(niz nizVar, boolean z, String str, zt91 zt91Var, vdm vdmVar) {
        this.f27587d = nizVar;
        this.f27585b = z;
        this.f27586c = str;
        this.f27588e = zt91Var;
        this.f27589f = vdmVar;
    }

    public bj1(boolean z, ej1 ej1Var, lwf lwfVar, String str, String str2) {
        this.f27585b = z;
        this.f27587d = ej1Var;
        this.f27588e = lwfVar;
        this.f27586c = str;
        this.f27589f = str2;
    }
}
