package p204p;

import com.spotify.cosmos.util.proto.PlayabilityRestriction;

/* JADX INFO: loaded from: classes.dex */
public final class uto0 {

    /* JADX INFO: renamed from: a */
    public final PlayabilityRestriction f233953a;

    /* JADX INFO: renamed from: b */
    public final String f233954b;

    public uto0(PlayabilityRestriction playabilityRestriction, String str) {
        this.f233953a = playabilityRestriction;
        this.f233954b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uto0)) {
            return false;
        }
        uto0 uto0Var = (uto0) obj;
        return this.f233953a == uto0Var.f233953a && wj50.m88271j(this.f233954b, uto0Var.f233954b);
    }

    public final int hashCode() {
        PlayabilityRestriction playabilityRestriction = this.f233953a;
        int iHashCode = (playabilityRestriction == null ? 0 : playabilityRestriction.hashCode()) * 31;
        String str = this.f233954b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
