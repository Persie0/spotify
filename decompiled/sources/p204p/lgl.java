package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class lgl implements Connectable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f133239a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f133240b;

    public lgl(boolean z, String str) {
        this.f133239a = z;
        this.f133240b = str;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        return new kgl(consumer, this.f133239a, this.f133240b);
    }
}
