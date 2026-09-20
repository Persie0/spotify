package p204p;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class om50 {
    public static final mm50 Companion = new mm50();

    /* JADX INFO: renamed from: a */
    public final String f166974a;

    public om50() {
        this.f166974a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof om50) && wj50.m88271j(this.f166974a, ((om50) obj).f166974a);
    }

    public final int hashCode() {
        String str = this.f166974a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public /* synthetic */ om50(int i, String str) {
        if ((i & 1) == 0) {
            this.f166974a = null;
        } else {
            this.f166974a = str;
        }
    }
}
