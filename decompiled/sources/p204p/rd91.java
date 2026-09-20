package p204p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final class rd91 extends xms {

    /* JADX INFO: renamed from: l */
    public final i5z f198068l;

    public rd91(String str, eh00 eh00Var, i5z i5zVar) {
        super(0, str, "spotify-transsion-card-widget", eh00Var, 24);
        this.f198068l = i5zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.xms, p204p.ge10
    /* JADX INFO: renamed from: d */
    public final void mo44448d(Context context, ie5 ie5Var, fbk fbkVar) {
        pd91 pd91Var;
        boolean zBooleanValue;
        if (fbkVar instanceof pd91) {
            pd91Var = (pd91) fbkVar;
            int i = pd91Var.f176393d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pd91Var.f176393d = i - Integer.MIN_VALUE;
            } else {
                pd91Var = new pd91(this, (ibk) fbkVar);
            }
        } else {
            pd91Var = new pd91(this, (ibk) fbkVar);
        }
        Object objM89557A = pd91Var.f176391b;
        int i2 = pd91Var.f176393d;
        fbk fbkVar2 = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM89557A);
                i5z i5zVar = this.f198068l;
                pd91Var.f176390a = ie5Var;
                pd91Var.f176393d = 1;
                ((le10) i5zVar.f99059b).f132425b.getClass();
                if (!(ie5Var instanceof ie5)) {
                    throw new IllegalArgumentException("This method only accepts App Widget Glance Id");
                }
                objM89557A = x0h1.m89557A((luk) i5zVar.f99060c, new q950(ie5Var.f101318a, 2, i5zVar, fbkVar2), pd91Var);
                if (objM89557A == yuk.f276404a) {
                    return;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        throw edb.m38575x(objM89557A);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ie5Var = pd91Var.f176390a;
                bga.m29073P(objM89557A);
            }
            zBooleanValue = ((Boolean) objM89557A).booleanValue();
        } catch (IllegalArgumentException e) {
            Logger.m3966b("[TranssionCardWidget] Failed to resolve appWidgetId from GlanceId=" + ie5Var, e);
            zBooleanValue = false;
        }
        fyf fyfVar = new fyf(new qd91(ie5Var, zBooleanValue, this), true, -1991067845);
        pd91Var.f176390a = null;
        pd91Var.f176393d = 2;
        tqg1.m81326n(fyfVar, pd91Var);
    }
}
