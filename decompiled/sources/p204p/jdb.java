package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jdb implements dqk0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f111319a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f111320b;

    public /* synthetic */ jdb(Object obj, int i) {
        this.f111319a = i;
        this.f111320b = obj;
    }

    @Override // p204p.dqk0
    /* JADX INFO: renamed from: b */
    public final void mo31453b(Object obj) {
        switch (this.f111319a) {
            case 0:
                ((kdb) this.f111320b).mo33104m(obj);
                break;
            case 1:
                ((zwp) this.f111320b).setState((v3a0) obj);
                break;
            case 2:
                ((sir0) this.f111320b).mo30231j(obj);
                break;
            default:
                ((kqi0) this.f111320b).setValue(obj);
                break;
        }
    }
}
