package p204p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;

/* JADX INFO: loaded from: classes3.dex */
public final class ws2 {

    /* JADX INFO: renamed from: a */
    public final wt80 f254485a;

    public ws2(wt80 wt80Var) {
        this.f254485a = wt80Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final Object m88873a(String str, ibk ibkVar) {
        vs2 vs2Var;
        ybv ybvVar;
        if (ibkVar instanceof vs2) {
            vs2Var = (vs2) ibkVar;
            int i = vs2Var.f244320c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vs2Var.f244320c = i - Integer.MIN_VALUE;
            } else {
                vs2Var = new vs2(this, ibkVar);
            }
        } else {
            vs2Var = new vs2(this, ibkVar);
        }
        Object objM62841f = vs2Var.f244318a;
        int i2 = vs2Var.f244320c;
        if (i2 == 0) {
            bga.m29073P(objM62841f);
            top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
            bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
            bjp0VarM18365h0.m29528r();
            top0VarM18421v.m81216x(bjp0VarM18365h0);
            st80 st80Var = new st80((PlaylistRequestDecorationPolicy) top0VarM18421v.build(), null, null, false, null, c5u0.f34291a, null, 0, null, 478);
            vs2Var.f244320c = 1;
            objM62841f = ((mu80) this.f254485a).m62841f(str, st80Var, vs2Var);
            yuk yukVar = yuk.f276404a;
            if (objM62841f == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM62841f);
        }
        qu80 qu80Var = (qu80) ((p2x0) objM62841f).m68970c();
        String str2 = (qu80Var == null || (ybvVar = qu80Var.f192599e) == null) ? null : ybvVar.f271249A;
        return Boolean.valueOf(!(str2 == null || wl51.m88460J0(str2)));
    }
}
