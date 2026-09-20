package p204p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class bxw0 {

    /* JADX INFO: renamed from: c */
    public static final xr01 f31989c;

    /* JADX INFO: renamed from: a */
    public final flw0 f31990a;

    /* JADX INFO: renamed from: b */
    public final zrr0 f31991b;

    static {
        Set set = dd41.f47702f;
        f31989c = new xr01(r46.m74726U("spotify:shareformat:reserved"));
    }

    public bxw0(flw0 flw0Var, zrr0 zrr0Var) {
        this.f31990a = flw0Var;
        this.f31991b = zrr0Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:47:0x0102  */
    /* JADX WARN: Code duplicated, block: B:50:0x0108  */
    /* JADX WARN: Code duplicated, block: B:53:0x010e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x0085, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public final Object m30854a(lu01 lu01Var, ibk ibkVar) {
        axw0 axw0Var;
        lu01 lu01Var2;
        m811 m811Var;
        ro80 ro80VarM44508o;
        Integer num;
        ro80 ro80VarM44506m;
        ro8 ro8Var;
        String str;
        k1b1 k1b1Var;
        String str2;
        String str3;
        int iIntValue;
        Integer num2;
        if (ibkVar instanceof axw0) {
            axw0Var = (axw0) ibkVar;
            int i = axw0Var.f21012e;
            if ((i & Integer.MIN_VALUE) != 0) {
                axw0Var.f21012e = i - Integer.MIN_VALUE;
            } else {
                axw0Var = new axw0(this, ibkVar);
            }
        } else {
            axw0Var = new axw0(this, ibkVar);
        }
        Object objM42027k = axw0Var.f21010c;
        int i2 = axw0Var.f21012e;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM42027k);
            l811 l811Var = new l811(lu01Var.f136946a, f31989c, null, null, 12);
            axw0Var.f21008a = lu01Var;
            axw0Var.f21012e = 1;
            objM42027k = this.f31990a.m42027k(l811Var, axw0Var);
            if (objM42027k != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            lu01Var = axw0Var.f21008a;
            bga.m29073P(objM42027k);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m811Var = axw0Var.f21009b;
            lu01Var2 = axw0Var.f21008a;
            bga.m29073P(objM42027k);
        }
        if (((Boolean) objM42027k).booleanValue()) {
            ro80VarM44508o = geg1.m44508o();
            num = m811Var.f140896b;
            if (num != null) {
                iIntValue = num.intValue();
                num2 = m811Var.f140897c;
                if (num2 != null) {
                    ro80VarM44508o.add(new fcr0(iIntValue, num2.intValue(), ""));
                }
                ro80VarM44508o.add(new fcr0(iIntValue, -16777216, ""));
            }
            ro80VarM44506m = geg1.m44506m(ro80VarM44508o);
            if (ro80VarM44506m.isEmpty()) {
                ro80VarM44506m = null;
            }
            if (ro80VarM44506m != null) {
                Uri uri = m811Var.f140895a;
                String strM61105a = m811Var.m61105a();
                gcr0 gcr0Var = new gcr0(uri, strM61105a != null ? strM61105a : "");
                ro8Var = new ro8();
                ro8Var.f201160a = lu01Var2.f136946a;
                ArrayList arrayList = ro8Var.f201161b;
                arrayList.clear();
                arrayList.addAll(ro80VarM44506m);
                ro8Var.f201163d = gcr0Var;
                ro8Var.f201169j = new zn8(gcr0Var, null);
                ro8Var.f201162c = f31989c;
                ro8Var.f201168i = null;
                ro8Var.f201174o = true;
                ro8Var.f201175p = bk01.f27801a;
                ro8Var.f201170k.putAll(lu01Var2.f136948c);
                str = lu01Var2.f136947b;
                if (str != null) {
                    ro8Var.f201166g = str;
                }
                k1b1Var = lu01Var2.f136949d;
                if (k1b1Var != null) {
                    ro8Var.f201167h = k1b1Var;
                }
                str2 = lu01Var2.f136950e;
                if (str2 != null) {
                    ro8Var.f201164e = str2;
                }
                str3 = lu01Var2.f136951f;
                if (str3 != null) {
                    ro8Var.f201165f = str3;
                }
                return ro8Var.m76021b();
            }
        }
        return null;
        m811 m811Var2 = (m811) objM42027k;
        Uri uri2 = m811Var2.f140895a;
        axw0Var.f21008a = lu01Var;
        axw0Var.f21009b = m811Var2;
        axw0Var.f21012e = 2;
        zrr0 zrr0Var = this.f31991b;
        Object objM89557A = x0h1.m89557A((luk) zrr0Var.f285729b, new rgp0(zrr0Var, uri2, fbkVar, 22), axw0Var);
        if (objM89557A != yukVar) {
            lu01Var2 = lu01Var;
            m811Var = m811Var2;
            objM42027k = objM89557A;
            if (((Boolean) objM42027k).booleanValue()) {
                ro80VarM44508o = geg1.m44508o();
                num = m811Var.f140896b;
                if (num != null) {
                    iIntValue = num.intValue();
                    num2 = m811Var.f140897c;
                    if (num2 != null) {
                        ro80VarM44508o.add(new fcr0(iIntValue, num2.intValue(), ""));
                    }
                    ro80VarM44508o.add(new fcr0(iIntValue, -16777216, ""));
                }
                ro80VarM44506m = geg1.m44506m(ro80VarM44508o);
                if (ro80VarM44506m.isEmpty()) {
                    ro80VarM44506m = null;
                }
                if (ro80VarM44506m != null) {
                    Uri uri3 = m811Var.f140895a;
                    String strM61105a2 = m811Var.m61105a();
                    gcr0 gcr0Var2 = new gcr0(uri3, strM61105a2 != null ? strM61105a2 : "");
                    ro8Var = new ro8();
                    ro8Var.f201160a = lu01Var2.f136946a;
                    ArrayList arrayList2 = ro8Var.f201161b;
                    arrayList2.clear();
                    arrayList2.addAll(ro80VarM44506m);
                    ro8Var.f201163d = gcr0Var2;
                    ro8Var.f201169j = new zn8(gcr0Var2, null);
                    ro8Var.f201162c = f31989c;
                    ro8Var.f201168i = null;
                    ro8Var.f201174o = true;
                    ro8Var.f201175p = bk01.f27801a;
                    ro8Var.f201170k.putAll(lu01Var2.f136948c);
                    str = lu01Var2.f136947b;
                    if (str != null) {
                        ro8Var.f201166g = str;
                    }
                    k1b1Var = lu01Var2.f136949d;
                    if (k1b1Var != null) {
                        ro8Var.f201167h = k1b1Var;
                    }
                    str2 = lu01Var2.f136950e;
                    if (str2 != null) {
                        ro8Var.f201164e = str2;
                    }
                    str3 = lu01Var2.f136951f;
                    if (str3 != null) {
                        ro8Var.f201165f = str3;
                    }
                    return ro8Var.m76021b();
                }
            }
            return null;
        }
        return yukVar;
    }
}
