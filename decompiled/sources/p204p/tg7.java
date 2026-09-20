package p204p;

import com.spotify.authentication.login5esperanto.EsCodeRequired$CodeRequiredResendResult;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes5.dex */
public final class tg7 implements Function, dac1, zs50 {

    /* JADX INFO: renamed from: a */
    public final eh00 f220133a;

    public /* synthetic */ tg7(eh00 eh00Var) {
        this.f220133a = eh00Var;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        this.f220133a.invoke();
        return ng7.f153571b[((EsCodeRequired$CodeRequiredResendResult) obj).m3620n().m3616o().ordinal()] == 1 ? new vyx0(new nh7(400, "Esperanto failure: unknown context")) : new vyx0(new nh7(400, "Esperanto failure: incomplete response"));
    }

    @Override // p204p.dac1
    /* JADX INFO: renamed from: e */
    public void mo28351e() {
        this.f220133a.invoke();
    }

    @Override // p204p.zs50
    /* JADX INFO: renamed from: f */
    public void mo42543f() {
        eh00 eh00Var = this.f220133a;
        if (eh00Var != null) {
            eh00Var.invoke();
        }
    }

    public tg7(eh00 eh00Var, yg7 yg7Var) {
        this.f220133a = eh00Var;
    }

    @Override // p204p.dac1
    /* JADX INFO: renamed from: a */
    public void mo28347a() {
    }

    @Override // p204p.dac1
    /* JADX INFO: renamed from: c */
    public void mo28349c() {
    }
}
