package p204p;

import com.spotify.playbacknative.AudioEffectsListener;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class x57 {

    /* JADX INFO: renamed from: a */
    public final AudioEffectsListener f258321a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f258322b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final ArrayList f258323c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final w57 f258324d = new w57(this);

    public x57(AudioEffectsListener audioEffectsListener) {
        this.f258321a = audioEffectsListener;
    }
}
