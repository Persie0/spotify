package p204p;

import com.spotify.jam.internal.socialconnect.models.Session;

/* JADX INFO: loaded from: classes7.dex */
public final class lh31 implements mh31 {

    /* JADX INFO: renamed from: a */
    public final Session f133360a;

    public lh31(Session session) {
        this.f133360a = session;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lh31) && wj50.m88271j(this.f133360a, ((lh31) obj).f133360a);
    }

    public final int hashCode() {
        return this.f133360a.hashCode();
    }
}
