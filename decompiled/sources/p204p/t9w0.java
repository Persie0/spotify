package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.util.SparseArray;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.Function;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class t9w0 implements Function, SingleTransformer, SingleOnSubscribe, uh9, pb31 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f218380a;

    /* JADX INFO: renamed from: b */
    public int f218381b;

    /* JADX INFO: renamed from: c */
    public Object f218382c;

    public /* synthetic */ t9w0(int i, Object obj, int i2) {
        this.f218380a = i2;
        this.f218381b = i;
        this.f218382c = obj;
    }

    @Override // io.reactivex.rxjava3.core.SingleTransformer
    /* JADX INFO: renamed from: V */
    public Single mo23389V(Single single) {
        return this.f218381b == 3 ? single.timeout(7000L, TimeUnit.MILLISECONDS, ((paw0) this.f218382c).f175638a) : single;
    }

    /* JADX INFO: renamed from: a */
    public dc31 m80316a(lfj0 lfj0Var) {
        return new dc31(this, lfj0Var);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, p.yaw0] */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return ((v9w0) this.f218382c).f239057c.mo28486b(this.f218381b);
    }

    /* JADX INFO: renamed from: b */
    public lj91 m80317b() {
        return (lj91) this.f218382c;
    }

    /* JADX INFO: renamed from: c */
    public mj91 m80318c() {
        return (mj91) this.f218382c;
    }

    /* JADX INFO: renamed from: d */
    public int m80319d() {
        switch (this.f218380a) {
            case 5:
                break;
        }
        return this.f218381b;
    }

    @Override // p204p.uh9
    /* JADX INFO: renamed from: e */
    public boolean mo60772e(String str) {
        return ((uh9) this.f218382c).mo60772e(str);
    }

    /* JADX INFO: renamed from: f */
    public lfj0 m80320f(int i) {
        lfj0 lfj0Var = (lfj0) ((SparseArray) this.f218382c).get(i);
        if (lfj0Var != null) {
            return lfj0Var;
        }
        throw new IllegalArgumentException(s571.m77246e(i, "Cannot find the wrapper for global view type "));
    }

    @Override // p204p.uh9
    /* JADX INFO: renamed from: g */
    public u790 mo60773g(phd0 phd0Var) {
        u790 u790VarMo60773g = ((uh9) this.f218382c).mo60773g(phd0Var);
        if (u790VarMo60773g == null) {
            return null;
        }
        return AbstractRunnableC2605y9.m93136y(u790VarMo60773g, new z800(this, 3), ckr.f39074a);
    }

    @Override // p204p.uh9
    /* JADX INFO: renamed from: h */
    public u790 mo60774h(Uri uri) {
        return AbstractRunnableC2605y9.m93136y(((uh9) this.f218382c).mo60774h(uri), new z800(this, 3), ckr.f39074a);
    }

    /* JADX INFO: renamed from: i */
    public long m80321i(hhp hhpVar) {
        l2n0 l2n0Var = (l2n0) this.f218382c;
        int i = 0;
        hhpVar.mo35036c(l2n0Var.f129054a, 0, 1, false);
        int i2 = l2n0Var.f129054a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        hhpVar.mo35036c(l2n0Var.f129054a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (l2n0Var.f129054a[i] & 255) + (i5 << 8);
        }
        this.f218381b = i4 + 1 + this.f218381b;
        return i5;
    }

    @Override // p204p.uh9
    /* JADX INFO: renamed from: j */
    public u790 mo60775j(byte[] bArr) {
        return AbstractRunnableC2605y9.m93136y(((uh9) this.f218382c).mo60775j(bArr), new z800(this, 3), ckr.f39074a);
    }

    /* JADX INFO: renamed from: k */
    public void m80322k(lj91 lj91Var) {
        this.f218382c = lj91Var;
    }

    /* JADX INFO: renamed from: l */
    public void m80323l(mj91 mj91Var) {
        this.f218382c = mj91Var;
    }

    /* JADX INFO: renamed from: m */
    public String m80324m(rtg1 rtg1Var) {
        String str;
        switch (this.f218380a) {
            case 10:
                xc9 xc9Var = (xc9) this.f218382c;
                xc9Var.m90373H(new g2a1(xc9Var, rtg1Var), this.f218381b);
                return "reconnectIfNeeded";
            default:
                wqf1 wqf1Var = (wqf1) this.f218382c;
                int i = this.f218381b;
                try {
                    if (wqf1Var.f254036N == null) {
                        throw null;
                    }
                    iif1 iif1Var = wqf1Var.f254036N;
                    String packageName = wqf1Var.f254034L.getPackageName();
                    if (i == 2) {
                        str = "LAUNCH_BILLING_FLOW";
                    } else if (i == 3) {
                        str = "ACKNOWLEDGE_PURCHASE";
                    } else if (i == 4) {
                        str = "CONSUME_ASYNC";
                    } else if (i != 5) {
                        str = i != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
                    } else {
                        str = "IS_FEATURE_SUPPORTED";
                    }
                    nqf1 nqf1Var = new nqf1(rtg1Var);
                    yhf1 yhf1Var = (yhf1) iif1Var;
                    Parcel parcelM43608h2 = yhf1Var.m43608h2();
                    parcelM43608h2.writeString(packageName);
                    parcelM43608h2.writeString(str);
                    int i2 = rhf1.f199217a;
                    parcelM43608h2.writeStrongBinder(nqf1Var);
                    try {
                        yhf1Var.f76674l.transact(1, parcelM43608h2, null, 1);
                        return "billingOverrideService.getBillingOverride";
                    } finally {
                        parcelM43608h2.recycle();
                    }
                } catch (Exception unused) {
                    wqf1Var.m88747Z(95, 28, esf1.f62356C);
                    mmf1.m62315i("BillingClientTesting");
                    rtg1Var.m76378a(0);
                    return "billingOverrideService.getBillingOverride";
                }
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        String str;
        tvx0 tvx0Var = (tvx0) this.f218382c;
        int iM38547C = edb.m38547C(this.f218381b);
        if (iM38547C == 0) {
            str = "inapp";
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "subs";
        }
        xc9 xc9Var = tvx0Var.f224268a;
        int i = 13;
        urt0 urt0Var = new urt0(i, tvx0Var, singleEmitter);
        xc9Var.getClass();
        if (xc9.m90362s(new mc9(xc9Var, urt0Var, str), 30000L, new wpa1(i, xc9Var, urt0Var), xc9Var.m90389y(), xc9Var.m90386r()) == null) {
            ye9 ye9VarM90367B = xc9Var.m90367B();
            xc9Var.m90380P(25, 9, ye9VarM90367B);
            mlf1 mlf1Var = tlf1.f221461b;
            urt0Var.m83867j(ye9VarM90367B, mnf1.f145422e);
        }
    }

    public String toString() {
        switch (this.f218380a) {
            case 7:
                if40 if40Var = (if40) this.f218382c;
                ArrayList arrayList = new ArrayList(if40Var.f101647b);
                for (int i = 0; i < if40Var.f101647b; i++) {
                    int iM50417b = if40Var.m50417b(i);
                    String str = h0b1.f86200a;
                    arrayList.add(new String(new byte[]{(byte) (iM50417b >> 24), (byte) (iM50417b >> 16), (byte) (iM50417b >> 8), (byte) iM50417b}, StandardCharsets.US_ASCII));
                }
                StringBuilder sb = new StringBuilder("UnsupportedBrands{major=");
                int i2 = this.f218381b;
                String str2 = h0b1.f86200a;
                sb.append(new String(new byte[]{(byte) (i2 >> 24), (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2}, StandardCharsets.US_ASCII));
                sb.append(", compatible=");
                sb.append(arrayList);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t9w0(Object obj, int i, int i2) {
        this.f218380a = i2;
        this.f218382c = obj;
        this.f218381b = i;
    }

    public t9w0(int i) {
        this.f218380a = i;
        switch (i) {
            case 9:
                this.f218382c = new SparseArray();
                this.f218381b = 0;
                break;
            default:
                this.f218382c = new l2n0(8);
                break;
        }
    }

    public t9w0(int[] iArr, int i) {
        this.f218380a = 7;
        this.f218381b = i;
        if40 if40Var = if40.f101645c;
        if (iArr != null && iArr.length != 0) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            if40Var = new if40(iArrCopyOf, iArrCopyOf.length);
        }
        this.f218382c = if40Var;
    }
}
