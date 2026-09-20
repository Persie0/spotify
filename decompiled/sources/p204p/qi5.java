package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class qi5 extends ArrayList implements en91 {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof fn91) {
            return super.contains((fn91) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof fn91) {
            return super.indexOf((fn91) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof fn91) {
            return super.lastIndexOf((fn91) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof fn91) {
            return super.remove((fn91) obj);
        }
        return false;
    }
}
