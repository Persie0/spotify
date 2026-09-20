package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class a6u {

    /* JADX INFO: renamed from: a */
    public final List f12869a;

    public a6u(ae50 ae50Var) {
        this.f12869a = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a6u) && wj50.m88271j(this.f12869a, ((a6u) obj).f12869a);
    }

    public final int hashCode() {
        return this.f12869a.hashCode();
    }
}
