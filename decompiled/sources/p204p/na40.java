package p204p;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes9.dex */
public final class na40 implements oa40 {

    /* JADX INFO: renamed from: a */
    public final RectF f151934a;

    public na40(RectF rectF) {
        this.f151934a = rectF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof na40) && wj50.m88271j(this.f151934a, ((na40) obj).f151934a);
    }

    public final int hashCode() {
        return this.f151934a.hashCode();
    }
}
