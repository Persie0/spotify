package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qfj implements ktx {

    /* JADX INFO: renamed from: a */
    public final List f188215a;

    public qfj(ae50 ae50Var) {
        this.f188215a = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qfj) && wj50.m88271j(this.f188215a, ((qfj) obj).f188215a);
    }

    public final int hashCode() {
        return this.f188215a.hashCode();
    }
}
