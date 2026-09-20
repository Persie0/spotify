package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class s3f0 {

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f205278a;

    /* JADX INFO: renamed from: b */
    public final String f205279b;

    /* JADX INFO: renamed from: c */
    public final List f205280c;

    /* JADX INFO: renamed from: d */
    public final boolean f205281d;

    public s3f0(MessageResponseToken messageResponseToken, String str, List list, boolean z) {
        this.f205278a = messageResponseToken;
        this.f205279b = str;
        this.f205280c = list;
        this.f205281d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3f0)) {
            return false;
        }
        s3f0 s3f0Var = (s3f0) obj;
        return wj50.m88271j(this.f205278a, s3f0Var.f205278a) && wj50.m88271j(this.f205279b, s3f0Var.f205279b) && wj50.m88271j(this.f205280c, s3f0Var.f205280c) && this.f205281d == s3f0Var.f205281d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f205281d) + s571.m77244c(s571.m77243b(this.f205278a.hashCode() * 31, 31, this.f205279b), 31, this.f205280c);
    }
}
