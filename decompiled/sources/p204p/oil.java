package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class oil implements vil {

    /* JADX INFO: renamed from: a */
    public final List f165828a;

    public oil(ae50 ae50Var) {
        this.f165828a = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oil) && wj50.m88271j(this.f165828a, ((oil) obj).f165828a);
    }

    public final int hashCode() {
        return this.f165828a.hashCode();
    }
}
