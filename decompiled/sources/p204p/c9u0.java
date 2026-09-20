package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c9u0 implements f9u0 {

    /* JADX INFO: renamed from: a */
    public final String f35657a;

    public c9u0(String str) {
        this.f35657a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9u0) && wj50.m88271j(this.f35657a, ((c9u0) obj).f35657a);
    }

    public final int hashCode() {
        return this.f35657a.hashCode();
    }
}
