package p204p;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class nrf1 extends PhantomReference {

    /* JADX INFO: renamed from: a */
    public final Set f157549a;

    /* JADX INFO: renamed from: b */
    public final j6f1 f157550b;

    public /* synthetic */ nrf1(uge ugeVar, ReferenceQueue referenceQueue, Set set, j6f1 j6f1Var) {
        super(ugeVar, referenceQueue);
        this.f157549a = set;
        this.f157550b = j6f1Var;
    }
}
