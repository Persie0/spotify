package p204p;

import com.spotify.interapp.interappprotocol.NotAuthorizedException;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class oy30 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fzj f171652a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f171653b;

    public /* synthetic */ oy30(fzj fzjVar, int i) {
        this.f171652a = fzjVar;
        this.f171653b = i;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        int i = ((xhy0) this.f171652a.f75030a).f261731a;
        int i2 = this.f171653b;
        if ((i & i2) != i2) {
            throw new NotAuthorizedException();
        }
    }
}
