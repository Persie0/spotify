package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class qhc1 implements Connectable {

    /* JADX INFO: renamed from: a */
    public final q6u f188710a;

    /* JADX INFO: renamed from: b */
    public final kx90 f188711b;

    /* JADX INFO: renamed from: c */
    public pyu f188712c;

    /* JADX INFO: renamed from: d */
    public Consumer f188713d;

    public qhc1(q6u q6uVar, kx90 kx90Var) {
        this.f188710a = q6uVar;
        this.f188711b = kx90Var;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        this.f188713d = consumer;
        return new gk81(this, 2);
    }
}
