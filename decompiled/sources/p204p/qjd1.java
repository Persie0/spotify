package p204p;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class qjd1 implements Iterable {

    /* JADX INFO: renamed from: a */
    public final HashSet f189223a = new HashSet();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        pjd1 pjd1Var = new pjd1();
        pjd1Var.f178229a = this.f189223a.iterator();
        return pjd1Var;
    }
}
