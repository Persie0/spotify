package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class d3j implements g3j {

    /* JADX INFO: renamed from: a */
    public final String f44919a;

    public d3j(String str) {
        this.f44919a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3j) && wj50.m88271j(this.f44919a, ((d3j) obj).f44919a);
    }

    public final int hashCode() {
        return this.f44919a.hashCode();
    }
}
