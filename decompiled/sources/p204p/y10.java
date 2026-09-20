package p204p;

import android.R;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Message;
import android.text.Editable;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.address.addressimpl.view.NonCompletingAutoCompleteTextView;
import com.spotify.adsdisplay.products.cmp.CMPActivity;
import com.spotify.encoreconsumermobile.elements.story.CircularVideoPreviewView;
import com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes3.dex */
public final class y10 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f268117a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f268118b;

    public /* synthetic */ y10(Object obj, int i) {
        this.f268117a = i;
        this.f268118b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r14v64, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v2, types: [p.gh00, p.mb61] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        Message message3;
        gb80 lifecycle;
        switch (this.f268117a) {
            case 0:
                ((g50) this.f268118b).mo43565b();
                return;
            case 1:
                ((vh2) this.f268118b).f241395g.onNext(dc2.f47403a);
                return;
            case 2:
                q73 q73Var = (q73) this.f268118b;
                if (view == q73Var.f186003i && (message3 = q73Var.f186005k) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view != q73Var.f186006l || (message2 = q73Var.f186008n) == null) {
                    messageObtain = (view != q73Var.f186009o || (message = q73Var.f186011q) == null) ? null : Message.obtain(message);
                } else {
                    messageObtain = Message.obtain(message2);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                q73Var.f185993E.obtainMessage(1, q73Var.f185996b).sendToTarget();
                return;
            case 3:
                w83 w83Var = (w83) this.f268118b;
                w83Var.f248833e.m91832l();
                w83Var.f248829a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://alexa.amazon.com/spa/index.html#settings/music-settings/service-preferences")).addFlags(268435456));
                return;
            case 4:
                Consumer consumer = (Consumer) ((q58) ((mj70) this.f268118b).f144173b).f185456b;
                if (consumer != null) {
                    consumer.accept(wcc0.f250016a);
                    return;
                }
                return;
            case 5:
                ((gh00) ((xq3) this.f268118b).f264857b).invoke(nq3.f157108a);
                return;
            case 6:
                ((BehaviorSubject) ((ue7) this.f268118b).f229443b.f121372h).onNext(new cf7(null));
                return;
            case 7:
                g38 g38Var = (g38) this.f268118b;
                hvy state = g38Var.getState();
                if ((state != null ? state.f95816e : null) == null || g38Var.f76133b.getCount() <= 0) {
                    return;
                }
                ((NonCompletingAutoCompleteTextView) g38Var.f76132a.f47418e).showDropDown();
                return;
            case 8:
                wj50.m88279p(view);
                hc80 hc80VarM40067h = eug1.m40067h(view);
                ub80 ub80VarM58232p = (hc80VarM40067h == null || (lifecycle = hc80VarM40067h.getLifecycle()) == null) ? null : l5h1.m58232p(lifecycle);
                if (ub80VarM58232p != null) {
                    x0h1.m89578u(ub80VarM58232p, null, 0, new as8((mb61) this.f268118b, null, 1), 3);
                    return;
                }
                return;
            case 9:
                n09 n09Var = (n09) this.f268118b;
                n09Var.f148942f.invoke();
                n09Var.m63304i();
                return;
            case 10:
                wba wbaVar = (wba) this.f268118b;
                if (wbaVar.f249725t && wbaVar.isShowing()) {
                    if (!wbaVar.f249719Y) {
                        TypedArray typedArrayObtainStyledAttributes = wbaVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        wbaVar.f249718X = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        wbaVar.f249719Y = true;
                    }
                    if (wbaVar.f249718X) {
                        wbaVar.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ((CMPActivity) this.f268118b).finish();
                return;
            case 12:
                ((CallingCodePickerActivity) this.f268118b).m13294t0().m50248a();
                return;
            case 13:
                ((wek0) this.f268118b).m87889c();
                return;
            case 14:
                t1e t1eVar = (t1e) this.f268118b;
                i6m0 i6m0Var = t1eVar.f216248Z1;
                if (i6m0Var == null) {
                    wj50.m88260d0("ubiLogger");
                    throw null;
                }
                bbg0 bbg0Var = t1eVar.f216250b2;
                if (bbg0Var == null) {
                    wj50.m88260d0("webviewEventsFact");
                    throw null;
                }
                yt91 yt91VarM96903c = bbg0Var.f25561b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("close_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                d850 d850VarMo57453r = ((zz8) i6m0Var).mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                x1e x1eVar = t1eVar.f216252d2;
                if (x1eVar == null) {
                    wj50.m88260d0("listener");
                    throw null;
                }
                String str = d850VarMo57453r.f46380a.f279709a;
                cxq0 cxq0Var = x1eVar.f257171a;
                try {
                    ((k5m0) cxq0Var.f43081c).mo55548j();
                    return;
                } catch (IllegalArgumentException unused) {
                    dcm0 dcm0Var = (dcm0) cxq0Var.f43080b;
                    if (str == null) {
                        str = "";
                    }
                    dcm0Var.m35665c(str);
                    return;
                }
            case 15:
                ?? r14 = ((CircularVideoPreviewView) this.f268118b).f3768g;
                if (r14 != 0) {
                    r14.invoke(jee.f111536a);
                    return;
                }
                return;
            case 16:
                ((C2580xm) this.f268118b).invoke(ah6.f15627a);
                return;
            case 17:
                TextInputLayout textInputLayout = ((vhe) this.f268118b).f257279a;
                Editable text = textInputLayout.getEditText().getText();
                if (text != null) {
                    text.clear();
                }
                textInputLayout.m1650k(textInputLayout.f2214G1, textInputLayout.f2216I1);
                return;
            case 18:
                ((uqf1) this.f268118b).run();
                return;
            case 19:
                ((oeh) this.f268118b).invoke();
                return;
            case 20:
                ((bri) this.f268118b).m83052i1(false, false);
                return;
            case 21:
                n3k n3kVar = (n3k) this.f268118b;
                kv91 kv91VarM63632A1 = n3kVar.m63632A1();
                er70 er70Var = n3kVar.f150070c2;
                if (er70Var == null) {
                    wj50.m88260d0("eventFactory");
                    throw null;
                }
                slg0 slg0Var = (slg0) er70Var.get();
                slg0Var.getClass();
                yt91 yt91VarM96903c2 = slg0Var.f210416a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("sheet", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                n3kVar.m63634z1().m87294e(new m2j0(kv91VarM63632A1.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null).f46380a));
                wba wbaVar2 = (wba) n3kVar.f230244L1;
                if (wbaVar2 != null) {
                    wbaVar2.cancel();
                    return;
                }
                return;
            case 22:
                cxq0 cxq0Var2 = ((bxk) this.f268118b).f31880d;
                try {
                    ((k5m0) cxq0Var2.f43081c).mo55548j();
                    return;
                } catch (IllegalArgumentException unused2) {
                    ((dcm0) cxq0Var2.f43080b).m35665c("");
                    return;
                }
            case 23:
                AppCompatCheckBox appCompatCheckBox = ((quo) this.f268118b).f192752g;
                appCompatCheckBox.setChecked(!appCompatCheckBox.isChecked());
                return;
            case 24:
                eh00 eh00Var = ((s0p) this.f268118b).f204481l1;
                if (eh00Var != null) {
                    eh00Var.invoke();
                    return;
                }
                return;
            case 25:
                gh00 gh00Var = ((map) this.f268118b).f141636f;
                if (gh00Var != null) {
                    gh00Var.invoke(q1m.f184372a);
                    return;
                }
                return;
            case 26:
                gh00 gh00VarM56106xee4913a8 = ((kcp) this.f268118b).m56106xee4913a8();
                if (gh00VarM56106xee4913a8 != null) {
                    gh00VarM56106xee4913a8.invoke(ztq.f286237a);
                    return;
                }
                return;
            case 27:
                ((gh00) ((za7) this.f268118b).f280995d).invoke(tp40.f222427a);
                return;
            case 28:
                ((ppp) ((h3n) this.f268118b).f87273b).invoke(fmc0.f71020a);
                return;
            default:
                xzo xzoVar = (xzo) this.f268118b;
                ci11.m32839a(xzoVar.m92485e());
                xzoVar.m92485e().f33733e.toggle();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y10(ik40 ik40Var, gh00 gh00Var) {
        this.f268117a = 8;
        this.f268118b = (mb61) gh00Var;
    }
}
