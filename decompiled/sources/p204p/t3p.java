package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.connect.castbasic.core.model.DiscoveredDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class t3p implements jac {

    /* JADX INFO: renamed from: a */
    public final k47 f216812a;

    /* JADX INFO: renamed from: b */
    public final aqp f216813b;

    /* JADX INFO: renamed from: c */
    public final pmd0 f216814c;

    /* JADX INFO: renamed from: d */
    public final kqw f216815d;

    /* JADX INFO: renamed from: e */
    public final mcu0 f216816e;

    /* JADX INFO: renamed from: f */
    public final luk f216817f;

    /* JADX INFO: renamed from: g */
    public xuk f216818g;

    /* JADX INFO: renamed from: h */
    public zv41 f216819h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashSet f216820i = new LinkedHashSet();

    public t3p(k47 k47Var, aqp aqpVar, pmd0 pmd0Var, kqw kqwVar, xre xreVar, mcu0 mcu0Var, luk lukVar) {
        this.f216812a = k47Var;
        this.f216813b = aqpVar;
        this.f216814c = pmd0Var;
        this.f216815d = kqwVar;
        this.f216816e = mcu0Var;
        this.f216817f = lukVar;
        this.f216818g = dq60.m36621u(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: c */
    public static final Object m80015c(t3p t3pVar, ibk ibkVar) {
        p3p p3pVar;
        int i;
        Iterator it;
        LinkedHashSet linkedHashSet = t3pVar.f216820i;
        if (ibkVar instanceof p3p) {
            p3pVar = (p3p) ibkVar;
            int i2 = p3pVar.f173680e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p3pVar.f173680e = i2 - Integer.MIN_VALUE;
            } else {
                p3pVar = new p3p(t3pVar, ibkVar);
            }
        } else {
            p3pVar = new p3p(t3pVar, ibkVar);
        }
        Object obj = p3pVar.f173678c;
        int i3 = p3pVar.f173680e;
        if (i3 == 0) {
            bga.m29073P(obj);
            linkedHashSet.size();
            i = 0;
            it = linkedHashSet.iterator();
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = p3pVar.f173677b;
            it = p3pVar.f173676a;
            bga.m29073P(obj);
        }
        while (it.hasNext()) {
            String str = (String) it.next();
            kqw kqwVar = t3pVar.f216815d;
            p3pVar.f173676a = it;
            p3pVar.f173677b = i;
            p3pVar.f173680e = 1;
            Object objM57124b = kqwVar.m57124b(str, p3pVar);
            yuk yukVar = yuk.f276404a;
            if (objM57124b == yukVar) {
                return yukVar;
            }
        }
        linkedHashSet.clear();
        return w2a1.f247311a;
    }

    @Override // p204p.jac
    /* JADX INFO: renamed from: a */
    public final void mo47358a() {
        zv41 zv41Var = this.f216819h;
        if (zv41Var != null) {
            zv41Var.m97091m(null, lau.f131415a);
        }
        kk40.m56680v(this.f216818g, null);
    }

    @Override // p204p.jac
    /* JADX INFO: renamed from: b */
    public final void mo47359b() {
        int i = 19;
        this.f216818g = dv9.m37073v(this.f216818g, new sho(this, i));
        this.f216819h = jag1.m52819d(lau.f131415a);
        x0h1.m89578u(this.f216818g, null, 0, new C2069kx(this, null, i), 3);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:44:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[LOOP:0: B:36:0x00e8->B:46:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m80016d(List list, ibk ibkVar) {
        q3p q3pVar;
        Set set;
        List list2;
        Iterator it;
        int i;
        Iterator it2;
        vab vabVar;
        if (ibkVar instanceof q3p) {
            q3pVar = (q3p) ibkVar;
            int i2 = q3pVar.f184914g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q3pVar.f184914g = i2 - Integer.MIN_VALUE;
            } else {
                q3pVar = new q3p(this, ibkVar);
            }
        } else {
            q3pVar = new q3p(this, ibkVar);
        }
        Object obj = q3pVar.f184912e;
        int i3 = q3pVar.f184914g;
        LinkedHashSet linkedHashSet = this.f216820i;
        int i4 = 0;
        Object obj2 = yuk.f276404a;
        if (i3 != 0) {
            if (i3 == 1) {
                i = q3pVar.f184911d;
                it = q3pVar.f184910c;
                list2 = q3pVar.f184909b;
                set = q3pVar.f184908a;
                bga.m29073P(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = q3pVar.f184911d;
                it2 = q3pVar.f184910c;
                Set set2 = q3pVar.f184908a;
                bga.m29073P(obj);
                i4 = i5;
            }
            while (it2.hasNext()) {
                vabVar = (nab) it2.next();
                q3pVar.f184908a = null;
                q3pVar.f184909b = null;
                q3pVar.f184910c = it2;
                q3pVar.f184911d = i4;
                q3pVar.f184914g = 2;
                if (m80017e(vabVar, q3pVar) == obj2) {
                    return obj2;
                }
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj);
        k47 k47Var = this.f216812a;
        ArrayList arrayListM42076s = fm8.m42076s(list, k47Var);
        ArrayList arrayList = new ArrayList();
        Iterator it3 = arrayListM42076s.iterator();
        while (it3.hasNext()) {
            DiscoveredDevice discoveredDeviceM42080w = fm8.m42080w((rmx0) it3.next(), k47Var);
            String str = discoveredDeviceM42080w != null ? discoveredDeviceM42080w.deviceId : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        Set setM77305h0 = s601.m77305h0(linkedHashSet, g6f.m43736n1(arrayList));
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayListM42076s, 10));
        Iterator it4 = arrayListM42076s.iterator();
        while (it4.hasNext()) {
            arrayList2.add(new nab((rmx0) it4.next(), arrayListM42076s));
        }
        setM77305h0.size();
        arrayList2.size();
        set = setM77305h0;
        list2 = arrayList2;
        it = setM77305h0.iterator();
        i = 0;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            q3pVar.f184908a = set;
            q3pVar.f184909b = list2;
            q3pVar.f184910c = it;
            q3pVar.f184911d = i;
            q3pVar.f184914g = 1;
            if (this.f216815d.m57124b(str2, q3pVar) == obj2) {
                return obj2;
            }
        }
        linkedHashSet.removeAll(set);
        it2 = list2.iterator();
        while (it2.hasNext()) {
            vabVar = (nab) it2.next();
            q3pVar.f184908a = null;
            q3pVar.f184909b = null;
            q3pVar.f184910c = it2;
            q3pVar.f184911d = i4;
            q3pVar.f184914g = 2;
            if (m80017e(vabVar, q3pVar) == obj2) {
                return obj2;
            }
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m80017e(vab vabVar, ibk ibkVar) {
        rmx0 rmx0VarMo63978a = vabVar.mo63978a();
        DiscoveredDevice discoveredDeviceM42080w = rmx0VarMo63978a != null ? fm8.m42080w(rmx0VarMo63978a, this.f216812a) : null;
        boolean z = vabVar instanceof nab;
        yuk yukVar = yuk.f276404a;
        kqw kqwVar = this.f216815d;
        LinkedHashSet linkedHashSet = this.f216820i;
        w2a1 w2a1Var = w2a1.f247311a;
        if (z) {
            if (discoveredDeviceM42080w == null) {
                Logger.m3966b("CastBasic->%s", "Failed to convert route to DiscoveredDevice: " + ((nab) vabVar).f152013b);
                return w2a1Var;
            }
            linkedHashSet.add(discoveredDeviceM42080w.deviceId);
            Object objM57126d = kqwVar.m57126d(discoveredDeviceM42080w, ibkVar);
            if (objM57126d == yukVar) {
                return objM57126d;
            }
        } else if (vabVar instanceof oab) {
            if (discoveredDeviceM42080w == null) {
                Logger.m3966b("CastBasic->%s", "Failed to convert route to DiscoveredDevice: " + ((oab) vabVar).mo63978a());
                return w2a1Var;
            }
            linkedHashSet.add(discoveredDeviceM42080w.deviceId);
            Object objM57126d2 = kqwVar.m57126d(discoveredDeviceM42080w, ibkVar);
            if (objM57126d2 == yukVar) {
                return objM57126d2;
            }
        } else {
            if (!(vabVar instanceof sab)) {
                vabVar.toString();
                return w2a1Var;
            }
            sab sabVar = (sab) vabVar;
            rac racVarM55355r = k47.m55355r(sabVar.mo63978a().f200645k);
            String str = racVarM55355r != null ? racVarM55355r.f197252a : null;
            if (str == null) {
                str = sabVar.mo63978a().f200635a;
            }
            linkedHashSet.remove(str);
            Object objM57124b = kqwVar.m57124b(str, ibkVar);
            if (objM57124b == yukVar) {
                return objM57124b;
            }
        }
        return w2a1Var;
    }
}
