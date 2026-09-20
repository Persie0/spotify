package p204p;

import com.spotify.playlistreaction.p128v1.ReactionPayload;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class vkr {

    /* JADX INFO: renamed from: a */
    public final yz80 f242278a;

    public /* synthetic */ vkr(yz80 yz80Var) {
        this.f242278a = yz80Var;
    }

    /* JADX INFO: renamed from: a */
    public Object m85916a(String str, String str2, String str3, mb61 mb61Var) {
        mdu0 mdu0VarM19458o = ReactionPayload.m19458o();
        mdu0VarM19458o.m61528m(str3);
        Object objM63325v = ((n090) this.f242278a).m63325v(str, str2, "set-reaction", ((ReactionPayload) mdu0VarM19458o.build()).toByteString(), mb61Var);
        return objM63325v == yuk.f276404a ? objM63325v : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m85917b(String str, ibk ibkVar) {
        ukr ukrVar;
        Object c6x0Var;
        boolean zBooleanValue;
        Boolean bool;
        if (ibkVar instanceof ukr) {
            ukrVar = (ukr) ibkVar;
            int i = ukrVar.f231353c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ukrVar.f231353c = i - Integer.MIN_VALUE;
            } else {
                ukrVar = new ukr(this, ibkVar);
            }
        } else {
            ukrVar = new ukr(this, ibkVar);
        }
        Object objM94973b = ukrVar.f231351a;
        int i2 = ukrVar.f231353c;
        boolean z = false;
        try {
            if (i2 == 0) {
                bga.m29073P(objM94973b);
                cva cvaVarM45888f = gva.m45888f("{\"cadence\":\"NEVER\"}");
                yz80 yz80Var = this.f242278a;
                rz80 rz80Var = new rz80("UPDATE_CADENCE", (gva) (z ? 1 : 0), (gva) cvaVarM45888f, 2);
                ukrVar.f231353c = 1;
                objM94973b = yz80.m94973b(yz80Var, str, rz80Var, ukrVar);
                yuk yukVar = yuk.f276404a;
                if (objM94973b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM94973b);
            }
            c6x0Var = (p2x0) objM94973b;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        p2x0 p2x0Var = (p2x0) (c6x0Var instanceof c6x0 ? null : c6x0Var);
        if (p2x0Var != null) {
            if (p2x0Var instanceof k2x0) {
                bool = Boolean.FALSE;
            } else {
                if (!(p2x0Var instanceof m2x0)) {
                    throw new NoWhenBranchMatchedException();
                }
                bool = Boolean.TRUE;
            }
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX INFO: renamed from: c */
    public Object m85918c(String str, String str2, String str3, ibk ibkVar) {
        mdu0 mdu0VarM19458o = ReactionPayload.m19458o();
        mdu0VarM19458o.m61528m(str3);
        Object objM63325v = ((n090) this.f242278a).m63325v(str, str2, "remove-reaction", ((ReactionPayload) mdu0VarM19458o.build()).toByteString(), ibkVar);
        return objM63325v == yuk.f276404a ? objM63325v : w2a1.f247311a;
    }
}
