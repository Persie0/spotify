package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hh51 extends kh51 {

    /* JADX INFO: renamed from: e */
    public final String f91293e;

    public hh51(String str) {
        this.f91293e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hh51) && wj50.m88271j(this.f91293e, ((hh51) obj).f91293e);
    }

    public final int hashCode() {
        return this.f91293e.hashCode();
    }
}
