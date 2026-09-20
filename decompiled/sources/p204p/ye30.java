package p204p;

import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class ye30 implements Function {

    /* JADX INFO: renamed from: a */
    public sr4 f271912a;

    /* JADX INFO: renamed from: b */
    public final am71 f271913b;

    public ye30(sr4 sr4Var, am71 am71Var) {
        this.f271912a = sr4Var;
        this.f271913b = am71Var;
    }

    /* JADX INFO: renamed from: a */
    public void m93520a(int i) {
        sr4 sr4Var = this.f271912a;
        sr4Var.m79016f("mbs_play_from_search");
        sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, mrx0.m62650d(i));
        ((rr4) this.f271913b).m76276b(sr4Var.m79015d());
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        sr4 sr4Var;
        if ((((lcf) obj) instanceof icf) && (sr4Var = this.f271912a) != null) {
            sr4Var.m79016f(VoiceAssistantsPerformance.MEASURE_PLAY_COMMAND);
            mm71 mm71VarM79015d = sr4Var.m79015d();
            am71 am71Var = this.f271913b;
            if (am71Var != null) {
                ((rr4) am71Var).m76276b(mm71VarM79015d);
            }
        }
        return CompletableEmpty.f7437a;
    }

    /* JADX INFO: renamed from: b */
    public void m93521b(int i) {
        sr4 sr4Var = this.f271912a;
        sr4Var.m79016f("mbs_search");
        sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, mrx0.m62650d(i));
        ((rr4) this.f271913b).m76276b(sr4Var.m79015d());
    }

    /* JADX INFO: renamed from: c */
    public void m93522c(int i, String str) {
        String str2;
        sr4 sr4Var = this.f271912a;
        if (str == null) {
            str = "unknown";
        }
        sr4Var.m79014b("package_name", str);
        sr4Var.m79019k("mbs_search", null, (4 & 4) != 0);
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            str2 = "media1";
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "media3";
        }
        sr4Var.m79013a("media_session_version", str2);
        sr4Var.m79013a("playback_outcome", "unknown");
    }

    public ye30(am71 am71Var, int i) {
        switch (i) {
            case 2:
                this.f271913b = am71Var;
                sr4 sr4VarM76275a = ((rr4) am71Var).m76275a("mbs_search");
                sr4VarM76275a.f213231f = "android-system-media-browser-service";
                this.f271912a = sr4VarM76275a;
                break;
            default:
                this.f271913b = am71Var;
                break;
        }
    }
}
