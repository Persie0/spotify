package p204p;

import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.core.Completable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes8.dex */
public final class v8x0 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final hrw f238745a;

    public v8x0(hrw hrwVar) {
        this.f238745a = hrwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.gh00
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(fbk fbkVar) {
        u8x0 u8x0Var;
        if (fbkVar instanceof u8x0) {
            u8x0Var = (u8x0) fbkVar;
            int i = u8x0Var.f228029c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u8x0Var.f228029c = i - Integer.MIN_VALUE;
            } else {
                u8x0Var = new u8x0(this, fbkVar);
            }
        } else {
            u8x0Var = new u8x0(this, fbkVar);
        }
        Object obj = u8x0Var.f228027a;
        int i2 = u8x0Var.f228029c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                Completable completableIgnoreElement = this.f238745a.mo48412a(new y7p0(ResumeCommand.builder().options(CommandOptions.builder().systemInitiated(true).build()).build())).ignoreElement();
                u8x0Var.f228029c = 1;
                Object objM96565n = zn91.m96565n(completableIgnoreElement, u8x0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96565n == yukVar) {
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
            na6.m63972t("Failed to resume context player after TTS", e2);
        }
        return w2a1.f247311a;
    }
}
