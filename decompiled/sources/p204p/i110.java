package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes4.dex */
public final class i110 implements foe0 {

    /* JADX INFO: renamed from: a */
    public static final i110 f97350a = new i110();

    @Override // p204p.foe0
    /* JADX INFO: renamed from: a */
    public final cbu0 mo42273a(Class cls) {
        if (!AbstractC0156e.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (cbu0) AbstractC0156e.m1795g(cls.asSubclass(AbstractC0156e.class)).mo1803f(3);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // p204p.foe0
    /* JADX INFO: renamed from: b */
    public final boolean mo42274b(Class cls) {
        return AbstractC0156e.class.isAssignableFrom(cls);
    }
}
