package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class rfa implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        DismissReason dismissReason;
        vfa vfaVar = (vfa) obj;
        ofa ofaVar = (ofa) obj2;
        MessageResponseToken messageResponseToken = vfaVar.f240917a;
        if (ofaVar.equals(mfa.f143005a)) {
            return Next.m15605a(Collections.singleton(new gfa(messageResponseToken)));
        }
        if (!ofaVar.equals(kfa.f122113a) && !ofaVar.equals(lfa.f132858a) && !ofaVar.equals(nfa.f153303a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (vfaVar.f240919c) {
            return Next.m15608j();
        }
        vfa vfaVar2 = new vfa(messageResponseToken, vfaVar.f240918b, true);
        if (ofaVar instanceof kfa) {
            dismissReason = DismissReason.BackButtonTapped.INSTANCE;
        } else {
            dismissReason = ofaVar instanceof nfa ? DismissReason.MessageSwiped.INSTANCE : DismissReason.BackgroundViewTapped.INSTANCE;
        }
        return Next.m15607i(vfaVar2, Collections.singleton(new ffa(messageResponseToken, dismissReason)));
    }
}
