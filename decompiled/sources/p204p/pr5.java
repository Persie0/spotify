package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pr5 extends rr5 {

    /* JADX INFO: renamed from: a */
    public final String f180500a;

    public pr5(String str) {
        this.f180500a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pr5) && wj50.m88271j(this.f180500a, ((pr5) obj).f180500a);
    }

    public final int hashCode() {
        return this.f180500a.hashCode();
    }
}
