package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class bnh extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f28828a;

    /* JADX INFO: renamed from: b */
    public c450 f28829b;

    /* JADX INFO: renamed from: c */
    public int f28830c;

    /* JADX INFO: renamed from: d */
    public int f28831d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f28832e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ cnh f28833f;

    /* JADX INFO: renamed from: g */
    public int f28834g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnh(cnh cnhVar, ibk ibkVar) {
        super(ibkVar);
        this.f28833f = cnhVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f28832e = obj;
        this.f28834g |= Integer.MIN_VALUE;
        return cnh.m33453a(this.f28833f, null, null, this);
    }
}
