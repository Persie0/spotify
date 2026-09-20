package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class j5h1 implements c4h1 {

    /* JADX INFO: renamed from: a */
    public final gr70 f108968a;

    /* JADX INFO: renamed from: b */
    public final z3h1 f108969b;

    public j5h1(Context context, z3h1 z3h1Var) {
        this.f108969b = z3h1Var;
        nva nvaVar = nva.f158847e;
        id91.m50309b(context);
        gd91 gd91VarM50310c = id91.m50308a().m50310c(nvaVar);
        if (nva.f158846d.contains(new keu("json"))) {
            new gr70(new xog1(gd91VarM50310c, 2));
        }
        this.f108968a = new gr70(new xog1(gd91VarM50310c, 3));
    }

    @Override // p204p.c4h1
    /* JADX INFO: renamed from: a */
    public final void mo31443a(ob31 ob31Var) {
        this.f108969b.getClass();
        ((hd91) this.f108968a.get()).m47180b(ob31Var.f163528a != 0 ? s08.m76856a(ob31Var.m66613m()) : new s08(null, ob31Var.m66613m(), ler0.f132670b));
    }
}
