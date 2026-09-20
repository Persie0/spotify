package p204p;

import com.spotify.carapplibrary.api.CommandFailedException;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes5.dex */
public final class ntt {

    /* JADX INFO: renamed from: a */
    public final xzx f158147a;

    public ntt(xzx xzxVar) {
        this.f158147a = xzxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m65638a(zbf zbfVar, ibk ibkVar) {
        mtt mttVar;
        if (ibkVar instanceof mtt) {
            mttVar = (mtt) ibkVar;
            int i = mttVar.f147156c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mttVar.f147156c = i - Integer.MIN_VALUE;
            } else {
                mttVar = new mtt(this, ibkVar);
            }
        } else {
            mttVar = new mtt(this, ibkVar);
        }
        Object objM96567o = mttVar.f147154a;
        int i2 = mttVar.f147156c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            LoggingParams.Builder builderInteractionId = LoggingParams.builder().interactionId(zbfVar.mo77730b().f46380a.f279709a);
            kbm0 kbm0Var = zbfVar.mo77730b().f46381b;
            Single singleM31199h = ((c0y) this.f158147a).m31199h(builderInteractionId.pageInstanceId(kbm0Var != null ? kbm0Var.f121231a : null).build());
            mttVar.f147156c = 1;
            objM96567o = zn91.m96567o(singleM31199h, mttVar);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        lcf lcfVar = (lcf) objM96567o;
        lcfVar.getClass();
        if (lcfVar instanceof hcf) {
            throw new CommandFailedException(((hcf) lcfVar).f89783a);
        }
        return w2a1.f247311a;
    }
}
