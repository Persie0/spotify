package p204p;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class v2l {

    /* JADX INFO: renamed from: s */
    public static final q2l f236677s = new q2l(1);

    /* JADX INFO: renamed from: a */
    public final Context f236678a;

    /* JADX INFO: renamed from: b */
    public final mc7 f236679b;

    /* JADX INFO: renamed from: c */
    public final t7j f236680c;

    /* JADX INFO: renamed from: d */
    public final clq0 f236681d;

    /* JADX INFO: renamed from: e */
    public final rb5 f236682e;

    /* JADX INFO: renamed from: f */
    public final vz30 f236683f;

    /* JADX INFO: renamed from: g */
    public final twy f236684g;

    /* JADX INFO: renamed from: h */
    public final s85 f236685h;

    /* JADX INFO: renamed from: i */
    public final n95 f236686i;

    /* JADX INFO: renamed from: j */
    public final e3l f236687j;

    /* JADX INFO: renamed from: k */
    public final lp3 f236688k;

    /* JADX INFO: renamed from: l */
    public final s2l f236689l;

    /* JADX INFO: renamed from: m */
    public final q201 f236690m;

    /* JADX INFO: renamed from: n */
    public p4l f236691n;

    /* JADX INFO: renamed from: o */
    public final ev61 f236692o = new ev61();

    /* JADX INFO: renamed from: p */
    public final ev61 f236693p = new ev61();

    /* JADX INFO: renamed from: q */
    public final ev61 f236694q = new ev61();

    /* JADX INFO: renamed from: r */
    public final AtomicBoolean f236695r = new AtomicBoolean(false);

    public v2l(Context context, vz30 vz30Var, mc7 mc7Var, twy twyVar, t7j t7jVar, s85 s85Var, clq0 clq0Var, n95 n95Var, q201 q201Var, e3l e3lVar, lp3 lp3Var, s2l s2lVar, rb5 rb5Var) {
        this.f236678a = context;
        this.f236683f = vz30Var;
        this.f236679b = mc7Var;
        this.f236684g = twyVar;
        this.f236680c = t7jVar;
        this.f236685h = s85Var;
        this.f236681d = clq0Var;
        this.f236686i = n95Var;
        this.f236687j = e3lVar;
        this.f236688k = lp3Var;
        this.f236689l = s2lVar;
        this.f236690m = q201Var;
        this.f236682e = rb5Var;
    }

    /* JADX INFO: renamed from: a */
    public static y7h1 m84513a(v2l v2lVar) {
        y7h1 y7h1VarM29089k;
        v2lVar.getClass();
        haz hazVar = haz.f89320X;
        ArrayList arrayList = new ArrayList();
        for (File file : v2lVar.f236684g.m81787J()) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    hazVar.m46953t();
                    y7h1VarM29089k = bga.m29102x(null);
                } catch (ClassNotFoundException unused) {
                    hazVar.m46947g();
                    y7h1VarM29089k = bga.m29089k(new ScheduledThreadPoolExecutor(1), new u2l(v2lVar, j));
                }
                arrayList.add(y7h1VarM29089k);
            } catch (NumberFormatException unused2) {
                file.getName();
                hazVar.m46953t();
            }
            file.delete();
        }
        return bga.m29075R(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0033 A[LOOP:0: B:12:0x002b->B:14:0x0033, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:17:0x0037 A[SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static String m84514g() throws IOException {
        InputStream resourceAsStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i;
        haz hazVar = haz.f89320X;
        ClassLoader classLoader = v2l.class.getClassLoader();
        if (classLoader == null) {
            hazVar.m46953t();
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
            if (resourceAsStream == null) {
                hazVar.m46950n();
            }
            if (resourceAsStream == null) {
                return null;
            }
            hazVar.m46947g();
            byteArrayOutputStream = new ByteArrayOutputStream();
            bArr = new byte[1024];
            while (true) {
                i = resourceAsStream.read(bArr);
                if (i != -1) {
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        }
        resourceAsStream = null;
        if (resourceAsStream == null) {
            return null;
        }
        hazVar.m46947g();
        byteArrayOutputStream = new ByteArrayOutputStream();
        bArr = new byte[1024];
        while (true) {
            i = resourceAsStream.read(bArr);
            if (i != -1) {
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [byte[], java.io.Serializable] */
    /* JADX INFO: renamed from: b */
    public final void m84515b(boolean z, rvw0 rvw0Var, boolean z2) {
        String str;
        gwy dqt0Var = n95.f151707X;
        haz hazVar = haz.f89320X;
        rb5.m75143s();
        q201 q201Var = this.f236690m;
        ArrayList arrayList = new ArrayList(q201Var.m71974h());
        if (arrayList.size() <= z) {
            hazVar.m46951r();
            return;
        }
        String str2 = (String) arrayList.get(z ? 1 : 0);
        twy twyVar = this.f236684g;
        if (z2 && rvw0Var.m76497k().f269583b.f235432b && Build.VERSION.SDK_INT >= 30) {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f236678a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                n95 n95Var = new n95(twyVar);
                so3 so3Var = n95.f151707X;
                so3Var.mo36682a();
                n95Var.f151718b = so3Var;
                if (str2 != null) {
                    n95Var.f151718b = new dqt0(twyVar.m81795R(str2, "userlog"));
                }
                q201Var.m71977k(str2, historicalProcessExitReasons, n95Var, clq0.m33302w(str2, twyVar, this.f236682e));
            } else {
                hazVar.m46951r();
            }
        } else {
            hazVar.m46951r();
        }
        if (z2) {
            e3l e3lVar = this.f236687j;
            if (e3lVar.mo37650d(str2)) {
                hazVar.m46951r();
                gxi0 gxi0VarMo37647a = e3lVar.mo37647a(str2);
                File fileMo46109d = gxi0VarMo37647a.mo46109d();
                i3l i3lVarMo46108c = gxi0VarMo37647a.mo46108c();
                if (fileMo46109d == null || !fileMo46109d.exists()) {
                    hazVar.m46953t();
                }
                if (i3lVarMo46108c == null) {
                    hazVar.m46950n();
                }
                if ((fileMo46109d == null || !fileMo46109d.exists()) && i3lVarMo46108c == null) {
                    hazVar.m46953t();
                } else {
                    long jLastModified = fileMo46109d.lastModified();
                    if (str2 != null) {
                        dqt0Var = new dqt0(twyVar.m81795R(str2, "userlog"));
                    }
                    File fileM81792O = twyVar.m81792O(str2);
                    if (fileM81792O.isDirectory()) {
                        m84517d(jLastModified);
                        ?? Mo36685d = dqt0Var.mo36685d();
                        File fileM81795R = twyVar.m81795R(str2, "user-data");
                        File fileM81795R2 = twyVar.m81795R(str2, "keys");
                        File fileM81795R3 = twyVar.m81795R(str2, "rollouts-state");
                        ArrayList arrayList2 = new ArrayList();
                        gwy gwyVar = dqt0Var;
                        arrayList2.add(new kva("logs_file", "logs", Mo36685d, 0));
                        arrayList2.add(new kva("crash_meta_file", "metadata", gxi0VarMo37647a.mo46110f(), 1));
                        arrayList2.add(new kva("session_meta_file", "session", gxi0VarMo37647a.mo46113l(), 1));
                        arrayList2.add(new kva("app_meta_file", "app", gxi0VarMo37647a.mo46111g(), 1));
                        arrayList2.add(new kva("device_meta_file", "device", gxi0VarMo37647a.mo46107b(), 1));
                        arrayList2.add(new kva("os_meta_file", "os", gxi0VarMo37647a.mo46112h(), 1));
                        File fileMo46109d2 = gxi0VarMo37647a.mo46109d();
                        arrayList2.add((fileMo46109d2 == null || !fileMo46109d2.exists()) ? new kva("minidump_file", "minidump", new byte[]{0}, 0) : new kva("minidump_file", "minidump", fileMo46109d2, 1));
                        arrayList2.add(new kva("user_meta_file", "user", fileM81795R, 1));
                        arrayList2.add(new kva("keys_file", "keys", fileM81795R2, 1));
                        arrayList2.add(new kva("rollouts_file", "rollouts", fileM81795R3, 1));
                        ddg1.m35743n(fileM81792O, arrayList2);
                        hazVar.m46947g();
                        q201Var.m71971d(str2, arrayList2, i3lVarMo46108c);
                        gwyVar.mo36686e();
                    } else {
                        hazVar.m46953t();
                    }
                }
            }
        }
        if (z != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f236689l.m77050b(null);
            str = null;
        }
        q201Var.m71972e(System.currentTimeMillis() / 1000, str);
    }

    /* JADX INFO: renamed from: c */
    public final void m84516c(String str, Boolean bool) {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        haz hazVar = haz.f89320X;
        hazVar.m46947g();
        Locale locale = Locale.US;
        vz30 vz30Var = this.f236683f;
        String str2 = vz30Var.f246370c;
        s85 s85Var = this.f236685h;
        g28 g28Var = new g28(str2, s85Var.f206553f, s85Var.f206554g, vz30Var.m86870c().f44183a, nap.m64009b(nap.m64008a(s85Var.f206551d)), s85Var.f206555h);
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.VERSION.CODENAME;
        i28 i28Var = new i28(upf.m83662F());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        spf spfVar = spf.f212836a;
        String str5 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str5)) {
            hazVar.m46951r();
        } else {
            spf spfVar2 = (spf) spf.f212837b.get(str5.toLowerCase(locale));
            if (spfVar2 != null) {
                spfVar = spfVar2;
            }
        }
        int iOrdinal = spfVar.ordinal();
        String str6 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jM83697n = upf.m83697n(this.f236678a);
        boolean zM83661E = upf.m83661E();
        int iM83708y = upf.m83708y();
        String str7 = Build.MANUFACTURER;
        String str8 = Build.PRODUCT;
        this.f236687j.mo37649c(str, jCurrentTimeMillis, new f28(g28Var, i28Var, new h28(iOrdinal, iAvailableProcessors, jM83697n, blockCount, zM83661E, iM83708y)));
        if (bool.booleanValue() && str != null) {
            this.f236681d.m33309G(str);
        }
        n95 n95Var = this.f236686i;
        ((gwy) n95Var.f151718b).mo36682a();
        n95Var.f151718b = n95.f151707X;
        if (str != null) {
            n95Var.f151718b = new dqt0(((twy) n95Var.f151717a).m81795R(str, "userlog"));
        }
        this.f236689l.m77050b(str);
        this.f236690m.m71975i(jCurrentTimeMillis, str);
    }

    /* JADX INFO: renamed from: d */
    public final void m84517d(long j) {
        try {
            if (this.f236684g.m81786I(".ae" + j).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException unused) {
            haz.f89320X.m46952s();
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m84518e(rvw0 rvw0Var) {
        haz hazVar = haz.f89320X;
        rb5.m75143s();
        p4l p4lVar = this.f236691n;
        if (p4lVar != null && p4lVar.f173974e.get()) {
            hazVar.m46953t();
            return false;
        }
        hazVar.m46951r();
        try {
            m84515b(true, rvw0Var, true);
            hazVar.m46951r();
            return true;
        } catch (Exception unused) {
            hazVar.m46948k();
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final String m84519f() {
        NavigableSet navigableSetM71974h = this.f236690m.m71974h();
        if (navigableSetM71974h.isEmpty()) {
            return null;
        }
        return (String) navigableSetM71974h.first();
    }

    /* JADX INFO: renamed from: h */
    public final void m84520h() {
        haz hazVar = haz.f89320X;
        try {
            String strM84514g = m84514g();
            if (strM84514g != null) {
                try {
                    this.f236681d.m33308F(strM84514g);
                } catch (IllegalArgumentException e) {
                    Context context = this.f236678a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e;
                        }
                    }
                    hazVar.m46949m();
                }
                hazVar.m46950n();
            }
        } catch (IOException unused) {
            hazVar.m46952s();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m84521i(y7h1 y7h1Var) {
        y7h1 y7h1VarM72081L;
        haz hazVar = haz.f89320X;
        boolean zM71973g = this.f236690m.m71973g();
        ev61 ev61Var = this.f236692o;
        if (!zM71973g) {
            hazVar.m46951r();
            ev61Var.m40099d(Boolean.FALSE);
            return;
        }
        hazVar.m46951r();
        mc7 mc7Var = this.f236679b;
        if (mc7Var.m61451o()) {
            hazVar.m46947g();
            ev61Var.m40099d(Boolean.FALSE);
            y7h1VarM72081L = bga.m29102x(Boolean.TRUE);
        } else {
            hazVar.m46947g();
            hazVar.m46951r();
            ev61Var.m40099d(Boolean.TRUE);
            y7h1 y7h1VarM61456t = mc7Var.m61456t();
            og6 og6Var = new og6(4);
            y7h1VarM61456t.getClass();
            co50 co50Var = gv61.f84648a;
            y7h1 y7h1Var2 = new y7h1();
            y7h1VarM61456t.f270086b.m82451b(new d8g1(co50Var, og6Var, y7h1Var2));
            y7h1VarM61456t.m92999t();
            hazVar.m46947g();
            y7h1VarM72081L = q3d0.m72081L(y7h1Var2, this.f236693p.f63172a);
        }
        y7h1VarM72081L.mo1519k((q4l) this.f236682e.f197471b, new ujh(this, y7h1Var));
    }
}
