package p204p;

import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class acw {

    /* JADX INFO: renamed from: a */
    public final fnw f14469a;

    public acw(fnw fnwVar) {
        this.f14469a = fnwVar;
    }

    /* JADX INFO: renamed from: a */
    public final Single m25485a() {
        return this.f14469a.m42235b("audio.equalizer_v2").map(gk40.f80706S0);
    }

    /* JADX INFO: renamed from: b */
    public final Single m25486b() {
        int[] iArrM38551G = edb.m38551G(6);
        ArrayList arrayList = new ArrayList(iArrM38551G.length);
        for (int i : iArrM38551G) {
            arrayList.add(this.f14469a.m42235b(ei6.m39067d(i)).map(new0.f153139b1));
        }
        return Single.zip(arrayList, new m57(this, 10));
    }
}
