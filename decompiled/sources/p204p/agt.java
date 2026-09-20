package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class agt implements rmt {

    /* JADX INFO: renamed from: a */
    public final String f15495a;

    public agt(String str) {
        this.f15495a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agt) && wj50.m88271j(this.f15495a, ((agt) obj).f15495a);
    }

    public final int hashCode() {
        return this.f15495a.hashCode();
    }
}
