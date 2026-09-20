package p204p;

import androidx.car.app.model.Alert;
import com.google.android.recaptcha.internal.zzagk;
import com.google.android.recaptcha.internal.zzahy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class laf1 extends k9f1 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zza;
    protected fcf1 zzc;

    public laf1() {
        this.zzb = 0;
        this.zza = -1;
        this.zzc = fcf1.f68108f;
    }

    /* JADX INFO: renamed from: l */
    public static laf1 m58545l(Class cls) {
        Map map = zzd;
        laf1 laf1Var = (laf1) map.get(cls);
        if (laf1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                laf1Var = (laf1) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (laf1Var != null) {
            return laf1Var;
        }
        laf1 laf1Var2 = (laf1) ((laf1) jcf1.m52964a(cls)).mo25248u(6);
        if (laf1Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, laf1Var2);
        return laf1Var2;
    }

    /* JADX INFO: renamed from: m */
    public static void m58546m(Class cls, laf1 laf1Var) {
        laf1Var.m58554g();
        zzd.put(cls, laf1Var);
    }

    /* JADX INFO: renamed from: n */
    public static Object m58547n(Method method, laf1 laf1Var, Object... objArr) {
        try {
            return method.invoke(laf1Var, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: o */
    public static laf1 m58548o(laf1 laf1Var, s9f1 s9f1Var) throws zzagk {
        haf1 haf1Var = haf1.f89214b;
        int i = m9f1.f141300a;
        haf1 haf1Var2 = haf1.f89214b;
        v9f1 v9f1VarMo69386r = s9f1Var.mo69386r();
        laf1 laf1VarM58555h = laf1Var.m58555h();
        try {
            vbf1 vbf1VarM72493a = qbf1.f187085b.m72493a(laf1VarM58555h.getClass());
            gx8 gx8Var = v9f1VarMo69386r.f238940c;
            if (gx8Var == null) {
                gx8Var = new gx8(v9f1VarMo69386r);
            }
            vbf1VarM72493a.mo61389h(laf1VarM58555h, gx8Var, haf1Var2);
            vbf1VarM72493a.mo61382a(laf1VarM58555h);
            v9f1VarMo69386r.mo80292i();
            m58553t(laf1VarM58555h);
            m58553t(laf1VarM58555h);
            return laf1VarM58555h;
        } catch (zzagk e) {
            if (e.f2333a) {
                throw new zzagk(e.getMessage(), e);
            }
            throw e;
        } catch (zzahy e2) {
            throw new zzagk(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzagk) {
                throw ((zzagk) e3.getCause());
            }
            throw new zzagk(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzagk) {
                throw ((zzagk) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX INFO: renamed from: p */
    public static laf1 m58549p(laf1 laf1Var, s9f1 s9f1Var, haf1 haf1Var) throws zzagk {
        v9f1 v9f1VarMo69386r = s9f1Var.mo69386r();
        laf1 laf1VarM58555h = laf1Var.m58555h();
        try {
            vbf1 vbf1VarM72493a = qbf1.f187085b.m72493a(laf1VarM58555h.getClass());
            gx8 gx8Var = v9f1VarMo69386r.f238940c;
            if (gx8Var == null) {
                gx8Var = new gx8(v9f1VarMo69386r);
            }
            vbf1VarM72493a.mo61389h(laf1VarM58555h, gx8Var, haf1Var);
            vbf1VarM72493a.mo61382a(laf1VarM58555h);
            v9f1VarMo69386r.mo80292i();
            m58553t(laf1VarM58555h);
            return laf1VarM58555h;
        } catch (zzagk e) {
            if (e.f2333a) {
                throw new zzagk(e.getMessage(), e);
            }
            throw e;
        } catch (zzahy e2) {
            throw new zzagk(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzagk) {
                throw ((zzagk) e3.getCause());
            }
            throw new zzagk(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzagk) {
                throw ((zzagk) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX INFO: renamed from: q */
    public static laf1 m58550q(laf1 laf1Var, byte[] bArr) throws zzagk {
        int length = bArr.length;
        haf1 haf1Var = haf1.f89214b;
        int i = m9f1.f141300a;
        laf1 laf1VarM58552s = m58552s(laf1Var, bArr, length, haf1.f89214b);
        m58553t(laf1VarM58552s);
        return laf1VarM58552s;
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m58551r(laf1 laf1Var, boolean z) {
        byte bByteValue = ((Byte) laf1Var.mo25248u(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = qbf1.f187085b.m72493a(laf1Var.getClass()).zzl(laf1Var);
        if (z) {
            laf1Var.mo25248u(2);
        }
        return zZzl;
    }

    /* JADX INFO: renamed from: s */
    public static laf1 m58552s(laf1 laf1Var, byte[] bArr, int i, haf1 haf1Var) throws zzagk {
        if (i == 0) {
            return laf1Var;
        }
        laf1 laf1VarM58555h = laf1Var.m58555h();
        try {
            vbf1 vbf1VarM72493a = qbf1.f187085b.m72493a(laf1VarM58555h.getClass());
            n9f1 n9f1Var = new n9f1();
            haf1Var.getClass();
            vbf1VarM72493a.mo61385d(laf1VarM58555h, bArr, 0, i, n9f1Var);
            vbf1VarM72493a.mo61382a(laf1VarM58555h);
            return laf1VarM58555h;
        } catch (zzagk e) {
            if (e.f2333a) {
                throw new zzagk(e.getMessage(), e);
            }
            throw e;
        } catch (zzahy e2) {
            throw new zzagk(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzagk) {
                throw ((zzagk) e3.getCause());
            }
            throw new zzagk(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzagk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m58553t(laf1 laf1Var) throws zzagk {
        if (laf1Var != null && !m58551r(laf1Var, true)) {
            throw new zzagk(new zzahy().getMessage());
        }
    }

    @Override // p204p.k9f1
    /* JADX INFO: renamed from: a */
    public final void mo55797a(w780 w780Var) {
        vbf1 vbf1VarM72493a = qbf1.f187085b.m72493a(getClass());
        vaa1 vaa1Var = (vaa1) w780Var.f248600d;
        if (vaa1Var == null) {
            vaa1Var = new vaa1(w780Var);
        }
        vbf1VarM72493a.mo61388g(this, vaa1Var);
    }

    @Override // p204p.k9f1
    /* JADX INFO: renamed from: b */
    public final int mo55798b() {
        if (m58559v()) {
            int iMo61384c = qbf1.f187085b.m72493a(getClass()).mo61384c(this);
            if (iMo61384c >= 0) {
                return iMo61384c;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iMo61384c).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iMo61384c);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zza & Alert.DURATION_SHOW_INDEFINITELY;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo61384c2 = qbf1.f187085b.m72493a(getClass()).mo61384c(this);
        if (iMo61384c2 >= 0) {
            this.zza = (this.zza & Integer.MIN_VALUE) | iMo61384c2;
            return iMo61384c2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iMo61384c2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iMo61384c2);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // p204p.k9f1
    /* JADX INFO: renamed from: e */
    public final int mo55801e(vbf1 vbf1Var) {
        if (m58559v()) {
            int iMo61384c = vbf1Var.mo61384c(this);
            if (iMo61384c >= 0) {
                return iMo61384c;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iMo61384c).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iMo61384c);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zza & Alert.DURATION_SHOW_INDEFINITELY;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo61384c2 = vbf1Var.mo61384c(this);
        if (iMo61384c2 >= 0) {
            this.zza = (this.zza & Integer.MIN_VALUE) | iMo61384c2;
            return iMo61384c2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iMo61384c2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iMo61384c2);
        throw new IllegalStateException(sb2.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return qbf1.f187085b.m72493a(getClass()).mo61387f(this, (laf1) obj);
    }

    /* JADX INFO: renamed from: g */
    public final void m58554g() {
        this.zza &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    /* JADX INFO: renamed from: h */
    public final laf1 m58555h() {
        return (laf1) mo25248u(4);
    }

    public final int hashCode() {
        if (m58559v()) {
            return qbf1.f187085b.m72493a(getClass()).mo61386e(this);
        }
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int iMo61386e = qbf1.f187085b.m72493a(getClass()).mo61386e(this);
        this.zzb = iMo61386e;
        return iMo61386e;
    }

    /* JADX INFO: renamed from: i */
    public final jaf1 m58556i() {
        return (jaf1) mo25248u(5);
    }

    /* JADX INFO: renamed from: j */
    public final jaf1 m58557j() {
        jaf1 jaf1Var = (jaf1) mo25248u(5);
        jaf1Var.m52815h(this);
        return jaf1Var;
    }

    /* JADX INFO: renamed from: k */
    public final void m58558k() {
        this.zza = (this.zza & Integer.MIN_VALUE) | Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = fbf1.f67821a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        fbf1.m41231b(this, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public abstract Object mo25248u(int i);

    /* JADX INFO: renamed from: v */
    public final boolean m58559v() {
        return (this.zza & Integer.MIN_VALUE) != 0;
    }
}
