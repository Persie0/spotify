package p204p;

import com.spotify.mobius.MobiusLoop;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class onh0 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pnh0 f167262a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ doh0 f167263b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ htp0 f167264c;

    public onh0(pnh0 pnh0Var, doh0 doh0Var, hc80 hc80Var, htp0 htp0Var) {
        this.f167262a = pnh0Var;
        this.f167263b = doh0Var;
        this.f167264c = htp0Var;
    }

    @Override // p204p.onp
    public final void onStart(hc80 hc80Var) {
        pnh0 pnh0Var = this.f167262a;
        rg61 rg61Var = pnh0Var.f179384a;
        MobiusLoop.Builder builder = this.f167263b.f51046a;
        htp0 htp0Var = this.f167264c;
        int i = htp0Var.f95109a;
        long j = htp0Var.f95110b;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ig61 ig61Var = new ig61(j);
        pnh0Var.f179385b = builder.mo15595g(new f690(rg61Var, false, false, gbu.f78413a, new LinkedHashSet(), i, ig61Var));
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        pnh0 pnh0Var = this.f167262a;
        MobiusLoop mobiusLoop = pnh0Var.f179385b;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        }
        pnh0Var.f179385b = null;
    }
}
