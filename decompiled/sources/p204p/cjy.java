package p204p;

import com.spotify.martini.martinidata.model.Mode;

/* JADX INFO: loaded from: classes8.dex */
public final class cjy {

    /* JADX INFO: renamed from: a */
    public final String f38702a;

    /* JADX INFO: renamed from: b */
    public final Mode f38703b;

    public cjy(String str, Mode mode) {
        this.f38702a = str;
        this.f38703b = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjy)) {
            return false;
        }
        cjy cjyVar = (cjy) obj;
        return wj50.m88271j(this.f38702a, cjyVar.f38702a) && this.f38703b == cjyVar.f38703b;
    }

    public final int hashCode() {
        return this.f38703b.hashCode() + (this.f38702a.hashCode() * 31);
    }
}
