package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wn20 {

    /* JADX INFO: renamed from: b */
    public static final wwf f253055b = crs.m33745b(lq00.f135907Z0);

    /* JADX INFO: renamed from: a */
    public final String f253056a;

    public wn20(String str) {
        this.f253056a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wn20) && wj50.m88271j(this.f253056a, ((wn20) obj).f253056a);
    }

    public final int hashCode() {
        String str = this.f253056a;
        return (str == null ? 0 : str.hashCode()) * 31;
    }
}
