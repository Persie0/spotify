package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class c8d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f35189a;

    public c8d(String str) {
        this.f35189a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c8d) && wj50.m88271j(this.f35189a, ((c8d) obj).f35189a);
    }

    public final int hashCode() {
        return this.f35189a.hashCode();
    }
}
