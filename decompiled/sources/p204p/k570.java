package p204p;

import com.spotify.kidsgraduation.p088v1.GetPrivacyPolicyAcceptanceRequest;
import com.spotify.kidsgraduation.p088v1.PendingGraduationRequest;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes7.dex */
public final class k570 {

    /* JADX INFO: renamed from: a */
    public final l570 f119427a;

    public k570(l570 l570Var) {
        this.f119427a = l570Var;
    }

    /* JADX INFO: renamed from: a */
    public final Single m55423a(String str) {
        iin0 iin0VarM12219o = PendingGraduationRequest.m12219o();
        iin0VarM12219o.m50764m(str);
        PendingGraduationRequest pendingGraduationRequest = (PendingGraduationRequest) iin0VarM12219o.build();
        wj50.m88279p(pendingGraduationRequest);
        return this.f119427a.m58209h(pendingGraduationRequest).map(ddy.f47911i);
    }

    /* JADX INFO: renamed from: b */
    public final Single m55424b() {
        ha10 ha10VarM12215o = GetPrivacyPolicyAcceptanceRequest.m12215o();
        ha10VarM12215o.m46906m();
        GetPrivacyPolicyAcceptanceRequest getPrivacyPolicyAcceptanceRequest = (GetPrivacyPolicyAcceptanceRequest) ha10VarM12215o.build();
        wj50.m88279p(getPrivacyPolicyAcceptanceRequest);
        return this.f119427a.m58210i(getPrivacyPolicyAcceptanceRequest).map(jey.f111729X);
    }
}
