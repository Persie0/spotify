package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ac8 implements bc8 {

    /* JADX INFO: renamed from: a */
    public final Set f14282a;

    public ac8(Set set) {
        this.f14282a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ac8) && wj50.m88271j(this.f14282a, ((ac8) obj).f14282a);
    }

    public final int hashCode() {
        return this.f14282a.hashCode();
    }
}
