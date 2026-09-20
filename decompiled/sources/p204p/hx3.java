package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hx3 extends k2q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f96124a;

    /* JADX INFO: renamed from: b */
    public final Object f96125b;

    public /* synthetic */ hx3(Object obj, int i) {
        this.f96124a = i;
        this.f96125b = obj;
    }

    @Override // p204p.k2q
    /* JADX INFO: renamed from: b */
    public final String mo27357b() {
        switch (this.f96124a) {
            case 0:
                return "automobile_connected";
            default:
                return "music_stream_is_active";
        }
    }

    @Override // p204p.k2q
    /* JADX INFO: renamed from: d */
    public final boolean mo45305d() {
        switch (this.f96124a) {
            case 0:
                api apiVarM77296c = ((s5p) ((voi) this.f96125b)).m77296c();
                return apiVarM77296c != null && apiVarM77296c.getType() == xfr.f261077Z;
            default:
                return ((pz6) ((hz6) this.f96125b)).f183611a.isMusicActive();
        }
    }
}
