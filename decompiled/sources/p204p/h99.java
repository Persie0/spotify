package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class h99 extends qe70 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f88898a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f88899b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f88900c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h99(int i, long j, long j2) {
        super(3);
        this.f88898a = i;
        this.f88899b = j;
        this.f88900c = j2;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        switch (this.f88898a) {
            case 0:
                return new fcz0((otd0) obj, (ibp0) obj2, (o4x) obj3, this.f88899b, this.f88900c);
            default:
                return new tdz0((otd0) obj, (ibp0) obj2, (o4x) obj3, this.f88899b, this.f88900c);
        }
    }
}
