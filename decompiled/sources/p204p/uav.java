package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class uav implements y15 {

    /* JADX INFO: renamed from: a */
    public static final uav f228559a = new uav();

    @Override // p204p.y15
    /* JADX INFO: renamed from: a */
    public final Map mo51607a() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // p204p.y15
    /* JADX INFO: renamed from: b */
    public final y400 mo51608b() {
        nfe nfeVarM81931d = txq.m81931d(this);
        if (nfeVarM81931d != null) {
            if (ehw.m39009e(nfeVarM81931d)) {
                nfeVarM81931d = null;
            }
            if (nfeVarM81931d != null) {
                return txq.m81930c(nfeVarM81931d);
            }
        }
        return null;
    }

    @Override // p204p.y15
    public final du31 getSource() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // p204p.y15
    public final gd70 getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
