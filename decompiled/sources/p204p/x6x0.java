package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class x6x0 {
    /* JADX INFO: renamed from: a */
    public final x6x0 m90106a(Object obj) {
        if (this instanceof k6x0) {
            return new k6x0(obj);
        }
        if ((this instanceof r6x0) || (this instanceof y5x0)) {
            return this;
        }
        throw new NoWhenBranchMatchedException();
    }
}
