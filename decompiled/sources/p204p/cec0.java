package p204p;

import android.view.View;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class cec0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37077a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q58 f37078b;

    public /* synthetic */ cec0(q58 q58Var, int i) {
        this.f37077a = i;
        this.f37078b = q58Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f37077a) {
            case 0:
                Consumer consumer = (Consumer) this.f37078b.f185456b;
                if (consumer != null) {
                    consumer.accept(vcc0.f240105a);
                }
                break;
            default:
                Consumer consumer2 = (Consumer) this.f37078b.f185456b;
                if (consumer2 != null) {
                    consumer2.accept(ycc0.f271457a);
                }
                break;
        }
    }
}
