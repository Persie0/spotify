package p204p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.encoreconsumermobile.elements.settings.SettingsButton;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class sng extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f210925a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f210926b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sng(int i, gh00 gh00Var) {
        super(1);
        this.f210925a = i;
        this.f210926b = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f210925a) {
            case 0:
                this.f210926b.invoke(new gv60());
                return w2a1.f247311a;
            case 1:
                gh00 gh00Var = this.f210926b;
                w2a1 w2a1Var = w2a1.f247311a;
                gh00Var.invoke(w2a1Var);
                return w2a1Var;
            case 2:
                SettingsButton settingsButton = new SettingsButton((Context) obj, null, 0, 6, null);
                int dimensionPixelSize = settingsButton.getResources().getDimensionPixelSize(R.dimen.header_action_row_button_size);
                int dimensionPixelSize2 = settingsButton.getResources().getDimensionPixelSize(R.dimen.header_action_row_button_padding);
                settingsButton.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                settingsButton.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                settingsButton.mo2821c(new sng(1, this.f210926b));
                return settingsButton;
            case 3:
                this.f210926b.invoke(new ag90(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 4:
                tqb0 tqb0Var = (tqb0) obj;
                boolean z = tqb0Var instanceof sqb0;
                gh00 gh00Var2 = this.f210926b;
                if (z) {
                    gh00Var2.invoke(new dob0(((sqb0) tqb0Var).f213053a));
                } else if (tqb0Var instanceof rqb0) {
                    gh00Var2.invoke(new aob0(((rqb0) tqb0Var).f201791a));
                } else {
                    if (!(tqb0Var instanceof qqb0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gh00Var2.invoke(new znb0(((qqb0) tqb0Var).f191521a));
                }
                return w2a1.f247311a;
            case 5:
                this.f210926b.invoke(new swe0(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 6:
                this.f210926b.invoke(new bci0((pdu) obj));
                return w2a1.f247311a;
            case 7:
                this.f210926b.invoke((zhe1) obj);
                return w2a1.f247311a;
            case 8:
                this.f210926b.invoke((zhe1) obj);
                return w2a1.f247311a;
            case 9:
                this.f210926b.invoke(new o60((pdu) obj));
                return w2a1.f247311a;
            case 10:
                mzm0 mzm0Var = new mzm0();
                mzm0Var.f148729a = (String) obj;
                this.f210926b.invoke(mzm0Var);
                return w2a1.f247311a;
            case 11:
                ((Boolean) obj).booleanValue();
                this.f210926b.invoke(k0n0.f118125a);
                return w2a1.f247311a;
            case 12:
                this.f210926b.invoke(new iwp0(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 13:
                this.f210926b.invoke(new axr0((ywr0) obj));
                return w2a1.f247311a;
            case 14:
                this.f210926b.invoke(new k8u0(((Number) obj).intValue()));
                return w2a1.f247311a;
            case 15:
                this.f210926b.invoke(new lru0((String) obj));
                return w2a1.f247311a;
            case 16:
                this.f210926b.invoke(new ntu0(((Number) obj).intValue()));
                return w2a1.f247311a;
            case 17:
                this.f210926b.invoke(new ptu0(((Number) obj).intValue()));
                return w2a1.f247311a;
            case 18:
                this.f210926b.invoke(new ztu0((rru0) obj));
                return w2a1.f247311a;
            case 19:
                this.f210926b.invoke(new wtu0((osu0) obj));
                return w2a1.f247311a;
            case 20:
                this.f210926b.invoke(new xtu0(((Number) obj).intValue()));
                return w2a1.f247311a;
            case 21:
                this.f210926b.invoke(new ivy0((String) obj));
                return w2a1.f247311a;
            case 22:
                this.f210926b.invoke(new ywy0((String) obj));
                return w2a1.f247311a;
            case 23:
                this.f210926b.invoke(new u701(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 24:
                this.f210926b.invoke(new bf01(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 25:
                this.f210926b.invoke(new mg11((String) obj));
                return w2a1.f247311a;
            case 26:
                this.f210926b.invoke(new qk21(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 27:
                this.f210926b.invoke(new o441(((Number) obj).intValue()));
                return w2a1.f247311a;
            case 28:
                this.f210926b.invoke(new n751((r751) obj));
                return w2a1.f247311a;
            default:
                this.f210926b.invoke(new m751((pdu) obj));
                return w2a1.f247311a;
        }
    }
}
