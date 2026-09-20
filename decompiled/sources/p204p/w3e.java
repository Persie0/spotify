package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w3e extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f247569a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z3e f247570b;

    /* JADX INFO: renamed from: c */
    public int f247571c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3e(z3e z3eVar, ibk ibkVar) {
        super(ibkVar);
        this.f247570b = z3eVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f247569a = obj;
        this.f247571c |= Integer.MIN_VALUE;
        return this.f247570b.m95273e(this);
    }
}
