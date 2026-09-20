package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ioe0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ koe0 f104216a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ moe0 f104217b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioe0(koe0 koe0Var, moe0 moe0Var) {
        super(1);
        this.f104216a = koe0Var;
        this.f104217b = moe0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        koe0 koe0Var = this.f104216a;
        e2a e2aVar = koe0Var.f124772c;
        hhv hhvVar = koe0Var.f124771b;
        e2aVar.invoke(new mf3(hhvVar.f91594b));
        this.f104217b.f145661Z0.mo47494i(hhvVar.f91594b.getMessageData().getLoggingData().getMessageUuid());
        return w2a1.f247311a;
    }
}
