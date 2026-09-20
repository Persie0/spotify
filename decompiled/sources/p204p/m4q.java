package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class m4q extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f140003a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o4q f140004b;

    /* JADX INFO: renamed from: c */
    public int f140005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4q(o4q o4qVar, ibk ibkVar) {
        super(ibkVar);
        this.f140004b = o4qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f140003a = obj;
        this.f140005c |= Integer.MIN_VALUE;
        return o4q.m66254h(this.f140004b, null, null, this);
    }
}
