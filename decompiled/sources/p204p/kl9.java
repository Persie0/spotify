package p204p;

import android.view.View;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class kl9 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f123840a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f123841b;

    public /* synthetic */ kl9(Consumer consumer, int i) {
        this.f123840a = i;
        this.f123841b = consumer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f123840a) {
            case 0:
                this.f123841b.accept(qm50.f190138a);
                break;
            case 1:
                this.f123841b.accept(o7y.f162635a);
                break;
            case 2:
                this.f123841b.accept(jp9.f114585a);
                break;
            case 3:
                this.f123841b.accept(mp9.f145947a);
                break;
            case 4:
                this.f123841b.accept(alf.f16871a);
                break;
            case 5:
                this.f123841b.accept(x4t.f258195a);
                break;
            case 6:
                this.f123841b.accept(v0u.f236129a);
                break;
            case 7:
                this.f123841b.accept(lp9.f135700a);
                break;
            case 8:
                this.f123841b.accept(mp9.f145947a);
                break;
            case 9:
                this.f123841b.accept(mp9.f145947a);
                break;
            case 10:
                this.f123841b.accept(s070.f204314a);
                break;
            case 11:
                this.f123841b.accept(eui0.f62986a);
                break;
            case 12:
                this.f123841b.accept(h9n0.f89010a);
                break;
            case 13:
                this.f123841b.accept(xvr0.f266469a);
                break;
            default:
                this.f123841b.accept(new q521());
                break;
        }
    }
}
