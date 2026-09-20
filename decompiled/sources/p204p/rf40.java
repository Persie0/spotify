package p204p;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface rf40 extends List, Collection, pq60 {
    @Override // java.util.List
    default rf40 subList(int i, int i2) {
        return new of40(this, i, i2);
    }
}
