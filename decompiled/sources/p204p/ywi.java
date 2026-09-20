package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ywi {

    /* JADX INFO: renamed from: a */
    public final boolean f276971a;

    /* JADX INFO: renamed from: b */
    public final String f276972b;

    /* JADX INFO: renamed from: c */
    public final Double f276973c;

    public ywi(boolean z, String str, Double d) {
        this.f276971a = z;
        this.f276972b = str;
        this.f276973c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywi)) {
            return false;
        }
        ywi ywiVar = (ywi) obj;
        return this.f276971a == ywiVar.f276971a && this.f276972b.equals(ywiVar.f276972b) && wj50.m88271j(this.f276973c, ywiVar.f276973c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(Boolean.hashCode(this.f276971a) * 31, 31, this.f276972b);
        Double d = this.f276973c;
        return iM77243b + (d == null ? 0 : d.hashCode());
    }
}
