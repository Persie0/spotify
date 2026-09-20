package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wpl implements ypl {

    /* JADX INFO: renamed from: a */
    public final String f253785a;

    public wpl(String str) {
        this.f253785a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wpl) && wj50.m88271j(this.f253785a, ((wpl) obj).f253785a);
    }

    public final int hashCode() {
        return this.f253785a.hashCode();
    }
}
