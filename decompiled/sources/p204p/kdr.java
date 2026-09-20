package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kdr extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f121723a;

    /* JADX INFO: renamed from: b */
    public int f121724b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ldr f121725c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdr(ldr ldrVar, ibk ibkVar) {
        super(ibkVar);
        this.f121725c = ldrVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f121723a = obj;
        this.f121724b |= Integer.MIN_VALUE;
        return this.f121725c.mo15629a(null, null, this);
    }
}
