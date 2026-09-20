package p204p;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class cap0 {

    /* JADX INFO: renamed from: H */
    public static final cap0 f35848H;

    /* JADX INFO: renamed from: I */
    public static final String f35849I;

    /* JADX INFO: renamed from: J */
    public static final String f35850J;

    /* JADX INFO: renamed from: K */
    public static final String f35851K;

    /* JADX INFO: renamed from: L */
    public static final String f35852L;

    /* JADX INFO: renamed from: M */
    public static final String f35853M;

    /* JADX INFO: renamed from: N */
    public static final String f35854N;

    /* JADX INFO: renamed from: O */
    public static final String f35855O;

    /* JADX INFO: renamed from: P */
    public static final String f35856P;

    /* JADX INFO: renamed from: Q */
    public static final String f35857Q;

    /* JADX INFO: renamed from: R */
    public static final String f35858R;

    /* JADX INFO: renamed from: S */
    public static final String f35859S;

    /* JADX INFO: renamed from: T */
    public static final String f35860T;

    /* JADX INFO: renamed from: U */
    public static final String f35861U;

    /* JADX INFO: renamed from: V */
    public static final String f35862V;

    /* JADX INFO: renamed from: W */
    public static final String f35863W;

    /* JADX INFO: renamed from: X */
    public static final String f35864X;

    /* JADX INFO: renamed from: Y */
    public static final String f35865Y;

    /* JADX INFO: renamed from: Z */
    public static final String f35866Z;

    /* JADX INFO: renamed from: a0 */
    public static final String f35867a0;

    /* JADX INFO: renamed from: b0 */
    public static final String f35868b0;

    /* JADX INFO: renamed from: c0 */
    public static final String f35869c0;

    /* JADX INFO: renamed from: d0 */
    public static final String f35870d0;

    /* JADX INFO: renamed from: e0 */
    public static final String f35871e0;

    /* JADX INFO: renamed from: f0 */
    public static final String f35872f0;

    /* JADX INFO: renamed from: g0 */
    public static final String f35873g0;

    /* JADX INFO: renamed from: h0 */
    public static final String f35874h0;

    /* JADX INFO: renamed from: i0 */
    public static final String f35875i0;

    /* JADX INFO: renamed from: j0 */
    public static final String f35876j0;

    /* JADX INFO: renamed from: k0 */
    public static final String f35877k0;

    /* JADX INFO: renamed from: l0 */
    public static final String f35878l0;

    /* JADX INFO: renamed from: m0 */
    public static final String f35879m0;

    /* JADX INFO: renamed from: n0 */
    public static final String f35880n0;

    /* JADX INFO: renamed from: o0 */
    public static final String f35881o0;

    /* JADX INFO: renamed from: p0 */
    public static final String f35882p0;

    /* JADX INFO: renamed from: A */
    public final int f35883A;

    /* JADX INFO: renamed from: B */
    public final phd0 f35884B;

    /* JADX INFO: renamed from: C */
    public final long f35885C;

    /* JADX INFO: renamed from: D */
    public final long f35886D;

    /* JADX INFO: renamed from: E */
    public final long f35887E;

    /* JADX INFO: renamed from: F */
    public final tt81 f35888F;

    /* JADX INFO: renamed from: G */
    public final dr81 f35889G;

    /* JADX INFO: renamed from: a */
    public final PlaybackException f35890a;

    /* JADX INFO: renamed from: b */
    public final int f35891b;

    /* JADX INFO: renamed from: c */
    public final n201 f35892c;

    /* JADX INFO: renamed from: d */
    public final e7p0 f35893d;

    /* JADX INFO: renamed from: e */
    public final e7p0 f35894e;

    /* JADX INFO: renamed from: f */
    public final int f35895f;

    /* JADX INFO: renamed from: g */
    public final h1p0 f35896g;

    /* JADX INFO: renamed from: h */
    public final int f35897h;

    /* JADX INFO: renamed from: i */
    public final boolean f35898i;

    /* JADX INFO: renamed from: j */
    public final qp71 f35899j;

    /* JADX INFO: renamed from: k */
    public final int f35900k;

    /* JADX INFO: renamed from: l */
    public final k9c1 f35901l;

    /* JADX INFO: renamed from: m */
    public final phd0 f35902m;

    /* JADX INFO: renamed from: n */
    public final float f35903n;

    /* JADX INFO: renamed from: o */
    public final float f35904o;

    /* JADX INFO: renamed from: p */
    public final int f35905p;

    /* JADX INFO: renamed from: q */
    public final xs6 f35906q;

    /* JADX INFO: renamed from: r */
    public final o0m f35907r;

    /* JADX INFO: renamed from: s */
    public final x6r f35908s;

    /* JADX INFO: renamed from: t */
    public final int f35909t;

    /* JADX INFO: renamed from: u */
    public final boolean f35910u;

    /* JADX INFO: renamed from: v */
    public final boolean f35911v;

    /* JADX INFO: renamed from: w */
    public final int f35912w;

    /* JADX INFO: renamed from: x */
    public final boolean f35913x;

    /* JADX INFO: renamed from: y */
    public final boolean f35914y;

    /* JADX INFO: renamed from: z */
    public final int f35915z;

    static {
        n201 n201Var = n201.f149578l;
        e7p0 e7p0Var = n201.f149577k;
        h1p0 h1p0Var = h1p0.f86671d;
        k9c1 k9c1Var = k9c1.f120559d;
        ap71 ap71Var = qp71.f191180a;
        phd0 phd0Var = phd0.f177558M;
        f35848H = new cap0(null, 0, n201Var, e7p0Var, e7p0Var, 0, h1p0Var, 0, false, k9c1Var, ap71Var, 0, phd0Var, 1.0f, 1.0f, xs6.f265509i, 0, o0m.f160423d, x6r.f258724e, 0, false, false, 1, 0, 1, false, false, phd0Var, 5000L, 15000L, 3000L, tt81.f223553b, dr81.f52193J);
        String str = h0b1.f86200a;
        f35849I = Integer.toString(1, 36);
        f35850J = Integer.toString(2, 36);
        f35851K = Integer.toString(3, 36);
        f35852L = Integer.toString(4, 36);
        f35853M = Integer.toString(5, 36);
        f35854N = Integer.toString(6, 36);
        f35855O = Integer.toString(7, 36);
        f35856P = Integer.toString(33, 36);
        f35857Q = Integer.toString(8, 36);
        f35858R = Integer.toString(9, 36);
        f35859S = Integer.toString(10, 36);
        f35860T = Integer.toString(11, 36);
        f35861U = Integer.toString(12, 36);
        f35862V = Integer.toString(13, 36);
        f35863W = Integer.toString(14, 36);
        f35864X = Integer.toString(15, 36);
        f35865Y = Integer.toString(16, 36);
        f35866Z = Integer.toString(17, 36);
        f35867a0 = Integer.toString(18, 36);
        f35868b0 = Integer.toString(19, 36);
        f35869c0 = Integer.toString(20, 36);
        f35870d0 = Integer.toString(21, 36);
        f35871e0 = Integer.toString(22, 36);
        f35872f0 = Integer.toString(23, 36);
        f35873g0 = Integer.toString(24, 36);
        f35874h0 = Integer.toString(25, 36);
        f35875i0 = Integer.toString(26, 36);
        f35876j0 = Integer.toString(27, 36);
        f35877k0 = Integer.toString(28, 36);
        f35878l0 = Integer.toString(29, 36);
        f35879m0 = Integer.toString(30, 36);
        f35880n0 = Integer.toString(31, 36);
        f35881o0 = Integer.toString(32, 36);
        f35882p0 = Integer.toString(34, 36);
    }

    public cap0(PlaybackException playbackException, int i, n201 n201Var, e7p0 e7p0Var, e7p0 e7p0Var2, int i2, h1p0 h1p0Var, int i3, boolean z, k9c1 k9c1Var, qp71 qp71Var, int i4, phd0 phd0Var, float f, float f2, xs6 xs6Var, int i5, o0m o0mVar, x6r x6rVar, int i6, boolean z2, boolean z3, int i7, int i8, int i9, boolean z4, boolean z5, phd0 phd0Var2, long j, long j2, long j3, tt81 tt81Var, dr81 dr81Var) {
        this.f35890a = playbackException;
        this.f35891b = i;
        this.f35892c = n201Var;
        this.f35893d = e7p0Var;
        this.f35894e = e7p0Var2;
        this.f35895f = i2;
        this.f35896g = h1p0Var;
        this.f35897h = i3;
        this.f35898i = z;
        this.f35901l = k9c1Var;
        this.f35899j = qp71Var;
        this.f35900k = i4;
        this.f35902m = phd0Var;
        this.f35903n = f;
        this.f35904o = f2;
        this.f35905p = i5;
        this.f35906q = xs6Var;
        this.f35907r = o0mVar;
        this.f35908s = x6rVar;
        this.f35909t = i6;
        this.f35910u = z2;
        this.f35911v = z3;
        this.f35912w = i7;
        this.f35915z = i8;
        this.f35883A = i9;
        this.f35913x = z4;
        this.f35914y = z5;
        this.f35884B = phd0Var2;
        this.f35885C = j;
        this.f35886D = j2;
        this.f35887E = j3;
        this.f35888F = tt81Var;
        this.f35889G = dr81Var;
    }

    /* JADX INFO: renamed from: q */
    public static cap0 m32065q(int i, Bundle bundle) {
        PlaybackException playbackException;
        wsv0 wsv0VarM48368n;
        wsv0 wsv0VarM48368n2;
        qp71 cp71Var;
        wsv0 wsv0VarM53150g;
        o0m o0mVar;
        x6r x6rVarM46029c;
        tt81 tt81Var;
        IBinder binder = bundle.getBinder(f35881o0);
        if (binder instanceof y9p0) {
            return ((y9p0) binder).f270630a;
        }
        Bundle bundle2 = bundle.getBundle(f35867a0);
        Throwable remoteException = null;
        int i2 = 1;
        if (bundle2 == null) {
            playbackException = null;
        } else {
            String string = bundle2.getString(PlaybackException.f961f);
            String string2 = bundle2.getString(PlaybackException.f962g);
            String string3 = bundle2.getString(PlaybackException.f963h);
            if (!TextUtils.isEmpty(string2)) {
                try {
                    Class<?> cls = Class.forName(string2, true, PlaybackException.class.getClassLoader());
                    remoteException = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string3) : null;
                    if (remoteException == null) {
                        remoteException = new RemoteException(string3);
                    }
                } catch (Throwable unused) {
                    remoteException = new RemoteException(string3);
                }
            }
            Throwable th = remoteException;
            int i3 = bundle2.getInt(PlaybackException.f959d, 1000);
            Bundle bundleM46328p = h0b1.m46328p(bundle2.getBundle(PlaybackException.f964i));
            if (bundleM46328p == null) {
                bundleM46328p = Bundle.EMPTY;
            }
            playbackException = new PlaybackException(string, th, i3, bundleM46328p, bundle2.getLong(PlaybackException.f960e, SystemClock.elapsedRealtime()));
        }
        int i4 = bundle.getInt(f35869c0, 0);
        Bundle bundle3 = bundle.getBundle(f35868b0);
        n201 n201VarM63535b = bundle3 == null ? n201.f149578l : n201.m63535b(i, bundle3);
        Bundle bundle4 = bundle.getBundle(f35870d0);
        e7p0 e7p0VarM38066c = bundle4 == null ? n201.f149577k : e7p0.m38066c(i, bundle4);
        Bundle bundle5 = bundle.getBundle(f35871e0);
        e7p0 e7p0VarM38066c2 = bundle5 == null ? n201.f149577k : e7p0.m38066c(i, bundle5);
        int i5 = bundle.getInt(f35872f0, 0);
        Bundle bundle6 = bundle.getBundle(f35849I);
        h1p0 h1p0Var = bundle6 == null ? h1p0.f86671d : new h1p0(bundle6.getFloat(h1p0.f86672e, 1.0f), bundle6.getFloat(h1p0.f86673f, 1.0f));
        int i6 = bundle.getInt(f35850J, 0);
        boolean z = bundle.getBoolean(f35851K, false);
        Bundle bundle7 = bundle.getBundle(f35852L);
        if (bundle7 == null) {
            cp71Var = qp71.f191180a;
        } else {
            ajx ajxVar = new ajx(i, i2);
            IBinder binder2 = bundle7.getBinder(qp71.f191181b);
            if (binder2 == null) {
                kf40 kf40Var = pf40.f176960b;
                wsv0VarM48368n = wsv0.f254763e;
            } else {
                wsv0VarM48368n = hra.m48368n(kra.m57146a(binder2), ajxVar);
            }
            ajx ajxVar2 = new ajx(i, 2);
            IBinder binder3 = bundle7.getBinder(qp71.f191182c);
            if (binder3 == null) {
                kf40 kf40Var2 = pf40.f176960b;
                wsv0VarM48368n2 = wsv0.f254763e;
            } else {
                wsv0VarM48368n2 = hra.m48368n(kra.m57146a(binder3), ajxVar2);
            }
            int[] intArray = bundle7.getIntArray(qp71.f191183d);
            if (intArray == null) {
                int i7 = wsv0VarM48368n.f254765d;
                int[] iArr = new int[i7];
                for (int i8 = 0; i8 < i7; i8++) {
                    iArr[i8] = i8;
                }
                intArray = iArr;
            }
            cp71Var = new cp71(wsv0VarM48368n, wsv0VarM48368n2, intArray);
        }
        int i9 = bundle.getInt(f35880n0, 0);
        Bundle bundle8 = bundle.getBundle(f35853M);
        k9c1 k9c1Var = bundle8 == null ? k9c1.f120559d : new k9c1(bundle8.getInt(k9c1.f120560e, 0), bundle8.getInt(k9c1.f120561f, 0), bundle8.getFloat(k9c1.f120562g, 1.0f));
        Bundle bundle9 = bundle.getBundle(f35854N);
        phd0 phd0VarM69978b = bundle9 == null ? phd0.f177558M : phd0.m69978b(i, bundle9);
        float f = bundle.getFloat(f35855O, 1.0f);
        float f2 = bundle.getFloat(f35856P, 1.0f);
        int i10 = bundle.getInt(f35882p0, 0);
        Bundle bundle10 = bundle.getBundle(f35857Q);
        xs6 xs6VarM91965a = bundle10 == null ? xs6.f265509i : xs6.m91965a(bundle10);
        Bundle bundle11 = bundle.getBundle(f35873g0);
        if (bundle11 == null) {
            o0mVar = o0m.f160423d;
            phd0VarM69978b = phd0VarM69978b;
            f = f;
            k9c1Var = k9c1Var;
        } else {
            ArrayList parcelableArrayList = bundle11.getParcelableArrayList(o0m.f160424e);
            if (parcelableArrayList == null) {
                wsv0VarM53150g = wsv0.f254763e;
            } else {
                jf40 jf40VarM69788m = pf40.m69788m();
                for (int i11 = 0; i11 < parcelableArrayList.size(); i11++) {
                    Bundle bundle12 = (Bundle) parcelableArrayList.get(i11);
                    bundle12.getClass();
                    jf40VarM69788m.m28985c(b0m.m27840b(bundle12));
                }
                wsv0VarM53150g = jf40VarM69788m.m53150g();
            }
            o0mVar = new o0m(bundle11.getLong(o0m.f160425f), wsv0VarM53150g);
        }
        Bundle bundle13 = bundle.getBundle(f35858R);
        if (bundle13 == null) {
            x6rVarM46029c = x6r.f258724e;
        } else {
            int i12 = bundle13.getInt(x6r.f258725f, 0);
            int i13 = bundle13.getInt(x6r.f258726g, 0);
            int i14 = bundle13.getInt(x6r.f258727h, 0);
            String string4 = bundle13.getString(x6r.f258728i);
            gx8 gx8Var = new gx8(i12);
            gx8Var.f85219c = i13;
            gx8Var.f85220d = i14;
            c95.m31843i(i12 != 0 || string4 == null);
            gx8Var.f85221e = string4;
            x6rVarM46029c = gx8Var.m46029c();
        }
        int i15 = bundle.getInt(f35859S, 0);
        boolean z2 = bundle.getBoolean(f35860T, false);
        boolean z3 = bundle.getBoolean(f35861U, false);
        int i16 = bundle.getInt(f35862V, 1);
        int i17 = bundle.getInt(f35863W, 0);
        int i18 = bundle.getInt(f35864X, 1);
        boolean z4 = bundle.getBoolean(f35865Y, false);
        boolean z5 = bundle.getBoolean(f35866Z, false);
        Bundle bundle14 = bundle.getBundle(f35874h0);
        phd0 phd0VarM69978b2 = bundle14 == null ? phd0.f177558M : phd0.m69978b(i, bundle14);
        x6r x6rVar = x6rVarM46029c;
        long j = bundle.getLong(f35875i0, i < 4 ? 0L : 5000L);
        long j2 = bundle.getLong(f35876j0, i < 4 ? 0L : 15000L);
        long j3 = bundle.getLong(f35877k0, i < 4 ? 0L : 3000L);
        Bundle bundle15 = bundle.getBundle(f35879m0);
        if (bundle15 == null) {
            tt81Var = tt81.f223553b;
        } else {
            ArrayList parcelableArrayList2 = bundle15.getParcelableArrayList(tt81.f223554c);
            tt81Var = new tt81(parcelableArrayList2 == null ? wsv0.f254763e : hra.m48368n(parcelableArrayList2, new qg9(25)));
        }
        Bundle bundle16 = bundle.getBundle(f35878l0);
        return new cap0(playbackException, i4, n201VarM63535b, e7p0VarM38066c, e7p0VarM38066c2, i5, h1p0Var, i6, z, k9c1Var, cp71Var, i9, phd0VarM69978b, f, f2, xs6VarM91965a, i10, o0mVar, x6rVar, i15, z2, z3, i16, i17, i18, z4, z5, phd0VarM69978b2, j, j2, j3, tt81Var, bundle16 == null ? dr81.f52193J : dr81.m36706b(bundle16));
    }

    /* JADX INFO: renamed from: a */
    public final cap0 m32066a(xs6 xs6Var) {
        qp71 qp71Var = this.f35899j;
        boolean zM73436p = qp71Var.m73436p();
        n201 n201Var = this.f35892c;
        c95.m31855u(zM73436p || n201Var.f149589a.f56979b < qp71Var.mo26655o());
        return new cap0(this.f35890a, this.f35891b, n201Var, this.f35893d, this.f35894e, this.f35895f, this.f35896g, this.f35897h, this.f35898i, this.f35901l, qp71Var, this.f35900k, this.f35902m, this.f35903n, this.f35904o, xs6Var, this.f35905p, this.f35907r, this.f35908s, this.f35909t, this.f35910u, this.f35911v, this.f35912w, this.f35915z, this.f35883A, this.f35913x, this.f35914y, this.f35884B, this.f35885C, this.f35886D, this.f35887E, this.f35888F, this.f35889G);
    }

    /* JADX INFO: renamed from: b */
    public final cap0 m32067b(tt81 tt81Var) {
        qp71 qp71Var = this.f35899j;
        boolean zM73436p = qp71Var.m73436p();
        n201 n201Var = this.f35892c;
        c95.m31855u(zM73436p || n201Var.f149589a.f56979b < qp71Var.mo26655o());
        return new cap0(this.f35890a, this.f35891b, n201Var, this.f35893d, this.f35894e, this.f35895f, this.f35896g, this.f35897h, this.f35898i, this.f35901l, qp71Var, this.f35900k, this.f35902m, this.f35903n, this.f35904o, this.f35906q, this.f35905p, this.f35907r, this.f35908s, this.f35909t, this.f35910u, this.f35911v, this.f35912w, this.f35915z, this.f35883A, this.f35913x, this.f35914y, this.f35884B, this.f35885C, this.f35886D, this.f35887E, tt81Var, this.f35889G);
    }

    /* JADX INFO: renamed from: c */
    public final cap0 m32068c(int i, boolean z) {
        qp71 qp71Var = this.f35899j;
        boolean zM73436p = qp71Var.m73436p();
        n201 n201Var = this.f35892c;
        c95.m31855u(zM73436p || n201Var.f149589a.f56979b < qp71Var.mo26655o());
        return new cap0(this.f35890a, this.f35891b, n201Var, this.f35893d, this.f35894e, this.f35895f, this.f35896g, this.f35897h, this.f35898i, this.f35901l, qp71Var, this.f35900k, this.f35902m, this.f35903n, this.f35904o, this.f35906q, this.f35905p, this.f35907r, this.f35908s, i, z, this.f35911v, this.f35912w, this.f35915z, this.f35883A, this.f35913x, this.f35914y, this.f35884B, this.f35885C, this.f35886D, this.f35887E, this.f35888F, this.f35889G);
    }

    /* JADX INFO: renamed from: d */
    public final cap0 m32069d(int i, int i2, boolean z) {
        int i3 = this.f35883A;
        boolean z2 = i3 == 3 && z && i2 == 0;
        qp71 qp71Var = this.f35899j;
        boolean zM73436p = qp71Var.m73436p();
        n201 n201Var = this.f35892c;
        c95.m31855u(zM73436p || n201Var.f149589a.f56979b < qp71Var.mo26655o());
        return new cap0(this.f35890a, this.f35891b, n201Var, this.f35893d, this.f35894e, this.f35895f, this.f35896g, this.f35897h, this.f35898i, this.f35901l, qp71Var, this.f35900k, this.f35902m, this.f35903n, this.f35904o, this.f35906q, this.f35905p, this.f35907r, this.f35908s, this.f35909t, this.f35910u, z, i, i2, i3, z2, this.f35914y, this.f35884B, this.f35885C, this.f35886D, this.f35887E, this.f35888F, this.f35889G);
    }

    /* JADX INFO: renamed from: e */
    public final cap0 m32070e(h1p0 h1p0Var) {
        qp71 qp71Var = this.f35899j;
        boolean zM73436p = qp71Var.m73436p();
        n201 n201Var = this.f35892c;
        c95.m31855u(zM73436p || n201Var.f149589a.f56979b < qp71Var.mo26655o());
        return new cap0(this.f35890a, this.f35891b, n201Var, this.f35893d, this.f35894e, this.f35895f, h1p0Var, this.f35897h, this.f35898i, this.f35901l, qp71Var, this.f35900k, this.f35902m, this.f35903n, this.f35904o, this.f35906q, this.f35905p, this.f35907r, this.f35908s, this.f35909t, this.f35910u, this.f35911v, this.f35912w, this.f35915z, this.f35883A, this.f35913x, this.f35914y, this.f35884B, this.f35885C, this.f35886D, this.f35887E, this.f35888F, this.f35889G);
    }

    /* JADX INFO: renamed from: f */
    public final cap0 m32071f(int i, PlaybackException playbackException) {
        boolean z = this.f35911v;
        int i2 = this.f35915z;
        boolean z2 = i == 3 && z && i2 == 0;
        qp71 qp71Var = this.f35899j;
        boolean zM73436p = qp71Var.m73436p();
        n201 n201Var = this.f35892c;
        c95.m31855u(zM73436p || n201Var.f149589a.f56979b < qp71Var.mo26655o());
        return new cap0(playbackException, this.f35891b, n201Var, this.f35893d, this.f35894e, this.f35895f, this.f35896g, this.f35897h, this.f35898i, this.f35901l, qp71Var, this.f35900k, this.f35902m, this.f35903n, this.f35904o, this.f35906q, this.f35905p, this.f35907r, this.f35908s, this.f35909t, this.f35910u, z, this.f35912w, i2, i, z2, this.f35914y, this.f35884B, this.f35885C, this.f35886D, this.f35887E, this.f35888F, this.f35889G);
    }

    /* JADX INFO: renamed from: g */
    public final cap0 m32072g(phd0 phd0Var) {
        qp71 qp71Var = this.f35899j;
        boolean zM73436p = qp71Var.m73436p();
        n201 n201Var = this.f35892c;
        c95.m31855u(zM73436p || n201Var.f149589a.f56979b < qp71Var.mo26655o());
        return new cap0(this.f35890a, this.f35891b, n201Var, this.f35893d, this.f35894e, this.f35895f, this.f35896g, this.f35897h, this.f35898i, this.f35901l, qp71Var, this.f35900k, phd0Var, this.f35903n, this.f35904o, this.f35906q, this.f35905p, this.f35907r, this.f35908s, this.f35909t, this.f35910u, this.f35911v, this.f35912w, this.f35915z, this.f35883A, this.f35913x, this.f35914y, this.f35884B, this.f35885C, this.f35886D, this.f35887E, this.f35888F, this.f35889G);
    }

    /* JADX INFO: renamed from: h */
    public final cap0 m32073h(e7p0 e7p0Var, e7p0 e7p0Var2, int i) {
        qp71 qp71Var = this.f35899j;
        boolean zM73436p = qp71Var.m73436p();
        n201 n201Var = this.f35892c;
        c95.m31855u(zM73436p || n201Var.f149589a.f56979b < qp71Var.mo26655o());
        return new cap0(this.f35890a, this.f35891b, n201Var, e7p0Var, e7p0Var2, i, this.f35896g, this.f35897h, this.f35898i, this.f35901l, qp71Var, this.f35900k, this.f35902m, this.f35903n, this.f35904o, this.f35906q, this.f35905p, this.f35907r, this.f35908s, this.f35909t, this.f35910u, this.f35911v, this.f35912w, this.f35915z, this.f35883A, this.f35913x, this.f35914y, this.f35884B, this.f35885C, this.f35886D, this.f35887E, this.f35888F, this.f35889G);
    }

    /* JADX INFO: renamed from: i */
    public final cap0 m32074i(int i) {
        qp71 qp71Var = this.f35899j;
        boolean zM73436p = qp71Var.m73436p();
        n201 n201Var = this.f35892c;
        c95.m31855u(zM73436p || n201Var.f149589a.f56979b < qp71Var.mo26655o());
        return new cap0(this.f35890a, this.f35891b, n201Var, this.f35893d, this.f35894e, this.f35895f, this.f35896g, i, this.f35898i, this.f35901l, qp71Var, this.f35900k, this.f35902m, this.f35903n, this.f35904o, this.f35906q, this.f35905p, this.f35907r, this.f35908s, this.f35909t, this.f35910u, this.f35911v, this.f35912w, this.f35915z, this.f35883A, this.f35913x, this.f35914y, this.f35884B, this.f35885C, this.f35886D, this.f35887E, this.f35888F, this.f35889G);
    }

    /* JADX INFO: renamed from: j */
    public final cap0 m32075j(n201 n201Var) {
        qp71 qp71Var = this.f35899j;
        c95.m31855u(qp71Var.m73436p() || n201Var.f149589a.f56979b < qp71Var.mo26655o());
        return new cap0(this.f35890a, this.f35891b, n201Var, this.f35893d, this.f35894e, this.f35895f, this.f35896g, this.f35897h, this.f35898i, this.f35901l, qp71Var, this.f35900k, this.f35902m, this.f35903n, this.f35904o, this.f35906q, this.f35905p, this.f35907r, this.f35908s, this.f35909t, this.f35910u, this.f35911v, this.f35912w, this.f35915z, this.f35883A, this.f35913x, this.f35914y, this.f35884B, this.f35885C, this.f35886D, this.f35887E, this.f35888F, this.f35889G);
    }

    /* JADX INFO: renamed from: k */
    public final cap0 m32076k(boolean z) {
        qp71 qp71Var = this.f35899j;
        boolean zM73436p = qp71Var.m73436p();
        n201 n201Var = this.f35892c;
        c95.m31855u(zM73436p || n201Var.f149589a.f56979b < qp71Var.mo26655o());
        return new cap0(this.f35890a, this.f35891b, n201Var, this.f35893d, this.f35894e, this.f35895f, this.f35896g, this.f35897h, z, this.f35901l, qp71Var, this.f35900k, this.f35902m, this.f35903n, this.f35904o, this.f35906q, this.f35905p, this.f35907r, this.f35908s, this.f35909t, this.f35910u, this.f35911v, this.f35912w, this.f35915z, this.f35883A, this.f35913x, this.f35914y, this.f35884B, this.f35885C, this.f35886D, this.f35887E, this.f35888F, this.f35889G);
    }

    /* JADX INFO: renamed from: l */
    public final cap0 m32077l(qp71 qp71Var) {
        boolean zM73436p = qp71Var.m73436p();
        n201 n201Var = this.f35892c;
        c95.m31855u(zM73436p || n201Var.f149589a.f56979b < qp71Var.mo26655o());
        return new cap0(this.f35890a, this.f35891b, n201Var, this.f35893d, this.f35894e, this.f35895f, this.f35896g, this.f35897h, this.f35898i, this.f35901l, qp71Var, this.f35900k, this.f35902m, this.f35903n, this.f35904o, this.f35906q, this.f35905p, this.f35907r, this.f35908s, this.f35909t, this.f35910u, this.f35911v, this.f35912w, this.f35915z, this.f35883A, this.f35913x, this.f35914y, this.f35884B, this.f35885C, this.f35886D, this.f35887E, this.f35888F, this.f35889G);
    }

    /* JADX INFO: renamed from: m */
    public final cap0 m32078m(qp71 qp71Var, n201 n201Var, int i) {
        c95.m31855u(qp71Var.m73436p() || n201Var.f149589a.f56979b < qp71Var.mo26655o());
        return new cap0(this.f35890a, this.f35891b, n201Var, this.f35893d, this.f35894e, this.f35895f, this.f35896g, this.f35897h, this.f35898i, this.f35901l, qp71Var, i, this.f35902m, this.f35903n, this.f35904o, this.f35906q, this.f35905p, this.f35907r, this.f35908s, this.f35909t, this.f35910u, this.f35911v, this.f35912w, this.f35915z, this.f35883A, this.f35913x, this.f35914y, this.f35884B, this.f35885C, this.f35886D, this.f35887E, this.f35888F, this.f35889G);
    }

    /* JADX INFO: renamed from: n */
    public final cap0 m32079n(dr81 dr81Var) {
        qp71 qp71Var = this.f35899j;
        boolean zM73436p = qp71Var.m73436p();
        n201 n201Var = this.f35892c;
        c95.m31855u(zM73436p || n201Var.f149589a.f56979b < qp71Var.mo26655o());
        return new cap0(this.f35890a, this.f35891b, n201Var, this.f35893d, this.f35894e, this.f35895f, this.f35896g, this.f35897h, this.f35898i, this.f35901l, qp71Var, this.f35900k, this.f35902m, this.f35903n, this.f35904o, this.f35906q, this.f35905p, this.f35907r, this.f35908s, this.f35909t, this.f35910u, this.f35911v, this.f35912w, this.f35915z, this.f35883A, this.f35913x, this.f35914y, this.f35884B, this.f35885C, this.f35886D, this.f35887E, this.f35888F, dr81Var);
    }

    /* JADX INFO: renamed from: o */
    public final cap0 m32080o(float f) {
        float f2 = f != 0.0f ? f : this.f35903n;
        qp71 qp71Var = this.f35899j;
        boolean zM73436p = qp71Var.m73436p();
        n201 n201Var = this.f35892c;
        c95.m31855u(zM73436p || n201Var.f149589a.f56979b < qp71Var.mo26655o());
        return new cap0(this.f35890a, this.f35891b, n201Var, this.f35893d, this.f35894e, this.f35895f, this.f35896g, this.f35897h, this.f35898i, this.f35901l, qp71Var, this.f35900k, this.f35902m, f, f2, this.f35906q, this.f35905p, this.f35907r, this.f35908s, this.f35909t, this.f35910u, this.f35911v, this.f35912w, this.f35915z, this.f35883A, this.f35913x, this.f35914y, this.f35884B, this.f35885C, this.f35886D, this.f35887E, this.f35888F, this.f35889G);
    }

    /* JADX INFO: renamed from: p */
    public final cap0 m32081p(b7p0 b7p0Var, boolean z, boolean z2) {
        float f;
        float f2;
        int i;
        boolean z3;
        int i2;
        boolean zM28393a = b7p0Var.m28393a(16);
        boolean zM28393a2 = b7p0Var.m28393a(17);
        n201 n201Var = this.f35892c;
        n201 n201VarM63536a = n201Var.m63536a(zM28393a, zM28393a2);
        e7p0 e7p0VarM38068b = this.f35893d.m38068b(zM28393a, zM28393a2);
        e7p0 e7p0VarM38068b2 = this.f35894e.m38068b(zM28393a, zM28393a2);
        boolean z4 = true;
        qp71 cp71Var = this.f35899j;
        if (!zM28393a2 && zM28393a && !cp71Var.m73436p()) {
            int i3 = n201Var.f149589a.f56979b;
            if (cp71Var.mo26655o() != 1) {
                mp71 mp71VarMo26654n = cp71Var.mo26654n(i3, new mp71(), 0L);
                jf40 jf40VarM69788m = pf40.m69788m();
                int i4 = mp71VarMo26654n.f145939n;
                while (true) {
                    i2 = mp71VarMo26654n.f145940o;
                    if (i4 > i2) {
                        break;
                    }
                    bp71 bp71VarMo26651f = cp71Var.mo26651f(i4, new bp71(), true);
                    bp71VarMo26651f.f29345c = 0;
                    jf40VarM69788m.m28985c(bp71VarMo26651f);
                    i4++;
                }
                mp71VarMo26654n.f145940o = i2 - mp71VarMo26654n.f145939n;
                mp71VarMo26654n.f145939n = 0;
                cp71Var = new cp71(pf40.m69794t(mp71VarMo26654n), jf40VarM69788m.m53150g(), new int[]{0});
            }
        } else if (z || !zM28393a2) {
            cp71Var = qp71.f191180a;
        }
        qp71 qp71Var = cp71Var;
        phd0 phd0Var = !b7p0Var.m28393a(18) ? phd0.f177558M : this.f35902m;
        if (b7p0Var.m28393a(22)) {
            f = this.f35903n;
            f2 = this.f35904o;
        } else {
            f = 1.0f;
            f2 = 1.0f;
        }
        xs6 xs6Var = !b7p0Var.m28393a(21) ? xs6.f265509i : this.f35906q;
        o0m o0mVar = !b7p0Var.m28393a(28) ? o0m.f160423d : this.f35907r;
        if (b7p0Var.m28393a(23)) {
            i = this.f35909t;
            z3 = this.f35910u;
        } else {
            i = 0;
            z3 = false;
        }
        phd0 phd0Var2 = !b7p0Var.m28393a(18) ? phd0.f177558M : this.f35884B;
        tt81 tt81Var = (z2 || !b7p0Var.m28393a(30)) ? tt81.f223553b : this.f35888F;
        if (!qp71Var.m73436p() && n201VarM63536a.f149589a.f56979b >= qp71Var.mo26655o()) {
            z4 = false;
        }
        c95.m31855u(z4);
        return new cap0(this.f35890a, this.f35891b, n201VarM63536a, e7p0VarM38068b, e7p0VarM38068b2, this.f35895f, this.f35896g, this.f35897h, this.f35898i, this.f35901l, qp71Var, this.f35900k, phd0Var, f, f2, xs6Var, this.f35905p, o0mVar, this.f35908s, i, z3, this.f35911v, this.f35912w, this.f35915z, this.f35883A, this.f35913x, this.f35914y, phd0Var2, this.f35885C, this.f35886D, this.f35887E, tt81Var, this.f35889G);
    }

    /* JADX INFO: renamed from: r */
    public final ufd0 m32082r() {
        qp71 qp71Var = this.f35899j;
        if (qp71Var.m73436p()) {
            return null;
        }
        return qp71Var.mo26654n(this.f35892c.f149589a.f56979b, new mp71(), 0L).f145928c;
    }

    /* JADX INFO: renamed from: s */
    public final Bundle m32083s(int i) {
        long j;
        int i2;
        Bundle bundle;
        ArrayList arrayList;
        qp71 qp71Var;
        int i3;
        Bundle bundle2;
        int i4 = i;
        Bundle bundle3 = new Bundle();
        PlaybackException playbackException = this.f35890a;
        if (playbackException != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt(PlaybackException.f959d, playbackException.f965a);
            bundle4.putLong(PlaybackException.f960e, playbackException.f966b);
            bundle4.putString(PlaybackException.f961f, playbackException.getMessage());
            bundle4.putBundle(PlaybackException.f964i, playbackException.f967c);
            Throwable cause = playbackException.getCause();
            if (cause != null) {
                bundle4.putString(PlaybackException.f962g, cause.getClass().getName());
                bundle4.putString(PlaybackException.f963h, cause.getMessage());
            }
            bundle3.putBundle(f35867a0, bundle4);
        }
        int i5 = this.f35891b;
        if (i5 != 0) {
            bundle3.putInt(f35869c0, i5);
        }
        n201 n201Var = this.f35892c;
        if (i4 < 3 || !n201Var.equals(n201.f149578l)) {
            bundle3.putBundle(f35868b0, n201Var.m63537c(i4));
        }
        e7p0 e7p0Var = this.f35893d;
        if (i4 < 3 || !n201.f149577k.m38067a(e7p0Var)) {
            bundle3.putBundle(f35870d0, e7p0Var.m38069d(i4));
        }
        e7p0 e7p0Var2 = this.f35894e;
        if (i4 < 3 || !n201.f149577k.m38067a(e7p0Var2)) {
            bundle3.putBundle(f35871e0, e7p0Var2.m38069d(i4));
        }
        int i6 = this.f35895f;
        if (i6 != 0) {
            bundle3.putInt(f35872f0, i6);
        }
        h1p0 h1p0Var = h1p0.f86671d;
        h1p0 h1p0Var2 = this.f35896g;
        if (!h1p0Var2.equals(h1p0Var)) {
            Bundle bundle5 = new Bundle();
            bundle5.putFloat(h1p0.f86672e, h1p0Var2.f86674a);
            bundle5.putFloat(h1p0.f86673f, h1p0Var2.f86675b);
            bundle3.putBundle(f35849I, bundle5);
        }
        int i7 = this.f35897h;
        if (i7 != 0) {
            bundle3.putInt(f35850J, i7);
        }
        boolean z = this.f35898i;
        if (z) {
            bundle3.putBoolean(f35851K, z);
        }
        ap71 ap71Var = qp71.f191180a;
        qp71 qp71Var2 = this.f35899j;
        int i8 = 0;
        boolean z2 = true;
        long j2 = 0;
        if (qp71Var2.equals(ap71Var)) {
            j = 0;
        } else {
            ArrayList arrayList2 = new ArrayList();
            int iMo26655o = qp71Var2.mo26655o();
            mp71 mp71Var = new mp71();
            int i9 = 0;
            while (i9 < iMo26655o) {
                mp71 mp71VarMo26654n = qp71Var2.mo26654n(i9, mp71Var, j2);
                mp71VarMo26654n.getClass();
                Bundle bundle6 = new Bundle();
                long j3 = j2;
                if (!ufd0.f229755g.equals(mp71VarMo26654n.f145928c)) {
                    bundle6.putBundle(mp71.f145918s, mp71VarMo26654n.f145928c.m82985e(i4, false));
                }
                long j4 = mp71VarMo26654n.f145930e;
                if (j4 != -9223372036854775807L) {
                    bundle6.putLong(mp71.f145919t, j4);
                }
                long j5 = mp71VarMo26654n.f145931f;
                if (j5 != r12) {
                    bundle6.putLong(mp71.f145920u, j5);
                }
                long j6 = mp71VarMo26654n.f145932g;
                if (j6 != r12) {
                    bundle6.putLong(mp71.f145921v, j6);
                }
                boolean z3 = mp71VarMo26654n.f145933h;
                if (z3) {
                    bundle6.putBoolean(mp71.f145922w, z3);
                }
                boolean z4 = mp71VarMo26654n.f145934i;
                if (z4) {
                    bundle6.putBoolean(mp71.f145923x, z4);
                }
                nfd0 nfd0Var = mp71VarMo26654n.f145935j;
                if (nfd0Var != null) {
                    bundle6.putBundle(mp71.f145924y, nfd0Var.m64341c());
                }
                boolean z5 = mp71VarMo26654n.f145936k;
                if (z5) {
                    bundle6.putBoolean(mp71.f145925z, z5);
                }
                long j7 = mp71VarMo26654n.f145937l;
                if (j7 != j3) {
                    bundle6.putLong(mp71.f145910A, j7);
                }
                long j8 = mp71VarMo26654n.f145938m;
                if (j8 != -9223372036854775807) {
                    bundle6.putLong(mp71.f145911B, j8);
                }
                int i10 = mp71VarMo26654n.f145939n;
                if (i10 != 0) {
                    bundle6.putInt(mp71.f145912C, i10);
                }
                int i11 = mp71VarMo26654n.f145940o;
                if (i11 != 0) {
                    bundle6.putInt(mp71.f145913D, i11);
                }
                long j9 = mp71VarMo26654n.f145941p;
                if (j9 != j3) {
                    bundle6.putLong(mp71.f145914E, j9);
                }
                Object obj = mp71VarMo26654n.f145926a;
                if (obj instanceof String) {
                    bundle6.putString(mp71.f145915F, (String) obj);
                }
                arrayList2.add(bundle6);
                i9++;
                j2 = j3;
            }
            j = j2;
            ArrayList arrayList3 = new ArrayList();
            int iMo26652h = qp71Var2.mo26652h();
            bp71 bp71Var = new bp71();
            int i12 = 0;
            while (i12 < iMo26652h) {
                bp71 bp71VarMo26651f = qp71Var2.mo26651f(i12, bp71Var, z2);
                bp71VarMo26651f.getClass();
                Bundle bundle7 = new Bundle();
                int i13 = bp71VarMo26651f.f29345c;
                if (i13 != 0) {
                    bundle7.putInt(bp71.f29336h, i13);
                }
                long j10 = bp71VarMo26651f.f29346d;
                if (j10 != -9223372036854775807L) {
                    bundle7.putLong(bp71.f29337i, j10);
                }
                long j11 = bp71VarMo26651f.f29347e;
                if (j11 != j) {
                    bundle7.putLong(bp71.f29338j, j11);
                }
                boolean z6 = bp71VarMo26651f.f29348f;
                if (z6) {
                    bundle7.putBoolean(bp71.f29339k, z6);
                }
                if (bp71VarMo26651f.f29349g.equals(kt0.f126088f)) {
                    bundle = bundle3;
                    arrayList = arrayList2;
                    qp71Var = qp71Var2;
                    i3 = i12;
                } else {
                    String str = bp71.f29340l;
                    kt0 kt0Var = bp71VarMo26651f.f29349g;
                    kt0Var.getClass();
                    Bundle bundle8 = new Bundle();
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    ht0[] ht0VarArr = kt0Var.f126098e;
                    int length = ht0VarArr.length;
                    int i14 = i8;
                    while (i14 < length) {
                        int i15 = i14;
                        ht0 ht0Var = ht0VarArr[i15];
                        ht0Var.getClass();
                        int i16 = length;
                        Bundle bundle9 = new Bundle();
                        int i17 = i12;
                        Bundle bundle10 = bundle3;
                        ArrayList arrayList5 = arrayList2;
                        bundle9.putLong(ht0.f94866m, ht0Var.f94878a);
                        bundle9.putInt(ht0.f94867n, ht0Var.f94879b);
                        bundle9.putInt(ht0.f94873t, ht0Var.f94880c);
                        bundle9.putParcelableArrayList(ht0.f94868o, new ArrayList<>(Arrays.asList(ht0Var.f94881d)));
                        String str2 = ht0.f94874u;
                        ArrayList<? extends Parcelable> arrayList6 = new ArrayList<>();
                        ufd0[] ufd0VarArr = ht0Var.f94882e;
                        int length2 = ufd0VarArr.length;
                        int i18 = i8;
                        while (true) {
                            Bundle bundleM82985e = null;
                            if (i18 >= length2) {
                                break;
                            }
                            int i19 = length2;
                            ufd0 ufd0Var = ufd0VarArr[i18];
                            if (ufd0Var != null) {
                                bundleM82985e = ufd0Var.m82985e(i4, true);
                            }
                            arrayList6.add(bundleM82985e);
                            i18++;
                            length2 = i19;
                        }
                        bundle9.putParcelableArrayList(str2, arrayList6);
                        bundle9.putIntArray(ht0.f94869p, ht0Var.f94883f);
                        bundle9.putLongArray(ht0.f94870q, ht0Var.f94884g);
                        bundle9.putLong(ht0.f94871r, ht0Var.f94887j);
                        bundle9.putBoolean(ht0.f94872s, ht0Var.f94888k);
                        bundle9.putStringArrayList(ht0.f94875v, new ArrayList<>(Arrays.asList(ht0Var.f94885h)));
                        String str3 = ht0.f94877x;
                        ArrayList<? extends Parcelable> arrayList7 = new ArrayList<>();
                        it0[] it0VarArr = ht0Var.f94886i;
                        int length3 = it0VarArr.length;
                        int i20 = i8;
                        while (i20 < length3) {
                            int i21 = i20;
                            it0 it0Var = it0VarArr[i21];
                            if (it0Var == null) {
                                bundle2 = null;
                            } else {
                                bundle2 = new Bundle();
                                bundle2.putLong(it0.f105376d, it0Var.f105379a);
                                bundle2.putLong(it0.f105377e, it0Var.f105380b);
                                bundle2.putString(it0.f105378f, it0Var.f105381c);
                            }
                            arrayList7.add(bundle2);
                            i20 = i21 + 1;
                            length3 = length3;
                            qp71Var2 = qp71Var2;
                            str = str;
                        }
                        bundle9.putParcelableArrayList(str3, arrayList7);
                        bundle9.putBoolean(ht0.f94876w, ht0Var.f94889l);
                        arrayList4.add(bundle9);
                        i14 = i15 + 1;
                        i4 = i;
                        length = i16;
                        i12 = i17;
                        bundle3 = bundle10;
                        arrayList2 = arrayList5;
                    }
                    bundle = bundle3;
                    arrayList = arrayList2;
                    qp71Var = qp71Var2;
                    String str4 = str;
                    i3 = i12;
                    if (!arrayList4.isEmpty()) {
                        bundle8.putParcelableArrayList(kt0.f126090h, arrayList4);
                    }
                    long j12 = kt0Var.f126095b;
                    if (j12 != j) {
                        bundle8.putLong(kt0.f126091i, j12);
                    }
                    long j13 = kt0Var.f126096c;
                    if (j13 != -9223372036854775807L) {
                        bundle8.putLong(kt0.f126092j, j13);
                    }
                    int i22 = kt0Var.f126097d;
                    if (i22 != 0) {
                        bundle8.putInt(kt0.f126093k, i22);
                    }
                    bundle7.putBundle(str4, bundle8);
                }
                Object obj2 = bp71VarMo26651f.f29343a;
                if (obj2 instanceof String) {
                    bundle7.putString(bp71.f29341m, (String) obj2);
                }
                Object obj3 = bp71VarMo26651f.f29344b;
                if (obj3 instanceof String) {
                    bundle7.putString(bp71.f29342n, (String) obj3);
                }
                arrayList3.add(bundle7);
                i12 = i3 + 1;
                i4 = i;
                i8 = i8;
                iMo26652h = iMo26652h;
                bp71Var = bp71Var;
                bundle3 = bundle;
                arrayList2 = arrayList;
                qp71Var2 = qp71Var;
                z2 = true;
            }
            Bundle bundle11 = bundle3;
            ArrayList arrayList8 = arrayList2;
            qp71 qp71Var3 = qp71Var2;
            int i23 = i8;
            int[] iArr = new int[iMo26655o];
            boolean z7 = true;
            if (iMo26655o > 0) {
                iArr[i23] = qp71Var3.mo33542a(true);
            }
            int i24 = 1;
            while (i24 < iMo26655o) {
                iArr[i24] = qp71Var3.mo33544e(iArr[i24 - 1], i23, z7);
                i24++;
                z7 = true;
                i23 = 0;
            }
            Bundle bundle12 = new Bundle();
            bundle12.putBinder(qp71.f191181b, new kra(arrayList8));
            bundle12.putBinder(qp71.f191182c, new kra(arrayList3));
            bundle12.putIntArray(qp71.f191183d, iArr);
            bundle3 = bundle11;
            bundle3.putBundle(f35852L, bundle12);
        }
        int i25 = this.f35900k;
        if (i25 != 0) {
            bundle3.putInt(f35880n0, i25);
        }
        k9c1 k9c1Var = k9c1.f120559d;
        k9c1 k9c1Var2 = this.f35901l;
        if (!k9c1Var2.equals(k9c1Var)) {
            Bundle bundle13 = new Bundle();
            int i26 = k9c1Var2.f120563a;
            if (i26 != 0) {
                bundle13.putInt(k9c1.f120560e, i26);
            }
            int i27 = k9c1Var2.f120564b;
            if (i27 != 0) {
                bundle13.putInt(k9c1.f120561f, i27);
            }
            float f = k9c1Var2.f120565c;
            if (f != 1.0f) {
                bundle13.putFloat(k9c1.f120562g, f);
            }
            bundle3.putBundle(f35853M, bundle13);
        }
        phd0 phd0Var = phd0.f177558M;
        phd0 phd0Var2 = this.f35902m;
        if (phd0Var2.equals(phd0Var)) {
            i2 = i;
        } else {
            i2 = i;
            bundle3.putBundle(f35854N, phd0Var2.m69980c(i2));
        }
        float f2 = this.f35903n;
        if (f2 != 1.0f) {
            bundle3.putFloat(f35855O, f2);
        }
        float f3 = this.f35904o;
        if (f3 != 1.0f) {
            bundle3.putFloat(f35856P, f3);
        }
        int i28 = this.f35905p;
        if (i28 != 0) {
            bundle3.putInt(f35882p0, i28);
        }
        xs6 xs6Var = xs6.f265509i;
        xs6 xs6Var2 = this.f35906q;
        if (!xs6Var2.equals(xs6Var)) {
            bundle3.putBundle(f35857Q, xs6Var2.m91968d());
        }
        o0m o0mVar = o0m.f160423d;
        o0m o0mVar2 = this.f35907r;
        if (!o0mVar2.equals(o0mVar)) {
            Bundle bundle14 = new Bundle();
            String str5 = o0m.f160424e;
            wsv0 wsv0Var = o0mVar2.f160426a;
            jf40 jf40VarM69788m = pf40.m69788m();
            for (int i29 = 0; i29 < wsv0Var.f254765d; i29++) {
                if (((b0m) wsv0Var.get(i29)).f21970d == null) {
                    jf40VarM69788m.m28985c((b0m) wsv0Var.get(i29));
                }
            }
            wsv0 wsv0VarM53150g = jf40VarM69788m.m53150g();
            ArrayList<? extends Parcelable> arrayList9 = new ArrayList<>(wsv0VarM53150g.f254765d);
            kf40 kf40VarListIterator = wsv0VarM53150g.listIterator(0);
            while (kf40VarListIterator.hasNext()) {
                b0m b0mVar = (b0m) kf40VarListIterator.next();
                Bundle bundleM27842c = b0mVar.m27842c();
                Bitmap bitmap = b0mVar.f21970d;
                if (bitmap != null) {
                    bundleM27842c.putParcelable(b0m.f21963w, bitmap);
                }
                arrayList9.add(bundleM27842c);
            }
            bundle14.putParcelableArrayList(str5, arrayList9);
            bundle14.putLong(o0m.f160425f, o0mVar2.f160427b);
            bundle3.putBundle(f35873g0, bundle14);
        }
        x6r x6rVar = x6r.f258724e;
        x6r x6rVar2 = this.f35908s;
        if (!x6rVar2.equals(x6rVar)) {
            Bundle bundle15 = new Bundle();
            int i30 = x6rVar2.f258729a;
            if (i30 != 0) {
                bundle15.putInt(x6r.f258725f, i30);
            }
            int i31 = x6rVar2.f258730b;
            if (i31 != 0) {
                bundle15.putInt(x6r.f258726g, i31);
            }
            int i32 = x6rVar2.f258731c;
            if (i32 != 0) {
                bundle15.putInt(x6r.f258727h, i32);
            }
            String str6 = x6rVar2.f258732d;
            if (str6 != null) {
                bundle15.putString(x6r.f258728i, str6);
            }
            bundle3.putBundle(f35858R, bundle15);
        }
        int i33 = this.f35909t;
        if (i33 != 0) {
            bundle3.putInt(f35859S, i33);
        }
        boolean z8 = this.f35910u;
        if (z8) {
            bundle3.putBoolean(f35860T, z8);
        }
        boolean z9 = this.f35911v;
        if (z9) {
            bundle3.putBoolean(f35861U, z9);
        }
        int i34 = this.f35912w;
        if (i34 != 1) {
            bundle3.putInt(f35862V, i34);
        }
        int i35 = this.f35915z;
        if (i35 != 0) {
            bundle3.putInt(f35863W, i35);
        }
        int i36 = this.f35883A;
        if (i36 != 1) {
            bundle3.putInt(f35864X, i36);
        }
        boolean z10 = this.f35913x;
        if (z10) {
            bundle3.putBoolean(f35865Y, z10);
        }
        boolean z11 = this.f35914y;
        if (z11) {
            bundle3.putBoolean(f35866Z, z11);
        }
        phd0 phd0Var3 = phd0.f177558M;
        phd0 phd0Var4 = this.f35884B;
        if (!phd0Var4.equals(phd0Var3)) {
            bundle3.putBundle(f35874h0, phd0Var4.m69980c(i2));
        }
        long j14 = i2 < 6 ? j : 5000L;
        long j15 = this.f35885C;
        if (j15 != j14) {
            bundle3.putLong(f35875i0, j15);
        }
        long j16 = i2 < 6 ? j : 15000L;
        long j17 = this.f35886D;
        if (j17 != j16) {
            bundle3.putLong(f35876j0, j17);
        }
        long j18 = i2 < 6 ? j : 3000L;
        long j19 = this.f35887E;
        if (j19 != j18) {
            bundle3.putLong(f35877k0, j19);
        }
        tt81 tt81Var = tt81.f223553b;
        tt81 tt81Var2 = this.f35888F;
        if (!tt81Var2.equals(tt81Var)) {
            Bundle bundle16 = new Bundle();
            bundle16.putParcelableArrayList(tt81.f223554c, hra.m48351D(tt81Var2.f223555a, new qg9(24)));
            bundle3.putBundle(f35879m0, bundle16);
        }
        dr81 dr81Var = dr81.f52193J;
        dr81 dr81Var2 = this.f35889G;
        if (!dr81Var2.equals(dr81Var)) {
            bundle3.putBundle(f35878l0, dr81Var2.mo36708c());
        }
        return bundle3;
    }
}
