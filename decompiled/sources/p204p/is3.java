package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class is3 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f105110a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qs3 f105111b;

    /* JADX INFO: renamed from: c */
    public int f105112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is3(qs3 qs3Var, ibk ibkVar) {
        super(ibkVar);
        this.f105111b = qs3Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f105110a = obj;
        this.f105112c |= Integer.MIN_VALUE;
        return this.f105111b.m73662a(null, null, null, this);
    }
}
