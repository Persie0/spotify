package p204p;

import android.os.Bundle;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class p4u0 implements hxi {

    /* JADX INFO: renamed from: a */
    public final q4u0 f174011a;

    public p4u0(q4u0 q4u0Var) {
        this.f174011a = q4u0Var;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        return new yih(this, 1);
    }

    @Override // p204p.hr91
    public final Object getView() {
        return this.f174011a.f185350b.mo57295e();
    }

    @Override // p204p.hr91
    public final Bundle serialize() {
        return pp91.m70528i();
    }

    @Override // p204p.hr91
    public final void start() {
    }

    @Override // p204p.hr91
    public final void stop() {
    }
}
