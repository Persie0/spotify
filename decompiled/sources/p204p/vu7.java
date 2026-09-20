package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vu7 implements ktx {

    /* JADX INFO: renamed from: a */
    public final List f244881a;

    public vu7(ae50 ae50Var) {
        this.f244881a = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vu7) && wj50.m88271j(this.f244881a, ((vu7) obj).f244881a);
    }

    public final int hashCode() {
        return this.f244881a.hashCode();
    }
}
