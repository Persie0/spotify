package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class q6r0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m7r0 f185908a;

    public q6r0(m7r0 m7r0Var) {
        this.f185908a = m7r0Var;
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
        p6r0 p6r0Var;
        Object obj2;
        if (ibkVar instanceof p6r0) {
            p6r0Var = (p6r0) ibkVar;
            int i = p6r0Var.f174456b;
            if ((i & Integer.MIN_VALUE) != 0) {
                p6r0Var.f174456b = i - Integer.MIN_VALUE;
            } else {
                p6r0Var = new p6r0(this, ibkVar);
            }
        } else {
            p6r0Var = new p6r0(this, ibkVar);
        }
        Object objM61089a = p6r0Var.f174455a;
        int i2 = p6r0Var.f174456b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = p6r0Var.f174458d;
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
        d850 d850Var = ((g6r0) obj).f77100c;
        p6r0Var.f174458d = bqz0Var;
        p6r0Var.f174456b = 1;
        m7r0 m7r0Var = this.f185908a;
        objM61089a = m7r0Var.m61089a(m7r0Var.f140820c.mo48412a(new y7p0(ResumeCommand.builder().loggingParams(m7r0Var.m61092d(d850Var)).options(CommandOptions.builder().systemInitiated(false).build()).resumeOrigin(PauseResumeOrigin.builder("PreviewElementPlayerImpl").build()).build())), p6r0Var);
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
        p6r0Var.f174458d = null;
        p6r0Var.f174456b = 2;
    }
}
