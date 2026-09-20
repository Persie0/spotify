package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s610 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f205974a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t610 f205975b;

    /* JADX INFO: renamed from: c */
    public int f205976c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s610(t610 t610Var, ibk ibkVar) {
        super(ibkVar);
        this.f205975b = t610Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f205974a = obj;
        this.f205976c |= Integer.MIN_VALUE;
        return this.f205975b.m80150a(null, this);
    }
}
