package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mol0 {

    /* JADX INFO: renamed from: a */
    public final String f145706a;

    public mol0(String str) {
        this.f145706a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mol0) && wj50.m88271j(this.f145706a, ((mol0) obj).f145706a);
    }

    public final int hashCode() {
        return this.f145706a.hashCode();
    }

    public final String toString() {
        return dq60.m36617q(new StringBuilder("OpaqueKey(key="), this.f145706a, ')');
    }
}
