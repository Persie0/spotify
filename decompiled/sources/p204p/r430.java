package p204p;

import android.view.ViewGroup;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class r430 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f195643a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f195644b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r430(int i, int i2) {
        super(1);
        this.f195643a = i2;
        this.f195644b = i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) throws Exception {
        switch (this.f195643a) {
            case 0:
                ((Number) obj).intValue();
                return Integer.valueOf(this.f195644b);
            case 1:
                ((Number) obj).intValue();
                return Integer.valueOf(this.f195644b);
            case 2:
                jpz0.m53998l((mpz0) obj, new d4f(this.f195644b, 0));
                return w2a1.f247311a;
            case 3:
                h6j h6jVar = (h6j) obj;
                h6jVar.setMargins(((ViewGroup.MarginLayoutParams) h6jVar).leftMargin, ((ViewGroup.MarginLayoutParams) h6jVar).topMargin, this.f195644b, ((ViewGroup.MarginLayoutParams) h6jVar).bottomMargin);
                return w2a1.f247311a;
            case 4:
                int i = this.f195644b;
                ((h6j) obj).setMargins(i, i, i * 2, i);
                return w2a1.f247311a;
            case 5:
                h6j h6jVar2 = (h6j) obj;
                h6jVar2.setMargins(((ViewGroup.MarginLayoutParams) h6jVar2).leftMargin, ((ViewGroup.MarginLayoutParams) h6jVar2).topMargin, this.f195644b, ((ViewGroup.MarginLayoutParams) h6jVar2).bottomMargin);
                return w2a1.f247311a;
            case 6:
                ((ViewGroup.MarginLayoutParams) ((h6j) obj)).topMargin = this.f195644b;
                return w2a1.f247311a;
            case 7:
                h6j h6jVar3 = (h6j) obj;
                int i2 = this.f195644b;
                h6jVar3.setMargins(i2, ((ViewGroup.MarginLayoutParams) h6jVar3).topMargin, i2 / 2, ((ViewGroup.MarginLayoutParams) h6jVar3).bottomMargin);
                return w2a1.f247311a;
            case 8:
                int i3 = this.f195644b;
                ((h6j) obj).setMargins(i3, i3, i3 * 2, i3);
                return w2a1.f247311a;
            case 9:
                return new rq91(this.f195644b);
            case 10:
                jpz0.m53998l((mpz0) obj, new d4f(this.f195644b, 0));
                return w2a1.f247311a;
            case 11:
                return Boolean.valueOf(((Number) obj).intValue() == this.f195644b);
            case 12:
                return new rq91(this.f195644b);
            case 13:
                return new rq91(this.f195644b);
            case 14:
                jpz0.m54011y((mpz0) obj, String.format("more-like-card-%s", Arrays.copyOf(new Object[]{Integer.valueOf(this.f195644b)}, 1)));
                return w2a1.f247311a;
            case 15:
                jpz0.m54011y((mpz0) obj, String.format("more-like-list-ctx-menu-%s", Arrays.copyOf(new Object[]{Integer.valueOf(this.f195644b)}, 1)));
                return w2a1.f247311a;
            case 16:
                jpz0.m54011y((mpz0) obj, String.format("more-like-list-%s", Arrays.copyOf(new Object[]{Integer.valueOf(this.f195644b)}, 1)));
                return w2a1.f247311a;
            case 17:
                return Boolean.valueOf(((ofj0) obj).startNestedScroll(this.f195644b));
            case 18:
                return new rq91(this.f195644b);
            case 19:
                return new rq91(this.f195644b);
            case 20:
                return new rq91(this.f195644b);
            case 21:
                return juu0.m54347a((juu0) obj, this.f195644b, 0, 0, 14);
            case 22:
                return juu0.m54347a((juu0) obj, 0, this.f195644b, 0, 13);
            case 23:
                return juu0.m54347a((juu0) obj, 0, 0, this.f195644b, 11);
            case 24:
                ezx0 ezx0VarMo63454G1 = ((yyx0) obj).mo63454G1("DELETE FROM recent_locations WHERE geoNameId = ?");
                try {
                    ezx0VarMo63454G1.mo24846u(1, this.f195644b);
                    ezx0VarMo63454G1.mo24841E1();
                    return w2a1.f247311a;
                } finally {
                    ezx0VarMo63454G1.close();
                }
            case 25:
                return new rq91(this.f195644b);
            case 26:
                return new rq91(this.f195644b);
            case 27:
                return new rq91(this.f195644b);
            case 28:
                jpz0.m53998l((mpz0) obj, new d4f(this.f195644b, 0));
                return w2a1.f247311a;
            default:
                jpz0.m53997k((mpz0) obj, new b4f(1, this.f195644b));
                return w2a1.f247311a;
        }
    }
}
