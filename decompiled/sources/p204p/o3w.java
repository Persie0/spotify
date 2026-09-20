package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o3w extends ibk {

    /* JADX INFO: renamed from: a */
    public String f161457a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f161458b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ p3w f161459c;

    /* JADX INFO: renamed from: d */
    public int f161460d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3w(p3w p3wVar, ibk ibkVar) {
        super(ibkVar);
        this.f161459c = p3wVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f161458b = obj;
        this.f161460d |= Integer.MIN_VALUE;
        Object objM69089a = this.f161459c.m69089a(null, null, this);
        return objM69089a == yuk.f276404a ? objM69089a : new s6x0(objM69089a);
    }
}
