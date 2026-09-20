package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.BottomSheetTemplate;

/* JADX INFO: loaded from: classes8.dex */
public final class vfa {

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f240917a;

    /* JADX INFO: renamed from: b */
    public final BottomSheetTemplate f240918b;

    /* JADX INFO: renamed from: c */
    public final boolean f240919c;

    static {
        BottomSheetTemplate.Companion companion = BottomSheetTemplate.INSTANCE;
        int i = MessageResponseToken.$stable;
    }

    public vfa(MessageResponseToken messageResponseToken, BottomSheetTemplate bottomSheetTemplate, boolean z) {
        this.f240917a = messageResponseToken;
        this.f240918b = bottomSheetTemplate;
        this.f240919c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfa)) {
            return false;
        }
        vfa vfaVar = (vfa) obj;
        return wj50.m88271j(this.f240917a, vfaVar.f240917a) && wj50.m88271j(this.f240918b, vfaVar.f240918b) && this.f240919c == vfaVar.f240919c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f240919c) + ((this.f240918b.hashCode() + (this.f240917a.hashCode() * 31)) * 31);
    }
}
