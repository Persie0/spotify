package p204p;

import com.spotify.authentication.login5esperanto.EsInteractionRequired$InteractionRequiredProceedResult;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes5.dex */
public final class wg7 implements Function, qaq0 {

    /* JADX INFO: renamed from: a */
    public final eh00 f250999a;

    public wg7(eh00 eh00Var, yg7 yg7Var) {
        this.f250999a = eh00Var;
    }

    @Override // p204p.qaq0
    /* JADX INFO: renamed from: a */
    public long mo26626a(c450 c450Var, long j, ko70 ko70Var, long j2) {
        long j3 = ((y350) this.f250999a.invoke()).f268755a;
        return (((long) m3h1.m60676k(c450Var.f33848a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), ko70Var == ko70.f124556a)) << 32) | (((long) m3h1.m60676k(c450Var.f33849b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        this.f250999a.invoke();
        return ng7.f153574e[((EsInteractionRequired$InteractionRequiredProceedResult) obj).m3633n().m3627o().ordinal()] == 1 ? new i850(new nh7(400, "Esperanto failure: unknown context")) : new i850(new nh7(400, "Esperanto failure: incomplete response"));
    }

    public wg7(eh00 eh00Var) {
        this.f250999a = eh00Var;
    }
}
