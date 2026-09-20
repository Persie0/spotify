package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class t82 implements Connectable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f217945a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EventSource f217946b;

    public /* synthetic */ t82(EventSource eventSource, int i) {
        this.f217945a = i;
        this.f217946b = eventSource;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        switch (this.f217945a) {
            case 0:
                return new n72(this.f217946b.mo15572a(consumer), 1);
            case 1:
                return new n72(this.f217946b.mo15572a(consumer), 3);
            case 2:
                return new n72(this.f217946b.mo15572a(consumer), 4);
            case 3:
                return new n72(this.f217946b.mo15572a(consumer), 5);
            default:
                return new n72(this.f217946b.mo15572a(consumer), 10);
        }
    }
}
