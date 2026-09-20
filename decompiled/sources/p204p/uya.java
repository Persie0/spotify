package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.UserLoginState;

/* JADX INFO: loaded from: classes2.dex */
public final class uya extends vya {

    /* JADX INFO: renamed from: a */
    public final UserLoginState f235220a;

    public uya(UserLoginState userLoginState) {
        this.f235220a = userLoginState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uya) && this.f235220a == ((uya) obj).f235220a;
    }

    public final int hashCode() {
        return this.f235220a.hashCode();
    }
}
