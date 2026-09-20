package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class git {

    /* JADX INFO: renamed from: a */
    public final String f80256a;

    public git(String str) {
        this.f80256a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof git) && wj50.m88271j(this.f80256a, ((git) obj).f80256a);
    }

    public final int hashCode() {
        return this.f80256a.hashCode();
    }
}
