package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class axs implements wxs {

    /* JADX INFO: renamed from: a */
    public final Set f20988a;

    public axs(Set set) {
        this.f20988a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof axs) && wj50.m88271j(this.f20988a, ((axs) obj).f20988a);
    }

    public final int hashCode() {
        return this.f20988a.hashCode();
    }
}
