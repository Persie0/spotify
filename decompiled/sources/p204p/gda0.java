package p204p;

import android.content.Intent;
import com.spotify.localfiles.localfilesmonorepo.AudioMimeIntentChecker;
import com.spotify.localfiles.localfilesmonorepo.AudioMimeMatcher;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gda0 implements www0 {

    /* JADX INFO: renamed from: a */
    public final List f78784a = h6f.m46715L(new tww0("Local Files", gn80.LOCAL_FILES_ROOT), new uww0(AudioMimeMatcher.INSTANCE));

    @Override // p204p.www0
    /* JADX INFO: renamed from: a */
    public final List mo44419a() {
        return this.f78784a;
    }

    @Override // p204p.www0
    /* JADX INFO: renamed from: b */
    public final sww0 mo44420b(Intent intent) {
        return AudioMimeIntentChecker.INSTANCE.isAudioMimeIntent(intent) ? new qww0(xoc1.f263865D2.f243453a) : rww0.f203425a;
    }
}
