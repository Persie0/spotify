package p204p;

import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes8.dex */
public final class qm90 implements Function, BiFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Long f190165a;

    public /* synthetic */ qm90(Long l) {
        this.f190165a = l;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return Long.valueOf((((Long) obj).longValue() * ((long) 1000)) + this.f190165a.longValue());
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        long jLongValue = ((Long) obj).longValue();
        Long l = this.f190165a;
        wj50.m88279p(l);
        return new yl81(jLongValue, (String) obj2, l.longValue());
    }
}
