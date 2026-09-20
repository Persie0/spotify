package p204p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class keo0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121922a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ neo0 f121923b;

    public /* synthetic */ keo0(neo0 neo0Var, int i) {
        this.f121922a = i;
        this.f121923b = neo0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f121922a) {
            case 0:
                this.f121923b.f153044i = (PlayerState) obj;
                break;
            default:
                this.f121923b.f153045t = ((Boolean) obj).booleanValue();
                break;
        }
    }
}
