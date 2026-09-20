package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class up1 implements jq1 {

    /* JADX INFO: renamed from: a */
    public final ggm f232549a;

    public up1(ggm ggmVar) {
        this.f232549a = ggmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof up1) && this.f232549a.equals(((up1) obj).f232549a);
    }

    public final int hashCode() {
        return this.f232549a.hashCode();
    }
}
