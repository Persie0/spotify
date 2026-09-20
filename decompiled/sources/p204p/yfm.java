package p204p;

/* JADX INFO: loaded from: classes.dex */
@rtz0
public final class yfm {
    public static final xfm Companion = new xfm();

    /* JADX INFO: renamed from: a */
    public final String f272284a;

    /* JADX INFO: renamed from: b */
    public final fgm f272285b;

    public /* synthetic */ yfm(int i, String str, fgm fgmVar) {
        if (3 != (i & 3)) {
            edo.m38617p(i, 3, wfm.f250869a.getDescriptor());
            throw null;
        }
        this.f272284a = str;
        this.f272285b = fgmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfm)) {
            return false;
        }
        yfm yfmVar = (yfm) obj;
        return wj50.m88271j(this.f272284a, yfmVar.f272284a) && wj50.m88271j(this.f272285b, yfmVar.f272285b);
    }

    public final int hashCode() {
        return this.f272285b.hashCode() + (this.f272284a.hashCode() * 31);
    }

    public yfm(fgm fgmVar) {
        this.f272284a = "dsa-mode-enabled";
        this.f272285b = fgmVar;
    }
}
