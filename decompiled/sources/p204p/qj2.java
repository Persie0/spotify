package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class qj2 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f189131a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ck2 f189132b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qj2(ck2 ck2Var, int i) {
        super(0);
        this.f189131a = i;
        this.f189132b = ck2Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f189131a) {
            case 0:
                return new flx("chat-mvp", this.f189132b.f38769h, null);
            default:
                return this.f189132b.f38767f.m55694a(whr0.f251426i.f251432f).m77807a();
        }
    }
}
