package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class rdr0 implements sdr0 {

    /* JADX INFO: renamed from: a */
    public final ry8 f198196a;

    public rdr0(ry8 ry8Var) {
        this.f198196a = ry8Var;
    }

    @Override // p204p.sdr0
    /* JADX INFO: renamed from: a */
    public final List mo72597a() {
        return Collections.singletonList(this.f198196a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rdr0) && wj50.m88271j(this.f198196a, ((rdr0) obj).f198196a);
    }

    public final int hashCode() {
        return this.f198196a.hashCode();
    }
}
