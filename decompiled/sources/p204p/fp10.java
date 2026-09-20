package p204p;

import android.accounts.Account;
import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class fp10 implements lhx0 {

    /* JADX INFO: renamed from: a */
    public Object f71683a;

    /* JADX INFO: renamed from: b */
    public boolean f71684b;

    /* JADX INFO: renamed from: c */
    public boolean f71685c;

    /* JADX INFO: renamed from: d */
    public boolean f71686d;

    /* JADX INFO: renamed from: e */
    public final Object f71687e;

    /* JADX INFO: renamed from: f */
    public Object f71688f;

    /* JADX INFO: renamed from: g */
    public Object f71689g;

    /* JADX INFO: renamed from: h */
    public Object f71690h;

    /* JADX INFO: renamed from: i */
    public Object f71691i;

    public fp10() {
        this.f71687e = new HashSet();
        this.f71691i = new HashMap();
    }

    @Override // p204p.lhx0
    /* JADX INFO: renamed from: a */
    public Object mo42314a(String str, zmy zmyVar, nxs0 nxs0Var) {
        String str2;
        synchronized (this.f71688f) {
            try {
                str2 = "image_loading-" + dix0.m36137a(str);
                Integer num = (Integer) ((LinkedHashMap) this.f71689g).get(str2);
                int iIntValue = (num != null ? num.intValue() : 0) + 1;
                ((LinkedHashMap) this.f71689g).put(str2, Integer.valueOf(iIntValue));
                if (iIntValue != 1) {
                    str2 = str2 + "-" + iIntValue;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m42318e(str2, zmyVar, nxs0Var);
    }

    /* JADX INFO: renamed from: b */
    public GoogleSignInOptions m42315b() {
        HashSet hashSet = (HashSet) this.f71687e;
        if (hashSet.contains(GoogleSignInOptions.f1734M0)) {
            Scope scope = GoogleSignInOptions.f1733L0;
            if (hashSet.contains(scope)) {
                hashSet.remove(scope);
            }
        }
        if (this.f71686d && (((Account) this.f71690h) == null || !hashSet.isEmpty())) {
            hashSet.add(GoogleSignInOptions.f1738Z);
        }
        return new GoogleSignInOptions(3, new ArrayList(hashSet), (Account) this.f71690h, this.f71686d, this.f71684b, this.f71685c, (String) this.f71683a, (String) this.f71688f, (HashMap) this.f71691i, (String) this.f71689g);
    }

    /* JADX INFO: renamed from: c */
    public void m42316c(String str) {
        Object c6x0Var;
        try {
            sr4 sr4Var = (sr4) this.f71691i;
            if (sr4Var != null) {
                sr4Var.m79016f(str);
                c6x0Var = w2a1.f247311a;
            } else {
                c6x0Var = null;
            }
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            Logger.m3967c(thM77348a, "Failed to end Rive performance point", new Object[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #5 {, blocks: (B:49:0x0091, B:51:0x009b), top: B:88:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8 A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #4 {, blocks: (B:65:0x00ae, B:67:0x00b8), top: B:86:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public Object m42317d(String str, gh00 gh00Var, ibk ibkVar) throws Throwable {
        bix0 bix0Var;
        boolean zBooleanValue;
        sr4 sr4Var;
        Object c6x0Var;
        String str2;
        boolean z;
        if (ibkVar instanceof bix0) {
            bix0Var = (bix0) ibkVar;
            int i = bix0Var.f27563e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bix0Var.f27563e = i - Integer.MIN_VALUE;
            } else {
                bix0Var = new bix0(this, ibkVar);
            }
        } else {
            bix0Var = new bix0(this, ibkVar);
        }
        Object objInvoke = bix0Var.f27561c;
        Object obj = yuk.f276404a;
        int i2 = bix0Var.f27563e;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = bix0Var.f27560b;
            str2 = bix0Var.f27559a;
            try {
                bga.m29073P(objInvoke);
                if (z) {
                    synchronized (this.f71688f) {
                        if (((LinkedHashSet) this.f71690h).remove(str2)) {
                            m42316c(str2);
                        }
                    }
                }
                return objInvoke;
            } catch (Throwable th) {
                th = th;
                if (z) {
                    synchronized (this.f71688f) {
                        if (((LinkedHashSet) this.f71690h).remove(str2)) {
                            m42316c(str2);
                        }
                    }
                }
                throw th;
            }
        }
        bga.m29073P(objInvoke);
        synchronized (this.f71688f) {
            try {
                zBooleanValue = false;
                if (!this.f71686d && (sr4Var = (sr4) this.f71691i) != null) {
                    try {
                        sr4Var.m79019k(str, null, (4 & 4) != 0);
                        ((LinkedHashSet) this.f71690h).add(str);
                        c6x0Var = Boolean.TRUE;
                    } catch (Throwable th2) {
                        c6x0Var = new c6x0(th2);
                    }
                    Throwable thM77348a = s6x0.m77348a(c6x0Var);
                    if (thM77348a != null) {
                        Logger.m3967c(thM77348a, "Failed to start Rive performance point", new Object[0]);
                    }
                    Boolean bool = Boolean.FALSE;
                    if (c6x0Var instanceof c6x0) {
                        c6x0Var = bool;
                    }
                    zBooleanValue = ((Boolean) c6x0Var).booleanValue();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        try {
            bix0Var.f27559a = str;
            bix0Var.f27560b = zBooleanValue;
            bix0Var.f27563e = 1;
            objInvoke = gh00Var.invoke(bix0Var);
            if (objInvoke == obj) {
                return obj;
            }
            str2 = str;
            z = zBooleanValue;
            if (z) {
                synchronized (this.f71688f) {
                    if (((LinkedHashSet) this.f71690h).remove(str2)) {
                        m42316c(str2);
                    }
                }
            }
            return objInvoke;
        } catch (Throwable th4) {
            th = th4;
            str2 = str;
            z = zBooleanValue;
            if (z) {
                synchronized (this.f71688f) {
                    if (((LinkedHashSet) this.f71690h).remove(str2)) {
                        m42316c(str2);
                    }
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public Object m42318e(String str, zmy zmyVar, ibk ibkVar) throws Exception {
        cix0 cix0Var;
        if (ibkVar instanceof cix0) {
            cix0Var = (cix0) ibkVar;
            int i = cix0Var.f38445c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cix0Var.f38445c = i - Integer.MIN_VALUE;
            } else {
                cix0Var = new cix0(this, ibkVar);
            }
        } else {
            cix0Var = new cix0(this, ibkVar);
        }
        Object obj = cix0Var.f38443a;
        Object obj2 = yuk.f276404a;
        int i2 = cix0Var.f38445c;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return obj;
            }
            bga.m29073P(obj);
            cix0Var.f38445c = 1;
            Object objM42317d = m42317d(str, zmyVar, cix0Var);
            return objM42317d == obj2 ? obj2 : objM42317d;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            synchronized (this.f71688f) {
                if (!this.f71686d) {
                    this.f71684b = true;
                }
                throw e2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m42319f() {
        ((HashSet) this.f71687e).add(GoogleSignInOptions.f1737Y);
    }

    /* JADX INFO: renamed from: g */
    public void m42320g() {
        boolean z = true;
        this.f71684b = true;
        ig31.m50502t("1046568431490-ij1gi5shcp2gtorls09frkc56d4mjbe2.apps.googleusercontent.com");
        String str = (String) this.f71683a;
        if (str != null && !str.equals("1046568431490-ij1gi5shcp2gtorls09frkc56d4mjbe2.apps.googleusercontent.com")) {
            z = false;
        }
        ig31.m50497o("two different server client ids provided", z);
        this.f71683a = "1046568431490-ij1gi5shcp2gtorls09frkc56d4mjbe2.apps.googleusercontent.com";
        this.f71685c = false;
    }

    public fp10(GoogleSignInOptions googleSignInOptions) {
        this.f71687e = new HashSet();
        this.f71691i = new HashMap();
        ig31.m50506x(googleSignInOptions);
        this.f71687e = new HashSet(googleSignInOptions.f1740b);
        this.f71684b = googleSignInOptions.f1743e;
        this.f71685c = googleSignInOptions.f1744f;
        this.f71686d = googleSignInOptions.f1742d;
        this.f71683a = googleSignInOptions.f1745g;
        this.f71690h = googleSignInOptions.f1741c;
        this.f71688f = googleSignInOptions.f1746h;
        this.f71691i = GoogleSignInOptions.m1477M(googleSignInOptions.f1747i);
        this.f71689g = googleSignInOptions.f1748t;
    }

    public fp10(am71 am71Var, String str) {
        Object c6x0Var;
        this.f71687e = am71Var;
        this.f71688f = new Object();
        this.f71689g = new LinkedHashMap();
        this.f71690h = new LinkedHashSet();
        try {
            sr4 sr4VarM76275a = ((rr4) am71Var).m76275a("prepare_rive_video_preview");
            sr4VarM76275a.m79019k("preview_preparation", null, (4 & 4) != 0);
            c6x0Var = sr4VarM76275a;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            Logger.m3967c(thM77348a, "Failed to start Rive performance measurement", new Object[0]);
        }
        this.f71691i = (sr4) (c6x0Var instanceof c6x0 ? null : c6x0Var);
        this.f71683a = str != null ? dix0.m36138b(str) : null;
    }

    public fp10(peb pebVar) {
        boolean z;
        this.f71684b = false;
        this.f71685c = false;
        this.f71686d = false;
        this.f71687e = pebVar;
        int[] iArr = (int[]) pebVar.m69715a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null) {
            z = false;
            break;
        }
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else {
                if (iArr[i] == 4) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.f71685c = z;
        this.f71686d = rbr.f197650a.m76583e(ZslDisablerQuirk.class) != null;
        this.f71683a = new g7d1(new pxd1());
    }
}
