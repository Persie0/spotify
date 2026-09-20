package p204p;

import java.util.function.IntConsumer;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class l2m0 implements IntConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rlv0 f129042a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g15 f129043b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ StringBuilder f129044c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ rlv0 f129045d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ rlv0 f129046e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ gh00 f129047f;

    public l2m0(rlv0 rlv0Var, g15 g15Var, StringBuilder sb, rlv0 rlv0Var2, rlv0 rlv0Var3, gh00 gh00Var) {
        this.f129042a = rlv0Var;
        this.f129043b = g15Var;
        this.f129044c = sb;
        this.f129045d = rlv0Var2;
        this.f129046e = rlv0Var3;
        this.f129047f = gh00Var;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        rlv0 rlv0Var = this.f129042a;
        int iOrdinal = ((x4d0) rlv0Var.f200373a).ordinal();
        g15 g15Var = this.f129043b;
        StringBuilder sb = this.f129044c;
        if (iOrdinal == 0) {
            if (i != 91) {
                sb.append((char) i);
                return;
            }
            g15Var.m43331g(sb.toString());
            sb.setLength(0);
            rlv0Var.f200373a = x4d0.f258065b;
            return;
        }
        rlv0 rlv0Var2 = this.f129045d;
        if (iOrdinal == 1) {
            if (i == 40) {
                sb.setLength(0);
                rlv0Var.f200373a = x4d0.f258066c;
                return;
            } else if (i != 93) {
                sb.append((char) i);
                return;
            } else {
                rlv0Var2.f200373a = sb.toString();
                return;
            }
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (i != 41) {
            sb.append((char) i);
            return;
        }
        String string = sb.toString();
        this.f129046e.f200373a = string;
        vie.m85610c(g15Var, (String) rlv0Var2.f200373a, string, vie.f241686a, this.f129047f);
        sb.setLength(0);
        rlv0Var.f200373a = x4d0.f258064a;
    }
}
