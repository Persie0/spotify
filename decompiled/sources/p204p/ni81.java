package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ni81 implements oi81 {

    /* JADX INFO: renamed from: a */
    public final String f154206a;

    public ni81(String str) {
        this.f154206a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ni81) && wj50.m88271j(this.f154206a, ((ni81) obj).f154206a);
    }

    public final int hashCode() {
        return this.f154206a.hashCode();
    }
}
