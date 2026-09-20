package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class l4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f129658a;

    public l4d(String str) {
        this.f129658a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l4d) && wj50.m88271j(this.f129658a, ((l4d) obj).f129658a);
    }

    public final int hashCode() {
        return this.f129658a.hashCode();
    }
}
