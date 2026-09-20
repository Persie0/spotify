package p204p;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;
import com.spotify.nowplayingmini.uicomponents.trackinfo.TrackInfoView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class g1p implements ovf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f75673a;

    /* JADX INFO: renamed from: b */
    public final Object f75674b;

    public g1p(Context context, int i) {
        this.f75673a = i;
        switch (i) {
            case 1:
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.livestream_description_row, (ViewGroup) null, false);
                if (viewInflate == null) {
                    throw new NullPointerException("rootView");
                }
                this.f75674b = (EncoreTextView) viewInflate;
                return;
            case 2:
            default:
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.cmp_inline_card_container, (ViewGroup) null, false);
                if (viewInflate2 == null) {
                    throw new NullPointerException("rootView");
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate2;
                rte rteVar = new rte(constraintLayout, 0);
                nap.m64024q(-1, -2, constraintLayout);
                this.f75674b = rteVar;
                return;
            case 3:
                View viewInflate3 = LayoutInflater.from(context).inflate(R.layout.no_results_banner_search_layout, (ViewGroup) null, false);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate3;
                int i2 = R.id.subtitle;
                TextView textView = (TextView) vie1.m85629k(viewInflate3, R.id.subtitle);
                if (textView != null) {
                    i2 = R.id.title;
                    TextView textView2 = (TextView) vie1.m85629k(viewInflate3, R.id.title);
                    if (textView2 != null) {
                        pmj0 pmj0Var = new pmj0(constraintLayout2, textView, textView2, 0);
                        nap.m64024q(-1, -1, constraintLayout2);
                        this.f75674b = pmj0Var;
                        return;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i2)));
            case 4:
                View viewInflate4 = LayoutInflater.from(context).inflate(R.layout.premiumbenefitslist_card_layout, (ViewGroup) null, false);
                int i3 = R.id.linear_layout_wrapper;
                if (((LinearLayout) vie1.m85629k(viewInflate4, R.id.linear_layout_wrapper)) != null) {
                    i3 = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) vie1.m85629k(viewInflate4, R.id.recycler_view);
                    if (recyclerView != null) {
                        i3 = R.id.title;
                        TextView textView3 = (TextView) vie1.m85629k(viewInflate4, R.id.title);
                        if (textView3 != null) {
                            CardView cardView = (CardView) viewInflate4;
                            hun0 hun0Var = new hun0(cardView, recyclerView, textView3, 19);
                            cardView.setLayoutParams(new h6j(-1, -2));
                            this.f75674b = hun0Var;
                            return;
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i3)));
            case 5:
                View viewInflate5 = LayoutInflater.from(context).inflate(R.layout.premium_offer_legal_text_row_layout, (ViewGroup) null, false);
                ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate5;
                TextView textView4 = (TextView) vie1.m85629k(viewInflate5, R.id.text);
                if (textView4 == null) {
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate5.getResources().getResourceName(R.id.text)));
                }
                xmq0 xmq0Var = new xmq0(constraintLayout3, constraintLayout3, textView4);
                constraintLayout3.setLayoutParams(new h6j(-1, -2));
                this.f75674b = xmq0Var;
                return;
            case 6:
                View viewInflate6 = LayoutInflater.from(context).inflate(R.layout.premiumsectionheader_card_layout, (ViewGroup) null, false);
                int i4 = R.id.subtitle;
                TextView textView5 = (TextView) vie1.m85629k(viewInflate6, R.id.subtitle);
                if (textView5 != null) {
                    i4 = R.id.title;
                    TextView textView6 = (TextView) vie1.m85629k(viewInflate6, R.id.title);
                    if (textView6 != null) {
                        ConstraintLayout constraintLayout4 = (ConstraintLayout) viewInflate6;
                        pmj0 pmj0Var2 = new pmj0(constraintLayout4, textView5, textView6, 1);
                        constraintLayout4.setLayoutParams(new h6j(-1, -2));
                        this.f75674b = pmj0Var2;
                        return;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate6.getResources().getResourceName(i4)));
            case 7:
                View viewInflate7 = LayoutInflater.from(context).inflate(R.layout.library_section_heading_layout, (ViewGroup) null, false);
                TextView textView7 = (TextView) vie1.m85629k(viewInflate7, R.id.title);
                if (textView7 == null) {
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate7.getResources().getResourceName(R.id.title)));
                }
                ConstraintLayout constraintLayout5 = (ConstraintLayout) viewInflate7;
                xh70 xh70Var = new xh70(4, constraintLayout5, textView7);
                nap.m64024q(-1, -2, constraintLayout5);
                mec1.m61564p(textView7, xn20.f263496d);
                this.f75674b = xh70Var;
                return;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m43364a(hjq0 hjq0Var) {
        ArrayList arrayList = hjq0Var.f92220b;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!"CHECK".equalsIgnoreCase(((ijq0) it.next()).f102867b)) {
                return false;
            }
        }
        return true;
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        switch (this.f75673a) {
            case 0:
                break;
            case 1:
                js90 js90Var = (js90) obj;
                EncoreTextView encoreTextView = (EncoreTextView) this.f75674b;
                String str = js90Var.f115450a;
                String str2 = js90Var.f115451b;
                int iM88458H0 = wl51.m88458H0(str, str2, 0, false, 6);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(js90Var.f115450a);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(vtg1.m86386m(encoreTextView.getContext(), R.attr.baseTextBase, encoreTextView.getContext().getColor(R.color.dark_base_text_base))), iM88458H0, str2.length() + iM88458H0, 0);
                encoreTextView.setText(spannableStringBuilder);
                break;
            case 2:
                nt90 nt90Var = (nt90) obj;
                w0n w0nVar = (w0n) this.f75674b;
                ((TextView) w0nVar.f246762Q0).setText(nt90Var.f158019a);
                ((TextView) w0nVar.f246762Q0).setTextColor(((ConstraintLayout) w0nVar.f246767a).getContext().getColor(R.color.encore_row_subtitle));
                ((TextView) w0nVar.f246761P0).setVisibility(8);
                ((ArtworkView) w0nVar.f246770d).mo2820d(new x66(new h66(nt90Var.f158020b)));
                break;
            case 3:
                omj0 omj0Var = (omj0) obj;
                pmj0 pmj0Var = (pmj0) this.f75674b;
                pmj0Var.f179087d.setText(omj0Var.f167045a);
                pmj0Var.f179086c.setText(omj0Var.f167046b);
                break;
            case 4:
                hjq0 hjq0Var = (hjq0) obj;
                hun0 hun0Var = (hun0) this.f75674b;
                CardView cardView = (CardView) hun0Var.f95431b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cardView.getLayoutParams();
                DisplayMetrics displayMetrics = cardView.getContext().getResources().getDisplayMetrics();
                wj50.m88279p(displayMetrics);
                int iApplyDimension = (int) TypedValue.applyDimension(1, 16, displayMetrics);
                int iApplyDimension2 = (int) TypedValue.applyDimension(1, 12, displayMetrics);
                marginLayoutParams.setMargins(iApplyDimension, iApplyDimension2, iApplyDimension, iApplyDimension2);
                cardView.setLayoutParams(marginLayoutParams);
                ((TextView) hun0Var.f95433d).setText(hjq0Var.f92219a);
                RecyclerView recyclerView = (RecyclerView) hun0Var.f95432c;
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                if (!m43364a(hjq0Var)) {
                    boolean z = tw41.f224312b;
                    tw41.f224312b = true;
                    if (!z) {
                        recyclerView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(recyclerView.getContext(), R.anim.animation_layout));
                    }
                }
                recyclerView.setAdapter(new gjq0(m43364a(hjq0Var) ? 1 : 2, hjq0Var.f92220b));
                break;
            case 5:
                wmq0 wmq0Var = (wmq0) obj;
                xmq0 xmq0Var = (xmq0) this.f75674b;
                wmq0Var.getClass();
                ConstraintLayout constraintLayout = xmq0Var.f263429c;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) constraintLayout.getLayoutParams();
                DisplayMetrics displayMetrics2 = constraintLayout.getContext().getResources().getDisplayMetrics();
                wj50.m88279p(displayMetrics2);
                int iApplyDimension3 = (int) TypedValue.applyDimension(1, 16, displayMetrics2);
                int iApplyDimension4 = (int) TypedValue.applyDimension(1, 12, displayMetrics2);
                marginLayoutParams2.setMargins(iApplyDimension3, iApplyDimension4, iApplyDimension3, iApplyDimension4);
                constraintLayout.setLayoutParams(marginLayoutParams2);
                if (wmq0Var.f252964c == 2) {
                    xmq0Var.f263430d.setGravity(8388611);
                }
                String str3 = wmq0Var.f252962a;
                if (str3 == null || str3.length() == 0) {
                    xmq0Var.f263430d.setText("");
                } else {
                    TextView textView = xmq0Var.f263430d;
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    textView.setText((Spannable) Html.fromHtml(str3, 0));
                    int color = Color.parseColor(wmq0Var.f252963b);
                    textView.setTextColor(Color.argb((int) (((double) Color.alpha(color)) * 0.7d), Color.red(color), Color.green(color), Color.blue(color)));
                }
                break;
            case 6:
                dqq0 dqq0Var = (dqq0) obj;
                pmj0 pmj0Var2 = (pmj0) this.f75674b;
                pmj0Var2.f179087d.setText(dqq0Var.f52064a);
                TextView textView2 = pmj0Var2.f179086c;
                String str4 = dqq0Var.f52065b;
                textView2.setVisibility((str4 == null || str4.length() == 0) ? 8 : 0);
                textView2.setText(str4);
                break;
            case 7:
                ((TextView) ((xh70) this.f75674b).f261461c).setText(((f8z0) obj).f67128a);
                break;
            default:
                ((TrackInfoView) this.f75674b).m16005x((dg81) obj);
                break;
        }
    }

    @Override // p204p.clc1
    public final View getView() {
        switch (this.f75673a) {
            case 0:
                return ((rte) this.f75674b).f202572b;
            case 1:
                return (EncoreTextView) this.f75674b;
            case 2:
                return (ConstraintLayout) ((w0n) this.f75674b).f246767a;
            case 3:
                return ((pmj0) this.f75674b).f179085b;
            case 4:
                return (CardView) ((hun0) this.f75674b).f95431b;
            case 5:
                return ((xmq0) this.f75674b).f263429c;
            case 6:
                return ((pmj0) this.f75674b).f179085b;
            case 7:
                return (ConstraintLayout) ((xh70) this.f75674b).f261460b;
            default:
                return (TrackInfoView) this.f75674b;
        }
    }

    public g1p(Context context, e940 e940Var) {
        this.f75673a = 2;
        w0n w0nVarM86954c = w0n.m86954c(LayoutInflater.from(context));
        xhf1.m90981m(w0nVarM86954c, e940Var);
        this.f75674b = w0nVarM86954c;
    }

    public g1p(TrackInfoView trackInfoView) {
        this.f75673a = 8;
        this.f75674b = trackInfoView;
    }
}
