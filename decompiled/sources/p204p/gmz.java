package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class gmz implements imz {

    /* JADX INFO: renamed from: a */
    public final List f81505a;

    public gmz(List list) {
        this.f81505a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gmz) && wj50.m88271j(this.f81505a, ((gmz) obj).f81505a);
    }

    public final int hashCode() {
        return this.f81505a.hashCode();
    }

    @Override // p204p.imz
    /* JADX INFO: renamed from: z */
    public final List mo45284z() {
        return this.f81505a;
    }
}
