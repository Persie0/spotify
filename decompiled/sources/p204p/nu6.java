package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class nu6 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pyu f158518a;

    public nu6(pyu pyuVar) {
        this.f158518a = pyuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r9.mo30229d(r10, r0) == r5) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        mu6 mu6Var;
        if (ibkVar instanceof mu6) {
            mu6Var = (mu6) ibkVar;
            int i = mu6Var.f147260b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mu6Var.f147260b = i - Integer.MIN_VALUE;
            } else {
                mu6Var = new mu6(this, ibkVar);
            }
        } else {
            mu6Var = new mu6(this, ibkVar);
        }
        Object objM28059a = mu6Var.f147259a;
        int i2 = mu6Var.f147260b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = mu6Var.f147262d;
                bga.m29073P(objM28059a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM28059a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM28059a);
        mu6Var.f147262d = bqz0Var;
        mu6Var.f147260b = 1;
        pyu pyuVar = this.f158518a;
        objM28059a = ((b411) pyuVar.f183523e).m28059a("sharing.audio_chapter_share_format_loading", null, new i090((xft) obj, pyuVar, fbkVar, 18), mu6Var);
        if (objM28059a != yukVar) {
        }
        return yukVar;
        mu6Var.f147262d = null;
        mu6Var.f147260b = 2;
    }
}
