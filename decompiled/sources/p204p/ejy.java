package p204p;

import com.spotify.martini.martinidata.model.Mode;

/* JADX INFO: loaded from: classes8.dex */
public final class ejy {

    /* JADX INFO: renamed from: a */
    public final String f60317a;

    /* JADX INFO: renamed from: b */
    public final Mode f60318b;

    public ejy(String str, Mode mode) {
        this.f60317a = str;
        this.f60318b = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejy)) {
            return false;
        }
        ejy ejyVar = (ejy) obj;
        return wj50.m88271j(this.f60317a, ejyVar.f60317a) && this.f60318b == ejyVar.f60318b;
    }

    public final int hashCode() {
        return this.f60318b.hashCode() + (this.f60317a.hashCode() * 31);
    }
}
