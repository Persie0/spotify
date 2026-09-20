package p204p;

/* JADX INFO: loaded from: classes9.dex */
@rtz0
public final class eso {
    public static final yro Companion = new yro();

    /* JADX INFO: renamed from: a */
    public final cso f62432a;

    /* JADX INFO: renamed from: b */
    public final aso f62433b;

    public /* synthetic */ eso(int i, cso csoVar, aso asoVar) {
        if ((i & 1) == 0) {
            this.f62432a = null;
        } else {
            this.f62432a = csoVar;
        }
        if ((i & 2) == 0) {
            this.f62433b = null;
        } else {
            this.f62433b = asoVar;
        }
    }

    public eso(cso csoVar, aso asoVar) {
        this.f62432a = csoVar;
        this.f62433b = asoVar;
    }
}
