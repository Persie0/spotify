package p204p;

import android.content.Context;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes2.dex */
public final class nya extends vya {

    /* JADX INFO: renamed from: a */
    public final Context f159750a;

    /* JADX INFO: renamed from: b */
    public final MessageResponseToken f159751b;

    /* JADX INFO: renamed from: c */
    public final g0r0 f159752c;

    /* JADX INFO: renamed from: d */
    public final DynamicTagsMetadata f159753d;

    /* JADX INFO: renamed from: e */
    public final ytx0 f159754e;

    /* JADX INFO: renamed from: f */
    public final ase0 f159755f;

    public nya(Context context, MessageResponseToken messageResponseToken, g0r0 g0r0Var, DynamicTagsMetadata dynamicTagsMetadata, ytx0 ytx0Var, ase0 ase0Var) {
        this.f159750a = context;
        this.f159751b = messageResponseToken;
        this.f159752c = g0r0Var;
        this.f159753d = dynamicTagsMetadata;
        this.f159754e = ytx0Var;
        this.f159755f = ase0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nya)) {
            return false;
        }
        nya nyaVar = (nya) obj;
        return wj50.m88271j(this.f159750a, nyaVar.f159750a) && wj50.m88271j(this.f159751b, nyaVar.f159751b) && wj50.m88271j(this.f159752c, nyaVar.f159752c) && wj50.m88271j(this.f159753d, nyaVar.f159753d) && wj50.m88271j(this.f159754e, nyaVar.f159754e) && wj50.m88271j(this.f159755f, nyaVar.f159755f);
    }

    public final int hashCode() {
        int iHashCode = (this.f159752c.hashCode() + ((this.f159751b.hashCode() + (this.f159750a.hashCode() * 31)) * 31)) * 31;
        DynamicTagsMetadata dynamicTagsMetadata = this.f159753d;
        int iHashCode2 = (this.f159754e.hashCode() + ((iHashCode + (dynamicTagsMetadata == null ? 0 : dynamicTagsMetadata.hashCode())) * 31)) * 31;
        ase0 ase0Var = this.f159755f;
        return iHashCode2 + (ase0Var != null ? ase0Var.hashCode() : 0);
    }
}
