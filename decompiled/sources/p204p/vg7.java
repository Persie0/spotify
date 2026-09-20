package p204p;

import com.spotify.authentication.login5esperanto.EsCodeRequired$CodeRequiredProceedResult;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes5.dex */
public final class vg7 implements Function, zs50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eh00 f241172a;

    public vg7(eh00 eh00Var) {
        this.f241172a = eh00Var;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        this.f241172a.invoke();
        return ng7.f153572c[((EsCodeRequired$CodeRequiredProceedResult) obj).m3613n().m3607o().ordinal()] == 1 ? new uzt(new nh7(400, "Esperanto failure: unknown context")) : new uzt(new nh7(400, "Esperanto failure: incomplete response"));
    }

    @Override // p204p.zs50
    /* JADX INFO: renamed from: f */
    public void mo42543f() {
        eh00 eh00Var = this.f241172a;
        if (eh00Var != null) {
            eh00Var.invoke();
        }
    }

    public vg7(eh00 eh00Var, yg7 yg7Var) {
        this.f241172a = eh00Var;
    }
}
