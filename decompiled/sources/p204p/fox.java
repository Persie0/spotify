package p204p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes3.dex */
public final class fox implements Function {

    /* JADX INFO: renamed from: a */
    public final Object f71637a;

    public fox(Object obj) {
        this.f71637a = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return new pqm0(this.f71637a, (e301) obj);
    }

    public fox() {
        this.f71637a = new Object();
    }
}
