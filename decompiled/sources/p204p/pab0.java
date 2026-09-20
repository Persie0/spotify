package p204p;

import io.reactivex.rxjava3.functions.Function;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class pab0 implements Function {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f175463a;

    public pab0(LinkedHashMap linkedHashMap) {
        this.f175463a = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public Object m69457a(Object obj) {
        return this.f175463a.get(obj);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return kkc0.m56700m0(this.f175463a, (Map) obj);
    }

    /* JADX INFO: renamed from: b */
    public Set m69458b() {
        return this.f175463a.entrySet();
    }

    /* JADX INFO: renamed from: c */
    public boolean m69459c() {
        return this.f175463a.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public Object m69460d(Object obj, Object obj2) {
        return this.f175463a.put(obj, obj2);
    }

    /* JADX INFO: renamed from: e */
    public Object m69461e(Object obj) {
        return this.f175463a.remove(obj);
    }

    public pab0() {
        this.f175463a = new LinkedHashMap(0, 0.75f, true);
    }
}
