package p204p;

import android.content.Intent;
import android.net.Uri;
import io.reactivex.rxjava3.functions.Function;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class y31 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f268722a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Intent f268723b;

    public /* synthetic */ y31(Intent intent, int i) {
        this.f268722a = i;
        this.f268723b = intent;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        switch (this.f268722a) {
            case 0:
                l4y0 l4y0Var = (l4y0) obj;
                if (l4y0Var instanceof h4y0) {
                    return this.f268723b;
                }
                if (l4y0Var.equals(f4y0.f65854a) || l4y0Var.equals(j4y0.f108811a)) {
                    throw new IllegalStateException("Failed to save current user in AccountSwitcher");
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                Intent intent = this.f268723b;
                intent.setData((Uri) obj);
                return new q1j0(intent);
            default:
                na6.m63959g("Error obtaining DSA state for " + this.f268723b.getDataString(), (Throwable) obj);
                return p1j0.f173119a;
        }
    }
}
