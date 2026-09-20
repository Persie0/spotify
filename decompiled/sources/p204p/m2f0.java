package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class m2f0 {

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f139330a;

    /* JADX INFO: renamed from: b */
    public final boolean f139331b;

    /* JADX INFO: renamed from: c */
    public final boolean f139332c;

    /* JADX INFO: renamed from: d */
    public final Set f139333d;

    public m2f0(MessageResponseToken messageResponseToken, boolean z, boolean z2, Set set) {
        this.f139330a = messageResponseToken;
        this.f139331b = z;
        this.f139332c = z2;
        this.f139333d = set;
    }

    /* JADX INFO: renamed from: a */
    public static m2f0 m60574a(m2f0 m2f0Var, MessageResponseToken messageResponseToken, boolean z, Set set, int i) {
        if ((i & 1) != 0) {
            messageResponseToken = m2f0Var.f139330a;
        }
        if ((i & 2) != 0) {
            z = m2f0Var.f139331b;
        }
        boolean z2 = (i & 4) != 0 ? m2f0Var.f139332c : false;
        if ((i & 8) != 0) {
            set = m2f0Var.f139333d;
        }
        m2f0Var.getClass();
        return new m2f0(messageResponseToken, z, z2, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2f0)) {
            return false;
        }
        m2f0 m2f0Var = (m2f0) obj;
        return wj50.m88271j(this.f139330a, m2f0Var.f139330a) && this.f139331b == m2f0Var.f139331b && this.f139332c == m2f0Var.f139332c && wj50.m88271j(this.f139333d, m2f0Var.f139333d);
    }

    public final int hashCode() {
        MessageResponseToken messageResponseToken = this.f139330a;
        int iM77245d = s571.m77245d(s571.m77245d((messageResponseToken == null ? 0 : messageResponseToken.hashCode()) * 31, 31, this.f139331b), 31, this.f139332c);
        Set set = this.f139333d;
        return iM77245d + (set != null ? set.hashCode() : 0);
    }
}
