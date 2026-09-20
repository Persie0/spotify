package p204p;

import android.widget.Button;
import android.widget.TextView;
import com.spotify.encoremobile.buttons.TertiaryButtonView;

/* JADX INFO: loaded from: classes7.dex */
public final class uv30 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f234327a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zu0 f234328b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uv30(zu0 zu0Var, int i) {
        super(1);
        this.f234327a = i;
        this.f234328b = zu0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f234327a) {
            case 0:
                String str = (String) obj;
                TextView textView = (TextView) this.f234328b.f286301d;
                if (textView != null) {
                    textView.setText(str);
                    return w2a1.f247311a;
                }
                wj50.m88260d0("bodyView");
                throw null;
            case 1:
                String str2 = (String) obj;
                zu0 zu0Var = this.f234328b;
                Button button = (Button) zu0Var.f286305h;
                if (button == null) {
                    wj50.m88260d0("positiveButton");
                    throw null;
                }
                button.setText(str2);
                Button button2 = (Button) zu0Var.f286305h;
                if (button2 != null) {
                    button2.setOnClickListener(new vv30(zu0Var, 0));
                    return w2a1.f247311a;
                }
                wj50.m88260d0("positiveButton");
                throw null;
            default:
                String str3 = (String) obj;
                zu0 zu0Var2 = this.f234328b;
                TertiaryButtonView tertiaryButtonView = (TertiaryButtonView) zu0Var2.f286306i;
                if (tertiaryButtonView == null) {
                    wj50.m88260d0("negativeButton");
                    throw null;
                }
                tertiaryButtonView.setText(str3);
                TertiaryButtonView tertiaryButtonView2 = (TertiaryButtonView) zu0Var2.f286306i;
                if (tertiaryButtonView2 != null) {
                    tertiaryButtonView2.setOnClickListener(new vv30(zu0Var2, 1));
                    return w2a1.f247311a;
                }
                wj50.m88260d0("negativeButton");
                throw null;
        }
    }
}
