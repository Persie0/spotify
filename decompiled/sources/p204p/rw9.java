package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rw9 implements hx9 {

    /* JADX INFO: renamed from: a */
    public final String f203307a;

    public rw9(String str) {
        this.f203307a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rw9) && wj50.m88271j(this.f203307a, ((rw9) obj).f203307a);
    }

    public final int hashCode() {
        return this.f203307a.hashCode();
    }
}
