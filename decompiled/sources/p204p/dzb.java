package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class dzb {

    /* JADX INFO: renamed from: a */
    public final Set f54608a;

    public dzb(Set set) {
        this.f54608a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dzb) && wj50.m88271j(this.f54608a, ((dzb) obj).f54608a);
    }

    public final int hashCode() {
        return this.f54608a.hashCode();
    }
}
