package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ce80 implements dqe1 {

    /* JADX INFO: renamed from: a */
    public final rol0 f37026a;

    public ce80(mi80 mi80Var, rol0 rol0Var) {
        this.f37026a = rol0Var;
    }

    @Override // p204p.dqe1
    /* JADX INFO: renamed from: a */
    public final boolean mo32498a(String str) {
        if (str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks")) {
            return true;
        }
        return bm51.m29803n0(str, "spotify:user:", false) && bm51.m29796g0(str, ":collection", false);
    }

    @Override // p204p.dqe1
    /* JADX INFO: renamed from: b */
    public final void mo32499b(fhe0 fhe0Var) {
        this.f37026a.invoke(fhe0Var);
    }
}
