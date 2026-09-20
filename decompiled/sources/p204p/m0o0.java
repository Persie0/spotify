package p204p;

import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: classes11.dex */
public final class m0o0 {

    /* JADX INFO: renamed from: a */
    public final wg61 f138708a;

    /* JADX INFO: renamed from: b */
    public final wg61 f138709b;

    public m0o0(yse1 yse1Var) {
        this.f138708a = new wg61(new l0o0(yse1Var, 0));
        this.f138709b = new wg61(new l0o0(yse1Var, 1));
    }

    /* JADX INFO: renamed from: a */
    public final ObservableTransformer m60469a() {
        return (ObservableTransformer) this.f138708a.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final ObservableTransformer m60470b() {
        return (ObservableTransformer) this.f138709b.getValue();
    }
}
