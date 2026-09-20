package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class key extends mey {

    /* JADX INFO: renamed from: a */
    public final String f121990a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1737cd f121991b;

    public key(String str, AbstractC1737cd abstractC1737cd) {
        this.f121990a = str;
        this.f121991b = abstractC1737cd;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1737cd m56243a() {
        return this.f121991b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof key)) {
            return false;
        }
        key keyVar = (key) obj;
        return wj50.m88271j(this.f121990a, keyVar.f121990a) && wj50.m88271j(this.f121991b, keyVar.f121991b);
    }

    public final int hashCode() {
        return this.f121991b.hashCode() + (this.f121990a.hashCode() * 31);
    }
}
