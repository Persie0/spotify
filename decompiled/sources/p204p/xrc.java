package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xrc {

    /* JADX INFO: renamed from: a */
    public final String f265321a;

    public final boolean equals(Object obj) {
        if (obj instanceof xrc) {
            return wj50.m88271j(this.f265321a, ((xrc) obj).f265321a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f265321a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("ChapterSelectorResult(chapterUri=", this.f265321a, ")");
    }
}
