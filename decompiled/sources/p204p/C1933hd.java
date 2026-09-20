package p204p;

import java.io.Serializable;

/* JADX INFO: renamed from: p.hd */
/* JADX INFO: loaded from: classes3.dex */
public final class C1933hd implements Serializable {

    /* JADX INFO: renamed from: a */
    public final String f89935a;

    public C1933hd(String str) {
        this.f89935a = str;
    }

    private final Object readResolve() {
        return new C1975id(null, this.f89935a);
    }
}
