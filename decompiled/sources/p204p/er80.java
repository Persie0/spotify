package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class er80 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62040a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z9p f62041b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ er80(z9p z9pVar, int i) {
        super(0);
        this.f62040a = i;
        this.f62041b = z9pVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f62040a) {
            case 0:
                return new dr80(this.f62041b, 0);
            default:
                return new dr80(this.f62041b, 1);
        }
    }
}
