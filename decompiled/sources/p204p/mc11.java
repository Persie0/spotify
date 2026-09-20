package p204p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes11.dex */
public final class mc11 implements Function {

    /* JADX INFO: renamed from: a */
    public final hv31 f142012a;

    /* JADX INFO: renamed from: b */
    public final fv31 f142013b;

    public mc11(hv31 hv31Var, fv31 fv31Var) {
        this.f142012a = hv31Var;
        this.f142013b = fv31Var;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return Boolean.valueOf(this.f142012a.mo48713h(this.f142013b, false));
    }

    public mc11(hv31 hv31Var) {
        this.f142012a = hv31Var;
        this.f142013b = fv31.f73628b.m78181M("watch_feed_header_onboarding_seen");
    }
}
