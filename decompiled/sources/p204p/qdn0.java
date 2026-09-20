package p204p;

import com.spotify.payment.callback.PaymentCallbackActivity;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class qdn0 implements dqk0, gi00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f187725a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PaymentCallbackActivity f187726b;

    public /* synthetic */ qdn0(PaymentCallbackActivity paymentCallbackActivity, int i) {
        this.f187725a = i;
        this.f187726b = paymentCallbackActivity;
    }

    @Override // p204p.dqk0
    /* JADX INFO: renamed from: b */
    public final void mo31453b(Object obj) {
        int i = this.f187725a;
        PaymentCallbackActivity paymentCallbackActivity = this.f187726b;
        switch (i) {
            case 0:
                int i2 = PaymentCallbackActivity.f6416e1;
                paymentCallbackActivity.m16692q0((omt) obj);
                break;
            default:
                int i3 = PaymentCallbackActivity.f6416e1;
                paymentCallbackActivity.getClass();
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    paymentCallbackActivity.m16692q0((omt) it.next());
                }
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f187725a) {
            case 0:
                if ((obj instanceof dqk0) && (obj instanceof gi00)) {
                    return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof dqk0) && (obj instanceof gi00)) {
                    return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // p204p.gi00
    public final ai00 getFunctionDelegate() {
        switch (this.f187725a) {
            case 0:
                return new ri00(1, this.f187726b, PaymentCallbackActivity.class, "trigger", "trigger(Lcom/spotify/payment/callback/data/Effect$ViewEffect;)V", 0, 0);
            default:
                return new ri00(1, this.f187726b, PaymentCallbackActivity.class, "triggerAfterPause", "triggerAfterPause(Ljava/lang/Iterable;)V", 0, 0);
        }
    }

    public final int hashCode() {
        switch (this.f187725a) {
            case 0:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
