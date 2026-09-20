package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nb7 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f152202a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d1k f152203b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nb7(d1k d1kVar, int i) {
        super(1);
        this.f152202a = i;
        this.f152203b = d1kVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f152202a) {
            case 0:
                return new f1k(((f1w0) obj).f64988a, (String) null, (String) null, this.f152203b, (eh00) null, (eh00) z67.f279740d, false, (String) null, 470);
            default:
                return new f1k(((f1w0) obj).f64988a, (String) null, (String) null, this.f152203b, (eh00) null, (eh00) iam.f100296c, false, (String) null, 470);
        }
    }
}
