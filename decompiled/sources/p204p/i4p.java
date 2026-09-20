package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class i4p extends ibk {

    /* JADX INFO: renamed from: a */
    public String f98552a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f98553b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ k4p f98554c;

    /* JADX INFO: renamed from: d */
    public int f98555d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4p(k4p k4pVar, ibk ibkVar) {
        super(ibkVar);
        this.f98554c = k4pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f98553b = obj;
        this.f98555d |= Integer.MIN_VALUE;
        return k4p.m55404b(this.f98554c, null, this);
    }
}
