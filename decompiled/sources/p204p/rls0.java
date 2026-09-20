package p204p;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.spotify.encoremobile.component.icons.IconCheck;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class rls0 extends go80 {

    /* JADX INFO: renamed from: g */
    public static final ia5 f200361g = new ia5(26);

    /* JADX INFO: renamed from: h */
    public static final rs61 f200362h = new rs61(1);

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f200363e = 5;

    /* JADX INFO: renamed from: f */
    public Object f200364f;

    public rls0(oxo oxoVar) {
        super(f200362h);
        this.f200364f = oxoVar;
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: g */
    public int mo28437g(int i) {
        switch (this.f200363e) {
            case 0:
                ove0 ove0Var = (ove0) m45324A(i);
                if (ove0Var instanceof jve0) {
                    return R.layout.message_agent_view_holder;
                }
                if (ove0Var instanceof nve0) {
                    return R.layout.message_user_view_holder;
                }
                if (ove0Var instanceof lve0) {
                    return R.layout.message_system_bubble_view_holder;
                }
                if (ove0Var instanceof mve0) {
                    return R.layout.message_system_text_view_holder;
                }
                if (ove0Var instanceof kve0) {
                    return R.layout.message_injected_agent_view_holder;
                }
                throw new NoWhenBranchMatchedException();
            case 5:
                kp20 kp20Var = (kp20) m45324A(i);
                if (kp20Var instanceof hy31) {
                    return 0;
                }
                if (kp20Var instanceof cp3) {
                    return 1;
                }
                throw new NoWhenBranchMatchedException();
            default:
                return super.mo28437g(i);
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) throws Throwable {
        switch (this.f200363e) {
            case 0:
                axe0 axe0Var = (axe0) dkv0Var;
                ove0 ove0Var = (ove0) m45324A(i);
                if (ove0Var instanceof jve0) {
                    vwe0 vwe0Var = (vwe0) axe0Var;
                    jve0 jve0Var = (jve0) ove0Var;
                    String str = jve0Var.f116338b;
                    d5a0 d5a0Var = vwe0Var.f245483S0;
                    ((EncoreTextView) d5a0Var.f45382d).setText(Html.fromHtml(str, 0), TextView.BufferType.SPANNABLE);
                    ((EncoreTextView) d5a0Var.f45382d).setMovementMethod(LinkMovementMethod.getInstance());
                    ((ProgressBar) vwe0Var.f245483S0.f45381c).setVisibility(jve0Var.mo54381d() == 2 ? 0 : 8);
                    vwe0Var.m86562D(jve0Var);
                    return;
                }
                if (ove0Var instanceof nve0) {
                    zwe0 zwe0Var = (zwe0) axe0Var;
                    nve0 nve0Var = (nve0) ove0Var;
                    ((EncoreTextView) zwe0Var.f286972S0.f133741c).setText(nve0Var.f158878b);
                    zwe0Var.m97116D(nve0Var);
                    return;
                }
                if (ove0Var instanceof lve0) {
                    ((TextView) ((xwe0) axe0Var).f266675S0.f245442c).setText(((lve0) ove0Var).f137300c);
                    return;
                } else if (ove0Var instanceof mve0) {
                    ((TextView) ((ywe0) axe0Var).f276953S0.f99466c).setText(((mve0) ove0Var).f147568c);
                    return;
                } else {
                    if (!(ove0Var instanceof kve0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((EncoreTextView) ((wwe0) axe0Var).f255759S0.f29722c).setText(((kve0) ove0Var).f126851b);
                    return;
                }
            case 1:
                ((dc71) dkv0Var).f47447S0.f275401c.setText(((ma71) m45324A(i)).f141497a);
                return;
            case 2:
                oa81 oa81Var = ((nwk) dkv0Var).f159227S0;
                dxk dxkVar = (dxk) m45324A(i);
                ((ConstraintLayout) oa81Var.f163265b).setOnClickListener(new ViewOnClickListenerC1708bk(26, this, dxkVar));
                ((TextView) oa81Var.f163267d).setText(dxkVar.f53999a.f147803b);
                ((IconCheck) oa81Var.f163266c).setVisibility(dxkVar.f54000b ? 0 : 8);
                return;
            case 3:
                ((jmu) dkv0Var).f113947S0.mo2820d((nt90) m45324A(i));
                return;
            case 4:
                ((e9z) dkv0Var).f57554S0.m69549c((f9w) this.f82904d.f39905f.get(i));
                return;
            default:
                kp20 kp20Var = (kp20) m45324A(i);
                if (kp20Var instanceof hy31) {
                    hy31 hy31Var = (hy31) kp20Var;
                    p200 p200Var = new p200(17, this, hy31Var);
                    pmj0 pmj0Var = ((mp20) dkv0Var).f145838S0;
                    pmj0Var.f179087d.setText(hy31Var.f96454c);
                    pmj0Var.f179086c.setText(hy31Var.f96453b);
                    pmj0Var.f179085b.setOnClickListener(new ryp(p200Var, 16));
                    return;
                }
                if (!(kp20Var instanceof cp3)) {
                    throw new NoWhenBranchMatchedException();
                }
                cp3 cp3Var = (cp3) kp20Var;
                p200 p200Var2 = new p200(18, this, cp3Var);
                pmj0 pmj0Var2 = ((lp20) dkv0Var).f135606S0;
                pmj0Var2.f179087d.setText(cp3Var.f40414b);
                pmj0Var2.f179086c.setText(cp3Var.f40415c);
                pmj0Var2.f179085b.setOnClickListener(new ryp(p200Var2, 15));
                return;
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: o */
    public void mo47717o(dkv0 dkv0Var, int i, List list) throws Throwable {
        switch (this.f200363e) {
            case 0:
                axe0 axe0Var = (axe0) dkv0Var;
                Object objM43745s0 = g6f.m43745s0(list);
                if (objM43745s0 != null) {
                    hls0 hls0Var = objM43745s0 instanceof hls0 ? (hls0) objM43745s0 : null;
                    if (hls0Var != null) {
                        ArrayList arrayList = hls0Var.f92733a;
                        boolean z = axe0Var instanceof vwe0;
                        lls0 lls0Var = lls0.f134695a;
                        jls0 jls0Var = jls0.f113674a;
                        if (z) {
                            vwe0 vwe0Var = (vwe0) axe0Var;
                            d5a0 d5a0Var = vwe0Var.f245483S0;
                            jve0 jve0Var = (jve0) m45324A(i);
                            ArrayList<ils0> arrayList2 = new ArrayList();
                            for (Object obj : arrayList) {
                                if (obj instanceof ils0) {
                                    arrayList2.add(obj);
                                }
                            }
                            for (ils0 ils0Var : arrayList2) {
                                if (wj50.m88271j(ils0Var, jls0Var)) {
                                    ((EncoreTextView) d5a0Var.f45382d).setText(Html.fromHtml(jve0Var.f116338b, 0), TextView.BufferType.SPANNABLE);
                                    ((EncoreTextView) d5a0Var.f45382d).setMovementMethod(LinkMovementMethod.getInstance());
                                } else if (wj50.m88271j(ils0Var, kls0.f123949a)) {
                                    ((ProgressBar) d5a0Var.f45381c).setVisibility(jve0Var.mo54381d() == 2 ? 0 : 8);
                                } else {
                                    if (!wj50.m88271j(ils0Var, lls0Var)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    vwe0Var.m86562D(jve0Var);
                                }
                            }
                            return;
                        }
                        if (axe0Var instanceof zwe0) {
                            zwe0 zwe0Var = (zwe0) axe0Var;
                            nve0 nve0Var = (nve0) m45324A(i);
                            ArrayList<mls0> arrayList3 = new ArrayList();
                            for (Object obj2 : arrayList) {
                                if (obj2 instanceof mls0) {
                                    arrayList3.add(obj2);
                                }
                            }
                            for (mls0 mls0Var : arrayList3) {
                                if (wj50.m88271j(mls0Var, jls0Var)) {
                                    ((EncoreTextView) zwe0Var.f286972S0.f133741c).setText(nve0Var.f158878b);
                                } else {
                                    if (!wj50.m88271j(mls0Var, lls0Var)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    zwe0Var.m97116D(nve0Var);
                                }
                            }
                            return;
                        }
                        if (axe0Var instanceof xwe0) {
                            xwe0 xwe0Var = (xwe0) axe0Var;
                            lve0 lve0Var = (lve0) m45324A(i);
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj3 : arrayList) {
                                if (obj3 instanceof jls0) {
                                    arrayList4.add(obj3);
                                }
                            }
                            Iterator it = arrayList4.iterator();
                            while (it.hasNext()) {
                                if (!wj50.m88271j((jls0) it.next(), jls0Var)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ((TextView) xwe0Var.f266675S0.f245442c).setText(lve0Var.f137300c);
                            }
                            return;
                        }
                        if (axe0Var instanceof ywe0) {
                            ywe0 ywe0Var = (ywe0) axe0Var;
                            mve0 mve0Var = (mve0) m45324A(i);
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj4 : arrayList) {
                                if (obj4 instanceof jls0) {
                                    arrayList5.add(obj4);
                                }
                            }
                            Iterator it2 = arrayList5.iterator();
                            while (it2.hasNext()) {
                                if (!wj50.m88271j((jls0) it2.next(), jls0Var)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ((TextView) ywe0Var.f276953S0.f99466c).setText(mve0Var.f147568c);
                            }
                            return;
                        }
                        if (!(axe0Var instanceof wwe0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        wwe0 wwe0Var = (wwe0) axe0Var;
                        kve0 kve0Var = (kve0) m45324A(i);
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj5 : arrayList) {
                            if (obj5 instanceof jls0) {
                                arrayList6.add(obj5);
                            }
                        }
                        Iterator it3 = arrayList6.iterator();
                        while (it3.hasNext()) {
                            if (!wj50.m88271j((jls0) it3.next(), jls0Var)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ((EncoreTextView) wwe0Var.f255759S0.f29722c).setText(kve0Var.f126851b);
                        }
                        return;
                    }
                }
                mo1619n(i, axe0Var);
                return;
            default:
                super.mo47717o(dkv0Var, i, list);
                return;
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        dkv0 wwe0Var;
        switch (this.f200363e) {
            case 0:
                p0r0 p0r0Var = (p0r0) this.f200364f;
                View viewM25591c = adn.m25591c(viewGroup, i, viewGroup, false);
                int i2 = R.id.retry;
                if (i == R.layout.message_agent_view_holder) {
                    ProgressBar progressBar = (ProgressBar) vie1.m85629k(viewM25591c, R.id.floating_avatar_progress);
                    if (progressBar != null) {
                        EncoreTextView encoreTextView = (EncoreTextView) vie1.m85629k(viewM25591c, R.id.message_content);
                        if (encoreTextView != null) {
                            EncoreTextView encoreTextView2 = (EncoreTextView) vie1.m85629k(viewM25591c, R.id.retry);
                            if (encoreTextView2 != null) {
                                i2 = R.id.user_avatar;
                                if (((ShapeableImageView) vie1.m85629k(viewM25591c, R.id.user_avatar)) != null) {
                                    wwe0Var = new vwe0(new d5a0((ConstraintLayout) viewM25591c, progressBar, encoreTextView, encoreTextView2, 9), p0r0Var);
                                }
                            }
                        } else {
                            i2 = R.id.message_content;
                        }
                    } else {
                        i2 = R.id.floating_avatar_progress;
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c.getResources().getResourceName(i2)));
                }
                if (i == R.layout.message_user_view_holder) {
                    EncoreTextView encoreTextView3 = (EncoreTextView) vie1.m85629k(viewM25591c, R.id.message_content);
                    if (encoreTextView3 != null) {
                        EncoreTextView encoreTextView4 = (EncoreTextView) vie1.m85629k(viewM25591c, R.id.retry);
                        if (encoreTextView4 != null) {
                            wwe0Var = new zwe0(new li80((ConstraintLayout) viewM25591c, encoreTextView3, encoreTextView4, 26), p0r0Var);
                        }
                    } else {
                        i2 = R.id.message_content;
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c.getResources().getResourceName(i2)));
                }
                if (i == R.layout.message_system_bubble_view_holder) {
                    TextView textView = (TextView) vie1.m85629k(viewM25591c, R.id.message_content);
                    if (textView == null) {
                        throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c.getResources().getResourceName(R.id.message_content)));
                    }
                    wwe0Var = new xwe0(new vw90(13, (ConstraintLayout) viewM25591c, textView));
                } else if (i == R.layout.message_system_text_view_holder) {
                    TextView textView2 = (TextView) vie1.m85629k(viewM25591c, R.id.message_content);
                    if (textView2 == null) {
                        throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c.getResources().getResourceName(R.id.message_content)));
                    }
                    wwe0Var = new ywe0(new i780(19, (ConstraintLayout) viewM25591c, textView2));
                } else {
                    if (i != R.layout.message_injected_agent_view_holder) {
                        throw new IllegalArgumentException("Invalid view type");
                    }
                    EncoreTextView encoreTextView5 = (EncoreTextView) vie1.m85629k(viewM25591c, R.id.message_content);
                    if (encoreTextView5 == null) {
                        throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c.getResources().getResourceName(R.id.message_content)));
                    }
                    wwe0Var = new wwe0(new bq70(22, (ConstraintLayout) viewM25591c, encoreTextView5));
                }
                return wwe0Var;
            case 1:
                View viewM25591c2 = adn.m25591c(viewGroup, R.layout.text_item, viewGroup, false);
                if (viewM25591c2 == null) {
                    throw new NullPointerException("rootView");
                }
                TextView textView3 = (TextView) viewM25591c2;
                return new dc71(this, new yr50(textView3, textView3, 1));
            case 2:
                View viewM25591c3 = adn.m25591c(viewGroup, R.layout.view_country, viewGroup, false);
                int i3 = R.id.checkIcon;
                IconCheck iconCheck = (IconCheck) vie1.m85629k(viewM25591c3, R.id.checkIcon);
                if (iconCheck != null) {
                    i3 = R.id.textView;
                    TextView textView4 = (TextView) vie1.m85629k(viewM25591c3, R.id.textView);
                    if (textView4 != null) {
                        return new nwk(new oa81((ConstraintLayout) viewM25591c3, iconCheck, textView4, 25));
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c3.getResources().getResourceName(i3)));
            case 3:
                return new jmu(((fju) this.f200364f).mo26174a(null));
            case 4:
                z9p z9pVar = (z9p) this.f200364f;
                pcb pcbVar = new pcb(new yiu(((eju) z9pVar.f280843b).f60295c), (dgp) z9pVar.f280844c, ((tc4) z9pVar.f280845d).m80415c(), (ixr) ((i4t0) z9pVar.f280846e).get(), (h9w) z9pVar.f280847f, ((nw81) z9pVar.f280848g).m65757a());
                LayoutInflater.from(viewGroup.getContext());
                return new e9z(pcbVar.m69554h(), pcbVar);
            default:
                int i4 = R.id.device_title_textview;
                if (i == 0) {
                    View viewM25591c4 = adn.m25591c(viewGroup, R.layout.puffin_specific_headphones_item, viewGroup, false);
                    if (((SpotifyIconView) vie1.m85629k(viewM25591c4, R.id.device_selected_iconview)) != null) {
                        TextView textView5 = (TextView) vie1.m85629k(viewM25591c4, R.id.device_subtitle_textview);
                        if (textView5 != null) {
                            TextView textView6 = (TextView) vie1.m85629k(viewM25591c4, R.id.device_title_textview);
                            if (textView6 != null) {
                                return new mp20(new pmj0((ConstraintLayout) viewM25591c4, textView5, textView6, 3));
                            }
                        } else {
                            i4 = R.id.device_subtitle_textview;
                        }
                    } else {
                        i4 = R.id.device_selected_iconview;
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c4.getResources().getResourceName(i4)));
                }
                if (i != 1) {
                    throw new IllegalArgumentException(s571.m77246e(i, "Unsupported view type: "));
                }
                View viewM25591c5 = adn.m25591c(viewGroup, R.layout.puffin_ambiguous_headphones_item, viewGroup, false);
                if (((SpotifyIconView) vie1.m85629k(viewM25591c5, R.id.device_selected_iconview)) != null) {
                    TextView textView7 = (TextView) vie1.m85629k(viewM25591c5, R.id.device_subtitle_textview);
                    if (textView7 != null) {
                        TextView textView8 = (TextView) vie1.m85629k(viewM25591c5, R.id.device_title_textview);
                        if (textView8 != null) {
                            return new lp20(new pmj0((ConstraintLayout) viewM25591c5, textView7, textView8, 2));
                        }
                    } else {
                        i4 = R.id.device_subtitle_textview;
                    }
                } else {
                    i4 = R.id.device_selected_iconview;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c5.getResources().getResourceName(i4)));
        }
    }

    public rls0(adk adkVar) {
        super(new ia5(13));
        this.f200364f = adkVar;
    }

    public rls0() {
        super(ia5.f100153g);
        this.f200364f = ok20.f166232R0;
    }

    public rls0(fju fjuVar) {
        super(new ia5(21));
        this.f200364f = fjuVar;
    }

    public rls0(p0r0 p0r0Var) {
        super(f200361g);
        this.f200364f = p0r0Var;
    }

    public rls0(z9p z9pVar) {
        super(jhl0.f112502a);
        m47721x(2);
        this.f200364f = z9pVar;
    }
}
