package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class kfw extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f122232a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lfw f122233b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f122234c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfw(int i, lfw lfwVar, long j) {
        super(0);
        this.f122232a = i;
        this.f122233b = lfwVar;
        this.f122234c = j;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int iM38547C = edb.m38547C(this.f122232a);
        if (iM38547C != 0 && iM38547C != 1) {
            long j = this.f122234c;
            lfw lfwVar = this.f122233b;
            if (iM38547C == 2) {
                lfw.m58917X(lfwVar, "player_fatal_error", Long.valueOf(j));
            } else if (iM38547C == 3 || iM38547C == 4) {
                lfw.m58917X(lfwVar, "player_recoverable_error", Long.valueOf(j));
            } else {
                if (iM38547C != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!lfwVar.f64697o1) {
                    lfw.m58917X(lfwVar, "player_released", Long.valueOf(j));
                }
            }
        }
        return w2a1.f247311a;
    }
}
