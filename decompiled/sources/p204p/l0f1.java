package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0f1 extends h0f1 implements Set {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f128420h = 0;

    /* JADX INFO: renamed from: g */
    public transient m0f1 f128421g;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return set.size() == 0 && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
