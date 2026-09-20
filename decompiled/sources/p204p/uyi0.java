package p204p;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class uyi0 {

    /* JADX INFO: renamed from: A */
    public int f235261A;

    /* JADX INFO: renamed from: B */
    public final ArrayList f235262B;

    /* JADX INFO: renamed from: C */
    public final wg61 f235263C;

    /* JADX INFO: renamed from: D */
    public final hb11 f235264D;

    /* JADX INFO: renamed from: a */
    public final Context f235265a;

    /* JADX INFO: renamed from: b */
    public final Activity f235266b;

    /* JADX INFO: renamed from: c */
    public ryi0 f235267c;

    /* JADX INFO: renamed from: d */
    public Bundle f235268d;

    /* JADX INFO: renamed from: e */
    public Parcelable[] f235269e;

    /* JADX INFO: renamed from: f */
    public boolean f235270f;

    /* JADX INFO: renamed from: g */
    public final hj5 f235271g;

    /* JADX INFO: renamed from: h */
    public final zv41 f235272h;

    /* JADX INFO: renamed from: i */
    public final zv41 f235273i;

    /* JADX INFO: renamed from: j */
    public final nuu0 f235274j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashMap f235275k;

    /* JADX INFO: renamed from: l */
    public final LinkedHashMap f235276l;

    /* JADX INFO: renamed from: m */
    public final LinkedHashMap f235277m;

    /* JADX INFO: renamed from: n */
    public final LinkedHashMap f235278n;

    /* JADX INFO: renamed from: o */
    public hc80 f235279o;

    /* JADX INFO: renamed from: p */
    public dyi0 f235280p;

    /* JADX INFO: renamed from: q */
    public final CopyOnWriteArrayList f235281q;

    /* JADX INFO: renamed from: r */
    public fb80 f235282r;

    /* JADX INFO: renamed from: s */
    public final C2531wf f235283s;

    /* JADX INFO: renamed from: t */
    public final lx9 f235284t;

    /* JADX INFO: renamed from: u */
    public final boolean f235285u;

    /* JADX INFO: renamed from: v */
    public final eaj0 f235286v;

    /* JADX INFO: renamed from: w */
    public final LinkedHashMap f235287w;

    /* JADX INFO: renamed from: x */
    public qe70 f235288x;

    /* JADX INFO: renamed from: y */
    public ayi0 f235289y;

    /* JADX INFO: renamed from: z */
    public final LinkedHashMap f235290z;

    public uyi0(Context context) {
        this.f235265a = context;
        for (Object obj : btz0.m30487K(context, pni0.f179388M0)) {
            if (((Context) obj) instanceof Activity) {
                this.f235266b = (Activity) obj;
                this.f235271g = new hj5();
                lau lauVar = lau.f131415a;
                this.f235272h = jag1.m52819d(lauVar);
                zv41 zv41VarM52819d = jag1.m52819d(lauVar);
                this.f235273i = zv41VarM52819d;
                this.f235274j = bzf1.m31021m(zv41VarM52819d);
                this.f235275k = new LinkedHashMap();
                this.f235276l = new LinkedHashMap();
                this.f235277m = new LinkedHashMap();
                this.f235278n = new LinkedHashMap();
                this.f235281q = new CopyOnWriteArrayList();
                this.f235282r = fb80.f67751b;
                this.f235283s = new C2531wf(this, 4);
                this.f235284t = new lx9(this, false, 16);
                this.f235285u = true;
                eaj0 eaj0Var = new eaj0();
                this.f235286v = eaj0Var;
                this.f235287w = new LinkedHashMap();
                this.f235290z = new LinkedHashMap();
                eaj0Var.m38301a(new tyi0(eaj0Var));
                eaj0Var.m38301a(new qf0(this.f235265a));
                this.f235262B = new ArrayList();
                this.f235263C = new wg61(new w0i0(this, 24));
                this.f235264D = j0g1.m52092t(1, 0, 2, 2);
            }
        }
        obj = null;
        this.f235266b = (Activity) obj;
        this.f235271g = new hj5();
        lau lauVar2 = lau.f131415a;
        this.f235272h = jag1.m52819d(lauVar2);
        zv41 zv41VarM52819d2 = jag1.m52819d(lauVar2);
        this.f235273i = zv41VarM52819d2;
        this.f235274j = bzf1.m31021m(zv41VarM52819d2);
        this.f235275k = new LinkedHashMap();
        this.f235276l = new LinkedHashMap();
        this.f235277m = new LinkedHashMap();
        this.f235278n = new LinkedHashMap();
        this.f235281q = new CopyOnWriteArrayList();
        this.f235282r = fb80.f67751b;
        this.f235283s = new C2531wf(this, 4);
        this.f235284t = new lx9(this, false, 16);
        this.f235285u = true;
        eaj0 eaj0Var2 = new eaj0();
        this.f235286v = eaj0Var2;
        this.f235287w = new LinkedHashMap();
        this.f235290z = new LinkedHashMap();
        eaj0Var2.m38301a(new tyi0(eaj0Var2));
        eaj0Var2.m38301a(new qf0(this.f235265a));
        this.f235262B = new ArrayList();
        this.f235263C = new wg61(new w0i0(this, 24));
        this.f235264D = j0g1.m52092t(1, 0, 2, 2);
    }

    /* JADX INFO: renamed from: g */
    public static jyi0 m84241g(jyi0 jyi0Var, int i, boolean z) {
        ryi0 ryi0Var;
        if (jyi0Var.f117421h == i) {
            return jyi0Var;
        }
        if (jyi0Var instanceof ryi0) {
            ryi0Var = (ryi0) jyi0Var;
        } else {
            ryi0Var = jyi0Var.f117415b;
            wj50.m88279p(ryi0Var);
        }
        return ryi0Var.m76728q(i, ryi0Var, z);
    }

    /* JADX INFO: renamed from: s */
    public static void m84242s(uyi0 uyi0Var, dge1 dge1Var) {
        uyi0Var.getClass();
        Class<?> cls = dge1Var.getClass();
        jqv0 jqv0Var = qpv0.f191387a;
        int iM43458q = g391.m43458q(qjg1.m72925q(jqv0Var.mo54112b(cls)));
        ryi0 ryi0Var = uyi0Var.f235267c;
        if (ryi0Var == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        jyi0 jyi0VarM84241g = m84241g(ryi0Var, iM43458q, true);
        if (jyi0VarM84241g == null) {
            throw new IllegalArgumentException(("Destination with route " + jqv0Var.mo54112b(dge1Var.getClass()).mo29111F() + " cannot be found in navigation graph " + uyi0Var.f235267c).toString());
        }
        Map mapM56706s0 = kkc0.m56706s0(jyi0VarM84241g.f117420g);
        LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(mapM56706s0.size()));
        for (Map.Entry entry : mapM56706s0.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((qxi0) entry.getValue()).f193681a);
        }
        uyi0Var.m84264q(g391.m43459r(dge1Var, linkedHashMap));
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m84243w(uyi0 uyi0Var, uxi0 uxi0Var) {
        uyi0Var.m84268v(uxi0Var, false, new hj5());
    }

    /* JADX INFO: renamed from: A */
    public final Bundle m84244A() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : kkc0.m56706s0(this.f235286v.f57689a).entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo25259h = ((aaj0) entry.getValue()).mo25259h();
            if (bundleMo25259h != null) {
                arrayList.add(str);
                bundle2.putBundle(str, bundleMo25259h);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        hj5 hj5Var = this.f235271g;
        if (!hj5Var.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[hj5Var.f91964c];
            Iterator<E> it = hj5Var.iterator();
            int i = 0;
            while (it.hasNext()) {
                parcelableArr[i] = new wxi0((uxi0) it.next());
                i++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = this.f235277m;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i2 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str2 = (String) entry2.getValue();
                iArr[i2] = iIntValue;
                arrayList2.add(str2);
                i2++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = this.f235278n;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str3 = (String) entry3.getKey();
                hj5 hj5Var2 = (hj5) entry3.getValue();
                arrayList3.add(str3);
                Parcelable[] parcelableArr2 = new Parcelable[hj5Var2.f91964c];
                int i3 = 0;
                for (Object obj : hj5Var2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    parcelableArr2[i3] = (wxi0) obj;
                    i3 = i4;
                }
                bundle.putParcelableArray(edb.m38564m("android-support-nav:controller:backStackStates:", str3), parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.f235270f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f235270f);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: B */
    public final void m84245B(ryi0 ryi0Var) {
        m84246C(ryi0Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v13, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, p.ryi0] */
    /* JADX WARN: Type inference failed for: r13v9, types: [int] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r21v0, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Object, p.uyi0] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v20, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, p.ryi0] */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.os.Parcelable[], java.lang.Object, p.ezi0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r7v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v18, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [android.os.Bundle[]] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: C */
    public final void m84246C(ryi0 ryi0Var, Bundle bundle) {
        LinkedHashMap linkedHashMap;
        ?? r3;
        Context context;
        LinkedHashMap linkedHashMap2;
        Activity activity;
        Intent intent;
        ?? intArray;
        ?? r6;
        ryi0 ryi0VarM84260m;
        hyi0 hyi0VarM76729r;
        ?? r7;
        ?? r8;
        ?? M87841o;
        ?? r9;
        ?? r10;
        ?? r2;
        jyi0 jyi0VarM76728q;
        ?? r20;
        ryi0 ryi0Var2;
        Bundle bundle2;
        ?? M76728q;
        ?? M76728q2;
        ryi0 ryi0Var3;
        ryi0 ryi0Var4;
        Bundle bundle3;
        ?? r15;
        ArrayList<String> stringArrayList;
        mw31 mw31Var = ryi0Var.f203927Y;
        boolean zM88271j = wj50.m88271j(this.f235267c, ryi0Var);
        hj5<uxi0> hj5Var = this.f235271g;
        if (zM88271j) {
            int iM62986h = mw31Var.m62986h();
            for (int i = 0; i < iM62986h; i++) {
                jyi0 jyi0Var = (jyi0) mw31Var.m62987i(i);
                ryi0 ryi0Var5 = this.f235267c;
                wj50.m88279p(ryi0Var5);
                int iM62984e = ryi0Var5.f203927Y.m62984e(i);
                ryi0 ryi0Var6 = this.f235267c;
                wj50.m88279p(ryi0Var6);
                mw31 mw31Var2 = ryi0Var6.f203927Y;
                if (mw31Var2.f147708a) {
                    fag1.m41162k(mw31Var2);
                }
                int iM41459g = fem.m41459g(mw31Var2.f147711d, iM62984e, mw31Var2.f147709b);
                if (iM41459g >= 0) {
                    Object[] objArr = mw31Var2.f147710c;
                    Object obj = objArr[iM41459g];
                    objArr[iM41459g] = jyi0Var;
                }
            }
            for (uxi0 uxi0Var : hj5Var) {
                int i2 = jyi0.f117413X;
                mdx0 mdx0Var = new mdx0(btz0.m30496T(btz0.m30487K(uxi0Var.f234936b, pni0.f179392Q0)));
                jyi0 jyi0VarM76728q2 = this.f235267c;
                wj50.m88279p(jyi0VarM76728q2);
                Iterator it = mdx0Var.iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((kdx0) it).f121747b;
                    if (listIterator.hasPrevious()) {
                        jyi0 jyi0Var2 = (jyi0) listIterator.previous();
                        if (!wj50.m88271j(jyi0Var2, this.f235267c) || !wj50.m88271j(jyi0VarM76728q2, ryi0Var)) {
                            if (jyi0VarM76728q2 instanceof ryi0) {
                                ryi0 ryi0Var7 = (ryi0) jyi0VarM76728q2;
                                jyi0VarM76728q2 = ryi0Var7.m76728q(jyi0Var2.f117421h, ryi0Var7, false);
                                wj50.m88279p(jyi0VarM76728q2);
                            }
                        }
                    }
                }
                uxi0Var.f234936b = jyi0VarM76728q2;
            }
            return;
        }
        ryi0 ryi0Var8 = this.f235267c;
        LinkedHashMap linkedHashMap3 = this.f235287w;
        ?? r11 = 1;
        Bundle bundle4 = null;
        if (ryi0Var8 != null) {
            Iterator it2 = new ArrayList(this.f235277m.keySet()).iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Integer) it2.next()).intValue();
                Iterator it3 = linkedHashMap3.values().iterator();
                while (it3.hasNext()) {
                    ((zxi0) it3.next()).f287330d = true;
                }
                Bundle bundle5 = bundle4;
                LinkedHashMap linkedHashMap4 = linkedHashMap3;
                boolean zM84271z = m84271z(iIntValue, bundle5, new ezi0(false, true, -1, false, false, -1, -1, -1, -1));
                Iterator it4 = linkedHashMap4.values().iterator();
                while (it4.hasNext()) {
                    ((zxi0) it4.next()).f287330d = false;
                }
                if (zM84271z) {
                    m84267u(iIntValue, true, false);
                }
                bundle4 = bundle5;
                linkedHashMap3 = linkedHashMap4;
            }
            linkedHashMap = linkedHashMap3;
            r3 = bundle4;
            m84267u(ryi0Var8.f117421h, true, false);
        } else {
            linkedHashMap = linkedHashMap3;
            r3 = 0;
        }
        this.f235267c = ryi0Var;
        Bundle bundle6 = this.f235268d;
        eaj0 eaj0Var = this.f235286v;
        if (bundle6 != null && (stringArrayList = bundle6.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            for (String str : stringArrayList) {
                aaj0 aaj0VarM38302b = eaj0Var.m38302b(str);
                Bundle bundle7 = bundle6.getBundle(str);
                if (bundle7 != null) {
                    aaj0VarM38302b.mo25258g(bundle7);
                }
            }
        }
        Parcelable[] parcelableArr = this.f235269e;
        Context context2 = this.f235265a;
        if (parcelableArr != null) {
            int length = parcelableArr.length;
            int i3 = 0;
            while (i3 < length) {
                wxi0 wxi0Var = (wxi0) parcelableArr[i3];
                int i4 = wxi0Var.f256043b;
                int i5 = i3;
                jyi0 jyi0VarM84254f = m84254f(i4);
                if (jyi0VarM84254f == null) {
                    int i6 = jyi0.f117413X;
                    StringBuilder sbM38572u = edb.m38572u("Restoring the Navigation back stack failed: destination ", wdg1.m87841o(context2, i4), " cannot be found from the current destination ");
                    sbM38572u.append(m84256i());
                    throw new IllegalStateException(sbM38572u.toString());
                }
                fb80 fb80VarM84257j = m84257j();
                dyi0 dyi0Var = this.f235280p;
                Bundle bundle8 = wxi0Var.f256044c;
                if (bundle8 != null) {
                    bundle8.setClassLoader(context2.getClassLoader());
                    r15 = bundle8;
                } else {
                    r15 = r3;
                }
                int i7 = length;
                uxi0 uxi0Var2 = new uxi0(context2, jyi0VarM84254f, r15, fb80VarM84257j, dyi0Var, wxi0Var.f256042a, wxi0Var.f256045d);
                Context context3 = context2;
                aaj0 aaj0VarM38302b2 = eaj0Var.m38302b(jyi0VarM84254f.f117414a);
                LinkedHashMap linkedHashMap5 = linkedHashMap;
                Object zxi0Var = linkedHashMap5.get(aaj0VarM38302b2);
                if (zxi0Var == null) {
                    zxi0Var = new zxi0(this, aaj0VarM38302b2);
                    linkedHashMap5.put(aaj0VarM38302b2, zxi0Var);
                }
                hj5Var.addLast(uxi0Var2);
                ((zxi0) zxi0Var).m97200a(uxi0Var2);
                ryi0 ryi0Var9 = uxi0Var2.f234936b.f117415b;
                if (ryi0Var9 != null) {
                    m84262o(uxi0Var2, m84255h(ryi0Var9.f117421h));
                }
                linkedHashMap = linkedHashMap5;
                context2 = context3;
                length = i7;
                i3 = i5 + 1;
            }
            context = context2;
            linkedHashMap2 = linkedHashMap;
            m84251H();
            this.f235269e = r3;
        } else {
            context = context2;
            linkedHashMap2 = linkedHashMap;
        }
        Collection collectionValues = kkc0.m56706s0(eaj0Var.f57689a).values();
        ArrayList<aaj0> arrayList = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (!((aaj0) obj2).f13857b) {
                arrayList.add(obj2);
            }
        }
        for (aaj0 aaj0Var : arrayList) {
            Object zxi0Var2 = linkedHashMap2.get(aaj0Var);
            if (zxi0Var2 == null) {
                zxi0Var2 = new zxi0(this, aaj0Var);
                linkedHashMap2.put(aaj0Var, zxi0Var2);
            }
            aaj0Var.mo25256e((zxi0) zxi0Var2);
        }
        if (this.f235267c == null || !hj5Var.isEmpty()) {
            m84253e();
            return;
        }
        if (!this.f235270f && (activity = this.f235266b) != null && (intent = activity.getIntent()) != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                } catch (Exception unused) {
                    intent.toString();
                    intArray = r3;
                }
            } else {
                intArray = r3;
            }
            ?? parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : r3;
            ?? bundle9 = new Bundle();
            if (extras != null) {
                bundle3 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
            } else {
                r6 = r3;
            }
            if (r6 != 0) {
                r6 = bundle3;
                bundle9.putAll(r6);
            }
            if ((intArray == 0 || intArray.length == 0) && (hyi0VarM76729r = (ryi0VarM84260m = m84260m(hj5Var)).m76729r(new oge0(intent), true, ryi0VarM84260m)) != null) {
                jyi0 jyi0Var3 = hyi0VarM76729r.f96591a;
                hj5 hj5Var2 = new hj5();
                jyi0 jyi0Var4 = jyi0Var3;
                while (true) {
                    ryi0 ryi0Var10 = jyi0Var4.f117415b;
                    if (ryi0Var10 == null || ryi0Var10.f203928Z != jyi0Var4.f117421h) {
                        hj5Var2.addFirst(jyi0Var4);
                    }
                    if (wj50.m88271j(ryi0Var10, r3) || ryi0Var10 == null) {
                        break;
                    } else {
                        jyi0Var4 = ryi0Var10;
                    }
                }
                List listM43728j1 = g6f.m43728j1(hj5Var2);
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(listM43728j1, 10));
                Iterator it5 = listM43728j1.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(Integer.valueOf(((jyi0) it5.next()).f117421h));
                }
                int[] iArrM43726i1 = g6f.m43726i1(arrayList2);
                Bundle bundleM54791b = jyi0Var3.m54791b(hyi0VarM76729r.f96592b);
                if (bundleM54791b != null) {
                    bundle9.putAll(bundleM54791b);
                }
                r7 = iArrM43726i1;
                r8 = r3;
            } else {
                r7 = intArray;
                r8 = parcelableArrayList;
            }
            if (r7 != 0 && r7.length != 0) {
                ryi0 ryi0Var11 = this.f235267c;
                int length2 = r7.length;
                ?? r12 = ryi0Var11;
                int i8 = 0;
                while (true) {
                    if (i8 >= length2) {
                        M87841o = r3;
                        break;
                    }
                    ?? r13 = r7[i8];
                    if (i8 == 0) {
                        ryi0 ryi0Var12 = this.f235267c;
                        wj50.m88279p(ryi0Var12);
                        if (ryi0Var12.f117421h == r13) {
                            ryi0Var4 = this.f235267c;
                        } else {
                            M76728q = r3;
                        }
                    } else {
                        wj50.m88279p(r12);
                        M76728q = r12.m76728q(r13, r12, false);
                    }
                    if (M76728q == 0) {
                        M76728q = ryi0Var4;
                        int i9 = jyi0.f117413X;
                        M87841o = wdg1.m87841o(context, r13);
                        break;
                    }
                    if (i8 == r7.length - 1) {
                        M76728q = ryi0Var4;
                    } else if (M76728q instanceof ryi0) {
                        while (true) {
                            M76728q = ryi0Var4;
                            M76728q2 = M76728q;
                            ryi0Var3 = (ryi0) M76728q2;
                            wj50.m88279p(ryi0Var3);
                            if (!(ryi0Var3.m76728q(ryi0Var3.f203928Z, ryi0Var3, false) instanceof ryi0)) {
                                break;
                            } else {
                                M76728q2 = ryi0Var3.m76728q(ryi0Var3.f203928Z, ryi0Var3, false);
                            }
                        }
                        r12 = ryi0Var3;
                    } else {
                        M76728q = ryi0Var4;
                        M76728q2 = M76728q;
                    }
                    i8++;
                    r12 = r12;
                }
                if (M87841o == 0) {
                    bundle9.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                    int length3 = r7.length;
                    ?? r14 = new Bundle[length3];
                    for (int i10 = 0; i10 < length3; i10++) {
                        ?? bundle10 = new Bundle();
                        bundle10.putAll(bundle9);
                        if (r8 != 0 && (bundle2 = (Bundle) r8.get(i10)) != null) {
                            bundle10.putAll(bundle2);
                        }
                        r14[i10] = bundle10;
                    }
                    int flags = intent.getFlags();
                    int i11 = 268435456 & flags;
                    if (i11 != 0 && (flags & 32768) == 0) {
                        intent.addFlags(32768);
                        g741 g741Var = new g741(context);
                        ComponentName component = intent.getComponent();
                        if (component == null) {
                            component = intent.resolveActivity(((Context) g741Var.f77178c).getPackageManager());
                        }
                        if (component != null) {
                            g741Var.m43796a(component);
                        }
                        ((ArrayList) g741Var.f77177b).add(intent);
                        g741Var.m43798e();
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                        return;
                    }
                    if (i11 != 0) {
                        if (!hj5Var.isEmpty()) {
                            ryi0 ryi0Var13 = this.f235267c;
                            wj50.m88279p(ryi0Var13);
                            m84267u(ryi0Var13.f117421h, true, false);
                        }
                        int i12 = 0;
                        while (i12 < r7.length) {
                            ?? r4 = r7[i12];
                            int i13 = i12 + 1;
                            ?? r5 = r14[i12];
                            jyi0 jyi0VarM84254f2 = m84254f(r4);
                            if (jyi0VarM84254f2 == null) {
                                int i14 = jyi0.f117413X;
                                StringBuilder sbM38572u2 = edb.m38572u("Deep Linking failed: destination ", wdg1.m87841o(context, r4), " cannot be found from the current destination ");
                                sbM38572u2.append(m84256i());
                                throw new IllegalStateException(sbM38572u2.toString());
                            }
                            sxh0 sxh0Var = new sxh0(7, jyi0VarM84254f2, this);
                            fzi0 fzi0Var = new fzi0();
                            sxh0Var.invoke(fzi0Var);
                            dzi0 dzi0Var = fzi0Var.f75027a;
                            dzi0Var.f54675a = false;
                            dzi0Var.f54676b = false;
                            int i15 = fzi0Var.f75028b;
                            boolean z = fzi0Var.f75029c;
                            dzi0Var.f54677c = i15;
                            dzi0Var.f54678d = false;
                            dzi0Var.f54679e = z;
                            m84265r(jyi0VarM84254f2, r5, dzi0Var.m37469a());
                            i12 = i13;
                        }
                        this.f235270f = true;
                        return;
                    }
                    ryi0 ryi0Var14 = this.f235267c;
                    int length4 = r7.length;
                    int i16 = 0;
                    while (i16 < length4) {
                        ?? r16 = r10[i16];
                        ?? r17 = r9[i16];
                        if (i16 == 0) {
                            jyi0VarM76728q = this.f235267c;
                        } else {
                            wj50.m88279p(r2);
                            jyi0VarM76728q = r2.m76728q(r16, r2, false);
                        }
                        if (jyi0VarM76728q == null) {
                            r2 = ryi0Var14;
                            r10 = r7;
                            r9 = r14;
                            r2 = ryi0Var14;
                            r10 = r7;
                            r9 = r14;
                            int i17 = jyi0.f117413X;
                            throw new IllegalStateException("Deep Linking failed: destination " + wdg1.m87841o(context, r16) + " cannot be found in graph " + r2);
                        }
                        r2 = ryi0Var14;
                        r10 = r7;
                        r9 = r14;
                        if (i16 == r10.length - r11) {
                            r2 = ryi0Var14;
                            r10 = r7;
                            r9 = r14;
                            ryi0 ryi0Var15 = this.f235267c;
                            wj50.m88279p(ryi0Var15);
                            r20 = r10;
                            m84265r(jyi0VarM76728q, r17, new ezi0(false, false, ryi0Var15.f117421h, true, false, 0, 0, -1, -1));
                        } else if (jyi0VarM76728q instanceof ryi0) {
                            while (true) {
                                r2 = ryi0Var14;
                                r10 = r7;
                                r9 = r14;
                                ryi0Var2 = (ryi0) jyi0VarM76728q;
                                wj50.m88279p(ryi0Var2);
                                if (!(ryi0Var2.m76728q(ryi0Var2.f203928Z, ryi0Var2, false) instanceof ryi0)) {
                                    break;
                                } else {
                                    jyi0VarM76728q = ryi0Var2.m76728q(ryi0Var2.f203928Z, ryi0Var2, false);
                                }
                            }
                            r20 = r10;
                            r2 = ryi0Var2;
                        } else {
                            r2 = ryi0Var14;
                            r10 = r7;
                            r9 = r14;
                            r20 = r10;
                        }
                        i16++;
                        length4 = length4;
                        r9 = r9;
                        r10 = r20;
                        r11 = 1;
                        r2 = r2;
                    }
                    r2 = ryi0Var14;
                    r10 = r7;
                    r9 = r14;
                    this.f235270f = r11;
                    return;
                }
                intent.toString();
            }
        }
        ryi0 ryi0Var16 = this.f235267c;
        wj50.m88279p(ryi0Var16);
        m84265r(ryi0Var16, bundle, r3);
    }

    /* JADX INFO: renamed from: D */
    public final void m84247D(hc80 hc80Var) {
        gb80 lifecycle;
        if (hc80Var.equals(this.f235279o)) {
            return;
        }
        hc80 hc80Var2 = this.f235279o;
        C2531wf c2531wf = this.f235283s;
        if (hc80Var2 != null && (lifecycle = hc80Var2.getLifecycle()) != null) {
            lifecycle.mo31988d(c2531wf);
        }
        this.f235279o = hc80Var;
        hc80Var.getLifecycle().mo31986a(c2531wf);
    }

    /* JADX INFO: renamed from: E */
    public final void m84248E(hjc1 hjc1Var) {
        mic1 mic1VarMo24736b;
        mic1 mic1VarMo24736b2;
        dlr0 dlr0Var = dlr0.f50329W0;
        dyi0 dyi0Var = this.f235280p;
        cdl cdlVar = cdl.f36908b;
        jqv0 jqv0Var = qpv0.f191387a;
        up60 up60VarMo54112b = jqv0Var.mo54112b(dyi0.class);
        String strMo29110D = up60VarMo54112b.mo29110D();
        if (strMo29110D == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo29110D);
        mic1 mic1VarM47682b = hjc1Var.m47682b(strConcat);
        boolean zMo29118z = up60VarMo54112b.mo29118z(mic1VarM47682b);
        o7a0 o7a0Var = dyi0.f54368c;
        if (!zMo29118z) {
            koi0 koi0Var = new koi0(cdlVar);
            koi0Var.m56998a(dlr0Var, strConcat);
            try {
                try {
                    mic1VarMo24736b2 = o7a0Var.mo83046a(up60VarMo54112b, koi0Var);
                } catch (AbstractMethodError unused) {
                    mic1VarMo24736b2 = o7a0Var.mo28672c(((ife) up60VarMo54112b).mo28587A(), koi0Var);
                }
            } catch (AbstractMethodError unused2) {
                mic1VarMo24736b2 = o7a0Var.mo24736b(((ife) up60VarMo54112b).mo28587A());
            }
            mic1VarM47682b = mic1VarMo24736b2;
            hjc1Var.m47683c(strConcat, mic1VarM47682b);
        }
        if (wj50.m88271j(dyi0Var, (dyi0) mic1VarM47682b)) {
            return;
        }
        if (!this.f235271g.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        up60 up60VarMo54112b2 = jqv0Var.mo54112b(dyi0.class);
        String strMo29110D2 = up60VarMo54112b2.mo29110D();
        if (strMo29110D2 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String strConcat2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo29110D2);
        mic1 mic1VarM47682b2 = hjc1Var.m47682b(strConcat2);
        if (!up60VarMo54112b2.mo29118z(mic1VarM47682b2)) {
            koi0 koi0Var2 = new koi0(cdlVar);
            koi0Var2.m56998a(dlr0Var, strConcat2);
            try {
                try {
                    mic1VarMo24736b = o7a0Var.mo83046a(up60VarMo54112b2, koi0Var2);
                } catch (AbstractMethodError unused3) {
                    mic1VarMo24736b = o7a0Var.mo28672c(((ife) up60VarMo54112b2).mo28587A(), koi0Var2);
                }
            } catch (AbstractMethodError unused4) {
                mic1VarMo24736b = o7a0Var.mo24736b(((ife) up60VarMo54112b2).mo28587A());
            }
            mic1VarM47682b2 = mic1VarMo24736b;
            hjc1Var.m47683c(strConcat2, mic1VarM47682b2);
        }
        this.f235280p = (dyi0) mic1VarM47682b2;
    }

    /* JADX INFO: renamed from: F */
    public final void m84249F(uxi0 uxi0Var) {
        uxi0 uxi0Var2 = (uxi0) this.f235275k.remove(uxi0Var);
        if (uxi0Var2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f235276l;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(uxi0Var2);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            zxi0 zxi0Var = (zxi0) this.f235287w.get(this.f235286v.m38302b(uxi0Var2.f234936b.f117414a));
            if (zxi0Var != null) {
                zxi0Var.m97201b(uxi0Var2);
            }
            linkedHashMap.remove(uxi0Var2);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m84250G() {
        AtomicInteger atomicInteger;
        nuu0 nuu0Var;
        Set set;
        ArrayList<uxi0> arrayList = new ArrayList(this.f235271g);
        if (arrayList.isEmpty()) {
            return;
        }
        jyi0 jyi0Var = ((uxi0) g6f.m43687A0(arrayList)).f234936b;
        ArrayList arrayList2 = new ArrayList();
        if (jyi0Var instanceof diz) {
            Iterator it = g6f.m43704R0(arrayList).iterator();
            while (it.hasNext()) {
                jyi0 jyi0Var2 = ((uxi0) it.next()).f234936b;
                arrayList2.add(jyi0Var2);
                if (!(jyi0Var2 instanceof diz) && !(jyi0Var2 instanceof ryi0)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (uxi0 uxi0Var : g6f.m43704R0(arrayList)) {
            fb80 fb80Var = uxi0Var.f234933Y;
            jyi0 jyi0Var3 = uxi0Var.f234936b;
            fb80 fb80Var2 = fb80.f67754e;
            fb80 fb80Var3 = fb80.f67753d;
            if (jyi0Var != null && jyi0Var3.f117421h == jyi0Var.f117421h) {
                if (fb80Var != fb80Var2) {
                    zxi0 zxi0Var = (zxi0) this.f235287w.get(this.f235286v.m38302b(jyi0Var3.f117414a));
                    if (wj50.m88271j((zxi0Var == null || (nuu0Var = zxi0Var.f287332f) == null || (set = (Set) nuu0Var.f158717a.getValue()) == null) ? null : Boolean.valueOf(set.contains(uxi0Var)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f235276l.get(uxi0Var)) != null && atomicInteger.get() == 0)) {
                        map.put(uxi0Var, fb80Var3);
                    } else {
                        map.put(uxi0Var, fb80Var2);
                    }
                }
                jyi0 jyi0Var4 = (jyi0) g6f.m43745s0(arrayList2);
                if (jyi0Var4 != null && jyi0Var4.f117421h == jyi0Var3.f117421h) {
                    j6f.m52568Z(arrayList2);
                }
                jyi0Var = jyi0Var.f117415b;
            } else if (arrayList2.isEmpty() || jyi0Var3.f117421h != ((jyi0) g6f.m43741q0(arrayList2)).f117421h) {
                uxi0Var.m84176b(fb80.f67752c);
            } else {
                jyi0 jyi0Var5 = (jyi0) j6f.m52568Z(arrayList2);
                if (fb80Var == fb80Var2) {
                    uxi0Var.m84176b(fb80Var3);
                } else if (fb80Var != fb80Var3) {
                    map.put(uxi0Var, fb80Var3);
                }
                ryi0 ryi0Var = jyi0Var5.f117415b;
                if (ryi0Var != null && !arrayList2.contains(ryi0Var)) {
                    arrayList2.add(ryi0Var);
                }
            }
        }
        for (uxi0 uxi0Var2 : arrayList) {
            fb80 fb80Var4 = (fb80) map.get(uxi0Var2);
            if (fb80Var4 != null) {
                uxi0Var2.m84176b(fb80Var4);
            } else {
                uxi0Var2.m84177c();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m84251H() {
        int i;
        boolean z = false;
        if (this.f235285u) {
            hj5 hj5Var = this.f235271g;
            if (hj5Var == null || !hj5Var.isEmpty()) {
                Iterator it = hj5Var.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!(((uxi0) it.next()).f234936b instanceof ryi0) && (i = i + 1) < 0) {
                        h6f.m46721R();
                        throw null;
                    }
                }
            } else {
                i = 0;
            }
            if (i > 1) {
                z = true;
            }
        }
        this.f235284t.m87301f(z);
    }

    /* JADX INFO: renamed from: c */
    public final void m84252c(jyi0 jyi0Var, Bundle bundle, uxi0 uxi0Var, List list) {
        Object objPrevious;
        Object objPrevious2;
        jyi0 jyi0Var2 = uxi0Var.f234936b;
        boolean z = jyi0Var2 instanceof diz;
        hj5 hj5Var = this.f235271g;
        if (!z) {
            while (!hj5Var.isEmpty() && (((uxi0) hj5Var.last()).f234936b instanceof diz) && m84267u(((uxi0) hj5Var.last()).f234936b.f117421h, true, false)) {
            }
        }
        hj5<uxi0> hj5Var2 = new hj5();
        boolean z2 = jyi0Var instanceof ryi0;
        Context context = this.f235265a;
        Object obj = null;
        if (z2) {
            jyi0 jyi0Var3 = jyi0Var2;
            do {
                wj50.m88279p(jyi0Var3);
                jyi0Var3 = jyi0Var3.f117415b;
                if (jyi0Var3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!wj50.m88271j(((uxi0) objPrevious2).f234936b, jyi0Var3));
                    uxi0 uxi0VarM90118q = (uxi0) objPrevious2;
                    if (uxi0VarM90118q == null) {
                        uxi0VarM90118q = x74.m90118q(context, jyi0Var3, bundle, m84257j(), this.f235280p);
                    }
                    hj5Var2.addFirst(uxi0VarM90118q);
                    if (!hj5Var.isEmpty() && ((uxi0) hj5Var.last()).f234936b == jyi0Var3) {
                        m84243w(this, (uxi0) hj5Var.last());
                    }
                }
                if (jyi0Var3 == null) {
                    break;
                }
            } while (jyi0Var3 != jyi0Var);
        }
        jyi0 jyi0Var4 = hj5Var2.isEmpty() ? jyi0Var2 : ((uxi0) hj5Var2.first()).f234936b;
        while (jyi0Var4 != null && m84254f(jyi0Var4.f117421h) != jyi0Var4) {
            jyi0Var4 = jyi0Var4.f117415b;
            if (jyi0Var4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!wj50.m88271j(((uxi0) objPrevious).f234936b, jyi0Var4));
                uxi0 uxi0VarM90118q2 = (uxi0) objPrevious;
                if (uxi0VarM90118q2 == null) {
                    uxi0VarM90118q2 = x74.m90118q(context, jyi0Var4, jyi0Var4.m54791b(bundle2), m84257j(), this.f235280p);
                }
                hj5Var2.addFirst(uxi0VarM90118q2);
            }
        }
        if (!hj5Var2.isEmpty()) {
            jyi0Var2 = ((uxi0) hj5Var2.first()).f234936b;
        }
        while (!hj5Var.isEmpty() && (((uxi0) hj5Var.last()).f234936b instanceof ryi0)) {
            mw31 mw31Var = ((ryi0) ((uxi0) hj5Var.last()).f234936b).f203927Y;
            int i = jyi0Var2.f117421h;
            mw31Var.getClass();
            if (fag1.m41164m(mw31Var, i) != null) {
                break;
            } else {
                m84243w(this, (uxi0) hj5Var.last());
            }
        }
        uxi0 uxi0Var2 = (uxi0) hj5Var.m47665f();
        if (uxi0Var2 == null) {
            uxi0Var2 = (uxi0) hj5Var2.m47665f();
        }
        if (!wj50.m88271j(uxi0Var2 != null ? uxi0Var2.f234936b : null, this.f235267c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                jyi0 jyi0Var5 = ((uxi0) objPrevious3).f234936b;
                ryi0 ryi0Var = this.f235267c;
                wj50.m88279p(ryi0Var);
                if (wj50.m88271j(jyi0Var5, ryi0Var)) {
                    obj = objPrevious3;
                    break;
                }
            }
            uxi0 uxi0VarM90118q3 = (uxi0) obj;
            if (uxi0VarM90118q3 == null) {
                ryi0 ryi0Var2 = this.f235267c;
                wj50.m88279p(ryi0Var2);
                ryi0 ryi0Var3 = this.f235267c;
                wj50.m88279p(ryi0Var3);
                uxi0VarM90118q3 = x74.m90118q(context, ryi0Var2, ryi0Var3.m54791b(bundle), m84257j(), this.f235280p);
            }
            hj5Var2.addFirst(uxi0VarM90118q3);
        }
        for (uxi0 uxi0Var3 : hj5Var2) {
            Object obj2 = this.f235287w.get(this.f235286v.m38302b(uxi0Var3.f234936b.f117414a));
            if (obj2 == null) {
                throw new IllegalStateException(dq60.m36616p(jyi0Var.f117414a, " should already be created", new StringBuilder("NavigatorBackStack for ")).toString());
            }
            ((zxi0) obj2).m97200a(uxi0Var3);
        }
        hj5Var.addAll(hj5Var2);
        hj5Var.addLast(uxi0Var);
        for (uxi0 uxi0Var4 : g6f.m43701O0(uxi0Var, hj5Var2)) {
            ryi0 ryi0Var4 = uxi0Var4.f234936b.f117415b;
            if (ryi0Var4 != null) {
                m84262o(uxi0Var4, m84255h(ryi0Var4.f117421h));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m84253e() {
        hj5 hj5Var;
        while (true) {
            hj5Var = this.f235271g;
            if (hj5Var.isEmpty() || !(((uxi0) hj5Var.last()).f234936b instanceof ryi0)) {
                break;
            }
            m84243w(this, (uxi0) hj5Var.last());
        }
        uxi0 uxi0Var = (uxi0) hj5Var.m47667j();
        ArrayList arrayList = this.f235262B;
        if (uxi0Var != null) {
            arrayList.add(uxi0Var);
        }
        this.f235261A++;
        m84250G();
        int i = this.f235261A - 1;
        this.f235261A = i;
        if (i == 0) {
            ArrayList<uxi0> arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            for (uxi0 uxi0Var2 : arrayList2) {
                for (ij3 ij3Var : this.f235281q) {
                    jyi0 jyi0Var = uxi0Var2.f234936b;
                    uxi0Var2.m84175a();
                    ij3Var.m50768a(jyi0Var);
                }
                this.f235264D.mo46962a(uxi0Var2);
            }
            ArrayList arrayList3 = new ArrayList(hj5Var);
            zv41 zv41Var = this.f235272h;
            zv41Var.getClass();
            zv41Var.m97091m(null, arrayList3);
            ArrayList arrayListM84269x = m84269x();
            zv41 zv41Var2 = this.f235273i;
            zv41Var2.getClass();
            zv41Var2.m97091m(null, arrayListM84269x);
        }
        return uxi0Var != null;
    }

    /* JADX INFO: renamed from: f */
    public final jyi0 m84254f(int i) {
        jyi0 jyi0Var;
        ryi0 ryi0Var = this.f235267c;
        if (ryi0Var == null) {
            return null;
        }
        if (ryi0Var.f117421h == i) {
            return ryi0Var;
        }
        uxi0 uxi0Var = (uxi0) this.f235271g.m47667j();
        if (uxi0Var == null || (jyi0Var = uxi0Var.f234936b) == null) {
            jyi0Var = this.f235267c;
            wj50.m88279p(jyi0Var);
        }
        return m84241g(jyi0Var, i, false);
    }

    /* JADX INFO: renamed from: h */
    public final uxi0 m84255h(int i) {
        Object objPrevious;
        hj5 hj5Var = this.f235271g;
        ListIterator<E> listIterator = hj5Var.listIterator(hj5Var.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((uxi0) objPrevious).f234936b.f117421h != i);
        uxi0 uxi0Var = (uxi0) objPrevious;
        if (uxi0Var != null) {
            return uxi0Var;
        }
        StringBuilder sbM56838j = klh.m56838j(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbM56838j.append(m84256i());
        throw new IllegalArgumentException(sbM56838j.toString().toString());
    }

    /* JADX INFO: renamed from: i */
    public final jyi0 m84256i() {
        uxi0 uxi0Var = (uxi0) this.f235271g.m47667j();
        if (uxi0Var != null) {
            return uxi0Var.f234936b;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final fb80 m84257j() {
        return this.f235279o == null ? fb80.f67752c : this.f235282r;
    }

    /* JADX INFO: renamed from: k */
    public final eaj0 m84258k() {
        return this.f235286v;
    }

    /* JADX INFO: renamed from: l */
    public final uxi0 m84259l() {
        Object next;
        Iterator it = g6f.m43704R0(this.f235271g).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = ((b6j) btz0.m30477A(it)).iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (!(((uxi0) next).f234936b instanceof ryi0)) {
                return (uxi0) next;
            }
        }
        next = null;
        return (uxi0) next;
    }

    /* JADX INFO: renamed from: m */
    public final ryi0 m84260m(hj5 hj5Var) {
        jyi0 jyi0Var;
        uxi0 uxi0Var = (uxi0) hj5Var.m47667j();
        if (uxi0Var == null || (jyi0Var = uxi0Var.f234936b) == null) {
            jyi0Var = this.f235267c;
            wj50.m88279p(jyi0Var);
        }
        if (jyi0Var instanceof ryi0) {
            return (ryi0) jyi0Var;
        }
        ryi0 ryi0Var = jyi0Var.f117415b;
        wj50.m88279p(ryi0Var);
        return ryi0Var;
    }

    /* JADX INFO: renamed from: n */
    public final nuu0 m84261n() {
        return this.f235274j;
    }

    /* JADX INFO: renamed from: o */
    public final void m84262o(uxi0 uxi0Var, uxi0 uxi0Var2) {
        this.f235275k.put(uxi0Var, uxi0Var2);
        LinkedHashMap linkedHashMap = this.f235276l;
        if (linkedHashMap.get(uxi0Var2) == null) {
            linkedHashMap.put(uxi0Var2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(uxi0Var2);
        wj50.m88279p(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX INFO: renamed from: p */
    public final void m84263p(int i, Bundle bundle, ezi0 ezi0Var) {
        int i2;
        hj5 hj5Var = this.f235271g;
        jyi0 jyi0Var = hj5Var.isEmpty() ? this.f235267c : ((uxi0) hj5Var.last()).f234936b;
        if (jyi0Var == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        oxi0 oxi0VarM54792d = jyi0Var.m54792d(i);
        Bundle bundle2 = null;
        if (oxi0VarM54792d != null) {
            if (ezi0Var == null) {
                ezi0Var = oxi0VarM54792d.f170992b;
            }
            i2 = oxi0VarM54792d.f170991a;
            Bundle bundle3 = oxi0VarM54792d.f170993c;
            if (bundle3 != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundle3);
            }
        } else {
            i2 = i;
        }
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (i2 == 0 && ezi0Var != null) {
            boolean z = ezi0Var.f64394d;
            int i3 = ezi0Var.f64393c;
            if (i3 != -1) {
                if (i3 == -1 || !m84267u(i3, z, false)) {
                    return;
                }
                m84253e();
                return;
            }
        }
        if (i2 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        jyi0 jyi0VarM84254f = m84254f(i2);
        if (jyi0VarM84254f != null) {
            m84265r(jyi0VarM84254f, bundle2, ezi0Var);
            return;
        }
        int i4 = jyi0.f117413X;
        Context context = this.f235265a;
        String strM87841o = wdg1.m87841o(context, i2);
        if (oxi0VarM54792d == null) {
            throw new IllegalArgumentException("Navigation action/destination " + strM87841o + " cannot be found from the current destination " + jyi0Var);
        }
        StringBuilder sbM38572u = edb.m38572u("Navigation destination ", strM87841o, " referenced from action ");
        sbM38572u.append(wdg1.m87841o(context, i));
        sbM38572u.append(" cannot be found from the current destination ");
        sbM38572u.append(jyi0Var);
        throw new IllegalArgumentException(sbM38572u.toString().toString());
    }

    /* JADX INFO: renamed from: q */
    public final void m84264q(String str) {
        if (this.f235267c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + str + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        ryi0 ryi0VarM84260m = m84260m(this.f235271g);
        hyi0 hyi0VarM76730s = ryi0VarM84260m.m76730s(str, true, ryi0VarM84260m);
        if (hyi0VarM76730s == null) {
            StringBuilder sbM38572u = edb.m38572u("Navigation destination that matches route ", str, " cannot be found in the navigation graph ");
            sbM38572u.append(this.f235267c);
            throw new IllegalArgumentException(sbM38572u.toString());
        }
        jyi0 jyi0Var = hyi0VarM76730s.f96591a;
        Bundle bundleM54791b = jyi0Var.m54791b(hyi0VarM76730s.f96592b);
        if (bundleM54791b == null) {
            bundleM54791b = new Bundle();
        }
        Intent intent = new Intent();
        int i = jyi0.f117413X;
        String str2 = jyi0Var.f117422i;
        intent.setDataAndType(Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : ""), null);
        intent.setAction(null);
        bundleM54791b.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        m84265r(jyi0Var, bundleM54791b, null);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:52:0x0100 A[LOOP:4: B:50:0x00fa->B:52:0x0100, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x014a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0156  */
    /* JADX WARN: Code duplicated, block: B:63:0x016d A[LOOP:6: B:61:0x0167->B:63:0x016d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0182  */
    /* JADX WARN: Code duplicated, block: B:67:0x0188  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:91:0x015f A[SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    public final void m84265r(jyi0 jyi0Var, Bundle bundle, ezi0 ezi0Var) {
        boolean zM84267u;
        eaj0 eaj0Var;
        nlv0 nlv0Var;
        boolean z;
        int iNextIndex;
        jyi0 jyi0Var2;
        hj5<uxi0> hj5Var;
        ryi0 ryi0Var;
        LinkedHashMap linkedHashMap = this.f235287w;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((zxi0) it.next()).f287330d = true;
        }
        nlv0 nlv0Var2 = new nlv0();
        if (ezi0Var != null) {
            boolean z2 = ezi0Var.f64395e;
            boolean z3 = ezi0Var.f64394d;
            int i = ezi0Var.f64393c;
            if (i != -1) {
                zM84267u = m84267u(i, z3, z2);
            } else {
                zM84267u = false;
            }
        } else {
            zM84267u = false;
        }
        Bundle bundleM54791b = jyi0Var.m54791b(bundle);
        if (ezi0Var == null || !ezi0Var.f64392b) {
            eaj0Var = this.f235286v;
            if (ezi0Var == null && ezi0Var.f64391a) {
                hj5 hj5Var2 = this.f235271g;
                uxi0 uxi0Var = (uxi0) hj5Var2.m47667j();
                ListIterator listIterator = hj5Var2.listIterator(hj5Var2.mo47661a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((uxi0) listIterator.previous()).f234936b == jyi0Var) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    nlv0Var = nlv0Var2;
                    z = false;
                } else if (jyi0Var instanceof ryi0) {
                    int i2 = ryi0.f203924N0;
                    List listM30496T = btz0.m30496T(new j691(pni0.f179391P0, btz0.m30487K((ryi0) jyi0Var, pni0.f179393R0)));
                    if (hj5Var2.f91964c - iNextIndex == listM30496T.size()) {
                        List listSubList = hj5Var2.subList(iNextIndex, hj5Var2.f91964c);
                        ArrayList arrayList = new ArrayList(i6f.m49804T(listSubList, 10));
                        Iterator it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(((uxi0) it2.next()).f234936b.f117421h));
                        }
                        if (arrayList.equals(listM30496T)) {
                            hj5Var = new hj5();
                            while (h6f.m46714K(hj5Var2) >= iNextIndex) {
                                uxi0 uxi0Var2 = (uxi0) j6f.m52570b0(hj5Var2);
                                m84249F(uxi0Var2);
                                uxi0 uxi0Var3 = new uxi0(uxi0Var2.f234935a, uxi0Var2.f234936b, uxi0Var2.f234936b.m54791b(bundle), uxi0Var2.f234938d, uxi0Var2.f234939e, uxi0Var2.f234940f, uxi0Var2.f234941g);
                                uxi0Var3.f234938d = uxi0Var2.f234938d;
                                uxi0Var3.m84176b(uxi0Var2.f234933Y);
                                hj5Var.addFirst(uxi0Var3);
                                nlv0Var2 = nlv0Var2;
                            }
                            nlv0Var = nlv0Var2;
                            for (uxi0 uxi0Var4 : hj5Var) {
                                ryi0Var = uxi0Var4.f234936b.f117415b;
                                if (ryi0Var != null) {
                                    m84262o(uxi0Var4, m84255h(ryi0Var.f117421h));
                                }
                                hj5Var2.addLast(uxi0Var4);
                            }
                            for (uxi0 uxi0Var5 : hj5Var) {
                                eaj0Var.m38302b(uxi0Var5.f234936b.f117414a).mo25257f(uxi0Var5);
                            }
                            z = true;
                        }
                    }
                    nlv0Var = nlv0Var2;
                    z = false;
                } else if (uxi0Var == null || (jyi0Var2 = uxi0Var.f234936b) == null || jyi0Var.f117421h != jyi0Var2.f117421h) {
                    nlv0Var = nlv0Var2;
                    z = false;
                } else {
                    hj5Var = new hj5();
                    while (h6f.m46714K(hj5Var2) >= iNextIndex) {
                        uxi0 uxi0Var6 = (uxi0) j6f.m52570b0(hj5Var2);
                        m84249F(uxi0Var6);
                        uxi0 uxi0Var7 = new uxi0(uxi0Var6.f234935a, uxi0Var6.f234936b, uxi0Var6.f234936b.m54791b(bundle), uxi0Var6.f234938d, uxi0Var6.f234939e, uxi0Var6.f234940f, uxi0Var6.f234941g);
                        uxi0Var7.f234938d = uxi0Var6.f234938d;
                        uxi0Var7.m84176b(uxi0Var6.f234933Y);
                        hj5Var.addFirst(uxi0Var7);
                        nlv0Var2 = nlv0Var2;
                    }
                    nlv0Var = nlv0Var2;
                    while (r1.hasNext()) {
                        ryi0Var = uxi0Var4.f234936b.f117415b;
                        if (ryi0Var != null) {
                            m84262o(uxi0Var4, m84255h(ryi0Var.f117421h));
                        }
                        hj5Var2.addLast(uxi0Var4);
                    }
                    while (r0.hasNext()) {
                        eaj0Var.m38302b(uxi0Var5.f234936b.f117414a).mo25257f(uxi0Var5);
                    }
                    z = true;
                }
            } else {
                nlv0Var = nlv0Var2;
                z = false;
            }
            if (z) {
                nlv0Var2 = nlv0Var;
            } else {
                uxi0 uxi0VarM90118q = x74.m90118q(this.f235265a, jyi0Var, bundleM54791b, m84257j(), this.f235280p);
                aaj0 aaj0VarM38302b = eaj0Var.m38302b(jyi0Var.f117414a);
                List listSingletonList = Collections.singletonList(uxi0VarM90118q);
                nlv0Var2 = nlv0Var;
                this.f235288x = new vir(nlv0Var2, this, jyi0Var, bundleM54791b, 3);
                aaj0VarM38302b.mo25255d(listSingletonList, ezi0Var);
                this.f235288x = null;
            }
        } else if (this.f235277m.containsKey(Integer.valueOf(jyi0Var.f117421h))) {
            nlv0Var2.f155174a = m84271z(jyi0Var.f117421h, bundleM54791b, ezi0Var);
            z = false;
        } else {
            eaj0Var = this.f235286v;
            if (ezi0Var == null) {
                nlv0Var = nlv0Var2;
                z = false;
            } else {
                nlv0Var = nlv0Var2;
                z = false;
            }
            if (z) {
                uxi0 uxi0VarM90118q2 = x74.m90118q(this.f235265a, jyi0Var, bundleM54791b, m84257j(), this.f235280p);
                aaj0 aaj0VarM38302b2 = eaj0Var.m38302b(jyi0Var.f117414a);
                List listSingletonList2 = Collections.singletonList(uxi0VarM90118q2);
                nlv0Var2 = nlv0Var;
                this.f235288x = new vir(nlv0Var2, this, jyi0Var, bundleM54791b, 3);
                aaj0VarM38302b2.mo25255d(listSingletonList2, ezi0Var);
                this.f235288x = null;
            } else {
                nlv0Var2 = nlv0Var;
            }
        }
        m84251H();
        Iterator it3 = linkedHashMap.values().iterator();
        while (it3.hasNext()) {
            ((zxi0) it3.next()).f287330d = false;
        }
        if (zM84267u || nlv0Var2.f155174a || z) {
            m84253e();
        } else {
            m84250G();
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m84266t() {
        if (this.f235271g.isEmpty()) {
            return false;
        }
        jyi0 jyi0VarM84256i = m84256i();
        wj50.m88279p(jyi0VarM84256i);
        return m84267u(jyi0VarM84256i.f117421h, true, false) && m84253e();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m84267u(int i, boolean z, boolean z2) {
        jyi0 jyi0Var;
        uyi0 uyi0Var;
        boolean z3;
        hj5 hj5Var = this.f235271g;
        int i2 = 0;
        if (hj5Var.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = g6f.m43704R0(hj5Var).iterator();
        do {
            if (!it.hasNext()) {
                jyi0Var = null;
                break;
            }
            jyi0Var = ((uxi0) it.next()).f234936b;
            aaj0 aaj0VarM38302b = this.f235286v.m38302b(jyi0Var.f117414a);
            if (z || jyi0Var.f117421h != i) {
                arrayList.add(aaj0VarM38302b);
            }
        } while (jyi0Var.f117421h != i);
        if (jyi0Var == null) {
            int i3 = jyi0.f117413X;
            wdg1.m87841o(this.f235265a, i);
            return false;
        }
        nlv0 nlv0Var = new nlv0();
        hj5 hj5Var2 = new hj5();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                uyi0Var = this;
                z3 = z2;
                break;
            }
            aaj0 aaj0Var = (aaj0) it2.next();
            nlv0 nlv0Var2 = new nlv0();
            uxi0 uxi0Var = (uxi0) hj5Var.last();
            uyi0Var = this;
            z3 = z2;
            uyi0Var.f235289y = new ayi0(nlv0Var2, nlv0Var, uyi0Var, z3, hj5Var2);
            aaj0Var.mo25260i(uxi0Var, z3);
            uyi0Var.f235289y = null;
            if (!nlv0Var2.f155174a) {
                break;
            }
            z2 = z3;
        }
        if (z3) {
            int i4 = 1;
            LinkedHashMap linkedHashMap = uyi0Var.f235277m;
            if (!z) {
                dgz dgzVar = new dgz(new mxr(btz0.m30487K(jyi0Var, pni0.f179389N0), new byi0(this, i2), 1));
                while (dgzVar.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((jyi0) dgzVar.next()).f117421h);
                    wxi0 wxi0Var = (wxi0) hj5Var2.m47665f();
                    linkedHashMap.put(numValueOf, wxi0Var != null ? wxi0Var.f256042a : null);
                }
            }
            if (!hj5Var2.isEmpty()) {
                wxi0 wxi0Var2 = (wxi0) hj5Var2.first();
                int i5 = wxi0Var2.f256043b;
                String str = wxi0Var2.f256042a;
                dgz dgzVar2 = new dgz(new mxr(btz0.m30487K(m84254f(i5), pni0.f179390O0), new byi0(this, i4), 1));
                while (dgzVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((jyi0) dgzVar2.next()).f117421h), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    uyi0Var.f235278n.put(str, hj5Var2);
                }
            }
        }
        m84251H();
        return nlv0Var.f155174a;
    }

    /* JADX INFO: renamed from: v */
    public final void m84268v(uxi0 uxi0Var, boolean z, hj5 hj5Var) {
        dyi0 dyi0Var;
        nuu0 nuu0Var;
        Set set;
        hj5 hj5Var2 = this.f235271g;
        uxi0 uxi0Var2 = (uxi0) hj5Var2.last();
        if (!wj50.m88271j(uxi0Var2, uxi0Var)) {
            throw new IllegalStateException(("Attempted to pop " + uxi0Var.f234936b + ", which is not the top of the back stack (" + uxi0Var2.f234936b + ')').toString());
        }
        j6f.m52570b0(hj5Var2);
        zxi0 zxi0Var = (zxi0) this.f235287w.get(this.f235286v.m38302b(uxi0Var2.f234936b.f117414a));
        boolean z2 = true;
        if ((zxi0Var == null || (nuu0Var = zxi0Var.f287332f) == null || (set = (Set) nuu0Var.f158717a.getValue()) == null || !set.contains(uxi0Var2)) && !this.f235276l.containsKey(uxi0Var2)) {
            z2 = false;
        }
        fb80 fb80Var = uxi0Var2.f234942h.f163857d;
        fb80 fb80Var2 = fb80.f67752c;
        if (fb80Var.m41223a(fb80Var2)) {
            if (z) {
                uxi0Var2.m84176b(fb80Var2);
                hj5Var.addFirst(new wxi0(uxi0Var2));
            }
            if (z2) {
                uxi0Var2.m84176b(fb80Var2);
            } else {
                uxi0Var2.m84176b(fb80.f67750a);
                m84249F(uxi0Var2);
            }
        }
        if (z || z2 || (dyi0Var = this.f235280p) == null) {
            return;
        }
        hjc1 hjc1Var = (hjc1) dyi0Var.f54369b.remove(uxi0Var2.f234940f);
        if (hjc1Var != null) {
            hjc1Var.m47681a();
        }
    }

    /* JADX INFO: renamed from: x */
    public final ArrayList m84269x() {
        fb80 fb80Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f235287w.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            fb80Var = fb80.f67753d;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((zxi0) it.next()).f287332f.f158717a.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                uxi0 uxi0Var = (uxi0) obj;
                if (!arrayList.contains(uxi0Var) && !uxi0Var.f234933Y.m41223a(fb80Var)) {
                    arrayList2.add(obj);
                }
            }
            j6f.m52564V(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f235271g) {
            uxi0 uxi0Var2 = (uxi0) obj2;
            if (!arrayList.contains(uxi0Var2) && uxi0Var2.f234933Y.m41223a(fb80Var)) {
                arrayList3.add(obj2);
            }
        }
        j6f.m52564V(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((uxi0) obj3).f234936b instanceof ryi0)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    /* JADX INFO: renamed from: y */
    public final void m84270y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f235265a.getClassLoader());
        this.f235268d = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f235269e = bundle.getParcelableArray("android-support-nav:controller:backStack");
        LinkedHashMap linkedHashMap = this.f235278n;
        linkedHashMap.clear();
        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                this.f235277m.put(Integer.valueOf(intArray[i]), stringArrayList.get(i2));
                i++;
                i2++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String str : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                if (parcelableArray != null) {
                    hj5 hj5Var = new hj5(parcelableArray.length);
                    int i3 = 0;
                    while (i3 < parcelableArray.length) {
                        int i4 = i3 + 1;
                        try {
                            hj5Var.addLast((wxi0) parcelableArray[i3]);
                            i3 = i4;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            throw new NoSuchElementException(e.getMessage());
                        }
                    }
                    linkedHashMap.put(str, hj5Var);
                }
            }
        }
        this.f235270f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    /* JADX INFO: renamed from: z */
    public final boolean m84271z(int i, Bundle bundle, ezi0 ezi0Var) {
        jyi0 jyi0Var;
        uxi0 uxi0Var;
        jyi0 jyi0Var2;
        Bundle bundle2;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.f235277m;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        j6f.m52566X(linkedHashMap.values(), new eve0(str, 14), true);
        hj5<wxi0> hj5Var = (hj5) zn91.m96561l(this.f235278n).remove(str);
        ArrayList arrayList = new ArrayList();
        uxi0 uxi0Var2 = (uxi0) this.f235271g.m47667j();
        if ((uxi0Var2 == null || (jyi0Var = uxi0Var2.f234936b) == null) && (jyi0Var = this.f235267c) == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        if (hj5Var != null) {
            for (wxi0 wxi0Var : hj5Var) {
                jyi0 jyi0VarM84241g = m84241g(jyi0Var, wxi0Var.f256043b, true);
                Context context = this.f235265a;
                if (jyi0VarM84241g == null) {
                    int i2 = jyi0.f117413X;
                    throw new IllegalStateException(("Restore State failed: destination " + wdg1.m87841o(context, wxi0Var.f256043b) + " cannot be found from the current destination " + jyi0Var).toString());
                }
                fb80 fb80VarM84257j = m84257j();
                dyi0 dyi0Var = this.f235280p;
                Bundle bundle3 = wxi0Var.f256044c;
                if (bundle3 != null) {
                    bundle3.setClassLoader(context.getClassLoader());
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                arrayList.add(new uxi0(context, jyi0VarM84241g, bundle2, fb80VarM84257j, dyi0Var, wxi0Var.f256042a, wxi0Var.f256045d));
                jyi0Var = jyi0VarM84241g;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList<uxi0> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((uxi0) obj).f234936b instanceof ryi0)) {
                arrayList3.add(obj);
            }
        }
        for (uxi0 uxi0Var3 : arrayList3) {
            List list = (List) g6f.m43689C0(arrayList2);
            if (wj50.m88271j((list == null || (uxi0Var = (uxi0) g6f.m43687A0(list)) == null || (jyi0Var2 = uxi0Var.f234936b) == null) ? null : jyi0Var2.f117414a, uxi0Var3.f234936b.f117414a)) {
                list.add(uxi0Var3);
            } else {
                arrayList2.add(h6f.m46717N(uxi0Var3));
            }
        }
        nlv0 nlv0Var = new nlv0();
        for (List list2 : arrayList2) {
            aaj0 aaj0VarM38302b = this.f235286v.m38302b(((uxi0) g6f.m43741q0(list2)).f234936b.f117414a);
            this.f235288x = new cyi0(nlv0Var, arrayList, new plv0(), this, bundle, 0);
            aaj0VarM38302b.mo25255d(list2, ezi0Var);
            this.f235288x = null;
        }
        return nlv0Var.f155174a;
    }
}
