package p204p;

import com.spotify.jam.internal.socialconnect.models.SessionUpdate;

/* JADX INFO: loaded from: classes2.dex */
public final class hi31 implements mi31 {

    /* JADX INFO: renamed from: a */
    public final SessionUpdate f91688a;

    public hi31(SessionUpdate sessionUpdate) {
        this.f91688a = sessionUpdate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hi31) && wj50.m88271j(this.f91688a, ((hi31) obj).f91688a);
    }

    public final int hashCode() {
        return this.f91688a.hashCode();
    }
}
