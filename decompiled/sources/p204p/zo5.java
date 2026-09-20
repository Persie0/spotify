package p204p;

import android.view.View;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class zo5 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f284664a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f284665b;

    public /* synthetic */ zo5(kqi0 kqi0Var, int i) {
        this.f284664a = i;
        this.f284665b = kqi0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f284664a) {
            case 0:
                ((eh00) this.f284665b.getValue()).invoke();
                break;
            default:
                ((Consumer) this.f284665b.getValue()).accept(aor.f17745a);
                break;
        }
    }
}
