package p204p;

import com.spotify.playlistreaction.p128v1.ToggleReactionsPayload;

/* JADX INFO: loaded from: classes9.dex */
public final class kdu0 {

    /* JADX INFO: renamed from: a */
    public final yz80 f121740a;

    public kdu0(yz80 yz80Var) {
        this.f121740a = yz80Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m56177a(String str, boolean z, v3y0 v3y0Var) {
        vx71 vx71VarM19465o = ToggleReactionsPayload.m19465o();
        vx71VarM19465o.m86641m(z);
        Object objM94973b = yz80.m94973b(this.f121740a, str, new rz80("toggle-reactions", (gva) null, ((ToggleReactionsPayload) vx71VarM19465o.build()).toByteString(), 10), v3y0Var);
        return objM94973b == yuk.f276404a ? objM94973b : w2a1.f247311a;
    }
}
