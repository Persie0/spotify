package p204p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class t610 {

    /* JADX INFO: renamed from: b */
    public static final st80 f217415b;

    /* JADX INFO: renamed from: a */
    public final wt80 f217416a;

    static {
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
        bjp0VarM18365h0.m29507S();
        top0VarM18421v.m81216x(bjp0VarM18365h0);
        f217415b = new st80((PlaylistRequestDecorationPolicy) top0VarM18421v.build(), null, null, false, new qt80(Collections.singleton(in80.f103921b)), c5u0.f34291a, null, 0, null, 462);
    }

    public t610(wt80 wt80Var) {
        this.f217416a = wt80Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m80150a(lbw0 lbw0Var, ibk ibkVar) {
        s610 s610Var;
        df41 df41Var;
        boolean zBooleanValue;
        Boolean boolValueOf;
        if (ibkVar instanceof s610) {
            s610Var = (s610) ibkVar;
            int i = s610Var.f205976c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s610Var.f205976c = i - Integer.MIN_VALUE;
            } else {
                s610Var = new s610(this, ibkVar);
            }
        } else {
            s610Var = new s610(this, ibkVar);
        }
        Object objM62841f = s610Var.f205974a;
        int i2 = s610Var.f205976c;
        if (i2 == 0) {
            bga.m29073P(objM62841f);
            try {
                df41Var = new gf41(lbw0Var.f131742a).f79270c;
            } catch (Exception unused) {
                df41Var = df41.UNKNOWN;
            }
            wj50.m88279p(df41Var);
            if (df41Var == df41.PLAYLIST_V2) {
                String str = lbw0Var.f131742a;
                s610Var.f205976c = 1;
                objM62841f = ((mu80) this.f217416a).m62841f(str, f217415b, s610Var);
                yuk yukVar = yuk.f276404a;
                if (objM62841f == yukVar) {
                    return yukVar;
                }
            } else {
                zBooleanValue = false;
            }
            return new acw0(zBooleanValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objM62841f);
        p2x0 p2x0Var = (p2x0) objM62841f;
        p2x0Var.getClass();
        if (p2x0Var instanceof k2x0) {
            boolValueOf = Boolean.FALSE;
        } else {
            if (!(p2x0Var instanceof m2x0)) {
                throw new NoWhenBranchMatchedException();
            }
            boolValueOf = Boolean.valueOf(g0b1.m43270l((qu80) ((m2x0) p2x0Var).f139474a, in80.f103921b));
        }
        zBooleanValue = boolValueOf.booleanValue();
        return new acw0(zBooleanValue);
    }
}
