package p204p;

import com.spotify.player.model.AudioStream;

/* JADX INFO: loaded from: classes.dex */
public final class qoz {

    /* JADX INFO: renamed from: a */
    public boolean f191086a;

    /* JADX INFO: renamed from: b */
    public AudioStream f191087b;

    /* JADX INFO: renamed from: c */
    public wdd0 f191088c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qoz)) {
            return false;
        }
        qoz qozVar = (qoz) obj;
        return this.f191086a == qozVar.f191086a && this.f191087b == qozVar.f191087b && this.f191088c == qozVar.f191088c;
    }

    public final int hashCode() {
        return this.f191088c.hashCode() + ((this.f191087b.hashCode() + (Boolean.hashCode(this.f191086a) * 31)) * 31);
    }
}
