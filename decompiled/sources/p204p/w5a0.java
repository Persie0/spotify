package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w5a0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f248044a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ w4a0 f248045b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w5a0(w4a0 w4a0Var, int i) {
        super(0);
        this.f248044a = i;
        this.f248045b = w4a0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f248044a) {
            case 0:
                break;
        }
        return this.f248045b.serialize();
    }
}
