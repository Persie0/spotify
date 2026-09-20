package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qzj0 implements rzj0 {

    /* JADX INFO: renamed from: a */
    public final String f194216a;

    public qzj0(String str) {
        this.f194216a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qzj0) && wj50.m88271j(this.f194216a, ((qzj0) obj).f194216a);
    }

    public final int hashCode() {
        return this.f194216a.hashCode();
    }
}
