package p204p;

import com.google.protobuf.AbstractC0269h;

/* JADX INFO: loaded from: classes4.dex */
public final class j110 implements goe0 {

    /* JADX INFO: renamed from: a */
    public static final j110 f107587a = new j110();

    @Override // p204p.goe0
    /* JADX INFO: renamed from: a */
    public final doe0 mo45339a(Class cls) {
        if (!AbstractC0269h.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (doe0) AbstractC0269h.getDefaultInstance(cls.asSubclass(AbstractC0269h.class)).buildMessageInfo();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // p204p.goe0
    /* JADX INFO: renamed from: b */
    public final boolean mo45340b(Class cls) {
        return AbstractC0269h.class.isAssignableFrom(cls);
    }
}
