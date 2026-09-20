package p204p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class mbq implements zk61, Function {

    /* JADX INFO: renamed from: a */
    public final ArrayList f141956a;

    public /* synthetic */ mbq(ArrayList arrayList) {
        this.f141956a = arrayList;
    }

    @Override // p204p.zk61
    /* JADX INFO: renamed from: a */
    public void mo40486a(vk61 vk61Var, int i) {
        vk61Var.m85802a(((qdm) this.f141956a.get(i)).f187711a);
        jpg1.m53938t(vk61Var);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        ld50 ld50VarM6864p = ((CollectionPlatformEsperantoContainsResponse) obj).m6873o().m6864p();
        ArrayList arrayList = this.f141956a;
        Map mapM56705r0 = kkc0.m56705r0(g6f.m43746s1(arrayList, ld50VarM6864p));
        int iM31820L = c95.m31820L(i6f.m49804T(arrayList, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (Object obj2 : arrayList) {
            Boolean bool = (Boolean) mapM56705r0.get((String) obj2);
            linkedHashMap.put(obj2, Boolean.valueOf(bool != null ? bool.booleanValue() : false));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: b */
    public void m61421b(Object obj) {
        this.f141956a.add(obj);
    }

    /* JADX INFO: renamed from: c */
    public void m61422c(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = this.f141956a;
        if (z) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public int m61423d() {
        return this.f141956a.size();
    }

    /* JADX INFO: renamed from: e */
    public Object[] m61424e(Object[] objArr) {
        return this.f141956a.toArray(objArr);
    }

    public mbq(int i) {
        this.f141956a = new ArrayList(i);
    }
}
