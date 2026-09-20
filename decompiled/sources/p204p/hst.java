package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class hst implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f94800a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ist f94801b;

    public /* synthetic */ hst(ist istVar, int i) {
        this.f94800a = i;
        this.f94801b = istVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f94800a) {
            case 0:
                ist istVar = this.f94801b;
                istVar.getClass();
                Logger.m3967c((Throwable) obj, "Failed to fetch Samsung Token", new Object[0]);
                istVar.f105311e.mo33104m(new m18("Failed to fetch Samsung Token", "", 3, ""));
                break;
            case 1:
                ist istVar2 = this.f94801b;
                istVar2.getClass();
                i2y0 i2y0Var = (i2y0) ((j2y0) obj);
                istVar2.f105311e.mo33104m(new m18("", i2y0Var.f97941b, 1, i2y0Var.f97942c));
                break;
            default:
                Throwable th = (Throwable) obj;
                ist istVar3 = this.f94801b;
                m18 m18Var = (m18) istVar3.f105311e.mo33098e();
                if ((m18Var != null ? m18Var.f138862a : 0) != 3) {
                    Logger.m3967c(th, "Failed to do effortless login", new Object[0]);
                    istVar3.f105311e.mo33104m(new m18("Failed to do effortless login", "", 3, ""));
                    break;
                }
                break;
        }
    }
}
