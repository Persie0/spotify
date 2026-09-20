package p204p;

import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes8.dex */
public final class xqq0 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final ulp f265085a;

    /* JADX INFO: renamed from: b */
    public final hrw f265086b;

    /* JADX INFO: renamed from: c */
    public final Flowable f265087c;

    public xqq0(ulp ulpVar, hrw hrwVar, Flowable flowable) {
        this.f265085a = ulpVar;
        this.f265086b = hrwVar;
        this.f265087c = flowable;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.gh00
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(fbk fbkVar) {
        wqq0 wqq0Var;
        int i;
        int i2;
        boolean z;
        if (fbkVar instanceof wqq0) {
            wqq0Var = (wqq0) fbkVar;
            int i3 = wqq0Var.f254131d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wqq0Var.f254131d = i3 - Integer.MIN_VALUE;
            } else {
                wqq0Var = new wqq0(this, fbkVar);
            }
        } else {
            wqq0Var = new wqq0(this, fbkVar);
        }
        Object objM86755t = wqq0Var.f254129b;
        int i4 = wqq0Var.f254131d;
        yuk yukVar = yuk.f276404a;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    bga.m29073P(objM86755t);
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = wqq0Var.f254128a;
                    bga.m29073P(objM86755t);
                }
                i = i2;
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new cwc0(z, true);
            }
            bga.m29073P(objM86755t);
            Boolean bool = (Boolean) this.f265085a.f231607f.m23798h();
            if (!(bool != null ? bool.booleanValue() : true)) {
                return new cwc0(false, false);
            }
            Flowable flowable = this.f265087c;
            d0k[] d0kVarArr = bmu0.f28619a;
            onc oncVar = new onc(flowable);
            wqq0Var.f254131d = 1;
            objM86755t = vyf1.m86755t(oncVar, wqq0Var);
            if (objM86755t == yukVar) {
            }
            return yukVar;
            PlayerState playerState = (PlayerState) objM86755t;
            i = (!playerState.isPlaying() || playerState.isPaused()) ? 0 : 1;
            if (i != 0) {
                Completable completableIgnoreElement = this.f265086b.mo48412a(new v7p0(PauseCommand.builder().options(CommandOptions.builder().systemInitiated(true).overrideRestrictions(true).build()).build())).ignoreElement();
                wqq0Var.f254128a = i;
                wqq0Var.f254131d = 2;
                if (zn91.m96565n(completableIgnoreElement, wqq0Var) != yukVar) {
                    i2 = i;
                    i = i2;
                }
                return yukVar;
            }
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            return new cwc0(z, true);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            na6.m63972t("Failed to pause context player for TTS", e2);
            return new cwc0(false, false);
        }
    }
}
