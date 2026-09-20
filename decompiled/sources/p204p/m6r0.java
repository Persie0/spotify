package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.options.CommandOptions;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class m6r0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m7r0 f140570a;

    public m6r0(m7r0 m7r0Var) {
        this.f140570a = m7r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        if (r8.mo30229d(r7, r0) == r4) goto L27;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        l6r0 l6r0Var;
        Object obj2;
        if (ibkVar instanceof l6r0) {
            l6r0Var = (l6r0) ibkVar;
            int i = l6r0Var.f130469b;
            if ((i & Integer.MIN_VALUE) != 0) {
                l6r0Var.f130469b = i - Integer.MIN_VALUE;
            } else {
                l6r0Var = new l6r0(this, ibkVar);
            }
        } else {
            l6r0Var = new l6r0(this, ibkVar);
        }
        Object objM61089a = l6r0Var.f130468a;
        int i2 = l6r0Var.f130469b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = l6r0Var.f130471d;
                bga.m29073P(objM61089a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM61089a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM61089a);
        d850 d850Var = ((e6r0) obj).f56712c;
        l6r0Var.f130471d = bqz0Var;
        l6r0Var.f130469b = 1;
        m7r0 m7r0Var = this.f140570a;
        objM61089a = m7r0Var.m61089a(m7r0Var.f140820c.mo48412a(new v7p0(PauseCommand.builder().loggingParams(m7r0Var.m61092d(d850Var)).options(CommandOptions.builder().systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder("PreviewElementPlayerImpl").build()).build())), l6r0Var);
        if (objM61089a != yukVar) {
        }
        return yukVar;
        h7r0 h7r0Var = (h7r0) objM61089a;
        if (wj50.m88271j(h7r0Var, g7r0.f77335a)) {
            obj2 = b7r0.f24374a;
        } else {
            if (!(h7r0Var instanceof f7r0)) {
                throw new NoWhenBranchMatchedException();
            }
            obj2 = a7r0.f13128a;
        }
        l6r0Var.f130471d = null;
        l6r0Var.f130469b = 2;
    }
}
