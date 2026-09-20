package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ngn0 implements tgn0 {

    /* JADX INFO: renamed from: a */
    public final String f153743a;

    public ngn0(String str) {
        this.f153743a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ngn0) && wj50.m88271j(this.f153743a, ((ngn0) obj).f153743a);
    }

    public final int hashCode() {
        return this.f153743a.hashCode();
    }
}
