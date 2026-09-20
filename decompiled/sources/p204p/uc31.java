package p204p;

import com.spotify.jam.internal.socialconnect.models.SocialConnectErrorResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class uc31 implements wc31 {

    /* JADX INFO: renamed from: a */
    public final SocialConnectErrorResponse f228934a;

    public uc31(SocialConnectErrorResponse socialConnectErrorResponse) {
        this.f228934a = socialConnectErrorResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uc31) && wj50.m88271j(this.f228934a, ((uc31) obj).f228934a);
    }

    public final int hashCode() {
        return this.f228934a.hashCode();
    }
}
