package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class caf0 extends oaf0 {

    /* JADX INFO: renamed from: b */
    public final String f35812b;

    public caf0(String str) {
        super(false);
        this.f35812b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof caf0) && wj50.m88271j(this.f35812b, ((caf0) obj).f35812b);
    }

    public final int hashCode() {
        return this.f35812b.hashCode();
    }
}
