package p204p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zr60 {

    /* JADX INFO: renamed from: b */
    public static final zr60 f285551b = new zr60(nau.f152117a);

    /* JADX INFO: renamed from: a */
    public final Map f285552a;

    public zr60(Map map) {
        this.f285552a = map;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x00ff  */
    /* JADX INFO: renamed from: a */
    public final xr60 m96756a(int i, sr60 sr60Var) {
        xr60 xr60VarM81323k;
        AbstractC1969i7 abstractC1969i7Mo32820Q;
        AbstractC1969i7 abstractC1969i7Mo32817N;
        Map map = this.f285552a;
        if (map.isEmpty()) {
            return new xr60(i, sr60Var);
        }
        boolean z = sr60Var instanceof AbstractC1969i7;
        AbstractC1969i7 abstractC1969i7 = z ? (AbstractC1969i7) sr60Var : null;
        AbstractC1969i7 abstractC1969i7Mo32817N2 = abstractC1969i7 != null ? abstractC1969i7.mo32817N() : null;
        AbstractC1969i7 abstractC1969i8 = z ? (AbstractC1969i7) sr60Var : null;
        AbstractC1969i7 abstractC1969i7Mo32820Q2 = abstractC1969i8 != null ? abstractC1969i8.mo32820Q() : null;
        if (abstractC1969i7Mo32817N2 != null && abstractC1969i7Mo32820Q2 != null) {
            xr60 xr60VarM96756a = m96756a(i, abstractC1969i7Mo32817N2);
            sr60 sr60VarM91916c = xr60VarM96756a.m91916c();
            AbstractC1969i7 abstractC1969i9 = sr60VarM91916c instanceof AbstractC1969i7 ? (AbstractC1969i7) sr60VarM91916c : null;
            if (abstractC1969i9 != null && (abstractC1969i7Mo32817N = abstractC1969i9.mo32817N()) != null) {
                xr60VarM96756a = new xr60(xr60VarM96756a.m91917d(), abstractC1969i7Mo32817N);
            }
            xr60 xr60VarM96756a2 = m96756a(i, abstractC1969i7Mo32820Q2);
            sr60 sr60VarM91916c2 = xr60VarM96756a2.m91916c();
            AbstractC1969i7 abstractC1969i10 = sr60VarM91916c2 instanceof AbstractC1969i7 ? (AbstractC1969i7) sr60VarM91916c2 : null;
            if (abstractC1969i10 != null && (abstractC1969i7Mo32820Q = abstractC1969i10.mo32820Q()) != null) {
                xr60VarM96756a2 = new xr60(xr60VarM96756a2.m91917d(), abstractC1969i7Mo32820Q);
            }
            sr60 sr60VarM91916c3 = xr60VarM96756a2.m91916c();
            sr60 sr60VarM91916c4 = xr60VarM96756a.m91916c();
            if (sr60VarM91916c3 != null && sr60VarM91916c4 != null) {
                return new xr60(xr60VarM96756a.m91917d(), nhz0.m64534l(sr60VarM91916c4, sr60VarM91916c3));
            }
            xr60 xr60Var = xr60.f265273c;
            return tqg1.m81323k();
        }
        kq60 kq60VarMo27067y = sr60Var.mo27067y();
        if (kq60VarMo27067y == null) {
            return new xr60(i, sr60Var);
        }
        xr60 xr60Var2 = (xr60) map.get(kq60VarMo27067y);
        if (xr60Var2 != null) {
            sr60 sr60VarM91916c5 = xr60Var2.m91916c();
            int iM91917d = xr60Var2.m91917d();
            if (sr60VarM91916c5 != null && iM91917d != 0) {
                int iM86240r = vqg1.m86240r(iM91917d, i);
                kgx0 kgx0Var = (kgx0) sr60VarM91916c5;
                boolean z2 = false;
                AbstractC1969i7 abstractC1969i11 = (AbstractC1969i7) oyq0.f171867g.mo55471U(kgx0Var, sr60Var.mo27066q() || sr60VarM91916c5.mo27066q());
                AbstractC1969i7 abstractC1969i12 = z ? (AbstractC1969i7) sr60Var : null;
                if (abstractC1969i12 == null || !abstractC1969i12.mo32813C()) {
                    AbstractC1969i7 abstractC1969i13 = kgx0Var instanceof AbstractC1969i7 ? (AbstractC1969i7) kgx0Var : null;
                    if (abstractC1969i13 != null && abstractC1969i13.mo32813C() && !sr60Var.mo27066q()) {
                        z2 = true;
                    }
                } else {
                    z2 = true;
                }
                xr60Var2 = new xr60(iM86240r, abstractC1969i11.mo32818O(z2));
            }
            return xr60Var2;
        }
        if (!sr60Var.mo27065K().isEmpty()) {
            List<xr60> listMo27065K = sr60Var.mo27065K();
            ArrayList arrayList = new ArrayList(i6f.m49804T(listMo27065K, 10));
            for (xr60 xr60Var3 : listMo27065K) {
                int iM91917d2 = xr60Var3.m91917d();
                sr60 sr60VarM91916c6 = xr60Var3.m91916c();
                if (sr60VarM91916c6 == null || iM91917d2 == 0) {
                    xr60 xr60Var4 = xr60.f265273c;
                    xr60VarM81323k = tqg1.m81323k();
                } else {
                    xr60VarM81323k = m96756a(iM91917d2, sr60VarM91916c6);
                }
                arrayList.add(xr60VarM81323k);
            }
            boolean zMo27066q = sr60Var.mo27066q();
            List annotations = sr60Var.getAnnotations();
            AbstractC1969i7 abstractC1969i14 = z ? (AbstractC1969i7) sr60Var : null;
            sr60Var = upf.m83704u(kq60VarMo27067y, arrayList, zMo27066q, annotations, abstractC1969i14 != null ? abstractC1969i14.mo32812A() : null);
        }
        return new xr60(i, sr60Var);
    }
}
