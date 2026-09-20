package p204p;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.CompletableOnSubscribe;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class eyx0 implements CompletableOnSubscribe, TextToSpeech.OnInitListener {

    /* JADX INFO: renamed from: a */
    public final Context f64214a;

    /* JADX INFO: renamed from: b */
    public final String f64215b;

    /* JADX INFO: renamed from: c */
    public final String f64216c;

    /* JADX INFO: renamed from: d */
    public CompletableEmitter f64217d;

    /* JADX INFO: renamed from: e */
    public TextToSpeech f64218e;

    public eyx0(Context context, String str, String str2) {
        Locale locale = Locale.US;
        this.f64214a = context;
        this.f64215b = str;
        this.f64216c = str2;
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i) {
        CompletableEmitter completableEmitter = this.f64217d;
        wj50.m88279p(completableEmitter);
        if (!completableEmitter.isDisposed() && i == 0) {
            TextToSpeech textToSpeech = this.f64218e;
            wj50.m88279p(textToSpeech);
            textToSpeech.setOnUtteranceProgressListener(new dyx0(this));
            TextToSpeech textToSpeech2 = this.f64218e;
            wj50.m88279p(textToSpeech2);
            textToSpeech2.setLanguage(Locale.US);
            TextToSpeech textToSpeech3 = this.f64218e;
            wj50.m88279p(textToSpeech3);
            textToSpeech3.speak(this.f64215b, 0, null, this.f64216c);
        }
    }

    @Override // io.reactivex.rxjava3.core.CompletableOnSubscribe
    public final void subscribe(CompletableEmitter completableEmitter) {
        this.f64217d = completableEmitter;
        completableEmitter.setCancellable(new zg0(this, 6));
        this.f64218e = new TextToSpeech(this.f64214a, this);
    }
}
