package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class tik0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f220701a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mji f220702b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tik0(mji mjiVar, int i) {
        super(0);
        this.f220701a = i;
        this.f220702b = mjiVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f220701a) {
            case 0:
                return this.f220702b.f144263e;
            case 1:
                return this.f220702b.f144275q;
            case 2:
                return this.f220702b.f144270l;
            default:
                return this.f220702b.f144267i;
        }
    }
}
