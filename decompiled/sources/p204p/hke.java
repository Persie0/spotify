package p204p;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class hke implements i4t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f92425a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f92426b;

    public /* synthetic */ hke(Object obj, int i) {
        this.f92425a = i;
        this.f92426b = obj;
    }

    @Override // p204p.i4t0
    public final Object get() {
        switch (this.f92425a) {
            case 0:
                return (String) ((xul0) ((i4t0) this.f92426b).get()).mo49283h();
            case 1:
                return ((rpi0) this.f92426b).get();
            case 2:
                return ((lji) this.f92426b).mo56602e();
            case 3:
                return ((nj7) this.f92426b).mo61933d();
            case 4:
                return (m9p0) ((v050) this.f92426b).m84368a();
            default:
                return (SharedPreferences) this.f92426b;
        }
    }
}
