package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ViewRequest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface ske {
    /* JADX INFO: renamed from: c */
    static /* synthetic */ Single m78369c(ske skeVar, String str, TriggerType triggerType, String str2, List list, d850 d850Var, ytx0 ytx0Var, DynamicTagsMetadata dynamicTagsMetadata, ConflictResolutionStrategy conflictResolutionStrategy, ase0 ase0Var, int i) {
        DynamicTagsMetadata dynamicTagsMetadata2;
        TriggerType triggerType2 = (i & 2) != 0 ? TriggerType.CLIENT_EVENT : triggerType;
        String str3 = (i & 4) != 0 ? "" : str2;
        List list2 = (i & 8) != 0 ? lau.f131415a : list;
        d850 d850Var2 = (i & 16) != 0 ? null : d850Var;
        ytx0 ytx0Var2 = (i & 32) != 0 ? m3q.f139697a : ytx0Var;
        if ((i & 64) != 0) {
            dynamicTagsMetadata2 = new DynamicTagsMetadata(null, null, null, null, 15, null);
        } else {
            dynamicTagsMetadata2 = dynamicTagsMetadata;
        }
        return skeVar.mo78370a(str, triggerType2, list2, d850Var2, str3, ytx0Var2, dynamicTagsMetadata2, (i & 128) != 0 ? ConflictResolutionStrategy.DISCARD_SELF : conflictResolutionStrategy, (i & 256) != 0 ? new ase0(new wre0(false), ure0.f233341a) : ase0Var);
    }

    /* JADX INFO: renamed from: a */
    Single mo78370a(String str, TriggerType triggerType, List list, d850 d850Var, String str2, ytx0 ytx0Var, DynamicTagsMetadata dynamicTagsMetadata, ConflictResolutionStrategy conflictResolutionStrategy, ase0 ase0Var);

    /* JADX INFO: renamed from: b */
    void mo78371b(String str, DismissReason dismissReason);

    /* JADX INFO: renamed from: d */
    Observable mo78372d(ViewRequest viewRequest);

    /* JADX INFO: renamed from: e */
    pza mo78373e();
}
