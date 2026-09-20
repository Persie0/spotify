package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;

/* JADX INFO: loaded from: classes8.dex */
public final class is40 {

    /* JADX INFO: renamed from: a */
    public final String f105133a;

    /* JADX INFO: renamed from: b */
    public final String f105134b;

    /* JADX INFO: renamed from: c */
    public final DynamicTagsMetadata f105135c;

    public is40(String str, String str2, DynamicTagsMetadata dynamicTagsMetadata) {
        this.f105133a = str;
        this.f105134b = str2;
        this.f105135c = dynamicTagsMetadata;
    }

    /* JADX INFO: renamed from: a */
    public final DynamicTagsMetadata m51493a() {
        return this.f105135c;
    }

    /* JADX INFO: renamed from: b */
    public final String m51494b() {
        return this.f105134b;
    }

    /* JADX INFO: renamed from: c */
    public final String m51495c() {
        return this.f105133a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is40)) {
            return false;
        }
        is40 is40Var = (is40) obj;
        return wj50.m88271j(this.f105133a, is40Var.f105133a) && wj50.m88271j(this.f105134b, is40Var.f105134b) && wj50.m88271j(this.f105135c, is40Var.f105135c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f105133a.hashCode() * 31, 31, this.f105134b);
        DynamicTagsMetadata dynamicTagsMetadata = this.f105135c;
        return iM77243b + (dynamicTagsMetadata == null ? 0 : dynamicTagsMetadata.hashCode());
    }
}
