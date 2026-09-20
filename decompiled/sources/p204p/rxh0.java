package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class rxh0 implements Connectable {

    /* JADX INFO: renamed from: a */
    public final Class f203601a;

    /* JADX INFO: renamed from: b */
    public final Connectable f203602b;

    /* JADX INFO: renamed from: c */
    public Object f203603c;

    public rxh0(Class cls, Connectable connectable) {
        this.f203601a = cls;
        this.f203602b = connectable;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        Connection connectionMo3269P = this.f203602b.mo3269P(new eo2(consumer, 12));
        return hdg1.m47195k(new abc0(29, this, connectionMo3269P), new l02(0, connectionMo3269P, Connection.class, "dispose", "dispose()V", 0, 0, 3));
    }
}
