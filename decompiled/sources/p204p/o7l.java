package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class o7l implements q7l {

    /* JADX INFO: renamed from: a */
    public final String f162586a;

    public o7l(String str) {
        this.f162586a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o7l) && wj50.m88271j(this.f162586a, ((o7l) obj).f162586a);
    }

    public final int hashCode() {
        return this.f162586a.hashCode();
    }
}
