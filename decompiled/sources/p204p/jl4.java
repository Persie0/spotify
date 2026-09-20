package p204p;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class jl4 implements xuk {

    /* JADX INFO: renamed from: a */
    public final View f113478a;

    /* JADX INFO: renamed from: b */
    public final ha71 f113479b;

    /* JADX INFO: renamed from: c */
    public final xuk f113480c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f113481d = rlg1.m75851r();

    public jl4(View view, ha71 ha71Var, xuk xukVar) {
        this.f113478a = view;
        this.f113479b = ha71Var;
        this.f113480c = xukVar;
    }

    @Override // p204p.xuk
    /* JADX INFO: renamed from: M */
    public final juk mo31960M() {
        return this.f113480c.mo31960M();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final void m53650a(ydo0 ydo0Var, ibk ibkVar) {
        il4 il4Var;
        if (ibkVar instanceof il4) {
            il4Var = (il4) ibkVar;
            int i = il4Var.f103282c;
            if ((i & Integer.MIN_VALUE) != 0) {
                il4Var.f103282c = i - Integer.MIN_VALUE;
            } else {
                il4Var = new il4(this, ibkVar);
            }
        } else {
            il4Var = new il4(this, ibkVar);
        }
        Object obj = il4Var.f103280a;
        int i2 = il4Var.f103282c;
        if (i2 == 0) {
            bga.m29073P(obj);
            n62 n62Var = new n62(16, ydo0Var, this);
            fa2 fa2Var = new fa2(this, null, 27);
            il4Var.f103282c = 1;
            if (rlg1.m75832B(this.f113481d, n62Var, fa2Var, il4Var) == yuk.f276404a) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        throw new KotlinNothingValueException();
    }
}
