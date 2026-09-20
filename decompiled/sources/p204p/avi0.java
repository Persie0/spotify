package p204p;

import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class avi0 implements Connection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bvi0 f20198a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f20199b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t2u f20200c;

    public avi0(bvi0 bvi0Var, Consumer consumer, t2u t2uVar) {
        this.f20198a = bvi0Var;
        this.f20199b = consumer;
        this.f20200c = t2uVar;
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        mui0 mui0Var = (mui0) obj;
        bvi0 bvi0Var = this.f20198a;
        bvi0.m30643h(bvi0Var, mui0Var);
        bvi0.m30642g(bvi0Var, mui0Var, bvi0Var.f31374c, bvi0Var.f31369X, this.f20199b);
        bvi0.m30644i(bvi0Var, mui0Var.m62876g());
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        this.f20198a.f31378g.removeTextChangedListener(this.f20200c);
    }
}
