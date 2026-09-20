package p204p;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dz8 {

    /* JADX INFO: renamed from: y */
    public static final gey[] f54555y = new gey[0];

    /* JADX INFO: renamed from: a */
    public volatile String f54556a;

    /* JADX INFO: renamed from: b */
    public u6l0 f54557b;

    /* JADX INFO: renamed from: c */
    public final Context f54558c;

    /* JADX INFO: renamed from: d */
    public final Looper f54559d;

    /* JADX INFO: renamed from: e */
    public final nvg1 f54560e;

    /* JADX INFO: renamed from: f */
    public final wif1 f54561f;

    /* JADX INFO: renamed from: g */
    public final Object f54562g;

    /* JADX INFO: renamed from: h */
    public final Object f54563h;

    /* JADX INFO: renamed from: i */
    public t6f1 f54564i;

    /* JADX INFO: renamed from: j */
    public cz8 f54565j;

    /* JADX INFO: renamed from: k */
    public IInterface f54566k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f54567l;

    /* JADX INFO: renamed from: m */
    public twf1 f54568m;

    /* JADX INFO: renamed from: n */
    public int f54569n;

    /* JADX INFO: renamed from: o */
    public final c4d1 f54570o;

    /* JADX INFO: renamed from: p */
    public final bqe1 f54571p;

    /* JADX INFO: renamed from: q */
    public final int f54572q;

    /* JADX INFO: renamed from: r */
    public final String f54573r;

    /* JADX INFO: renamed from: s */
    public volatile String f54574s;

    /* JADX INFO: renamed from: t */
    public volatile az1 f54575t;

    /* JADX INFO: renamed from: u */
    public lzi f54576u;

    /* JADX INFO: renamed from: v */
    public boolean f54577v;

    /* JADX INFO: renamed from: w */
    public volatile afg1 f54578w;

    /* JADX INFO: renamed from: x */
    public final AtomicInteger f54579x;

    public dz8(Context context, Looper looper, nvg1 nvg1Var, int i, c4d1 c4d1Var, bqe1 bqe1Var, String str) {
        Object obj = uj10.f230857d;
        this.f54556a = null;
        this.f54562g = new Object();
        this.f54563h = new Object();
        this.f54567l = new ArrayList();
        this.f54569n = 1;
        this.f54576u = null;
        this.f54577v = false;
        this.f54578w = null;
        this.f54579x = new AtomicInteger(0);
        ig31.m50507y(context, "Context must not be null");
        this.f54558c = context;
        ig31.m50507y(looper, "Looper must not be null");
        this.f54559d = looper;
        ig31.m50507y(nvg1Var, "Supervisor must not be null");
        this.f54560e = nvg1Var;
        this.f54561f = new wif1(this, looper);
        this.f54572q = i;
        this.f54570o = c4d1Var;
        this.f54571p = bqe1Var;
        this.f54573r = str;
    }

    /* JADX INFO: renamed from: A */
    public void mo37407A() {
        System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: B */
    public void mo37408B(int i, IBinder iBinder, Bundle bundle, int i2) {
        h1g1 h1g1Var = new h1g1(this, i, iBinder, bundle);
        wif1 wif1Var = this.f54561f;
        wif1Var.sendMessage(wif1Var.obtainMessage(1, i2, -1, h1g1Var));
    }

    /* JADX INFO: renamed from: C */
    public final void m37409C(vaa1 vaa1Var) {
        ((p3f1) vaa1Var.f239173b).f173648w.f273250L0.post(new n081(vaa1Var, 16));
    }

    /* JADX INFO: renamed from: D */
    public final void m37410D(az1 az1Var) {
        this.f54575t = az1Var;
    }

    /* JADX INFO: renamed from: E */
    public final void m37411E(String str) {
        this.f54574s = str;
    }

    /* JADX INFO: renamed from: F */
    public final void m37412F(i82 i82Var, int i, PendingIntent pendingIntent) {
        this.f54565j = i82Var;
        int i2 = this.f54579x.get();
        wif1 wif1Var = this.f54561f;
        wif1Var.sendMessage(wif1Var.obtainMessage(3, i2, i, pendingIntent));
    }

    /* JADX INFO: renamed from: G */
    public boolean mo28583G() {
        return this instanceof yrg1;
    }

    /* JADX INFO: renamed from: H */
    public final void m37413H(int i, int i2, Bundle bundle) {
        x4g1 x4g1Var = new x4g1(this, i, bundle);
        wif1 wif1Var = this.f54561f;
        wif1Var.sendMessage(wif1Var.obtainMessage(7, i2, -1, x4g1Var));
    }

    /* JADX INFO: renamed from: I */
    public final void m37414I(afg1 afg1Var) {
        this.f54578w = afg1Var;
        if (mo28583G()) {
            c0j c0jVar = afg1Var.f15157d;
            ckx0 ckx0VarM33205j = ckx0.m33205j();
            dkx0 dkx0Var = c0jVar == null ? null : c0jVar.f32789a;
            synchronized (ckx0VarM33205j) {
                try {
                    if (dkx0Var == null) {
                        ckx0VarM33205j.f39112b = ckx0.f39108d;
                        return;
                    }
                    dkx0 dkx0Var2 = (dkx0) ckx0VarM33205j.f39112b;
                    if (dkx0Var2 == null || dkx0Var2.f50060a < dkx0Var.f50060a) {
                        ckx0VarM33205j.f39112b = dkx0Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m37415J(int i) {
        m37427V(i, null);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ boolean m37416K(int i, int i2, IInterface iInterface) {
        synchronized (this.f54562g) {
            try {
                if (this.f54569n != i) {
                    return false;
                }
                m37427V(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m37417L() {
        int i;
        int i2;
        synchronized (this.f54562g) {
            i = this.f54569n;
        }
        if (i == 3) {
            this.f54577v = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        wif1 wif1Var = this.f54561f;
        wif1Var.sendMessage(wif1Var.obtainMessage(i2, this.f54579x.get(), 16));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ boolean m37418M() {
        if (this.f54577v || TextUtils.isEmpty(mo24797r()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(mo24797r());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Object m37419N() {
        return this.f54563h;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m37420O(t6f1 t6f1Var) {
        this.f54564i = t6f1Var;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ ArrayList m37421P() {
        return this.f54567l;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ c4d1 m37422Q() {
        return this.f54570o;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ bqe1 m37423R() {
        return this.f54571p;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ lzi m37424S() {
        return this.f54576u;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m37425T(lzi lziVar) {
        this.f54576u = lziVar;
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ boolean m37426U() {
        return this.f54577v;
    }

    /* JADX INFO: renamed from: V */
    public final void m37427V(int i, IInterface iInterface) {
        u6l0 u6l0Var;
        ig31.m50498p((i == 4) == (iInterface != null));
        synchronized (this.f54562g) {
            try {
                this.f54569n = i;
                this.f54566k = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    twf1 twf1Var = this.f54568m;
                    if (twf1Var != null) {
                        nvg1 nvg1Var = this.f54560e;
                        String str = (String) this.f54557b.f227383b;
                        ig31.m50506x(str);
                        String str2 = (String) this.f54557b.f227384c;
                        if (this.f54573r == null) {
                            this.f54558c.getClass();
                        }
                        nvg1Var.m65743b(str, str2, twf1Var, this.f54557b.f227382a);
                        this.f54568m = null;
                    }
                } else if (i == 2 || i == 3) {
                    twf1 twf1Var2 = this.f54568m;
                    if (twf1Var2 != null && (u6l0Var = this.f54557b) != null) {
                        new StringBuilder(String.valueOf((String) u6l0Var.f227383b).length() + 70 + String.valueOf((String) u6l0Var.f227384c).length());
                        nvg1 nvg1Var2 = this.f54560e;
                        String str3 = (String) this.f54557b.f227383b;
                        ig31.m50506x(str3);
                        String str4 = (String) this.f54557b.f227384c;
                        if (this.f54573r == null) {
                            this.f54558c.getClass();
                        }
                        nvg1Var2.m65743b(str3, str4, twf1Var2, this.f54557b.f227382a);
                        this.f54579x.incrementAndGet();
                    }
                    twf1 twf1Var3 = new twf1(this, this.f54579x.get());
                    this.f54568m = twf1Var3;
                    String strMo37439t = mo37439t();
                    String strMo24798s = mo24798s();
                    boolean zMo24799v = mo24799v();
                    this.f54557b = new u6l0(strMo37439t, strMo24798s, zMo24799v);
                    if (zMo24799v && mo24793d() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f54557b.f227383b)));
                    }
                    nvg1 nvg1Var3 = this.f54560e;
                    String str5 = (String) this.f54557b.f227383b;
                    ig31.m50506x(str5);
                    String str6 = (String) this.f54557b.f227384c;
                    String name = this.f54573r;
                    if (name == null) {
                        name = this.f54558c.getClass().getName();
                    }
                    lzi lziVarM65742a = nvg1Var3.m65742a(new dqg1(str5, str6, this.f54557b.f227382a), twf1Var3, name);
                    if (!(lziVarM65742a.f138371b == 0)) {
                        u6l0 u6l0Var2 = this.f54557b;
                        new StringBuilder(String.valueOf((String) u6l0Var2.f227383b).length() + 34 + String.valueOf((String) u6l0Var2.f227384c).length());
                        int i2 = lziVarM65742a.f138371b;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (lziVarM65742a.f138372c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", lziVarM65742a.f138372c);
                        }
                        m37413H(i2, this.f54579x.get(), bundle);
                    }
                } else if (i == 4) {
                    ig31.m50506x(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean mo37428a() {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo27713b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void mo37429c(cz8 cz8Var) {
        this.f54565j = cz8Var;
        m37427V(2, null);
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo24793d();

    /* JADX INFO: renamed from: e */
    public abstract IInterface mo24794e(IBinder iBinder);

    /* JADX INFO: renamed from: f */
    public void mo32171f() {
        this.f54579x.incrementAndGet();
        ArrayList arrayList = this.f54567l;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    a6f1 a6f1Var = (a6f1) arrayList.get(i);
                    synchronized (a6f1Var) {
                        a6f1Var.f12789a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f54563h) {
            this.f54564i = null;
        }
        m37427V(1, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m37430g(String str) {
        this.f54556a = str;
        mo32171f();
    }

    /* JADX INFO: renamed from: h */
    public gey[] mo24795h() {
        return f54555y;
    }

    /* JADX INFO: renamed from: i */
    public final gey[] m37431i() {
        afg1 afg1Var = this.f54578w;
        if (afg1Var == null) {
            return null;
        }
        return afg1Var.f15155b;
    }

    /* JADX INFO: renamed from: j */
    public Bundle mo37432j() {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final Context m37433k() {
        return this.f54558c;
    }

    /* JADX INFO: renamed from: l */
    public final String m37434l() {
        u6l0 u6l0Var;
        if (!m37442x() || (u6l0Var = this.f54557b) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return (String) u6l0Var.f227384c;
    }

    /* JADX INFO: renamed from: m */
    public final int m37435m() {
        return this.f54572q;
    }

    /* JADX INFO: renamed from: n */
    public Bundle mo24796n() {
        return new Bundle();
    }

    /* JADX INFO: renamed from: o */
    public final String m37436o() {
        return this.f54556a;
    }

    /* JADX INFO: renamed from: p */
    public final void m37437p(yt30 yt30Var, Set set) {
        AttributionSource attributionSource;
        Bundle bundleMo24796n = mo24796n();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.f54575t == null || (attributionSource = (AttributionSource) this.f54575t.f21394b) == null || attributionSource.getAttributionTag() == null) ? this.f54574s : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i = this.f54572q;
        int i2 = vj10.f241853a;
        Scope[] scopeArr = eb10.f57767M0;
        Bundle bundle = new Bundle();
        gey[] geyVarArr = eb10.f57768N0;
        eb10 eb10Var = new eb10(6, i, i2, null, null, scopeArr, bundle, null, geyVarArr, geyVarArr, true, 0, false, str);
        eb10Var.f57776d = this.f54558c.getPackageName();
        eb10Var.f57779g = bundleMo24796n;
        if (set != null) {
            eb10Var.f57778f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (mo27713b()) {
            Account account = ((li10) this).f133686A;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            eb10Var.f57780h = account;
            if (yt30Var != null) {
                eb10Var.f57777e = yt30Var.asBinder();
            }
        }
        eb10Var.f57781i = f54555y;
        eb10Var.f57782t = mo24795h();
        if (mo28583G()) {
            eb10Var.f57772Z = true;
        }
        try {
            try {
                synchronized (this.f54563h) {
                    try {
                        t6f1 t6f1Var = this.f54564i;
                        if (t6f1Var != null) {
                            t6f1Var.m80161C(new trf1(this, this.f54579x.get()), eb10Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                mo37408B(8, null, null, this.f54579x.get());
            }
        } catch (DeadObjectException unused2) {
            int i3 = this.f54579x.get();
            wif1 wif1Var = this.f54561f;
            wif1Var.sendMessage(wif1Var.obtainMessage(6, i3, 3));
        } catch (SecurityException e) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: q */
    public final IInterface m37438q() {
        IInterface iInterface;
        synchronized (this.f54562g) {
            try {
                if (this.f54569n == 5) {
                    throw new DeadObjectException();
                }
                if (!m37442x()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface2 = this.f54566k;
                ig31.m50507y(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    /* JADX INFO: renamed from: r */
    public abstract String mo24797r();

    /* JADX INFO: renamed from: s */
    public abstract String mo24798s();

    /* JADX INFO: renamed from: t */
    public String mo37439t() {
        return "com.google.android.gms";
    }

    /* JADX INFO: renamed from: u */
    public final c0j m37440u() {
        afg1 afg1Var = this.f54578w;
        if (afg1Var == null) {
            return null;
        }
        return afg1Var.f15157d;
    }

    /* JADX INFO: renamed from: v */
    public boolean mo24799v() {
        return mo24793d() >= 211700000;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m37441w() {
        return this.f54578w != null;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m37442x() {
        boolean z;
        synchronized (this.f54562g) {
            z = this.f54569n == 4;
        }
        return z;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m37443y() {
        boolean z;
        synchronized (this.f54562g) {
            int i = this.f54569n;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: z */
    public void mo37444z(lzi lziVar) {
        lziVar.getClass();
        System.currentTimeMillis();
    }
}
