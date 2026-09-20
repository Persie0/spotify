package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bdp implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26192a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f26193b;

    public /* synthetic */ bdp(int i, eh00 eh00Var) {
        this.f26192a = i;
        this.f26193b = eh00Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final /* synthetic */ void run() {
        switch (this.f26192a) {
            case 0:
                this.f26193b.invoke();
                break;
            default:
                this.f26193b.invoke();
                break;
        }
    }
}
