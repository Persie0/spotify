package p204p;

import java.util.Set;

/* JADX INFO: renamed from: p.q9 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2285q9 extends AbstractC2282q6 implements Set {
    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return yjg1.m93926r(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return yjg1.m93930v(this);
    }
}
