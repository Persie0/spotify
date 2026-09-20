package p204p;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final class nfn0 implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ofn0 f153402a;

    public nfn0(ofn0 ofn0Var) {
        this.f153402a = ofn0Var;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        ska1 ska1Var = (ska1) ((Map.Entry) obj).getValue();
        ((wy3) this.f153402a.f164872b).getClass();
        return System.currentTimeMillis() - ska1Var.m78368a() > ((long) 86400000);
    }
}
