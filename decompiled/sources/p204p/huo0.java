package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class huo0 implements m8d0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f95436a;

    /* JADX INFO: renamed from: b */
    public final Object f95437b;

    /* JADX INFO: renamed from: c */
    public final Object f95438c;

    public /* synthetic */ huo0(int i, Object obj, Object obj2) {
        this.f95436a = i;
        this.f95437b = obj;
        this.f95438c = obj2;
    }

    @Override // p204p.m8d0
    /* JADX INFO: renamed from: a */
    public final boolean mo48695a(roa roaVar) {
        switch (this.f95436a) {
            case 0:
                ewk0 ewk0Var = (ewk0) ((er70) this.f95438c).get();
                String str = roaVar.f201199b;
                ewk0Var.getClass();
                return ewk0.m40146b(str);
            default:
                return roaVar.f201199b.startsWith("spotify:space_item:") && !((xma) this.f95438c).mo48695a(roaVar);
        }
    }

    @Override // p204p.m8d0
    /* JADX INFO: renamed from: b */
    public final l8d0 mo48696b() {
        switch (this.f95436a) {
            case 0:
                return (l8d0) ((er70) this.f95437b).get();
            default:
                return (l8d0) ((i4t0) this.f95437b).get();
        }
    }
}
