package p204p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: classes2.dex */
public final class xfx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yfx f261112a;

    public xfx(yfx yfxVar) {
        this.f261112a = yfxVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m90513a(String str, jda1 jda1Var) {
        yfx yfxVar = this.f261112a;
        MobiusLoop mobiusLoop = yfxVar.f272367d;
        if (mobiusLoop != null) {
            yfxVar.m93569a(mobiusLoop, new o9x0(str, jda1Var));
        } else {
            wj50.m88260d0("loop");
            throw null;
        }
    }
}
