package p204p;

import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public final class zrj extends dsj {

    /* JADX INFO: renamed from: a */
    public final SearchConfiguration f285697a;

    public zrj(SearchConfiguration searchConfiguration) {
        this.f285697a = searchConfiguration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zrj) && wj50.m88271j(this.f285697a, ((zrj) obj).f285697a);
    }

    public final int hashCode() {
        return this.f285697a.hashCode();
    }
}
