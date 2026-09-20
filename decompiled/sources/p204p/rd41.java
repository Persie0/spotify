package p204p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes8.dex */
public final class rd41 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f198031a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yd41 f198032b;

    public /* synthetic */ rd41(yd41 yd41Var, int i) {
        this.f198031a = i;
        this.f198032b = yd41Var;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.app.Service, p.zd41] */
    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f198031a) {
            case 0:
                yd41.m93384a(this.f198032b, (Throwable) obj);
                break;
            case 1:
                Throwable th = (Throwable) obj;
                if (!(th instanceof TimeoutException)) {
                    na6.m63959g("Failed to connect to EIP", th);
                }
                yd41.m93384a(this.f198032b, th);
                break;
            default:
                this.f198032b.f271650f.mo13462g((String) obj);
                break;
        }
    }
}
