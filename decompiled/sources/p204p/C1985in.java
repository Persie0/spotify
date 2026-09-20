package p204p;

import android.content.Intent;
import com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: renamed from: p.in */
/* JADX INFO: loaded from: classes4.dex */
public final class C1985in implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f103797a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2021jn f103798b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AccountPickerActivity f103799c;

    public /* synthetic */ C1985in(AccountPickerActivity accountPickerActivity, C2021jn c2021jn, int i) {
        this.f103797a = i;
        this.f103799c = accountPickerActivity;
        this.f103798b = c2021jn;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f103797a) {
            case 0:
                C1948hn c1948hn = (C1948hn) obj;
                AccountPickerActivity accountPickerActivity = this.f103799c;
                accountPickerActivity.finish();
                accountPickerActivity.startActivity(C2663zu.m96956a(this.f103798b.f113973a, accountPickerActivity, c1948hn.f93107a, c1948hn.f93108b, c1948hn.f93109c));
                break;
            case 1:
                C2021jn c2021jn = this.f103798b;
                c2021jn.f113976d.m53152a(new ns41(((C1866fn) obj).f71137a));
                AccountPickerActivity accountPickerActivity2 = this.f103799c;
                accountPickerActivity2.finish();
                e0b0 e0b0Var = c2021jn.f113974b;
                k791 k791VarM36074a = c2021jn.f113975c.m36074a(accountPickerActivity2, WidgetInteraction.Background.DESTINATION_HOME);
                k791VarM36074a.m55637c();
                Intent intent = (Intent) k791VarM36074a.f120028b;
                intent.addFlags(268435456);
                accountPickerActivity2.startActivity(e0b0.m37487a(e0b0Var, accountPickerActivity2, intent, false, null, 0, 2, 60));
                break;
            default:
                AccountPickerActivity accountPickerActivity3 = this.f103799c;
                accountPickerActivity3.finish();
                C2021jn c2021jn2 = this.f103798b;
                e0b0 e0b0Var2 = c2021jn2.f113974b;
                k791 k791VarM36074a2 = c2021jn2.f113975c.m36074a(accountPickerActivity3, WidgetInteraction.Background.DESTINATION_HOME);
                k791VarM36074a2.m55637c();
                Intent intent2 = (Intent) k791VarM36074a2.f120028b;
                intent2.addFlags(268435456);
                accountPickerActivity3.startActivity(e0b0.m37487a(e0b0Var2, accountPickerActivity3, intent2, false, null, 0, 2, 60));
                break;
        }
    }

    public C1985in(C2021jn c2021jn, AccountPickerActivity accountPickerActivity) {
        this.f103797a = 1;
        this.f103798b = c2021jn;
        this.f103799c = accountPickerActivity;
    }
}
