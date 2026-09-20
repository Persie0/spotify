package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class cs40 extends es40 {

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f41464a;

    /* JADX INFO: renamed from: b */
    public final String f41465b;

    /* JADX INFO: renamed from: c */
    public final DynamicTagsMetadata f41466c;

    public cs40(MessageResponseToken messageResponseToken, String str, DynamicTagsMetadata dynamicTagsMetadata) {
        this.f41464a = messageResponseToken;
        this.f41465b = str;
        this.f41466c = dynamicTagsMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs40)) {
            return false;
        }
        cs40 cs40Var = (cs40) obj;
        return wj50.m88271j(this.f41464a, cs40Var.f41464a) && wj50.m88271j(this.f41465b, cs40Var.f41465b) && wj50.m88271j(this.f41466c, cs40Var.f41466c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f41464a.hashCode() * 31, 31, this.f41465b);
        DynamicTagsMetadata dynamicTagsMetadata = this.f41466c;
        return iM77243b + (dynamicTagsMetadata == null ? 0 : dynamicTagsMetadata.hashCode());
    }
}
