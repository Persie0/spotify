package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: classes8.dex */
public final class p8d0 implements n8d0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f174943a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f174944b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f174945c;

    /* JADX WARN: Multi-variable type inference failed */
    public p8d0(gh00 gh00Var, zvm0 zvm0Var) {
        this.f174944b = (qe70) gh00Var;
        this.f174945c = zvm0Var;
    }

    @Override // p204p.n8d0
    /* JADX INFO: renamed from: a */
    public final void mo63841a() {
        switch (this.f174943a) {
            case 0:
                Logger.m3966b("MBS: Failure setting callback for session %s", (zvm0) this.f174945c);
                break;
            default:
                ((SingleEmitter) this.f174944b).onError(new IllegalArgumentException(edb.m38564m("Couldn't resolve callback handler for package name ", (String) this.f174945c)));
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [p.gh00, p.qe70] */
    @Override // p204p.n8d0
    /* JADX INFO: renamed from: b */
    public final void mo63842b(o9d0 o9d0Var) {
        switch (this.f174943a) {
            case 0:
                ((qe70) this.f174944b).invoke(o9d0Var);
                break;
            default:
                ((SingleEmitter) this.f174944b).onSuccess(o9d0Var);
                break;
        }
    }

    public p8d0(SingleEmitter singleEmitter, String str) {
        this.f174944b = singleEmitter;
        this.f174945c = str;
    }
}
