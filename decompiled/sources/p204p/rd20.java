package p204p;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class rd20 extends m5f {

    /* JADX INFO: renamed from: b */
    public final kj5 f198013b;

    public rd20(rr60 rr60Var) {
        super(rr60Var);
        this.f198013b = new kj5(rr60Var.getDescriptor(), 1);
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: a */
    public final Object mo61921a() {
        return new HashSet();
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: b */
    public final int mo61922b(Object obj) {
        return ((HashSet) obj).size();
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: g */
    public final Object mo24522g(Object obj) {
        Set set = (Set) obj;
        HashSet hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet(set) : hashSet;
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return this.f198013b;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: h */
    public final Object mo61923h(Object obj) {
        return (HashSet) obj;
    }

    @Override // p204p.i4f
    /* JADX INFO: renamed from: i */
    public final void mo49673i(int i, Object obj, Object obj2) {
        ((HashSet) obj).add(obj2);
    }
}
