package p204p;

import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class hk4 {

    /* JADX INFO: renamed from: a */
    public final am71 f92336a;

    /* JADX INFO: renamed from: b */
    public final wa81 f92337b;

    /* JADX INFO: renamed from: c */
    public sr4 f92338c;

    /* JADX INFO: renamed from: d */
    public boolean f92339d;

    /* JADX INFO: renamed from: e */
    public eh00 f92340e;

    /* JADX INFO: renamed from: f */
    public UUID f92341f;

    public hk4(am71 am71Var) {
        wa81 wa81VarM74221e = qyq0.m74221e();
        this.f92336a = am71Var;
        this.f92337b = wa81VarM74221e;
        this.f92338c = ((rr4) am71Var).m76275a("navigate_to_page");
        this.f92339d = true;
    }

    /* JADX INFO: renamed from: d */
    public static void m47733d(hk4 hk4Var, eh00 eh00Var) {
        hk4Var.f92341f = null;
        hk4Var.f92340e = eh00Var;
        hk4Var.m47737e(1, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m47734a(int i) {
        sr4 sr4Var = this.f92338c;
        if (sr4Var != null) {
            sr4Var.m79016f(ms2.m62677b(i));
        }
        this.f92337b.mo53786f(ms2.m62677b(i), "ntp");
    }

    /* JADX INFO: renamed from: b */
    public final void m47735b(int i) {
        String str;
        sr4 sr4Var = this.f92338c;
        if (sr4Var != null) {
            sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, ms2.m62678c(i));
            m47734a(1);
            eh00 eh00Var = this.f92340e;
            if (eh00Var != null && (str = (String) eh00Var.invoke()) != null) {
                sr4Var.m79013a("page_identifier", str);
            }
            mm71 mm71VarM79015d = sr4Var.m79015d();
            UUID uuid = this.f92341f;
            if (uuid != null) {
                mm71VarM79015d = mm71.m62272a(mm71VarM79015d, null, uuid, 447);
            }
            ((rr4) this.f92336a).m76276b(mm71VarM79015d);
        }
        this.f92338c = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m47736c() {
        boolean z = this.f92339d;
        int i = 1;
        if (!z) {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2;
        }
        m47735b(i);
    }

    /* JADX INFO: renamed from: e */
    public final void m47737e(int i, boolean z) {
        sr4 sr4Var = this.f92338c;
        if (sr4Var != null) {
            sr4Var.m79019k(ms2.m62677b(i), null, z);
        }
        wa81.m87586a(this.f92337b, ms2.m62677b(i), "ntp", 4);
    }
}
