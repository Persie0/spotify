package p204p;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: p.f8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1851f8 extends AbstractC1732c8 implements Set {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ qd20 f66814f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1851f8(qd20 qd20Var, Object obj, Set set) {
        super(qd20Var, obj, set, null);
        this.f66814f = qd20Var;
    }

    @Override // p204p.AbstractC1732c8, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zM45238B = gmg1.m45238B((Set) this.f35054b, collection);
        if (zM45238B) {
            this.f66814f.f77372f += this.f35054b.size() - size;
            m31767d();
        }
        return zM45238B;
    }
}
