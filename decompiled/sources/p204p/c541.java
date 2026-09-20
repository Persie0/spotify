package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class c541 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f34085a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e541 f34086b;

    /* JADX INFO: renamed from: c */
    public int f34087c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c541(e541 e541Var, ibk ibkVar) {
        super(ibkVar);
        this.f34086b = e541Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f34085a = obj;
        this.f34087c |= Integer.MIN_VALUE;
        return this.f34086b.m37807a(false, this);
    }
}
