package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class im00 extends yjg1 {

    /* JADX INFO: renamed from: c */
    public final Object f103566c;

    public im00(List list) {
        this.f103566c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof im00) && this.f103566c.equals(((im00) obj).f103566c);
    }

    public final int hashCode() {
        return this.f103566c.hashCode();
    }
}
