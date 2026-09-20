package p204p;

import android.content.Context;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class qve0 {

    /* JADX INFO: renamed from: a */
    public final Context f192998a;

    /* JADX INFO: renamed from: b */
    public final MessageResponseToken f192999b;

    /* JADX INFO: renamed from: c */
    public final g0r0 f193000c;

    /* JADX INFO: renamed from: d */
    public final DynamicTagsMetadata f193001d;

    /* JADX INFO: renamed from: e */
    public final ytx0 f193002e;

    /* JADX INFO: renamed from: f */
    public final ase0 f193003f;

    public qve0(Context context, MessageResponseToken messageResponseToken, g0r0 g0r0Var, DynamicTagsMetadata dynamicTagsMetadata, ytx0 ytx0Var, ase0 ase0Var) {
        this.f192998a = context;
        this.f192999b = messageResponseToken;
        this.f193000c = g0r0Var;
        this.f193001d = dynamicTagsMetadata;
        this.f193002e = ytx0Var;
        this.f193003f = ase0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Context m73990a() {
        return this.f192998a;
    }

    /* JADX INFO: renamed from: b */
    public final ytx0 m73991b() {
        return this.f193002e;
    }

    /* JADX INFO: renamed from: c */
    public final DynamicTagsMetadata m73992c() {
        return this.f193001d;
    }

    /* JADX INFO: renamed from: d */
    public final ase0 m73993d() {
        return this.f193003f;
    }

    /* JADX INFO: renamed from: e */
    public final g0r0 m73994e() {
        return this.f193000c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qve0)) {
            return false;
        }
        qve0 qve0Var = (qve0) obj;
        return wj50.m88271j(this.f192998a, qve0Var.f192998a) && wj50.m88271j(this.f192999b, qve0Var.f192999b) && wj50.m88271j(this.f193000c, qve0Var.f193000c) && wj50.m88271j(this.f193001d, qve0Var.f193001d) && wj50.m88271j(this.f193002e, qve0Var.f193002e) && wj50.m88271j(this.f193003f, qve0Var.f193003f);
    }

    /* JADX INFO: renamed from: f */
    public final MessageResponseToken m73995f() {
        return this.f192999b;
    }

    public final int hashCode() {
        int iHashCode = (this.f193000c.hashCode() + ((this.f192999b.hashCode() + (this.f192998a.hashCode() * 31)) * 31)) * 31;
        DynamicTagsMetadata dynamicTagsMetadata = this.f193001d;
        int iHashCode2 = (this.f193002e.hashCode() + ((iHashCode + (dynamicTagsMetadata == null ? 0 : dynamicTagsMetadata.hashCode())) * 31)) * 31;
        ase0 ase0Var = this.f193003f;
        return iHashCode2 + (ase0Var != null ? ase0Var.hashCode() : 0);
    }
}
