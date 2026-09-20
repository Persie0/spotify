package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class g2t {

    /* JADX INFO: renamed from: a */
    public final Set f76006a;

    public g2t(Set set) {
        this.f76006a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2t) && wj50.m88271j(this.f76006a, ((g2t) obj).f76006a);
    }

    public final int hashCode() {
        return this.f76006a.hashCode();
    }
}
