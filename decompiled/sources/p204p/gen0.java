package p204p;

import io.reactivex.rxjava3.functions.Consumer;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class gen0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f79156a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ len0 f79157b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f79158c;

    public /* synthetic */ gen0(len0 len0Var, String str, int i) {
        this.f79156a = i;
        this.f79157b = len0Var;
        this.f79158c = str;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f79156a) {
            case 0:
                int iOrdinal = ((e7l0) obj).ordinal();
                String str = this.f79158c;
                len0 len0Var = this.f79157b;
                if (iOrdinal == 0) {
                    len0Var.m58799j1().m15621f(new qzw(str));
                    return;
                } else if (iOrdinal == 1) {
                    len0Var.m58799j1().m15621f(new hww(str, null));
                    return;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    len0Var.m58799j1().m15621f(new hww(str, new IllegalStateException("onBeforeStartPayment returned a failure")));
                    return;
                }
            default:
                Throwable th = (Throwable) obj;
                na6.m63959g("Failed when invoking onBeforeStartPayment callback", th);
                this.f79157b.m58799j1().m15621f(new hww(this.f79158c, th));
                return;
        }
    }
}
