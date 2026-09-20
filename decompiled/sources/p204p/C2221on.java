package p204p;

import java.util.List;

/* JADX INFO: renamed from: p.on */
/* JADX INFO: loaded from: classes4.dex */
public final class C2221on {

    /* JADX INFO: renamed from: b */
    public static final C2221on f167125b = new C2221on(lau.f131415a);

    /* JADX INFO: renamed from: a */
    public final Object f167126a;

    public C2221on(List list) {
        this.f167126a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2221on) && this.f167126a.equals(((C2221on) obj).f167126a);
    }

    public final int hashCode() {
        return this.f167126a.hashCode();
    }
}
