package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yxe extends ibk {

    /* JADX INFO: renamed from: a */
    public n8l f277238a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f277239b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aye f277240c;

    /* JADX INFO: renamed from: d */
    public int f277241d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxe(aye ayeVar, ibk ibkVar) {
        super(ibkVar);
        this.f277240c = ayeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f277239b = obj;
        this.f277241d |= Integer.MIN_VALUE;
        return this.f277240c.mo27514a(null, this);
    }
}
