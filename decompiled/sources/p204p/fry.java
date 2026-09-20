package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fry extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f72679a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i2v f72680b;

    /* JADX INFO: renamed from: c */
    public int f72681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fry(i2v i2vVar, ibk ibkVar) {
        super(ibkVar);
        this.f72680b = i2vVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f72679a = obj;
        this.f72681c |= Integer.MIN_VALUE;
        return this.f72680b.m49522r(this);
    }
}
