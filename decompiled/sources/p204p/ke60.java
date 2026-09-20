package p204p;

import org.chromium.net.impl.CallbackExceptionImpl;
import org.chromium.net.impl.CronetExceptionImpl;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class ke60 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121812a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ue60 f121813b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ve60 f121814c;

    public /* synthetic */ ke60(ue60 ue60Var, ve60 ve60Var, int i) {
        this.f121812a = i;
        this.f121813b = ue60Var;
        this.f121814c = ve60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f121812a) {
            case 0:
                try {
                    this.f121814c.mo98370run();
                } catch (Throwable th) {
                    this.f121813b.m82893b(new CallbackExceptionImpl("Exception received from UploadDataProvider", th));
                    return;
                }
                break;
            case 1:
                try {
                    this.f121814c.mo98370run();
                } catch (Throwable th2) {
                    ue60 ue60Var = this.f121813b;
                    ue60Var.m82894c(new me60(ue60Var, 1), "enterUserErrorState");
                    ue60Var.m82893b(new CallbackExceptionImpl("Exception received from UrlRequest.Callback", th2));
                    return;
                }
                break;
            default:
                ve60 ve60Var = this.f121814c;
                ue60 ue60Var2 = this.f121813b;
                ue60Var2.getClass();
                try {
                    ve60Var.mo98370run();
                } catch (Throwable th3) {
                    ue60Var2.m82893b(new CronetExceptionImpl("System error", th3));
                }
                break;
        }
    }
}
