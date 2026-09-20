package p204p;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class a691 {

    /* JADX INFO: renamed from: z */
    public static final long f12723z;

    /* JADX INFO: renamed from: a */
    public final Context f12724a;

    /* JADX INFO: renamed from: b */
    public final p591 f12725b;

    /* JADX INFO: renamed from: c */
    public final boolean f12726c;

    /* JADX INFO: renamed from: d */
    public final pf40 f12727d;

    /* JADX INFO: renamed from: e */
    public final boolean f12728e;

    /* JADX INFO: renamed from: f */
    public final long f12729f;

    /* JADX INFO: renamed from: g */
    public final int f12730g;

    /* JADX INFO: renamed from: h */
    public final n890 f12731h;

    /* JADX INFO: renamed from: i */
    public final ya6 f12732i;

    /* JADX INFO: renamed from: j */
    public final ly5 f12733j;

    /* JADX INFO: renamed from: k */
    public final vxb1 f12734k;

    /* JADX INFO: renamed from: l */
    public final hwe f12735l;

    /* JADX INFO: renamed from: m */
    public final nsi0 f12736m;

    /* JADX INFO: renamed from: n */
    public final Looper f12737n;

    /* JADX INFO: renamed from: o */
    public final wra f12738o;

    /* JADX INFO: renamed from: p */
    public final gh61 f12739p;

    /* JADX INFO: renamed from: q */
    public final kh61 f12740q;

    /* JADX INFO: renamed from: r */
    public final d501 f12741r = new d501(this, 22);

    /* JADX INFO: renamed from: s */
    public final c03 f12742s;

    /* JADX INFO: renamed from: t */
    public ahp f12743t;

    /* JADX INFO: renamed from: u */
    public fsh f12744u;

    /* JADX INFO: renamed from: v */
    public fsh f12745v;

    /* JADX INFO: renamed from: w */
    public String f12746w;

    /* JADX INFO: renamed from: x */
    public f9t f12747x;

    /* JADX INFO: renamed from: y */
    public moh f12748y;

    static {
        dgd0.m35920a("media3.transformer");
        f12723z = h0b1.m46291S() ? 25000L : 10000L;
    }

    public a691(Context context, p591 p591Var, boolean z, pf40 pf40Var, boolean z2, long j, int i, n890 n890Var, ya6 ya6Var, ly5 ly5Var, vxb1 vxb1Var, hwe hweVar, nsi0 nsi0Var, Looper looper, wra wraVar, gh61 gh61Var, c03 c03Var) {
        this.f12724a = context;
        this.f12725b = p591Var;
        this.f12726c = z;
        this.f12727d = pf40Var;
        this.f12728e = z2;
        this.f12729f = j;
        this.f12730g = i;
        this.f12731h = n890Var;
        this.f12732i = ya6Var;
        this.f12733j = ly5Var;
        this.f12734k = vxb1Var;
        this.f12735l = hweVar;
        this.f12736m = nsi0Var;
        this.f12737n = looper;
        this.f12738o = wraVar;
        this.f12739p = gh61Var;
        this.f12742s = c03Var;
        this.f12740q = gh61Var.m44723a(looper, null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m24853a() {
        return Build.VERSION.SDK_INT >= 35 && this.f12728e;
    }

    /* JADX INFO: renamed from: b */
    public final void m24854b() {
        int iM25993b;
        int i;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f12737n;
        if (looperMyLooper != looper) {
            throw new IllegalStateException("Transformer is accessed on the wrong thread.");
        }
        ahp ahpVar = this.f12743t;
        if (ahpVar == null) {
            m24855c();
            return;
        }
        try {
            ahpVar.m25992a();
            zz11 zz11Var = new zz11(25);
            if (Looper.myLooper() != looper) {
                throw new IllegalStateException("Transformer is accessed on the wrong thread.");
            }
            ahp ahpVar2 = this.f12743t;
            iM25993b = ahpVar2 != null ? ahpVar2.m25993b(zz11Var) : 0;
            if (m24853a()) {
                i = iM25993b == 2 ? zz11Var.f287861b : -1;
                if (this.f12747x == null) {
                    m24856d();
                }
                f9t f9tVar = this.f12747x;
                f9tVar.getClass();
                f9tVar.m41084e(i);
            }
            this.f12743t = null;
            m24855c();
        } catch (Throwable th) {
            zz11 zz11Var2 = new zz11(25);
            if (Looper.myLooper() != looper) {
                throw new IllegalStateException("Transformer is accessed on the wrong thread.");
            }
            ahp ahpVar3 = this.f12743t;
            iM25993b = ahpVar3 != null ? ahpVar3.m25993b(zz11Var2) : 0;
            if (m24853a()) {
                i = iM25993b == 2 ? zz11Var2.f287861b : -1;
                if (this.f12747x == null) {
                    m24856d();
                }
                f9t f9tVar2 = this.f12747x;
                f9tVar2.getClass();
                f9tVar2.m41084e(i);
            }
            this.f12743t = null;
            m24855c();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m24855c() {
        moh mohVar = this.f12748y;
        if (mohVar != null) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) mohVar.f145678d;
            scheduledFuture.getClass();
            scheduledFuture.cancel(false);
            ((ScheduledExecutorService) mohVar.f145677c).shutdownNow();
            this.f12748y = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX INFO: renamed from: d */
    public final LogSessionId m24856d() {
        boolean z;
        String str = null;
        if (!m24853a()) {
            return null;
        }
        c03 c03Var = this.f12742s;
        c03Var.getClass();
        e9t e9tVar = new e9t(c03Var.f32655a);
        LogSessionId logSessionIdM38262a = e9tVar.m38262a();
        nsi0 nsi0Var = this.f12736m;
        if (nsi0Var instanceof qj40) {
            str = "androidx.media3:media3-muxer:1.11.0";
        } else if (nsi0Var instanceof oup) {
            str = pup.f181513b;
        }
        fsh fshVar = this.f12744u;
        fshVar.getClass();
        boolean z2 = true;
        if (fshVar.f72863d.f157604a.isEmpty()) {
            fsh fshVar2 = this.f12744u;
            fshVar2.getClass();
            if (nhg1.m64492l(fshVar2.f72861b, new sx6(7))) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        fsh fshVar3 = this.f12744u;
        fshVar3.getClass();
        if (fshVar3.f72863d.f157605b.isEmpty()) {
            fsh fshVar4 = this.f12744u;
            fshVar4.getClass();
            if (!nhg1.m64492l(fshVar4.f72861b, new sx6(8))) {
                z2 = false;
            }
        }
        this.f12747x = new f9t(e9tVar, str, z, z2);
        return logSessionIdM38262a;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x02ea A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:65:0x02dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final void m24857e(fsh fshVar, String str) {
        kh61 kh61Var;
        g691 g691Var;
        boolean z;
        z8t z8tVar;
        if (Looper.myLooper() != this.f12737n) {
            throw new IllegalStateException("Transformer is accessed on the wrong thread.");
        }
        int i = 1;
        c95.m31856v(this.f12743t == null, "There is already an export in progress.");
        long j = this.f12729f;
        if (j != -9223372036854775807L) {
            f151 f151Var = new f151(this, 19);
            moh mohVar = new moh(j, f151Var);
            this.f12748y = mohVar;
            mohVar.f145678d = ((ScheduledExecutorService) mohVar.f145677c).schedule(new rsz0(f151Var, 17), j, TimeUnit.MILLISECONDS);
        }
        this.f12745v = fshVar;
        ArrayList arrayList = new ArrayList();
        kf40 kf40VarListIterator = fshVar.f72861b.listIterator(0);
        while (kf40VarListIterator.hasNext()) {
            z8t z8tVar2 = (z8t) kf40VarListIterator.next();
            ArrayList arrayList2 = new ArrayList();
            kf40 kf40VarListIterator2 = z8tVar2.f280556a.listIterator(0);
            while (kf40VarListIterator2.hasNext()) {
                y8t y8tVar = (y8t) kf40VarListIterator2.next();
                c95.m31855u(y8tVar.f270381i.isEmpty());
                x8t x8tVarM93126a = y8tVar.m93126a();
                x8tVarM93126a.f259225h = pf40.m69791p(pf40.m69794t(new ix71(i)));
                y8t y8tVar2 = new y8t(x8tVarM93126a);
                kxq0 kxq0Var = y8tVar2.f270379g;
                if (kxq0Var != kxq0.f127556Q0) {
                    ArrayList arrayList3 = new ArrayList(y8tVar2.f270381i);
                    y8tVar2.f270380h.getClass();
                    arrayList3.add(new ez31(kxq0Var, true));
                    x8t x8tVarM93126a2 = y8tVar2.m93126a();
                    x8tVarM93126a2.f259225h = pf40.m69791p(arrayList3);
                    y8tVar2 = new y8t(x8tVarM93126a2);
                }
                arrayList2.add(y8tVar2);
            }
            z8tVar2.getClass();
            c95.m31843i(!arrayList2.isEmpty());
            hg40 hg40Var = z8tVar2.f280557b;
            if (hg40Var.contains(-2)) {
                tgq tgqVar = new tgq(arrayList2);
                boolean z2 = z8tVar2.f280558c;
                c95.m31855u(((hg40) tgqVar.f220238c).contains(-2));
                if (z2) {
                    fg40 fg40Var = new fg40(4);
                    fg40Var.m41575h((hg40) tgqVar.f220238c);
                    fg40Var.m41574g(1);
                    tgqVar.f220238c = fg40Var.m41576i();
                } else {
                    hg40 hg40Var2 = (hg40) tgqVar.f220238c;
                    int i2 = hg40.f91023c;
                    zh21 zh21Var = new zh21(1);
                    c95.m31848n(hg40Var2, "set1");
                    tgqVar.f220238c = hg40.m47406p(new o601(1, hg40Var2, zh21Var));
                }
                boolean z3 = z8tVar2.f280559d;
                c95.m31855u(((hg40) tgqVar.f220238c).contains(-2));
                if (z3) {
                    fg40 fg40Var2 = new fg40(4);
                    fg40Var2.m41575h((hg40) tgqVar.f220238c);
                    fg40Var2.m41574g(2);
                    tgqVar.f220238c = fg40Var2.m41576i();
                } else {
                    hg40 hg40Var3 = (hg40) tgqVar.f220238c;
                    int i3 = hg40.f91023c;
                    zh21 zh21Var2 = new zh21(2);
                    c95.m31848n(hg40Var3, "set1");
                    tgqVar.f220238c = hg40.m47406p(new o601(1, hg40Var3, zh21Var2));
                }
                z8tVar = new z8t(tgqVar);
            } else {
                tgq tgqVar2 = new tgq(hg40Var);
                ((jf40) tgqVar2.f220237b).m28987e(arrayList2);
                z8tVar = new z8t(tgqVar2);
            }
            arrayList.add(z8tVar);
        }
        fshVar.getClass();
        fsh fshVar2 = new fsh();
        fshVar2.f72861b = fshVar.f72861b;
        fshVar2.f72862c = fshVar.f72862c;
        fshVar2.f72863d = fshVar.f72863d;
        fshVar2.f72864e = fshVar.f72864e;
        fshVar2.f72865f = fshVar.f72865f;
        fshVar2.f72866g = fshVar.f72866g;
        fshVar2.f72867h = fshVar.f72867h;
        c95.m31844j(!arrayList.isEmpty(), "The composition must contain at least one EditedMediaItemSequence.");
        fshVar2.f72861b = pf40.m69791p(arrayList);
        fsh fshVarM42559a = fshVar2.m42559a();
        this.f12744u = fshVarM42559a;
        this.f12746w = str;
        kh61 kh61Var2 = this.f12740q;
        p591 p591VarM87359c = this.f12725b;
        if (fshVarM42559a.f72866g != 0) {
            w780 w780VarM69168a = p591VarM87359c.m69168a();
            w780VarM69168a.f248599c = this.f12744u.f72866g;
            p591VarM87359c = w780VarM69168a.m87359c();
        }
        p591 p591Var = p591VarM87359c;
        LogSessionId logSessionIdM24856d = m24856d();
        fsh fshVar3 = this.f12745v;
        fshVar3.getClass();
        bmx bmxVar = new bmx(fshVar3, this.f12731h, kh61Var2, p591Var);
        ya6 ya6Var = this.f12732i;
        qpo.m73451b();
        Context context = this.f12724a;
        fsh fshVar4 = this.f12744u;
        fshVar4.getClass();
        ly5 ly5Var = this.f12733j;
        vxb1 vxb1Var = this.f12734k;
        hwe hweVar = this.f12735l;
        pf40 pf40Var = this.f12727d;
        int i4 = this.f12730g;
        d501 d501Var = this.f12741r;
        wra wraVar = this.f12738o;
        gh61 gh61Var = this.f12739p;
        if (this.f12726c) {
            fsh fshVar5 = this.f12744u;
            fshVar5.getClass();
            kh61Var = kh61Var2;
            if (fshVar5.f72861b.size() > 1 || ((z8t) this.f12744u.f72861b.get(0)).f280556a.f254765d > 1) {
                z = false;
            } else {
                fsh fshVar6 = this.f12744u;
                fshVar6.getClass();
                z = !((y8t) ((z8t) fshVar6.f72861b.get(0)).f280556a.get(0)).f270373a.f229766e.equals(hfd0.f90681i);
            }
            boolean z4 = z;
            nsi0 nsi0Var = this.f12736m;
            String str2 = this.f12746w;
            str2.getClass();
            ahp ahpVar = new ahp(context, fshVar4, p591Var, ya6Var, ly5Var, vxb1Var, hweVar, pf40Var, i4, d501Var, bmxVar, kh61Var, wraVar, gh61Var, logSessionIdM24856d, z4, nsi0Var, str2);
            this.f12743t = ahpVar;
            g691Var = new g691(ahpVar.f15726a, ahpVar.f15727b, ahpVar.f15728c, ahpVar.f15729d, ahpVar.f15730e, ahpVar.f15731f, ahpVar.f15732g, ahpVar.f15733h, ahpVar.f15734i, new qsi0(ahpVar.f15743r, ahpVar.f15742q, ahpVar.f15745t, 0, null), ahpVar.f15745t, ahpVar.f15736k, ahpVar.f15737l, ahpVar.f15738m, ahpVar.f15739n, 0L, ahpVar.f15740o, ahpVar.f15741p);
            ahpVar.f15746u = g691Var;
            g691Var.m43684d();
            g691Var.f76982j.m56392j(1);
            synchronized (g691Var.f76990r) {
                g691Var.f76970B = 1;
                g691Var.f76971C = 0;
            }
            String str3 = h0b1.f86200a;
            LinkedHashMap linkedHashMap = qpo.f191349a;
            synchronized (qpo.class) {
            }
        }
        kh61Var = kh61Var2;
        nsi0 nsi0Var2 = this.f12736m;
        String str4 = this.f12746w;
        str4.getClass();
        ahp ahpVar2 = new ahp(context, fshVar4, p591Var, ya6Var, ly5Var, vxb1Var, hweVar, pf40Var, i4, d501Var, bmxVar, kh61Var, wraVar, gh61Var, logSessionIdM24856d, z4, nsi0Var2, str4);
        this.f12743t = ahpVar2;
        g691Var = new g691(ahpVar2.f15726a, ahpVar2.f15727b, ahpVar2.f15728c, ahpVar2.f15729d, ahpVar2.f15730e, ahpVar2.f15731f, ahpVar2.f15732g, ahpVar2.f15733h, ahpVar2.f15734i, new qsi0(ahpVar2.f15743r, ahpVar2.f15742q, ahpVar2.f15745t, 0, null), ahpVar2.f15745t, ahpVar2.f15736k, ahpVar2.f15737l, ahpVar2.f15738m, ahpVar2.f15739n, 0L, ahpVar2.f15740o, ahpVar2.f15741p);
        ahpVar2.f15746u = g691Var;
        g691Var.m43684d();
        g691Var.f76982j.m56392j(1);
        synchronized (g691Var.f76990r) {
            g691Var.f76970B = 1;
            g691Var.f76971C = 0;
            String str5 = h0b1.f86200a;
            LinkedHashMap linkedHashMap2 = qpo.f191349a;
            synchronized (qpo.class) {
            }
        }
    }
}
