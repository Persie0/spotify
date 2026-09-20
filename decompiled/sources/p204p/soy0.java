package p204p;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.image.EncoreImageView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.music.R;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class soy0 extends go80 {

    /* JADX INFO: renamed from: i */
    public static final ia5 f212694i = new ia5(28);

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f212695e = 3;

    /* JADX INFO: renamed from: f */
    public final Object f212696f;

    /* JADX INFO: renamed from: g */
    public Serializable f212697g;

    /* JADX INFO: renamed from: h */
    public Object f212698h;

    public soy0(e940 e940Var, hwy0 hwy0Var, hwy0 hwy0Var2) {
        super(f212694i);
        this.f212696f = e940Var;
        this.f212697g = hwy0Var;
        this.f212698h = hwy0Var2;
    }

    /* JADX INFO: renamed from: D */
    public static final void m78843D(soy0 soy0Var, a6e a6eVar, int i) {
        yrv yrvVar = (yrv) soy0Var.f212697g;
        if (yrvVar != null) {
            t7j t7jVar = (t7j) soy0Var.f212696f;
            String str = a6eVar.f12779b;
            r2h0 r2h0Var = (r2h0) t7jVar.f217840c;
            Integer numValueOf = Integer.valueOf(i);
            yt91 yt91VarM96903c = r2h0Var.f195145c.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("guest_chip", null, numValueOf, str, null));
            yt91VarM96903c.f276056j = true;
            zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
            dv91 dv91Var = new dv91("hit", 1);
            String string = str.toString();
            if (string == null) {
                string = "";
            }
            yrvVar.invoke(a6eVar, ((kv91) t7jVar.f217839b).mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, r2h0Var.f195144b, System.currentTimeMillis()), null));
        }
    }

    @Override // p204p.go80
    /* JADX INFO: renamed from: B */
    public void mo31052B(List list, List list2) {
        switch (this.f212695e) {
            case 2:
                m78844E();
                break;
        }
    }

    /* JADX INFO: renamed from: E */
    public void m78844E() {
        RecyclerView recyclerView = (RecyclerView) this.f212698h;
        if (recyclerView == null) {
            return;
        }
        int i = 0;
        for (Object obj : this.f82904d.f39905f) {
            int i2 = i + 1;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            a6e a6eVar = (a6e) obj;
            mec1.m61549a(recyclerView, recyclerView.getContext().getString(R.string.guest_chip_action_content_description, a6eVar.f12778a), new zk1(this, a6eVar, i, 15));
            i = i2;
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: g */
    public int mo28437g(int i) {
        switch (this.f212695e) {
            case 3:
                v670 v670Var = ((kkz0) m45324A(i)).f123747a;
                if (v670Var instanceof u670) {
                    return 0;
                }
                if (v670Var instanceof t670) {
                    return 1;
                }
                throw new NoWhenBranchMatchedException();
            default:
                return super.mo28437g(i);
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: m */
    public void mo28858m(RecyclerView recyclerView) {
        switch (this.f212695e) {
            case 2:
                this.f212698h = recyclerView;
                m78844E();
                break;
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) {
        q76 m66Var;
        qsj qsjVar;
        int i2 = 3;
        int i3 = 2;
        switch (this.f212695e) {
            case 0:
                n0z0 n0z0Var = (n0z0) m45324A(i);
                if (dkv0Var instanceof fxy0) {
                    fxy0 fxy0Var = (fxy0) dkv0Var;
                    wj50.m88279p(n0z0Var);
                    TextView textView = fxy0Var.f74491X0;
                    String str = n0z0Var.f149210e;
                    th00 th00Var = fxy0Var.f74488U0;
                    if (th00Var != null) {
                        th00Var.invoke(Integer.valueOf(fxy0Var.m36323m()), n0z0Var);
                    }
                    fxy0Var.f74490W0.setText(n0z0Var.f149209d);
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
                    textView.setLayoutParams(layoutParams);
                    textView.setVisibility(str.length() > 0 ? 0 : 8);
                    textView.setText(str);
                    ArtworkView artworkView = fxy0Var.f74489V0;
                    int i4 = n0z0Var.f149206a;
                    String str2 = n0z0Var.f149211f;
                    int iM38547C = edb.m38547C(i4);
                    if (iM38547C != 1) {
                        m66Var = iM38547C != 2 ? new g76(new h66(str2)) : new g76(new h66(str2));
                    } else {
                        m66Var = new m66(new h66(str2), false);
                    }
                    artworkView.mo2820d(m66Var);
                    b221 b221Var = n0z0Var.f149207b;
                    bej bejVar = b221Var instanceof bej ? (bej) b221Var : null;
                    int i5 = bejVar != null ? bejVar.f26365Y : 0;
                    int i6 = i5 == 0 ? -1 : exy0.f63873a[edb.m38547C(i5)];
                    if (i6 == -1) {
                        qsjVar = qsj.f192130d;
                    } else if (i6 == 1) {
                        qsjVar = qsj.f192128b;
                    } else if (i6 != 2) {
                        if (i6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qsjVar = qsj.f192130d;
                    } else {
                        qsjVar = qsj.f192127a;
                    }
                    fxy0Var.f74492Y0.mo2820d(qsjVar);
                    fxy0Var.f74486S0.setOnClickListener(new rsw0(i3, fxy0Var, n0z0Var));
                    return;
                }
                return;
            case 1:
                ha5 ha5Var = (ha5) dkv0Var;
                fy0 fy0Var = (fy0) m45324A(i);
                ovf ovfVar = ha5Var.f89124S0;
                View view = ha5Var.f50039a;
                Context context = view.getContext();
                fy0Var.getClass();
                ovfVar.mo2820d(new ulz0(context.getString(R.string.app_icon_option_default), fy0Var.f74499b, view.getContext().getString(R.string.icon_image_image_description), fy0Var.f74500c));
                soy0 soy0Var = ha5Var.f89125T0;
                iz1 iz1Var = (iz1) soy0Var.f212698h;
                if (iz1Var != null) {
                    iz1Var.invoke(fy0Var.f74498a);
                }
                ovfVar.mo2821c(new n62(26, soy0Var, fy0Var));
                return;
            case 2:
                a6e a6eVar = (a6e) m45324A(i);
                wj50.m88279p(a6eVar);
                p6e p6eVar = ((da20) dkv0Var).f46962S0;
                p6eVar.setMaxWidth(Alert.DURATION_SHOW_INDEFINITELY);
                String str3 = a6eVar.f12778a;
                p6eVar.setText(str3);
                p6eVar.setContentDescription(str3);
                t7j t7jVar = (t7j) this.f212696f;
                String str4 = a6eVar.f12779b;
                r2h0 r2h0Var = (r2h0) t7jVar.f217840c;
                Integer numValueOf = Integer.valueOf(i);
                yt91 yt91VarM96903c = r2h0Var.f195145c.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("guest_chip", null, numValueOf, str4, null));
                yt91VarM96903c.f276056j = true;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = zt91VarM94607a;
                nu91Var.f248108b = r2h0Var.f195144b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                ((kv91) t7jVar.f217839b).mo57449i((ou91) nu91Var.m87248a(), null);
                return;
            default:
                kkz0 kkz0Var = (kkz0) m45324A(i);
                if (!(dkv0Var instanceof l670)) {
                    if (dkv0Var instanceof k670) {
                        k670 k670Var = (k670) dkv0Var;
                        t670 t670Var = (t670) kkz0Var.f123747a;
                        boolean z = kkz0Var.f123748b;
                        String strM56834f = t670Var.f217461c;
                        d670 d670Var = k670Var.f119682S0;
                        ViewStub viewStub = (ViewStub) d670Var.f45619d;
                        ConstraintLayout constraintLayout = (ConstraintLayout) d670Var.f45617b;
                        viewStub.setVisibility(z ? 0 : 8);
                        constraintLayout.setOnClickListener(new ViewOnClickListenerC2344rn(k670Var, t670Var, i, i3));
                        EncoreImageView encoreImageView = (EncoreImageView) d670Var.f45618c;
                        encoreImageView.setImageLoader(k670Var.f119683T0);
                        encoreImageView.setModifierFactory(zo50.f284673S0);
                        encoreImageView.setSource(new fxu(Uri.parse(t670Var.f217460b)));
                        if (z) {
                            strM56834f = klh.m56834f(strM56834f, "; ", constraintLayout.getContext().getString(R.string.kids_profile_avatar_picker_selected_icon));
                        }
                        encoreImageView.setContentDescription(strM56834f);
                        return;
                    }
                    return;
                }
                l670 l670Var = (l670) dkv0Var;
                String str5 = (String) this.f212697g;
                u670 u670Var = (u670) kkz0Var.f123747a;
                boolean z2 = kkz0Var.f123748b;
                x610 x610Var = l670Var.f130241S0;
                ViewStub viewStub2 = (ViewStub) x610Var.f258559d;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) x610Var.f258557b;
                viewStub2.setVisibility(z2 ? 0 : 8);
                constraintLayout2.setOnClickListener(new ViewOnClickListenerC2344rn(l670Var, u670Var, i, i2));
                String string = constraintLayout2.getContext().getString(R.string.kids_profile_avatar_picker_color_description, u670Var.f227236b);
                TextView textView2 = (TextView) x610Var.f258558c;
                ShapeDrawable shapeDrawable = l670Var.f130243U0;
                Paint paint = shapeDrawable.getPaint();
                int i7 = u670Var.f227235a;
                Locale locale = n9f.f151789a;
                paint.setColor(Color.parseColor(String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i7)}, 1))));
                textView2.setBackground(shapeDrawable);
                textView2.setText(str5);
                textView2.setContentDescription(z2 ? rbz.m75190h(str5, "; ", string, "; ", constraintLayout2.getContext().getString(R.string.kids_profile_avatar_picker_selected_icon)) : klh.m56834f(str5, "; ", string));
                return;
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        dkv0 l670Var;
        switch (this.f212695e) {
            case 0:
                View viewM49495k = i2h1.m49495k(viewGroup.getContext(), R.layout.row_layout, viewGroup, 4);
                wj50.m88279p(viewM49495k);
                return new fxy0(viewM49495k, (e940) this.f212696f, (hwy0) this.f212697g, (hwy0) this.f212698h);
            case 1:
                return new ha5(this, ((C2098lp) this.f212696f).mo26174a(null));
            case 2:
                p6e p6eVar = new p6e(viewGroup.getContext(), 1);
                da20 da20Var = new da20(p6eVar);
                p6eVar.setImportantForAccessibility(2);
                p6eVar.setOnClickListener(new dtz(5, this, da20Var));
                return da20Var;
            default:
                wa60 wa60Var = (wa60) this.f212698h;
                int iM38547C = edb.m38547C(edb.m38551G(2)[i]);
                int i2 = R.id.selected_layout;
                if (iM38547C == 0) {
                    View viewM25591c = adn.m25591c(viewGroup, R.layout.kids_profile_color_item, viewGroup, false);
                    TextView textView = (TextView) vie1.m85629k(viewM25591c, R.id.kids_profile_initials);
                    if (textView != null) {
                        ViewStub viewStub = (ViewStub) vie1.m85629k(viewM25591c, R.id.selected_layout);
                        if (viewStub != null) {
                            l670Var = new l670(new x610((ConstraintLayout) viewM25591c, textView, viewStub, 26), wa60Var);
                        }
                    } else {
                        i2 = R.id.kids_profile_initials;
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c.getResources().getResourceName(i2)));
                }
                if (iM38547C != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                View viewM25591c2 = adn.m25591c(viewGroup, R.layout.kids_profile_avatar_item, viewGroup, false);
                EncoreImageView encoreImageView = (EncoreImageView) vie1.m85629k(viewM25591c2, R.id.kids_profile_avatar);
                if (encoreImageView != null) {
                    ViewStub viewStub2 = (ViewStub) vie1.m85629k(viewM25591c2, R.id.selected_layout);
                    if (viewStub2 != null) {
                        l670Var = new k670(new d670((ConstraintLayout) viewM25591c2, encoreImageView, viewStub2, 0), (e940) this.f212696f, wa60Var);
                    }
                } else {
                    i2 = R.id.kids_profile_avatar;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c2.getResources().getResourceName(i2)));
                return l670Var;
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: q */
    public void mo28696q(RecyclerView recyclerView) {
        switch (this.f212695e) {
            case 2:
                this.f212698h = null;
                break;
        }
    }

    public soy0(t7j t7jVar) {
        super(new ia5(20));
        this.f212696f = t7jVar;
    }

    public soy0(C2098lp c2098lp) {
        super(ia5.f100148b);
        this.f212696f = c2098lp;
        this.f212697g = null;
        this.f212698h = null;
    }

    public soy0(String str, e940 e940Var, wa60 wa60Var) {
        super(v3d1.f236834a);
        this.f212697g = str;
        this.f212696f = e940Var;
        this.f212698h = wa60Var;
    }
}
