package p204p;

import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class is0 {

    /* JADX INFO: renamed from: a */
    public final am71 f105080a;

    /* JADX INFO: renamed from: b */
    public sr4 f105081b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f105082c = new LinkedHashSet();

    public is0(am71 am71Var) {
        this.f105080a = am71Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m51477a(int i) {
        String strM42458b = fr0.m42458b(i);
        LinkedHashSet linkedHashSet = this.f105082c;
        if (linkedHashSet.contains(strM42458b)) {
            return;
        }
        sr4 sr4Var = this.f105081b;
        if (sr4Var != null) {
            sr4Var.m79019k(fr0.m42458b(i), null, (4 & 4) != 0);
        }
        linkedHashSet.add(fr0.m42458b(i));
    }

    /* JADX INFO: renamed from: b */
    public final void m51478b(int i) {
        sr4 sr4Var = this.f105081b;
        LinkedHashSet linkedHashSet = this.f105082c;
        if (sr4Var != null) {
            if (linkedHashSet.contains(fr0.m42458b(1))) {
                sr4Var.m79016f(fr0.m42458b(1));
            }
            sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, fr0.m42457a(i));
            ((rr4) this.f105080a).m76276b(sr4Var.m79015d());
        }
        this.f105081b = null;
        linkedHashSet.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m51479c(int i, int i2) {
        sr4 sr4Var = this.f105081b;
        if (sr4Var != null) {
            sr4Var.m79016f(fr0.m42458b(i));
        }
        m51478b(i2);
    }
}
