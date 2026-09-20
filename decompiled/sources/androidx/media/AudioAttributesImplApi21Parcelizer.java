package androidx.media;

import android.media.AudioAttributes;
import p204p.lfb1;

/* JADX INFO: loaded from: classes3.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(lfb1 lfb1Var) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f951a = (AudioAttributes) lfb1Var.m58856g(1, audioAttributesImplApi21.f951a);
        audioAttributesImplApi21.f952b = lfb1Var.m58855f(audioAttributesImplApi21.f952b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, lfb1 lfb1Var) {
        lfb1Var.getClass();
        lfb1Var.m58860k(1, audioAttributesImplApi21.f951a);
        lfb1Var.m58859j(audioAttributesImplApi21.f952b, 2);
    }
}
