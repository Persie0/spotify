package androidx.media;

import p204p.lfb1;

/* JADX INFO: loaded from: classes3.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(lfb1 lfb1Var) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f953a = lfb1Var.m58855f(audioAttributesImplBase.f953a, 1);
        audioAttributesImplBase.f954b = lfb1Var.m58855f(audioAttributesImplBase.f954b, 2);
        audioAttributesImplBase.f955c = lfb1Var.m58855f(audioAttributesImplBase.f955c, 3);
        audioAttributesImplBase.f956d = lfb1Var.m58855f(audioAttributesImplBase.f956d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, lfb1 lfb1Var) {
        lfb1Var.getClass();
        lfb1Var.m58859j(audioAttributesImplBase.f953a, 1);
        lfb1Var.m58859j(audioAttributesImplBase.f954b, 2);
        lfb1Var.m58859j(audioAttributesImplBase.f955c, 3);
        lfb1Var.m58859j(audioAttributesImplBase.f956d, 4);
    }
}
