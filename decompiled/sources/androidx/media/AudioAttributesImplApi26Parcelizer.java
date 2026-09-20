package androidx.media;

import android.media.AudioAttributes;
import p204p.lfb1;

/* JADX INFO: loaded from: classes3.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(lfb1 lfb1Var) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f951a = (AudioAttributes) lfb1Var.m58856g(1, audioAttributesImplApi26.f951a);
        audioAttributesImplApi26.f952b = lfb1Var.m58855f(audioAttributesImplApi26.f952b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, lfb1 lfb1Var) {
        lfb1Var.getClass();
        lfb1Var.m58860k(1, audioAttributesImplApi26.f951a);
        lfb1Var.m58859j(audioAttributesImplApi26.f952b, 2);
    }
}
