package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j3i {

    /* JADX INFO: renamed from: a */
    public final String f108403a;

    public j3i(String str) {
        this.f108403a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3i) && wj50.m88271j(this.f108403a, ((j3i) obj).f108403a);
    }

    public final int hashCode() {
        return this.f108403a.hashCode();
    }
}
