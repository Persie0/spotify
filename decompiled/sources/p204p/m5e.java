package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m5e extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f140192a;

    /* JADX INFO: renamed from: b */
    public int f140193b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f140194c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5e(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f140194c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f140192a = obj;
        this.f140193b |= Integer.MIN_VALUE;
        return this.f140194c.emit(null, this);
    }
}
