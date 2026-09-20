package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jdl extends AbstractC1861fi {

    /* JADX INFO: renamed from: b */
    public final String f111368b;

    public jdl(String str) {
        super(str);
        this.f111368b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jdl) && wj50.m88271j(this.f111368b, ((jdl) obj).f111368b);
    }

    public final int hashCode() {
        return this.f111368b.hashCode();
    }
}
