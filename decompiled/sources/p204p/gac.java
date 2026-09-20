package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gac implements iac {

    /* JADX INFO: renamed from: a */
    public final String f78025a;

    public gac(String str) {
        this.f78025a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gac) && wj50.m88271j(this.f78025a, ((gac) obj).f78025a);
    }

    public final int hashCode() {
        return this.f78025a.hashCode();
    }
}
