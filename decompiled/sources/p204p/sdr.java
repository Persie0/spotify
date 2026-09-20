package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class sdr implements wdr {

    /* JADX INFO: renamed from: a */
    public final Set f208074a;

    public sdr(Set set) {
        this.f208074a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sdr) && wj50.m88271j(this.f208074a, ((sdr) obj).f208074a);
    }

    public final int hashCode() {
        return this.f208074a.hashCode();
    }
}
