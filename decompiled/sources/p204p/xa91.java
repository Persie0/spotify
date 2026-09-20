package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xa91 extends db91 {

    /* JADX INFO: renamed from: a */
    public final String f259630a;

    public xa91(String str) {
        this.f259630a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xa91) && wj50.m88271j(this.f259630a, ((xa91) obj).f259630a);
    }

    public final int hashCode() {
        String str = this.f259630a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
