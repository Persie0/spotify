package p204p;

import com.spotify.carapplibrary.api.CommandFailedException;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes5.dex */
public final class att {

    /* JADX INFO: renamed from: a */
    public final xzx f19744a;

    public att(xzx xzxVar) {
        this.f19744a = xzxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m27154a(zbf zbfVar, ibk ibkVar) {
        zst zstVar;
        if (ibkVar instanceof zst) {
            zstVar = (zst) ibkVar;
            int i = zstVar.f285999c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zstVar.f285999c = i - Integer.MIN_VALUE;
            } else {
                zstVar = new zst(this, ibkVar);
            }
        } else {
            zstVar = new zst(this, ibkVar);
        }
        Object objM96567o = zstVar.f285997a;
        int i2 = zstVar.f285999c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            LoggingParams.Builder builderInteractionId = LoggingParams.builder().interactionId(zbfVar.mo77730b().f46380a.f279709a);
            kbm0 kbm0Var = zbfVar.mo77730b().f46381b;
            Single singleM31195d = ((c0y) this.f19744a).m31195d(xul0.m92201d(builderInteractionId.pageInstanceId(kbm0Var != null ? kbm0Var.f121231a : null).build()));
            zstVar.f285999c = 1;
            objM96567o = zn91.m96567o(singleM31195d, zstVar);
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
