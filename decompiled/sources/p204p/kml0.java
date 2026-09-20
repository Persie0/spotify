package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kml0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f124174a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uml0 f124175b;

    /* JADX INFO: renamed from: c */
    public int f124176c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kml0(uml0 uml0Var, ibk ibkVar) {
        super(ibkVar);
        this.f124175b = uml0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124174a = obj;
        this.f124176c |= Integer.MIN_VALUE;
        return this.f124175b.m83454a(this);
    }
}
