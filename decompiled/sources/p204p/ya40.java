package p204p;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class ya40 implements fft0 {

    /* JADX INFO: renamed from: a */
    public final twy f270791a;

    /* JADX INFO: renamed from: b */
    public final yho f270792b;

    /* JADX INFO: renamed from: c */
    public final zrr0 f270793c;

    /* JADX INFO: renamed from: d */
    public final wvy f270794d;

    /* JADX INFO: renamed from: e */
    public final eet0 f270795e;

    /* JADX INFO: renamed from: f */
    public final up60 f270796f = qpv0.f191387a.mo54112b(l2k0.class);

    public ya40(twy twyVar, yho yhoVar, zrr0 zrr0Var, wvy wvyVar, eet0 eet0Var) {
        this.f270791a = twyVar;
        this.f270792b = yhoVar;
        this.f270793c = zrr0Var;
        this.f270794d = wvyVar;
        this.f270795e = eet0Var;
    }

    @Override // p204p.fft0
    /* JADX INFO: renamed from: a */
    public final up60 mo36355a() {
        return this.f270796f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Serializable m93203c(String str, String str2, ibk ibkVar) {
        va40 va40Var;
        if (ibkVar instanceof va40) {
            va40Var = (va40) ibkVar;
            int i = va40Var.f239122e;
            if ((i & Integer.MIN_VALUE) != 0) {
                va40Var.f239122e = i - Integer.MIN_VALUE;
            } else {
                va40Var = new va40(this, ibkVar);
            }
        } else {
            va40Var = new va40(this, ibkVar);
        }
        Object objM89165b = va40Var.f239120c;
        int i2 = va40Var.f239122e;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(objM89165b);
            if (Build.VERSION.SDK_INT >= 31) {
                va40Var.f239118a = str;
                va40Var.f239119b = str2;
                va40Var.f239122e = 1;
                objM89165b = this.f270794d.m89165b(str, va40Var);
                yuk yukVar = yuk.f276404a;
                if (objM89165b == yukVar) {
                    return yukVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = va40Var.f239119b;
        str = va40Var.f239118a;
        bga.m29073P(objM89165b);
        String str3 = str;
        String str4 = str2;
        if (((Boolean) objM89165b).booleanValue()) {
            return new kga(this, str4, str3, fbkVar, 10);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:35:0x0116  */
    /* JADX WARN: Code duplicated, block: B:37:0x0121  */
    /* JADX WARN: Code duplicated, block: B:41:0x013f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0155  */
    /* JADX WARN: Code duplicated, block: B:48:0x0170  */
    /* JADX WARN: Code duplicated, block: B:52:0x0193  */
    /* JADX WARN: Code duplicated, block: B:54:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x01ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // p204p.fft0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object mo36356b(l2k0 l2k0Var, ibk ibkVar) throws Throwable {
        wa40 wa40Var;
        String str;
        int i;
        gh00 gh00Var;
        gh00 gh00Var2;
        String str2;
        sr4 sr4Var;
        zrr0 zrr0Var;
        String str3;
        sr4 sr4Var2;
        Object objM96770h;
        l2k0 l2k0Var2;
        String str4;
        gh00 gh00Var3;
        gh00 gh00Var4;
        l2k0 l2k0Var3;
        String str5;
        gh00 gh00Var5;
        String str6;
        gh00 gh00Var6;
        gh00 gh00Var7;
        Bitmap bitmap;
        l2k0 l2k0Var4;
        l2k0 l2k0Var5;
        gh00 gh00Var8;
        String str7;
        gh00 gh00Var9;
        Bitmap bitmap2;
        atj0 atj0Var;
        Serializable serializableM93203c;
        atj0 atj0Var2;
        sy61 xc40Var;
        Object objM81781A;
        l2k0 l2k0Var6 = l2k0Var;
        if (ibkVar instanceof wa40) {
            wa40Var = (wa40) ibkVar;
            int i2 = wa40Var.f249362X;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wa40Var.f249362X = i2 - Integer.MIN_VALUE;
            } else {
                wa40Var = new wa40(this, ibkVar);
            }
        } else {
            wa40Var = new wa40(this, ibkVar);
        }
        Object objM96770h2 = wa40Var.f249371i;
        int i3 = wa40Var.f249362X;
        Serializable serializable = yuk.f276404a;
        switch (i3) {
            case 0:
                bga.m29073P(objM96770h2);
                xa40 xa40Var = new xa40(this, l2k0Var6, 1);
                xa40 xa40Var2 = new xa40(this, l2k0Var6, 0);
                str = l2k0Var6.f129030d;
                wa40Var.f249363a = l2k0Var6;
                wa40Var.f249364b = xa40Var;
                wa40Var.f249365c = xa40Var2;
                wa40Var.f249366d = str;
                wa40Var.f249367e = "image_load";
                i = 0;
                wa40Var.f249370h = 0;
                wa40Var.f249362X = 1;
                sr4 sr4VarM62226s = mlg1.m62226s(wa40Var);
                if (sr4VarM62226s != serializable) {
                    gh00Var = xa40Var;
                    objM96770h2 = sr4VarM62226s;
                    gh00Var2 = xa40Var2;
                    str2 = "image_load";
                    sr4Var = (sr4) objM96770h2;
                    zrr0Var = this.f270793c;
                    if (sr4Var == null) {
                        wa40Var.f249363a = l2k0Var6;
                        wa40Var.f249364b = gh00Var;
                        wa40Var.f249365c = gh00Var2;
                        wa40Var.f249366d = str;
                        wa40Var.f249367e = null;
                        wa40Var.f249368f = null;
                        wa40Var.f249370h = i;
                        wa40Var.f249362X = 2;
                        objM96770h2 = zrr0Var.m96770h(str, wa40Var);
                        if (objM96770h2 != serializable) {
                            gh00Var4 = gh00Var2;
                            l2k0Var3 = l2k0Var6;
                            str5 = str;
                            gh00Var5 = gh00Var;
                            gh00 gh00Var10 = gh00Var5;
                            str6 = str5;
                            gh00Var6 = gh00Var4;
                            gh00Var7 = gh00Var10;
                            bitmap = (Bitmap) objM96770h2;
                            if (bitmap != null) {
                                wa40Var.f249363a = l2k0Var3;
                                wa40Var.f249364b = gh00Var7;
                                wa40Var.f249365c = gh00Var6;
                                wa40Var.f249366d = str6;
                                wa40Var.f249367e = bitmap;
                                wa40Var.f249368f = null;
                                wa40Var.f249369g = null;
                                wa40Var.f249362X = 4;
                                if (mlg1.m62222o("presenter_type", "image", wa40Var) != serializable) {
                                    l2k0Var5 = l2k0Var3;
                                    gh00Var8 = gh00Var7;
                                    str7 = str6;
                                    gh00Var9 = gh00Var6;
                                    bitmap2 = bitmap;
                                    atj0Var = l2k0Var5.f129029c;
                                    String str8 = l2k0Var5.f129032f.f250329c;
                                    wa40Var.f249363a = l2k0Var5;
                                    wa40Var.f249364b = gh00Var8;
                                    wa40Var.f249365c = gh00Var9;
                                    wa40Var.f249366d = null;
                                    wa40Var.f249367e = null;
                                    wa40Var.f249368f = atj0Var;
                                    wa40Var.f249369g = bitmap2;
                                    wa40Var.f249362X = 5;
                                    serializableM93203c = m93203c(str7, str8, wa40Var);
                                    if (serializableM93203c != serializable) {
                                        atj0Var2 = atj0Var;
                                        objM96770h2 = serializableM93203c;
                                        xc40Var = new xc40(atj0Var2, bitmap2, (th00) objM96770h2, gh00Var8, gh00Var9, l2k0Var5.f129032f, l2k0Var5.f129031e, null);
                                        wa40Var.f249363a = null;
                                        wa40Var.f249364b = null;
                                        wa40Var.f249365c = null;
                                        wa40Var.f249366d = null;
                                        wa40Var.f249367e = null;
                                        wa40Var.f249368f = null;
                                        wa40Var.f249369g = null;
                                        wa40Var.f249362X = 7;
                                        objM81781A = this.f270791a.m81781A(xc40Var, wa40Var);
                                        if (objM81781A != serializable) {
                                            return objM81781A;
                                        }
                                    }
                                }
                            } else {
                                wa40Var.f249363a = l2k0Var3;
                                wa40Var.f249364b = gh00Var7;
                                wa40Var.f249365c = gh00Var6;
                                wa40Var.f249366d = null;
                                wa40Var.f249367e = null;
                                wa40Var.f249368f = null;
                                wa40Var.f249369g = null;
                                wa40Var.f249362X = 6;
                                if (mlg1.m62222o("presenter_type", "simple", wa40Var) != serializable) {
                                    l2k0Var4 = l2k0Var3;
                                    xc40Var = new cd21(l2k0Var4.f129029c, gh00Var7, gh00Var6, l2k0Var4.f129032f, l2k0Var4.f129031e, 32);
                                    wa40Var.f249363a = null;
                                    wa40Var.f249364b = null;
                                    wa40Var.f249365c = null;
                                    wa40Var.f249366d = null;
                                    wa40Var.f249367e = null;
                                    wa40Var.f249368f = null;
                                    wa40Var.f249369g = null;
                                    wa40Var.f249362X = 7;
                                    objM81781A = this.f270791a.m81781A(xc40Var, wa40Var);
                                    if (objM81781A != serializable) {
                                        return objM81781A;
                                    }
                                }
                            }
                        }
                    } else {
                        sr4Var.m79019k(str2, null, (4 & 4) != 0);
                        try {
                            wa40Var.f249363a = l2k0Var6;
                            wa40Var.f249364b = gh00Var;
                            wa40Var.f249365c = gh00Var2;
                            wa40Var.f249366d = str;
                            wa40Var.f249367e = str2;
                            wa40Var.f249368f = null;
                            wa40Var.f249369g = sr4Var;
                            wa40Var.f249370h = i;
                            wa40Var.f249362X = 3;
                            objM96770h = zrr0Var.m96770h(str, wa40Var);
                            if (objM96770h != serializable) {
                                gh00 gh00Var11 = gh00Var;
                                l2k0Var2 = l2k0Var6;
                                str4 = str;
                                str3 = str2;
                                sr4Var2 = sr4Var;
                                objM96770h2 = objM96770h;
                                gh00Var3 = gh00Var11;
                                sr4Var2.m79016f(str3);
                                str6 = str4;
                                gh00Var6 = gh00Var2;
                                gh00Var7 = gh00Var3;
                                l2k0Var3 = l2k0Var2;
                                bitmap = (Bitmap) objM96770h2;
                                if (bitmap != null) {
                                    wa40Var.f249363a = l2k0Var3;
                                    wa40Var.f249364b = gh00Var7;
                                    wa40Var.f249365c = gh00Var6;
                                    wa40Var.f249366d = str6;
                                    wa40Var.f249367e = bitmap;
                                    wa40Var.f249368f = null;
                                    wa40Var.f249369g = null;
                                    wa40Var.f249362X = 4;
                                    if (mlg1.m62222o("presenter_type", "image", wa40Var) != serializable) {
                                        l2k0Var5 = l2k0Var3;
                                        gh00Var8 = gh00Var7;
                                        str7 = str6;
                                        gh00Var9 = gh00Var6;
                                        bitmap2 = bitmap;
                                        atj0Var = l2k0Var5.f129029c;
                                        String str9 = l2k0Var5.f129032f.f250329c;
                                        wa40Var.f249363a = l2k0Var5;
                                        wa40Var.f249364b = gh00Var8;
                                        wa40Var.f249365c = gh00Var9;
                                        wa40Var.f249366d = null;
                                        wa40Var.f249367e = null;
                                        wa40Var.f249368f = atj0Var;
                                        wa40Var.f249369g = bitmap2;
                                        wa40Var.f249362X = 5;
                                        serializableM93203c = m93203c(str7, str9, wa40Var);
                                        if (serializableM93203c != serializable) {
                                            atj0Var2 = atj0Var;
                                            objM96770h2 = serializableM93203c;
                                            xc40Var = new xc40(atj0Var2, bitmap2, (th00) objM96770h2, gh00Var8, gh00Var9, l2k0Var5.f129032f, l2k0Var5.f129031e, null);
                                            wa40Var.f249363a = null;
                                            wa40Var.f249364b = null;
                                            wa40Var.f249365c = null;
                                            wa40Var.f249366d = null;
                                            wa40Var.f249367e = null;
                                            wa40Var.f249368f = null;
                                            wa40Var.f249369g = null;
                                            wa40Var.f249362X = 7;
                                            objM81781A = this.f270791a.m81781A(xc40Var, wa40Var);
                                            if (objM81781A != serializable) {
                                                return objM81781A;
                                            }
                                        }
                                    }
                                } else {
                                    wa40Var.f249363a = l2k0Var3;
                                    wa40Var.f249364b = gh00Var7;
                                    wa40Var.f249365c = gh00Var6;
                                    wa40Var.f249366d = null;
                                    wa40Var.f249367e = null;
                                    wa40Var.f249368f = null;
                                    wa40Var.f249369g = null;
                                    wa40Var.f249362X = 6;
                                    if (mlg1.m62222o("presenter_type", "simple", wa40Var) != serializable) {
                                        l2k0Var4 = l2k0Var3;
                                        xc40Var = new cd21(l2k0Var4.f129029c, gh00Var7, gh00Var6, l2k0Var4.f129032f, l2k0Var4.f129031e, 32);
                                        wa40Var.f249363a = null;
                                        wa40Var.f249364b = null;
                                        wa40Var.f249365c = null;
                                        wa40Var.f249366d = null;
                                        wa40Var.f249367e = null;
                                        wa40Var.f249368f = null;
                                        wa40Var.f249369g = null;
                                        wa40Var.f249362X = 7;
                                        objM81781A = this.f270791a.m81781A(xc40Var, wa40Var);
                                        if (objM81781A != serializable) {
                                            return objM81781A;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            str3 = str2;
                            sr4Var2 = sr4Var;
                            sr4Var2.m79016f(str3);
                            throw th;
                        }
                    }
                }
                return serializable;
            case 1:
                int i4 = wa40Var.f249370h;
                str2 = (String) wa40Var.f249367e;
                str = wa40Var.f249366d;
                gh00Var2 = wa40Var.f249365c;
                gh00 gh00Var12 = wa40Var.f249364b;
                l2k0 l2k0Var7 = wa40Var.f249363a;
                bga.m29073P(objM96770h2);
                i = i4;
                l2k0Var6 = l2k0Var7;
                gh00Var = gh00Var12;
                sr4Var = (sr4) objM96770h2;
                zrr0Var = this.f270793c;
                if (sr4Var == null) {
                    wa40Var.f249363a = l2k0Var6;
                    wa40Var.f249364b = gh00Var;
                    wa40Var.f249365c = gh00Var2;
                    wa40Var.f249366d = str;
                    wa40Var.f249367e = null;
                    wa40Var.f249368f = null;
                    wa40Var.f249370h = i;
                    wa40Var.f249362X = 2;
                    objM96770h2 = zrr0Var.m96770h(str, wa40Var);
                    if (objM96770h2 != serializable) {
                        gh00Var4 = gh00Var2;
                        l2k0Var3 = l2k0Var6;
                        str5 = str;
                        gh00Var5 = gh00Var;
                        gh00 gh00Var13 = gh00Var5;
                        str6 = str5;
                        gh00Var6 = gh00Var4;
                        gh00Var7 = gh00Var13;
                        bitmap = (Bitmap) objM96770h2;
                        if (bitmap != null) {
                            wa40Var.f249363a = l2k0Var3;
                            wa40Var.f249364b = gh00Var7;
                            wa40Var.f249365c = gh00Var6;
                            wa40Var.f249366d = str6;
                            wa40Var.f249367e = bitmap;
                            wa40Var.f249368f = null;
                            wa40Var.f249369g = null;
                            wa40Var.f249362X = 4;
                            if (mlg1.m62222o("presenter_type", "image", wa40Var) != serializable) {
                                l2k0Var5 = l2k0Var3;
                                gh00Var8 = gh00Var7;
                                str7 = str6;
                                gh00Var9 = gh00Var6;
                                bitmap2 = bitmap;
                                atj0Var = l2k0Var5.f129029c;
                                String str10 = l2k0Var5.f129032f.f250329c;
                                wa40Var.f249363a = l2k0Var5;
                                wa40Var.f249364b = gh00Var8;
                                wa40Var.f249365c = gh00Var9;
                                wa40Var.f249366d = null;
                                wa40Var.f249367e = null;
                                wa40Var.f249368f = atj0Var;
                                wa40Var.f249369g = bitmap2;
                                wa40Var.f249362X = 5;
                                serializableM93203c = m93203c(str7, str10, wa40Var);
                                if (serializableM93203c != serializable) {
                                    atj0Var2 = atj0Var;
                                    objM96770h2 = serializableM93203c;
                                    xc40Var = new xc40(atj0Var2, bitmap2, (th00) objM96770h2, gh00Var8, gh00Var9, l2k0Var5.f129032f, l2k0Var5.f129031e, null);
                                    wa40Var.f249363a = null;
                                    wa40Var.f249364b = null;
                                    wa40Var.f249365c = null;
                                    wa40Var.f249366d = null;
                                    wa40Var.f249367e = null;
                                    wa40Var.f249368f = null;
                                    wa40Var.f249369g = null;
                                    wa40Var.f249362X = 7;
                                    objM81781A = this.f270791a.m81781A(xc40Var, wa40Var);
                                    if (objM81781A != serializable) {
                                        return objM81781A;
                                    }
                                }
                            }
                        } else {
                            wa40Var.f249363a = l2k0Var3;
                            wa40Var.f249364b = gh00Var7;
                            wa40Var.f249365c = gh00Var6;
                            wa40Var.f249366d = null;
                            wa40Var.f249367e = null;
                            wa40Var.f249368f = null;
                            wa40Var.f249369g = null;
                            wa40Var.f249362X = 6;
                            if (mlg1.m62222o("presenter_type", "simple", wa40Var) != serializable) {
                                l2k0Var4 = l2k0Var3;
                                xc40Var = new cd21(l2k0Var4.f129029c, gh00Var7, gh00Var6, l2k0Var4.f129032f, l2k0Var4.f129031e, 32);
                                wa40Var.f249363a = null;
                                wa40Var.f249364b = null;
                                wa40Var.f249365c = null;
                                wa40Var.f249366d = null;
                                wa40Var.f249367e = null;
                                wa40Var.f249368f = null;
                                wa40Var.f249369g = null;
                                wa40Var.f249362X = 7;
                                objM81781A = this.f270791a.m81781A(xc40Var, wa40Var);
                                if (objM81781A != serializable) {
                                    return objM81781A;
                                }
                            }
                        }
                    }
                } else {
                    sr4Var.m79019k(str2, null, (4 & 4) != 0);
                    wa40Var.f249363a = l2k0Var6;
                    wa40Var.f249364b = gh00Var;
                    wa40Var.f249365c = gh00Var2;
                    wa40Var.f249366d = str;
                    wa40Var.f249367e = str2;
                    wa40Var.f249368f = null;
                    wa40Var.f249369g = sr4Var;
                    wa40Var.f249370h = i;
                    wa40Var.f249362X = 3;
                    objM96770h = zrr0Var.m96770h(str, wa40Var);
                    if (objM96770h != serializable) {
                        gh00 gh00Var14 = gh00Var;
                        l2k0Var2 = l2k0Var6;
                        str4 = str;
                        str3 = str2;
                        sr4Var2 = sr4Var;
                        objM96770h2 = objM96770h;
                        gh00Var3 = gh00Var14;
                        sr4Var2.m79016f(str3);
                        str6 = str4;
                        gh00Var6 = gh00Var2;
                        gh00Var7 = gh00Var3;
                        l2k0Var3 = l2k0Var2;
                        bitmap = (Bitmap) objM96770h2;
                        if (bitmap != null) {
                            wa40Var.f249363a = l2k0Var3;
                            wa40Var.f249364b = gh00Var7;
                            wa40Var.f249365c = gh00Var6;
                            wa40Var.f249366d = str6;
                            wa40Var.f249367e = bitmap;
                            wa40Var.f249368f = null;
                            wa40Var.f249369g = null;
                            wa40Var.f249362X = 4;
                            if (mlg1.m62222o("presenter_type", "image", wa40Var) != serializable) {
                                l2k0Var5 = l2k0Var3;
                                gh00Var8 = gh00Var7;
                                str7 = str6;
                                gh00Var9 = gh00Var6;
                                bitmap2 = bitmap;
                                atj0Var = l2k0Var5.f129029c;
                                String str11 = l2k0Var5.f129032f.f250329c;
                                wa40Var.f249363a = l2k0Var5;
                                wa40Var.f249364b = gh00Var8;
                                wa40Var.f249365c = gh00Var9;
                                wa40Var.f249366d = null;
                                wa40Var.f249367e = null;
                                wa40Var.f249368f = atj0Var;
                                wa40Var.f249369g = bitmap2;
                                wa40Var.f249362X = 5;
                                serializableM93203c = m93203c(str7, str11, wa40Var);
                                if (serializableM93203c != serializable) {
                                    atj0Var2 = atj0Var;
                                    objM96770h2 = serializableM93203c;
                                    xc40Var = new xc40(atj0Var2, bitmap2, (th00) objM96770h2, gh00Var8, gh00Var9, l2k0Var5.f129032f, l2k0Var5.f129031e, null);
                                    wa40Var.f249363a = null;
                                    wa40Var.f249364b = null;
                                    wa40Var.f249365c = null;
                                    wa40Var.f249366d = null;
                                    wa40Var.f249367e = null;
                                    wa40Var.f249368f = null;
                                    wa40Var.f249369g = null;
                                    wa40Var.f249362X = 7;
                                    objM81781A = this.f270791a.m81781A(xc40Var, wa40Var);
                                    if (objM81781A != serializable) {
                                        return objM81781A;
                                    }
                                }
                            }
                        } else {
                            wa40Var.f249363a = l2k0Var3;
                            wa40Var.f249364b = gh00Var7;
                            wa40Var.f249365c = gh00Var6;
                            wa40Var.f249366d = null;
                            wa40Var.f249367e = null;
                            wa40Var.f249368f = null;
                            wa40Var.f249369g = null;
                            wa40Var.f249362X = 6;
                            if (mlg1.m62222o("presenter_type", "simple", wa40Var) != serializable) {
                                l2k0Var4 = l2k0Var3;
                                xc40Var = new cd21(l2k0Var4.f129029c, gh00Var7, gh00Var6, l2k0Var4.f129032f, l2k0Var4.f129031e, 32);
                                wa40Var.f249363a = null;
                                wa40Var.f249364b = null;
                                wa40Var.f249365c = null;
                                wa40Var.f249366d = null;
                                wa40Var.f249367e = null;
                                wa40Var.f249368f = null;
                                wa40Var.f249369g = null;
                                wa40Var.f249362X = 7;
                                objM81781A = this.f270791a.m81781A(xc40Var, wa40Var);
                                if (objM81781A != serializable) {
                                    return objM81781A;
                                }
                            }
                        }
                    }
                }
                return serializable;
            case 2:
                str5 = wa40Var.f249366d;
                gh00Var4 = wa40Var.f249365c;
                gh00Var5 = wa40Var.f249364b;
                l2k0Var3 = wa40Var.f249363a;
                bga.m29073P(objM96770h2);
                gh00 gh00Var15 = gh00Var5;
                str6 = str5;
                gh00Var6 = gh00Var4;
                gh00Var7 = gh00Var15;
                bitmap = (Bitmap) objM96770h2;
                if (bitmap != null) {
                    wa40Var.f249363a = l2k0Var3;
                    wa40Var.f249364b = gh00Var7;
                    wa40Var.f249365c = gh00Var6;
                    wa40Var.f249366d = str6;
                    wa40Var.f249367e = bitmap;
                    wa40Var.f249368f = null;
                    wa40Var.f249369g = null;
                    wa40Var.f249362X = 4;
                    if (mlg1.m62222o("presenter_type", "image", wa40Var) != serializable) {
                        l2k0Var5 = l2k0Var3;
                        gh00Var8 = gh00Var7;
                        str7 = str6;
                        gh00Var9 = gh00Var6;
                        bitmap2 = bitmap;
                        atj0Var = l2k0Var5.f129029c;
                        String str12 = l2k0Var5.f129032f.f250329c;
                        wa40Var.f249363a = l2k0Var5;
                        wa40Var.f249364b = gh00Var8;
                        wa40Var.f249365c = gh00Var9;
                        wa40Var.f249366d = null;
                        wa40Var.f249367e = null;
                        wa40Var.f249368f = atj0Var;
                        wa40Var.f249369g = bitmap2;
                        wa40Var.f249362X = 5;
                        serializableM93203c = m93203c(str7, str12, wa40Var);
                        if (serializableM93203c != serializable) {
                            atj0Var2 = atj0Var;
                            objM96770h2 = serializableM93203c;
                            xc40Var = new xc40(atj0Var2, bitmap2, (th00) objM96770h2, gh00Var8, gh00Var9, l2k0Var5.f129032f, l2k0Var5.f129031e, null);
                            wa40Var.f249363a = null;
                            wa40Var.f249364b = null;
                            wa40Var.f249365c = null;
                            wa40Var.f249366d = null;
                            wa40Var.f249367e = null;
                            wa40Var.f249368f = null;
                            wa40Var.f249369g = null;
                            wa40Var.f249362X = 7;
                            objM81781A = this.f270791a.m81781A(xc40Var, wa40Var);
                            if (objM81781A != serializable) {
                                return objM81781A;
                            }
                        }
                    }
                } else {
                    wa40Var.f249363a = l2k0Var3;
                    wa40Var.f249364b = gh00Var7;
                    wa40Var.f249365c = gh00Var6;
                    wa40Var.f249366d = null;
                    wa40Var.f249367e = null;
                    wa40Var.f249368f = null;
                    wa40Var.f249369g = null;
                    wa40Var.f249362X = 6;
                    if (mlg1.m62222o("presenter_type", "simple", wa40Var) != serializable) {
                        l2k0Var4 = l2k0Var3;
                        xc40Var = new cd21(l2k0Var4.f129029c, gh00Var7, gh00Var6, l2k0Var4.f129032f, l2k0Var4.f129031e, 32);
                        wa40Var.f249363a = null;
                        wa40Var.f249364b = null;
                        wa40Var.f249365c = null;
                        wa40Var.f249366d = null;
                        wa40Var.f249367e = null;
                        wa40Var.f249368f = null;
                        wa40Var.f249369g = null;
                        wa40Var.f249362X = 7;
                        objM81781A = this.f270791a.m81781A(xc40Var, wa40Var);
                        if (objM81781A != serializable) {
                            return objM81781A;
                        }
                    }
                }
                return serializable;
            case 3:
                sr4Var2 = (sr4) wa40Var.f249369g;
                str3 = (String) wa40Var.f249367e;
                str4 = wa40Var.f249366d;
                gh00Var2 = wa40Var.f249365c;
                gh00Var3 = wa40Var.f249364b;
                l2k0Var2 = wa40Var.f249363a;
                try {
                    bga.m29073P(objM96770h2);
                    sr4Var2.m79016f(str3);
                    str6 = str4;
                    gh00Var6 = gh00Var2;
                    gh00Var7 = gh00Var3;
                    l2k0Var3 = l2k0Var2;
                    bitmap = (Bitmap) objM96770h2;
                    if (bitmap != null) {
                        wa40Var.f249363a = l2k0Var3;
                        wa40Var.f249364b = gh00Var7;
                        wa40Var.f249365c = gh00Var6;
                        wa40Var.f249366d = str6;
                        wa40Var.f249367e = bitmap;
                        wa40Var.f249368f = null;
                        wa40Var.f249369g = null;
                        wa40Var.f249362X = 4;
                        if (mlg1.m62222o("presenter_type", "image", wa40Var) != serializable) {
                            l2k0Var5 = l2k0Var3;
                            gh00Var8 = gh00Var7;
                            str7 = str6;
                            gh00Var9 = gh00Var6;
                            bitmap2 = bitmap;
                            atj0Var = l2k0Var5.f129029c;
                            String str13 = l2k0Var5.f129032f.f250329c;
                            wa40Var.f249363a = l2k0Var5;
                            wa40Var.f249364b = gh00Var8;
                            wa40Var.f249365c = gh00Var9;
                            wa40Var.f249366d = null;
                            wa40Var.f249367e = null;
                            wa40Var.f249368f = atj0Var;
                            wa40Var.f249369g = bitmap2;
                            wa40Var.f249362X = 5;
                            serializableM93203c = m93203c(str7, str13, wa40Var);
                            if (serializableM93203c != serializable) {
                                atj0Var2 = atj0Var;
                                objM96770h2 = serializableM93203c;
                                xc40Var = new xc40(atj0Var2, bitmap2, (th00) objM96770h2, gh00Var8, gh00Var9, l2k0Var5.f129032f, l2k0Var5.f129031e, null);
                                wa40Var.f249363a = null;
                                wa40Var.f249364b = null;
                                wa40Var.f249365c = null;
                                wa40Var.f249366d = null;
                                wa40Var.f249367e = null;
                                wa40Var.f249368f = null;
                                wa40Var.f249369g = null;
                                wa40Var.f249362X = 7;
                                objM81781A = this.f270791a.m81781A(xc40Var, wa40Var);
                                if (objM81781A != serializable) {
                                    return objM81781A;
                                }
                            }
                        }
                    } else {
                        wa40Var.f249363a = l2k0Var3;
                        wa40Var.f249364b = gh00Var7;
                        wa40Var.f249365c = gh00Var6;
                        wa40Var.f249366d = null;
                        wa40Var.f249367e = null;
                        wa40Var.f249368f = null;
                        wa40Var.f249369g = null;
                        wa40Var.f249362X = 6;
                        if (mlg1.m62222o("presenter_type", "simple", wa40Var) != serializable) {
                            l2k0Var4 = l2k0Var3;
                            xc40Var = new cd21(l2k0Var4.f129029c, gh00Var7, gh00Var6, l2k0Var4.f129032f, l2k0Var4.f129031e, 32);
                            wa40Var.f249363a = null;
                            wa40Var.f249364b = null;
                            wa40Var.f249365c = null;
                            wa40Var.f249366d = null;
                            wa40Var.f249367e = null;
                            wa40Var.f249368f = null;
                            wa40Var.f249369g = null;
                            wa40Var.f249362X = 7;
                            objM81781A = this.f270791a.m81781A(xc40Var, wa40Var);
                            if (objM81781A != serializable) {
                                return objM81781A;
                            }
                        }
                    }
                    return serializable;
                } catch (Throwable th2) {
                    th = th2;
                    sr4Var2.m79016f(str3);
                    throw th;
                }
            case 4:
                bitmap2 = (Bitmap) wa40Var.f249367e;
                str7 = wa40Var.f249366d;
                gh00Var9 = wa40Var.f249365c;
                gh00Var8 = wa40Var.f249364b;
                l2k0Var5 = wa40Var.f249363a;
                bga.m29073P(objM96770h2);
                atj0Var = l2k0Var5.f129029c;
                String str14 = l2k0Var5.f129032f.f250329c;
                wa40Var.f249363a = l2k0Var5;
                wa40Var.f249364b = gh00Var8;
                wa40Var.f249365c = gh00Var9;
                wa40Var.f249366d = null;
                wa40Var.f249367e = null;
                wa40Var.f249368f = atj0Var;
                wa40Var.f249369g = bitmap2;
                wa40Var.f249362X = 5;
                serializableM93203c = m93203c(str7, str14, wa40Var);
                if (serializableM93203c != serializable) {
                    atj0Var2 = atj0Var;
                    objM96770h2 = serializableM93203c;
                    xc40Var = new xc40(atj0Var2, bitmap2, (th00) objM96770h2, gh00Var8, gh00Var9, l2k0Var5.f129032f, l2k0Var5.f129031e, null);
                    wa40Var.f249363a = null;
                    wa40Var.f249364b = null;
                    wa40Var.f249365c = null;
                    wa40Var.f249366d = null;
                    wa40Var.f249367e = null;
                    wa40Var.f249368f = null;
                    wa40Var.f249369g = null;
                    wa40Var.f249362X = 7;
                    objM81781A = this.f270791a.m81781A(xc40Var, wa40Var);
                    if (objM81781A != serializable) {
                        return objM81781A;
                    }
                }
                return serializable;
            case 5:
                bitmap2 = (Bitmap) wa40Var.f249369g;
                atj0 atj0Var3 = wa40Var.f249368f;
                gh00Var9 = wa40Var.f249365c;
                gh00Var8 = wa40Var.f249364b;
                l2k0Var5 = wa40Var.f249363a;
                bga.m29073P(objM96770h2);
                atj0Var2 = atj0Var3;
                xc40Var = new xc40(atj0Var2, bitmap2, (th00) objM96770h2, gh00Var8, gh00Var9, l2k0Var5.f129032f, l2k0Var5.f129031e, null);
                wa40Var.f249363a = null;
                wa40Var.f249364b = null;
                wa40Var.f249365c = null;
                wa40Var.f249366d = null;
                wa40Var.f249367e = null;
                wa40Var.f249368f = null;
                wa40Var.f249369g = null;
                wa40Var.f249362X = 7;
                objM81781A = this.f270791a.m81781A(xc40Var, wa40Var);
                if (objM81781A != serializable) {
                    return serializable;
                }
                return objM81781A;
            case 6:
                gh00Var6 = wa40Var.f249365c;
                gh00Var7 = wa40Var.f249364b;
                l2k0Var4 = wa40Var.f249363a;
                bga.m29073P(objM96770h2);
                xc40Var = new cd21(l2k0Var4.f129029c, gh00Var7, gh00Var6, l2k0Var4.f129032f, l2k0Var4.f129031e, 32);
                wa40Var.f249363a = null;
                wa40Var.f249364b = null;
                wa40Var.f249365c = null;
                wa40Var.f249366d = null;
                wa40Var.f249367e = null;
                wa40Var.f249368f = null;
                wa40Var.f249369g = null;
                wa40Var.f249362X = 7;
                objM81781A = this.f270791a.m81781A(xc40Var, wa40Var);
                if (objM81781A != serializable) {
                    return serializable;
                }
                return objM81781A;
            case 7:
                bga.m29073P(objM96770h2);
                return objM96770h2;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
