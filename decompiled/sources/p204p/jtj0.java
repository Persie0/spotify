package p204p;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jtj0 {
    /* JADX INFO: renamed from: a */
    public static AudioAttributes m54295a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: b */
    public static AudioAttributes.Builder m54296b() {
        return new AudioAttributes.Builder();
    }

    /* JADX INFO: renamed from: c */
    public static AudioAttributes.Builder m54297c(AudioAttributes.Builder builder, int i) {
        return builder.setContentType(i);
    }

    /* JADX INFO: renamed from: d */
    public static AudioAttributes.Builder m54298d(AudioAttributes.Builder builder, int i) {
        return builder.setUsage(i);
    }
}
