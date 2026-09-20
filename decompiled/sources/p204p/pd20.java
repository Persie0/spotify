package p204p;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class pd20 extends whc0 {

    /* JADX INFO: renamed from: c */
    public final od20 f176338c;

    public pd20(rr60 rr60Var, rr60 rr60Var2) {
        super(rr60Var, rr60Var2);
        this.f176338c = new od20("kotlin.collections.HashMap", rr60Var.getDescriptor(), rr60Var2.getDescriptor());
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: a */
    public final Object mo61921a() {
        return new HashMap();
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: b */
    public final int mo61922b(Object obj) {
        return ((HashMap) obj).size() * 2;
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
        HashMap map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap(map) : map2;
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return this.f176338c;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: h */
    public final Object mo61923h(Object obj) {
        return (HashMap) obj;
    }
}
