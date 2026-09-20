package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes.dex */
public final class g5t0 {

    /* JADX INFO: renamed from: a */
    public final cgr0 f76767a;

    /* JADX INFO: renamed from: b */
    public final zv41 f76768b = jag1.m52819d(null);

    public g5t0(cgr0 cgr0Var) {
        this.f76767a = cgr0Var;
    }

    /* JADX INFO: renamed from: a */
    public final nnc m43618a(String str, gh00 gh00Var) {
        Logger.m3965a(s571.m77251j("[PubSubClientImpl] getObservableOf called for ident ", str, "."), new Object[0]);
        return xtm0.m92074U(this.f76768b, new ju5(null, new dcq0(str, this, gh00Var, 7), 2));
    }

    /* JADX INFO: renamed from: b */
    public final Observable m43619b(String str, gh00 gh00Var) {
        return k0e1.m54988g(m43618a(str, gh00Var), dau.f47107a);
    }
}
