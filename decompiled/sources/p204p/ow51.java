package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ow51 extends pw51 {

    /* JADX INFO: renamed from: a */
    public final String f170646a;

    public ow51(String str) {
        this.f170646a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ow51) && wj50.m88271j(this.f170646a, ((ow51) obj).f170646a);
    }

    public final int hashCode() {
        return this.f170646a.hashCode();
    }
}
