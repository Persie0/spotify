package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class pwq implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f182095a;

    /* JADX INFO: renamed from: b */
    public final rwq f182096b;

    public /* synthetic */ pwq(rwq rwqVar, int i) {
        this.f182095a = i;
        this.f182096b = rwqVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f182095a) {
            case 0:
                return new qwq(this.f182096b);
            default:
                return this.f182096b.m84114P();
        }
    }
}
