package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class f8b implements h8b {

    /* JADX INFO: renamed from: a */
    public final String f66934a;

    public f8b(String str) {
        this.f66934a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f8b) && wj50.m88271j(this.f66934a, ((f8b) obj).f66934a);
    }

    public final int hashCode() {
        return this.f66934a.hashCode();
    }
}
