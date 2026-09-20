package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class j8b1 extends k8b1 {

    /* JADX INFO: renamed from: a */
    public final String f109893a;

    public j8b1(String str) {
        this.f109893a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8b1) && wj50.m88271j(this.f109893a, ((j8b1) obj).f109893a);
    }

    public final int hashCode() {
        return this.f109893a.hashCode();
    }
}
