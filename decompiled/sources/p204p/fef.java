package p204p;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import com.spotify.encoreconsumermobile.elements.find.FindInContextView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.messaging.messagingplatformdebug.items.DelayChooser;
import com.spotify.mobius.functions.Consumer;
import java.util.Collections;

/* JADX INFO: loaded from: classes9.dex */
public final class fef implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68750a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f68751b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f68752c;

    public /* synthetic */ fef(int i, Object obj, Object obj2) {
        this.f68750a = i;
        this.f68751b = obj;
        this.f68752c = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [p.gh00, p.qe70] */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f68750a) {
            case 0:
                ((Consumer) this.f68751b).accept(new ylf(String.valueOf(editable)));
                ief.m50375a((ief) this.f68752c, editable);
                break;
            case 1:
                break;
            case 2:
                ((gh00) this.f68751b).invoke(Integer.valueOf(DelayChooser.m15321a((DelayChooser) this.f68752c)));
                break;
            case 3:
                FindInContextView findInContextView = (FindInContextView) this.f68751b;
                findInContextView.f3659T0.setVisibility((editable == null || editable.length() == 0) ? 8 : 0);
                ((qe70) this.f68752c).invoke(new c8z(String.valueOf(editable), findInContextView.f3658S0.isFocused()));
                break;
            case 4:
            case 5:
            case 6:
                break;
            default:
                Button button = (Button) ((rvw0) this.f68751b).f203147i;
                avn0 avn0Var = (avn0) this.f68752c;
                button.setEnabled(String.valueOf(editable).length() > 0 && avn0Var.m27256i1().f42487X != null);
                if (editable != null && editable.length() != 0) {
                    cvn0 cvn0VarM27256i1 = avn0Var.m27256i1();
                    if (!cvn0VarM27256i1.f42497t) {
                        cvn0VarM27256i1.f42497t = true;
                        kv91 kv91Var = cvn0VarM27256i1.f42492e;
                        cbh0 cbh0Var = cvn0VarM27256i1.f42495h;
                        cbh0Var.getClass();
                        yt91 yt91VarM96903c = cbh0Var.f36128b.m96903c();
                        yt91VarM96903c.f276055i.add(new bu91("phone_number_field", null, null, null, null));
                        yt91VarM96903c.f276056j = false;
                        kv91Var.mo57452p(new av91("", "", new dv91("key_stroke", 1), new bv91("text_edit", 1, Collections.singletonMap("field_to_be_changed", "")), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()));
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f68750a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String string;
        switch (this.f68750a) {
            case 1:
                byo byoVar = (byo) this.f68752c;
                ((gh00) this.f68751b).invoke(new nwy0((charSequence == null ? "" : charSequence).toString()));
                ((EncoreButton) ((da80) byoVar.f32287c).f46999e).setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
                if (charSequence == null) {
                    charSequence = "";
                }
                byoVar.m30899a(charSequence);
                break;
            case 4:
                Consumer consumer = (Consumer) this.f68751b;
                String strValueOf = String.valueOf(charSequence);
                c170 c170Var = (c170) this.f68752c;
                consumer.accept(new q070(strValueOf, (String) c170Var.f33012i, (String) c170Var.f33011h));
                if (!wj50.m88271j((String) c170Var.f33010g, String.valueOf(charSequence))) {
                    np7 np7Var = (np7) c170Var.f33005b;
                    kv91 kv91Var = (kv91) np7Var.f156890b;
                    yt91 yt91VarM96903c = ((ipg0) np7Var.f156891c).f104499b.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("birthday_input_field", null, null, null, null));
                    yt91VarM96903c.f276056j = false;
                    kv91Var.mo57453r(new av91("", "", new dv91("key_stroke", 1), new bv91("text_edit", 1, Collections.singletonMap("field_to_be_changed", "birthday")), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                }
                if (charSequence == null || (string = charSequence.toString()) == null) {
                    string = "";
                }
                c170Var.f33010g = string;
                break;
            case 5:
                ((Consumer) this.f68751b).accept(new vae0(String.valueOf(charSequence)));
                vw90 vw90Var = (vw90) ((mei) this.f68752c).f142732c;
                kv91 kv91Var2 = (kv91) vw90Var.f245441b;
                yt91 yt91VarM96903c2 = ((ipg0) vw90Var.f245442c).f104499b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("birthday_input_field", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                kv91Var2.mo57453r(new av91("", "", new dv91("key_stroke", 1), new bv91("text_edit", 1, Collections.singletonMap("field_to_be_changed", "birthday")), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                break;
            case 6:
                i780 i780Var = (i780) ((aw5) this.f68752c).f20392c;
                kv91 kv91Var3 = (kv91) i780Var.f99465b;
                yt91 yt91VarM96903c3 = ((ipg0) i780Var.f99466c).f104499b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("name_input_field", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                kv91Var3.mo57453r(new av91("", "", new dv91("key_stroke", 1), new bv91("text_edit", 1, Collections.singletonMap("field_to_be_changed", "name")), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                ((Consumer) this.f68751b).accept(new kbe0(String.valueOf(charSequence)));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fef(FindInContextView findInContextView, gh00 gh00Var) {
        this.f68750a = 3;
        this.f68751b = findInContextView;
        this.f68752c = (qe70) gh00Var;
    }

    public fef(aw5 aw5Var, Consumer consumer) {
        this.f68750a = 6;
        this.f68752c = aw5Var;
        this.f68751b = consumer;
    }

    /* JADX INFO: renamed from: a */
    private final void m41424a(Editable editable) {
    }

    /* JADX INFO: renamed from: b */
    private final void m41425b(Editable editable) {
    }

    /* JADX INFO: renamed from: c */
    private final void m41426c(Editable editable) {
    }

    /* JADX INFO: renamed from: d */
    private final void m41427d(Editable editable) {
    }

    /* JADX INFO: renamed from: e */
    private final void m41428e(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: f */
    private final void m41429f(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: g */
    private final void m41430g(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: h */
    private final void m41431h(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: i */
    private final void m41432i(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: j */
    private final void m41433j(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: k */
    private final void m41434k(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: l */
    private final void m41435l(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: m */
    private final void m41436m(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: n */
    private final void m41437n(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: o */
    private final void m41438o(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: p */
    private final void m41439p(int i, int i2, int i3, CharSequence charSequence) {
    }
}
