package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ehj extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59601a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f59602b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f59603c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehj(int i, int i2, int i3) {
        super(1);
        this.f59601a = i;
        this.f59602b = i2;
        this.f59603c = i3;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        return new rq91((this.f59601a * this.f59602b) + this.f59603c);
    }
}
