package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fmt implements pmt {

    /* JADX INFO: renamed from: a */
    public final String f71119a;

    public fmt(String str) {
        this.f71119a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fmt) && wj50.m88271j(this.f71119a, ((fmt) obj).f71119a);
    }

    public final int hashCode() {
        return this.f71119a.hashCode();
    }
}
