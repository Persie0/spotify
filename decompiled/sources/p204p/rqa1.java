package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rqa1 extends ibk {

    /* JADX INFO: renamed from: a */
    public u8t f201783a;

    /* JADX INFO: renamed from: b */
    public Object f201784b;

    /* JADX INFO: renamed from: c */
    public int f201785c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f201786d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ sqa1 f201787e;

    /* JADX INFO: renamed from: f */
    public int f201788f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqa1(sqa1 sqa1Var, ibk ibkVar) {
        super(ibkVar);
        this.f201787e = sqa1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f201786d = obj;
        this.f201788f |= Integer.MIN_VALUE;
        Object objM78942a = this.f201787e.m78942a(null, this);
        return objM78942a == yuk.f276404a ? objM78942a : new s6x0(objM78942a);
    }
}
