package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class oll implements pll {

    /* JADX INFO: renamed from: a */
    public final dil f166857a;

    /* JADX INFO: renamed from: b */
    public final List f166858b;

    public oll(dil dilVar) {
        this.f166857a = dilVar;
        this.f166858b = Collections.singletonList(dilVar);
    }

    @Override // p204p.pll
    /* JADX INFO: renamed from: a */
    public final List mo62235a() {
        return this.f166858b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oll) && wj50.m88271j(this.f166857a, ((oll) obj).f166857a);
    }

    public final int hashCode() {
        return this.f166857a.hashCode();
    }
}
