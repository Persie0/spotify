package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class i7q extends ibk {

    /* JADX INFO: renamed from: a */
    public String f99603a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f99604b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ k7q f99605c;

    /* JADX INFO: renamed from: d */
    public int f99606d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7q(k7q k7qVar, ibk ibkVar) {
        super(ibkVar);
        this.f99605c = k7qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99604b = obj;
        this.f99606d |= Integer.MIN_VALUE;
        return this.f99605c.m55695a(null, this);
    }
}
