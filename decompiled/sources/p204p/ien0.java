package p204p;

import android.content.Intent;
import android.net.Uri;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes9.dex */
public final class ien0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f101475a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ len0 f101476b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ilt f101477c;

    public /* synthetic */ ien0(len0 len0Var, ilt iltVar, int i) {
        this.f101475a = i;
        this.f101476b = len0Var;
        this.f101477c = iltVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f101475a) {
            case 0:
                len0 len0Var = this.f101476b;
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData((Uri) obj);
                try {
                    a500 a500Var = len0Var.f132610F1;
                    if (a500Var != null) {
                        a500Var.mo24737a(intent);
                        return;
                    } else {
                        wj50.m88260d0("launcher");
                        throw null;
                    }
                } catch (Exception e) {
                    len0Var.m58799j1().m15621f(new vzw(this.f101477c.f103475a, e));
                    return;
                }
            default:
                this.f101476b.m58799j1().m15621f(new vzw(this.f101477c.f103475a, (Throwable) obj));
                return;
        }
    }
}
