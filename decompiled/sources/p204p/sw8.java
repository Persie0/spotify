package p204p;

import android.content.Context;
import android.view.View;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class sw8 {

    /* JADX INFO: renamed from: a */
    public final i4t0 f214617a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f214618b;

    public /* synthetic */ sw8(i4t0 i4t0Var, i4t0 i4t0Var2) {
        this.f214617a = i4t0Var;
        this.f214618b = i4t0Var2;
    }

    /* JADX INFO: renamed from: c */
    public static String m79530c(Integer num, String str, xq00 xq00Var) {
        String strM13l;
        if (str != null) {
            xq00Var.m91771i0(-2103703316);
            xq00Var.m91788r(false);
            return str;
        }
        xq00Var.m91771i0(-790273173);
        if (num == null) {
            xq00Var.m91771i0(-790273174);
            xq00Var.m91788r(false);
            strM13l = null;
        } else {
            strM13l = AbstractC0000a.m13l(xq00Var, -790273173, num, xq00Var, false);
        }
        xq00Var.m91788r(false);
        return strM13l;
    }

    /* JADX INFO: renamed from: a */
    public void m79531a(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        xq00Var.m91775k0(1713561978);
        int i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i | (xq00Var.m91770i(fxh0Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            View view = (View) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f506f);
            WeakHashMap weakHashMap = mec1.f142677a;
            Object objM35774a = dec1.m35774a(view);
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = sam.m77645B(pft0.m69840u(0, 0));
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            boolean zM91770i = ((i2 & 14) == 4) | xq00Var.m91770i(objM35774a) | xq00Var.m91770i(kqi0Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == obj) {
                objM91750T2 = new vy5(eh00Var, objM35774a, kqi0Var, 8);
                xq00Var.m91793t0(objM91750T2);
            }
            gh00 gh00Var = (gh00) objM91750T2;
            boolean zM91770i2 = xq00Var.m91770i(kqi0Var);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T3 == obj) {
                objM91750T3 = new ti0(kqi0Var, 23);
                xq00Var.m91793t0(objM91750T3);
            }
            g0b1.m43261b(gh00Var, fxh0Var, (gh00) objM91750T3, xq00Var, i2 & ContentType.LONG_FORM_ON_DEMAND, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new yz4(this, eh00Var, fxh0Var, i, 18);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m79532b(fw8 fw8Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2 = fxh0Var;
        Object obj = t6x0.f217647t;
        yt8 yt8Var = fw8Var.f74017a;
        xq00Var.m91775k0(-1429622491);
        int i2 = i | (xq00Var.m91770i(fw8Var) ? 4 : 2) | (xq00Var.m91770i(fxh0Var2) ? 32 : 16) | (xq00Var.m91770i(this) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            ow8 ow8Var = new ow8(fw8Var, this.f214617a, this.f214618b);
            if (yt8Var instanceof wt8) {
                xq00Var.m91771i0(-987642561);
                wt8 wt8Var = (wt8) yt8Var;
                vt8 vt8VarM88909e = wt8Var.m88909e();
                Integer numM88906b = wt8Var.m88906b();
                String strM79530c = m79530c(null, null, xq00Var);
                qt8 qt8VarM88910f = wt8Var.m88910f();
                rw8 rw8Var = qt8VarM88910f != null ? new rw8(qt8VarM88910f, 0) : null;
                String strM79530c2 = m79530c(wt8Var.m88908d(), null, xq00Var);
                qt8 qt8VarM88907c = wt8Var.m88907c();
                rw8 rw8Var2 = qt8VarM88907c != null ? new rw8(qt8VarM88907c, 1) : null;
                xq00Var.m91771i0(522342363);
                List listM88905a = wt8Var.m88905a();
                ArrayList arrayList = new ArrayList(i6f.m49804T(listM88905a, 10));
                Iterator it = listM88905a.iterator();
                while (it.hasNext()) {
                    rt8 rt8Var = (rt8) it.next();
                    vt8 vt8Var = vt8VarM88909e;
                    Integer num = numM88906b;
                    String strM79530c3 = m79530c(null, rt8Var.m76369a(), xq00Var);
                    if (strM79530c3 == null) {
                        strM79530c3 = "";
                    }
                    boolean zM91770i = xq00Var.m91770i(rt8Var) | xq00Var.m91770i(ow8Var);
                    Object objM91750T = xq00Var.m91750T();
                    if (zM91770i || objM91750T == obj) {
                        objM91750T = new n17(10, rt8Var, ow8Var);
                        xq00Var.m91793t0(objM91750T);
                    }
                    arrayList.add(new uy61(strM79530c3, (eh00) objM91750T));
                    it = it;
                    vt8VarM88909e = vt8Var;
                    numM88906b = num;
                }
                vt8 vt8Var2 = vt8VarM88909e;
                Integer num2 = numM88906b;
                xq00Var.m91788r(false);
                AbstractC2524w8 abstractC2524w8M67546C = opo.m67546C(arrayList);
                xq00Var.m91771i0(-224374650);
                boolean zM91770i2 = xq00Var.m91770i(wt8Var) | xq00Var.m91770i(ow8Var);
                Object objM91750T2 = xq00Var.m91750T();
                if (zM91770i2 || objM91750T2 == obj) {
                    objM91750T2 = new n17(11, wt8Var, ow8Var);
                    xq00Var.m91793t0(objM91750T2);
                }
                xq00Var.m91788r(false);
                xqg1.m91860i(vt8Var2, fxh0Var, num2, strM79530c, rw8Var, strM79530c2, rw8Var2, abstractC2524w8M67546C, (eh00) objM91750T2, xq00Var, i2 & ContentType.LONG_FORM_ON_DEMAND, 0);
                fxh0Var2 = fxh0Var;
                xq00Var.m91788r(false);
            } else if (yt8Var instanceof ot8) {
                xq00Var.m91771i0(522361112);
                ((ot8) yt8Var).m67772a().mo35083a(ow8Var, fxh0Var2, xq00Var, 8 | (i2 & ContentType.LONG_FORM_ON_DEMAND));
                xq00Var.m91788r(false);
            } else {
                if (!(yt8Var instanceof pt8)) {
                    throw lq51.m59703i(522328612, xq00Var, false);
                }
                xq00Var.m91771i0(-986543611);
                Object obj2 = (Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b);
                boolean zM91770i3 = xq00Var.m91770i(fw8Var) | xq00Var.m91770i(obj2) | xq00Var.m91770i(ow8Var);
                Object objM91750T3 = xq00Var.m91750T();
                if (zM91770i3 || objM91750T3 == obj) {
                    objM91750T3 = new pr0(fw8Var, obj2, ow8Var, 4);
                    xq00Var.m91793t0(objM91750T3);
                }
                m79531a(i2 & 1008, (eh00) objM91750T3, xq00Var, fxh0Var2);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vk5(this, fw8Var, fxh0Var2, i, 1);
        }
    }
}
