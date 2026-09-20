package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cci implements jci {

    /* JADX INFO: renamed from: a */
    public final String f36417a;

    public cci(String str) {
        this.f36417a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cci) && wj50.m88271j(this.f36417a, ((cci) obj).f36417a);
    }

    public final int hashCode() {
        return this.f36417a.hashCode();
    }
}
