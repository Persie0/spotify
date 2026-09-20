package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class zq80 extends br80 {

    /* JADX INFO: renamed from: a */
    public final Object f285328a;

    public zq80(Set set) {
        this.f285328a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zq80) && this.f285328a.equals(((zq80) obj).f285328a);
    }

    public final int hashCode() {
        return this.f285328a.hashCode();
    }
}
