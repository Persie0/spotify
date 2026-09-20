package p204p;

import com.spotify.nowplayingqueue.bottomsheet.view.EditModeBarContainerView;
import com.spotify.nowplayingqueue.bottomsheet.view.SessionModifierContainerView;

/* JADX INFO: loaded from: classes9.dex */
public final class nst0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f157892a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pst0 f157893b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nst0(pst0 pst0Var, int i) {
        super(0);
        this.f157892a = i;
        this.f157893b = pst0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f157892a;
        w2a1 w2a1Var = w2a1.f247311a;
        pst0 pst0Var = this.f157893b;
        switch (i) {
            case 0:
                pst0Var.f180950b.invoke();
                return w2a1Var;
            case 1:
                ((SessionModifierContainerView) pst0Var.f180944Y.f62827f).getOnAnimationEnd().invoke();
                return w2a1Var;
            case 2:
                ((EditModeBarContainerView) pst0Var.f180944Y.f62824c).getOnAnimationEnd().invoke();
                return w2a1Var;
            case 3:
                ((EditModeBarContainerView) pst0Var.f180944Y.f62824c).getOnAnimationEnd().invoke();
                return w2a1Var;
            case 4:
                ((SessionModifierContainerView) pst0Var.f180944Y.f62827f).getOnAnimationEnd().invoke();
                return w2a1Var;
            case 5:
                pst0Var.f180950b.invoke();
                return w2a1Var;
            case 6:
                h8h0 h8h0Var = pst0Var.f180942X;
                h8h0Var.getClass();
                yt91 yt91VarM96903c = h8h0Var.f88710a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("session_modifiers", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                st91 st91Var = st91.f213865b;
                return new st91(fr0.m42467k(zt91VarM94607a));
            case 7:
                h8h0 h8h0Var2 = pst0Var.f180942X;
                h8h0Var2.getClass();
                yt91 yt91VarM96903c2 = h8h0Var2.f88710a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("session_modifiers", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
                st91 st91Var2 = st91.f213865b;
                return new st91(fr0.m42467k(zt91VarM94607a2));
            default:
                h8h0 h8h0Var3 = pst0Var.f180942X;
                h8h0Var3.getClass();
                yt91 yt91VarM96903c3 = h8h0Var3.f88710a.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("top_bar", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                zt91 zt91VarM94607a3 = yt91VarM96903c3.m94607a();
                st91 st91Var3 = st91.f213865b;
                return new st91(fr0.m42467k(zt91VarM94607a3));
        }
    }
}
