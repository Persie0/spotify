package androidx.media3.common.audio;

import p204p.q27;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioProcessor$UnhandledAudioFormatException extends Exception {

    /* JADX INFO: renamed from: a */
    public final q27 f968a;

    public AudioProcessor$UnhandledAudioFormatException(q27 q27Var) {
        this("Unhandled input format:", q27Var);
    }

    public AudioProcessor$UnhandledAudioFormatException(String str, q27 q27Var) {
        super(str + " " + q27Var);
        this.f968a = q27Var;
    }
}
