package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cug extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42111a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f42112b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f42113c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f42114d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cug(int i, int i2, int i3, gh00 gh00Var) {
        super(0);
        this.f42111a = i3;
        this.f42112b = gh00Var;
        this.f42113c = i;
        this.f42114d = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f42111a) {
            case 0:
                this.f42112b.invoke(new tgf0(this.f42113c, this.f42114d));
                return w2a1.f247311a;
            case 1:
                this.f42112b.invoke(new hoa0(new s40(this.f42113c, this.f42114d)));
                return w2a1.f247311a;
            case 2:
                this.f42112b.invoke(new fa61(this.f42113c, this.f42114d));
                return w2a1.f247311a;
            case 3:
                this.f42112b.invoke(Integer.valueOf(this.f42113c + this.f42114d));
                return Boolean.TRUE;
            default:
                this.f42112b.invoke(Integer.valueOf(this.f42113c - this.f42114d));
                return Boolean.TRUE;
        }
    }
}
