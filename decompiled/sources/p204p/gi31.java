package p204p;

import com.spotify.jam.internal.socialconnect.models.JamStatus;

/* JADX INFO: loaded from: classes2.dex */
public final class gi31 implements mi31 {

    /* JADX INFO: renamed from: a */
    public final JamStatus f80041a;

    public gi31(JamStatus jamStatus) {
        this.f80041a = jamStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gi31) && wj50.m88271j(this.f80041a, ((gi31) obj).f80041a);
    }

    public final int hashCode() {
        return this.f80041a.hashCode();
    }
}
