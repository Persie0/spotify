package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class mpx implements h7f {

    /* JADX INFO: renamed from: b */
    public final luk f146106b;

    /* JADX INFO: renamed from: c */
    public pqm0 f146107c;

    /* JADX INFO: renamed from: e */
    public final Object f146109e;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f146105a = 0;

    /* JADX INFO: renamed from: d */
    public final lsi0 f146108d = msi0.m62770a();

    public mpx(er70 er70Var, luk lukVar) {
        this.f146109e = er70Var;
        this.f146106b = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a6 A[Catch: all -> 0x003a, Exception -> 0x003d, CancellationException -> 0x00ad, TRY_LEAVE, TryCatch #7 {all -> 0x003a, blocks: (B:15:0x0035, B:39:0x009e, B:41:0x00a6, B:47:0x00b7), top: B:107:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x0175 A[Catch: all -> 0x010a, Exception -> 0x010d, CancellationException -> 0x017c, TRY_LEAVE, TryCatch #6 {all -> 0x010a, blocks: (B:65:0x0105, B:89:0x016d, B:91:0x0175, B:97:0x0186), top: B:106:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v15, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.String] */
    @Override // p204p.h7f
    /* JADX INFO: renamed from: a */
    public final Object mo46765a(String str, String str2, String str3, ibk ibkVar) throws Throwable {
        kpx kpxVar;
        jsi0 jsi0Var;
        int i;
        ?? r12;
        pqm0 pqm0Var;
        ?? r13;
        jsi0 jsi0Var2;
        Exception e;
        String str4;
        q940 q940Var;
        jsi0 jsi0Var3;
        int i2;
        ?? r14;
        pqm0 pqm0Var2;
        Exception e2;
        ?? r15;
        jsi0 jsi0Var4;
        String str5;
        switch (this.f146105a) {
            case 0:
                if (ibkVar instanceof kpx) {
                    kpxVar = (kpx) ibkVar;
                    int i3 = kpxVar.f125150f;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        kpxVar.f125150f = i3 - Integer.MIN_VALUE;
                    } else {
                        kpxVar = new kpx(this, ibkVar);
                    }
                } else {
                    kpxVar = new kpx(this, ibkVar);
                }
                Object obj = kpxVar.f125148d;
                int i4 = kpxVar.f125150f;
                String str6 = "";
                fbk fbkVar = null;
                Object obj2 = yuk.f276404a;
                try {
                    try {
                        try {
                            if (i4 == 0) {
                                bga.m29073P(obj);
                                kpxVar.f125145a = str2;
                                jsi0Var = this.f146108d;
                                kpxVar.f125146b = jsi0Var;
                                kpxVar.f125147c = 0;
                                kpxVar.f125150f = 1;
                                if (jsi0Var.mo54248a(kpxVar) != obj2) {
                                    i = 0;
                                    r12 = str2;
                                }
                                return obj2;
                            }
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                jsi0Var2 = kpxVar.f125146b;
                                r13 = kpxVar.f125145a;
                                try {
                                    bga.m29073P(obj);
                                    r13 = r13;
                                    str4 = (String) obj;
                                    if (str4.length() > 0) {
                                        this.f146107c = pft0.m69840u(r13, str4);
                                    }
                                    str6 = str4;
                                    break;
                                } catch (CancellationException unused) {
                                } catch (Exception e3) {
                                    e = e3;
                                    Logger.m3967c(e, "Error fetching color for " + r13, new Object[0]);
                                }
                                jsi0Var = jsi0Var2;
                                obj2 = str6;
                                jsi0Var.mo54249c(null);
                                return obj2;
                            }
                            int i5 = kpxVar.f125147c;
                            jsi0 jsi0Var5 = kpxVar.f125146b;
                            String str7 = kpxVar.f125145a;
                            bga.m29073P(obj);
                            jsi0Var = jsi0Var5;
                            i = i5;
                            r12 = str7;
                            if (pqm0Var != null) {
                                String str8 = (String) pqm0Var.f180350a;
                                String str9 = (String) pqm0Var.f180351b;
                                if (wj50.m88271j(r12, str8)) {
                                    obj2 = str9;
                                    jsi0Var.mo54249c(null);
                                }
                                return obj2;
                            }
                            luk lukVar = this.f146106b;
                            dmx dmxVar = new dmx(this, (Object) r12, fbkVar, 2);
                            kpxVar.f125145a = r12;
                            kpxVar.f125146b = jsi0Var;
                            kpxVar.f125147c = i;
                            kpxVar.f125150f = 2;
                            Object objM89557A = x0h1.m89557A(lukVar, dmxVar, kpxVar);
                            if (objM89557A != obj2) {
                                r13 = r12;
                                jsi0Var2 = jsi0Var;
                                obj = objM89557A;
                                str4 = (String) obj;
                                if (str4.length() > 0) {
                                    this.f146107c = pft0.m69840u(r13, str4);
                                }
                                str6 = str4;
                                jsi0Var = jsi0Var2;
                                obj2 = str6;
                                jsi0Var.mo54249c(null);
                            }
                            break;
                        } catch (CancellationException unused2) {
                            jsi0Var2 = jsi0Var;
                        } catch (Exception e4) {
                            r13 = r12;
                            jsi0Var2 = jsi0Var;
                            e = e4;
                            Logger.m3967c(e, "Error fetching color for " + r13, new Object[0]);
                        }
                        pqm0Var = this.f146107c;
                        return obj2;
                    } catch (Throwable th) {
                        th = th;
                        str2 = jsi0Var;
                        str2.mo54249c(null);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            default:
                if (ibkVar instanceof q940) {
                    q940Var = (q940) ibkVar;
                    int i6 = q940Var.f186489f;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        q940Var.f186489f = i6 - Integer.MIN_VALUE;
                    } else {
                        q940Var = new q940(this, ibkVar);
                    }
                } else {
                    q940Var = new q940(this, ibkVar);
                }
                Object obj3 = q940Var.f186487d;
                int i7 = q940Var.f186489f;
                String str10 = "";
                fbk fbkVar2 = null;
                Object obj4 = yuk.f276404a;
                try {
                    try {
                        try {
                            if (i7 == 0) {
                                bga.m29073P(obj3);
                                q940Var.f186484a = str3;
                                jsi0Var3 = this.f146108d;
                                q940Var.f186485b = jsi0Var3;
                                q940Var.f186486c = 0;
                                q940Var.f186489f = 1;
                                if (jsi0Var3.mo54248a(q940Var) != obj4) {
                                    i2 = 0;
                                    r14 = str3;
                                }
                                return obj4;
                            }
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                jsi0Var4 = q940Var.f186485b;
                                r15 = q940Var.f186484a;
                                try {
                                    bga.m29073P(obj3);
                                    r15 = r15;
                                    str5 = (String) obj3;
                                    if (str5.length() > 0) {
                                        this.f146107c = pft0.m69840u(r15, str5);
                                    }
                                    str10 = str5;
                                    break;
                                } catch (CancellationException unused3) {
                                } catch (Exception e5) {
                                    e2 = e5;
                                    Logger.m3967c(e2, "Error fetching color from image-metadata for " + r15, new Object[0]);
                                    e2.printStackTrace();
                                }
                                jsi0Var3 = jsi0Var4;
                                obj4 = str10;
                                jsi0Var3.mo54249c(null);
                                return obj4;
                            }
                            int i8 = q940Var.f186486c;
                            jsi0 jsi0Var6 = q940Var.f186485b;
                            String str11 = q940Var.f186484a;
                            bga.m29073P(obj3);
                            jsi0Var3 = jsi0Var6;
                            i2 = i8;
                            r14 = str11;
                            if (pqm0Var2 != null) {
                                String str12 = (String) pqm0Var2.f180350a;
                                String str13 = (String) pqm0Var2.f180351b;
                                if (wj50.m88271j(r14, str12)) {
                                    obj4 = str13;
                                    jsi0Var3.mo54249c(null);
                                }
                                return obj4;
                            }
                            luk lukVar2 = this.f146106b;
                            es1 es1Var = new es1((Object) r14, this, fbkVar2, 14);
                            q940Var.f186484a = r14;
                            q940Var.f186485b = jsi0Var3;
                            q940Var.f186486c = i2;
                            q940Var.f186489f = 2;
                            Object objM89557A2 = x0h1.m89557A(lukVar2, es1Var, q940Var);
                            if (objM89557A2 != obj4) {
                                jsi0 jsi0Var7 = jsi0Var3;
                                obj3 = objM89557A2;
                                r15 = r14;
                                jsi0Var4 = jsi0Var7;
                                str5 = (String) obj3;
                                if (str5.length() > 0) {
                                    this.f146107c = pft0.m69840u(r15, str5);
                                }
                                str10 = str5;
                                jsi0Var3 = jsi0Var4;
                                obj4 = str10;
                                jsi0Var3.mo54249c(null);
                            }
                            break;
                        } catch (CancellationException unused4) {
                            jsi0Var4 = jsi0Var3;
                        } catch (Exception e6) {
                            jsi0 jsi0Var8 = jsi0Var3;
                            e2 = e6;
                            r15 = r14;
                            jsi0Var4 = jsi0Var8;
                            Logger.m3967c(e2, "Error fetching color from image-metadata for " + r15, new Object[0]);
                            e2.printStackTrace();
                        }
                        pqm0Var2 = this.f146107c;
                        return obj4;
                    } catch (Throwable th3) {
                        th = th3;
                        str3 = jsi0Var3;
                        str3.mo54249c(null);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
        }
    }

    public mpx(epx epxVar, luk lukVar) {
        this.f146109e = epxVar;
        this.f146106b = lukVar;
    }
}
