package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class rg21 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f198803a;

    /* JADX INFO: renamed from: b */
    public bh21 f198804b;

    /* JADX INFO: renamed from: c */
    public guf f198805c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f198806d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ bh21 f198807e;

    /* JADX INFO: renamed from: f */
    public int f198808f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg21(bh21 bh21Var, ibk ibkVar) {
        super(ibkVar);
        this.f198807e = bh21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f198806d = obj;
        this.f198808f |= Integer.MIN_VALUE;
        return bh21.m29189b(this.f198807e, null, this);
    }
}
