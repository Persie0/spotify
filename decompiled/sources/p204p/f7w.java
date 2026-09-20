package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class f7w extends ibk {

    /* JADX INFO: renamed from: a */
    public String f66802a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66803b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ j3p f66804c;

    /* JADX INFO: renamed from: d */
    public int f66805d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7w(j3p j3pVar, ibk ibkVar) {
        super(ibkVar);
        this.f66804c = j3pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f66803b = obj;
        this.f66805d |= Integer.MIN_VALUE;
        return this.f66804c.m52285b(null, this);
    }
}
