package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class gs81 {

    /* JADX INFO: renamed from: a */
    public final List f83906a;

    public gs81(ae50 ae50Var) {
        this.f83906a = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gs81) && wj50.m88271j(this.f83906a, ((gs81) obj).f83906a);
    }

    public final int hashCode() {
        return this.f83906a.hashCode();
    }
}
