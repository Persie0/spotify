package p204p;

import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.emoji2.emojipicker.EmojiView;
import com.spotify.music.R;
import io.branch.referral.validators.IntegrationValidatorDialogRowItem;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e8u implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57266a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f57267b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f57268c;

    public /* synthetic */ e8u(int i, Object obj, Object obj2) {
        this.f57266a = i;
        this.f57267b = obj;
        this.f57268c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f57266a;
        Object obj = this.f57268c;
        Object obj2 = this.f57267b;
        switch (i) {
            case 0:
                f8u f8uVar = (f8u) obj2;
                f8uVar.f67090h = !f8uVar.f67090h;
                f8uVar.m41043F1();
                f8uVar.f67088f.removeViews(1, f8uVar.mo38164d1() - 1);
                f8uVar.mo38148F0();
                ((AppCompatImageView) obj).announceForAccessibility(f8uVar.f67085c.getString(R.string.emoji_bidirectional_switcher_clicked_desc));
                return;
            case 1:
                d9u d9uVar = (d9u) obj2;
                View view2 = (View) obj;
                String strValueOf = String.valueOf(((EmojiView) view).getEmoji());
                d9uVar.f46902U0.invoke(d9uVar, strValueOf);
                d9uVar.f46901T0.invoke(d9uVar, d9u.m35388D(strValueOf));
                sr31 sr31Var = d9uVar.f46900S0;
                e9u e9uVar = d9uVar.f46905X0;
                if (e9uVar == null) {
                    wj50.m88260d0("emojiViewItem");
                    throw null;
                }
                String str = (String) e9uVar.f57535b.get(0);
                Map map = (Map) ((wg61) sr31Var.f213225c).getValue();
                if (str.equals(strValueOf)) {
                    map.remove(str);
                } else {
                    map.put(str, strValueOf);
                }
                ((SharedPreferences) sr31Var.f213224b).edit().putString("pref_key_sticky_variant", g6f.m43753y0(map.entrySet(), "|", null, null, null, 62)).commit();
                nps npsVar = d9uVar.f46906Y0;
                if (npsVar == null) {
                    wj50.m88260d0("emojiPickerPopupViewController");
                    throw null;
                }
                PopupWindow popupWindow = (PopupWindow) npsVar.f157064c;
                if (popupWindow.isShowing()) {
                    popupWindow.dismiss();
                }
                view2.sendAccessibilityEvent(128);
                return;
            case 2:
                fk30 fk30Var = (fk30) obj2;
                sk30 sk30Var = (sk30) obj;
                if (fk30Var.events().containsKey("click")) {
                    sk30Var.f209990c.m78379b(new zj30("click", fk30Var, btv0.f30940g));
                    return;
                }
                it30 it30VarTarget = fk30Var.target();
                if (it30VarTarget != null) {
                    sk30Var.f209989b.mo25405j(it30VarTarget);
                    return;
                }
                return;
            default:
                Context context = (Context) obj;
                int i2 = IntegrationValidatorDialogRowItem.f7170a;
                ((IntegrationValidatorDialogRowItem) obj2).getClass();
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage("null\n");
                TextView textView = new TextView(context);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setGravity(1);
                textView.setText(Html.fromHtml("<a href=null</a>"));
                builder.setView(textView);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new r450());
                builder.create().show();
                return;
        }
    }
}
