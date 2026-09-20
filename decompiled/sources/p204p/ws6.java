package p204p;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ws6 {
    /* JADX INFO: renamed from: a */
    public static void m88875a(AudioAttributes.Builder builder, boolean z) {
        builder.setIsContentSpatialized(z);
    }

    /* JADX INFO: renamed from: b */
    public static void m88876b(AudioAttributes.Builder builder, int i) {
        builder.setSpatializationBehavior(i);
    }
}
