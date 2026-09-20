package p204p;

import com.spotify.mobius.Connection;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class bnf implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28817a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Connection f28818b;

    public /* synthetic */ bnf(Connection connection, int i) {
        this.f28817a = i;
        this.f28818b = connection;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f28817a) {
            case 0:
                this.f28818b.accept((zhf) obj);
                break;
            default:
                this.f28818b.accept(obj);
                break;
        }
    }
}
