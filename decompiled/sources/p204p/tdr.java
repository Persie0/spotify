package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class tdr implements wdr {

    /* JADX INFO: renamed from: a */
    public final Set f219463a;

    public tdr(Set set) {
        this.f219463a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdr) && wj50.m88271j(this.f219463a, ((tdr) obj).f219463a);
    }

    public final int hashCode() {
        return this.f219463a.hashCode();
    }
}
