package p204p;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes5.dex */
public final class yqc implements Function {

    /* JADX INFO: renamed from: a */
    public final qe70 f275189a;

    /* JADX WARN: Multi-variable type inference failed */
    public yqc(gh00 gh00Var) {
        this.f275189a = (qe70) gh00Var;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [p.qe70, p.th00] */
    /* JADX INFO: renamed from: a */
    public void m94336a(String str, String str2, d850 d850Var) {
        this.f275189a.invoke(edb.m38566o("spotify:audiobook:chapter-playback-confirmation:", wl51.m88482f1(':', str, str), ":", wl51.m88482f1(':', str2, str2)), d850Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.gh00, p.qe70] */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return (ObservableSource) this.f275189a.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yqc(th00 th00Var) {
        this.f275189a = (qe70) th00Var;
    }
}
