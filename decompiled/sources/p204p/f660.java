package p204p;

import android.graphics.Bitmap;
import android.os.Build;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class f660 implements fft0 {

    /* JADX INFO: renamed from: a */
    public final twy f66286a;

    /* JADX INFO: renamed from: b */
    public final yho f66287b;

    /* JADX INFO: renamed from: c */
    public final yho f66288c;

    /* JADX INFO: renamed from: d */
    public final zrr0 f66289d;

    /* JADX INFO: renamed from: e */
    public final wvy f66290e;

    /* JADX INFO: renamed from: f */
    public final eet0 f66291f;

    /* JADX INFO: renamed from: g */
    public final up60 f66292g = qpv0.f191387a.mo54112b(m2k0.class);

    public f660(twy twyVar, yho yhoVar, yho yhoVar2, zrr0 zrr0Var, wvy wvyVar, eet0 eet0Var) {
        this.f66286a = twyVar;
        this.f66287b = yhoVar;
        this.f66288c = yhoVar2;
        this.f66289d = zrr0Var;
        this.f66290e = wvyVar;
        this.f66291f = eet0Var;
    }

    @Override // p204p.fft0
    /* JADX INFO: renamed from: a */
    public final up60 mo36355a() {
        return this.f66292g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Serializable m40832c(String str, String str2, ibk ibkVar) {
        c660 c660Var;
        if (ibkVar instanceof c660) {
            c660Var = (c660) ibkVar;
            int i = c660Var.f34405e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c660Var.f34405e = i - Integer.MIN_VALUE;
            } else {
                c660Var = new c660(this, ibkVar);
            }
        } else {
            c660Var = new c660(this, ibkVar);
        }
        Object objM89165b = c660Var.f34403c;
        int i2 = c660Var.f34405e;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(objM89165b);
            if (Build.VERSION.SDK_INT >= 31) {
                c660Var.f34401a = str;
                c660Var.f34402b = str2;
                c660Var.f34405e = 1;
                objM89165b = this.f66290e.m89165b(str, c660Var);
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
        str2 = c660Var.f34402b;
        str = c660Var.f34401a;
        bga.m29073P(objM89165b);
        String str3 = str;
        String str4 = str2;
        if (((Boolean) objM89165b).booleanValue()) {
            return new kga(this, str4, str3, fbkVar, 11);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0140  */
    /* JADX WARN: Code duplicated, block: B:34:0x0151  */
    /* JADX WARN: Code duplicated, block: B:37:0x0168  */
    /* JADX WARN: Code duplicated, block: B:39:0x016b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0175  */
    /* JADX WARN: Code duplicated, block: B:43:0x0186  */
    /* JADX WARN: Code duplicated, block: B:46:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:52:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:53:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:57:0x020a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0222  */
    /* JADX WARN: Code duplicated, block: B:67:0x022c  */
    /* JADX WARN: Code duplicated, block: B:70:0x024e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0277  */
    /* JADX WARN: Code duplicated, block: B:77:0x0296  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:87:0x02f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x02fa A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02b4, code lost:
    
        if (p204p.mlg1.m62222o("presenter_type", "simple", r2) == r9) goto L87;
     */
    @Override // p204p.fft0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo36356b(m2k0 m2k0Var, ibk ibkVar) throws Throwable {
        d660 d660Var;
        m2k0 m2k0Var2;
        boolean zBooleanValue;
        int iM32395l0;
        Integer numValueOf;
        Long lValueOf;
        gh00 e660Var;
        e660 e660Var2;
        String str;
        m2k0 m2k0Var3;
        Long l;
        gh00 gh00Var;
        String str2;
        boolean z;
        Bitmap bitmap;
        sr4 sr4VarM62226s;
        m2k0 m2k0Var4;
        Long l2;
        int i;
        gh00 gh00Var2;
        String str3;
        String str4;
        gh00 gh00Var3;
        int i2;
        sr4 sr4Var;
        zrr0 zrr0Var;
        sr4 sr4Var2;
        gh00 gh00Var4;
        String str5;
        gh00 gh00Var5;
        Long l3;
        m2k0 m2k0Var5;
        gh00 gh00Var6;
        gh00 gh00Var7;
        Bitmap bitmap2;
        atj0 atj0Var;
        Serializable serializableM40832c;
        Bitmap bitmap3;
        m2k0 m2k0Var6;
        atj0 atj0Var2;
        sy61 xc40Var;
        Object objM81781A;
        if (ibkVar instanceof d660) {
            d660Var = (d660) ibkVar;
            int i3 = d660Var.f45598M0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                d660Var.f45598M0 = i3 - Integer.MIN_VALUE;
            } else {
                d660Var = new d660(this, ibkVar);
            }
        } else {
            d660Var = new d660(this, ibkVar);
        }
        Object objM96567o = d660Var.f45601Z;
        int i4 = d660Var.f45598M0;
        yho yhoVar = this.f66288c;
        Serializable serializable = yuk.f276404a;
        switch (i4) {
            case 0:
                bga.m29073P(objM96567o);
                String strM45501p = grg1.m45501p(m2k0Var);
                Single singleOnErrorResumeNext = ((Observable) yhoVar.f272929d).doOnSubscribe(new tjp(25, yhoVar, strM45501p)).firstOrError().flatMap(new m600(22, yhoVar, strM45501p)).onErrorResumeNext(new ndy(26, yhoVar, strM45501p));
                m2k0Var2 = m2k0Var;
                d660Var.f45602a = m2k0Var2;
                d660Var.f45598M0 = 1;
                objM96567o = zn91.m96567o(singleOnErrorResumeNext, d660Var);
                if (objM96567o != serializable) {
                    zBooleanValue = ((Boolean) objM96567o).booleanValue();
                    if (!zBooleanValue) {
                        return new vb20(new jqj0(1), m2k0Var2.f139377f, grg1.m45501p(m2k0Var2));
                    }
                    iM32395l0 = ((cd4) ((a660) yhoVar.f272927b).f12703a.get()).m32395l0();
                    numValueOf = Integer.valueOf(iM32395l0);
                    if (iM32395l0 <= 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        lValueOf = Long.valueOf(numValueOf.intValue());
                    } else {
                        lValueOf = null;
                    }
                    e660Var = new e660(this, m2k0Var2, 1);
                    e660Var2 = new e660(this, m2k0Var2, 0);
                    str = m2k0Var2.f139375d;
                    if (str == null) {
                        m2k0Var3 = m2k0Var2;
                        l = lValueOf;
                        gh00Var = e660Var2;
                        str2 = str;
                        z = zBooleanValue;
                        bitmap = null;
                        if (bitmap != null) {
                            d660Var.f45602a = m2k0Var3;
                            d660Var.f45603b = l;
                            d660Var.f45604c = e660Var;
                            d660Var.f45605d = gh00Var;
                            d660Var.f45606e = null;
                            d660Var.f45607f = null;
                            d660Var.f45608g = null;
                            d660Var.f45609h = null;
                            d660Var.f45610i = null;
                            d660Var.f45611t = z;
                            d660Var.f45598M0 = 7;
                        } else {
                            d660Var.f45602a = m2k0Var3;
                            d660Var.f45603b = l;
                            d660Var.f45604c = e660Var;
                            d660Var.f45605d = gh00Var;
                            d660Var.f45606e = str2;
                            d660Var.f45607f = bitmap;
                            d660Var.f45608g = null;
                            d660Var.f45609h = null;
                            d660Var.f45610i = null;
                            d660Var.f45611t = z;
                            d660Var.f45598M0 = 5;
                            if (mlg1.m62222o("presenter_type", "image", d660Var) != serializable) {
                                gh00Var7 = gh00Var;
                                bitmap2 = bitmap;
                                atj0Var = m2k0Var3.f139374c;
                                wj50.m88279p(str2);
                                String str6 = m2k0Var3.f139377f.f250329c;
                                d660Var.f45602a = m2k0Var3;
                                d660Var.f45603b = l;
                                d660Var.f45604c = e660Var;
                                d660Var.f45605d = gh00Var7;
                                d660Var.f45606e = null;
                                d660Var.f45607f = null;
                                d660Var.f45608g = atj0Var;
                                d660Var.f45609h = bitmap2;
                                d660Var.f45611t = z;
                                d660Var.f45598M0 = 6;
                                serializableM40832c = m40832c(str2, str6, d660Var);
                                if (serializableM40832c != serializable) {
                                    bitmap3 = bitmap2;
                                    m2k0Var6 = m2k0Var3;
                                    atj0Var2 = atj0Var;
                                    objM96567o = serializableM40832c;
                                    xc40Var = new xc40(atj0Var2, bitmap3, (th00) objM96567o, e660Var, gh00Var7, m2k0Var6.f139377f, m2k0Var6.f139376e, new cii(l));
                                    d660Var.f45602a = null;
                                    d660Var.f45603b = null;
                                    d660Var.f45604c = null;
                                    d660Var.f45605d = null;
                                    d660Var.f45606e = null;
                                    d660Var.f45607f = null;
                                    d660Var.f45608g = null;
                                    d660Var.f45609h = null;
                                    d660Var.f45611t = z;
                                    d660Var.f45598M0 = 8;
                                    objM81781A = this.f66286a.m81781A(xc40Var, d660Var);
                                    if (objM81781A != serializable) {
                                        return objM81781A;
                                    }
                                }
                            }
                        }
                    } else {
                        d660Var.f45602a = m2k0Var2;
                        d660Var.f45603b = lValueOf;
                        d660Var.f45604c = e660Var;
                        d660Var.f45605d = e660Var2;
                        d660Var.f45606e = str;
                        d660Var.f45607f = str;
                        d660Var.f45608g = "image_load";
                        d660Var.f45609h = d660Var;
                        d660Var.f45611t = zBooleanValue;
                        d660Var.f45599X = 0;
                        d660Var.f45600Y = 0;
                        d660Var.f45598M0 = 2;
                        sr4VarM62226s = mlg1.m62226s(d660Var);
                        if (sr4VarM62226s != serializable) {
                            m2k0Var4 = m2k0Var2;
                            l2 = lValueOf;
                            i = 0;
                            gh00Var2 = e660Var;
                            str3 = "image_load";
                            str4 = str;
                            z = zBooleanValue;
                            objM96567o = sr4VarM62226s;
                            gh00Var3 = e660Var2;
                            i2 = 0;
                            sr4Var = (sr4) objM96567o;
                            zrr0Var = this.f66289d;
                            if (sr4Var != null) {
                                d660Var.f45602a = m2k0Var4;
                                d660Var.f45603b = l2;
                                d660Var.f45604c = gh00Var2;
                                d660Var.f45605d = gh00Var3;
                                d660Var.f45606e = str4;
                                d660Var.f45607f = null;
                                d660Var.f45608g = null;
                                d660Var.f45609h = null;
                                d660Var.f45611t = z;
                                d660Var.f45599X = i2;
                                d660Var.f45600Y = i;
                                d660Var.f45598M0 = 3;
                                objM96567o = zrr0Var.m96770h(str, d660Var);
                                if (objM96567o != serializable) {
                                    str5 = str4;
                                    gh00Var5 = gh00Var3;
                                    l3 = l2;
                                    m2k0Var5 = m2k0Var4;
                                    gh00Var6 = gh00Var2;
                                    bitmap = (Bitmap) objM96567o;
                                    str2 = str5;
                                    gh00Var = gh00Var5;
                                    e660Var = gh00Var6;
                                    l = l3;
                                    m2k0Var3 = m2k0Var5;
                                    if (bitmap != null) {
                                        d660Var.f45602a = m2k0Var3;
                                        d660Var.f45603b = l;
                                        d660Var.f45604c = e660Var;
                                        d660Var.f45605d = gh00Var;
                                        d660Var.f45606e = null;
                                        d660Var.f45607f = null;
                                        d660Var.f45608g = null;
                                        d660Var.f45609h = null;
                                        d660Var.f45610i = null;
                                        d660Var.f45611t = z;
                                        d660Var.f45598M0 = 7;
                                    } else {
                                        d660Var.f45602a = m2k0Var3;
                                        d660Var.f45603b = l;
                                        d660Var.f45604c = e660Var;
                                        d660Var.f45605d = gh00Var;
                                        d660Var.f45606e = str2;
                                        d660Var.f45607f = bitmap;
                                        d660Var.f45608g = null;
                                        d660Var.f45609h = null;
                                        d660Var.f45610i = null;
                                        d660Var.f45611t = z;
                                        d660Var.f45598M0 = 5;
                                        if (mlg1.m62222o("presenter_type", "image", d660Var) != serializable) {
                                            gh00Var7 = gh00Var;
                                            bitmap2 = bitmap;
                                            atj0Var = m2k0Var3.f139374c;
                                            wj50.m88279p(str2);
                                            String str7 = m2k0Var3.f139377f.f250329c;
                                            d660Var.f45602a = m2k0Var3;
                                            d660Var.f45603b = l;
                                            d660Var.f45604c = e660Var;
                                            d660Var.f45605d = gh00Var7;
                                            d660Var.f45606e = null;
                                            d660Var.f45607f = null;
                                            d660Var.f45608g = atj0Var;
                                            d660Var.f45609h = bitmap2;
                                            d660Var.f45611t = z;
                                            d660Var.f45598M0 = 6;
                                            serializableM40832c = m40832c(str2, str7, d660Var);
                                            if (serializableM40832c != serializable) {
                                                bitmap3 = bitmap2;
                                                m2k0Var6 = m2k0Var3;
                                                atj0Var2 = atj0Var;
                                                objM96567o = serializableM40832c;
                                                xc40Var = new xc40(atj0Var2, bitmap3, (th00) objM96567o, e660Var, gh00Var7, m2k0Var6.f139377f, m2k0Var6.f139376e, new cii(l));
                                                d660Var.f45602a = null;
                                                d660Var.f45603b = null;
                                                d660Var.f45604c = null;
                                                d660Var.f45605d = null;
                                                d660Var.f45606e = null;
                                                d660Var.f45607f = null;
                                                d660Var.f45608g = null;
                                                d660Var.f45609h = null;
                                                d660Var.f45611t = z;
                                                d660Var.f45598M0 = 8;
                                                objM81781A = this.f66286a.m81781A(xc40Var, d660Var);
                                                if (objM81781A != serializable) {
                                                    return objM81781A;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                sr4Var.m79019k(str3, null, (4 & 4) != 0);
                                try {
                                    d660Var.f45602a = m2k0Var4;
                                    d660Var.f45603b = l2;
                                    d660Var.f45604c = gh00Var2;
                                    d660Var.f45605d = gh00Var3;
                                    d660Var.f45606e = str4;
                                    d660Var.f45607f = null;
                                    d660Var.f45608g = str3;
                                    d660Var.f45609h = null;
                                    d660Var.f45610i = sr4Var;
                                    d660Var.f45611t = z;
                                    d660Var.f45599X = i2;
                                    d660Var.f45600Y = i;
                                    d660Var.f45598M0 = 4;
                                    objM96567o = zrr0Var.m96770h(str, d660Var);
                                    if (objM96567o != serializable) {
                                        sr4Var2 = sr4Var;
                                        gh00Var4 = gh00Var2;
                                        sr4Var2.m79016f(str3);
                                        str5 = str4;
                                        gh00Var5 = gh00Var3;
                                        gh00Var6 = gh00Var4;
                                        l3 = l2;
                                        m2k0Var5 = m2k0Var4;
                                        bitmap = (Bitmap) objM96567o;
                                        str2 = str5;
                                        gh00Var = gh00Var5;
                                        e660Var = gh00Var6;
                                        l = l3;
                                        m2k0Var3 = m2k0Var5;
                                        if (bitmap != null) {
                                            d660Var.f45602a = m2k0Var3;
                                            d660Var.f45603b = l;
                                            d660Var.f45604c = e660Var;
                                            d660Var.f45605d = gh00Var;
                                            d660Var.f45606e = null;
                                            d660Var.f45607f = null;
                                            d660Var.f45608g = null;
                                            d660Var.f45609h = null;
                                            d660Var.f45610i = null;
                                            d660Var.f45611t = z;
                                            d660Var.f45598M0 = 7;
                                        } else {
                                            d660Var.f45602a = m2k0Var3;
                                            d660Var.f45603b = l;
                                            d660Var.f45604c = e660Var;
                                            d660Var.f45605d = gh00Var;
                                            d660Var.f45606e = str2;
                                            d660Var.f45607f = bitmap;
                                            d660Var.f45608g = null;
                                            d660Var.f45609h = null;
                                            d660Var.f45610i = null;
                                            d660Var.f45611t = z;
                                            d660Var.f45598M0 = 5;
                                            if (mlg1.m62222o("presenter_type", "image", d660Var) != serializable) {
                                                gh00Var7 = gh00Var;
                                                bitmap2 = bitmap;
                                                atj0Var = m2k0Var3.f139374c;
                                                wj50.m88279p(str2);
                                                String str8 = m2k0Var3.f139377f.f250329c;
                                                d660Var.f45602a = m2k0Var3;
                                                d660Var.f45603b = l;
                                                d660Var.f45604c = e660Var;
                                                d660Var.f45605d = gh00Var7;
                                                d660Var.f45606e = null;
                                                d660Var.f45607f = null;
                                                d660Var.f45608g = atj0Var;
                                                d660Var.f45609h = bitmap2;
                                                d660Var.f45611t = z;
                                                d660Var.f45598M0 = 6;
                                                serializableM40832c = m40832c(str2, str8, d660Var);
                                                if (serializableM40832c != serializable) {
                                                    bitmap3 = bitmap2;
                                                    m2k0Var6 = m2k0Var3;
                                                    atj0Var2 = atj0Var;
                                                    objM96567o = serializableM40832c;
                                                    xc40Var = new xc40(atj0Var2, bitmap3, (th00) objM96567o, e660Var, gh00Var7, m2k0Var6.f139377f, m2k0Var6.f139376e, new cii(l));
                                                    d660Var.f45602a = null;
                                                    d660Var.f45603b = null;
                                                    d660Var.f45604c = null;
                                                    d660Var.f45605d = null;
                                                    d660Var.f45606e = null;
                                                    d660Var.f45607f = null;
                                                    d660Var.f45608g = null;
                                                    d660Var.f45609h = null;
                                                    d660Var.f45611t = z;
                                                    d660Var.f45598M0 = 8;
                                                    objM81781A = this.f66286a.m81781A(xc40Var, d660Var);
                                                    if (objM81781A != serializable) {
                                                        return objM81781A;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    sr4Var2 = sr4Var;
                                    sr4Var2.m79016f(str3);
                                    throw th;
                                }
                            }
                        }
                    }
                    break;
                }
                return serializable;
            case 1:
                m2k0Var2 = d660Var.f45602a;
                bga.m29073P(objM96567o);
                zBooleanValue = ((Boolean) objM96567o).booleanValue();
                if (!zBooleanValue) {
                    return new vb20(new jqj0(1), m2k0Var2.f139377f, grg1.m45501p(m2k0Var2));
                }
                iM32395l0 = ((cd4) ((a660) yhoVar.f272927b).f12703a.get()).m32395l0();
                numValueOf = Integer.valueOf(iM32395l0);
                if (iM32395l0 <= 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    lValueOf = Long.valueOf(numValueOf.intValue());
                } else {
                    lValueOf = null;
                }
                e660Var = new e660(this, m2k0Var2, 1);
                e660Var2 = new e660(this, m2k0Var2, 0);
                str = m2k0Var2.f139375d;
                if (str == null) {
                    d660Var.f45602a = m2k0Var2;
                    d660Var.f45603b = lValueOf;
                    d660Var.f45604c = e660Var;
                    d660Var.f45605d = e660Var2;
                    d660Var.f45606e = str;
                    d660Var.f45607f = str;
                    d660Var.f45608g = "image_load";
                    d660Var.f45609h = d660Var;
                    d660Var.f45611t = zBooleanValue;
                    d660Var.f45599X = 0;
                    d660Var.f45600Y = 0;
                    d660Var.f45598M0 = 2;
                    sr4VarM62226s = mlg1.m62226s(d660Var);
                    if (sr4VarM62226s != serializable) {
                        m2k0Var4 = m2k0Var2;
                        l2 = lValueOf;
                        i = 0;
                        gh00Var2 = e660Var;
                        str3 = "image_load";
                        str4 = str;
                        z = zBooleanValue;
                        objM96567o = sr4VarM62226s;
                        gh00Var3 = e660Var2;
                        i2 = 0;
                        sr4Var = (sr4) objM96567o;
                        zrr0Var = this.f66289d;
                        if (sr4Var != null) {
                            sr4Var.m79019k(str3, null, (4 & 4) != 0);
                            d660Var.f45602a = m2k0Var4;
                            d660Var.f45603b = l2;
                            d660Var.f45604c = gh00Var2;
                            d660Var.f45605d = gh00Var3;
                            d660Var.f45606e = str4;
                            d660Var.f45607f = null;
                            d660Var.f45608g = str3;
                            d660Var.f45609h = null;
                            d660Var.f45610i = sr4Var;
                            d660Var.f45611t = z;
                            d660Var.f45599X = i2;
                            d660Var.f45600Y = i;
                            d660Var.f45598M0 = 4;
                            objM96567o = zrr0Var.m96770h(str, d660Var);
                            if (objM96567o != serializable) {
                                sr4Var2 = sr4Var;
                                gh00Var4 = gh00Var2;
                                sr4Var2.m79016f(str3);
                                str5 = str4;
                                gh00Var5 = gh00Var3;
                                gh00Var6 = gh00Var4;
                                l3 = l2;
                                m2k0Var5 = m2k0Var4;
                                bitmap = (Bitmap) objM96567o;
                                str2 = str5;
                                gh00Var = gh00Var5;
                                e660Var = gh00Var6;
                                l = l3;
                                m2k0Var3 = m2k0Var5;
                                if (bitmap != null) {
                                    d660Var.f45602a = m2k0Var3;
                                    d660Var.f45603b = l;
                                    d660Var.f45604c = e660Var;
                                    d660Var.f45605d = gh00Var;
                                    d660Var.f45606e = null;
                                    d660Var.f45607f = null;
                                    d660Var.f45608g = null;
                                    d660Var.f45609h = null;
                                    d660Var.f45610i = null;
                                    d660Var.f45611t = z;
                                    d660Var.f45598M0 = 7;
                                } else {
                                    d660Var.f45602a = m2k0Var3;
                                    d660Var.f45603b = l;
                                    d660Var.f45604c = e660Var;
                                    d660Var.f45605d = gh00Var;
                                    d660Var.f45606e = str2;
                                    d660Var.f45607f = bitmap;
                                    d660Var.f45608g = null;
                                    d660Var.f45609h = null;
                                    d660Var.f45610i = null;
                                    d660Var.f45611t = z;
                                    d660Var.f45598M0 = 5;
                                    if (mlg1.m62222o("presenter_type", "image", d660Var) != serializable) {
                                        gh00Var7 = gh00Var;
                                        bitmap2 = bitmap;
                                        atj0Var = m2k0Var3.f139374c;
                                        wj50.m88279p(str2);
                                        String str9 = m2k0Var3.f139377f.f250329c;
                                        d660Var.f45602a = m2k0Var3;
                                        d660Var.f45603b = l;
                                        d660Var.f45604c = e660Var;
                                        d660Var.f45605d = gh00Var7;
                                        d660Var.f45606e = null;
                                        d660Var.f45607f = null;
                                        d660Var.f45608g = atj0Var;
                                        d660Var.f45609h = bitmap2;
                                        d660Var.f45611t = z;
                                        d660Var.f45598M0 = 6;
                                        serializableM40832c = m40832c(str2, str9, d660Var);
                                        if (serializableM40832c != serializable) {
                                            bitmap3 = bitmap2;
                                            m2k0Var6 = m2k0Var3;
                                            atj0Var2 = atj0Var;
                                            objM96567o = serializableM40832c;
                                            xc40Var = new xc40(atj0Var2, bitmap3, (th00) objM96567o, e660Var, gh00Var7, m2k0Var6.f139377f, m2k0Var6.f139376e, new cii(l));
                                            d660Var.f45602a = null;
                                            d660Var.f45603b = null;
                                            d660Var.f45604c = null;
                                            d660Var.f45605d = null;
                                            d660Var.f45606e = null;
                                            d660Var.f45607f = null;
                                            d660Var.f45608g = null;
                                            d660Var.f45609h = null;
                                            d660Var.f45611t = z;
                                            d660Var.f45598M0 = 8;
                                            objM81781A = this.f66286a.m81781A(xc40Var, d660Var);
                                            if (objM81781A != serializable) {
                                                return objM81781A;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            d660Var.f45602a = m2k0Var4;
                            d660Var.f45603b = l2;
                            d660Var.f45604c = gh00Var2;
                            d660Var.f45605d = gh00Var3;
                            d660Var.f45606e = str4;
                            d660Var.f45607f = null;
                            d660Var.f45608g = null;
                            d660Var.f45609h = null;
                            d660Var.f45611t = z;
                            d660Var.f45599X = i2;
                            d660Var.f45600Y = i;
                            d660Var.f45598M0 = 3;
                            objM96567o = zrr0Var.m96770h(str, d660Var);
                            if (objM96567o != serializable) {
                                str5 = str4;
                                gh00Var5 = gh00Var3;
                                l3 = l2;
                                m2k0Var5 = m2k0Var4;
                                gh00Var6 = gh00Var2;
                                bitmap = (Bitmap) objM96567o;
                                str2 = str5;
                                gh00Var = gh00Var5;
                                e660Var = gh00Var6;
                                l = l3;
                                m2k0Var3 = m2k0Var5;
                                if (bitmap != null) {
                                    d660Var.f45602a = m2k0Var3;
                                    d660Var.f45603b = l;
                                    d660Var.f45604c = e660Var;
                                    d660Var.f45605d = gh00Var;
                                    d660Var.f45606e = null;
                                    d660Var.f45607f = null;
                                    d660Var.f45608g = null;
                                    d660Var.f45609h = null;
                                    d660Var.f45610i = null;
                                    d660Var.f45611t = z;
                                    d660Var.f45598M0 = 7;
                                } else {
                                    d660Var.f45602a = m2k0Var3;
                                    d660Var.f45603b = l;
                                    d660Var.f45604c = e660Var;
                                    d660Var.f45605d = gh00Var;
                                    d660Var.f45606e = str2;
                                    d660Var.f45607f = bitmap;
                                    d660Var.f45608g = null;
                                    d660Var.f45609h = null;
                                    d660Var.f45610i = null;
                                    d660Var.f45611t = z;
                                    d660Var.f45598M0 = 5;
                                    if (mlg1.m62222o("presenter_type", "image", d660Var) != serializable) {
                                        gh00Var7 = gh00Var;
                                        bitmap2 = bitmap;
                                        atj0Var = m2k0Var3.f139374c;
                                        wj50.m88279p(str2);
                                        String str10 = m2k0Var3.f139377f.f250329c;
                                        d660Var.f45602a = m2k0Var3;
                                        d660Var.f45603b = l;
                                        d660Var.f45604c = e660Var;
                                        d660Var.f45605d = gh00Var7;
                                        d660Var.f45606e = null;
                                        d660Var.f45607f = null;
                                        d660Var.f45608g = atj0Var;
                                        d660Var.f45609h = bitmap2;
                                        d660Var.f45611t = z;
                                        d660Var.f45598M0 = 6;
                                        serializableM40832c = m40832c(str2, str10, d660Var);
                                        if (serializableM40832c != serializable) {
                                            bitmap3 = bitmap2;
                                            m2k0Var6 = m2k0Var3;
                                            atj0Var2 = atj0Var;
                                            objM96567o = serializableM40832c;
                                            xc40Var = new xc40(atj0Var2, bitmap3, (th00) objM96567o, e660Var, gh00Var7, m2k0Var6.f139377f, m2k0Var6.f139376e, new cii(l));
                                            d660Var.f45602a = null;
                                            d660Var.f45603b = null;
                                            d660Var.f45604c = null;
                                            d660Var.f45605d = null;
                                            d660Var.f45606e = null;
                                            d660Var.f45607f = null;
                                            d660Var.f45608g = null;
                                            d660Var.f45609h = null;
                                            d660Var.f45611t = z;
                                            d660Var.f45598M0 = 8;
                                            objM81781A = this.f66286a.m81781A(xc40Var, d660Var);
                                            if (objM81781A != serializable) {
                                                return objM81781A;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                } else {
                    m2k0Var3 = m2k0Var2;
                    l = lValueOf;
                    gh00Var = e660Var2;
                    str2 = str;
                    z = zBooleanValue;
                    bitmap = null;
                    if (bitmap != null) {
                        d660Var.f45602a = m2k0Var3;
                        d660Var.f45603b = l;
                        d660Var.f45604c = e660Var;
                        d660Var.f45605d = gh00Var;
                        d660Var.f45606e = null;
                        d660Var.f45607f = null;
                        d660Var.f45608g = null;
                        d660Var.f45609h = null;
                        d660Var.f45610i = null;
                        d660Var.f45611t = z;
                        d660Var.f45598M0 = 7;
                    } else {
                        d660Var.f45602a = m2k0Var3;
                        d660Var.f45603b = l;
                        d660Var.f45604c = e660Var;
                        d660Var.f45605d = gh00Var;
                        d660Var.f45606e = str2;
                        d660Var.f45607f = bitmap;
                        d660Var.f45608g = null;
                        d660Var.f45609h = null;
                        d660Var.f45610i = null;
                        d660Var.f45611t = z;
                        d660Var.f45598M0 = 5;
                        if (mlg1.m62222o("presenter_type", "image", d660Var) != serializable) {
                            gh00Var7 = gh00Var;
                            bitmap2 = bitmap;
                            atj0Var = m2k0Var3.f139374c;
                            wj50.m88279p(str2);
                            String str11 = m2k0Var3.f139377f.f250329c;
                            d660Var.f45602a = m2k0Var3;
                            d660Var.f45603b = l;
                            d660Var.f45604c = e660Var;
                            d660Var.f45605d = gh00Var7;
                            d660Var.f45606e = null;
                            d660Var.f45607f = null;
                            d660Var.f45608g = atj0Var;
                            d660Var.f45609h = bitmap2;
                            d660Var.f45611t = z;
                            d660Var.f45598M0 = 6;
                            serializableM40832c = m40832c(str2, str11, d660Var);
                            if (serializableM40832c != serializable) {
                                bitmap3 = bitmap2;
                                m2k0Var6 = m2k0Var3;
                                atj0Var2 = atj0Var;
                                objM96567o = serializableM40832c;
                                xc40Var = new xc40(atj0Var2, bitmap3, (th00) objM96567o, e660Var, gh00Var7, m2k0Var6.f139377f, m2k0Var6.f139376e, new cii(l));
                                d660Var.f45602a = null;
                                d660Var.f45603b = null;
                                d660Var.f45604c = null;
                                d660Var.f45605d = null;
                                d660Var.f45606e = null;
                                d660Var.f45607f = null;
                                d660Var.f45608g = null;
                                d660Var.f45609h = null;
                                d660Var.f45611t = z;
                                d660Var.f45598M0 = 8;
                                objM81781A = this.f66286a.m81781A(xc40Var, d660Var);
                                if (objM81781A != serializable) {
                                    return objM81781A;
                                }
                            }
                        }
                    }
                    break;
                }
                return serializable;
            case 2:
                int i5 = d660Var.f45600Y;
                int i6 = d660Var.f45599X;
                boolean z2 = d660Var.f45611t;
                String str12 = (String) d660Var.f45608g;
                str = (String) d660Var.f45607f;
                String str13 = d660Var.f45606e;
                gh00 gh00Var8 = d660Var.f45605d;
                gh00Var2 = d660Var.f45604c;
                Long l4 = d660Var.f45603b;
                m2k0 m2k0Var7 = d660Var.f45602a;
                bga.m29073P(objM96567o);
                i = i5;
                z = z2;
                str4 = str13;
                l2 = l4;
                i2 = i6;
                str3 = str12;
                gh00Var3 = gh00Var8;
                m2k0Var4 = m2k0Var7;
                sr4Var = (sr4) objM96567o;
                zrr0Var = this.f66289d;
                if (sr4Var != null) {
                    d660Var.f45602a = m2k0Var4;
                    d660Var.f45603b = l2;
                    d660Var.f45604c = gh00Var2;
                    d660Var.f45605d = gh00Var3;
                    d660Var.f45606e = str4;
                    d660Var.f45607f = null;
                    d660Var.f45608g = null;
                    d660Var.f45609h = null;
                    d660Var.f45611t = z;
                    d660Var.f45599X = i2;
                    d660Var.f45600Y = i;
                    d660Var.f45598M0 = 3;
                    objM96567o = zrr0Var.m96770h(str, d660Var);
                    if (objM96567o != serializable) {
                        str5 = str4;
                        gh00Var5 = gh00Var3;
                        l3 = l2;
                        m2k0Var5 = m2k0Var4;
                        gh00Var6 = gh00Var2;
                        bitmap = (Bitmap) objM96567o;
                        str2 = str5;
                        gh00Var = gh00Var5;
                        e660Var = gh00Var6;
                        l = l3;
                        m2k0Var3 = m2k0Var5;
                        if (bitmap != null) {
                            d660Var.f45602a = m2k0Var3;
                            d660Var.f45603b = l;
                            d660Var.f45604c = e660Var;
                            d660Var.f45605d = gh00Var;
                            d660Var.f45606e = null;
                            d660Var.f45607f = null;
                            d660Var.f45608g = null;
                            d660Var.f45609h = null;
                            d660Var.f45610i = null;
                            d660Var.f45611t = z;
                            d660Var.f45598M0 = 7;
                        } else {
                            d660Var.f45602a = m2k0Var3;
                            d660Var.f45603b = l;
                            d660Var.f45604c = e660Var;
                            d660Var.f45605d = gh00Var;
                            d660Var.f45606e = str2;
                            d660Var.f45607f = bitmap;
                            d660Var.f45608g = null;
                            d660Var.f45609h = null;
                            d660Var.f45610i = null;
                            d660Var.f45611t = z;
                            d660Var.f45598M0 = 5;
                            if (mlg1.m62222o("presenter_type", "image", d660Var) != serializable) {
                                gh00Var7 = gh00Var;
                                bitmap2 = bitmap;
                                atj0Var = m2k0Var3.f139374c;
                                wj50.m88279p(str2);
                                String str14 = m2k0Var3.f139377f.f250329c;
                                d660Var.f45602a = m2k0Var3;
                                d660Var.f45603b = l;
                                d660Var.f45604c = e660Var;
                                d660Var.f45605d = gh00Var7;
                                d660Var.f45606e = null;
                                d660Var.f45607f = null;
                                d660Var.f45608g = atj0Var;
                                d660Var.f45609h = bitmap2;
                                d660Var.f45611t = z;
                                d660Var.f45598M0 = 6;
                                serializableM40832c = m40832c(str2, str14, d660Var);
                                if (serializableM40832c != serializable) {
                                    bitmap3 = bitmap2;
                                    m2k0Var6 = m2k0Var3;
                                    atj0Var2 = atj0Var;
                                    objM96567o = serializableM40832c;
                                    xc40Var = new xc40(atj0Var2, bitmap3, (th00) objM96567o, e660Var, gh00Var7, m2k0Var6.f139377f, m2k0Var6.f139376e, new cii(l));
                                    d660Var.f45602a = null;
                                    d660Var.f45603b = null;
                                    d660Var.f45604c = null;
                                    d660Var.f45605d = null;
                                    d660Var.f45606e = null;
                                    d660Var.f45607f = null;
                                    d660Var.f45608g = null;
                                    d660Var.f45609h = null;
                                    d660Var.f45611t = z;
                                    d660Var.f45598M0 = 8;
                                    objM81781A = this.f66286a.m81781A(xc40Var, d660Var);
                                    if (objM81781A != serializable) {
                                        return objM81781A;
                                    }
                                }
                            }
                        }
                    }
                    break;
                } else {
                    sr4Var.m79019k(str3, null, (4 & 4) != 0);
                    d660Var.f45602a = m2k0Var4;
                    d660Var.f45603b = l2;
                    d660Var.f45604c = gh00Var2;
                    d660Var.f45605d = gh00Var3;
                    d660Var.f45606e = str4;
                    d660Var.f45607f = null;
                    d660Var.f45608g = str3;
                    d660Var.f45609h = null;
                    d660Var.f45610i = sr4Var;
                    d660Var.f45611t = z;
                    d660Var.f45599X = i2;
                    d660Var.f45600Y = i;
                    d660Var.f45598M0 = 4;
                    objM96567o = zrr0Var.m96770h(str, d660Var);
                    if (objM96567o != serializable) {
                        sr4Var2 = sr4Var;
                        gh00Var4 = gh00Var2;
                        sr4Var2.m79016f(str3);
                        str5 = str4;
                        gh00Var5 = gh00Var3;
                        gh00Var6 = gh00Var4;
                        l3 = l2;
                        m2k0Var5 = m2k0Var4;
                        bitmap = (Bitmap) objM96567o;
                        str2 = str5;
                        gh00Var = gh00Var5;
                        e660Var = gh00Var6;
                        l = l3;
                        m2k0Var3 = m2k0Var5;
                        if (bitmap != null) {
                            d660Var.f45602a = m2k0Var3;
                            d660Var.f45603b = l;
                            d660Var.f45604c = e660Var;
                            d660Var.f45605d = gh00Var;
                            d660Var.f45606e = null;
                            d660Var.f45607f = null;
                            d660Var.f45608g = null;
                            d660Var.f45609h = null;
                            d660Var.f45610i = null;
                            d660Var.f45611t = z;
                            d660Var.f45598M0 = 7;
                        } else {
                            d660Var.f45602a = m2k0Var3;
                            d660Var.f45603b = l;
                            d660Var.f45604c = e660Var;
                            d660Var.f45605d = gh00Var;
                            d660Var.f45606e = str2;
                            d660Var.f45607f = bitmap;
                            d660Var.f45608g = null;
                            d660Var.f45609h = null;
                            d660Var.f45610i = null;
                            d660Var.f45611t = z;
                            d660Var.f45598M0 = 5;
                            if (mlg1.m62222o("presenter_type", "image", d660Var) != serializable) {
                                gh00Var7 = gh00Var;
                                bitmap2 = bitmap;
                                atj0Var = m2k0Var3.f139374c;
                                wj50.m88279p(str2);
                                String str15 = m2k0Var3.f139377f.f250329c;
                                d660Var.f45602a = m2k0Var3;
                                d660Var.f45603b = l;
                                d660Var.f45604c = e660Var;
                                d660Var.f45605d = gh00Var7;
                                d660Var.f45606e = null;
                                d660Var.f45607f = null;
                                d660Var.f45608g = atj0Var;
                                d660Var.f45609h = bitmap2;
                                d660Var.f45611t = z;
                                d660Var.f45598M0 = 6;
                                serializableM40832c = m40832c(str2, str15, d660Var);
                                if (serializableM40832c != serializable) {
                                    bitmap3 = bitmap2;
                                    m2k0Var6 = m2k0Var3;
                                    atj0Var2 = atj0Var;
                                    objM96567o = serializableM40832c;
                                    xc40Var = new xc40(atj0Var2, bitmap3, (th00) objM96567o, e660Var, gh00Var7, m2k0Var6.f139377f, m2k0Var6.f139376e, new cii(l));
                                    d660Var.f45602a = null;
                                    d660Var.f45603b = null;
                                    d660Var.f45604c = null;
                                    d660Var.f45605d = null;
                                    d660Var.f45606e = null;
                                    d660Var.f45607f = null;
                                    d660Var.f45608g = null;
                                    d660Var.f45609h = null;
                                    d660Var.f45611t = z;
                                    d660Var.f45598M0 = 8;
                                    objM81781A = this.f66286a.m81781A(xc40Var, d660Var);
                                    if (objM81781A != serializable) {
                                        return objM81781A;
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return serializable;
            case 3:
                z = d660Var.f45611t;
                str5 = d660Var.f45606e;
                gh00Var5 = d660Var.f45605d;
                gh00Var6 = d660Var.f45604c;
                l3 = d660Var.f45603b;
                m2k0Var5 = d660Var.f45602a;
                bga.m29073P(objM96567o);
                bitmap = (Bitmap) objM96567o;
                str2 = str5;
                gh00Var = gh00Var5;
                e660Var = gh00Var6;
                l = l3;
                m2k0Var3 = m2k0Var5;
                if (bitmap != null) {
                    d660Var.f45602a = m2k0Var3;
                    d660Var.f45603b = l;
                    d660Var.f45604c = e660Var;
                    d660Var.f45605d = gh00Var;
                    d660Var.f45606e = null;
                    d660Var.f45607f = null;
                    d660Var.f45608g = null;
                    d660Var.f45609h = null;
                    d660Var.f45610i = null;
                    d660Var.f45611t = z;
                    d660Var.f45598M0 = 7;
                    break;
                } else {
                    d660Var.f45602a = m2k0Var3;
                    d660Var.f45603b = l;
                    d660Var.f45604c = e660Var;
                    d660Var.f45605d = gh00Var;
                    d660Var.f45606e = str2;
                    d660Var.f45607f = bitmap;
                    d660Var.f45608g = null;
                    d660Var.f45609h = null;
                    d660Var.f45610i = null;
                    d660Var.f45611t = z;
                    d660Var.f45598M0 = 5;
                    if (mlg1.m62222o("presenter_type", "image", d660Var) != serializable) {
                        gh00Var7 = gh00Var;
                        bitmap2 = bitmap;
                        atj0Var = m2k0Var3.f139374c;
                        wj50.m88279p(str2);
                        String str16 = m2k0Var3.f139377f.f250329c;
                        d660Var.f45602a = m2k0Var3;
                        d660Var.f45603b = l;
                        d660Var.f45604c = e660Var;
                        d660Var.f45605d = gh00Var7;
                        d660Var.f45606e = null;
                        d660Var.f45607f = null;
                        d660Var.f45608g = atj0Var;
                        d660Var.f45609h = bitmap2;
                        d660Var.f45611t = z;
                        d660Var.f45598M0 = 6;
                        serializableM40832c = m40832c(str2, str16, d660Var);
                        if (serializableM40832c != serializable) {
                            bitmap3 = bitmap2;
                            m2k0Var6 = m2k0Var3;
                            atj0Var2 = atj0Var;
                            objM96567o = serializableM40832c;
                            xc40Var = new xc40(atj0Var2, bitmap3, (th00) objM96567o, e660Var, gh00Var7, m2k0Var6.f139377f, m2k0Var6.f139376e, new cii(l));
                            d660Var.f45602a = null;
                            d660Var.f45603b = null;
                            d660Var.f45604c = null;
                            d660Var.f45605d = null;
                            d660Var.f45606e = null;
                            d660Var.f45607f = null;
                            d660Var.f45608g = null;
                            d660Var.f45609h = null;
                            d660Var.f45611t = z;
                            d660Var.f45598M0 = 8;
                            objM81781A = this.f66286a.m81781A(xc40Var, d660Var);
                            if (objM81781A != serializable) {
                                return objM81781A;
                            }
                        }
                    }
                }
                return serializable;
            case 4:
                z = d660Var.f45611t;
                sr4Var2 = d660Var.f45610i;
                str3 = (String) d660Var.f45608g;
                str4 = d660Var.f45606e;
                gh00Var3 = d660Var.f45605d;
                gh00Var4 = d660Var.f45604c;
                l2 = d660Var.f45603b;
                m2k0Var4 = d660Var.f45602a;
                try {
                    bga.m29073P(objM96567o);
                    sr4Var2.m79016f(str3);
                    str5 = str4;
                    gh00Var5 = gh00Var3;
                    gh00Var6 = gh00Var4;
                    l3 = l2;
                    m2k0Var5 = m2k0Var4;
                    bitmap = (Bitmap) objM96567o;
                    str2 = str5;
                    gh00Var = gh00Var5;
                    e660Var = gh00Var6;
                    l = l3;
                    m2k0Var3 = m2k0Var5;
                    if (bitmap != null) {
                        d660Var.f45602a = m2k0Var3;
                        d660Var.f45603b = l;
                        d660Var.f45604c = e660Var;
                        d660Var.f45605d = gh00Var;
                        d660Var.f45606e = null;
                        d660Var.f45607f = null;
                        d660Var.f45608g = null;
                        d660Var.f45609h = null;
                        d660Var.f45610i = null;
                        d660Var.f45611t = z;
                        d660Var.f45598M0 = 7;
                        break;
                    } else {
                        d660Var.f45602a = m2k0Var3;
                        d660Var.f45603b = l;
                        d660Var.f45604c = e660Var;
                        d660Var.f45605d = gh00Var;
                        d660Var.f45606e = str2;
                        d660Var.f45607f = bitmap;
                        d660Var.f45608g = null;
                        d660Var.f45609h = null;
                        d660Var.f45610i = null;
                        d660Var.f45611t = z;
                        d660Var.f45598M0 = 5;
                        if (mlg1.m62222o("presenter_type", "image", d660Var) != serializable) {
                            gh00Var7 = gh00Var;
                            bitmap2 = bitmap;
                            atj0Var = m2k0Var3.f139374c;
                            wj50.m88279p(str2);
                            String str17 = m2k0Var3.f139377f.f250329c;
                            d660Var.f45602a = m2k0Var3;
                            d660Var.f45603b = l;
                            d660Var.f45604c = e660Var;
                            d660Var.f45605d = gh00Var7;
                            d660Var.f45606e = null;
                            d660Var.f45607f = null;
                            d660Var.f45608g = atj0Var;
                            d660Var.f45609h = bitmap2;
                            d660Var.f45611t = z;
                            d660Var.f45598M0 = 6;
                            serializableM40832c = m40832c(str2, str17, d660Var);
                            if (serializableM40832c != serializable) {
                                bitmap3 = bitmap2;
                                m2k0Var6 = m2k0Var3;
                                atj0Var2 = atj0Var;
                                objM96567o = serializableM40832c;
                                xc40Var = new xc40(atj0Var2, bitmap3, (th00) objM96567o, e660Var, gh00Var7, m2k0Var6.f139377f, m2k0Var6.f139376e, new cii(l));
                                d660Var.f45602a = null;
                                d660Var.f45603b = null;
                                d660Var.f45604c = null;
                                d660Var.f45605d = null;
                                d660Var.f45606e = null;
                                d660Var.f45607f = null;
                                d660Var.f45608g = null;
                                d660Var.f45609h = null;
                                d660Var.f45611t = z;
                                d660Var.f45598M0 = 8;
                                objM81781A = this.f66286a.m81781A(xc40Var, d660Var);
                                if (objM81781A != serializable) {
                                    return objM81781A;
                                }
                            }
                        }
                    }
                    return serializable;
                } catch (Throwable th2) {
                    th = th2;
                    sr4Var2.m79016f(str3);
                    throw th;
                }
            case 5:
                z = d660Var.f45611t;
                bitmap2 = (Bitmap) d660Var.f45607f;
                str2 = d660Var.f45606e;
                gh00Var7 = d660Var.f45605d;
                e660Var = d660Var.f45604c;
                l = d660Var.f45603b;
                m2k0Var3 = d660Var.f45602a;
                bga.m29073P(objM96567o);
                atj0Var = m2k0Var3.f139374c;
                wj50.m88279p(str2);
                String str18 = m2k0Var3.f139377f.f250329c;
                d660Var.f45602a = m2k0Var3;
                d660Var.f45603b = l;
                d660Var.f45604c = e660Var;
                d660Var.f45605d = gh00Var7;
                d660Var.f45606e = null;
                d660Var.f45607f = null;
                d660Var.f45608g = atj0Var;
                d660Var.f45609h = bitmap2;
                d660Var.f45611t = z;
                d660Var.f45598M0 = 6;
                serializableM40832c = m40832c(str2, str18, d660Var);
                if (serializableM40832c != serializable) {
                    bitmap3 = bitmap2;
                    m2k0Var6 = m2k0Var3;
                    atj0Var2 = atj0Var;
                    objM96567o = serializableM40832c;
                    xc40Var = new xc40(atj0Var2, bitmap3, (th00) objM96567o, e660Var, gh00Var7, m2k0Var6.f139377f, m2k0Var6.f139376e, new cii(l));
                    d660Var.f45602a = null;
                    d660Var.f45603b = null;
                    d660Var.f45604c = null;
                    d660Var.f45605d = null;
                    d660Var.f45606e = null;
                    d660Var.f45607f = null;
                    d660Var.f45608g = null;
                    d660Var.f45609h = null;
                    d660Var.f45611t = z;
                    d660Var.f45598M0 = 8;
                    objM81781A = this.f66286a.m81781A(xc40Var, d660Var);
                    if (objM81781A != serializable) {
                        return objM81781A;
                    }
                }
                return serializable;
            case 6:
                z = d660Var.f45611t;
                Bitmap bitmap4 = (Bitmap) d660Var.f45609h;
                atj0 atj0Var3 = (atj0) d660Var.f45608g;
                gh00Var7 = d660Var.f45605d;
                e660Var = d660Var.f45604c;
                l = d660Var.f45603b;
                m2k0 m2k0Var8 = d660Var.f45602a;
                bga.m29073P(objM96567o);
                bitmap3 = bitmap4;
                m2k0Var6 = m2k0Var8;
                atj0Var2 = atj0Var3;
                xc40Var = new xc40(atj0Var2, bitmap3, (th00) objM96567o, e660Var, gh00Var7, m2k0Var6.f139377f, m2k0Var6.f139376e, new cii(l));
                d660Var.f45602a = null;
                d660Var.f45603b = null;
                d660Var.f45604c = null;
                d660Var.f45605d = null;
                d660Var.f45606e = null;
                d660Var.f45607f = null;
                d660Var.f45608g = null;
                d660Var.f45609h = null;
                d660Var.f45611t = z;
                d660Var.f45598M0 = 8;
                objM81781A = this.f66286a.m81781A(xc40Var, d660Var);
                if (objM81781A != serializable) {
                    return serializable;
                }
                return objM81781A;
            case 7:
                z = d660Var.f45611t;
                gh00Var = d660Var.f45605d;
                e660Var = d660Var.f45604c;
                l = d660Var.f45603b;
                m2k0Var3 = d660Var.f45602a;
                bga.m29073P(objM96567o);
                xc40Var = new cd21(m2k0Var3.f139374c, e660Var, gh00Var, m2k0Var3.f139377f, m2k0Var3.f139376e, new cii(l), m2k0Var3.f139375d != null ? 1 : 0);
                d660Var.f45602a = null;
                d660Var.f45603b = null;
                d660Var.f45604c = null;
                d660Var.f45605d = null;
                d660Var.f45606e = null;
                d660Var.f45607f = null;
                d660Var.f45608g = null;
                d660Var.f45609h = null;
                d660Var.f45611t = z;
                d660Var.f45598M0 = 8;
                objM81781A = this.f66286a.m81781A(xc40Var, d660Var);
                if (objM81781A != serializable) {
                    return serializable;
                }
                return objM81781A;
            case 8:
                bga.m29073P(objM96567o);
                return objM96567o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
