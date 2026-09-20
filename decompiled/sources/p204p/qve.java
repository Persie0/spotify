package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import com.ravelin.core.model.DeviceId;
import com.ravelin.core.model.ErrorMetadata;
import com.ravelin.core.model.MobileError;
import com.ravelin.core.repository.broadcastsdb.BroadcastsDatabase;
import com.ravelin.core.repository.p008db.AppDatabase;
import com.spotify.signup.signup.p150v2.proto.Error;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class qve implements clk0, l2f1 {

    /* JADX INFO: renamed from: m */
    public static final String f192985m;

    /* JADX INFO: renamed from: a */
    public final BroadcastsDatabase f192986a;

    /* JADX INFO: renamed from: b */
    public final l2f1 f192987b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f192988c;

    /* JADX INFO: renamed from: d */
    public final xd70 f192989d;

    /* JADX INFO: renamed from: e */
    public final k2f1 f192990e;

    /* JADX INFO: renamed from: f */
    public final zue f192991f;

    /* JADX INFO: renamed from: g */
    public volatile int f192992g;

    /* JADX INFO: renamed from: h */
    public volatile int f192993h;

    /* JADX INFO: renamed from: i */
    public volatile String f192994i;

    /* JADX INFO: renamed from: j */
    public volatile long f192995j;

    /* JADX INFO: renamed from: k */
    public volatile String f192996k;

    /* JADX INFO: renamed from: l */
    public volatile DeviceId f192997l;

    static {
        String canonicalName = qve.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = qve.class.getSimpleName();
        }
        f192985m = canonicalName;
    }

    public qve(AppDatabase appDatabase, BroadcastsDatabase broadcastsDatabase, l2f1 l2f1Var, SharedPreferences sharedPreferences, xd70 xd70Var) {
        this.f192986a = broadcastsDatabase;
        this.f192987b = l2f1Var;
        this.f192988c = sharedPreferences;
        this.f192989d = xd70Var;
        this.f192990e = appDatabase.mo2233z();
        this.f192991f = broadcastsDatabase.mo2228z();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m73983h(List list) {
        Long l;
        String str;
        if (list.isEmpty()) {
            return false;
        }
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pve pveVar = (pve) it.next();
            String str2 = pveVar.f181727c;
            if (str2 == null || str2.length() == 0 || (l = pveVar.f181728d) == null || l.longValue() == 0 || (str = pveVar.f181726b) == null || str.length() == 0) {
                return false;
            }
        }
        return true;
    }

    @Override // p204p.l2f1
    /* JADX INFO: renamed from: a */
    public final int mo57898a() {
        return this.f192987b.mo57898a();
    }

    @Override // p204p.clk0
    /* JADX INFO: renamed from: b */
    public final boolean mo33278b() {
        return this.f192988c.getLong("last-synchronization", 0L) == 0;
    }

    @Override // p204p.l2f1
    /* JADX INFO: renamed from: c */
    public final g2f1 mo57899c(String str) {
        return this.f192987b.mo57899c(str);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0133  */
    /* JADX WARN: Code duplicated, block: B:59:0x0134  */
    /* JADX WARN: Code duplicated, block: B:62:0x0157  */
    /* JADX WARN: Code duplicated, block: B:63:0x0158  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0172, code lost:
    
        if (m73988m(r9, r5, r6) == r8) goto L66;
     */
    @Override // p204p.clk0
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo33279d(Context context, List list, Long l, fbk fbkVar) {
        kve kveVar;
        List list2;
        Context context2;
        Long l2;
        Context context3;
        Long l3;
        List list3;
        long j;
        xue xueVar;
        Context context4;
        long j2;
        xue xueVar2;
        xue xueVar3;
        Long l4;
        int i;
        int i2;
        Long l5;
        String str = f192985m;
        if (fbkVar instanceof kve) {
            kveVar = (kve) fbkVar;
            int i3 = kveVar.f126839Y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kveVar.f126839Y = i3 - Integer.MIN_VALUE;
            } else {
                kveVar = new kve(this, (ibk) fbkVar);
            }
        } else {
            kveVar = new kve(this, (ibk) fbkVar);
        }
        kve kveVar2 = kveVar;
        Object objM73986k = kveVar2.f126849t;
        yuk yukVar = yuk.f276404a;
        int i4 = kveVar2.f126839Y;
        try {
            if (i4 == 0) {
                bga.m29073P(objM73986k);
                kveVar2.f126840a = context;
                list2 = list;
                kveVar2.f126841b = list2;
                kveVar2.f126842c = l;
                kveVar2.f126839Y = 1;
                if (m73984i(kveVar2) != yukVar) {
                    context2 = context;
                    l2 = l;
                }
                return yukVar;
            }
            if (i4 == 1) {
                Long l6 = kveVar2.f126842c;
                List list4 = kveVar2.f126841b;
                context2 = kveVar2.f126840a;
                bga.m29073P(objM73986k);
                l2 = l6;
                list2 = list4;
            } else {
                if (i4 == 2) {
                    j = kveVar2.f126845f;
                    l3 = kveVar2.f126842c;
                    list3 = kveVar2.f126841b;
                    context3 = kveVar2.f126840a;
                    bga.m29073P(objM73986k);
                    m73985j(context3, list3);
                    xueVar = xue.f266098a;
                    kveVar2.f126840a = context3;
                    kveVar2.f126841b = list3;
                    kveVar2.f126842c = l3;
                    kveVar2.f126843d = xueVar;
                    kveVar2.f126844e = xueVar;
                    kveVar2.f126845f = j;
                    kveVar2.f126846g = 200L;
                    kveVar2.f126847h = 0;
                    kveVar2.f126848i = 0;
                    kveVar2.f126839Y = 3;
                    if (njg1.m64619l(200L, kveVar2) == yukVar) {
                        context4 = context3;
                        j2 = 200;
                        xueVar2 = xueVar;
                        xueVar3 = xueVar2;
                        l4 = l3;
                        i = 0;
                        i2 = 0;
                        kveVar2.f126840a = context4;
                        kveVar2.f126841b = list3;
                        kveVar2.f126842c = l4;
                        kveVar2.f126843d = xueVar2;
                        kveVar2.f126844e = xueVar3;
                        kveVar2.f126845f = j;
                        kveVar2.f126846g = j2;
                        kveVar2.f126847h = i2;
                        kveVar2.f126848i = i;
                        kveVar2.f126839Y = 4;
                        objM73986k = m73986k(kveVar2);
                        if (objM73986k != yukVar) {
                            l5 = l4;
                            String[] strArr = (String[]) objM73986k;
                            m73989n(strArr);
                            kveVar2.f126840a = context4;
                            kveVar2.f126841b = list3;
                            kveVar2.f126842c = l5;
                            kveVar2.f126843d = strArr;
                            kveVar2.f126844e = null;
                            kveVar2.f126845f = j;
                            kveVar2.f126839Y = 5;
                        }
                    }
                    return yukVar;
                }
                if (i4 == 3) {
                    int i5 = kveVar2.f126848i;
                    int i6 = kveVar2.f126847h;
                    long j3 = kveVar2.f126846g;
                    long j4 = kveVar2.f126845f;
                    xueVar3 = kveVar2.f126844e;
                    xue xueVar4 = (xue) kveVar2.f126843d;
                    l4 = kveVar2.f126842c;
                    List list5 = kveVar2.f126841b;
                    Context context5 = kveVar2.f126840a;
                    bga.m29073P(objM73986k);
                    i = i5;
                    i2 = i6;
                    j = j4;
                    list3 = list5;
                    xueVar2 = xueVar4;
                    j2 = j3;
                    context4 = context5;
                    kveVar2.f126840a = context4;
                    kveVar2.f126841b = list3;
                    kveVar2.f126842c = l4;
                    kveVar2.f126843d = xueVar2;
                    kveVar2.f126844e = xueVar3;
                    kveVar2.f126845f = j;
                    kveVar2.f126846g = j2;
                    kveVar2.f126847h = i2;
                    kveVar2.f126848i = i;
                    kveVar2.f126839Y = 4;
                    objM73986k = m73986k(kveVar2);
                    if (objM73986k != yukVar) {
                        l5 = l4;
                        String[] strArr2 = (String[]) objM73986k;
                        m73989n(strArr2);
                        kveVar2.f126840a = context4;
                        kveVar2.f126841b = list3;
                        kveVar2.f126842c = l5;
                        kveVar2.f126843d = strArr2;
                        kveVar2.f126844e = null;
                        kveVar2.f126845f = j;
                        kveVar2.f126839Y = 5;
                    }
                    return yukVar;
                }
                if (i4 == 4) {
                    j = kveVar2.f126845f;
                    l5 = kveVar2.f126842c;
                    list3 = kveVar2.f126841b;
                    context4 = kveVar2.f126840a;
                    bga.m29073P(objM73986k);
                    String[] strArr3 = (String[]) objM73986k;
                    m73989n(strArr3);
                    kveVar2.f126840a = context4;
                    kveVar2.f126841b = list3;
                    kveVar2.f126842c = l5;
                    kveVar2.f126843d = strArr3;
                    kveVar2.f126844e = null;
                    kveVar2.f126845f = j;
                    kveVar2.f126839Y = 5;
                } else {
                    if (i4 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM73986k);
                }
            }
            return this.f192997l;
            long jLongValue = (l2 != null ? l2.longValue() : 0L) - 200;
            if (l2 == null) {
                jLongValue = 2000;
            } else {
                long j5 = 650;
                if (jLongValue >= 650) {
                    j5 = 5700;
                    if (jLongValue > 5700) {
                        jLongValue = j5;
                    }
                    return yukVar;
                }
                jLongValue = j5;
            }
            String str2 = "***Debug starting to bind services at: " + System.currentTimeMillis();
            utu0 utu0Var = gk71.f80747a;
            utu0Var.m83940H(str);
            utu0Var.m83952u(str2, new Object[0]);
            kveVar2.f126840a = context2;
            kveVar2.f126841b = list2;
            kveVar2.f126842c = l2;
            kveVar2.f126845f = jLongValue;
            kveVar2.f126839Y = 2;
            Context context6 = context2;
            long j6 = jLongValue;
            if (m73987l(context6, list2, j6, kveVar2) != yukVar) {
                context3 = context6;
                l3 = l2;
                list3 = list2;
                j = j6;
                m73985j(context3, list3);
                xueVar = xue.f266098a;
                kveVar2.f126840a = context3;
                kveVar2.f126841b = list3;
                kveVar2.f126842c = l3;
                kveVar2.f126843d = xueVar;
                kveVar2.f126844e = xueVar;
                kveVar2.f126845f = j;
                kveVar2.f126846g = 200L;
                kveVar2.f126847h = 0;
                kveVar2.f126848i = 0;
                kveVar2.f126839Y = 3;
                if (njg1.m64619l(200L, kveVar2) == yukVar) {
                    context4 = context3;
                    j2 = 200;
                    xueVar2 = xueVar;
                    xueVar3 = xueVar2;
                    l4 = l3;
                    i = 0;
                    i2 = 0;
                    kveVar2.f126840a = context4;
                    kveVar2.f126841b = list3;
                    kveVar2.f126842c = l4;
                    kveVar2.f126843d = xueVar2;
                    kveVar2.f126844e = xueVar3;
                    kveVar2.f126845f = j;
                    kveVar2.f126846g = j2;
                    kveVar2.f126847h = i2;
                    kveVar2.f126848i = i;
                    kveVar2.f126839Y = 4;
                    objM73986k = m73986k(kveVar2);
                    if (objM73986k != yukVar) {
                        l5 = l4;
                        String[] strArr4 = (String[]) objM73986k;
                        m73989n(strArr4);
                        kveVar2.f126840a = context4;
                        kveVar2.f126841b = list3;
                        kveVar2.f126842c = l5;
                        kveVar2.f126843d = strArr4;
                        kveVar2.f126844e = null;
                        kveVar2.f126845f = j;
                        kveVar2.f126839Y = 5;
                    }
                }
            }
            return yukVar;
        } catch (Exception e) {
            String strM38564m = edb.m38564m("***Debug error getting device id from device: ", e.getMessage());
            utu0 utu0Var2 = gk71.f80747a;
            utu0Var2.m83940H(str);
            utu0Var2.m83952u(strM38564m, new Object[0]);
            return null;
        }
    }

    @Override // p204p.l2f1
    /* JADX INFO: renamed from: e */
    public final void mo57900e(Context context, String str) {
        this.f192987b.mo57900e(context, str);
    }

    @Override // p204p.l2f1
    /* JADX INFO: renamed from: f */
    public final boolean mo57901f(String str) {
        return this.f192987b.mo57901f(str);
    }

    @Override // p204p.l2f1
    /* JADX INFO: renamed from: g */
    public final ServiceConnection mo57902g(String str) {
        return this.f192987b.mo57902g(str);
    }

    /* JADX INFO: renamed from: i */
    public final Object m73984i(kve kveVar) {
        Object objM65530p = nsf1.m65530p(kveVar, new C2126mg(17), this.f192991f.f286426a, false, true);
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (objM65530p != yukVar) {
            objM65530p = w2a1Var;
        }
        return objM65530p == yukVar ? objM65530p : w2a1Var;
    }

    /* JADX INFO: renamed from: j */
    public final void m73985j(Context context, List list) {
        l2f1 l2f1Var;
        String strM38561j = edb.m38561j(System.currentTimeMillis(), "***Debug starting to send request for ID at: ");
        utu0 utu0Var = gk71.f80747a;
        utu0Var.m83940H(f192985m);
        int i = 0;
        utu0Var.m83952u(strM38561j, new Object[0]);
        String packageName = context.getPackageName();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!wj50.m88271j(((ComponentName) obj).getPackageName(), packageName)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            l2f1Var = this.f192987b;
            if (i2 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i2);
            i2++;
            if (l2f1Var.mo57901f(((ComponentName) obj2).getPackageName())) {
                arrayList2.add(obj2);
            }
        }
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj3 = arrayList2.get(i);
            i++;
            g2f1 g2f1VarMo57899c = l2f1Var.mo57899c(((ComponentName) obj3).getPackageName());
            if (g2f1VarMo57899c != null) {
                g2f1VarMo57899c.mo43390l1(new jve(this));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX INFO: renamed from: k */
    public final Serializable m73986k(ibk ibkVar) {
        gve gveVar;
        qve qveVar;
        if (ibkVar instanceof gve) {
            gveVar = (gve) ibkVar;
            int i = gveVar.f84734d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gveVar.f84734d = i - Integer.MIN_VALUE;
            } else {
                gveVar = new gve(this, ibkVar);
            }
        } else {
            gveVar = new gve(this, ibkVar);
        }
        Object objM65530p = gveVar.f84732b;
        yuk yukVar = yuk.f276404a;
        int i2 = gveVar.f84734d;
        if (i2 == 0) {
            bga.m29073P(objM65530p);
            zue zueVar = this.f192991f;
            gveVar.f84731a = this;
            gveVar.f84734d = 1;
            objM65530p = nsf1.m65530p(gveVar, new C2126mg(18), zueVar.f286426a, true, false);
            if (objM65530p == yukVar) {
                return yukVar;
            }
            qveVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qveVar = gveVar.f84731a;
            bga.m29073P(objM65530p);
        }
        List list = (List) objM65530p;
        y1f1 y1f1VarM55167a = qveVar.f192990e.m55167a();
        String str = f192985m;
        utu0 utu0Var = gk71.f80747a;
        utu0Var.m83940H(str);
        utu0Var.m83952u("***Debug broadcasts: " + list, new Object[0]);
        String str2 = "***Debug broadcasts valid: " + m73983h(list);
        utu0Var.m83940H(str);
        utu0Var.m83952u(str2, new Object[0]);
        boolean zM73983h = m73983h(list);
        if (!zM73983h) {
            return new String[0];
        }
        if (!zM73983h) {
            throw new NoWhenBranchMatchedException();
        }
        List listM43711Y0 = g6f.m43711Y0(list, new ode(1));
        if (y1f1VarM55167a != null) {
            pve pveVar = (pve) listM43711Y0.get(0);
            if (!wj50.m88271j(pveVar.f181726b, y1f1VarM55167a.f268268i) || !wj50.m88271j(pveVar.f181727c, y1f1VarM55167a.f268261b)) {
                Long l = pveVar.f181728d;
                long jLongValue = l != null ? l.longValue() : 0L;
                Long l2 = y1f1VarM55167a.f268269j;
                if (jLongValue < (l2 != null ? l2.longValue() : 0L)) {
                    String str3 = pveVar.f181727c;
                    String str4 = y1f1VarM55167a.f268262c;
                    String str5 = y1f1VarM55167a.f268263d;
                    String str6 = y1f1VarM55167a.f268264e;
                    String str7 = y1f1VarM55167a.f268265f;
                    String str8 = y1f1VarM55167a.f268266g;
                    String str9 = y1f1VarM55167a.f268267h;
                    String str10 = pveVar.f181726b;
                    Long l3 = pveVar.f181728d;
                    y1f1 y1f1Var = new y1f1(str3, str4, str5, str6, str7, str8, str9, str10, Long.valueOf(l3 != null ? l3.longValue() : 0L), 1);
                    qveVar.f192997l = new DeviceId(y1f1Var);
                    k2f1 k2f1Var = qveVar.f192990e;
                    nsf1.m65528n(k2f1Var.f118621a, false, true, new hp91(3, k2f1Var, y1f1Var));
                }
            }
        }
        pve pveVar2 = (pve) listM43711Y0.get(0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM43711Y0) {
            pve pveVar3 = (pve) obj;
            if (!wj50.m88271j(pveVar3.f181728d, pveVar2.f181728d) || !wj50.m88271j(pveVar3.f181727c, pveVar2.f181727c) || !wj50.m88271j(pveVar3.f181726b, pveVar2.f181726b)) {
                arrayList.add(obj);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return new String[0];
        }
        qveVar.f192994i = pveVar2.f181727c;
        Long l4 = pveVar2.f181728d;
        qveVar.f192995j = l4 != null ? l4.longValue() : 0L;
        qveVar.f192996k = pveVar2.f181726b;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList2.add(((pve) obj2).f181726b);
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            if (((String) obj3) != null) {
                arrayList3.add(obj3);
            }
        }
        return (String[]) arrayList3.toArray(new String[0]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: l */
    public final Object m73987l(Context context, List list, long j, ibk ibkVar) throws NoSuchAlgorithmException {
        ive iveVar;
        Context context2 = context;
        long j2 = j;
        if (ibkVar instanceof ive) {
            iveVar = (ive) ibkVar;
            int i = iveVar.f106206f;
            if ((i & Integer.MIN_VALUE) != 0) {
                iveVar.f106206f = i - Integer.MIN_VALUE;
            } else {
                iveVar = new ive(this, ibkVar);
            }
        } else {
            iveVar = new ive(this, ibkVar);
        }
        Object obj = iveVar.f106204d;
        yuk yukVar = yuk.f276404a;
        int i2 = iveVar.f106206f;
        if (i2 == 0) {
            bga.m29073P(obj);
            try {
                lve lveVar = new lve(this, context2, list, null);
                iveVar.f106201a = context2;
                iveVar.f106202b = list;
                iveVar.f106203c = j2;
                iveVar.f106206f = 1;
                if (s1h1.m76978s(j2, lveVar, iveVar) == yukVar) {
                    return yukVar;
                }
            } catch (TimeoutCancellationException e) {
                e = e;
                this.f192993h = this.f192987b.mo57898a();
                if (this.f192993h == 0 && j2 >= 5000) {
                    DeviceId.INSTANCE.lpt2(context2);
                    ((z2f1) this.f192989d).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", null, new ErrorMetadata(Error.TOO_YOUNG_FIELD_NUMBER, "Initialization", "Binding to server app timed out", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                }
                String str = f192985m;
                String strM38564m = edb.m38564m("Timeout binding services: ", e.getMessage());
                utu0 utu0Var = gk71.f80747a;
                utu0Var.m83940H(str);
                utu0Var.m83942J(strM38564m, new Object[0]);
                String str2 = "***Debug binding process has reached timeout: " + e.getMessage();
                utu0Var.m83940H(str);
                utu0Var.m83952u(str2, new Object[0]);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = iveVar.f106203c;
            Context context3 = iveVar.f106201a;
            try {
                bga.m29073P(obj);
            } catch (TimeoutCancellationException e2) {
                e = e2;
                context2 = context3;
                j2 = j3;
                this.f192993h = this.f192987b.mo57898a();
                if (this.f192993h == 0) {
                    DeviceId.INSTANCE.lpt2(context2);
                    ((z2f1) this.f192989d).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", null, new ErrorMetadata(Error.TOO_YOUNG_FIELD_NUMBER, "Initialization", "Binding to server app timed out", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                }
                String str3 = f192985m;
                String strM38564m2 = edb.m38564m("Timeout binding services: ", e.getMessage());
                utu0 utu0Var2 = gk71.f80747a;
                utu0Var2.m83940H(str3);
                utu0Var2.m83942J(strM38564m2, new Object[0]);
                String str4 = "***Debug binding process has reached timeout: " + e.getMessage();
                utu0Var2.m83940H(str3);
                utu0Var2.m83952u(str4, new Object[0]);
            }
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: m */
    public final Object m73988m(Context context, List list, kve kveVar) {
        String str = f192985m;
        utu0 utu0Var = gk71.f80747a;
        utu0Var.m83940H(str);
        utu0Var.m83952u("***Debug DeviceIdServiceHelper cleanup ", new Object[0]);
        String str2 = "***Debug components size: " + list.size();
        utu0Var.m83940H(str);
        utu0Var.m83952u(str2, new Object[0]);
        String str3 = "***Debug valid services count: " + this.f192993h;
        utu0Var.m83940H(str);
        utu0Var.m83952u(str3, new Object[0]);
        if (mo33278b() && (list.size() == 1 || this.f192993h >= 1)) {
            this.f192988c.edit().putLong("last-synchronization", System.currentTimeMillis()).apply();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo57900e(context, ((ComponentName) it.next()).getPackageName());
        }
        this.f192992g = 0;
        Object objM73984i = m73984i(kveVar);
        return objM73984i == yuk.f276404a ? objM73984i : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: n */
    public final void m73989n(String[] strArr) {
        String str = f192985m;
        String str2 = "***Debug toUpdate list: " + bk5.m29620k1(strArr);
        utu0 utu0Var = gk71.f80747a;
        utu0Var.m83940H(str);
        utu0Var.m83952u(str2, new Object[0]);
        if (this.f192994i == null || this.f192995j == 0 || this.f192996k == null || strArr.length == 0) {
            return;
        }
        o6r o6rVar = new o6r();
        o6rVar.f162404b = this.f192994i;
        o6rVar.f162405c = this.f192995j;
        o6rVar.f162403a = this.f192996k;
        for (String str3 : strArr) {
            g2f1 g2f1VarMo57899c = this.f192987b.mo57899c(str3);
            boolean zMo57901f = this.f192987b.mo57901f(str3);
            Boolean boolValueOf = Boolean.valueOf(zMo57901f);
            if (!zMo57901f) {
                boolValueOf = null;
            }
            if (boolValueOf != null && g2f1VarMo57899c != null) {
                g2f1VarMo57899c.mo43389X0(o6rVar);
            }
        }
    }
}
