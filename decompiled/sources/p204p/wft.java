package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class wft {

    /* JADX INFO: renamed from: a */
    public final Set f250891a;

    public wft(Set set) {
        this.f250891a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wft) && wj50.m88271j(this.f250891a, ((wft) obj).f250891a);
    }

    public final int hashCode() {
        return this.f250891a.hashCode();
    }
}
