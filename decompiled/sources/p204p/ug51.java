package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ug51 extends xg51 {

    /* JADX INFO: renamed from: a */
    public final String f229990a;

    public ug51(String str) {
        this.f229990a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ug51) && wj50.m88271j(this.f229990a, ((ug51) obj).f229990a);
    }

    public final int hashCode() {
        return this.f229990a.hashCode();
    }
}
