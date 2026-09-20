package p204p;

import android.app.Activity;
import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class n600 {

    /* JADX INFO: renamed from: a */
    public final nf0 f150650a;

    /* JADX INFO: renamed from: b */
    public final m3n f150651b;

    /* JADX INFO: renamed from: c */
    public final Activity f150652c;

    /* JADX INFO: renamed from: d */
    public final k5m0 f150653d;

    /* JADX INFO: renamed from: e */
    public final i4t0 f150654e;

    public n600(nf0 nf0Var, m3n m3nVar, Activity activity, k5m0 k5m0Var, h4t0 h4t0Var) {
        this.f150650a = nf0Var;
        this.f150651b = m3nVar;
        this.f150652c = activity;
        this.f150653d = k5m0Var;
        this.f150654e = h4t0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m63752a(ft90 ft90Var, eh00 eh00Var) {
        String str;
        if (!((ze4) this.f150654e.get()).m95962a()) {
            ts90 ts90Var = (ts90) ((p3x) this.f150651b.f139686b).mo25006a();
            ts90Var.f223262U1 = eh00Var;
            Bundle bundleM70528i = pp91.m70528i();
            bundleM70528i.putSerializable("LivestreamErrorDialogFragment.DialogType", ft90Var);
            ts90Var.m49706b1(bundleM70528i);
            m500 m500Var = this.f150650a.f153191a;
            c700 c700VarMo15683g0 = m500Var.mo15683g0();
            if (c700VarMo15683g0.m31611T() || m500Var.mo15683g0().m31604F("LivestreamErrorDialog") != null) {
                return;
            }
            ts90Var.mo63162p1(c700VarMo15683g0, "LivestreamErrorDialog");
            return;
        }
        StringBuilder sb = new StringBuilder("spotify:internal:liveroom:error-dialog:");
        if (ft90Var instanceof vs90) {
            str = "AgeRestricted";
        } else if (ft90Var instanceof ws90) {
            str = "ConnectivityIssue";
        } else if (ft90Var instanceof xs90) {
            str = "Explicit";
        } else if (ft90Var instanceof at90) {
            str = "PremiumRequired";
        } else if (ft90Var instanceof bt90) {
            str = "RoomHasEnded";
        } else if (ft90Var instanceof ct90) {
            str = "RoomNotAvailableInLocation";
        } else if (ft90Var instanceof dt90) {
            str = "RoomNotFound";
        } else if (ft90Var instanceof zs90) {
            str = "PlaybackIssue";
        } else if (ft90Var instanceof ys90) {
            str = "NotificationSubscriptionFailed";
        } else {
            if (!(ft90Var instanceof et90)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "RsvpFailed";
        }
        sb.append(str);
        if (eh00Var != null) {
            sb.append("?closeParentOnDismiss=true");
        }
        k5m0.m55541i(this.f150653d, sb.toString(), null, null, false, 14);
    }
}
