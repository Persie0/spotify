package p204p;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class nm50 {
    public static final lm50 Companion = new lm50();

    /* JADX INFO: renamed from: a */
    public final String f155302a;

    public nm50() {
        this.f155302a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nm50) && wj50.m88271j(this.f155302a, ((nm50) obj).f155302a);
    }

    public final int hashCode() {
        String str = this.f155302a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public /* synthetic */ nm50(int i, String str) {
        if ((i & 1) == 0) {
            this.f155302a = null;
        } else {
            this.f155302a = str;
        }
    }
}
