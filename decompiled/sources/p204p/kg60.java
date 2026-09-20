package p204p;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class kg60 {
    public static final jg60 Companion = new jg60();

    /* JADX INFO: renamed from: a */
    public final String f122305a;

    public kg60() {
        this.f122305a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kg60) && wj50.m88271j(this.f122305a, ((kg60) obj).f122305a);
    }

    public final int hashCode() {
        String str = this.f122305a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public /* synthetic */ kg60(int i, String str) {
        if ((i & 1) == 0) {
            this.f122305a = null;
        } else {
            this.f122305a = str;
        }
    }
}
