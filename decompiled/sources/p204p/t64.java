package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes2.dex */
public enum t64 implements uzv {
    METADATA("metadata"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBTITLE(ContextTrack.Metadata.KEY_SUBTITLE);


    /* JADX INFO: renamed from: a */
    public final String f217443a;

    t64(String str) {
        this.f217443a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f217443a;
    }
}
