package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class f4q extends ibk {

    /* JADX INFO: renamed from: a */
    public String f65832a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65833b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o4q f65834c;

    /* JADX INFO: renamed from: d */
    public int f65835d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4q(o4q o4qVar, ibk ibkVar) {
        super(ibkVar);
        this.f65834c = o4qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f65833b = obj;
        this.f65835d |= Integer.MIN_VALUE;
        return this.f65834c.m66257j(null, this);
    }
}
