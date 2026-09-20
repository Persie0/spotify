package p204p;

import com.spotify.adsdisplay.elementimpl.htmlad.events.proto.HTMLAdNavigationEvent;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class vd30 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ie30 f240304a;

    public vd30(ie30 ie30Var) {
        this.f240304a = ie30Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        String str;
        String str2;
        String str3;
        String str4;
        ld30 ld30Var = (ld30) obj;
        eb20 eb20VarM2794z = HTMLAdNavigationEvent.m2794z();
        eb20VarM2794z.m38331s();
        eb20VarM2794z.m38328m(ld30Var.f132032a.mo29280c());
        ro0 ro0Var = ld30Var.f132032a;
        eb20VarM2794z.m38336x(ro0Var.mo29283j());
        eb20VarM2794z.m38332t(ro0Var.mo29285l());
        eb20VarM2794z.m38330r(ld30Var.f132033b);
        eb20VarM2794z.m38327A(ld30Var.f132034c);
        int i = ld30Var.f132035d;
        if (i == 1) {
            str = "allowed";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "blocked";
        }
        eb20VarM2794z.m38335w(str);
        int i2 = ld30Var.f132037f;
        if (i2 == 1) {
            str2 = "user_activated";
        } else if (i2 == 2) {
            str2 = "redirect";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str2 = "programmatic";
        }
        eb20VarM2794z.m38334v(str2);
        int i3 = ld30Var.f132038g;
        if (i3 == 1) {
            str3 = "direct";
        } else {
            if (i3 != 2) {
                throw null;
            }
            str3 = "window_open";
        }
        eb20VarM2794z.m38333u(str3);
        int i4 = ld30Var.f132036e;
        if (i4 != 0) {
            if (i4 == 1) {
                str4 = "scheme_not_allowed";
            } else if (i4 == 2) {
                str4 = "no_user_gesture";
            } else {
                if (i4 != 3) {
                    throw null;
                }
                str4 = "dedup";
            }
            eb20VarM2794z.m38329q(str4);
        }
        Float f = ld30Var.f132039h;
        if (f != null) {
            eb20VarM2794z.m38337y(f.floatValue());
        }
        Float f2 = ld30Var.f132040i;
        if (f2 != null) {
            eb20VarM2794z.m38338z(f2.floatValue());
        }
        this.f240304a.f101307c.m73616a(eb20VarM2794z.build());
        return w2a1.f247311a;
    }
}
