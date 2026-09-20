package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class na20 extends euw0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f151912b;

    /* JADX INFO: renamed from: c */
    public final Object f151913c;

    /* JADX INFO: renamed from: d */
    public final Object f151914d;

    public /* synthetic */ na20(int i, Object obj, Object obj2) {
        this.f151912b = i;
        this.f151913c = obj;
        this.f151914d = obj2;
    }

    @Override // p204p.euw0
    /* JADX INFO: renamed from: a */
    public final long mo33952a() {
        switch (this.f151912b) {
            case 0:
                return ((npa) this.f151914d).f156904b;
            case 1:
                return ((iva) this.f151914d).mo51747d();
            default:
                return ((euw0) this.f151913c).mo33952a();
        }
    }

    @Override // p204p.euw0
    /* JADX INFO: renamed from: b */
    public final ayd0 mo33953b() {
        switch (this.f151912b) {
            case 0:
                return ((oa20) this.f151913c).f163181b.mo33953b();
            case 1:
                return (ayd0) this.f151913c;
            default:
                return (ayd0) this.f151914d;
        }
    }

    @Override // p204p.euw0
    /* JADX INFO: renamed from: d */
    public final void mo33954d(fqa fqaVar) {
        switch (this.f151912b) {
            case 0:
                fqaVar.mo42409q1(((npa) this.f151914d).m65294B());
                break;
            case 1:
                fqaVar.mo42409q1((iva) this.f151914d);
                break;
            default:
                ((euw0) this.f151913c).mo33954d(fqaVar);
                break;
        }
    }
}
