package p204p;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes10.dex */
public final class q9v implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f186670a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f186671b;

    public /* synthetic */ q9v(int i, long j) {
        this.f186670a = i;
        this.f186671b = j;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f186670a) {
            case 0:
                return this.f186671b - ((p9v) ((Map.Entry) obj).getValue()).f175305b >= 60000;
            default:
                return ((tbf0) obj).f218845b < this.f186671b;
        }
    }
}
