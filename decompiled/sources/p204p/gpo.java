package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gpo {

    /* JADX INFO: renamed from: a */
    public final qf40 f83227a;

    /* JADX INFO: renamed from: b */
    public final String f83228b;

    public gpo(String str, AbstractC2524w8 abstractC2524w8) {
        this.f83227a = abstractC2524w8;
        this.f83228b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpo)) {
            return false;
        }
        gpo gpoVar = (gpo) obj;
        return wj50.m88271j(this.f83227a, gpoVar.f83227a) && wj50.m88271j(this.f83228b, gpoVar.f83228b);
    }

    public final int hashCode() {
        return this.f83228b.hashCode() + (this.f83227a.hashCode() * 31);
    }
}
