package p204p;

import androidx.datastore.preferences.protobuf.AbstractC0048e;

/* JADX INFO: loaded from: classes3.dex */
public final class k110 implements hoe0 {

    /* JADX INFO: renamed from: a */
    public static final k110 f118184a = new k110();

    @Override // p204p.hoe0
    /* JADX INFO: renamed from: a */
    public final ebu0 mo48028a(Class cls) {
        if (!AbstractC0048e.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (ebu0) AbstractC0048e.m518e(cls.asSubclass(AbstractC0048e.class)).mo521d(3);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // p204p.hoe0
    /* JADX INFO: renamed from: b */
    public final boolean mo48029b(Class cls) {
        return AbstractC0048e.class.isAssignableFrom(cls);
    }
}
