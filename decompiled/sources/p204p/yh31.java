package p204p;

import com.spotify.jam.internal.socialconnect.models.Session;

/* JADX INFO: loaded from: classes2.dex */
public final class yh31 implements mi31 {

    /* JADX INFO: renamed from: a */
    public final Session f272721a;

    public yh31(Session session) {
        this.f272721a = session;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yh31) && wj50.m88271j(this.f272721a, ((yh31) obj).f272721a);
    }

    public final int hashCode() {
        return this.f272721a.hashCode();
    }
}
