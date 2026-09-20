package p204p;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import androidx.mediarouter.media.MediaTransferReceiver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class mg10 {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ int f143254E = 0;

    /* JADX INFO: renamed from: A */
    public uld0 f143255A;

    /* JADX INFO: renamed from: B */
    public int f143256B;

    /* JADX INFO: renamed from: C */
    public x610 f143257C;

    /* JADX INFO: renamed from: c */
    public final n890 f143261c;

    /* JADX INFO: renamed from: d */
    public wmd0 f143262d;

    /* JADX INFO: renamed from: e */
    public amd0 f143263e;

    /* JADX INFO: renamed from: f */
    public umd0 f143264f;

    /* JADX INFO: renamed from: g */
    public final Context f143265g;

    /* JADX INFO: renamed from: p */
    public final boolean f143274p;

    /* JADX INFO: renamed from: q */
    public final boolean f143275q;

    /* JADX INFO: renamed from: r */
    public old0 f143276r;

    /* JADX INFO: renamed from: s */
    public final ido0 f143277s;

    /* JADX INFO: renamed from: t */
    public final and0 f143278t;

    /* JADX INFO: renamed from: u */
    public dnd0 f143279u;

    /* JADX INFO: renamed from: v */
    public wmd0 f143280v;

    /* JADX INFO: renamed from: w */
    public wmd0 f143281w;

    /* JADX INFO: renamed from: x */
    public wmd0 f143282x;

    /* JADX INFO: renamed from: y */
    public zld0 f143283y;

    /* JADX INFO: renamed from: z */
    public uld0 f143284z;

    /* JADX INFO: renamed from: a */
    public final eg10 f143259a = new eg10(this);

    /* JADX INFO: renamed from: b */
    public final HashMap f143260b = new HashMap();

    /* JADX INFO: renamed from: h */
    public final ArrayList f143266h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final ArrayList f143267i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final HashMap f143268j = new HashMap();

    /* JADX INFO: renamed from: k */
    public final HashMap f143269k = new HashMap();

    /* JADX INFO: renamed from: l */
    public final ArrayList f143270l = new ArrayList();

    /* JADX INFO: renamed from: m */
    public final ArrayList f143271m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public final m78 f143272n = new m78();

    /* JADX INFO: renamed from: o */
    public final hg10 f143273o = new hg10(this);

    /* JADX INFO: renamed from: D */
    public final xeu f143258D = new xeu(this, 18);

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public mg10(Context context) {
        this.f143265g = context;
        this.f143274p = lrg1.m59812o((ActivityManager) context.getSystemService("activity"));
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 30) {
            int i2 = MediaTransferReceiver.f1150a;
            Intent intent = new Intent(context, (Class<?>) MediaTransferReceiver.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z = true;
            }
        }
        this.f143275q = z;
        ei61.m39083a(context);
        this.f143276r = (i < 30 || !z) ? null : new old0(context, new z4y(this, 7));
        ido0 ido0Var = new ido0(context, this);
        this.f143277s = ido0Var;
        this.f143278t = new and0(new kep(this, 29));
        m61662a(ido0Var, true);
        emd0 emd0Var = this.f143276r;
        if (emd0Var != null) {
            m61662a(emd0Var, true);
        }
        n890 n890Var = new n890(context, this);
        this.f143261c = n890Var;
        n890Var.m63840k();
    }

    /* JADX INFO: renamed from: a */
    public final void m61662a(emd0 emd0Var, boolean z) {
        if (m61665d(emd0Var) == null) {
            vmd0 vmd0Var = new vmd0(emd0Var, z);
            this.f143270l.add(vmd0Var);
            this.f143259a.m38769b(513, vmd0Var);
            m61676o(vmd0Var, emd0Var.f60893g);
            zmd0.m96426b();
            emd0Var.f60890d = this.f143273o;
            emd0Var.m39416h(this.f143284z);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m61663b(vmd0 vmd0Var, String str) {
        String strFlattenToShortString = vmd0Var.f242787d.m79867a().flattenToShortString();
        boolean z = vmd0Var.f242786c;
        String strM56834f = z ? str : klh.m56834f(strFlattenToShortString, ":", str);
        HashMap map = this.f143269k;
        if (!z) {
            ArrayList arrayList = this.f143267i;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                if (((wmd0) arrayList.get(i)).f252812c.equals(strM56834f)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                int i2 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String strM38565n = edb.m38565n(strM56834f, "_", i2);
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            i3 = -1;
                            break;
                        }
                        if (((wmd0) arrayList.get(i3)).f252812c.equals(strM38565n)) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 < 0) {
                        map.put(new qqm0(strFlattenToShortString, str), strM38565n);
                        return strM38565n;
                    }
                    i2++;
                }
            }
        }
        map.put(new qqm0(strFlattenToShortString, str), strM56834f);
        return strM56834f;
    }

    /* JADX INFO: renamed from: c */
    public final wmd0 m61664c() {
        for (wmd0 wmd0Var : this.f143267i) {
            if (wmd0Var != this.f143280v && wmd0Var.m88555b() == this.f143277s && wmd0Var.m88565l("android.media.intent.category.LIVE_AUDIO") && !wmd0Var.m88565l("android.media.intent.category.LIVE_VIDEO") && wmd0Var.m88558e()) {
                return wmd0Var;
            }
        }
        return this.f143280v;
    }

    /* JADX INFO: renamed from: d */
    public final vmd0 m61665d(emd0 emd0Var) {
        for (vmd0 vmd0Var : this.f143270l) {
            if (vmd0Var.f242784a == emd0Var) {
                return vmd0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m61666e() {
        ArrayList arrayList = new ArrayList();
        for (jg10 jg10Var : this.f143268j.values()) {
            if (jg10Var.f111998f != null) {
                arrayList.add(jg10Var.f111998f);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final jg10 m61667f(tmd0 tmd0Var) {
        for (jg10 jg10Var : this.f143268j.values()) {
            if (jg10Var.f111998f == tmd0Var) {
                return jg10Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final amd0 m61668g(wmd0 wmd0Var) {
        amd0 amd0Var;
        if (wmd0Var == this.f143262d && (amd0Var = this.f143263e) != null) {
            return amd0Var;
        }
        if (wmd0Var instanceof tmd0) {
            tmd0 tmd0Var = (tmd0) wmd0Var;
            if (tmd0Var.m81125n()) {
                jg10 jg10VarM61667f = m61667f(tmd0Var);
                if (jg10VarM61667f != null) {
                    return jg10VarM61667f.f111994b;
                }
                return null;
            }
        }
        amd0 amd0Var2 = (amd0) this.f143260b.get(wmd0Var.f252812c);
        if (amd0Var2 != null) {
            return amd0Var2;
        }
        Iterator it = this.f143268j.values().iterator();
        while (it.hasNext() && (amd0Var2 = (amd0) ((jg10) it.next()).f111995c.get(wmd0Var.f252812c)) == null) {
        }
        return amd0Var2;
    }

    /* JADX INFO: renamed from: h */
    public final wmd0 m61669h() {
        wmd0 wmd0Var = this.f143262d;
        if (wmd0Var != null) {
            return wmd0Var;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    /* JADX INFO: renamed from: i */
    public final boolean m61670i() {
        if (!this.f143275q) {
            return false;
        }
        dnd0 dnd0Var = this.f143279u;
        return dnd0Var == null || dnd0Var.f50759a;
    }

    /* JADX INFO: renamed from: j */
    public final void m61671j() {
        amd0 amd0VarMo36412d;
        if (this.f143262d.f252831v.isEmpty()) {
            return;
        }
        List<wmd0> listUnmodifiableList = Collections.unmodifiableList(this.f143262d.f252831v);
        HashSet hashSet = new HashSet();
        Iterator it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            hashSet.add(((wmd0) it.next()).f252812c);
        }
        HashMap map = this.f143260b;
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (!hashSet.contains(entry.getKey())) {
                amd0 amd0Var = (amd0) entry.getValue();
                amd0Var.mo26396i(0);
                amd0Var.mo26392e();
                it2.remove();
            }
        }
        for (wmd0 wmd0Var : listUnmodifiableList) {
            if (!map.containsKey(wmd0Var.f252812c) && (amd0VarMo36412d = wmd0Var.m88555b().mo36412d(wmd0Var.f252811b, this.f143262d.f252811b)) != null) {
                amd0VarMo36412d.mo26393f();
                map.put(wmd0Var.f252812c, amd0VarMo36412d);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m61672k(wmd0 wmd0Var, int i, boolean z) {
        int iM81124m;
        if (!this.f143267i.contains(wmd0Var)) {
            Objects.toString(wmd0Var);
            return;
        }
        if (!wmd0Var.f252816g) {
            wmd0Var.toString();
            return;
        }
        wmd0 wmd0Var2 = this.f143262d;
        if (wmd0Var2 != wmd0Var) {
            tmd0 tmd0Var = null;
            if (wmd0Var2 != null && (wmd0Var2 instanceof tmd0)) {
                tmd0Var = (tmd0) wmd0Var2;
            }
            if (tmd0Var == null || Collections.unmodifiableList(tmd0Var.f252831v).size() != 1 || ((iM81124m = tmd0Var.m81124m(wmd0Var)) != 3 && iM81124m != 2)) {
                if (Build.VERSION.SDK_INT >= 30) {
                    emd0 emd0VarM88555b = wmd0Var.m88555b();
                    old0 old0Var = this.f143276r;
                    if (emd0VarM88555b == old0Var && this.f143262d != wmd0Var) {
                        old0Var.m67290n(wmd0Var.f252811b);
                        return;
                    }
                }
                m61673l(wmd0Var, i, z);
                return;
            }
        }
        wmd0Var.toString();
    }

    /* JADX INFO: renamed from: l */
    public final void m61673l(wmd0 wmd0Var, int i, boolean z) {
        fmd0 fmd0Var;
        if (this.f143262d == wmd0Var) {
            return;
        }
        boolean z2 = wmd0Var == this.f143280v;
        wmd0 wmd0Var2 = this.f143281w;
        Context context = this.f143265g;
        if (wmd0Var2 != null && z2) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i2 = 3; i2 < stackTrace.length; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                stackTraceElement.getClassName();
                stackTraceElement.getMethodName();
                stackTraceElement.getLineNumber();
            }
            if (this.f143262d != null) {
                Locale locale = Locale.US;
                zmd0.m96426b();
                wmd0 wmd0Var3 = zmd0.m96427c().f143281w;
            }
            context.getPackageName();
        }
        if (this.f143282x != null) {
            this.f143282x = null;
            zld0 zld0Var = this.f143283y;
            if (zld0Var != null) {
                zld0Var.mo26396i(3);
                this.f143283y.mo26392e();
                this.f143283y = null;
            }
        }
        if (m61670i() && (fmd0Var = wmd0Var.f252810a.f242788e) != null && fmd0Var.m42087A()) {
            emd0 emd0VarM88555b = wmd0Var.m88555b();
            String str = wmd0Var.f252811b;
            bmd0 bmd0Var = new bmd0();
            bmd0Var.m29827b(context.getPackageName());
            zld0 zld0VarMo39413b = emd0VarM88555b.mo39413b(str, bmd0Var.m29826a());
            if (zld0VarMo39413b != null) {
                zld0VarMo39413b.m96361o(lzj.m60328F(context), this.f143258D);
                this.f143282x = wmd0Var;
                this.f143283y = zld0VarMo39413b;
                zld0VarMo39413b.mo26393f();
                return;
            }
            wmd0Var.toString();
        }
        emd0 emd0VarM88555b2 = wmd0Var.m88555b();
        String str2 = wmd0Var.f252811b;
        bmd0 bmd0Var2 = new bmd0();
        bmd0Var2.m29827b(context.getPackageName());
        amd0 amd0VarMo39414e = emd0VarM88555b2.mo39414e(str2, bmd0Var2.m29826a());
        if (amd0VarMo39414e != null) {
            amd0VarMo39414e.mo26393f();
        }
        if (this.f143262d == null) {
            this.f143262d = wmd0Var;
            this.f143263e = amd0VarMo39414e;
            eg10 eg10Var = this.f143259a;
            eg10Var.getClass();
            Message messageObtainMessage = eg10Var.obtainMessage(262, new lg10(null, wmd0Var, z));
            messageObtainMessage.arg1 = i;
            messageObtainMessage.sendToTarget();
            return;
        }
        umd0 umd0Var = this.f143264f;
        if (umd0Var != null) {
            umd0Var.m83430a();
            this.f143264f = null;
        }
        umd0 umd0Var2 = new umd0(this, wmd0Var, amd0VarMo39414e, i, z, null, null);
        this.f143264f = umd0Var2;
        umd0Var2.m83431b();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bc  */
    /* JADX INFO: renamed from: m */
    public final void m61674m() {
        sep sepVar = new sep();
        this.f143278t.m26490c();
        ArrayList arrayList = this.f143266h;
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        while (true) {
            size--;
            if (size < 0) {
                boolean zM26488a = this.f143278t.m26488a();
                this.f143256B = i;
                omd0 omd0VarM77936j = z ? sepVar.m77936j() : omd0.f167017c;
                omd0 omd0VarM77936j2 = sepVar.m77936j();
                if (m61670i()) {
                    uld0 uld0Var = this.f143255A;
                    if (uld0Var != null) {
                        uld0Var.m83361a();
                        if (!uld0Var.f231531b.equals(omd0VarM77936j2) || this.f143255A.m83362b() != zM26488a) {
                            omd0VarM77936j2.m67344a();
                            if (omd0VarM77936j2.f167019b.isEmpty() || zM26488a) {
                                this.f143255A = new uld0(omd0VarM77936j2, zM26488a);
                            } else if (this.f143255A != null) {
                                this.f143255A = null;
                            }
                            this.f143276r.m39416h(this.f143255A);
                        }
                    } else {
                        omd0VarM77936j2.m67344a();
                        if (omd0VarM77936j2.f167019b.isEmpty()) {
                            this.f143255A = new uld0(omd0VarM77936j2, zM26488a);
                            this.f143276r.m39416h(this.f143255A);
                        } else {
                            this.f143255A = new uld0(omd0VarM77936j2, zM26488a);
                            this.f143276r.m39416h(this.f143255A);
                        }
                    }
                }
                uld0 uld0Var2 = this.f143284z;
                if (uld0Var2 != null) {
                    uld0Var2.m83361a();
                    if (uld0Var2.f231531b.equals(omd0VarM77936j) && this.f143284z.m83362b() == zM26488a) {
                        return;
                    }
                }
                omd0VarM77936j.m67344a();
                if (!omd0VarM77936j.f167019b.isEmpty() || zM26488a) {
                    this.f143284z = new uld0(omd0VarM77936j, zM26488a);
                } else if (this.f143284z == null) {
                    return;
                } else {
                    this.f143284z = null;
                }
                Iterator it = this.f143270l.iterator();
                while (it.hasNext()) {
                    emd0 emd0Var = ((vmd0) it.next()).f242784a;
                    if (emd0Var != this.f143276r) {
                        emd0Var.m39416h(this.f143284z);
                    }
                }
                return;
            }
            zmd0 zmd0Var = (zmd0) ((WeakReference) arrayList.get(size)).get();
            if (zmd0Var == null) {
                arrayList.remove(size);
            } else {
                ArrayList arrayList2 = zmd0Var.f284252b;
                int size2 = arrayList2.size();
                i += size2;
                for (int i2 = 0; i2 < size2; i2++) {
                    rmd0 rmd0Var = (rmd0) arrayList2.get(i2);
                    omd0 omd0Var = rmd0Var.f200504c;
                    if (omd0Var == null) {
                        throw new IllegalArgumentException("selector must not be null");
                    }
                    sepVar.m77930d(omd0Var.m67345b());
                    boolean z2 = (rmd0Var.f200505d & 1) != 0;
                    this.f143278t.m26489b(rmd0Var.f200506e, z2);
                    if (z2) {
                        z = true;
                    }
                    int i3 = rmd0Var.f200505d;
                    if ((i3 & 4) != 0 && !this.f143274p) {
                        z = true;
                    }
                    if ((i3 & 8) != 0) {
                        z = true;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m61675n() {
        wmd0 wmd0Var = this.f143262d;
        if (wmd0Var == null) {
            x610 x610Var = this.f143257C;
            if (x610Var != null) {
                x610Var.m90060i();
                return;
            }
            return;
        }
        int i = wmd0Var.f252825p;
        m78 m78Var = this.f143272n;
        m78Var.f140730a = i;
        m78Var.f140731b = wmd0Var.f252826q;
        m78Var.f140732c = wmd0Var.m88556c();
        m78Var.f140733d = this.f143262d.f252822m;
        if (m61670i() && this.f143262d.m88555b() == this.f143276r) {
            m78Var.f140734e = old0.m67286k(this.f143263e);
        } else {
            m78Var.f140734e = null;
        }
        Iterator it = this.f143271m.iterator();
        if (it.hasNext()) {
            ikc0.m50942n(it.next());
            throw null;
        }
        x610 x610Var2 = this.f143257C;
        if (x610Var2 != null) {
            wmd0 wmd0Var2 = this.f143262d;
            wmd0 wmd0Var3 = this.f143280v;
            if (wmd0Var3 == null) {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
            if (wmd0Var2 == wmd0Var3 || wmd0Var2 == this.f143281w) {
                x610Var2.m90060i();
            } else {
                x610Var2.m90061j(m78Var.f140732c == 1 ? 2 : 0, m78Var.f140731b, m78Var.f140730a, m78Var.f140734e);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m61676o(vmd0 vmd0Var, fmd0 fmd0Var) {
        boolean z;
        Iterator it;
        fmd0 fmd0Var2 = vmd0Var.f242788e;
        ArrayList arrayList = vmd0Var.f242785b;
        if (fmd0Var2 != fmd0Var) {
            vmd0Var.f242788e = fmd0Var;
            ArrayList arrayList2 = this.f143267i;
            int i = 0;
            eg10 eg10Var = this.f143259a;
            if (fmd0Var == null || !(fmd0Var.m42099t() || fmd0Var == this.f143277s.f60893g)) {
                if (fmd0Var != null) {
                    fmd0Var.toString();
                } else {
                    Objects.toString(vmd0Var.f242787d.m79867a());
                }
                z = false;
            } else {
                List listM42096q = fmd0Var.m42096q();
                ArrayList<qqm0> arrayList3 = new ArrayList();
                ArrayList<qqm0> arrayList4 = new ArrayList();
                Iterator it2 = listM42096q.iterator();
                int i2 = 0;
                boolean z2 = false;
                while (it2.hasNext()) {
                    tld0 tld0Var = (tld0) it2.next();
                    if (tld0Var == null || !tld0Var.m81055l()) {
                        it = it2;
                        Objects.toString(tld0Var);
                    } else {
                        String strM81050g = tld0Var.m81050g();
                        int size = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                i3 = -1;
                                break;
                            } else if (((wmd0) arrayList.get(i3)).f252811b.equals(strM81050g)) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (i3 < 0) {
                            it = it2;
                            wmd0 wmd0Var = new wmd0(vmd0Var, strM81050g, m61663b(vmd0Var, strM81050g), tld0Var.f221451a.getBoolean("isSystemRoute", false));
                            int i4 = i2 + 1;
                            arrayList.add(i2, wmd0Var);
                            arrayList2.add(wmd0Var);
                            if (tld0Var.m81048e().isEmpty()) {
                                wmd0Var.m88561h(tld0Var);
                                eg10Var.m38769b(257, wmd0Var);
                            } else {
                                arrayList3.add(new qqm0(wmd0Var, tld0Var));
                            }
                            i2 = i4;
                        } else {
                            it = it2;
                            if (i3 < i2) {
                                tld0Var.toString();
                            } else {
                                wmd0 wmd0Var2 = (wmd0) arrayList.get(i3);
                                int i5 = i2 + 1;
                                Collections.swap(arrayList, i3, i2);
                                if (!tld0Var.m81048e().isEmpty()) {
                                    arrayList4.add(new qqm0(wmd0Var2, tld0Var));
                                } else if (m61677p(wmd0Var2, tld0Var) != 0 && wmd0Var2 == this.f143262d) {
                                    i2 = i5;
                                    z2 = true;
                                }
                                i2 = i5;
                            }
                        }
                    }
                    it2 = it;
                }
                for (qqm0 qqm0Var : arrayList3) {
                    wmd0 wmd0Var3 = (wmd0) qqm0Var.f191620a;
                    wmd0Var3.m88561h((tld0) qqm0Var.f191621b);
                    eg10Var.m38769b(257, wmd0Var3);
                }
                boolean z3 = z2;
                for (qqm0 qqm0Var2 : arrayList4) {
                    wmd0 wmd0Var4 = (wmd0) qqm0Var2.f191620a;
                    if (m61677p(wmd0Var4, (tld0) qqm0Var2.f191621b) != 0 && wmd0Var4 == this.f143262d) {
                        z3 = true;
                    }
                }
                z = z3;
                i = i2;
            }
            for (int size2 = arrayList.size() - 1; size2 >= i; size2--) {
                wmd0 wmd0Var5 = (wmd0) arrayList.get(size2);
                wmd0Var5.m88561h(null);
                arrayList2.remove(wmd0Var5);
            }
            m61678q(z);
            for (int size3 = arrayList.size() - 1; size3 >= i; size3--) {
                eg10Var.m38769b(258, (wmd0) arrayList.remove(size3));
            }
            eg10Var.m38769b(515, vmd0Var);
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m61677p(wmd0 wmd0Var, tld0 tld0Var) {
        int iM88561h = wmd0Var.m88561h(tld0Var);
        if (iM88561h != 0) {
            int i = iM88561h & 1;
            eg10 eg10Var = this.f143259a;
            if (i != 0) {
                eg10Var.m38769b(259, wmd0Var);
            }
            if ((iM88561h & 2) != 0) {
                eg10Var.m38769b(260, wmd0Var);
            }
            if ((iM88561h & 4) != 0) {
                eg10Var.m38769b(261, wmd0Var);
            }
        }
        return iM88561h;
    }

    /* JADX INFO: renamed from: q */
    public final void m61678q(boolean z) {
        wmd0 wmd0Var = this.f143280v;
        if (wmd0Var != null && !wmd0Var.m88558e()) {
            Objects.toString(this.f143280v);
            this.f143280v = null;
        }
        wmd0 wmd0Var2 = this.f143280v;
        ido0 ido0Var = this.f143277s;
        ArrayList<wmd0> arrayList = this.f143267i;
        if (wmd0Var2 == null) {
            for (wmd0 wmd0Var3 : arrayList) {
                if (wmd0Var3.m88555b() == ido0Var && wmd0Var3.f252811b.equals("DEFAULT_ROUTE") && wmd0Var3.m88558e()) {
                    this.f143280v = wmd0Var3;
                    Objects.toString(wmd0Var3);
                    break;
                }
            }
        }
        wmd0 wmd0Var4 = this.f143281w;
        if (wmd0Var4 != null && !wmd0Var4.m88558e()) {
            Objects.toString(this.f143281w);
            this.f143281w = null;
        }
        if (this.f143281w == null) {
            for (wmd0 wmd0Var5 : arrayList) {
                if (wmd0Var5.m88555b() == ido0Var && wmd0Var5.m88565l("android.media.intent.category.LIVE_AUDIO") && !wmd0Var5.m88565l("android.media.intent.category.LIVE_VIDEO") && wmd0Var5.m88558e()) {
                    this.f143281w = wmd0Var5;
                    Objects.toString(wmd0Var5);
                    break;
                }
            }
        }
        wmd0 wmd0Var6 = this.f143262d;
        if (wmd0Var6 == null || !wmd0Var6.f252816g) {
            Objects.toString(wmd0Var6);
            m61673l(m61664c(), 0, true);
        } else if (z) {
            m61671j();
            m61675n();
        }
    }
}
