package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class es21 implements gs21 {

    /* JADX INFO: renamed from: a */
    public final String f62269a;

    public es21(String str) {
        this.f62269a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof es21) && wj50.m88271j(this.f62269a, ((es21) obj).f62269a);
    }

    public final int hashCode() {
        return this.f62269a.hashCode();
    }
}
