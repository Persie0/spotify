package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c551 implements d551 {

    /* JADX INFO: renamed from: a */
    public final String f34091a;

    public c551(String str) {
        this.f34091a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c551) && wj50.m88271j(this.f34091a, ((c551) obj).f34091a);
    }

    public final int hashCode() {
        return Integer.hashCode(20) + s571.m77243b(-33657807, 31, this.f34091a);
    }
}
