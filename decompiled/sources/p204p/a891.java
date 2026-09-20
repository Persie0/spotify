package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class a891 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13229a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i8z f13230b;

    /* JADX INFO: renamed from: c */
    public int f13231c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a891(i8z i8zVar, ibk ibkVar) {
        super(ibkVar);
        this.f13230b = i8zVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13229a = obj;
        this.f13231c |= Integer.MIN_VALUE;
        return this.f13230b.m49965b(0, null, this);
    }
}
