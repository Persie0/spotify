package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tu00 implements ktx {

    /* JADX INFO: renamed from: a */
    public final Object f223736a;

    public tu00(List list) {
        this.f223736a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tu00) && this.f223736a.equals(((tu00) obj).f223736a);
    }

    public final int hashCode() {
        return this.f223736a.hashCode();
    }
}
