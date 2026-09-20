package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ns41 extends ms41 {

    /* JADX INFO: renamed from: c */
    public final String f157663c;

    public ns41(String str) {
        super(true, null);
        this.f157663c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ns41) && wj50.m88271j(this.f157663c, ((ns41) obj).f157663c);
    }

    public final int hashCode() {
        return this.f157663c.hashCode();
    }
}
