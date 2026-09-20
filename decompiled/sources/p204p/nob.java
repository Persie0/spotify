package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class nob implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f156647a;

    /* JADX INFO: renamed from: b */
    public final qwx0 f156648b;

    public /* synthetic */ nob(qwx0 qwx0Var, int i) {
        this.f156647a = i;
        this.f156648b = qwx0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f156647a) {
            case 0:
                return ((rwx0) this.f156648b).f203428a.map(oet.f164528M0).distinctUntilChanged();
            case 1:
                return ((rwx0) this.f156648b).f203428a.map(isy.f105357g).distinctUntilChanged();
            case 2:
                return k0e1.m54985d(((rwx0) this.f156648b).f203428a.map(r4z.f195903g).distinctUntilChanged());
            case 3:
                return mvl0.m62953p(xtm0.m92103x(k0e1.m54985d(((rwx0) this.f156648b).f203428a), new nx70(2, 25, null)));
            default:
                return ((rwx0) this.f156648b).f203428a.map(m1y.f139153b1).distinctUntilChanged();
        }
    }
}
