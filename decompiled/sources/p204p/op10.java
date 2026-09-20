package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class op10 implements v1x {

    /* JADX INFO: renamed from: a */
    public final Set f167734a;

    public op10(Set set) {
        this.f167734a = set;
    }

    /* JADX INFO: renamed from: a */
    public final Set m67512a() {
        return this.f167734a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof op10) && wj50.m88271j(this.f167734a, ((op10) obj).f167734a);
    }

    public final int hashCode() {
        return this.f167734a.hashCode();
    }
}
