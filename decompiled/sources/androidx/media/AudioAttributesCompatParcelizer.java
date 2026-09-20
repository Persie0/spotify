package androidx.media;

import p204p.lfb1;
import p204p.nfb1;

/* JADX INFO: loaded from: classes3.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(lfb1 lfb1Var) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        nfb1 nfb1VarM58857h = audioAttributesCompat.f950a;
        if (lfb1Var.mo58854e(1)) {
            nfb1VarM58857h = lfb1Var.m58857h();
        }
        audioAttributesCompat.f950a = (AudioAttributesImpl) nfb1VarM58857h;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, lfb1 lfb1Var) {
        lfb1Var.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f950a;
        lfb1Var.mo58858i(1);
        lfb1Var.m58861l(audioAttributesImpl);
    }
}
