package p204p;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import java.security.Provider;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes11.dex */
public final class jb5 implements Init, xua, Function4, i9v, Function, InterfaceC2207oa, vd50, v49, pdo0, ddl, fz61 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f110654a;

    public /* synthetic */ jb5(int i) {
        this.f110654a = i;
    }

    /* JADX INFO: renamed from: d */
    public static final int m52868d(int[] iArr) {
        int i;
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i2 = iArr[0];
        b450 b450Var = new b450(1, iArr.length - 1, 1);
        int i3 = b450Var.f278779b;
        int i4 = b450Var.f278780c;
        boolean z = i4 <= 0 ? 1 >= i3 : 1 <= i3;
        int i5 = z ? 1 : i3;
        while (z) {
            if (i5 != i3) {
                i = i5 + i4;
            } else {
                if (!z) {
                    throw new NoSuchElementException();
                }
                z = false;
                i = i5;
            }
            i2 *= iArr[i5];
            i5 = i;
        }
        return i2;
    }

    /* JADX INFO: renamed from: e */
    public static final String m52869e(String str, String str2) {
        return "room_table_modification_trigger_" + str + '_' + str2;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m52870f(Context context) {
        Pattern pattern = cgr.f37778b;
        return context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management");
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m52871g() {
        Pattern pattern = cgr.f37778b;
        String str = Build.DEVICE;
        return str != null && cgr.f37778b.matcher(str).matches();
    }

    /* JADX INFO: renamed from: h */
    public static f6l m52872h(fq01 fq01Var, dd41 dd41Var) {
        if (fq01Var.equals(up01.f232548d)) {
            return new f6l(3);
        }
        if (fq01Var.equals(kp01.f124948d)) {
            return new f6l(1);
        }
        if (fq01Var.equals(rp01.f201396d)) {
            return new f6l(2);
        }
        if (fq01Var.equals(fp01.f71659d)) {
            return new f6l(0);
        }
        throw new IllegalStateException((fq01Var + " is not an OnPlatform destination").toString());
    }

    /* JADX INFO: renamed from: i */
    public static gjx m52873i(Context context, ue41 ue41Var, req reqVar, zzo zzoVar, top topVar, Looper looper) {
        kix kixVar = new kix(context, ue41Var);
        c95.m31855u(!kixVar.f123103A);
        c95.m31843i(zzoVar != at8.f19612l);
        kixVar.f123113g = new iqp(zzoVar, 3);
        kixVar.m56542b(reqVar);
        c95.m31855u(!kixVar.f123103A);
        kixVar.f123112f = new iqp(topVar, 2);
        c95.m31855u(!kixVar.f123103A);
        looper.getClass();
        kixVar.f123115i = looper;
        return kixVar.m56541a();
    }

    @Override // p204p.xua
    /* JADX INFO: renamed from: a */
    public byte[] mo52874a(int i, byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((ihi) obj).f102296c == u300.LIKED_SONGS;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        dz90 dz90Var = (dz90) obj;
        return new wy10(dz90Var.f54587d, dz90Var.f54586c);
    }

    @Override // p204p.i9v
    /* JADX INFO: renamed from: b */
    public Object mo49992b(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    /* JADX INFO: renamed from: c */
    public void m52875c(ide ideVar, eh00 eh00Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1668929934);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(ideVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(cxh0.f43038a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            zce zceVar = ideVar.f101085a;
            boolean z = zceVar instanceof xce ? ((xce) zceVar).f260211a : false;
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = hz40.m49254z(dau.f47107a, xq00Var);
                xq00Var.m91793t0(objM91750T);
            }
            Object obj2 = (xuk) objM91750T;
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == obj) {
                objM91750T2 = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T2);
            }
            kqi0 kqi0Var = (kqi0) objM91750T2;
            Object objM91750T3 = xq00Var.m91750T();
            if (objM91750T3 == obj) {
                objM91750T3 = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T3);
            }
            kqi0 kqi0Var2 = (kqi0) objM91750T3;
            boolean zM91770i = xq00Var.m91770i(obj2) | xq00Var.m91770i(gh00Var) | xq00Var.m91770i(kqi0Var2);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91770i || objM91750T4 == obj) {
                objM91750T4 = new z9b(obj2, gh00Var, kqi0Var2, 13);
                xq00Var.m91793t0(objM91750T4);
            }
            eh00 eh00Var2 = (eh00) objM91750T4;
            if (((Boolean) kqi0Var2.getValue()).booleanValue()) {
                xq00Var.m91771i0(551105984);
                boolean zM91770i2 = xq00Var.m91770i(kqi0Var2) | xq00Var.m91766g(eh00Var2);
                Object objM91750T5 = xq00Var.m91750T();
                if (zM91770i2 || objM91750T5 == obj) {
                    objM91750T5 = new C2369sa(eh00Var2, kqi0Var2, 4);
                    xq00Var.m91793t0(objM91750T5);
                }
                eh00 eh00Var3 = (eh00) objM91750T5;
                boolean zM91770i3 = xq00Var.m91770i(kqi0Var2);
                Object objM91750T6 = xq00Var.m91750T();
                if (zM91770i3 || objM91750T6 == obj) {
                    objM91750T6 = new hyc(kqi0Var2, 12);
                    xq00Var.m91793t0(objM91750T6);
                }
                kxf1.m57608c(eh00Var3, (eh00) objM91750T6, xq00Var, 0);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(551278964);
                xq00Var.m91788r(false);
            }
            if (((Boolean) kqi0Var.getValue()).booleanValue()) {
                xq00Var.m91771i0(551345769);
                boolean zM91770i4 = xq00Var.m91770i(kqi0Var) | xq00Var.m91766g(eh00Var2);
                Object objM91750T7 = xq00Var.m91750T();
                if (zM91770i4 || objM91750T7 == obj) {
                    objM91750T7 = new C2369sa(eh00Var2, kqi0Var, 5);
                    xq00Var.m91793t0(objM91750T7);
                }
                eh00 eh00Var4 = (eh00) objM91750T7;
                boolean zM91770i5 = xq00Var.m91770i(kqi0Var);
                Object objM91750T8 = xq00Var.m91750T();
                if (zM91770i5 || objM91750T8 == obj) {
                    objM91750T8 = new hyc(kqi0Var, 13);
                    xq00Var.m91793t0(objM91750T8);
                }
                kxf1.m57607b(eh00Var4, (eh00) objM91750T8, xq00Var, 0);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(551540852);
                xq00Var.m91788r(false);
            }
            boolean zM91770i6 = xq00Var.m91770i(ideVar) | xq00Var.m91770i(kqi0Var) | xq00Var.m91766g(eh00Var2);
            Object objM91750T9 = xq00Var.m91750T();
            if (zM91770i6 || objM91750T9 == obj) {
                objM91750T9 = new z9b(ideVar, eh00Var2, kqi0Var, 14);
                xq00Var.m91793t0(objM91750T9);
            }
            y0v.m92603a(2, rkk.m75772x(-1046588902, new z92(z, eh00Var, (eh00) objM91750T9, 1, (byte) 0), xq00Var), xq00Var, 390, 2);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ve9(this, ideVar, eh00Var, gh00Var, i);
        }
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        z5f0 z5f0VarM95460a = z5f0.m95460a(i);
        return z5f0VarM95460a == null ? z5f0.AD : z5f0VarM95460a;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f110654a) {
            case 1:
                return First.m15574b((w88) obj);
            case 7:
                return First.m15574b((meo) obj);
            case 22:
                return First.m15575c((x9t0) obj, Collections.singleton(i9t0.f100074c));
            default:
                bh51 bh51Var = (bh51) obj;
                return First.m15575c(bh51Var, Collections.singleton(new rg51(bh51Var.f27084a, bh51Var.f27085b, bh51Var.f27088e, bh51Var.f27089f)));
        }
    }

    @Override // p204p.fz61
    /* JADX INFO: renamed from: w */
    public Object mo24968w(bz61 bz61Var) {
        dce dceVar = dce.OFFSET_SECONDS;
        if (bz61Var.mo26516d(dceVar)) {
            return hze1.m49269u(bz61Var.mo30952h(dceVar));
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.functions.Function4
    /* JADX INFO: renamed from: y */
    public Object mo23409y(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        boolean z = !zBooleanValue3;
        return new v1k(true, false, false, true, false, zBooleanValue || (((Boolean) obj4).booleanValue() && zBooleanValue3), z, z, false, false, zBooleanValue2, false, false, 60966);
    }

    public /* synthetic */ jb5(Object obj, int i) {
        this.f110654a = i;
    }

    public jb5(son sonVar, otn otnVar) {
        this.f110654a = 6;
    }

    @Override // p204p.v49
    public void unregister() {
    }
}
