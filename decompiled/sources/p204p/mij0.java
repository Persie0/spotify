package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes8.dex */
public final class mij0 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f144035a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nij0 f144036b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f144037c;

    public /* synthetic */ mij0(nij0 nij0Var, String str, int i) {
        this.f144035a = i;
        this.f144036b = nij0Var;
        this.f144037c = str;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f144035a) {
            case 0:
                this.f144036b.f154274b.onNext(new pqm0(this.f144037c, o2x0.m66140c(Boolean.TRUE)));
                break;
            default:
                this.f144036b.f154274b.onNext(new pqm0(this.f144037c, o2x0.m66140c(Boolean.FALSE)));
                break;
        }
    }
}
