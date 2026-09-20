package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a4e extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f12207a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b4e f12208b;

    /* JADX INFO: renamed from: c */
    public int f12209c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4e(b4e b4eVar, ibk ibkVar) {
        super(ibkVar);
        this.f12208b = b4eVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f12207a = obj;
        this.f12209c |= Integer.MIN_VALUE;
        return b4e.m28087a(this.f12208b, null, this);
    }
}
