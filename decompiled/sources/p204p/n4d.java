package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f150322a;

    public n4d(String str) {
        this.f150322a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4d) && wj50.m88271j(this.f150322a, ((n4d) obj).f150322a);
    }

    public final int hashCode() {
        return this.f150322a.hashCode();
    }
}
