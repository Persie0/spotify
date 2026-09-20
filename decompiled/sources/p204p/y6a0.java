package p204p;

import com.comscore.streaming.ContentType;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class y6a0 {

    /* JADX INFO: renamed from: a */
    public static final float f269715a = 30;

    /* JADX INFO: renamed from: a */
    public static final void m92951a(ffu0 ffu0Var, voc1 voc1Var, qf40 qf40Var, gh00 gh00Var, ciu0 ciu0Var, j90 j90Var, hgu0 hgu0Var, yhu0 yhu0Var, n1k n1kVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        voc1 voc1Var2;
        fxh0 fxh0Var2;
        vum0 vum0Var;
        Object next;
        Object obj = t6x0.f217647t;
        dfu0 dfu0Var = ffu0Var.f69091e;
        List list = ffu0Var.f69097k;
        xq00Var.m91775k0(1473332879);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(ffu0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            voc1Var2 = voc1Var;
            i2 |= xq00Var.m91766g(voc1Var2) ? 32 : 16;
        } else {
            voc1Var2 = voc1Var;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(qf40Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91770i(ciu0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var.m91770i(j90Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= xq00Var.m91770i(hgu0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= xq00Var.m91770i(yhu0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= xq00Var.m91770i(n1kVar) ? 67108864 : 33554432;
        }
        int i3 = i2 | 805306368;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 306783379) != 306783378)) {
            yqq yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == obj) {
                objM91750T = j4x.m52407e(!list.isEmpty() ? (int) yqqVar.mo35989Z0(f269715a) : 0, xq00Var);
            }
            vum0 vum0Var2 = (vum0) objM91750T;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    vum0Var = vum0Var2;
                    next = null;
                    break;
                } else {
                    next = it.next();
                    vum0Var = vum0Var2;
                    if (wj50.m88271j(((pcu0) next).f176232c.f178681a, dfu0Var.f48652c)) {
                        break;
                    } else {
                        vum0Var2 = vum0Var;
                    }
                }
            }
            pcu0 pcu0Var = (pcu0) next;
            String str = pcu0Var != null ? pcu0Var.f176231b : null;
            boolean zM91766g = xq00Var.m91766g(str);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91766g || objM91750T2 == obj) {
                objM91750T2 = ((fiu0) ciu0Var).m41776a(str);
                xq00Var.m91793t0(objM91750T2);
            }
            String str2 = str;
            kqi0 kqi0VarM77670i = sam.m77670i((fiz) objM91750T2, fiu0.f69993b, null, xq00Var, 0, 2);
            float f = 0;
            boolean z = ffu0Var.f69092f;
            boolean zM35909a = dfu0Var.m35909a();
            boolean z2 = ffu0Var.f69093g;
            boolean z3 = ffu0Var.f69100n;
            qf40 qf40Var2 = (qf40) kqi0VarM77670i.getValue();
            int i4 = i3 & 7168;
            boolean z4 = i4 == 2048;
            Object objM91750T3 = xq00Var.m91750T();
            if (z4 || objM91750T3 == obj) {
                objM91750T3 = new ny60(20, gh00Var);
                xq00Var.m91793t0(objM91750T3);
            }
            gh00 gh00Var2 = (gh00) objM91750T3;
            boolean z5 = i4 == 2048;
            Object objM91750T4 = xq00Var.m91750T();
            if (z5 || objM91750T4 == obj) {
                objM91750T4 = new ny60(21, gh00Var);
                xq00Var.m91793t0(objM91750T4);
            }
            gh00 gh00Var3 = (gh00) objM91750T4;
            boolean z6 = i4 == 2048;
            Object objM91750T5 = xq00Var.m91750T();
            if (z6 || objM91750T5 == obj) {
                objM91750T5 = new vd90(8, gh00Var);
                xq00Var.m91793t0(objM91750T5);
            }
            ihf1.m50621e(yhu0Var, j90Var, f, null, z, zM35909a, z2, z3, str2, qf40Var, gh00Var2, qf40Var2, gh00Var3, (eh00) objM91750T5, rkk.m75772x(-188473176, new jzc(ffu0Var, hgu0Var, gh00Var, voc1Var2, n1kVar, vum0Var), xq00Var), xq00Var, ((i3 >> 21) & 14) | 384 | ((i3 >> 12) & ContentType.LONG_FORM_ON_DEMAND) | (1879048192 & (i3 << 21)), 8);
            fxh0Var2 = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ipl(ffu0Var, voc1Var, qf40Var, gh00Var, ciu0Var, j90Var, hgu0Var, yhu0Var, n1kVar, fxh0Var2, i);
        }
    }
}
