package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xz50 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f267526a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe70 f267527b;

    /* JADX WARN: Multi-variable type inference failed */
    public xz50(int i, eh00 eh00Var) {
        this.f267526a = i;
        switch (i) {
            case 1:
                this.f267527b = (qe70) eh00Var;
                break;
            case 2:
                this.f267527b = (qe70) eh00Var;
                break;
            default:
                this.f267527b = (qe70) eh00Var;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r0v2, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r0v3, types: [p.eh00, p.qe70] */
    @Override // io.reactivex.rxjava3.functions.Action
    public final /* synthetic */ void run() {
        switch (this.f267526a) {
            case 0:
                this.f267527b.invoke();
                break;
            case 1:
                this.f267527b.invoke();
                break;
            default:
                this.f267527b.invoke();
                break;
        }
    }
}
