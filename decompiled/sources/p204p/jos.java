package p204p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: classes6.dex */
public final class jos implements er70 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f114504a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f114505b;

    public /* synthetic */ jos(Object obj, int i) {
        this.f114504a = i;
        this.f114505b = obj;
    }

    @Override // p204p.er70
    public final Object get() {
        switch (this.f114504a) {
            case 0:
                return ((scn) this.f114505b).m77807a();
            case 1:
                return (PlayOrigin) this.f114505b;
            case 2:
                return (x6a0) this.f114505b;
            default:
                return ((m9p0) this.f114505b).m61227a();
        }
    }
}
