package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class aal0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13893a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fal0 f13894b;

    /* JADX INFO: renamed from: c */
    public int f13895c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aal0(fal0 fal0Var, ibk ibkVar) {
        super(ibkVar);
        this.f13894b = fal0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13893a = obj;
        this.f13895c |= Integer.MIN_VALUE;
        return this.f13894b.m41183c(this);
    }
}
