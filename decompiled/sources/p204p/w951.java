package p204p;

import io.reactivex.rxjava3.core.ObservableEmitter;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class w951 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f249083a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ y951 f249084b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ObservableEmitter f249085c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w951(y951 y951Var, ObservableEmitter observableEmitter, int i) {
        super(1);
        this.f249083a = i;
        this.f249084b = y951Var;
        this.f249085c = observableEmitter;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Object obj2;
        int i = this.f249083a;
        w2a1 w2a1Var = w2a1.f247311a;
        ObservableEmitter observableEmitter = this.f249085c;
        y951 y951Var = this.f249084b;
        switch (i) {
            case 0:
                v951 v951Var = y951Var.f270515f;
                int iOrdinal = ((cc51) obj).ordinal();
                if (iOrdinal == 0) {
                    obj2 = zua1.f286398a;
                } else if (iOrdinal != 1) {
                    Object obj3 = bva1.f31318a;
                    yua1 yua1Var = yua1.f276293a;
                    if (iOrdinal == 2) {
                        WeakHashMap weakHashMap = mec1.f142677a;
                        if (v951Var.getLayoutDirection() == 1) {
                            obj3 = yua1Var;
                        }
                        obj2 = obj3;
                    } else if (iOrdinal == 3) {
                        WeakHashMap weakHashMap2 = mec1.f142677a;
                        if (v951Var.getLayoutDirection() != 1) {
                            obj3 = yua1Var;
                        }
                        obj2 = obj3;
                    } else {
                        if (iOrdinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = vua1.f244903a;
                    }
                } else {
                    obj2 = dva1.f53408a;
                }
                observableEmitter.onNext(obj2);
                return w2a1Var;
            default:
                ((Number) obj).intValue();
                if (y951Var.f270510a.f31169b) {
                    observableEmitter.onNext(uua1.f234142a);
                }
                return w2a1Var;
        }
    }
}
