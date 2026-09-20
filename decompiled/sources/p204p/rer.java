package p204p;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

/* JADX INFO: loaded from: classes6.dex */
public final class rer implements Function {

    /* JADX INFO: renamed from: b */
    public static final rer f198416b = new rer(0);

    /* JADX INFO: renamed from: c */
    public static final rer f198417c = new rer(1);

    /* JADX INFO: renamed from: d */
    public static final rer f198418d = new rer(2);

    /* JADX INFO: renamed from: e */
    public static final rer f198419e = new rer(3);

    /* JADX INFO: renamed from: f */
    public static final rer f198420f = new rer(4);

    /* JADX INFO: renamed from: g */
    public static final rer f198421g = new rer(5);

    /* JADX INFO: renamed from: h */
    public static final rer f198422h = new rer(6);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f198423a;

    public /* synthetic */ rer(int i) {
        this.f198423a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f198423a) {
            case 0:
                return ConcurrentHashMap.newKeySet();
            case 1:
                return j0g1.m52092t(1, 0, 0, 6);
            case 2:
                return j0g1.m52092t(1, 0, 0, 6);
            case 3:
                return xtm0.m92080a(-2, 0, 6);
            case 4:
                return xtm0.m92080a(-2, 0, 6);
            case 5:
                return jag1.m52819d(null);
            default:
                return new CopyOnWriteArrayList();
        }
    }
}
