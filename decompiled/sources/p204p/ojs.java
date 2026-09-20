package p204p;

import android.content.Context;
import java.util.Optional;

/* JADX INFO: loaded from: classes8.dex */
public final class ojs implements mv1 {

    /* JADX INFO: renamed from: a */
    public static final ojs f166116a = new ojs();

    /* JADX INFO: renamed from: a */
    public static void m67119a(String str) {
        edb.m38545A("\n            ", str, " was used. This should not happen as the Dummy is only injected if the rollout flag is disabled.\"\n        ");
    }

    @Override // p204p.mv1
    public final sv1 newSessionBuilder(xv1 xv1Var) {
        return new zi5(9);
    }

    @Override // p204p.mv1
    public final void registerMeetingStatusListener(Context context, c8e0 c8e0Var, Optional optional) {
        m67119a("registerMeetingStatusListener");
    }

    @Override // p204p.mv1
    public final void unregisterMeetingStatusListener(Context context) {
        m67119a("unregisterMeetingStatusListener");
    }
}
