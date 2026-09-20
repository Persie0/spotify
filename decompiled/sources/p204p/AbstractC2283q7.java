package p204p;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: p.q7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2283q7 extends AbstractC1888g8 implements lz80 {
    @Override // p204p.AbstractC1888g8, p204p.eai0
    public final Collection get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // p204p.AbstractC1888g8
    /* JADX INFO: renamed from: l */
    public final Collection mo43938l(Object obj, Collection collection) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new C2640z7(this, obj, list, null) : new C1805e8(this, obj, list, null);
    }

    /* JADX INFO: renamed from: m */
    public final List m72264m(Object obj) {
        return (List) super.get(obj);
    }
}
