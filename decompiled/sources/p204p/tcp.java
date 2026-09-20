package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes6.dex */
public final class tcp {

    /* JADX INFO: renamed from: a */
    public final pri f219130a;

    public tcp(pri priVar) {
        this.f219130a = priVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m80479a(String str, String str2, ibk ibkVar) {
        rcp rcpVar;
        if (ibkVar instanceof rcp) {
            rcpVar = (rcp) ibkVar;
            int i = rcpVar.f197910c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rcpVar.f197910c = i - Integer.MIN_VALUE;
            } else {
                rcpVar = new rcp(this, ibkVar);
            }
        } else {
            rcpVar = new rcp(this, ibkVar);
        }
        Object obj = rcpVar.f197908a;
        int i2 = rcpVar.f197910c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                pri priVar = this.f219130a;
                rcpVar.f197910c = 1;
                Object objM81351b = ((tri) priVar).m81351b(str, str2, rcpVar);
                yuk yukVar = yuk.f276404a;
                if (objM81351b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3967c(e2, "Failed to group device", new Object[0]);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m80480b(String str, String str2, ibk ibkVar) {
        scp scpVar;
        if (ibkVar instanceof scp) {
            scpVar = (scp) ibkVar;
            int i = scpVar.f207783c;
            if ((i & Integer.MIN_VALUE) != 0) {
                scpVar.f207783c = i - Integer.MIN_VALUE;
            } else {
                scpVar = new scp(this, ibkVar);
            }
        } else {
            scpVar = new scp(this, ibkVar);
        }
        Object obj = scpVar.f207781a;
        int i2 = scpVar.f207783c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                pri priVar = this.f219130a;
                scpVar.f207783c = 1;
                Object objM81355f = ((tri) priVar).m81355f(str, str2, scpVar);
                yuk yukVar = yuk.f276404a;
                if (objM81355f == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3967c(e2, "Failed to ungroup device", new Object[0]);
        }
        return w2a1.f247311a;
    }
}
