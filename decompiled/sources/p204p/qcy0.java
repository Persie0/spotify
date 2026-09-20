package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qcy0 extends scy0 {

    /* JADX INFO: renamed from: b */
    public final String f187431b;

    public qcy0(String str) {
        super(4);
        this.f187431b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qcy0) && wj50.m88271j(this.f187431b, ((qcy0) obj).f187431b);
    }

    public final int hashCode() {
        String str = this.f187431b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
