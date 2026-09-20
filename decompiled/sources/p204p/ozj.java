package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ozj extends rzj {

    /* JADX INFO: renamed from: b */
    public final String f172306b;

    public ozj(String str) {
        super(str);
        this.f172306b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ozj) && wj50.m88271j(this.f172306b, ((ozj) obj).f172306b);
    }

    public final int hashCode() {
        return this.f172306b.hashCode();
    }
}
