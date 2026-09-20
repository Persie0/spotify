package p204p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public abstract class m5f extends i4f {
    public m5f(rr60 rr60Var) {
        super(rr60Var);
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: c */
    public final Iterator mo60861c(Object obj) {
        return ((Collection) obj).iterator();
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: d */
    public final int mo24520d(Object obj) {
        return ((Collection) obj).size();
    }
}
