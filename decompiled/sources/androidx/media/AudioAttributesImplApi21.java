package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes3.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    public AudioAttributes f951a;

    /* JADX INFO: renamed from: b */
    public int f952b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f951a.equals(((AudioAttributesImplApi21) obj).f951a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f951a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f951a;
    }
}
