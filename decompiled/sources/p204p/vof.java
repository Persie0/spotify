package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vof implements qh00 {

    /* JADX INFO: renamed from: b */
    public static final vof f243470b = new vof(0);

    /* JADX INFO: renamed from: c */
    public static final vof f243471c = new vof(1);

    /* JADX INFO: renamed from: d */
    public static final vof f243472d = new vof(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f243473a;

    public /* synthetic */ vof(int i) {
        this.f243473a = i;
    }

    @Override // p204p.qh00
    public final Object apply(Object obj) {
        switch (this.f243473a) {
            case 0:
                return ((ContextTrack) obj).uri();
            case 1:
                return ((ContextTrack) obj).uri();
            default:
                return ((q040) obj).f183902b.f243453a;
        }
    }
}
