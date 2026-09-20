package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class j4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f108670a;

    public j4d(String str) {
        this.f108670a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j4d) && wj50.m88271j(this.f108670a, ((j4d) obj).f108670a);
    }

    public final int hashCode() {
        return this.f108670a.hashCode();
    }
}
