package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class d41 extends i41 {

    /* JADX INFO: renamed from: a */
    public final String f45046a;

    public d41(String str) {
        this.f45046a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d41) && wj50.m88271j(this.f45046a, ((d41) obj).f45046a);
    }

    public final int hashCode() {
        return this.f45046a.hashCode();
    }
}
