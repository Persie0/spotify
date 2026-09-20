package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sju0 implements tju0 {

    /* JADX INFO: renamed from: a */
    public final String f209932a;

    public sju0(String str) {
        this.f209932a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sju0) && wj50.m88271j(this.f209932a, ((sju0) obj).f209932a);
    }

    public final int hashCode() {
        return this.f209932a.hashCode();
    }
}
