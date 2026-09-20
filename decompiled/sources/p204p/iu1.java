package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.comscore.streaming.ContentType;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.encoreconsumermobile.elements.quickactions.QuickActionView;
import com.spotify.encoreconsumermobile.elements.thumb.ThumbButtonView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.icons.IconExclamationCircle;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class iu1 implements owt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f105811a;

    /* JADX INFO: renamed from: b */
    public final Object f105812b;

    public iu1(Context context, iv0 iv0Var) {
        this.f105811a = 5;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.flavor_page_error_state_layout, (ViewGroup) null, false);
        TextView textView = (TextView) vie1.m85629k(viewInflate, R.id.error_state_text);
        if (textView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.error_state_text)));
        }
        textView.setText((String) iv0Var.f106058d);
        this.f105812b = (ConstraintLayout) viewInflate;
    }

    @Override // p204p.owt
    /* JADX INFO: renamed from: a */
    public final void mo26764a(Object obj, ext extVar) {
        iut0 dut0Var;
        String str;
        CharSequence spannedString;
        psj psjVar;
        switch (this.f105811a) {
            case 0:
                return;
            case 1:
                m33 m33Var = (m33) obj;
                ((PlayButtonView) this.f105812b).mo2820d(new jeo0(m33Var instanceof l33, new ggo0(false, m33Var instanceof i33), null, 4));
                return;
            case 2:
                ((ovf) ((a3k) this.f105812b).f11979i).mo2820d((l2k) obj);
                return;
            case 3:
                o5m o5mVar = (o5m) obj;
                QuickActionView quickActionView = (QuickActionView) this.f105812b;
                boolean z = o5mVar instanceof k5m;
                gut0 gut0Var = gut0.f84543a;
                if (z) {
                    dut0Var = new dut0(new pi1(qi1.f188893b, false, null, null, null, 30));
                } else if (o5mVar instanceof m5m) {
                    dut0Var = fut0.f73568a;
                } else {
                    if (!(o5mVar instanceof l5m) && !wj50.m88271j(o5mVar, n5m.f150583a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dut0Var = gut0Var;
                }
                quickActionView.mo2820d(dut0Var);
                quickActionView.setVisibility(!dut0Var.equals(gut0Var) ? 0 : 8);
                return;
            case 4:
                ((ovf) ((h2v) this.f105812b).f87060L0).mo2820d((l2k) obj);
                return;
            case 5:
                return;
            case 6:
                return;
            case 7:
                return;
            case 8:
                ifj0 ifj0Var = (ifj0) obj;
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ((wup) ((izh) this.f105812b).f107230i).f255245b;
                o221 o221Var = ifj0Var.f101774b;
                appCompatImageButton.setVisibility((!o221Var.f160925c || o221Var.f160924b || (o221Var.f160926d && ifj0Var.f101775c.f269417a)) ? 8 : 0);
                return;
            case 9:
                return;
            case 10:
                return;
            case 11:
                ztq0 ztq0Var = (ztq0) obj;
                ((zoh) this.f105812b).mo2820d(new csq0(ztq0Var.f286244g, ztq0Var.f286238a, ztq0Var.f286239b, ztq0Var.f286240c, ztq0Var.f286241d, ztq0Var.f286242e, ztq0Var.f286243f, ztq0Var.f286246i ? 1 : 2));
                return;
            case 12:
                ri71 ri71Var = (ri71) obj;
                ThumbButtonView thumbButtonView = (ThumbButtonView) this.f105812b;
                if (!ri71Var.f199451b) {
                    thumbButtonView.setVisibility(4);
                    return;
                }
                thumbButtonView.setVisibility(0);
                thumbButtonView.f3770d = ri71Var.f199450a;
                thumbButtonView.m9664b();
                return;
            case 13:
                ch81 ch81Var = (ch81) obj;
                pg81 pg81Var = (pg81) this.f105812b;
                pg81Var.getClass();
                bh81 bh81Var = ch81Var.f37960a;
                TextView textView = pg81Var.f177253b;
                yg81 yg81Var = ch81Var.f37961b;
                boolean z2 = yg81Var instanceof xg81;
                textView.setVisibility(z2 ? 0 : 8);
                pg81Var.f177254c.setVisibility((z2 && ((xg81) yg81Var).f261240a) ? 0 : 8);
                boolean z3 = yg81Var instanceof wg81;
                pg81Var.f177255d.setVisibility(z3 ? 0 : 8);
                if (z2) {
                    str = ((xg81) yg81Var).f261241b;
                } else {
                    if (!z3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "";
                }
                textView.setText(str);
                TextView textView2 = pg81Var.f177252a;
                if (bh81Var instanceof zg81) {
                    Context context = pg81Var.getContext();
                    zg81 zg81Var = (zg81) bh81Var;
                    String str2 = zg81Var.f282549b;
                    String str3 = zg81Var.f282550c;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(context, R.style.TextAppearance_TrackViewConnect_Title);
                    TextAppearanceSpan textAppearanceSpan2 = new TextAppearanceSpan(context, R.style.TextAppearance_TrackViewConnect_Title_Light);
                    if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) str3);
                        spannableStringBuilder.append((CharSequence) " • ");
                        spannableStringBuilder.setSpan(textAppearanceSpan2, length, spannableStringBuilder.length(), 17);
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) str2);
                        spannableStringBuilder.setSpan(textAppearanceSpan, length2, spannableStringBuilder.length(), 17);
                    } else {
                        int length3 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) str2);
                        spannableStringBuilder.setSpan(textAppearanceSpan, length3, spannableStringBuilder.length(), 17);
                        int length4 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) " • ");
                        spannableStringBuilder.append((CharSequence) str3);
                        spannableStringBuilder.setSpan(textAppearanceSpan2, length4, spannableStringBuilder.length(), 17);
                    }
                    spannedString = new SpannedString(spannableStringBuilder);
                } else {
                    if (!(bh81Var instanceof ah81)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    spannedString = ((ah81) bh81Var).f15641b;
                }
                textView2.setText(spannedString);
                return;
            default:
                z1c1 z1c1Var = (z1c1) obj;
                List list = z1c1Var.f278284c;
                boolean z4 = z1c1Var.f278283b;
                v1p0 v1p0Var = z1c1Var.f278286e;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                Iterator it = list.iterator();
                while (true) {
                    int i = 2;
                    if (!it.hasNext()) {
                        hxt hxtVar = (hxt) this.f105812b;
                        int iM38547C = edb.m38547C(z1c1Var.f278282a);
                        if (iM38547C == 0) {
                            i = 1;
                        } else if (iM38547C != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hxtVar.m49046g(new yob1(z1c1Var.f278285d, i, arrayList));
                        return;
                    }
                    j2c1 j2c1Var = (j2c1) it.next();
                    int iM38547C2 = edb.m38547C(j2c1Var.f108008j);
                    if (iM38547C2 == 0) {
                        psjVar = psj.f180873a;
                    } else if (iM38547C2 == 1) {
                        psjVar = psj.f180874b;
                    } else {
                        if (iM38547C2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        psjVar = psj.f180875c;
                    }
                    arrayList.add(new xob1(!z4, j2c1Var.f108002d, j2c1Var.f107999a, j2c1Var.f108000b, j2c1Var.f108003e, j2c1Var.f108005g, j2c1Var.f108006h, j2c1Var.f108004f, 1, j2c1Var.f108007i, psjVar, v1p0Var.m84484a(psjVar)));
                    z4 = z4;
                    it = it;
                }
                break;
        }
    }

    @Override // p204p.owt
    public final View getView() {
        switch (this.f105811a) {
            case 0:
                return (EncoreButton) this.f105812b;
            case 1:
                return (PlayButtonView) this.f105812b;
            case 2:
                return ((ovf) ((a3k) this.f105812b).f11979i).getView();
            case 3:
                return (QuickActionView) this.f105812b;
            case 4:
                return ((ovf) ((h2v) this.f105812b).f87060L0).getView();
            case 5:
                return (ConstraintLayout) this.f105812b;
            case 6:
                return (LinearLayout) this.f105812b;
            case 7:
                return (View) ((wg61) this.f105812b).getValue();
            case 8:
                return (AppCompatImageButton) ((wup) ((izh) this.f105812b).f107230i).f255245b;
            case 9:
                Context context = (Context) this.f105812b;
                TextView textView = new TextView(context);
                textView.setText(context.getResources().getString(R.string.empty_component_text));
                textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return textView;
            case 10:
                return ((rte) this.f105812b).f202572b;
            case 11:
                return ((zoh) this.f105812b).f284793d;
            case 12:
                return (ThumbButtonView) this.f105812b;
            case 13:
                return (pg81) this.f105812b;
            default:
                return ((hxt) this.f105812b).f96307t;
        }
    }

    public iu1(Context context, ViewGroup viewGroup, p2c1 p2c1Var, gh00 gh00Var) {
        lq0 lq0Var;
        this.f105811a = 14;
        up60 up60Var = hxt.f96286w;
        jgn jgnVar = p2c1Var.f173321a;
        pn61 pn61Var = new pn61(gh00Var);
        voc1 voc1Var = p2c1Var.f173322b;
        switch (jgnVar.f112222a) {
            case 0:
                wfn wfnVar = (wfn) jgnVar.f112223b;
                ghn ghnVar = (ghn) ((hhn) wfnVar.f250876e).f91490c1.get();
                son sonVar = wfnVar.f250873b;
                lq0Var = new lq0(ghnVar, (ra9) sonVar.f212012d9.get(), (l89) sonVar.f211821Wd.get(), (ab9) sonVar.f212039e9.get(), pn61Var, voc1Var);
                break;
            default:
                pwn pwnVar = (pwn) jgnVar.f112223b;
                ghn ghnVar2 = (ghn) pwnVar.f182076c.f169633b.f171176T.get();
                son sonVar2 = pwnVar.f182075b;
                lq0Var = new lq0(ghnVar2, (ra9) sonVar2.f212012d9.get(), (l89) sonVar2.f211821Wd.get(), (ab9) sonVar2.f212039e9.get(), pn61Var, voc1Var);
                break;
        }
        this.f105812b = ia7.m50021n(context, viewGroup, lq0Var, null, 24);
    }

    public iu1(Context context, ViewGroup viewGroup, gh00 gh00Var) {
        this.f105811a = 6;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.creative_work_footer_layout, viewGroup, false);
        int i = R.id.footer_body;
        if (((TextView) vie1.m85629k(viewInflate, R.id.footer_body)) != null) {
            i = R.id.footer_button;
            Button button = (Button) vie1.m85629k(viewInflate, R.id.footer_button);
            if (button != null) {
                button.setOnClickListener(new gos(4, gh00Var));
                this.f105812b = (LinearLayout) viewInflate;
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public iu1(au4 au4Var, ViewGroup viewGroup) {
        this.f105811a = 10;
        View viewInflate = LayoutInflater.from(au4Var.f19833a).inflate(R.layout.pdp_error_element_layout, viewGroup, false);
        int i = R.id.error_description;
        if (((EncoreTextView) vie1.m85629k(viewInflate, R.id.error_description)) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            int i2 = R.id.error_icon;
            if (((IconExclamationCircle) vie1.m85629k(viewInflate, R.id.error_icon)) != null) {
                i2 = R.id.error_title;
                if (((EncoreTextView) vie1.m85629k(viewInflate, R.id.error_title)) != null) {
                    this.f105812b = new rte(constraintLayout, 2);
                    return;
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public iu1(Context context, int i) {
        this.f105811a = i;
        switch (i) {
            case 9:
                this.f105812b = context;
                break;
            default:
                this.f105812b = new wg61(new nf60(context, 10));
                break;
        }
    }

    public iu1(Context context, gh00 gh00Var, int i) {
        this.f105811a = i;
        switch (i) {
            case 1:
                PlayButtonView playButtonView = new PlayButtonView(context, null, 0, 6, null);
                playButtonView.mo2821c(new t52(12, gh00Var));
                this.f105812b = playButtonView;
                break;
            case 2:
            default:
                EncoreButton encoreButton = new EncoreButton(context, null, R.attr.encoreButtonSecondarySmall, null, 8, null);
                encoreButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                encoreButton.setBackgroundTintList(ColorStateList.valueOf(vtg1.m86386m(encoreButton.getContext(), R.attr.overMediaBackgroundBase, -16777216)));
                encoreButton.setStrokeWidth(0);
                encoreButton.setIconResource(R.drawable.encore_icon_add_to_queue);
                encoreButton.setIconGravity(2);
                encoreButton.setText(context.getResources().getString(R.string.title_add_to_queue_button));
                encoreButton.setOnClickListener(new vk0(4, gh00Var));
                this.f105812b = encoreButton;
                break;
            case 3:
                QuickActionView quickActionView = new QuickActionView(context, null, 0, 6, null);
                quickActionView.f3724a = new jpj(10, gh00Var);
                this.f105812b = quickActionView;
                break;
        }
    }

    public iu1(a3k a3kVar, gh00 gh00Var) {
        this.f105811a = 2;
        this.f105812b = a3kVar;
        ((ovf) a3kVar.f11979i).mo2821c(new jpj(4, gh00Var));
    }

    public iu1(izh izhVar, gh00 gh00Var) {
        this.f105811a = 8;
        this.f105812b = izhVar;
        ((wup) izhVar.f107230i).mo2821c(new asi0(1, gh00Var));
    }

    public iu1(Context context, iv0 iv0Var, byte b) {
        this.f105811a = 13;
        pg81 pg81Var = new pg81(context);
        rxt rxtVarM87517y = w9h1.m87517y((l6p) iv0Var.f106058d, null, null, 3);
        ViewGroup viewGroup = (ViewGroup) pg81Var.f177255d.getParent();
        wri wriVar = new wri(16, 12, 839, false);
        up60 up60Var = hxt.f96286w;
        View view = ia7.m50020m(viewGroup.getContext(), viewGroup, rxtVarM87517y, wriVar, null, ContentType.LONG_FORM_ON_DEMAND).f96307t;
        psg1.m70832H(pg81Var.f177255d, view);
        pg81Var.f177255d = view;
        this.f105812b = pg81Var;
    }

    public iu1(h2v h2vVar, gh00 gh00Var) {
        this.f105811a = 4;
        this.f105812b = h2vVar;
        ((ovf) h2vVar.f87060L0).mo2821c(new r7t(10, gh00Var));
    }

    public iu1(h2v h2vVar, Context context, gh00 gh00Var) {
        ThumbButtonView thumbButtonView;
        this.f105811a = 12;
        if (h2vVar.f87069d) {
            int i = ThumbButtonView.f3769i;
            thumbButtonView = (ThumbButtonView) View.inflate(context, R.layout.thumb_button_up_layout, null);
        } else {
            int i2 = ThumbButtonView.f3769i;
            thumbButtonView = (ThumbButtonView) View.inflate(context, R.layout.thumb_button_down_layout, null);
        }
        thumbButtonView.setDrawableSize(context.getResources().getDimensionPixelSize(R.dimen.encore_action_button_icon_size));
        thumbButtonView.setActiveColor(R.color.encore_accessory_green);
        thumbButtonView.mo2821c(new zd61(14, thumbButtonView, gh00Var));
        this.f105812b = thumbButtonView;
    }

    public iu1(cuq0 cuq0Var, gh00 gh00Var) {
        this.f105811a = 11;
        g2q g2qVar = cuq0Var.f42188b.f60294b;
        zoh zohVar = new zoh((Context) g2qVar.f75987b, new fyf(new a5s(g2qVar, 11), true, -1127883291));
        this.f105812b = zohVar;
        zohVar.mo2821c(new b8o0(21, gh00Var));
    }
}
