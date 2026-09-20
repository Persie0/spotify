package p204p;

import android.content.Context;
import com.spotify.collection.offlinesyncnotification.offlinesyncworker.OfflineSyncWorker;
import com.spotify.engagesdk.engagecontinuationcluster.workers.EngageContinuationClusterClearer;
import com.spotify.engagesdk.engagerecommendationscluster.workers.EngageRecommendationsClusterClearer;
import com.spotify.engagesdk.engagesigninrequest.workers.EngageOnBroadcastSignInHandler;
import com.spotify.yourlibrary.importsyncnotification.importsyncworker.ImportSyncWorker;

/* JADX INFO: loaded from: classes6.dex */
public final class b7v implements dit0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24394a;

    /* JADX INFO: renamed from: b */
    public final Context f24395b;

    public /* synthetic */ b7v(Context context, int i) {
        this.f24394a = i;
        this.f24395b = context;
    }

    @Override // p204p.dit0
    /* JADX INFO: renamed from: a */
    public final void mo28403a() {
        switch (this.f24394a) {
            case 0:
                knl0 knl0Var = new knl0(EngageContinuationClusterClearer.class);
                i1e1 i1e1Var = knl0Var.f33079c;
                i1e1Var.f97515q = true;
                i1e1Var.f97516r = 1;
                l0e1.m57799S(this.f24395b).m55007t("EngageContinuationClusterClearer", 2, (lnl0) knl0Var.m31255b());
                break;
            case 1:
                l0e1.m57799S(this.f24395b).m55007t("EngageSignInRequester", 2, (lnl0) new knl0(EngageOnBroadcastSignInHandler.class).m31255b());
                break;
            case 2:
                knl0 knl0Var2 = new knl0(EngageRecommendationsClusterClearer.class);
                i1e1 i1e1Var2 = knl0Var2.f33079c;
                i1e1Var2.f97515q = true;
                i1e1Var2.f97516r = 1;
                l0e1.m57799S(this.f24395b).m55007t("EngageRecommendationsClusterClearer", 2, (lnl0) knl0Var2.m31255b());
                break;
            case 3:
                l0e1.m57799S(this.f24395b).m55007t("import_sync", 2, (lnl0) new knl0(ImportSyncWorker.class).m31255b());
                break;
            default:
                l0e1.m57799S(this.f24395b).m55007t("offline_sync", 2, (lnl0) new knl0(OfflineSyncWorker.class).m31255b());
                break;
        }
    }

    @Override // p204p.dit0
    public final void cancel() {
        switch (this.f24394a) {
            case 0:
                cv9.m33995m("EngageContinuationClusterClearer", l0e1.m57799S(this.f24395b));
                break;
            case 1:
                cv9.m33995m("EngageSignInRequester", l0e1.m57799S(this.f24395b));
                break;
            case 2:
                cv9.m33995m("EngageRecommendationsClusterClearer", l0e1.m57799S(this.f24395b));
                break;
            case 3:
                cv9.m33995m("import_sync", l0e1.m57799S(this.f24395b));
                break;
            default:
                cv9.m33995m("offline_sync", l0e1.m57799S(this.f24395b));
                break;
        }
    }
}
