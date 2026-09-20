package p204p;

import com.spotify.martini.martinidata.model.Mode;

/* JADX INFO: loaded from: classes8.dex */
public final class fjy {

    /* JADX INFO: renamed from: a */
    public final String f70423a;

    /* JADX INFO: renamed from: b */
    public final Mode f70424b;

    public fjy(String str, Mode mode) {
        this.f70423a = str;
        this.f70424b = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjy)) {
            return false;
        }
        fjy fjyVar = (fjy) obj;
        return wj50.m88271j(this.f70423a, fjyVar.f70423a) && this.f70424b == fjyVar.f70424b;
    }

    public final int hashCode() {
        return this.f70424b.hashCode() + (this.f70423a.hashCode() * 31);
    }
}
