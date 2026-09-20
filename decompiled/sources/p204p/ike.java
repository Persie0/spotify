package p204p;

import com.spotify.music.SpotifyMainActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class ike implements i4t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f103100a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f103101b;

    public /* synthetic */ ike(Object obj, int i) {
        this.f103100a = i;
        this.f103101b = obj;
    }

    @Override // p204p.i4t0
    public final Object get() {
        switch (this.f103100a) {
            case 0:
                return (String) ((xul0) ((i4t0) this.f103101b).get()).mo49283h();
            case 1:
                return Boolean.valueOf(!((SpotifyMainActivity) ((p700) this.f103101b)).mo15683g0().m31611T());
            case 2:
                return (dut) ((er70) ((d670) this.f103101b).f45619d).get();
            case 3:
                return ((lji) this.f103101b).mo56605i();
            case 4:
                return ((nfx) ((yzd0) this.f103101b).f277768e).f153434a;
            default:
                return ((nfx) ((cji0) this.f103101b).f38594d).f153434a;
        }
    }
}
