package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes2.dex */
public enum u64 implements uzv {
    /* JADX INFO: Fake field, exist only in values array */
    TITLE(ContextTrack.Metadata.KEY_TITLE),
    /* JADX INFO: Fake field, exist only in values array */
    METADATA_AND_TITLE("metadata_and_title"),
    DEFAULT("default");


    /* JADX INFO: renamed from: a */
    public final String f227216a;

    u64(String str) {
        this.f227216a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f227216a;
    }
}
