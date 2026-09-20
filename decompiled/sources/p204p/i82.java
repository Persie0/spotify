package p204p;

import android.app.Activity;
import com.spotify.music.R;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class i82 implements Function, rxr0, mmk0, luz0, cz8 {

    /* JADX INFO: renamed from: a */
    public boolean f99665a;

    /* JADX INFO: renamed from: b */
    public Object f99666b;

    /* JADX INFO: renamed from: c */
    public Object f99667c;

    /* JADX INFO: renamed from: d */
    public Object f99668d;

    /* JADX INFO: renamed from: e */
    public Object f99669e;

    /* JADX INFO: renamed from: f */
    public Object f99670f;

    public /* synthetic */ i82(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        this.f99666b = obj;
        this.f99667c = obj2;
        this.f99668d = obj3;
        this.f99669e = obj4;
        this.f99670f = obj5;
        this.f99665a = z;
    }

    /* JADX INFO: renamed from: t */
    public static void m49904t(i82 i82Var, up60 up60Var, up60 up60Var2, rr60 rr60Var) {
        Object next;
        up60 up60Var3;
        String strMo33226i = rr60Var.getDescriptor().mo33226i();
        HashMap map = (HashMap) i82Var.f99667c;
        Object map2 = map.get(up60Var);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(up60Var, map2);
        }
        Map map3 = (Map) map2;
        HashMap map4 = (HashMap) i82Var.f99669e;
        Object map5 = map4.get(up60Var);
        if (map5 == null) {
            map5 = new HashMap();
            map4.put(up60Var, map5);
        }
        Map map6 = (Map) map5;
        rr60 rr60Var2 = (rr60) map3.get(up60Var2);
        if (rr60Var2 != null && !rr60Var2.equals(rr60Var)) {
            throw new huz0("Serializer for " + up60Var2 + " already registered in the scope of " + up60Var);
        }
        rr60 rr60Var3 = (rr60) map6.get(strMo33226i);
        if (rr60Var3 == null || rr60Var3.equals(rr60Var)) {
            map3.put(up60Var2, rr60Var);
            map6.put(strMo33226i, rr60Var);
            return;
        }
        Iterator it = map3.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Map.Entry) next).getValue() != rr60Var3);
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (up60Var3 = (up60) entry.getKey()) == null) {
            throw new IllegalStateException(("Name " + strMo33226i + " is registered in the module but no Kotlin class is associated with it.").toString());
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + up60Var + "' have the same serial name '" + strMo33226i + "': " + rr60Var + " for '" + up60Var2 + "' and " + rr60Var3 + " for '" + up60Var3 + '\'');
    }

    /* JADX INFO: renamed from: u */
    public static void m49905u(i82 i82Var, up60 up60Var, wak wakVar) {
        HashMap map = (HashMap) i82Var.f99666b;
        wak wakVar2 = (wak) map.get(up60Var);
        if (wakVar2 != null && !wakVar2.equals(wakVar)) {
            throw new huz0("Contextual serializer or serializer provider for " + up60Var + " already registered in this module");
        }
        map.put(up60Var, wakVar);
        if (n1h1.m63513x(up60Var)) {
            i82Var.f99665a = true;
        }
    }

    /* JADX INFO: renamed from: y */
    public static pro0 m49906y(PlayerState playerState) {
        return (playerState.isBuffering() || !playerState.isPlaying() || playerState.isPaused()) ? pro0.f180655c : pro0.f180653a;
    }

    /* JADX INFO: renamed from: A */
    public void m49907A() {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f99666b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            xpi0 xpi0Var = (xpi0) ((LinkedHashMap) this.f99667c).get((aq6) obj);
            if (xpi0Var != null && xpi0Var.m91709e((xpi0) this.f99668d) >= 0.5f) {
                arrayList.add(obj);
            }
        }
        m49928w(g6f.m43736n1(g6f.m43714b1(g6f.m43711Y0(arrayList, new fm91(this, 1)), 1)));
    }

    /* JADX INFO: renamed from: B */
    public void m49908B(lom0 lom0Var) {
        s6d0 s6d0Var = lom0Var.f135468j;
        this.f99669e = s6d0Var != null ? s6d0Var.f206088d : null;
        if (this.f99665a || !lom0Var.f135459a.isEmpty()) {
            this.f99665a = true;
            int i = s6d0Var != null ? s6d0Var.f206085a : 0;
            float f = lom0Var.f135469k;
            ((vum0) this.f99667c).m86438w(i);
            ((nv70) this.f99670f).m65727a(i);
            ((uum0) this.f99668d).m84032w(f);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m49909C(ddr0 ddr0Var) {
        synchronized (this) {
            try {
                if (((ddr0) this.f99668d).equals(ddr0Var)) {
                    return;
                }
                this.f99668d = ddr0Var;
                ddr0Var.toString();
                vie1.m85624f("StreamStateObserver");
                ((xoi0) this.f99667c).m33101j(ddr0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public void m49910D(lzi lziVar) {
        p3f1 p3f1Var = (p3f1) ((yj10) this.f99670f).f273264t.get((i45) this.f99667c);
        if (p3f1Var != null) {
            p3f1Var.m69012k(lziVar);
        }
    }

    @Override // p204p.luz0
    /* JADX INFO: renamed from: a */
    public void mo49911a(up60 up60Var, up60 up60Var2, rr60 rr60Var) {
        m49904t(this, up60Var, up60Var2, rr60Var);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        g3m g3mVar = (g3m) obj;
        x5j x5jVar = (x5j) this.f99666b;
        return vjf1.m85770t(x5jVar.f258458h, new np1(x5jVar, (List) this.f99667c, (String) this.f99668d, (String) this.f99669e, this.f99665a, g3mVar, (f93) this.f99670f, (fbk) null, 1)).map(new ujh(5, g3mVar, (String) this.f99669e));
    }

    @Override // p204p.luz0
    /* JADX INFO: renamed from: b */
    public void mo49912b(up60 up60Var, gh00 gh00Var) {
        HashMap map = (HashMap) this.f99668d;
        gh00 gh00Var2 = (gh00) map.get(up60Var);
        if (gh00Var2 == null || gh00Var2.equals(gh00Var)) {
            map.put(up60Var, gh00Var);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + up60Var + " is already registered: " + gh00Var2);
    }

    @Override // p204p.mmk0
    /* JADX INFO: renamed from: c */
    public void mo49913c(Object obj) {
        hfb hfbVar = (hfb) obj;
        hfb hfbVar2 = hfb.CLOSING;
        ddr0 ddr0Var = ddr0.f47855a;
        if (hfbVar == hfbVar2 || hfbVar == hfb.CLOSED || hfbVar == hfb.RELEASING || hfbVar == hfb.RELEASED) {
            m49909C(ddr0Var);
            if (this.f99665a) {
                this.f99665a = false;
                hk00 hk00Var = (hk00) this.f99670f;
                if (hk00Var != null) {
                    hk00Var.cancel(false);
                    this.f99670f = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((hfbVar == hfb.OPENING || hfbVar == hfb.OPEN || hfbVar == hfb.PENDING_OPEN) && !this.f99665a) {
            gfb gfbVar = (gfb) this.f99666b;
            m49909C(ddr0Var);
            ArrayList arrayList = new ArrayList();
            jjc jjcVarM89929T = x4w0.m89929T(hk00.m47729c(n5h1.m63736l(new us30(arrayList, this, gfbVar))), new scr0(this), e95.m38202g());
            scr0 scr0Var = new scr0(this);
            jjc jjcVarM89929T2 = x4w0.m89929T(jjcVarM89929T, new drw(scr0Var, 10), e95.m38202g());
            this.f99670f = jjcVarM89929T2;
            hun0 hun0Var = new hun0(arrayList, this, gfbVar);
            jjcVarM89929T2.mo28322a(new lk00(0, jjcVarM89929T2, hun0Var), e95.m38202g());
            this.f99665a = true;
        }
    }

    @Override // p204p.luz0
    /* JADX INFO: renamed from: d */
    public void mo49914d(up60 up60Var, gh00 gh00Var) {
        HashMap map = (HashMap) this.f99670f;
        gh00 gh00Var2 = (gh00) map.get(up60Var);
        if (gh00Var2 == null || gh00Var2.equals(gh00Var)) {
            map.put(up60Var, gh00Var);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + up60Var + " is already registered: " + gh00Var2);
    }

    @Override // p204p.cz8
    /* JADX INFO: renamed from: e */
    public void mo34415e(lzi lziVar) {
        ((yj10) this.f99670f).f273250L0.post(new vpa1(this, lziVar, 8));
    }

    @Override // p204p.luz0
    /* JADX INFO: renamed from: f */
    public void mo49915f(up60 up60Var, rr60 rr60Var) {
        m49905u(this, up60Var, new uak(rr60Var));
    }

    @Override // p204p.luz0
    /* JADX INFO: renamed from: g */
    public void mo49916g(up60 up60Var, gh00 gh00Var) {
        m49905u(this, up60Var, new vak(gh00Var));
    }

    /* JADX INFO: renamed from: h */
    public i82 m49917h() {
        return new i82((HashMap) this.f99666b, (HashMap) this.f99667c, (HashMap) this.f99668d, (HashMap) this.f99669e, (HashMap) this.f99670f, this.f99665a);
    }

    @Override // p204p.rxr0
    /* JADX INFO: renamed from: i */
    public Observable mo49918i(qxr0 qxr0Var) {
        Observable observableNever;
        if (this.f99665a) {
            observableNever = ((g7t0) this.f99670f).m43927a();
        } else {
            observableNever = Observable.never();
            wj50.m88279p(observableNever);
        }
        return Observable.defer(new yh1(observableNever.startWithItem(w2a1.f247311a), 11)).switchMap(new ezk0(this, 17));
    }

    /* JADX INFO: renamed from: j */
    public f5k m49919j() {
        boolean z = this.f99665a;
        return new f5k("aligned_curation_add_and_remove_to_your_library", z ? kou.f124911c : auu.f20028c, (c5k) null, Integer.valueOf(z ? R.string.aligned_curation_context_menu_item_remove_from_your_library : R.string.aligned_curation_context_menu_item_add_to_your_library), (String) null, false, (p221) null, new e5k(new v4k(2), z ? 2 : 1, new d5k(axl.f20907X0, new q2m(this, 0)), new q2m(this, 1)), 244);
    }

    /* JADX INFO: renamed from: l */
    public void m49920l(luz0 luz0Var) {
        for (Map.Entry entry : ((Map) this.f99666b).entrySet()) {
            up60 up60Var = (up60) entry.getKey();
            wak wakVar = (wak) entry.getValue();
            if (wakVar instanceof uak) {
                luz0Var.mo49915f(up60Var, ((uak) wakVar).f228511a);
            } else {
                if (!(wakVar instanceof vak)) {
                    throw new NoWhenBranchMatchedException();
                }
                luz0Var.mo49916g(up60Var, ((vak) wakVar).f239290a);
            }
        }
        for (Map.Entry entry2 : ((Map) this.f99667c).entrySet()) {
            up60 up60Var2 = (up60) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                luz0Var.mo49911a(up60Var2, (up60) entry3.getKey(), (rr60) entry3.getValue());
            }
        }
        for (Map.Entry entry4 : ((Map) this.f99668d).entrySet()) {
            up60 up60Var3 = (up60) entry4.getKey();
            gh00 gh00Var = (gh00) entry4.getValue();
            zn91.m96579u(1, gh00Var);
            luz0Var.mo49912b(up60Var3, gh00Var);
        }
        for (Map.Entry entry5 : ((Map) this.f99670f).entrySet()) {
            up60 up60Var4 = (up60) entry5.getKey();
            gh00 gh00Var2 = (gh00) entry5.getValue();
            zn91.m96579u(1, gh00Var2);
            luz0Var.mo49914d(up60Var4, gh00Var2);
        }
    }

    /* JADX INFO: renamed from: m */
    public rr60 m49921m(List list, up60 up60Var) {
        wak wakVar = (wak) ((Map) this.f99666b).get(up60Var);
        rr60 rr60VarMo82697a = wakVar != null ? wakVar.mo82697a(list) : null;
        if (rr60VarMo82697a instanceof rr60) {
            return rr60VarMo82697a;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public int m49922o() {
        return ((vum0) this.f99667c).m86437v();
    }

    @Override // p204p.mmk0
    public void onError(Throwable th) {
        hk00 hk00Var = (hk00) this.f99670f;
        if (hk00Var != null) {
            hk00Var.cancel(false);
            this.f99670f = null;
        }
        m49909C(ddr0.f47855a);
    }

    /* JADX INFO: renamed from: p */
    public float m49923p() {
        return ((uum0) this.f99668d).m84031v();
    }

    /* JADX INFO: renamed from: q */
    public rr60 m49924q(String str, up60 up60Var) {
        Map map = (Map) ((Map) this.f99669e).get(up60Var);
        rr60 rr60Var = map != null ? (rr60) map.get(str) : null;
        if (!(rr60Var instanceof rr60)) {
            rr60Var = null;
        }
        if (rr60Var != null) {
            return rr60Var;
        }
        Object obj = ((Map) this.f99670f).get(up60Var);
        gh00 gh00Var = zn91.m96535W(1, obj) ? (gh00) obj : null;
        if (gh00Var != null) {
            return (rr60) gh00Var.invoke(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public rr60 m49925r(up60 up60Var, Object obj) {
        rr60 rr60Var;
        if (up60Var.mo29118z(obj)) {
            Map map = (Map) ((Map) this.f99667c).get(up60Var);
            if (map != null) {
                rr60Var = (rr60) map.get(qpv0.f191387a.mo54112b(obj.getClass()));
            } else {
                rr60Var = null;
            }
            rr60 rr60Var2 = rr60Var instanceof rr60 ? rr60Var : null;
            if (rr60Var2 != null) {
                return rr60Var2;
            }
            Object obj2 = ((Map) this.f99668d).get(up60Var);
            gh00 gh00Var = zn91.m96535W(1, obj2) ? (gh00) obj2 : null;
            if (gh00Var != null) {
                return (rr60) gh00Var.invoke(obj);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public int m49926s(gom0 gom0Var, int i) {
        int iM60316j = lzg1.m60316j(i, this.f99669e, gom0Var);
        if (i != iM60316j) {
            ((vum0) this.f99667c).m86438w(iM60316j);
            ((nv70) this.f99670f).m65727a(i);
        }
        return iM60316j;
    }

    @Override // p204p.rxr0
    public String title() {
        return ((Activity) this.f99667c).getResources().getString(R.string.profile_list_public_playlists_title);
    }

    @Override // p204p.rxr0
    public int type() {
        return 3;
    }

    /* JADX INFO: renamed from: v */
    public void m49927v(float f, int i) {
        ((vum0) this.f99667c).m86438w(i);
        ((nv70) this.f99670f).m65727a(i);
        ((uum0) this.f99668d).m84032w(f);
        this.f99669e = null;
    }

    /* JADX INFO: renamed from: w */
    public void m49928w(Set set) {
        Set<aq6> setM77305h0 = s601.m77305h0(set, (Set) this.f99669e);
        Set<aq6> setM77305h1 = s601.m77305h0((Set) this.f99669e, set);
        this.f99669e = set;
        for (aq6 aq6Var : setM77305h1) {
            dxc1 dxc1Var = (dxc1) this.f99670f;
            if (dxc1Var != null) {
                Iterator it = ((rdd1) dxc1Var.f53930b).f198104b.iterator();
                while (it.hasNext()) {
                    ((bq6) it.next()).mo30183a(aq6Var);
                }
            }
        }
        for (aq6 aq6Var2 : setM77305h0) {
            dxc1 dxc1Var2 = (dxc1) this.f99670f;
            if (dxc1Var2 != null) {
                Iterator it2 = ((rdd1) dxc1Var2.f53930b).f198104b.iterator();
                while (it2.hasNext()) {
                    ((bq6) it2.next()).mo30184b(aq6Var2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m49929x(List list) {
        this.f99668d = new nx51(list);
    }

    /* JADX INFO: renamed from: z */
    public void m49930z(float f) {
        ((uum0) this.f99668d).m84032w(f);
    }

    public /* synthetic */ i82(Object obj, Object obj2, Object obj3, Object obj4, boolean z, Object obj5) {
        this.f99666b = obj;
        this.f99667c = obj2;
        this.f99668d = obj3;
        this.f99669e = obj4;
        this.f99665a = z;
        this.f99670f = obj5;
    }

    public /* synthetic */ i82(boolean z, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f99665a = z;
        this.f99666b = obj;
        this.f99667c = obj2;
        this.f99668d = obj3;
        this.f99669e = obj4;
        this.f99670f = obj5;
    }

    public i82(yj10 yj10Var, o35 o35Var, i45 i45Var) {
        Objects.requireNonNull(yj10Var);
        this.f99670f = yj10Var;
        this.f99668d = null;
        this.f99669e = null;
        this.f99665a = false;
        this.f99666b = o35Var;
        this.f99667c = i45Var;
    }

    public i82(vmz vmzVar, h62 h62Var, pwn pwnVar, r1j r1jVar, boolean z, zpn zpnVar) {
        this.f99666b = vmzVar;
        this.f99667c = h62Var;
        this.f99668d = pwnVar;
        this.f99670f = r1jVar;
        this.f99665a = z;
        this.f99669e = zpnVar;
    }

    public i82(int i, float f, xom0 xom0Var) {
        this.f99666b = xom0Var;
        this.f99667c = new vum0(i);
        this.f99668d = new uum0(f);
        this.f99670f = new nv70(i, 30, 100);
    }

    public i82(int i) {
        switch (i) {
            case 18:
                this.f99666b = new LinkedHashSet();
                this.f99667c = lau.f131415a;
                break;
            case 19:
            default:
                this.f99666b = new HashMap();
                this.f99667c = new HashMap();
                this.f99668d = new HashMap();
                this.f99669e = new HashMap();
                this.f99670f = new HashMap();
                break;
            case 20:
                this.f99666b = new LinkedHashSet();
                this.f99667c = new LinkedHashMap();
                this.f99668d = new xpi0();
                this.f99665a = true;
                this.f99669e = gbu.f78413a;
                break;
        }
    }

    public i82(kc0 kc0Var, Flowable flowable, Scheduler scheduler, xre xreVar, boolean z) {
        this.f99666b = kc0Var;
        this.f99667c = flowable;
        this.f99668d = scheduler;
        this.f99669e = xreVar;
        this.f99665a = z;
        this.f99670f = new wg61(new fts(this, 28));
    }
}
