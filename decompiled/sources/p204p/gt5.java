package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gt5 implements ktx {

    /* JADX INFO: renamed from: a */
    public final List f84092a;

    public gt5(ae50 ae50Var) {
        this.f84092a = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gt5) && wj50.m88271j(this.f84092a, ((gt5) obj).f84092a);
    }

    public final int hashCode() {
        return this.f84092a.hashCode();
    }
}
