package p204p;

import androidx.media3.session.legacy.PlaybackStateCompat;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes9.dex */
public abstract class kgr {

    /* JADX INFO: renamed from: a */
    public static final UUID f122439a;

    static {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        f122439a = new UUID((threadLocalRandomCurrent.nextLong() & (-61441)) | PlaybackStateCompat.ACTION_PREPARE, (threadLocalRandomCurrent.nextLong() & 4611686018427387903L) | Long.MIN_VALUE);
    }
}
