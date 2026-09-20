package p204p;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class ttf extends tvl0 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Comparator f223584a;

    public ttf(Comparator comparator) {
        comparator.getClass();
        this.f223584a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f223584a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ttf) {
            return this.f223584a.equals(((ttf) obj).f223584a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f223584a.hashCode();
    }

    public final String toString() {
        return this.f223584a.toString();
    }
}
