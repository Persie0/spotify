package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class amc0 extends cmc0 {

    /* JADX INFO: renamed from: a */
    public final String f17088a;

    public amc0(String str) {
        this.f17088a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof amc0) && wj50.m88271j(this.f17088a, ((amc0) obj).f17088a);
    }

    public final int hashCode() {
        return this.f17088a.hashCode();
    }
}
