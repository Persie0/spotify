package p204p;

import androidx.car.app.model.Alert;
import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: classes7.dex */
public final class le0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f132413a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f132414b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ le0(int i, int i2) {
        super(1);
        this.f132413a = i2;
        this.f132414b = i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f132413a) {
            case 0:
                return new rq91(this.f132414b);
            case 1:
                return Boolean.valueOf(((pqz) obj).m70697N1(this.f132414b));
            case 2:
                return Boolean.valueOf(((pqz) obj).m70697N1(this.f132414b));
            case 3:
                ((ObservableEmitter) obj).onError(new RuntimeException(s571.m77246e(this.f132414b, "mDNS service registration failed with code ")));
                return w2a1.f247311a;
            case 4:
                ((ObservableEmitter) obj).onError(new RuntimeException(s571.m77246e(this.f132414b, "mDNS service unregistration failed with code ")));
                return w2a1.f247311a;
            case 5:
                ((Number) obj).intValue();
                return Integer.valueOf(this.f132414b);
            case 6:
                jpz0.m53998l((mpz0) obj, new d4f(this.f132414b, 0));
                return w2a1.f247311a;
            case 7:
                return new rq91(this.f132414b);
            case 8:
                jpz0.m53998l((mpz0) obj, new d4f(this.f132414b, 0));
                return w2a1.f247311a;
            case 9:
                return new rq91(this.f132414b);
            case 10:
                pvf pvfVar = (pvf) obj;
                int i = pvfVar.f181732a;
                Integer num = pvfVar.f181733b;
                int i2 = 1;
                int i3 = new b450(i, num != null ? num.intValue() : Alert.DURATION_SHOW_INDEFINITELY, 1).f278779b;
                int i4 = this.f132414b;
                if (i4 <= i3 && i <= i4) {
                    i2 = 0;
                } else if (i4 >= i) {
                    i2 = -1;
                }
                return Integer.valueOf(i2);
            case 11:
                return new rq91(this.f132414b);
            case 12:
                jpz0.m53998l((mpz0) obj, new d4f(this.f132414b, 0));
                return w2a1.f247311a;
            case 13:
                return new pqm0(Integer.valueOf(this.f132414b), ((zjk) obj).f283454a);
            case 14:
                ((Number) obj).intValue();
                return Integer.valueOf(this.f132414b);
            case 15:
                ((Number) obj).intValue();
                return Integer.valueOf(this.f132414b);
            case 16:
                return new rq91(this.f132414b);
            case 17:
                return s571.m77246e(this.f132414b + ((Number) obj).intValue(), "section_");
            case 18:
                return new rq91(this.f132414b);
            case 19:
                return new rq91(this.f132414b);
            case 20:
                return new rq91(this.f132414b);
            case 21:
                return new rq91(this.f132414b);
            case 22:
                ((Number) obj).intValue();
                return Integer.valueOf(-this.f132414b);
            case 23:
                ((Number) obj).intValue();
                return Integer.valueOf(-this.f132414b);
            case 24:
                return Boolean.valueOf(((Number) obj).intValue() >= this.f132414b);
            case 25:
                return Boolean.valueOf(((ssa1) obj).f213556a == this.f132414b);
            case 26:
                return Boolean.valueOf(((Number) obj).intValue() == this.f132414b);
            case 27:
                return Boolean.valueOf(((pqz) obj).m70697N1(this.f132414b));
            case 28:
                return Boolean.valueOf(((pqz) obj).m70691H1(this.f132414b));
            default:
                return new rq91(this.f132414b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le0(gtf gtfVar, int i) {
        super(1);
        this.f132413a = 10;
        this.f132414b = i;
    }
}
