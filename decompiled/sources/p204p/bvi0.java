package p204p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.compose.p002ui.platform.ComposeView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class bvi0 implements Connectable, ndc1 {

    /* JADX INFO: renamed from: X */
    public final LinearLayout f31369X;

    /* JADX INFO: renamed from: Y */
    public boolean f31370Y;

    /* JADX INFO: renamed from: Z */
    public final yum0 f31371Z;

    /* JADX INFO: renamed from: a */
    public final View f31372a;

    /* JADX INFO: renamed from: b */
    public final ubq0 f31373b;

    /* JADX INFO: renamed from: c */
    public final C2251pc f31374c;

    /* JADX INFO: renamed from: d */
    public final C2098lp f31375d;

    /* JADX INFO: renamed from: e */
    public final vv91 f31376e;

    /* JADX INFO: renamed from: f */
    public final Context f31377f;

    /* JADX INFO: renamed from: g */
    public final EditText f31378g;

    /* JADX INFO: renamed from: h */
    public final View f31379h;

    /* JADX INFO: renamed from: i */
    public final Button f31380i;

    /* JADX INFO: renamed from: t */
    public final ProgressBar f31381t;

    public bvi0(View view, ubq0 ubq0Var, C2251pc c2251pc, C2098lp c2098lp, vv91 vv91Var) {
        this.f31372a = view;
        this.f31373b = ubq0Var;
        this.f31374c = c2251pc;
        this.f31375d = c2098lp;
        this.f31376e = vv91Var;
        Context context = view.getContext();
        this.f31377f = context;
        this.f31378g = (EditText) view.findViewById(R.id.name);
        this.f31379h = view.findViewById(R.id.anti_transparency_view);
        Button button = (Button) view.findViewById(R.id.name_next_button);
        this.f31380i = button;
        this.f31381t = (ProgressBar) view.findViewById(R.id.progressBar);
        this.f31369X = (LinearLayout) view.findViewById(R.id.layout_acceptance_fields);
        this.f31371Z = sam.m77645B(null);
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(mkr0.f144646T0);
        composeView.setContent(new fyf(new xji0(this, 4), true, -1259502173));
        ((ViewGroup) view).addView(composeView);
        View viewFindViewById = view.findViewById(R.id.name_scroll_view);
        if (viewFindViewById != null) {
            button.addOnLayoutChangeListener(new j96(11, viewFindViewById, this));
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m30642g(bvi0 bvi0Var, mui0 mui0Var, C2251pc c2251pc, LinearLayout linearLayout, Consumer consumer) {
        ArrayList arrayList;
        String str;
        AbstractC2158nb c2121mb;
        AbstractC2158nb c2084lb;
        AbstractC2158nb c2084lb2;
        AbstractC2158nb c2084lb3;
        linearLayout.setVisibility(0);
        Context context = bvi0Var.f31377f;
        AbstractC1808eb abstractC1808eb = mui0Var.f147369d;
        String string = context.getString(R.string.signup_action_create_account);
        c2251pc.getClass();
        String string2 = context.getString(R.string.v2_terms_of_use);
        String string3 = context.getString(R.string.v2_privacy_policy);
        String string4 = context.getString(R.string.v3_terms_and_privacy_title_explicit);
        String string5 = context.getString(R.string.v3_terms_and_privacy_title_implicit, string);
        String string6 = context.getString(R.string.v3_terms_and_conditions_title_explicit);
        String string7 = context.getString(R.string.v3_terms_and_conditions_title_implicit, string);
        String string8 = context.getString(R.string.v3_privacy_policy_title_explicit);
        String string9 = context.getString(R.string.v3_privacy_policy_title_implicit, string);
        String string10 = context.getString(R.string.v3_privacy_policy_title_non, string);
        String string11 = context.getString(R.string.v2_privacy_policy_title_uk);
        i54 i54Var = c2251pc.f175920a.f193860a;
        String string12 = i54Var.m49754p() ? context.getString(R.string.v2_marketing_email_title_opt_out) : context.getString(R.string.v2_marketing_message_title_opt_out);
        wj50.m88279p(string12);
        String string13 = i54Var.m49754p() ? context.getString(R.string.v2_marketing_email_title_opt_in) : context.getString(R.string.v2_marketing_message_title_opt_in);
        wj50.m88279p(string13);
        String string14 = context.getString(R.string.v2_marketing_message_title_canada);
        String string15 = context.getString(R.string.v2_korean_terms_collection);
        String string16 = context.getString(R.string.v2_korean_terms_collection_link);
        String string17 = context.getString(R.string.v2_korean_terms_provisioning);
        String string18 = context.getString(R.string.v2_korean_terms_provisioning_link);
        String string19 = context.getString(R.string.v2_korean_agreements_terms_and_conditions_text);
        String string20 = context.getString(R.string.v2_korean_agreements_privacy_policy_text);
        String string21 = i54Var.m49754p() ? context.getString(R.string.v2_korean_marketing_emails_text) : context.getString(R.string.v2_korean_marketing_messages_text);
        wj50.m88279p(string21);
        String string22 = context.getString(R.string.v2_tailored_ads_title);
        String string23 = context.getString(R.string.v2_tailored_ads_link);
        String string24 = context.getString(R.string.v2_sharing_content_title);
        ArrayList arrayList2 = new ArrayList();
        if (abstractC1808eb instanceof C1735cb) {
            AbstractC1662ac abstractC1662ac = ((C1735cb) abstractC1808eb).f35960a;
            if (abstractC1662ac instanceof C2607yb) {
                c2084lb3 = new C2121mb(string4, new C1931hb(((C2607yb) abstractC1662ac).f271033a, 1), new C1891gb(string2, 1), new C1891gb(string3, 2));
                arrayList = arrayList2;
            } else {
                if (!(abstractC1662ac instanceof C2644zb)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList = arrayList2;
                c2084lb3 = new C2084lb(string5, new C1891gb(string2, 1), new C1891gb(string3, 2), null, false, 24);
            }
            arrayList.add(c2084lb3);
            abstractC1808eb = abstractC1808eb;
        } else {
            string23 = string23;
            arrayList = arrayList2;
            if (!(abstractC1808eb instanceof C1772db)) {
                throw new NoWhenBranchMatchedException();
            }
            C1772db c1772db = (C1772db) abstractC1808eb;
            AbstractC2209oc abstractC2209oc = c1772db.f47162a;
            if (abstractC2209oc instanceof C2085lc) {
                c2121mb = new C2121mb(string6, new C1931hb(((C2085lc) abstractC2209oc).f131782a, 2), new C1891gb(string2, 1), null);
                str = string15;
            } else if (abstractC2209oc instanceof C2122mc) {
                str = string15;
                c2121mb = new C2084lb(string7, new C1891gb(string2, 1), null, null, false, 28);
                c1772db = c1772db;
            } else {
                str = string15;
                if (!(abstractC2209oc instanceof C2159nc)) {
                    throw new NoWhenBranchMatchedException();
                }
                c2121mb = new C2121mb(string19, new C1931hb(((C2159nc) abstractC2209oc).f152381a, 2), new C1891gb(string2, 1), null);
            }
            arrayList.add(c2121mb);
            AbstractC2332rb abstractC2332rb = c1772db.f47166e;
            if (abstractC2332rb instanceof C2287qb) {
                arrayList.add(new C2121mb(str, new C1931hb(((C2287qb) abstractC2332rb).f186954a, 6), new C1891gb(string16, 3), null));
            }
            AbstractC1892gc abstractC1892gc = c1772db.f47163b;
            if (abstractC1892gc instanceof C1699bc) {
                c2084lb = new C2121mb(string8, new C1931hb(((C1699bc) abstractC1892gc).f25692a, 3), new C1891gb(string3, 2), null);
            } else {
                if (abstractC1892gc instanceof C1736cc) {
                    c2084lb2 = new C2084lb(string9, new C1891gb(string3, 2), null, null, false, 28);
                } else if (abstractC1892gc instanceof C1773dc) {
                    c2084lb2 = new C2084lb(string10, new C1891gb(string3, 2), null, null, false, 28);
                } else if (abstractC1892gc instanceof C1855fc) {
                    c2084lb2 = new C2084lb(string11, new C1891gb(string3, 2), null, null, false, 28);
                } else {
                    if (!(abstractC1892gc instanceof C1809ec)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c2084lb = new C2084lb(string20, new C1891gb(string3, 2), null, null, false, 28);
                }
                c2084lb = c2084lb2;
            }
            arrayList.add(c2084lb);
        }
        AbstractC2010jc abstractC2010jcMo32092k = abstractC1808eb.mo32092k();
        if (abstractC2010jcMo32092k instanceof C1974ic) {
            arrayList.add(new C2084lb(string22, new C1891gb(string23, 5), null, new C1931hb(((C1974ic) abstractC1808eb.mo32092k()).f100698a, 8), abstractC1808eb.mo32091j(), 4));
        } else if (!(abstractC2010jcMo32092k instanceof C1932hc)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC2566xb abstractC2566xbMo32090h = abstractC1808eb.mo32090h();
        if (abstractC2566xbMo32090h instanceof C2489vb) {
            arrayList.add(new C2084lb(string12, null, null, new C1931hb(((C2489vb) abstractC1808eb.mo32090h()).f239348a, 4), abstractC1808eb.mo32091j(), 6));
        } else if (abstractC2566xbMo32090h instanceof C2447ub) {
            arrayList.add(new C2084lb(string13, null, null, new C1931hb(((C2447ub) abstractC1808eb.mo32090h()).f228587a, 4), abstractC1808eb.mo32091j(), 6));
        } else if (abstractC2566xbMo32090h instanceof C2370sb) {
            arrayList.add(new C2084lb(string12, null, null, new C1931hb(((C2370sb) abstractC1808eb.mo32090h()).f207299a, 4), abstractC1808eb.mo32091j(), 6));
            arrayList.add(new C2084lb(string14, null, null, null, false, 30));
        } else if (abstractC2566xbMo32090h instanceof C2527wb) {
            arrayList.add(new C2084lb(string21, null, null, new C1931hb(((C2527wb) abstractC1808eb.mo32090h()).f249647a, 4), abstractC1808eb.mo32091j(), 6));
        } else if (!(abstractC2566xbMo32090h instanceof C2407tb)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC2332rb abstractC2332rbMo32089g = abstractC1808eb.mo32089g();
        if (abstractC2332rbMo32089g instanceof C2208ob) {
            arrayList.add(new C2084lb(string24, null, null, new C1931hb(((C2208ob) abstractC1808eb.mo32089g()).f163499a, 5), abstractC1808eb.mo32091j(), 6));
        } else if (abstractC2332rbMo32089g instanceof C2287qb) {
            AbstractC1808eb abstractC1808eb2 = abstractC1808eb;
            arrayList.add(new C2084lb(string17, new C1891gb(string18, 4), null, new C1931hb(((C2287qb) abstractC1808eb2.mo32089g()).f186955b, 7), abstractC1808eb2.mo32091j(), 4));
        } else if (!(abstractC2332rbMo32089g instanceof C2250pb)) {
            throw new NoWhenBranchMatchedException();
        }
        int childCount = linearLayout.getChildCount() - arrayList.size();
        if (childCount > 0) {
            linearLayout.removeViews(arrayList.size(), childCount);
        }
        int size = arrayList.size() - linearLayout.getChildCount();
        for (int i = 0; i < size; i++) {
            quo quoVar = (quo) bvi0Var.f31375d.mo26174a(null);
            quoVar.mo2821c(new sxh0(6, consumer, bvi0Var));
            View view = quoVar.f192746a;
            view.setTag(quoVar);
            linearLayout.addView(view);
        }
        int childCount2 = linearLayout.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            ((quo) linearLayout.getChildAt(i2).getTag()).mo2820d(arrayList.get(i2));
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m30643h(bvi0 bvi0Var, mui0 mui0Var) {
        View view = bvi0Var.f31379h;
        ProgressBar progressBar = bvi0Var.f31381t;
        Button button = bvi0Var.f31380i;
        if (mui0Var.f147367b && progressBar.getVisibility() != 0) {
            progressBar.setVisibility(0);
            button.setVisibility(4);
        } else if (!mui0Var.f147367b && progressBar.getVisibility() == 0) {
            progressBar.setVisibility(8);
            button.setVisibility(0);
        }
        if (mui0Var.f147368c) {
            button.setEnabled(true);
        } else {
            button.setEnabled(mui0Var.f147369d.mo32088c() && (mui0Var.f147366a instanceof kui0));
        }
        if (view != null) {
            if (button.getVisibility() != 0 || button.isEnabled()) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m30644i(bvi0 bvi0Var, lui0 lui0Var) {
        Context context = bvi0Var.f31377f;
        EditText editText = bvi0Var.f31378g;
        if (!(lui0Var instanceof kui0)) {
            Drawable drawable = context.getDrawable(R.drawable.bg_login_text_input_error);
            WeakHashMap weakHashMap = mec1.f142677a;
            editText.setBackground(drawable);
            editText.setTextColor(context.getColor(R.color.red));
            return;
        }
        if (!bvi0Var.f31370Y && editText.getText().toString().length() == 0) {
            bvi0Var.f31370Y = true;
            String str = ((kui0) lui0Var).f126621b;
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = wj50.m88282u(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            editText.setText(str.subSequence(i, length + 1).toString());
        }
        Drawable drawable2 = context.getDrawable(R.drawable.bg_login_text_input);
        WeakHashMap weakHashMap2 = mec1.f142677a;
        editText.setBackground(drawable2);
        editText.setTextColor(context.getColor(R.color.login_text_input_text));
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        t2u t2uVar = new t2u(consumer, this);
        this.f31378g.addTextChangedListener(t2uVar);
        this.f31380i.setOnClickListener(new kl9(consumer, 11));
        return new avi0(this, consumer, t2uVar);
    }

    @Override // p204p.ndc1
    /* JADX INFO: renamed from: b */
    public final String mo28657b() {
        return this.f31372a.getContext().getString(R.string.signup_title_name);
    }

    @Override // p204p.ndc1
    /* JADX INFO: renamed from: c */
    public final void mo28658c() {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        ((sfa0) this.f31376e).m78000H(xgg1.m90662N1("SIGNUP_DISPLAYNAME", "signup/displayname", 1829, "signup"));
    }

    @Override // p204p.ndc1
    /* JADX INFO: renamed from: a */
    public final void mo28656a() {
    }
}
