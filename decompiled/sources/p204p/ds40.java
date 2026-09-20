package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;

/* JADX INFO: loaded from: classes8.dex */
public final class ds40 extends es40 {

    /* JADX INFO: renamed from: a */
    public final String f52481a;

    /* JADX INFO: renamed from: b */
    public final String f52482b;

    /* JADX INFO: renamed from: c */
    public final DynamicTagsMetadata f52483c;

    public ds40(String str, String str2, DynamicTagsMetadata dynamicTagsMetadata) {
        this.f52481a = str;
        this.f52482b = str2;
        this.f52483c = dynamicTagsMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds40)) {
            return false;
        }
        ds40 ds40Var = (ds40) obj;
        return wj50.m88271j(this.f52481a, ds40Var.f52481a) && wj50.m88271j(this.f52482b, ds40Var.f52482b) && wj50.m88271j(this.f52483c, ds40Var.f52483c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f52481a.hashCode() * 31, 31, this.f52482b);
        DynamicTagsMetadata dynamicTagsMetadata = this.f52483c;
        return iM77243b + (dynamicTagsMetadata == null ? 0 : dynamicTagsMetadata.hashCode());
    }
}
