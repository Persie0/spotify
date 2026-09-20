package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class voy {

    /* JADX INFO: renamed from: a */
    public final joy f243551a;

    /* JADX INFO: renamed from: b */
    public final String f243552b;

    /* JADX INFO: renamed from: c */
    public final int f243553c;

    public voy(joy joyVar, String str, int i) {
        this.f243551a = joyVar;
        this.f243552b = str;
        this.f243553c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voy)) {
            return false;
        }
        voy voyVar = (voy) obj;
        return this.f243551a.equals(voyVar.f243551a) && wj50.m88271j(this.f243552b, voyVar.f243552b) && this.f243553c == voyVar.f243553c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f243553c) + s571.m77243b(this.f243551a.f114529a.hashCode() * 31, 31, this.f243552b);
    }
}
