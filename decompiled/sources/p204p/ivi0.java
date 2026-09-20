package p204p;

import android.view.View;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes9.dex */
public final class ivi0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f106227a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f106228b;

    public /* synthetic */ ivi0(View view, int i) {
        this.f106227a = i;
        this.f106228b = view;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f106227a) {
            case 0:
                pqm0 pqm0Var = (pqm0) obj;
                this.f106228b.setBackgroundColor(((Boolean) pqm0Var.f180351b).booleanValue() ? ((Integer) pqm0Var.f180350a).intValue() : 0);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Logger.m3969e("Changing loading visibility -> " + zBooleanValue, new Object[0]);
                this.f106228b.setVisibility(zBooleanValue ? 0 : 8);
                break;
        }
    }
}
