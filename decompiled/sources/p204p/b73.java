package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class b73 {

    /* JADX INFO: renamed from: a */
    public final List f24147a;

    public b73(ae50 ae50Var) {
        this.f24147a = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b73) && wj50.m88271j(this.f24147a, ((b73) obj).f24147a);
    }

    public final int hashCode() {
        return this.f24147a.hashCode();
    }
}
