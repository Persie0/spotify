package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rza {

    /* JADX INFO: renamed from: a */
    public final String f204102a;

    /* JADX INFO: renamed from: b */
    public final String f204103b;

    /* JADX INFO: renamed from: c */
    public final TriggerType f204104c;

    /* JADX INFO: renamed from: d */
    public final String f204105d;

    /* JADX INFO: renamed from: e */
    public final List f204106e;

    /* JADX INFO: renamed from: f */
    public final d850 f204107f;

    /* JADX INFO: renamed from: g */
    public final ytx0 f204108g;

    /* JADX INFO: renamed from: h */
    public final DynamicTagsMetadata f204109h;

    /* JADX INFO: renamed from: i */
    public final ConflictResolutionStrategy f204110i;

    /* JADX INFO: renamed from: j */
    public final ase0 f204111j;

    public rza(String str, String str2, TriggerType triggerType, String str3, List list, d850 d850Var, ytx0 ytx0Var, DynamicTagsMetadata dynamicTagsMetadata, ConflictResolutionStrategy conflictResolutionStrategy, ase0 ase0Var) {
        this.f204102a = str;
        this.f204103b = str2;
        this.f204104c = triggerType;
        this.f204105d = str3;
        this.f204106e = list;
        this.f204107f = d850Var;
        this.f204108g = ytx0Var;
        this.f204109h = dynamicTagsMetadata;
        this.f204110i = conflictResolutionStrategy;
        this.f204111j = ase0Var;
    }

    /* JADX INFO: renamed from: a */
    public static rza m76780a(rza rzaVar, String str, ase0 ase0Var, int i) {
        String str2 = rzaVar.f204102a;
        String str3 = rzaVar.f204103b;
        TriggerType triggerType = rzaVar.f204104c;
        if ((i & 8) != 0) {
            str = rzaVar.f204105d;
        }
        String str4 = str;
        List list = rzaVar.f204106e;
        d850 d850Var = rzaVar.f204107f;
        ytx0 ytx0Var = rzaVar.f204108g;
        DynamicTagsMetadata dynamicTagsMetadata = rzaVar.f204109h;
        ConflictResolutionStrategy conflictResolutionStrategy = rzaVar.f204110i;
        if ((i & 512) != 0) {
            ase0Var = rzaVar.f204111j;
        }
        rzaVar.getClass();
        return new rza(str2, str3, triggerType, str4, list, d850Var, ytx0Var, dynamicTagsMetadata, conflictResolutionStrategy, ase0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rza)) {
            return false;
        }
        rza rzaVar = (rza) obj;
        return wj50.m88271j(this.f204102a, rzaVar.f204102a) && wj50.m88271j(this.f204103b, rzaVar.f204103b) && this.f204104c == rzaVar.f204104c && wj50.m88271j(this.f204105d, rzaVar.f204105d) && wj50.m88271j(this.f204106e, rzaVar.f204106e) && wj50.m88271j(this.f204107f, rzaVar.f204107f) && wj50.m88271j(this.f204108g, rzaVar.f204108g) && wj50.m88271j(this.f204109h, rzaVar.f204109h) && this.f204110i == rzaVar.f204110i && wj50.m88271j(this.f204111j, rzaVar.f204111j);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b((this.f204104c.hashCode() + s571.m77243b(this.f204102a.hashCode() * 31, 31, this.f204103b)) * 31, 31, this.f204105d), 31, this.f204106e);
        d850 d850Var = this.f204107f;
        int iHashCode = (this.f204108g.hashCode() + ((iM77244c + (d850Var == null ? 0 : d850Var.hashCode())) * 31)) * 31;
        DynamicTagsMetadata dynamicTagsMetadata = this.f204109h;
        int iHashCode2 = dynamicTagsMetadata != null ? dynamicTagsMetadata.hashCode() : 0;
        return this.f204111j.hashCode() + ((this.f204110i.hashCode() + ((iHashCode + iHashCode2) * 31)) * 31);
    }

    public /* synthetic */ rza(String str, String str2, TriggerType triggerType, String str3, d850 d850Var, ytx0 ytx0Var, DynamicTagsMetadata dynamicTagsMetadata, ase0 ase0Var, int i) {
        this(str, str2, triggerType, str3, lau.f131415a, (i & 32) != 0 ? null : d850Var, (i & 64) != 0 ? m3q.f139697a : ytx0Var, dynamicTagsMetadata, ConflictResolutionStrategy.DISCARD_SELF, ase0Var);
    }
}
