package p204p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: classes11.dex */
public final class qoo0 {

    /* JADX INFO: renamed from: a */
    public final String f191023a;

    public qoo0(String str) {
        this.f191023a = str;
    }

    /* JADX INFO: renamed from: a */
    public final PlayOrigin m73402a(String str) {
        return PlayOrigin.builder("your-library").featureVersion(this.f191023a).viewUri(str).referrerIdentifier("your-library").build();
    }
}
