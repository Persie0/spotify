package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class c660 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f34401a;

    /* JADX INFO: renamed from: b */
    public String f34402b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f34403c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ f660 f34404d;

    /* JADX INFO: renamed from: e */
    public int f34405e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c660(f660 f660Var, ibk ibkVar) {
        super(ibkVar);
        this.f34404d = f660Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f34403c = obj;
        this.f34405e |= Integer.MIN_VALUE;
        return this.f34404d.m40832c(null, null, this);
    }
}
