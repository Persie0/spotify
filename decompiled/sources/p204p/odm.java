package p204p;

import android.location.Location;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class odm implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f164218a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f164219b;

    public /* synthetic */ odm(Object obj, int i) {
        this.f164218a = i;
        this.f164219b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f164218a) {
            case 0:
                ((ajo) this.f164219b).m26168a((rio) obj);
                return;
            case 1:
                Location location = (Location) obj;
                hqb hqbVar = (hqb) this.f164219b;
                if (hqbVar.isActive()) {
                    hqbVar.resumeWith(location != null ? new g7r(location.getLatitude(), location.getLongitude(), location.getAccuracy(), location.getTime()) : null);
                    return;
                }
                return;
            default:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((vh5) this.f164219b).toString();
                throw null;
        }
    }

    public odm(hqb hqbVar, cha0 cha0Var) {
        this.f164218a = 1;
        this.f164219b = hqbVar;
    }
}
