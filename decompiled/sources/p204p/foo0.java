package p204p;

import com.spotify.music.R;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class foo0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71576a = 1;

    /* JADX INFO: renamed from: b */
    public final nbm0 f71577b;

    /* JADX INFO: renamed from: c */
    public final psp f71578c;

    /* JADX INFO: renamed from: d */
    public final m500 f71579d;

    /* JADX INFO: renamed from: e */
    public final luk f71580e;

    public foo0(psp pspVar, nbm0 nbm0Var, m500 m500Var, luk lukVar) {
        this.f71578c = pspVar;
        this.f71577b = nbm0Var;
        this.f71579d = m500Var;
        this.f71580e = lukVar;
    }

    /* JADX INFO: renamed from: a */
    public final f5k m42311a(voc1 voc1Var, List list) {
        switch (this.f71576a) {
            case 0:
                return new f5k("queue_play_next_track", (wwu) huu.f95461c, (c5k) null, Integer.valueOf(R.string.context_menu_play_next), (String) null, false, (p221) null, new e5k(new v4k(1), 1, new d5k(peo0.f176815a1, new eoo0(list, voc1Var, 0)), new m5l0(29, this, list)), 244);
            default:
                return new f5k("queue_track", (wwu) xmu.f263448c, (c5k) null, Integer.valueOf(R.string.context_menu_add_to_queue), (String) null, false, (p221) null, new e5k(new v4k(1), 1, new d5k(rst0.f202428e, new eoo0(list, voc1Var, 1)), new guq0(27, this, list)), 244);
        }
    }

    public foo0(nbm0 nbm0Var, psp pspVar, m500 m500Var, luk lukVar) {
        this.f71577b = nbm0Var;
        this.f71578c = pspVar;
        this.f71579d = m500Var;
        this.f71580e = lukVar;
    }
}
