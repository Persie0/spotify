package p204p;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class o601 extends r601 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f162184b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Set f162185c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Set f162186d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o601(int i, Set set, Set set2) {
        super(1);
        this.f162184b = i;
        this.f162185c = set;
        this.f162186d = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f162184b) {
            case 0:
                return this.f162185c.contains(obj) && this.f162186d.contains(obj);
            default:
                return this.f162185c.contains(obj) && !((zh21) this.f162186d).f282787d.equals(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f162184b) {
            case 0:
                return this.f162185c.containsAll(collection) && this.f162186d.containsAll(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f162184b) {
            case 0:
                return Collections.disjoint(this.f162186d, this.f162185c);
            default:
                return ((zh21) this.f162186d).containsAll(this.f162185c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f162184b) {
            case 0:
                return new nw50(this);
            default:
                return new nw50(this, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f162184b) {
            case 0:
                Iterator it = this.f162185c.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (this.f162186d.contains(it.next())) {
                        i++;
                    }
                }
                return i;
            default:
                Iterator it2 = this.f162185c.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    if (!((zh21) this.f162186d).f282787d.equals(it2.next())) {
                        i2++;
                    }
                }
                return i2;
        }
    }
}
