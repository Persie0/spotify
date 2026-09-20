package p204p;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.database.DatabaseIOException;
import com.facebook.FacebookException;
import io.reactivex.rxjava3.functions.Function;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class n95 implements tg11, rdc1, w5x, zpk, Function, a9b, d7y0 {

    /* JADX INFO: renamed from: c */
    public static ScheduledThreadPoolExecutor f151709c;

    /* JADX INFO: renamed from: e */
    public static volatile String f151711e;

    /* JADX INFO: renamed from: f */
    public static boolean f151712f;

    /* JADX INFO: renamed from: a */
    public Object f151717a;

    /* JADX INFO: renamed from: b */
    public Object f151718b;

    /* JADX INFO: renamed from: d */
    public static final Object f151710d = new Object();

    /* JADX INFO: renamed from: g */
    public static final C2162nf f151713g = new C2162nf(18);

    /* JADX INFO: renamed from: h */
    public static final long[] f151714h = {604800000, 1209600000};

    /* JADX INFO: renamed from: i */
    public static final String[] f151715i = {"name", "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: t */
    public static final tzv f151716t = new tzv();

    /* JADX INFO: renamed from: X */
    public static final so3 f151707X = new so3(16);

    /* JADX INFO: renamed from: Y */
    public static final zy5 f151708Y = new zy5(29);

    public /* synthetic */ n95(Object obj) {
        this.f151718b = obj;
    }

    /* JADX INFO: renamed from: G */
    public static int m63883G(pw5 pw5Var) {
        switch (pw5Var.ordinal()) {
            case 1:
                return 7;
            case 2:
                return 5;
            case 3:
                return 2;
            case 4:
                return 6;
            case 5:
                return 10;
            case 6:
                return 1;
            case 7:
                return 8;
            case 8:
                return 4;
            default:
                return 9;
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m63884I(File file, byte[] bArr) throws Exception {
        File fileCreateTempFile = File.createTempFile(s571.m77250i(file.getName(), "."), ".tmp", file.getParentFile());
        try {
            wj50.m88279p(fileCreateTempFile);
            pxy.m71566Z(fileCreateTempFile, bArr);
            if (fileCreateTempFile.renameTo(file)) {
                return;
            }
            throw new IOException("Failed to move " + fileCreateTempFile.getName() + " to " + file.getName());
        } catch (Exception e) {
            fileCreateTempFile.delete();
            throw e;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final z9a1 m63885c(n95 n95Var, Bundle bundle) {
        String string = bundle != null ? bundle.getString("qualityName") : null;
        if (string == null) {
            string = "";
        }
        String string2 = bundle != null ? bundle.getString("currentSize") : null;
        if (string2 == null) {
            string2 = "";
        }
        String string3 = bundle != null ? bundle.getString("estimatedSize") : null;
        return new z9a1(string, string2, string3 != null ? string3 : "");
    }

    /* JADX INFO: renamed from: e */
    public static final String m63886e() {
        if (p2l.f173365a.contains(n95.class)) {
            return null;
        }
        try {
            return f151711e;
        } catch (Throwable th) {
            p2l.m68953a(n95.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final ScheduledThreadPoolExecutor m63887h() {
        if (p2l.f173365a.contains(n95.class)) {
            return null;
        }
        try {
            return f151709c;
        } catch (Throwable th) {
            p2l.m68953a(n95.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final Object m63888i() {
        if (p2l.f173365a.contains(n95.class)) {
            return null;
        }
        try {
            return f151710d;
        } catch (Throwable th) {
            p2l.m68953a(n95.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static n95 m63889j(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new n95(channel, fileLockLock);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused4) {
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused5) {
            channel = null;
            fileLockLock = null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static n95 m63890p() {
        wia wiaVarM88198i = wia.m88198i();
        if (wiaVarM88198i == null) {
            return null;
        }
        return wiaVarM88198i.f251587c;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m63891s(String str) {
        return TextUtils.isEmpty(str) || str.equals("bnc_no_value");
    }

    /* JADX INFO: renamed from: v */
    public static void m63892v(n95 n95Var, String str, Double d, Bundle bundle, boolean z, UUID uuid) {
        if (p2l.f173365a.contains(n95.class)) {
            return;
        }
        try {
            n95Var.m63908u(str, d, bundle, z, uuid, null);
        } catch (Throwable th) {
            p2l.m68953a(n95.class, th);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m63893A() {
        try {
            ((FileLock) this.f151718b).release();
            ((FileChannel) this.f151717a).close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: B */
    public void m63894B(Set set) throws DatabaseIOException {
        ((String) this.f151717a).getClass();
        try {
            SQLiteDatabase writableDatabase = ((elo) this.f151718b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.f151717a, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m63895C(long j, String str, long j2) throws DatabaseIOException {
        ((String) this.f151717a).getClass();
        try {
            SQLiteDatabase writableDatabase = ((elo) this.f151718b).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.f151717a, null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m63896D(String str, List list) throws Exception {
        m63899H(str).mkdirs();
        m63884I(new File(m63899H(str), ".cue-manifest"), g6f.m43753y0(list, "\n", null, null, null, 62).getBytes(vuc.f244913a));
    }

    /* JADX INFO: renamed from: E */
    public void m63897E(JSONObject jSONObject) throws Throwable {
        tvz0 tvz0Var = tvz0.f224283e;
        syg1.m79703v("setPostUserAgent " + Thread.currentThread().getName());
        try {
            if (TextUtils.isEmpty(wia.f251576p)) {
                Context context = (Context) this.f151718b;
                t6r t6rVar = new t6r(jSONObject);
                lsi0 lsi0Var = wbr.f249840a;
                x0h1.m89557A(xsr.f265651a, new h5q(context, null), t6rVar);
                return;
            }
            syg1.m79703v("userAgent was cached: " + wia.f251576p);
            okq okqVar = okq.RandomizedBundleToken;
            jSONObject.put("user_agent", wia.f251576p);
            wia.m88198i().f251590f.m94769p(tvz0Var);
            wia.m88198i().f251590f.m94766m("setPostUserAgent");
        } catch (Exception e) {
            syg1.m79704w("Caught exception trying to set userAgent " + e.getMessage());
            wia.m88198i().f251590f.m94769p(tvz0Var);
            wia.m88198i().f251590f.m94766m("getUserAgentAsync");
        }
    }

    /* JADX INFO: renamed from: F */
    public void m63898F(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.f151718b;
        cardView.f489d.set(i, i2, i3, i4);
        Rect rect = cardView.f488c;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    /* JADX INFO: renamed from: H */
    public File m63899H(String str) {
        return new File((File) this.f151717a, wl51.m88489m1(16, u6j0.m82448m(str.getBytes(vuc.f244913a))));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [p.gh00, p.qe70] */
    @Override // p204p.d7y0
    /* JADX INFO: renamed from: Q */
    public Bundle mo27874Q(Object obj) {
        return (Bundle) ((qe70) this.f151717a).invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [p.qe70, p.th00] */
    @Override // p204p.d7y0
    /* JADX INFO: renamed from: W */
    public Object mo27875W(Bundle bundle, Object obj) {
        return ((qe70) this.f151718b).invoke(bundle, obj);
    }

    @Override // p204p.a9b
    /* JADX INFO: renamed from: a */
    public Type mo25103a() {
        return (Type) this.f151717a;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return Boolean.valueOf(abk.m25354a((abk) this.f151717a, (nbm) obj, (Uri) this.f151718b));
    }

    @Override // p204p.tg11
    /* JADX INFO: renamed from: d */
    public boolean mo30747d(String str) {
        return ((eja) this.f151717a).mo30747d(str) || ((bx3) this.f151718b).mo30747d(str);
    }

    @Override // p204p.w5x
    /* JADX INFO: renamed from: f */
    public x5x mo49779f(zuu0 zuu0Var) {
        x5x x5xVarMo49779f = ((w5x) this.f151717a).mo49779f(zuu0Var);
        x5x x5xVarMo49779f2 = ((w5x) this.f151718b).mo49779f(zuu0Var);
        x5xVarMo49779f.getClass();
        u5x u5xVar = x5x.f258535a;
        if (x5xVarMo49779f == u5xVar) {
            return x5xVarMo49779f2;
        }
        x5x[] x5xVarArrM80135H = x5xVarMo49779f instanceof t5x ? ((t5x) x5xVarMo49779f).m80135H() : new x5x[]{x5xVarMo49779f};
        if (x5xVarMo49779f2 == u5xVar) {
            return x5xVarMo49779f;
        }
        return new t5x((x5x[]) bk5.m29599V0(x5xVarArrM80135H, x5xVarMo49779f2 instanceof t5x ? ((t5x) x5xVarMo49779f2).m80135H() : new x5x[]{x5xVarMo49779f2}));
    }

    @Override // p204p.a9b
    /* JADX INFO: renamed from: g */
    public Object mo25104g(x4l0 x4l0Var) {
        Executor executor = (Executor) this.f151718b;
        return executor == null ? x4l0Var : new j1p(executor, x4l0Var);
    }

    @Override // p204p.rdc1
    public View getRoot() {
        return (ConstraintLayout) this.f151717a;
    }

    /* JADX INFO: renamed from: k */
    public File m63900k(String str, String str2) {
        return new File(m63899H(str), s571.m77250i(str2, ".mp3"));
    }

    /* JADX INFO: renamed from: l */
    public xul0 m63901l(String str) {
        return str != null ? m63911y(str) : C2244p5.f174033a;
    }

    /* JADX INFO: renamed from: m */
    public Enum m63902m(String str) {
        HashMap map = (HashMap) this.f151718b;
        str.getClass();
        return (Enum) map.get(str.toUpperCase(Locale.US));
    }

    /* JADX INFO: renamed from: n */
    public Object m63903n(Class cls) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f151718b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = ((gh00) this.f151717a).invoke(cls);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }

    /* JADX INFO: renamed from: o */
    public HashMap m63904o() throws DatabaseIOException {
        try {
            ((String) this.f151717a).getClass();
            Cursor cursorQuery = ((elo) this.f151718b).getReadableDatabase().query((String) this.f151717a, f151715i, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new t3b(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    /* JADX INFO: renamed from: q */
    public xmj m63905q() {
        return (xmj) this.f151718b;
    }

    /* JADX INFO: renamed from: r */
    public void m63906r(long j) throws DatabaseIOException {
        elo eloVar = (elo) this.f151718b;
        try {
            String hexString = Long.toHexString(j);
            this.f151717a = "ExoPlayerCacheFileMetadata" + hexString;
            if (kfb1.m56260a(eloVar.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = eloVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    kfb1.m56261b(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.f151717a));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.f151717a) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m63907t(String str, Bundle bundle) {
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            try {
                m63892v(this, str, null, bundle, false, mf0.m61600b());
            } catch (Throwable th) {
                th = th;
                p2l.m68953a(this, th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX INFO: renamed from: u */
    public void m63908u(String str, Double d, Bundle bundle, boolean z, UUID uuid, drl0 drl0Var) {
        drl0 drl0Var2;
        Bundle bundle2;
        Set set = p2l.f173365a;
        if (set.contains(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            boolean zContains = false;
            if (z || !m68.m60950c() || (!str.equals("fb_mobile_purchase") && !str.equals("Subscribe") && !str.equals("StartTrial"))) {
                drl0Var2 = drl0Var;
                bundle2 = bundle;
            } else if ((hgy.m47481b(fgy.AndroidManualImplicitPurchaseDedupe) && str.equals("fb_mobile_purchase")) || (hgy.m47481b(fgy.AndroidManualImplicitSubsDedupe) && (str.equals("Subscribe") || str.equals("StartTrial")))) {
                Double dM39266f = ek40.m39266f(d, bundle);
                Currency currencyM39262b = ek40.m39262b(bundle);
                if (dM39266f == null || currencyM39262b == null) {
                    drl0Var2 = drl0Var;
                    bundle2 = bundle;
                } else {
                    pqm0 pqm0VarM39261a = ek40.m39261a(hk40.m47738c(geg1.m44518y(new sj40(str, dM39266f.doubleValue(), currencyM39262b)), System.currentTimeMillis(), false, geg1.m44518y(new pqm0(bundle, drl0Var))), bundle, drl0Var);
                    bundle2 = (Bundle) pqm0VarM39261a.f180350a;
                    drl0Var2 = (drl0) pqm0VarM39261a.f180351b;
                }
            } else {
                drl0Var2 = drl0Var;
                bundle2 = bundle;
            }
            boolean zM54319b = jty.m54319b("app_events_killswitch", p8y.m69344b(), false);
            hsa0 hsa0Var = hsa0.f94648c;
            if (zM54319b) {
                iq3 iq3Var = tra0.f223025b;
                iq3.m51332s(hsa0Var);
                return;
            }
            qs9 qs9Var = qs9.f192042a;
            if (!set.contains(qs9.class)) {
                try {
                    if (qs9.f192043b) {
                        zContains = qs9.f192044c.contains(str);
                    }
                } catch (Throwable th) {
                    p2l.m68953a(qs9.class, th);
                }
            }
            if (zContains) {
                return;
            }
            pqm0 pqm0VarM61175i = m95.m61175i(bundle2, drl0Var2, z);
            Bundle bundle3 = (Bundle) pqm0VarM61175i.f180350a;
            drl0 drl0Var3 = (drl0) pqm0VarM61175i.f180351b;
            try {
                if (!ozs0.f172353a.m68664c(bundle3)) {
                    lsz0.m59850b(str, bundle3);
                }
                ft8.m42584a(bundle3);
                wqb0.m88742h(str, bundle3);
                g151.m43340d(bundle3);
                ozs0.m68662b(bundle3);
                m95.m61173f(new v85((String) this.f151717a, str, d, bundle3, z, mf0.m61601c(), uuid, drl0Var3), (C1975id) this.f151718b);
            } catch (FacebookException e) {
                iq3 iq3Var2 = tra0.f223025b;
                e.toString();
                iq3.m51332s(hsa0Var);
            } catch (JSONException e2) {
                iq3 iq3Var3 = tra0.f223025b;
                e2.toString();
                iq3.m51332s(hsa0Var);
            }
        } catch (Throwable th2) {
            p2l.m68953a(this, th2);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m63909w(String str, Bundle bundle) {
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            try {
                m63892v(this, str, null, bundle, true, mf0.m61600b());
            } catch (Throwable th) {
                th = th;
                p2l.m68953a(this, th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m63910x(BigDecimal bigDecimal, Currency currency, Bundle bundle, drl0 drl0Var) {
        Throwable th;
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                m95.m61174h();
                return;
            }
            if (currency == null) {
                m95.m61174h();
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            try {
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                try {
                    m63908u("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, true, mf0.m61600b(), drl0Var);
                    m95.m61176j();
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    p2l.m68953a(this, th);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: y */
    public xul0 m63911y(String str) {
        Enum enumM63902m = m63902m(str);
        return enumM63902m != null ? new hzq0(enumM63902m) : C2244p5.f174033a;
    }

    /* JADX INFO: renamed from: z */
    public void m63912z() {
        clq clqVar = (clq) this.f151718b;
        if (((AtomicBoolean) this.f151717a).compareAndSet(false, true) && clqVar.m33295d().decrementAndGet() == 0 && clqVar.f39338c.compareAndSet(false, true)) {
            clqVar.f39336a.mo29772b();
        }
    }

    public /* synthetic */ n95(Object obj, Object obj2) {
        this.f151717a = obj;
        this.f151718b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n95(int i, gh00 gh00Var) {
        switch (i) {
            case 17:
                this.f151717a = gh00Var;
                this.f151718b = new ConcurrentHashMap();
                break;
            default:
                this.f151717a = (qe70) gh00Var;
                break;
        }
    }

    public n95(String str, kv91 kv91Var) {
        this.f151718b = kv91Var;
        this.f151717a = new ebg0(str, 0);
    }

    public n95(Context context, int i) {
        switch (i) {
            case 29:
                this.f151718b = context;
                this.f151717a = new ce9();
                break;
            default:
                this.f151717a = context;
                this.f151718b = null;
                break;
        }
    }

    public n95(twy twyVar) {
        this.f151717a = twyVar;
        this.f151718b = f151707X;
    }

    public n95(Class cls, uh00 uh00Var) {
        cls.getClass();
        this.f151717a = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.f151718b = new HashMap(y85.m93062g(enumArr.length));
        for (Enum r2 : enumArr) {
            ((HashMap) this.f151718b).put(((String) uh00Var.apply(r2)).toUpperCase(Locale.US), r2);
        }
    }

    public n95(String str, String str2) {
        zn91.m96564m0();
        this.f151717a = str;
        Date date = C1893gd.f78679Y;
        C1893gd c1893gdM67200x = okg1.m67200x();
        if (c1893gdM67200x != null && !new Date().after(c1893gdM67200x.f78682a) && (str2 == null || str2.equals(c1893gdM67200x.f78689h))) {
            this.f151718b = new C1975id(c1893gdM67200x.f78686e, p8y.m69344b());
        } else {
            if (str2 == null) {
                p8y.m69343a();
                str2 = p8y.m69344b();
            }
            this.f151718b = new C1975id(null, str2);
        }
        m95.m61180o();
    }

    public n95(Context context, String str) {
        this(n0b1.m63371k(context), str);
    }
}
