package p204p;

import android.view.View;
import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class z2z0 {

    /* JADX INFO: renamed from: a */
    public final am71 f278715a;

    /* JADX INFO: renamed from: b */
    public int f278716b = 1;

    /* JADX INFO: renamed from: c */
    public int f278717c = 1;

    /* JADX INFO: renamed from: d */
    public int f278718d;

    /* JADX INFO: renamed from: e */
    public View f278719e;

    /* JADX INFO: renamed from: f */
    public x2z0 f278720f;

    /* JADX INFO: renamed from: g */
    public sr4 f278721g;

    public z2z0(am71 am71Var) {
        this.f278715a = am71Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: a */
    public final void m95237a() {
        m95238b();
        this.f278718d++;
        sr4 sr4Var = this.f278721g;
        if (sr4Var != null) {
            switch (edb.m38547C(this.f278717c)) {
                case 0:
                case 1:
                    break;
                case 2:
                    sr4Var.m79016f(mrx0.m62649c(1));
                    sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, z0k0.m95067d(1));
                    sr4Var.m79016f(sr4Var.f213226a);
                    ((rr4) this.f278715a).m76276b(sr4Var.m79015d());
                    break;
                case 3:
                case 5:
                case 7:
                    sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, z0k0.m95067d(1));
                    sr4Var.m79016f(sr4Var.f213226a);
                    ((rr4) this.f278715a).m76276b(sr4Var.m79015d());
                    break;
                case 4:
                    sr4Var.m79016f(mrx0.m62649c(2));
                    sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, z0k0.m95067d(1));
                    sr4Var.m79016f(sr4Var.f213226a);
                    ((rr4) this.f278715a).m76276b(sr4Var.m79015d());
                    break;
                case 6:
                    sr4Var.m79016f(mrx0.m62649c(3));
                    sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, z0k0.m95067d(1));
                    sr4Var.m79016f(sr4Var.f213226a);
                    ((rr4) this.f278715a).m76276b(sr4Var.m79015d());
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        this.f278721g = null;
        this.f278717c = 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m95238b() {
        View view;
        x2z0 x2z0Var = this.f278720f;
        if (x2z0Var != null && (view = this.f278719e) != null) {
            view.removeOnAttachStateChangeListener(x2z0Var);
        }
        this.f278720f = null;
        this.f278719e = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m95239c() {
        sr4 sr4Var;
        if (this.f278717c == 4 && (sr4Var = this.f278721g) != null) {
            this.f278717c = 5;
            sr4Var.m79019k(mrx0.m62649c(2), null, (4 & 4) != 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m95240d(int i) {
        sr4 sr4Var;
        if (this.f278717c == 3 && (sr4Var = this.f278721g) != null) {
            this.f278717c = 4;
            sr4Var.m79016f(mrx0.m62649c(1));
            sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, z0k0.m95067d(i));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m95241e() {
        sr4 sr4Var;
        if (this.f278717c == 2 && (sr4Var = this.f278721g) != null) {
            this.f278717c = 3;
            sr4Var.m79019k(sr4Var.f213226a, null, (4 & 4) != 0);
            sr4Var.m79019k(mrx0.m62649c(1), null, (4 & 4) != 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m95242f(int i) {
        int i2 = this.f278717c;
        if (i2 != 7 || i != this.f278718d) {
            return false;
        }
        if (i2 != 7) {
            return true;
        }
        m95238b();
        this.f278717c = 8;
        sr4 sr4Var = this.f278721g;
        if (sr4Var != null) {
            sr4Var.m79016f(mrx0.m62649c(3));
            sr4Var.m79016f(sr4Var.f213226a);
            ((rr4) this.f278715a).m76276b(sr4Var.m79015d());
        }
        this.f278721g = null;
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m95243g(int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            this.f278716b = 2;
            m95244h(i);
            return;
        }
        if (iM38547C == 1) {
            if (this.f278716b == 2) {
                this.f278716b = 3;
                m95244h(i);
                return;
            }
            return;
        }
        if (iM38547C != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.f278716b == 3) {
            this.f278716b = 4;
            m95244h(i);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m95244h(int i) {
        m95237a();
        sr4 sr4VarM76275a = ((rr4) this.f278715a).m76275a(mrx0.m62648b(i));
        sr4VarM76275a.f213231f = "android-feature-search";
        this.f278721g = sr4VarM76275a;
        this.f278717c = 2;
    }
}
