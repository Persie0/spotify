package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class swc1 implements bxc1 {

    /* JADX INFO: renamed from: a */
    public final String f214643a;

    public swc1(String str) {
        this.f214643a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swc1) && wj50.m88271j(this.f214643a, ((swc1) obj).f214643a);
    }

    public final int hashCode() {
        return this.f214643a.hashCode();
    }
}
