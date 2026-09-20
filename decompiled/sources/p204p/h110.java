package p204p;

import androidx.glance.appwidget.protobuf.AbstractC0059e;

/* JADX INFO: loaded from: classes3.dex */
public final class h110 implements eoe0 {

    /* JADX INFO: renamed from: b */
    public static final h110 f86402b = new h110(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f86403a;

    public /* synthetic */ h110(int i) {
        this.f86403a = i;
    }

    @Override // p204p.eoe0
    /* JADX INFO: renamed from: a */
    public final bbu0 mo39566a(Class cls) {
        switch (this.f86403a) {
            case 0:
                if (!AbstractC0059e.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (bbu0) AbstractC0059e.m666c(cls.asSubclass(AbstractC0059e.class)).mo670b(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // p204p.eoe0
    /* JADX INFO: renamed from: b */
    public final boolean mo39567b(Class cls) {
        switch (this.f86403a) {
            case 0:
                return AbstractC0059e.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
