package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ger {

    /* JADX INFO: renamed from: a */
    public final String f79172a;

    /* JADX INFO: renamed from: b */
    public final ddr f79173b;

    public ger(String str, ddr ddrVar) {
        this.f79172a = str;
        this.f79173b = ddrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ger)) {
            return false;
        }
        ger gerVar = (ger) obj;
        return wj50.m88271j(this.f79172a, gerVar.f79172a) && this.f79173b == gerVar.f79173b;
    }

    public final int hashCode() {
        return this.f79173b.hashCode() + (this.f79172a.hashCode() * 31);
    }
}
