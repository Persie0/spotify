package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fm90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f70992a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hm90 f70993b;

    /* JADX INFO: renamed from: c */
    public int f70994c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm90(hm90 hm90Var, ibk ibkVar) {
        super(ibkVar);
        this.f70993b = hm90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f70992a = obj;
        this.f70994c |= Integer.MIN_VALUE;
        return this.f70993b.m47935a(null, this);
    }
}
