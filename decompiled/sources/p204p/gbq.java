package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gbq extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f78369a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f78370b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ za7 f78371c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gbq(int i, za7 za7Var, gh00 gh00Var) {
        super(1);
        this.f78369a = i;
        this.f78370b = gh00Var;
        this.f78371c = za7Var;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f78369a) {
            case 0:
                this.f78370b.invoke(new nr61((tr61) ((qr61) this.f78371c.f280995d).f191747a.get(((vk61) obj).f242154b)));
                break;
            case 1:
                this.f78370b.invoke(new or61((tr61) ((qr61) this.f78371c.f280995d).f191747a.get(((vk61) obj).f242154b)));
                break;
            default:
                this.f78370b.invoke(new mr61((tr61) ((qr61) this.f78371c.f280995d).f191747a.get(((vk61) obj).f242154b)));
                break;
        }
        return w2a1.f247311a;
    }
}
