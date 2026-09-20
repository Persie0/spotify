package p204p;

import android.content.Context;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ViewRequest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public interface jr40 {
    /* JADX INFO: renamed from: a */
    static Observable m54167a(jr40 jr40Var, Context context, hc80 hc80Var, MessageResponseToken messageResponseToken, DynamicTagsMetadata dynamicTagsMetadata, int i) {
        String entityUri;
        String creatorName;
        String entityName;
        String entityImageUrl;
        String entityImageUrl2 = null;
        if ((i & 8) != 0) {
            dynamicTagsMetadata = null;
        }
        ase0 ase0Var = new ase0(new yre0(true), ure0.f233341a);
        vr40 vr40Var = (vr40) jr40Var;
        ske skeVar = vr40Var.f244075a;
        if (dynamicTagsMetadata == null || (entityUri = dynamicTagsMetadata.getEntityUri()) == null) {
            DynamicTagsMetadata dynamicTagsMetadata2 = messageResponseToken.getMessageRequest().getDynamicTagsMetadata();
            entityUri = dynamicTagsMetadata2 != null ? dynamicTagsMetadata2.getEntityUri() : null;
            if (entityUri == null) {
                entityUri = messageResponseToken.getMessageRequest().getPageUri();
            }
        }
        if (dynamicTagsMetadata == null || (creatorName = dynamicTagsMetadata.getCreatorName()) == null) {
            DynamicTagsMetadata dynamicTagsMetadata3 = messageResponseToken.getMessageRequest().getDynamicTagsMetadata();
            creatorName = dynamicTagsMetadata3 != null ? dynamicTagsMetadata3.getCreatorName() : null;
        }
        if (dynamicTagsMetadata == null || (entityName = dynamicTagsMetadata.getEntityName()) == null) {
            DynamicTagsMetadata dynamicTagsMetadata4 = messageResponseToken.getMessageRequest().getDynamicTagsMetadata();
            entityName = dynamicTagsMetadata4 != null ? dynamicTagsMetadata4.getEntityName() : null;
        }
        if (dynamicTagsMetadata == null || (entityImageUrl = dynamicTagsMetadata.getEntityImageUrl()) == null) {
            DynamicTagsMetadata dynamicTagsMetadata5 = messageResponseToken.getMessageRequest().getDynamicTagsMetadata();
            if (dynamicTagsMetadata5 != null) {
                entityImageUrl2 = dynamicTagsMetadata5.getEntityImageUrl();
            }
        } else {
            entityImageUrl2 = entityImageUrl;
        }
        return skeVar.mo78372d(new ViewRequest(context, hc80Var, messageResponseToken, new DynamicTagsMetadata(entityUri, creatorName, entityName, entityImageUrl2), xza.f267563a, eu40.f62869a, ase0Var)).map(new sr40(vr40Var, messageResponseToken, hc80Var));
    }

    /* JADX INFO: renamed from: b */
    static Single m54168b(jr40 jr40Var, String str, String str2, DynamicTagsMetadata dynamicTagsMetadata, int i) {
        String entityUri;
        DynamicTagsMetadata dynamicTagsMetadata2 = (i & 4) != 0 ? null : dynamicTagsMetadata;
        ase0 ase0Var = new ase0(new yre0(true), ure0.f233341a);
        vr40 vr40Var = (vr40) jr40Var;
        vr40Var.getClass();
        return Single.amb(h6f.m46715L(Single.timer(500L, TimeUnit.MILLISECONDS, vr40Var.f244076b).map(new ur40(str)), ske.m78369c(vr40Var.f244075a, str, TriggerType.CLIENT_EVENT, str2, null, null, eu40.f62869a, new DynamicTagsMetadata((dynamicTagsMetadata2 == null || (entityUri = dynamicTagsMetadata2.getEntityUri()) == null) ? str2 : entityUri, null, dynamicTagsMetadata2 != null ? dynamicTagsMetadata2.getEntityName() : null, dynamicTagsMetadata2 != null ? dynamicTagsMetadata2.getEntityImageUrl() : null, 2, null), null, ase0Var, 152))).map(tr40.f222965a);
    }
}
