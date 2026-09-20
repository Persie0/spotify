package p204p;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class qbn0 implements hw81, r0f1, rwf {
    /* JADX INFO: renamed from: b */
    public static duw0 m72501b(int i, ayd0 ayd0Var, byte[] bArr) {
        a0f1.m24340a(bArr.length, 0, i);
        return new duw0(i, ayd0Var, bArr);
    }

    /* JADX INFO: renamed from: c */
    public static duw0 m72502c(String str, ayd0 ayd0Var) {
        pqm0 pqm0VarM43269k = g0b1.m43269k(ayd0Var);
        Charset charset = (Charset) pqm0VarM43269k.f180350a;
        ayd0 ayd0Var2 = (ayd0) pqm0VarM43269k.f180351b;
        byte[] bytes = str.getBytes(charset);
        return m72501b(bytes.length, ayd0Var2, bytes);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ duw0 m72503d(int i, ayd0 ayd0Var, byte[] bArr) {
        if ((i & 1) != 0) {
            ayd0Var = null;
        }
        return m72501b(bArr.length, ayd0Var, bArr);
    }

    /* JADX INFO: renamed from: e */
    public static tbn0 m72504e(File file) {
        String str = tbn0.f218907b;
        String string = file.toString();
        iva ivaVar = AbstractC1723c.f32631a;
        npa npaVar = new npa();
        npaVar.m65304Q(string);
        return AbstractC1723c.m31061d(npaVar, false);
    }

    /* JADX INFO: renamed from: f */
    public static tbn0 m72505f(String str) {
        iva ivaVar = AbstractC1723c.f32631a;
        npa npaVar = new npa();
        npaVar.m65304Q(str);
        return AbstractC1723c.m31061d(npaVar, false);
    }

    /* JADX INFO: renamed from: g */
    public static ro80 m72506g(String str) {
        ro80 ro80VarM44508o = geg1.m44508o();
        Iterator it = urv0.m83870b(tls0.f221517a, str).iterator();
        while (true) {
            j310 j310Var = (j310) it;
            if (!j310Var.hasNext()) {
                return geg1.m44506m(ro80VarM44508o);
            }
            r2d0 r2d0Var = (r2d0) j310Var.next();
            String str2 = (String) ((p2d0) r2d0Var.m74520a()).get(1);
            mec0 mec0Var = new mec0();
            Iterator it2 = urv0.m83870b(tls0.f221518b, str2).iterator();
            while (true) {
                j310 j310Var2 = (j310) it2;
                if (!j310Var2.hasNext()) {
                    break;
                }
                r2d0 r2d0Var2 = (r2d0) j310Var2.next();
                mec0Var.put(((p2d0) r2d0Var2.m74520a()).get(1), tls0.m81066a((String) ((p2d0) r2d0Var2.m74520a()).get(2)));
            }
            mec0 mec0VarM61540b = mec0Var.m61540b();
            String str3 = (String) ((p2d0) r2d0Var.m74520a()).get(2);
            String str4 = (String) mec0VarM61540b.get("field");
            if (str4 != null) {
                String str5 = (String) mec0VarM61540b.get("value");
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = (String) mec0VarM61540b.get("unit");
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = (String) mec0VarM61540b.get("format");
                String str8 = (String) mec0VarM61540b.get("min");
                Double dM29805p0 = str8 != null ? bm51.m29805p0(str8) : null;
                String str9 = (String) mec0VarM61540b.get("max");
                Double dM29805p1 = str9 != null ? bm51.m29805p0(str9) : null;
                String str10 = (String) mec0VarM61540b.get("step");
                Double dM29805p2 = str10 != null ? bm51.m29805p0(str10) : null;
                ro80VarM44508o.add(new bls0(str4, str5, str6, str7, (dM29805p0 == null && dM29805p1 == null && dM29805p2 == null) ? null : new fuy(dM29805p0, dM29805p1, dM29805p2), tls0.m81066a(str3), r2d0Var.f195127a.group()));
            }
        }
    }

    @Override // p204p.x0f1
    /* JADX INFO: renamed from: a */
    public Object mo49415a() {
        return new j7n0();
    }

    @Override // p204p.rwf
    /* JADX INFO: renamed from: h */
    public Object mo1885h(sef0 sef0Var) {
        return new iew0(sef0Var.mo54439c(eht0.m39004a(hew0.class)));
    }
}
