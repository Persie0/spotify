package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class l91 implements m91 {

    /* JADX INFO: renamed from: a */
    public final String f130977a;

    public l91(String str) {
        this.f130977a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l91) && wj50.m88271j(this.f130977a, ((l91) obj).f130977a);
    }

    public final int hashCode() {
        return this.f130977a.hashCode();
    }
}
