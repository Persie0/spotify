package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class f6w0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66509a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f66510b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6w0(int i, int i2) {
        super(1);
        this.f66509a = i2;
        this.f66510b = i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f66509a) {
            case 0:
                jpz0.m53998l((mpz0) obj, new d4f(0, this.f66510b));
                return w2a1.f247311a;
            case 1:
                jpz0.m53998l((mpz0) obj, new d4f(0, this.f66510b));
                return w2a1.f247311a;
            case 2:
                fdx0 fdx0Var = (fdx0) obj;
                float f = this.f66510b;
                fdx0Var.m41389l(2.5f * f);
                fdx0Var.m41396v(fdx0Var.mo24619j() * 3 * f);
                fdx0Var.m41397w(fdx0Var.mo24619j() * ((float) 0.5d) * f);
                fdx0Var.m41395u(b9m.m28515o(0.0f, 1.0f));
                fdx0Var.m41393r(hmx0.m47993b(4));
                fdx0Var.m41384f(true);
                return w2a1.f247311a;
            case 3:
                jpz0.m53986D((mpz0) obj, this.f66510b);
                return w2a1.f247311a;
            case 4:
                return new sch0(new r2h0(this.f66510b, (st91) obj));
            case 5:
                int i = this.f66510b;
                im91 im91VarM53259E = jg31.m53259E(i, 0, null, 6);
                sxj sxjVarM30755d = bx4.m30755d(kbv.m55958d(im91VarM53259E, 2), kbv.m55959e(im91VarM53259E, 2));
                sxjVarM30755d.f214903d = bx4.m30754c(1, new evm0(i, 14, false));
                return sxjVarM30755d;
            case 6:
                h6j h6jVar = (h6j) obj;
                h6jVar.setMargins(this.f66510b, ((ViewGroup.MarginLayoutParams) h6jVar).topMargin, ((ViewGroup.MarginLayoutParams) h6jVar).rightMargin, ((ViewGroup.MarginLayoutParams) h6jVar).bottomMargin);
                return w2a1.f247311a;
            case 7:
                h6j h6jVar2 = (h6j) obj;
                h6jVar2.setMargins(((ViewGroup.MarginLayoutParams) h6jVar2).leftMargin, ((ViewGroup.MarginLayoutParams) h6jVar2).topMargin, this.f66510b, ((ViewGroup.MarginLayoutParams) h6jVar2).bottomMargin);
                return w2a1.f247311a;
            case 8:
                st91 st91Var = (st91) obj;
                int iM38547C = edb.m38547C(this.f66510b);
                int i2 = 1;
                if (iM38547C != 0) {
                    if (iM38547C != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 2;
                }
                return new hzg0(i2, st91Var);
            case 9:
                return new rq91(this.f66510b);
            case 10:
                return new rq91(this.f66510b);
            case 11:
                olg0 olg0Var = (olg0) obj;
                int iM38547C2 = edb.m38547C(this.f66510b);
                if (iM38547C2 == 0) {
                    return olg0Var.m67292h();
                }
                if (iM38547C2 == 1) {
                    return olg0Var.m67292h();
                }
                if (iM38547C2 == 2) {
                    return olg0Var.m67291e(1, 2);
                }
                if (iM38547C2 == 3) {
                    return olg0Var.m67291e(2, 1);
                }
                throw new NoWhenBranchMatchedException();
            case 12:
                return new e3q0(true, this.f66510b);
            case 13:
                return new rq91(this.f66510b);
            case 14:
                return new rq91(this.f66510b);
            case 15:
                return v8e1.m84915a((v8e1) obj, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, Integer.valueOf(n0e1.m63437n(this.f66510b, 0, 100)), null, false, false, false, false, false, null, 134086655);
            case 16:
                return v8e1.m84915a((v8e1) obj, null, null, false, this.f66510b, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, null, 134217663);
            case 17:
                return v8e1.m84915a((v8e1) obj, null, null, false, 0, 0, 0, 0, this.f66510b, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, null, 134216703);
            default:
                Resources resources = ((Context) obj).getResources();
                int i3 = this.f66510b;
                return resources.getQuantityString(R.plurals.your_episodes_settings_option_auto_download_enabled_shows, i3, Integer.valueOf(i3));
        }
    }
}
