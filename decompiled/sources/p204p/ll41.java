package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ll41 implements nl41 {

    /* JADX INFO: renamed from: a */
    public final String f134529a;

    public ll41(String str) {
        this.f134529a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ll41) && wj50.m88271j(this.f134529a, ((ll41) obj).f134529a);
    }

    public final int hashCode() {
        return this.f134529a.hashCode();
    }
}
