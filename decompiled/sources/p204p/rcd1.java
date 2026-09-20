package p204p;

import java.lang.ref.WeakReference;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes11.dex */
public final class rcd1 implements Predicate {

    /* JADX INFO: renamed from: b */
    public static final rcd1 f197848b = new rcd1(0);

    /* JADX INFO: renamed from: c */
    public static final rcd1 f197849c = new rcd1(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f197850a;

    public /* synthetic */ rcd1(int i) {
        this.f197850a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        zv41 zv41Var;
        switch (this.f197850a) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                lg21 lg21Var = (lg21) weakReference.get();
                return !(lg21Var == null || (zv41Var = lg21Var.f133058d.f215176b) == null || !((Boolean) zv41Var.getValue()).booleanValue()) || weakReference.get() == null;
            default:
                return ((Boolean) ((lg21) obj).f133058d.f215176b.getValue()).booleanValue();
        }
    }
}
