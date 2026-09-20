package p204p;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pg0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f177174a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f177175b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f177176c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public final ArrayList f177177d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final transient LinkedHashMap f177178e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f177179f = new LinkedHashMap();

    /* JADX INFO: renamed from: g */
    public final Bundle f177180g = new Bundle();

    /* JADX INFO: renamed from: c */
    public final boolean m69850c(int i, int i2, Intent intent) {
        String str = (String) this.f177174a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        lg0 lg0Var = (lg0) this.f177178e.get(str);
        if ((lg0Var != null ? lg0Var.f133031a : null) != null) {
            ArrayList arrayList = this.f177177d;
            if (arrayList.contains(str)) {
                lg0Var.f133031a.mo25836a(lg0Var.f133032b.mo32679v(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f177179f.remove(str);
        this.f177180g.putParcelable(str, new xf0(intent, i2));
        return true;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo34318d(int i, hsg1 hsg1Var, Object obj);

    /* JADX INFO: renamed from: e */
    public final void m69851e(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f177177d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        Bundle bundle3 = this.f177180g;
        if (bundle2 != null) {
            bundle3.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            LinkedHashMap linkedHashMap = this.f177175b;
            boolean zContainsKey = linkedHashMap.containsKey(str);
            LinkedHashMap linkedHashMap2 = this.f177174a;
            if (zContainsKey) {
                Integer num = (Integer) linkedHashMap.remove(str);
                if (!bundle3.containsKey(str)) {
                    zn91.m96561l(linkedHashMap2).remove(num);
                }
            }
            int iIntValue = integerArrayList.get(i).intValue();
            String str2 = stringArrayList.get(i);
            linkedHashMap2.put(Integer.valueOf(iIntValue), str2);
            linkedHashMap.put(str2, Integer.valueOf(iIntValue));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m69852f(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f177175b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f177177d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f177180g));
    }

    /* JADX INFO: renamed from: g */
    public final ng0 m69853g(final String str, hc80 hc80Var, final hsg1 hsg1Var, final yf0 yf0Var) {
        gb80 lifecycle = hc80Var.getLifecycle();
        if (lifecycle.mo31987b().m41223a(fb80.f67753d)) {
            throw new IllegalStateException(("LifecycleOwner " + hc80Var + " is attempting to register while current state is " + lifecycle.mo31987b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        m69855i(str);
        LinkedHashMap linkedHashMap = this.f177176c;
        mg0 mg0Var = (mg0) linkedHashMap.get(str);
        if (mg0Var == null) {
            mg0Var = new mg0(lifecycle);
        }
        zb80 zb80Var = new zb80() { // from class: p.kg0
            @Override // p204p.zb80
            /* JADX INFO: renamed from: y */
            public final void mo26206y(hc80 hc80Var2, ta80 ta80Var) {
                pg0 pg0Var = this.f122252a;
                LinkedHashMap linkedHashMap2 = pg0Var.f177178e;
                ta80 ta80Var2 = ta80.ON_START;
                String str2 = str;
                if (ta80Var2 != ta80Var) {
                    if (ta80.ON_STOP == ta80Var) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (ta80.ON_DESTROY == ta80Var) {
                            pg0Var.m69856j(str2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = pg0Var.f177180g;
                LinkedHashMap linkedHashMap3 = pg0Var.f177179f;
                yf0 yf0Var2 = yf0Var;
                hsg1 hsg1Var2 = hsg1Var;
                linkedHashMap2.put(str2, new lg0(yf0Var2, hsg1Var2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    yf0Var2.mo25836a(obj);
                }
                xf0 xf0Var = (xf0) zn91.m96523K(bundle, str2, xf0.class);
                if (xf0Var != null) {
                    bundle.remove(str2);
                    yf0Var2.mo25836a(hsg1Var2.mo32679v(xf0Var.f260798b, xf0Var.f260797a));
                }
            }
        };
        mg0Var.f143246a.mo31986a(zb80Var);
        mg0Var.f143247b.add(zb80Var);
        linkedHashMap.put(str, mg0Var);
        return new ng0(this, str, hsg1Var);
    }

    /* JADX INFO: renamed from: h */
    public final og0 m69854h(String str, hsg1 hsg1Var, yf0 yf0Var) {
        m69855i(str);
        this.f177178e.put(str, new lg0(yf0Var, hsg1Var));
        LinkedHashMap linkedHashMap = this.f177179f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            yf0Var.mo25836a(obj);
        }
        Bundle bundle = this.f177180g;
        xf0 xf0Var = (xf0) zn91.m96523K(bundle, str, xf0.class);
        if (xf0Var != null) {
            bundle.remove(str);
            yf0Var.mo25836a(hsg1Var.mo32679v(xf0Var.f260798b, xf0Var.f260797a));
        }
        return new og0(this, str, hsg1Var);
    }

    /* JADX INFO: renamed from: i */
    public final void m69855i(String str) {
        LinkedHashMap linkedHashMap = this.f177175b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : (b6j) btz0.m30488L(C2087le.f132403c)) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f177174a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: j */
    public final void m69856j(String str) {
        Integer num;
        if (!this.f177177d.contains(str) && (num = (Integer) this.f177175b.remove(str)) != null) {
            this.f177174a.remove(num);
        }
        this.f177178e.remove(str);
        LinkedHashMap linkedHashMap = this.f177179f;
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f177180g;
        if (bundle.containsKey(str)) {
            Objects.toString((xf0) zn91.m96523K(bundle, str, xf0.class));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f177176c;
        mg0 mg0Var = (mg0) linkedHashMap2.get(str);
        if (mg0Var != null) {
            ArrayList arrayList = mg0Var.f143247b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                mg0Var.f143246a.mo31988d((zb80) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
