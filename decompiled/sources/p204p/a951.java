package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Update;
import com.spotify.mobius.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class a951 extends mic1 implements c851 {

    /* JADX INFO: renamed from: b */
    public final MobiusLoop f13475b;

    /* JADX INFO: renamed from: c */
    public final xoi0 f13476c;

    /* JADX INFO: renamed from: d */
    public final Disposable f13477d;

    /* JADX INFO: renamed from: f */
    public final zv41 f13479f;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f13478e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g */
    public final ConcurrentHashMap f13480g = new ConcurrentHashMap();

    public a951(List list, List list2, Map map) {
        Object obj;
        this.f13479f = jag1.m52819d(new x851(map));
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((wsa0) it.next()).mo24835b());
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            while (it2.hasNext()) {
                next = new jv6(1, (Update) next, (Update) it2.next());
            }
            obj = next;
        } else {
            obj = null;
        }
        Update update = (Update) obj;
        update = update == null ? mfr0.f143142E : update;
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Connectable connectableMo24834a = ((wsa0) it3.next()).mo24834a();
            if (connectableMo24834a != null) {
                arrayList2.add(connectableMo24834a);
            }
        }
        MobiusLoop mobiusLoopMo15595g = Mobius.m15582d(update, new l2c(arrayList2, 2)).mo15597i(new l2c(list2, 2)).mo15595g(map);
        this.f13475b = mobiusLoopMo15595g;
        this.f13476c = new xoi0(map);
        this.f13477d = mobiusLoopMo15595g.m15601b(new hz0(this, 23));
    }

    @Override // p204p.mic1
    /* JADX INFO: renamed from: d */
    public final void mo15620d() {
        this.f13475b.dispose();
        this.f13477d.dispose();
    }

    /* JADX INFO: renamed from: e */
    public final void m25075e(Object obj) {
        this.f13475b.m15600a(obj);
    }

    /* JADX INFO: renamed from: f */
    public final xv41 m25076f(Class cls) {
        ConcurrentHashMap concurrentHashMap = this.f13480g;
        Object objM31029u = concurrentHashMap.get(cls);
        if (objM31029u == null) {
            zv41 zv41Var = this.f13479f;
            objM31029u = bzf1.m31029u(new hs01(zv41Var, cls, 22), pic1.m70100a(this), hf11.f90581a, hdg1.m47202r(cls, ((x851) zv41Var.getValue()).f259055a));
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objM31029u);
            if (objPutIfAbsent != null) {
                objM31029u = objPutIfAbsent;
            }
        }
        return (xv41) objM31029u;
    }

    /* JADX INFO: renamed from: g */
    public final pqm0 m25077g(Class cls) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = this.f13478e;
        Object objM77676o = concurrentHashMap.get(cls);
        xoi0 xoi0Var = this.f13476c;
        if (objM77676o == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, (objM77676o = sam.m77676o(sam.m77684w(xoi0Var, new egq0(cls, 1)))))) != null) {
            objM77676o = objPutIfAbsent;
        }
        Object objMo33098e = xoi0Var.mo33098e();
        wj50.m88279p(objMo33098e);
        return new pqm0((ck90) objM77676o, hdg1.m47202r(cls, (Map) objMo33098e));
    }
}
