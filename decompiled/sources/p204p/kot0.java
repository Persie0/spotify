package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class kot0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final Object f124910a;

    public kot0(Map map) {
        this.f124910a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kot0) && this.f124910a.equals(((kot0) obj).f124910a);
    }

    public final int hashCode() {
        return this.f124910a.hashCode();
    }
}
