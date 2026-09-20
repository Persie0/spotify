package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.mobius.MobiusLoop;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class gza {

    /* JADX INFO: renamed from: a */
    public volatile MobiusLoop f85874a;

    /* JADX INFO: renamed from: b */
    public volatile DiscardReason.UserLoggingOut f85875b;

    /* JADX INFO: renamed from: a */
    public final DiscardReason m46194a(String str) {
        wya wyaVar;
        Set set;
        Object next;
        DiscardReason.UserLoggingOut userLoggingOut = this.f85875b;
        if (userLoggingOut != null) {
            return userLoggingOut;
        }
        MobiusLoop mobiusLoop = this.f85874a;
        if (mobiusLoop != null && (wyaVar = (wya) mobiusLoop.f5591i) != null && (set = wyaVar.f256242g) != null) {
            Iterator it = set.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!wj50.m88271j(((rza) ((pqm0) next).f180350a).f204102a, str));
            pqm0 pqm0Var = (pqm0) next;
            if (pqm0Var != null) {
                return (DiscardReason) pqm0Var.f180351b;
            }
        }
        return null;
    }
}
