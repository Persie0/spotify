package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vuv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f245082a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zuv f245083b;

    /* JADX INFO: renamed from: c */
    public int f245084c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vuv(zuv zuvVar, ibk ibkVar) {
        super(ibkVar);
        this.f245083b = zuvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f245082a = obj;
        this.f245084c |= Integer.MIN_VALUE;
        return this.f245083b.m97079b(null, this);
    }
}
