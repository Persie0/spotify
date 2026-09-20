package p204p;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.recaptcha.internal.zzhg;
import com.spotify.messages.ZeroFrictionFeatureFlagExposureNonAuth;
import com.spotify.messages.ZeroFrictionFeatureFlagFallbackNonAuth;
import com.spotify.messages.ZeroFrictionSicComponentExposureNonAuth;
import com.spotify.share.logging.impl.events.proto.ShareDebugError;
import com.spotify.share.logging.impl.events.proto.ShareError;
import com.spotify.share.logging.impl.events.proto.ShareFormatError;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class y0i0 implements qio, ldr0, tpk, Function, r9w0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f267988a;

    /* JADX INFO: renamed from: b */
    public final Object f267989b;

    /* JADX INFO: renamed from: c */
    public Object f267990c;

    /* JADX INFO: renamed from: d */
    public final Object f267991d;

    public /* synthetic */ y0i0(Object obj, Object obj2, Object obj3, int i) {
        this.f267988a = i;
        this.f267991d = obj;
        this.f267989b = obj2;
        this.f267990c = obj3;
    }

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ zzhg m92582n(y0i0 y0i0Var, Exception exc) {
        c03 c03Var = (c03) y0i0Var.f267989b;
        zz11 zz11Var = zz11.f287826e2;
        int i = 8;
        if (exc instanceof TimeoutCancellationException) {
            return c03Var.m31068c(exc, new zzhg(zz11Var, zz11.f287824e, exc.getMessage(), i));
        }
        return exc instanceof zzhg ? c03Var.m31068c(exc, (zzhg) exc) : c03Var.m31068c(exc, new zzhg(zz11Var, zz11.f287781L0, exc.getMessage(), i));
    }

    /* JADX INFO: renamed from: o */
    public static void m92583o(y0i0 y0i0Var, g2a1 g2a1Var) {
        y0i0 y0i0Var2 = (y0i0) g2a1Var.f75876b;
        long[] jArr = (long[]) y0i0Var.f267991d;
        long[] jArr2 = (long[]) y0i0Var2.f267991d;
        long[] jArr3 = (long[]) g2a1Var.f75877c;
        upf.m83680X(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) y0i0Var.f267989b;
        long[] jArr5 = (long[]) y0i0Var2.f267989b;
        long[] jArr6 = (long[]) y0i0Var2.f267990c;
        upf.m83680X(jArr4, jArr5, jArr6);
        upf.m83680X((long[]) y0i0Var.f267990c, jArr6, jArr3);
    }

    @Override // p204p.ldr0
    /* JADX INFO: renamed from: a */
    public byte[] mo58758a(byte[] bArr, int i) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrM85458N;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipher = (Cipher) a9v.f13645e.m25166a("AES/ECB/NoPadding");
        cipher.init(1, (SecretKeySpec) this.f267991d);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        if (iMax * 16 == bArr.length) {
            bArrM85458N = vgg1.m85457M((iMax - 1) * 16, 0, 16, bArr, (byte[]) this.f267989b);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrM85458N = vgg1.m85458N(bArrCopyOf, (byte[]) this.f267990c);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i2 = 0; i2 < iMax - 1; i2++) {
            bArrDoFinal = cipher.doFinal(vgg1.m85457M(0, i2 * 16, 16, bArrDoFinal, bArr));
        }
        return Arrays.copyOf(cipher.doFinal(vgg1.m85458N(bArrM85458N, bArrDoFinal)), i);
    }

    @Override // p204p.r9w0
    public /* synthetic */ void accept(Object obj, Object obj2) {
        switch (this.f267988a) {
            case 17:
                ((lkf1) this.f267991d).m59255f((aac) this.f267989b, (String) this.f267990c, (cbh1) obj, (ev61) obj2);
                break;
            case 18:
                lkf1 lkf1Var = (lkf1) this.f267991d;
                lkf1Var.m59272w((String) this.f267989b, (String) this.f267990c, (cbh1) obj, (ev61) obj2);
                break;
            default:
                ((lkf1) this.f267991d).m59273x((String) this.f267989b, (kn70) this.f267990c, (cbh1) obj, (ev61) obj2);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        kg31 kg31Var = (kg31) obj;
        String str = kg31Var.f122293a;
        khy0 khy0Var = (khy0) this.f267991d;
        return khy0Var.m56462k(str).m23300q(wsq0.f254691O0).m23295g(new jn10(29, (bg31) this.f267990c, kg31Var.f122294b)).m23294e(Single.just(new fi31(str, true))).timeout(10000L, TimeUnit.MILLISECONDS, (Scheduler) this.f267989b, Single.error(new TimeoutException())).doOnError(new kwr0(12, "Failed to leave session", new Object[0])).toObservable().onErrorReturn(new onz0(kg31Var, 12));
    }

    /* JADX INFO: renamed from: b */
    public zhj0 m92584b() {
        wg61 wg61Var = (wg61) this.f267989b;
        try {
            Network activeNetwork = ((ConnectivityManager) wg61Var.getValue()).getActiveNetwork();
            NetworkCapabilities networkCapabilities = activeNetwork != null ? ((ConnectivityManager) wg61Var.getValue()).getNetworkCapabilities(activeNetwork) : null;
            return networkCapabilities != null ? m92594m(networkCapabilities) : yhj0.f272916a;
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public int m92585c() {
        return (int) ((Double) ((List) this.f267991d).get(0)).doubleValue();
    }

    /* JADX INFO: renamed from: d */
    public int m92586d(int i) {
        return (int) ((Double) ((List) this.f267991d).get(i)).doubleValue();
    }

    /* JADX INFO: renamed from: e */
    public Object m92587e(Class cls, int i) {
        return ((p0i0) ((wg61) this.f267989b).getValue()).m68703c(cls).fromJson(((hk60) ((wg61) this.f267990c).getValue()).toJson((Map) ((List) this.f267991d).get(i)));
    }

    /* JADX INFO: renamed from: f */
    public String m92588f(int i) {
        return ((List) this.f267991d).get(i).toString();
    }

    /* JADX INFO: renamed from: g */
    public ycc1 m92589g(String str) {
        ycc1 ycc1Var = (ycc1) ((LinkedHashMap) this.f267990c).get(str);
        if (ycc1Var != null) {
            return ycc1Var;
        }
        throw new IllegalStateException(("Invalid videoId: " + str).toString());
    }

    /* JADX INFO: renamed from: h */
    public void m92590h(fr01 fr01Var) {
        qp0 qp0Var = (qp0) this.f267989b;
        boolean zBooleanValue = ((Boolean) x0h1.m89581x(dau.f47107a, new ds01(this, null, 1))).booleanValue();
        er01 er01VarM21107z = ShareError.m21107z();
        er01VarM21107z.m39743s(fr01Var.m42489g().m48319c());
        er01VarM21107z.m39744t(fr01Var.m42489g().m48321h());
        er01VarM21107z.m39746v(fr01Var.m42487e());
        er01VarM21107z.m39749y(fr01Var.m42489g().m48320g().m80710c());
        er01VarM21107z.m39748x(zBooleanValue);
        String strM42486d = fr01Var.m42486d();
        if (strM42486d != null) {
            er01VarM21107z.m39745u(strM42486d);
        }
        String strM42485c = fr01Var.m42485c();
        if (strM42485c != null) {
            er01VarM21107z.m39742r(strM42485c);
        }
        String strM42488f = fr01Var.m42488f();
        if (strM42488f != null) {
            er01VarM21107z.m39747w(strM42488f);
        }
        String strM42491i = fr01Var.m42491i();
        if (strM42491i != null) {
            er01VarM21107z.m39739A(strM42491i);
        }
        String strM42490h = fr01Var.m42490h();
        if (strM42490h != null) {
            er01VarM21107z.m39750z(strM42490h);
        }
        String strM42484b = fr01Var.m42484b();
        if (strM42484b != null) {
            er01VarM21107z.m39741q(strM42484b);
        }
        String strM42483a = fr01Var.m42483a();
        if (strM42483a != null) {
            er01VarM21107z.m39740m(strM42483a);
        }
        qp0Var.f191108a.m73616a(er01VarM21107z.build());
    }

    /* JADX INFO: renamed from: i */
    public void m92591i(ur01 ur01Var) {
        qp0 qp0Var = (qp0) this.f267989b;
        boolean zBooleanValue = ((Boolean) x0h1.m89581x(dau.f47107a, new ds01(this, null, 2))).booleanValue();
        tr01 tr01VarM21114t = ShareFormatError.m21114t();
        tr01VarM21114t.m81334u(ur01Var.m83829e());
        tr01VarM21114t.m81329m(ur01Var.m83825a());
        tr01VarM21114t.m81330q(ur01Var.m83826b());
        tr01VarM21114t.m81331r(ur01Var.m83827c());
        tr01VarM21114t.m81333t(zBooleanValue);
        String strM83828d = ur01Var.m83828d();
        if (strM83828d != null) {
            tr01VarM21114t.m81332s(strM83828d);
        }
        qp0Var.f191108a.m73616a(tr01VarM21114t.build());
    }

    /* JADX INFO: renamed from: j */
    public void m92592j(scg1 scg1Var) {
        qre0 qre0Var = ((qp0) this.f267989b).f191108a;
        scg1Var.toString();
        if (scg1Var instanceof cpo) {
            qre0Var.m73616a(sp5.m78852p(scg1Var));
            return;
        }
        if (scg1Var instanceof bpo) {
            so01 so01VarM21094q = ShareDebugError.m21094q();
            so01VarM21094q.m78604r("share.restrictions");
            so01VarM21094q.m78602m(stz0.m79349c(1));
            so01VarM21094q.m78603q(((bpo) scg1Var).m30165M());
            qre0Var.m73616a(so01VarM21094q.build());
            return;
        }
        if (!(scg1Var instanceof dpo)) {
            throw new NoWhenBranchMatchedException();
        }
        so01 so01VarM21094q2 = ShareDebugError.m21094q();
        dpo dpoVar = (dpo) scg1Var;
        so01VarM21094q2.m78604r(dpoVar.m36583O());
        so01VarM21094q2.m78602m(dpoVar.m36581M());
        so01VarM21094q2.m78603q(dpoVar.m36582N());
        qre0Var.m73616a(so01VarM21094q2.build());
    }

    @Override // p204p.tpk
    /* JADX INFO: renamed from: k */
    public Object mo26363k(Object obj) {
        utu0 utu0Var = (utu0) this.f267990c;
        return qbn0.m72502c(((fk60) ((fl51) utu0Var.f233995a)).m41881b((rr60) this.f267989b, obj), (ayd0) this.f267991d);
    }

    /* JADX INFO: renamed from: l */
    public void m92593l(g0b1 g0b1Var) {
        qre0 qre0Var = (qre0) this.f267989b;
        dt81 dt81Var = (dt81) this.f267991d;
        if (g0b1Var instanceof ffy) {
            ffy ffyVar = (ffy) g0b1Var;
            kye1 kye1VarM14910r = ZeroFrictionFeatureFlagExposureNonAuth.m14910r();
            kye1VarM14910r.m57686r(dt81Var.m36835a());
            kye1VarM14910r.m57687s(dt81Var.m36836b());
            kye1VarM14910r.m57684m(ffyVar.f69119f);
            kye1VarM14910r.m57685q(ffyVar.f69120g);
            qre0Var.m73616a(kye1VarM14910r.build());
            return;
        }
        if (g0b1Var instanceof gfy) {
            mye1 mye1VarM14914q = ZeroFrictionFeatureFlagFallbackNonAuth.m14914q();
            mye1VarM14914q.m63191q(dt81Var.m36835a());
            mye1VarM14914q.m63192r(dt81Var.m36836b());
            mye1VarM14914q.m63190m(((gfy) g0b1Var).f79485f);
            qre0Var.m73616a(mye1VarM14914q.build());
            return;
        }
        if (!(g0b1Var instanceof fw11)) {
            throw new NoWhenBranchMatchedException();
        }
        tye1 tye1VarM14941q = ZeroFrictionSicComponentExposureNonAuth.m14941q();
        tye1VarM14941q.m81998r(dt81Var.m36836b());
        tye1VarM14941q.m81997q(((mvw0) ((lvw0) this.f267990c)).f147664a.mo48716k(mvw0.f147663b));
        tye1VarM14941q.m81996m(((fw11) g0b1Var).f73920f);
        qre0Var.m73616a(tye1VarM14941q.build());
    }

    /* JADX INFO: renamed from: m */
    public zhj0 m92594m(NetworkCapabilities networkCapabilities) {
        if (!networkCapabilities.hasCapability(12)) {
            return yhj0.f272916a;
        }
        int iM62161w = 0;
        boolean zHasTransport = networkCapabilities.hasTransport(0);
        boolean zHasTransport2 = networkCapabilities.hasTransport(1);
        boolean zHasCapability = networkCapabilities.hasCapability(11);
        boolean z = !networkCapabilities.hasCapability(13);
        if (zHasTransport) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) ((wg61) this.f267990c).getValue();
                if (telephonyManager != null) {
                    iM62161w = mkg1.m62161w(telephonyManager.getDataNetworkType());
                }
            } catch (SecurityException unused) {
            }
        }
        return new xhj0(zHasTransport2, zHasTransport, zHasCapability, z, iM62161w, networkCapabilities.hasCapability(16) ? 1 : 2);
    }

    /* JADX INFO: renamed from: p */
    public byte[] m92595p() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = (long[]) this.f267990c;
        upf.m83681Y(jArr4, jArr14);
        upf.m83681Y(jArr13, jArr4);
        upf.m83681Y(jArr12, jArr13);
        upf.m83680X(jArr5, jArr12, jArr14);
        upf.m83680X(jArr6, jArr5, jArr4);
        upf.m83681Y(jArr12, jArr6);
        upf.m83680X(jArr7, jArr12, jArr5);
        upf.m83681Y(jArr12, jArr7);
        upf.m83681Y(jArr13, jArr12);
        upf.m83681Y(jArr12, jArr13);
        upf.m83681Y(jArr13, jArr12);
        upf.m83681Y(jArr12, jArr13);
        upf.m83680X(jArr8, jArr12, jArr7);
        upf.m83681Y(jArr12, jArr8);
        upf.m83681Y(jArr13, jArr12);
        for (int i = 2; i < 10; i += 2) {
            upf.m83681Y(jArr12, jArr13);
            upf.m83681Y(jArr13, jArr12);
        }
        upf.m83680X(jArr9, jArr13, jArr8);
        upf.m83681Y(jArr12, jArr9);
        upf.m83681Y(jArr13, jArr12);
        for (int i2 = 2; i2 < 20; i2 += 2) {
            upf.m83681Y(jArr12, jArr13);
            upf.m83681Y(jArr13, jArr12);
        }
        upf.m83680X(jArr12, jArr13, jArr9);
        upf.m83681Y(jArr13, jArr12);
        upf.m83681Y(jArr12, jArr13);
        for (int i3 = 2; i3 < 10; i3 += 2) {
            upf.m83681Y(jArr13, jArr12);
            upf.m83681Y(jArr12, jArr13);
        }
        upf.m83680X(jArr10, jArr12, jArr8);
        upf.m83681Y(jArr12, jArr10);
        upf.m83681Y(jArr13, jArr12);
        for (int i4 = 2; i4 < 50; i4 += 2) {
            upf.m83681Y(jArr12, jArr13);
            upf.m83681Y(jArr13, jArr12);
        }
        upf.m83680X(jArr11, jArr13, jArr10);
        upf.m83681Y(jArr13, jArr11);
        upf.m83681Y(jArr12, jArr13);
        for (int i5 = 2; i5 < 100; i5 += 2) {
            upf.m83681Y(jArr13, jArr12);
            upf.m83681Y(jArr12, jArr13);
        }
        upf.m83680X(jArr13, jArr12, jArr11);
        upf.m83681Y(jArr12, jArr13);
        upf.m83681Y(jArr13, jArr12);
        for (int i6 = 2; i6 < 50; i6 += 2) {
            upf.m83681Y(jArr12, jArr13);
            upf.m83681Y(jArr13, jArr12);
        }
        upf.m83680X(jArr12, jArr13, jArr10);
        upf.m83681Y(jArr13, jArr12);
        upf.m83681Y(jArr12, jArr13);
        upf.m83681Y(jArr13, jArr12);
        upf.m83681Y(jArr12, jArr13);
        upf.m83681Y(jArr13, jArr12);
        upf.m83680X(jArr, jArr13, jArr6);
        upf.m83680X(jArr2, (long[]) this.f267991d, jArr);
        upf.m83680X(jArr3, (long[]) this.f267989b, jArr);
        byte[] bArrM83684a0 = upf.m83684a0(jArr3);
        bArrM83684a0[31] = (byte) ((x3h1.m89799b(jArr2) << 7) ^ bArrM83684a0[31]);
        return bArrM83684a0;
    }

    @Override // p204p.qio
    /* JADX INFO: renamed from: p0 */
    public uio mo30418p0() {
        switch (this.f267988a) {
            case 2:
                b5l0 b5l0Var = new b5l0((w8b) this.f267989b, (xyx) this.f267991d);
                x491 x491Var = (x491) this.f267990c;
                if (x491Var != null) {
                    b5l0Var.mo29278a(x491Var);
                }
                return b5l0Var;
            default:
                return new c5l0((w8b) this.f267989b, (String) this.f267990c, (xyx) this.f267991d);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y0i0(g2a1 g2a1Var) {
        this(21);
        this.f267988a = 21;
        m92583o(this, g2a1Var);
    }

    public y0i0(y0i0 y0i0Var) {
        this.f267988a = 21;
        this.f267991d = Arrays.copyOf((long[]) y0i0Var.f267991d, 10);
        this.f267989b = Arrays.copyOf((long[]) y0i0Var.f267989b, 10);
        this.f267990c = Arrays.copyOf((long[]) y0i0Var.f267990c, 10);
    }

    public y0i0(Context context) {
        this.f267988a = 1;
        this.f267991d = context;
        this.f267989b = new wg61(new cij0(this, 0));
        this.f267990c = new wg61(new cij0(this, 1));
    }

    public y0i0(Flowable flowable, qre0 qre0Var) {
        this.f267988a = 5;
        this.f267991d = flowable;
        this.f267989b = qre0Var;
        this.f267990c = new iwr();
    }

    public y0i0(qp0 qp0Var, qp0 qp0Var2, gcu0 gcu0Var, qre0 qre0Var) {
        this.f267988a = 12;
        this.f267991d = qp0Var;
        this.f267989b = qp0Var2;
        this.f267990c = gcu0Var;
    }

    public y0i0(String str, ra9 ra9Var) {
        this.f267988a = 15;
        this.f267991d = str;
        this.f267989b = ra9Var;
        this.f267990c = new LinkedHashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y0i0(int i) {
        this(new long[10], new long[10], new long[10], 21);
        this.f267988a = i;
        switch (i) {
            case 7:
                this.f267991d = Executors.newSingleThreadScheduledExecutor();
                this.f267989b = new Handler(Looper.getMainLooper());
                this.f267990c = new HashMap();
                break;
            case 21:
                break;
            default:
                yum0 yum0VarM77645B = sam.m77645B(null);
                this.f267991d = yum0VarM77645B;
                this.f267989b = yum0VarM77645B;
                break;
        }
    }

    public y0i0(List list) {
        this.f267988a = 0;
        this.f267991d = list;
        this.f267989b = new wg61(x0i0.f256886a);
        this.f267990c = new wg61(new w0i0(this, 0));
    }

    public y0i0(LayoutInflater layoutInflater, ViewGroup viewGroup, eju ejuVar, h4c1 h4c1Var, u7y u7yVar, boolean z) {
        this.f267988a = 8;
        this.f267989b = new wg61(new u3x(layoutInflater, viewGroup, 1));
        this.f267990c = new wg61(new agf(ejuVar, h4c1Var, u7yVar, z, 6));
        this.f267991d = new wg61(new fyo0(this, 26));
    }

    public y0i0(byte[] bArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.f267988a = 9;
        g3b1.m43477a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f267991d = secretKeySpec;
        Cipher cipher = (Cipher) a9v.f13645e.m25166a("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] bArrM92092m = xtm0.m92092m(cipher.doFinal(new byte[16]));
        this.f267989b = bArrM92092m;
        this.f267990c = xtm0.m92092m(bArrM92092m);
    }

    public y0i0(w8b w8bVar) {
        this.f267988a = 3;
        this.f267989b = w8bVar;
        this.f267991d = new xyx(17);
    }

    public y0i0(z4l0 z4l0Var) {
        this.f267988a = 2;
        this.f267989b = z4l0Var;
        this.f267991d = new xyx(17);
    }
}
