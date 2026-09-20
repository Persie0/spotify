package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w8x0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f249031a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ erw f249032b;

    /* JADX INFO: renamed from: c */
    public int f249033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8x0(erw erwVar, ibk ibkVar) {
        super(ibkVar);
        this.f249032b = erwVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f249031a = obj;
        this.f249033c |= Integer.MIN_VALUE;
        return this.f249032b.m39835a(this);
    }
}
