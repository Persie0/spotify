package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class trx implements urx {

    /* JADX INFO: renamed from: a */
    public final String f223142a;

    public trx(String str) {
        this.f223142a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof trx) && wj50.m88271j(this.f223142a, ((trx) obj).f223142a);
    }

    public final int hashCode() {
        return this.f223142a.hashCode();
    }
}
