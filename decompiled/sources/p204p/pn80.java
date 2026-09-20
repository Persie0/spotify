package p204p;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class pn80 extends whc0 {

    /* JADX INFO: renamed from: c */
    public final on80 f179343c;

    public pn80(rr60 rr60Var, rr60 rr60Var2) {
        super(rr60Var, rr60Var2);
        this.f179343c = new on80("kotlin.collections.LinkedHashMap", rr60Var.getDescriptor(), rr60Var2.getDescriptor());
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: a */
    public final Object mo61921a() {
        return new LinkedHashMap();
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: b */
    public final int mo61922b(Object obj) {
        return ((LinkedHashMap) obj).size() * 2;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: c */
    public final Iterator mo60861c(Object obj) {
        return ((Map) obj).entrySet().iterator();
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: d */
    public final int mo24520d(Object obj) {
        return ((Map) obj).size();
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: g */
    public final Object mo24522g(Object obj) {
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return this.f179343c;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: h */
    public final Object mo61923h(Object obj) {
        return (LinkedHashMap) obj;
    }
}
