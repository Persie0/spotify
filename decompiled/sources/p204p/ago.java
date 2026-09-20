package p204p;

import android.os.Handler;
import android.os.Looper;
import com.spotify.kodiak.table.table.DataSourceException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class ago implements pgo {

    /* JADX INFO: renamed from: t */
    public static final ojo f15436t = new ojo(w2a1.f247311a);

    /* JADX INFO: renamed from: a */
    public final p7f0 f15437a;

    /* JADX INFO: renamed from: b */
    public final Handler f15438b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public final a6a1 f15439c;

    /* JADX INFO: renamed from: d */
    public final Object f15440d;

    /* JADX INFO: renamed from: e */
    public final CopyOnWriteArrayList f15441e;

    /* JADX INFO: renamed from: f */
    public int f15442f;

    /* JADX INFO: renamed from: g */
    public UUID f15443g;

    /* JADX INFO: renamed from: h */
    public z5a1 f15444h;

    /* JADX INFO: renamed from: i */
    public final tlv0 f15445i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet f15446j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashSet f15447k;

    /* JADX INFO: renamed from: l */
    public final pxq f15448l;

    /* JADX INFO: renamed from: m */
    public final ConcurrentHashMap f15449m;

    /* JADX INFO: renamed from: n */
    public final AtomicBoolean f15450n;

    /* JADX INFO: renamed from: o */
    public Set f15451o;

    /* JADX INFO: renamed from: p */
    public final AtomicBoolean f15452p;

    /* JADX INFO: renamed from: q */
    public boolean f15453q;

    /* JADX INFO: renamed from: r */
    public long f15454r;

    /* JADX INFO: renamed from: s */
    public long f15455s;

    public ago(rio rioVar, p7f0 p7f0Var) {
        this.f15437a = p7f0Var;
        a6a1 a6a1VarMo24859a = rioVar.mo24859a();
        this.f15439c = a6a1VarMo24859a;
        this.f15440d = new Object();
        this.f15441e = new CopyOnWriteArrayList();
        this.f15445i = new tlv0();
        this.f15446j = new LinkedHashSet();
        this.f15447k = new LinkedHashSet();
        this.f15448l = new pxq(1);
        this.f15449m = new ConcurrentHashMap();
        this.f15450n = new AtomicBoolean(false);
        if (p7f0Var != null) {
            p7f0Var.getClass();
        }
        this.f15444h = a6a1VarMo24859a.mo24861c(new j20(this, 15));
        this.f15451o = gbu.f78413a;
        this.f15452p = new AtomicBoolean(false);
        this.f15455s = -1L;
    }

    @Override // p204p.pgo
    /* JADX INFO: renamed from: a */
    public final Object mo25865a(bek bekVar, hfk hfkVar, ibk ibkVar) {
        z5a1 z5a1Var;
        t6x0 t6x0Var = t6x0.f217635Z;
        synchronized (this.f15440d) {
            z5a1Var = this.f15444h;
        }
        if (z5a1Var == null) {
            throw new IllegalStateException("subscription is null");
        }
        Object objMo28292d = z5a1Var.mo28292d(new pqm0(new k35(t6x0Var, bekVar), hfkVar), ibkVar);
        return objMo28292d == yuk.f276404a ? objMo28292d : w2a1.f247311a;
    }

    @Override // p204p.pgo
    /* JADX INFO: renamed from: b */
    public final qho mo25866b(lho lhoVar) {
        boolean z;
        p7f0 p7f0Var = this.f15437a;
        if (p7f0Var != null) {
            p7f0Var.getClass();
        }
        List items = lhoVar.getItems();
        boolean z2 = true;
        Map map = this.f15445i;
        if (items != null && items.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = items.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            kho khoVar = (kho) it.next();
            if (!khoVar.f122694a.m55230a() && map.get(khoVar.f122694a) == null) {
                z = true;
                break;
            }
        }
        List items2 = lhoVar.getItems();
        if (items2 != null && items2.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it2 = items2.iterator();
        do {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
        } while (((kho) it2.next()).f122696c == null);
        if (!z && !z2) {
            return lhoVar.mo25349a(map);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = lhoVar.getItems().iterator();
        while (it3.hasNext()) {
            k35 k35Var = ((kho) it3.next()).f122694a;
            pjo pjoVar = (pjo) map.get(k35Var);
            if (k35Var.m55230a()) {
                linkedHashMap.put(k35Var, f15436t);
            } else if (pjoVar != null) {
                linkedHashMap.put(k35Var, pjoVar);
            } else {
                linkedHashSet.add(k35Var);
            }
        }
        m25875l(linkedHashSet, linkedHashMap);
        if (z2) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            while (true) {
                List items3 = lhoVar.getItems();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                Iterator it4 = items3.iterator();
                while (it4.hasNext()) {
                    j6f.m52564V(((kho) it4.next()).m56449a(linkedHashMap), linkedHashSet3);
                }
                LinkedHashSet<k35> linkedHashSet4 = new LinkedHashSet();
                for (Object obj : linkedHashSet3) {
                    k35 k35Var2 = (k35) obj;
                    if (!linkedHashMap.containsKey(k35Var2) && linkedHashSet2.add(k35Var2)) {
                        linkedHashSet4.add(obj);
                    }
                }
                if (linkedHashSet4.isEmpty()) {
                    break;
                }
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                for (k35 k35Var3 : linkedHashSet4) {
                    pjo pjoVar2 = (pjo) map.get(k35Var3);
                    if (pjoVar2 != null) {
                        linkedHashMap.put(k35Var3, pjoVar2);
                    } else {
                        linkedHashSet5.add(k35Var3);
                    }
                }
                m25875l(linkedHashSet5, linkedHashMap);
            }
        }
        return lhoVar.mo25349a(linkedHashMap);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p204p.pgo
    /* JADX INFO: renamed from: c */
    public final ogo mo25867c(lho lhoVar) {
        Throwable th;
        Throwable th2;
        boolean z;
        synchronized (this.f15440d) {
            try {
                if (this.f15444h == null) {
                    try {
                        return new wfo();
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                List items = lhoVar.getItems();
                HashSet<k35> hashSet = new HashSet(((items.size() * 4) / 3) + 1);
                synchronized (this.f15440d) {
                    try {
                        Iterator it = items.iterator();
                        Set linkedHashSet = null;
                        while (true) {
                            boolean z2 = false;
                            if (!it.hasNext()) {
                                break;
                            }
                            try {
                                k35 k35Var = ((kho) it.next()).f122694a;
                                if (hashSet.add(k35Var)) {
                                    boolean zM55230a = k35Var.m55230a();
                                    if (!zM55230a && this.f15445i.get(k35Var) == null) {
                                        z2 = true;
                                    }
                                    this.f15445i.m81073a(k35Var);
                                    if (zM55230a) {
                                        this.f15445i.m81074b(k35Var, f15436t);
                                    } else {
                                        if (this.f15446j.add(k35Var)) {
                                            this.f15453q = true;
                                            this.f15454r++;
                                        }
                                        if (z2) {
                                            if (linkedHashSet == null) {
                                                linkedHashSet = new LinkedHashSet();
                                            }
                                            linkedHashSet.add(k35Var);
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                            }
                            th2 = th4;
                            throw th2;
                        }
                        if (linkedHashSet == null) {
                            linkedHashSet = gbu.f78413a;
                        }
                        if (!linkedHashSet.isEmpty()) {
                            try {
                                Map mapMo24860b = this.f15439c.mo24860b(linkedHashSet);
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (Map.Entry entry : mapMo24860b.entrySet()) {
                                    if (((pjo) entry.getValue()) instanceof ojo) {
                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                    }
                                }
                                synchronized (this.f15440d) {
                                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                        k35 k35Var2 = (k35) entry2.getKey();
                                        pjo pjoVar = (pjo) entry2.getValue();
                                        if (linkedHashSet.contains(k35Var2)) {
                                            this.f15445i.m81074b(k35Var2, pjoVar);
                                        }
                                    }
                                }
                            } catch (DataSourceException unused) {
                            }
                        }
                        qho qhoVarMo25349a = lhoVar.mo25349a(this.f15445i);
                        if (qhoVarMo25349a instanceof nho) {
                            qhoVarMo25349a = pho.f177693a;
                        }
                        xfo xfoVar = new xfo(items, hashSet, qhoVarMo25349a, lhoVar, this);
                        synchronized (this.f15440d) {
                            p7f0 p7f0Var = this.f15437a;
                            if (p7f0Var != null) {
                                p7f0Var.m69272j(m25871h(lhoVar, xfoVar));
                            }
                        }
                        synchronized (this.f15440d) {
                            try {
                                for (k35 k35Var3 : hashSet) {
                                    pxq pxqVar = this.f15448l;
                                    pqm0 pqm0VarM69840u = pft0.m69840u(k35Var3, xfoVar);
                                    pxqVar.getClass();
                                    pxqVar.f183155a.compute(pqm0VarM69840u.f180350a, new v6i0(pqm0VarM69840u.f180351b));
                                }
                                m25878o(xfoVar);
                                z = this.f15442f == 0;
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                        xfoVar.mo85377a();
                        if (z && this.f15452p.compareAndSet(false, true)) {
                            this.f15438b.post(new eph(this, 6));
                        }
                        return xfoVar;
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    @Override // p204p.pgo
    /* JADX INFO: renamed from: d */
    public final void mo25868d(eh00 eh00Var) {
        boolean z;
        synchronized (this.f15440d) {
            z = true;
            int i = this.f15442f + 1;
            this.f15442f = i;
            if (i == 1) {
                UUID uuidRandomUUID = UUID.randomUUID();
                this.f15443g = uuidRandomUUID;
                p7f0 p7f0Var = this.f15437a;
                if (p7f0Var != null) {
                    String.valueOf(uuidRandomUUID);
                    p7f0Var.getClass();
                }
            }
        }
        try {
            eh00Var.invoke();
            synchronized (this.f15440d) {
                try {
                    int i2 = this.f15442f - 1;
                    this.f15442f = i2;
                    if (i2 != 0) {
                        z = false;
                    }
                    if (z) {
                        p7f0 p7f0Var2 = this.f15437a;
                        if (p7f0Var2 != null) {
                            String.valueOf(this.f15443g);
                            p7f0Var2.getClass();
                        }
                        this.f15443g = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                m25877n();
            }
        } catch (Throwable th2) {
            synchronized (this.f15440d) {
                try {
                    this.f15442f--;
                    if (this.f15442f != 0) {
                        z = false;
                    }
                    if (z) {
                        p7f0 p7f0Var3 = this.f15437a;
                        if (p7f0Var3 != null) {
                            String.valueOf(this.f15443g);
                            p7f0Var3.getClass();
                        }
                        this.f15443g = null;
                    }
                    if (z) {
                        m25877n();
                    }
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.pgo
    /* JADX INFO: renamed from: e */
    public final Object mo25869e(tn61 tn61Var, Object obj, Object obj2, fbk fbkVar) {
        yfo yfoVar;
        z5a1 z5a1Var;
        if (fbkVar instanceof yfo) {
            yfoVar = (yfo) fbkVar;
            int i = yfoVar.f272304c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yfoVar.f272304c = i - Integer.MIN_VALUE;
            } else {
                yfoVar = new yfo(this, fbkVar);
            }
        } else {
            yfoVar = new yfo(this, fbkVar);
        }
        Object obj3 = yfoVar.f272302a;
        yuk yukVar = yuk.f276404a;
        int i2 = yfoVar.f272304c;
        if (i2 == 0) {
            bga.m29073P(obj3);
            synchronized (this.f15440d) {
                z5a1Var = this.f15444h;
            }
            if (z5a1Var == null) {
                throw new IllegalStateException("subscription is null");
            }
            pqm0 pqm0Var = new pqm0(new k35(tn61Var, obj), obj2);
            yfoVar.f272304c = 1;
            if (z5a1Var.mo28291c(pqm0Var, yfoVar) == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj3);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: g */
    public final void m25870g(bgo bgoVar) {
        this.f15441e.add(bgoVar);
    }

    /* JADX INFO: renamed from: h */
    public final svw0 m25871h(lho lhoVar, xfo xfoVar) {
        int i;
        String message;
        List<kho> items = lhoVar.getItems();
        ArrayList arrayList = new ArrayList(i6f.m49804T(items, 10));
        for (kho khoVar : items) {
            arrayList.add(new tvw0(khoVar.f122694a.f118762a.toString(), khoVar.f122694a.f118763b.toString(), adn.m25610v(khoVar.f122695b)));
        }
        qho qhoVar = (qho) xfoVar.f261045c.getValue();
        boolean z = qhoVar instanceof oho;
        if (z) {
            i = 2;
        } else if (qhoVar instanceof pho) {
            i = 1;
        } else {
            if (!(qhoVar instanceof nho)) {
                throw new NoWhenBranchMatchedException();
            }
            i = 3;
        }
        if (z) {
            message = String.valueOf(((oho) qhoVar).f165512a);
        } else if (qhoVar instanceof pho) {
            message = "Loading...";
        } else {
            if (!(qhoVar instanceof nho)) {
                throw new NoWhenBranchMatchedException();
            }
            message = ((nho) qhoVar).f154041a.getMessage();
        }
        UUID uuid = this.f15443g;
        return new svw0(i, message, uuid != null ? uuid.toString() : null, arrayList);
    }

    /* JADX INFO: renamed from: i */
    public final void m25872i() {
        z5a1 z5a1Var;
        synchronized (this.f15440d) {
            try {
                p7f0 p7f0Var = this.f15437a;
                if (p7f0Var != null) {
                    p7f0Var.getClass();
                }
                z5a1Var = this.f15444h;
                this.f15444h = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z5a1Var != null) {
            z5a1Var.dispose();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m25873j() {
        LinkedHashSet<vfo> linkedHashSet;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        for (k35 k35Var : (k35[]) this.f15449m.keySet().toArray(new k35[0])) {
            wj50.m88279p(k35Var);
            pjo pjoVar = (pjo) this.f15449m.remove(k35Var);
            if (pjoVar != null) {
                linkedHashMap.put(k35Var, pjoVar);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        p7f0 p7f0Var = this.f15437a;
        if (p7f0Var != null) {
            p7f0Var.getClass();
        }
        synchronized (this.f15440d) {
            try {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    this.f15445i.m81074b((k35) entry.getKey(), (pjo) entry.getValue());
                }
                linkedHashSet = new LinkedHashSet();
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Collection collection = (Set) this.f15448l.f183155a.get((k35) ((Map.Entry) it.next()).getKey());
                    if (collection == null) {
                        collection = gbu.f78413a;
                    }
                    linkedHashSet.addAll(collection);
                }
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    if (m25878o((vfo) it2.next())) {
                        z = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        p7f0 p7f0Var2 = this.f15437a;
        if (p7f0Var2 != null) {
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                k35 k35Var2 = (k35) entry2.getKey();
                pjo pjoVar2 = (pjo) entry2.getValue();
                String string = k35Var2.f118762a.toString();
                String string2 = k35Var2.f118763b.toString();
                String strMo29111F = qpv0.f191387a.mo54112b(pjoVar2.getClass()).mo29111F();
                if (strMo29111F == null) {
                    strMo29111F = "Unknown";
                }
                arrayList.add(new cea1(string, string2, strMo29111F, pjoVar2.toString()));
            }
            new bea1(linkedHashMap.size(), arrayList);
            p7f0Var2.getClass();
        }
        for (vfo vfoVar : linkedHashSet) {
            p7f0 p7f0Var3 = this.f15437a;
            if (p7f0Var3 != null) {
                p7f0Var3.getClass();
            }
            vfoVar.mo85377a();
        }
        if (z) {
            m25877n();
        }
        Set setKeySet = linkedHashMap.keySet();
        p7f0 p7f0Var4 = this.f15437a;
        if (p7f0Var4 != null) {
            this.f15445i.size();
            p7f0Var4.getClass();
        }
        Iterator it3 = this.f15441e.iterator();
        while (it3.hasNext()) {
            ((bgo) it3.next()).mo29143a(setKeySet);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m25874k(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f15449m.merge((k35) entry.getKey(), (pjo) entry.getValue(), zfo.f282353b);
        }
        if (wj50.m88271j(Looper.getMainLooper(), Looper.myLooper())) {
            m25873j();
        } else if (this.f15450n.compareAndSet(false, true)) {
            this.f15438b.post(new zu3(this, 7));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m25875l(LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        try {
            for (Map.Entry entry : this.f15439c.mo24860b(linkedHashSet).entrySet()) {
                k35 k35Var = (k35) entry.getKey();
                pjo pjoVar = (pjo) entry.getValue();
                if (linkedHashSet.contains(k35Var) && !linkedHashMap.containsKey(k35Var)) {
                    linkedHashMap.put(k35Var, pjoVar);
                }
            }
        } catch (DataSourceException unused) {
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m25876m(bgo bgoVar) {
        this.f15441e.remove(bgoVar);
    }

    /* JADX INFO: renamed from: n */
    public final void m25877n() {
        Set setM43736n1;
        synchronized (this.f15440d) {
            if (this.f15453q || !this.f15447k.isEmpty()) {
                this.f15453q = false;
                synchronized (this.f15440d) {
                    try {
                        z5a1 z5a1Var = this.f15444h;
                        if (z5a1Var == null) {
                            return;
                        }
                        LinkedHashSet linkedHashSetM43750v0 = g6f.m43750v0(this.f15447k, this.f15446j);
                        this.f15447k.clear();
                        boolean z = (linkedHashSetM43750v0.isEmpty() && this.f15454r == this.f15455s) ? false : true;
                        if (z) {
                            setM43736n1 = g6f.m43736n1(this.f15446j);
                            this.f15451o = setM43736n1;
                            this.f15455s = this.f15454r;
                        } else {
                            setM43736n1 = this.f15451o;
                        }
                        if (linkedHashSetM43750v0.isEmpty() || m25880q(z5a1Var, s601.m77305h0(setM43736n1, linkedHashSetM43750v0)) != null) {
                            Map map = null;
                            if (z) {
                                p7f0 p7f0Var = this.f15437a;
                                if (p7f0Var != null) {
                                    p7f0Var.getClass();
                                }
                                Map mapM25880q = m25880q(z5a1Var, setM43736n1);
                                if (mapM25880q == null) {
                                    return;
                                }
                                if (!mapM25880q.isEmpty()) {
                                    map = mapM25880q;
                                }
                            }
                            if (map != null) {
                                m25874k(map);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m25878o(vfo vfoVar) {
        boolean z = false;
        for (kho khoVar : vfoVar.mo85379d()) {
            tlv0 tlv0Var = this.f15445i;
            for (k35 k35Var : khoVar.m56449a(tlv0Var)) {
                if (!vfoVar.mo85378c().contains(k35Var)) {
                    tlv0Var.m81073a(k35Var);
                    if (!k35Var.m55230a() && this.f15446j.add(k35Var)) {
                        this.f15453q = true;
                        this.f15454r++;
                    }
                    pqm0 pqm0VarM69840u = pft0.m69840u(k35Var, vfoVar);
                    pxq pxqVar = this.f15448l;
                    pxqVar.getClass();
                    pxqVar.f183155a.compute(pqm0VarM69840u.f180350a, new v6i0(pqm0VarM69840u.f180351b));
                    vfoVar.mo85378c().add(k35Var);
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: p */
    public final LinkedHashMap m25879p() {
        tlv0 tlv0Var = this.f15445i;
        ReentrantReadWriteLock.ReadLock lock = tlv0Var.f221530c.readLock();
        lock.lock();
        try {
            Set setKeySet = tlv0Var.f221529b.keySet();
            int iM31820L = c95.m31820L(i6f.m49804T(setKeySet, 10));
            if (iM31820L < 16) {
                iM31820L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
            for (Object obj : setKeySet) {
                Object obj2 = (pjo) tlv0Var.f221528a.get(obj);
                if (obj2 == null) {
                    obj2 = njo.f154639a;
                }
                linkedHashMap.put(obj, obj2);
            }
            return linkedHashMap;
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: q */
    public final Map m25880q(z5a1 z5a1Var, Set set) {
        boolean z;
        Map mapMo28289a;
        boolean z2;
        synchronized (this.f15440d) {
            z = this.f15444h == z5a1Var;
        }
        if (!z) {
            return null;
        }
        try {
            mapMo28289a = z5a1Var.mo28289a(set);
        } catch (IllegalStateException e) {
            synchronized (this.f15440d) {
                if (this.f15444h == z5a1Var) {
                    throw e;
                }
                mapMo28289a = null;
            }
        }
        if (mapMo28289a == null) {
            return null;
        }
        synchronized (this.f15440d) {
            z2 = this.f15444h == z5a1Var;
        }
        if (z2) {
            return mapMo28289a;
        }
        return null;
    }
}
