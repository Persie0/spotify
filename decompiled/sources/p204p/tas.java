package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tas {

    /* JADX INFO: renamed from: a */
    public final Object f218667a;

    public tas(Map map) {
        this.f218667a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tas) && this.f218667a.equals(((tas) obj).f218667a);
    }

    public final int hashCode() {
        return this.f218667a.hashCode();
    }
}
