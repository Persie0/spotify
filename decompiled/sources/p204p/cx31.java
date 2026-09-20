package p204p;

import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class cx31 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42896a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sr4 f42897b;

    public /* synthetic */ cx31(sr4 sr4Var, int i) {
        this.f42896a = i;
        this.f42897b = sr4Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f42896a) {
            case 0:
                this.f42897b.m79019k(VoiceAssistantsPerformance.MEASURE_NETWORK_SPEAKEASY, null, (4 & 4) != 0);
                return;
            case 1:
                lz71 lz71Var = (lz71) obj;
                boolean z = lz71Var instanceof bz71;
                sr4 sr4Var = this.f42897b;
                if (z) {
                    sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "aborted");
                    return;
                }
                if (lz71Var instanceof cz71) {
                    sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "bad_request");
                    return;
                }
                if (lz71Var instanceof dz71) {
                    sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "forbidden");
                    return;
                }
                if (lz71Var instanceof ez71) {
                    sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "invalid_credentials");
                    return;
                }
                if (lz71Var instanceof fz71) {
                    sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "permanent_backend_error");
                    return;
                }
                if (lz71Var instanceof gz71) {
                    sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "permanent_network_error");
                    return;
                }
                if (lz71Var instanceof hz71) {
                    sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "temporary_backend_error");
                    return;
                } else if (lz71Var instanceof iz71) {
                    sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "unexpected_error");
                    return;
                } else {
                    if (!(lz71Var instanceof kz71)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "success");
                    return;
                }
            case 2:
                this.f42897b.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "failure");
                return;
            case 3:
                this.f42897b.m79019k(VoiceAssistantsPerformance.MEASURE_DETECT_LOGIN, null, (4 & 4) != 0);
                return;
            case 4:
                this.f42897b.m79016f(VoiceAssistantsPerformance.MEASURE_DETECT_LOGIN);
                return;
            default:
                this.f42897b.m79019k(VoiceAssistantsPerformance.MEASURE_SWITCH_TO_LOCAL, null, (4 & 4) != 0);
                return;
        }
    }
}
