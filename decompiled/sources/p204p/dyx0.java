package p204p;

import android.speech.tts.UtteranceProgressListener;
import io.reactivex.rxjava3.core.CompletableEmitter;

/* JADX INFO: loaded from: classes10.dex */
public final class dyx0 extends UtteranceProgressListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eyx0 f54459a;

    public dyx0(eyx0 eyx0Var) {
        this.f54459a = eyx0Var;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        eyx0 eyx0Var = this.f54459a;
        if (wj50.m88271j(eyx0Var.f64216c, str)) {
            CompletableEmitter completableEmitter = eyx0Var.f64217d;
            wj50.m88279p(completableEmitter);
            completableEmitter.onComplete();
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
        eyx0 eyx0Var = this.f54459a;
        if (wj50.m88271j(eyx0Var.f64216c, str)) {
            CompletableEmitter completableEmitter = eyx0Var.f64217d;
            wj50.m88279p(completableEmitter);
            completableEmitter.onError(new Throwable("TTS failed."));
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
    }
}
