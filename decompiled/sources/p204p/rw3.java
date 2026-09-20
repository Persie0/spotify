package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes3.dex */
public final class rw3 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f203240a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe70 f203241b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qe70 f203242c;

    /* JADX WARN: Multi-variable type inference failed */
    public rw3(gh00 gh00Var, eh00 eh00Var, int i) {
        this.f203240a = i;
        switch (i) {
            case 1:
                this.f203241b = (qe70) gh00Var;
                this.f203242c = (qe70) eh00Var;
                break;
            default:
                this.f203241b = (qe70) gh00Var;
                this.f203242c = (qe70) eh00Var;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r0v6, types: [p.eh00, p.qe70] */
    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f203240a) {
            case 0:
                Logger.m3965a("Search got disposed, onSuccess was: " + this.f203241b, new Object[0]);
                this.f203242c.invoke();
                break;
            default:
                Logger.m3965a("MBS: Search got disposed, onSuccess was: %s", this.f203241b);
                this.f203242c.invoke();
                break;
        }
    }
}
