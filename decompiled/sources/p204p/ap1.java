package p204p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class ap1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fp1 f17801a;

    public ap1(fp1 fp1Var) {
        this.f17801a = fp1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        if (r12.mo30229d(r13, r0) == r5) goto L27;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        zo1 zo1Var;
        if (ibkVar instanceof zo1) {
            zo1Var = (zo1) ibkVar;
            int i = zo1Var.f284617b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zo1Var.f284617b = i - Integer.MIN_VALUE;
            } else {
                zo1Var = new zo1(this, ibkVar);
            }
        } else {
            zo1Var = new zo1(this, ibkVar);
        }
        Object objM48221p = zo1Var.f284616a;
        int i2 = zo1Var.f284617b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = zo1Var.f284619d;
                bga.m29073P(objM48221p);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM48221p);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM48221p);
        ltx0 ltx0Var = this.f17801a.f71670k;
        zo1Var.f284619d = bqz0Var;
        zo1Var.f284617b = 1;
        hqb hqbVar = new hqb(1, seg1.m77914f(zo1Var));
        hqbVar.m48222q();
        qt1 qt1Var = (qt1) ltx0Var.f136903b;
        mm1 mm1Var = (mm1) ltx0Var.f136904c;
        is31 is31VarM57187a = mm1Var.f145020d.m57187a(mm1Var.f145003O0);
        dmz dmzVar = new dmz(hqbVar, 3);
        g940 g940Var = new g940(hqbVar, 6);
        ot1 ot1Var = (ot1) qt1Var.f192253b.mo25006a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("selected_sort_order", is31VarM57187a);
        ot1Var.m49706b1(bundle);
        C1966i4 c1966i4 = new C1966i4(25, new lc1(g940Var, 10), ot1Var);
        kt1 kt1Var = ot1Var.f168944Z1;
        if (kt1Var != null) {
            if (kt1Var == null) {
                wj50.m88260d0("addToPlaylistSortAdapter");
                throw null;
            }
            kt1Var.f126114h = c1966i4;
        }
        ot1Var.f168946b2 = c1966i4;
        ot1Var.f168945a2 = dmzVar;
        ot1Var.mo63162p1(qt1Var.f192252a, "add-to-playlist-sort-popup-bottom-sheet");
        objM48221p = hqbVar.m48221p();
        if (objM48221p != yukVar) {
        }
        return yukVar;
        zo1Var.f284619d = null;
        zo1Var.f284617b = 2;
    }
}
