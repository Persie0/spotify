package p204p;

import com.spotify.jam.internal.socialconnect.models.AcceptJamJoinResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class u830 extends l930 {

    /* JADX INFO: renamed from: a */
    public final String f227800a;

    /* JADX INFO: renamed from: b */
    public final AcceptJamJoinResponse f227801b;

    public u830(String str, AcceptJamJoinResponse acceptJamJoinResponse) {
        this.f227800a = str;
        this.f227801b = acceptJamJoinResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u830)) {
            return false;
        }
        u830 u830Var = (u830) obj;
        return wj50.m88271j(this.f227800a, u830Var.f227800a) && wj50.m88271j(this.f227801b, u830Var.f227801b);
    }

    public final int hashCode() {
        int iHashCode = this.f227800a.hashCode() * 31;
        AcceptJamJoinResponse acceptJamJoinResponse = this.f227801b;
        return iHashCode + (acceptJamJoinResponse == null ? 0 : acceptJamJoinResponse.hashCode());
    }
}
