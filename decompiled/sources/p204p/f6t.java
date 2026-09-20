package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f6t extends g6t {

    /* JADX INFO: renamed from: a */
    public final String f66499a;

    public f6t(String str) {
        this.f66499a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f6t) && wj50.m88271j(this.f66499a, ((f6t) obj).f66499a);
    }

    public final int hashCode() {
        return this.f66499a.hashCode();
    }
}
