package p204p;

import android.view.View;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class p58 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f174103a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q58 f174104b;

    public /* synthetic */ p58(q58 q58Var, int i) {
        this.f174103a = i;
        this.f174104b = q58Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f174103a) {
            case 0:
                Consumer consumer = (Consumer) this.f174104b.f185456b;
                if (consumer != null) {
                    consumer.accept(m48.f139860a);
                }
                break;
            default:
                Consumer consumer2 = (Consumer) this.f174104b.f185456b;
                if (consumer2 != null) {
                    consumer2.accept(n48.f150229a);
                }
                break;
        }
    }
}
