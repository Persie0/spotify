package p204p;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: p.s8 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2366s8 extends AbstractList implements List, rq60 {
    /* JADX INFO: renamed from: a */
    public abstract int mo47661a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo47662b(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return mo47662b(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo47661a();
    }
}
