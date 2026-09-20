package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iqp implements j561 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f104818a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f104819b;

    public /* synthetic */ iqp(Object obj, int i) {
        this.f104818a = i;
        this.f104819b = obj;
    }

    @Override // p204p.j561
    public final Object get() {
        switch (this.f104818a) {
            case 0:
                try {
                    return (usd0) ((Class) this.f104819b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                return (usd0) this.f104819b;
            case 2:
                return (j0a0) this.f104819b;
            case 3:
                return (zzo) this.f104819b;
            case 4:
                return (wkw0) this.f104819b;
            default:
                return (ckc0) this.f104819b;
        }
    }
}
