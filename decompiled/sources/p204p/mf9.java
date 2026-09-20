package p204p;

import androidx.media3.session.legacy.PlaybackStateCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract class mf9 {

    /* JADX INFO: renamed from: a */
    public final hf9 f142996a;

    /* JADX INFO: renamed from: b */
    public final lf9 f142997b;

    /* JADX INFO: renamed from: c */
    public if9 f142998c;

    /* JADX INFO: renamed from: d */
    public final int f142999d;

    public mf9(jf9 jf9Var, lf9 lf9Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.f142997b = lf9Var;
        this.f142999d = i;
        this.f142996a = new hf9(jf9Var, j, j2, j3, j4, j5);
    }

    /* JADX INFO: renamed from: b */
    public static int m61617b(d5y d5yVar, long j, vaq0 vaq0Var) {
        if (j == d5yVar.getPosition()) {
            return 0;
        }
        vaq0Var.f239314a = j;
        return 1;
    }

    /* JADX INFO: renamed from: a */
    public final int m61618a(d5y d5yVar, vaq0 vaq0Var) {
        while (true) {
            if9 if9Var = this.f142998c;
            if9Var.getClass();
            long jM50426b = if9.m50426b(if9Var);
            long jM50427c = if9.m50427c(if9Var);
            long jM50428d = if9.m50428d(if9Var);
            long j = jM50427c - jM50426b;
            long j2 = this.f142999d;
            lf9 lf9Var = this.f142997b;
            if (j <= j2) {
                this.f142998c = null;
                lf9Var.mo55702b();
                return m61617b(d5yVar, jM50426b, vaq0Var);
            }
            long position = jM50428d - d5yVar.getPosition();
            if (position < 0 || position > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                return m61617b(d5yVar, jM50428d, vaq0Var);
            }
            d5yVar.mo35044v((int) position);
            d5yVar.mo35037g();
            kf9 kf9VarMo55701a = lf9Var.mo55701a(d5yVar, if9.m50429e(if9Var));
            int i = kf9VarMo55701a.f122108c;
            if (i == -3) {
                this.f142998c = null;
                lf9Var.mo55702b();
                return m61617b(d5yVar, jM50428d, vaq0Var);
            }
            if (i == -2) {
                if9.m50431g(if9Var, kf9VarMo55701a.f122106a, kf9VarMo55701a.f122107b);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = kf9VarMo55701a.f122107b - d5yVar.getPosition();
                    if (position2 >= 0 && position2 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        d5yVar.mo35044v((int) position2);
                    }
                    this.f142998c = null;
                    lf9Var.mo55702b();
                    return m61617b(d5yVar, kf9VarMo55701a.f122107b, vaq0Var);
                }
                if9.m50430f(if9Var, kf9VarMo55701a.f122106a, kf9VarMo55701a.f122107b);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m61619c(long j) {
        if9 if9Var = this.f142998c;
        if (if9Var == null || if9.m50425a(if9Var) != j) {
            hf9 hf9Var = this.f142996a;
            this.f142998c = new if9(j, hf9Var.m47336l(j), 0L, hf9Var.f90640c, hf9Var.f90641d, hf9Var.f90642e, hf9Var.f90643f);
        }
    }
}
