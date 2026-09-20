package p204p;

import com.spotify.jam.internal.socialconnect.models.Session;

/* JADX INFO: loaded from: classes7.dex */
public final class vh31 implements wh31 {

    /* JADX INFO: renamed from: a */
    public final Session f241402a;

    public vh31(Session session) {
        this.f241402a = session;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vh31) && wj50.m88271j(this.f241402a, ((vh31) obj).f241402a);
    }

    public final int hashCode() {
        return this.f241402a.hashCode();
    }
}
