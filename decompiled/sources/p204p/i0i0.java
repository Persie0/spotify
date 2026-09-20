package p204p;

import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class i0i0 implements tty {

    /* JADX INFO: renamed from: a */
    public final mja1 f97249a;

    /* JADX INFO: renamed from: b */
    public final int f97250b;

    /* JADX INFO: renamed from: c */
    public final int f97251c;

    /* JADX INFO: renamed from: d */
    public final o0i0 f97252d;

    /* JADX INFO: renamed from: e */
    public final a350 f97253e;

    /* JADX INFO: renamed from: f */
    public final String f97254f;

    public i0i0(mja1 mja1Var, int i, int i2, o0i0 o0i0Var, a350 a350Var, String str) {
        this.f97249a = mja1Var;
        this.f97250b = i;
        this.f97251c = i2;
        this.f97252d = o0i0Var;
        this.f97253e = a350Var;
        this.f97254f = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.tty
    /* JADX INFO: renamed from: a */
    public final Object mo25711a(fbk fbkVar) throws IOException {
        h0i0 h0i0Var;
        if (fbkVar instanceof h0i0) {
            h0i0Var = (h0i0) fbkVar;
            int i = h0i0Var.f86303c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h0i0Var.f86303c = i - Integer.MIN_VALUE;
            } else {
                h0i0Var = new h0i0(this, (ibk) fbkVar);
            }
        } else {
            h0i0Var = new h0i0(this, (ibk) fbkVar);
        }
        Object objM66018a = h0i0Var.f86301a;
        int i2 = h0i0Var.f86303c;
        mja1 mja1Var = this.f97249a;
        if (i2 == 0) {
            bga.m29073P(objM66018a);
            String str = mja1Var.f144213a;
            h0i0Var.f86303c = 1;
            objM66018a = this.f97252d.m66018a(str, this.f97250b, this.f97251c, h0i0Var);
            yuk yukVar = yuk.f276404a;
            if (objM66018a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM66018a);
        }
        v250 v250Var = (v250) objM66018a;
        if (v250Var == null) {
            throw new IllegalStateException(("Unable to create a mosaic bitmap for " + mja1Var).toString());
        }
        fsk fskVar = v250Var.f236551b;
        int iOrdinal = fskVar.ordinal();
        int i3 = 3;
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal != 2 && iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = 4;
        }
        a350 a350Var = this.f97253e;
        if (a350Var != null) {
            a350Var.m24609f(this.f97254f, fskVar, v250Var.f236552c);
        }
        return new r540(new rh9(v250Var.f236550a), true, i3);
    }
}
