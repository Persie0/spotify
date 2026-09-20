package p204p;

import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.find.FindInContextView;
import com.spotify.equalizer.uiusecases.equalizerpicker.EqualizerView;
import com.spotify.music.R;
import com.spotify.transcript.list.TranscriptListView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class kk6 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f123516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f123517b;

    public /* synthetic */ kk6(Object obj, int i) {
        this.f123516a = i;
        this.f123517b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        oqe oqeVar;
        dx40 dx40VarMo51806g;
        int i10 = this.f123516a;
        Object obj = this.f123517b;
        switch (i10) {
            case 0:
                sk6 sk6Var = (sk6) obj;
                int i11 = i4 - i2;
                if (i11 != i8 - i7) {
                    RecyclerView recyclerView = sk6Var.f210041i;
                    recyclerView.setPadding(recyclerView.getPaddingLeft(), sk6Var.f210041i.getPaddingTop(), sk6Var.f210041i.getPaddingRight(), sk6Var.f210029R0 + i11);
                    return;
                }
                return;
            case 1:
                ((i68) obj).m49803a();
                return;
            case 2:
                throw null;
            case 3:
                ((eue) obj).m40059e(true);
                return;
            case 4:
                view.removeOnLayoutChangeListener(this);
                k0e1.m54976K(((ief) obj).f101402f.f48077d);
                return;
            case 5:
                ((s0p) obj).m76893E();
                return;
            case 6:
                kcp kcpVar = (kcp) obj;
                if (kcpVar.f121529f || (i9 = i3 - i) == 0) {
                    return;
                }
                int i12 = i7 - i5;
                cuq cuqVar = kcpVar.f121530g;
                if (cuqVar == null || i9 == i12) {
                    return;
                }
                kcpVar.m56103a(cuqVar, new SpannableStringBuilder(cuqVar.f42184a));
                return;
            case 7:
                view.removeOnLayoutChangeListener(this);
                aop aopVar = (aop) obj;
                if (((FindInContextView) aopVar.f17734c.f183795c).m9620x()) {
                    ((FindInContextView) aopVar.f17734c.f183795c).requestFocus();
                    return;
                }
                return;
            case 8:
                czp czpVar = (czp) obj;
                View view2 = czpVar.f43608d;
                if (view2 == null || (oqeVar = czpVar.f43609e) == null) {
                    return;
                }
                oqeVar.invoke(view2);
                return;
            case 9:
                view.removeOnLayoutChangeListener(this);
                xzo xzoVar = (xzo) obj;
                k0e1.m54976K(((FindInContextView) ((xjp) xzoVar.f267727b).f262185d).f3658S0);
                gh00 gh00Var = (gh00) xzoVar.f267728c;
                if (gh00Var != null) {
                    gh00Var.invoke(qwy0.f193439b);
                    return;
                }
                return;
            case 10:
                zbq zbqVar = (zbq) obj;
                View view3 = zbqVar.f281381r;
                if (view3 != null) {
                    View view4 = zbqVar.f281376m;
                    czp czpVar2 = zbqVar.f281379p;
                    View view5 = zbqVar.f281380q;
                    int i13 = view3.getContext().getResources().getDisplayMetrics().widthPixels;
                    if (czpVar2 == null || view4 == null || view5 == null) {
                        return;
                    }
                    pqm0 pqm0VarM95874e = zbqVar.m95874e(view4, view3, zbqVar.f281382s);
                    zbqVar.m95872c(view4, ((Number) pqm0VarM95874e.f180350a).intValue(), i13);
                    int i14 = zbqVar.f281382s;
                    if (i14 != zbqVar.f281371h) {
                        pqm0VarM95874e = zbqVar.m95874e(view4, view3, i14);
                    }
                    try {
                        czpVar2.f43606b.update(view3, ((Number) pqm0VarM95874e.f180350a).intValue(), ((Number) pqm0VarM95874e.f180351b).intValue(), -1, -1);
                        break;
                    } catch (RuntimeException e) {
                        Logger.m3966b("tooltip won't be updated - exception thrown: " + e, new Object[0]);
                    }
                    zbq.m95870b(zbqVar, view5, czpVar2.m34457b(), view3, zbqVar.f281382s);
                    return;
                }
                return;
            case 11:
                c7t c7tVar = (c7t) obj;
                View viewFindFocus = view.findFocus();
                if (viewFindFocus == null) {
                    return;
                }
                c7tVar.getClass();
                WeakHashMap weakHashMap = mec1.f142677a;
                swd1 swd1VarM35774a = dec1.m35774a(view);
                Integer numValueOf = Integer.valueOf((swd1VarM35774a == null || (dx40VarMo51806g = swd1VarM35774a.f214650a.mo51806g(8)) == null) ? 0 : dx40VarMo51806g.f53851d);
                Integer num = numValueOf.intValue() > 0 ? numValueOf : null;
                if (num != null) {
                    int height = view.getHeight() - num.intValue();
                    ScrollView scrollView = c7tVar.f34993L0;
                    Rect rect = c7tVar.f35001T0;
                    rect.setEmpty();
                    scrollView.offsetDescendantRectToMyCoords(viewFindFocus, rect);
                    int scrollY = (rect.bottom - height) - view.getScrollY();
                    if (scrollY > 0) {
                        view.scrollBy(0, scrollY);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                view.removeOnLayoutChangeListener(this);
                int i15 = EqualizerView.f3902W0;
                ((EqualizerView) obj).m9733z(false);
                return;
            case 13:
                view.removeOnLayoutChangeListener(this);
                FindInContextView findInContextView = (FindInContextView) obj;
                findInContextView.f3659T0.setVisibility(findInContextView.m9620x() ? 0 : 8);
                return;
            case 14:
                if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                    return;
                }
                tt30.m81493h1((tt30) obj);
                return;
            case 15:
                ((fts) obj).invoke();
                return;
            case 16:
                ((sir0) obj).mo30231j(Integer.valueOf(i4 - i2));
                return;
            case 17:
                aqc0 aqc0Var = (aqc0) obj;
                if (aqc0Var.m49721t0().getConfiguration().orientation != 1) {
                    return;
                }
                int i16 = (int) (aqc0Var.m49721t0().getDisplayMetrics().density * 24.0f);
                View view6 = aqc0Var.f18200I1;
                if (view6 == null) {
                    wj50.m88260d0("header");
                    throw null;
                }
                int top = view6.getTop();
                View view7 = aqc0Var.f18201J1;
                if (view7 == null) {
                    wj50.m88260d0("footer");
                    throw null;
                }
                int bottom = i4 - view7.getBottom();
                int iMax = Math.max(top < i16 ? Math.abs(i16 - top) : 0, bottom < i16 ? Math.abs(i16 - bottom) : 0);
                ImageView imageView = aqc0Var.f18195D1;
                if (imageView == null) {
                    wj50.m88260d0("coverImageView");
                    throw null;
                }
                h6j h6jVar = (h6j) imageView.getLayoutParams();
                int marginStart = h6jVar.getMarginStart() + iMax;
                int marginEnd = h6jVar.getMarginEnd() + iMax;
                h6jVar.setMarginStart(marginStart);
                h6jVar.setMarginEnd(marginEnd);
                ImageView imageView2 = aqc0Var.f18195D1;
                if (imageView2 == null) {
                    wj50.m88260d0("coverImageView");
                    throw null;
                }
                imageView2.setLayoutParams(h6jVar);
                View view8 = aqc0Var.f18192A1;
                if (view8 != null) {
                    view8.removeOnLayoutChangeListener(this);
                    return;
                } else {
                    wj50.m88260d0("overlayView");
                    throw null;
                }
            case 18:
                view.removeOnLayoutChangeListener(this);
                ConstraintLayout constraintLayout = (ConstraintLayout) ((u7q) obj).f227741b;
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), (int) (u1x0.m82232a(R.dimen.discovery_feed_card_peek_percent, view.getContext().getResources()) * view.getHeight()));
                return;
            case 19:
                view.post(new cjs0((pst0) obj, 4));
                return;
            case 20:
                view.removeOnLayoutChangeListener(this);
                ((abs0) obj).m25376d();
                return;
            case 21:
                TranscriptListView transcriptListView = (TranscriptListView) obj;
                view.removeOnLayoutChangeListener(this);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int marginStart2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                int marginEnd2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0;
                if (marginStart2 == 0 && marginEnd2 == 0) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, 0, marginLayoutParams.bottomMargin);
                view.setLayoutParams(marginLayoutParams);
                wj50.m88279p(transcriptListView);
                ViewGroup.LayoutParams layoutParams4 = transcriptListView.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams2.setMargins(marginStart2, marginLayoutParams2.topMargin, marginEnd2, marginLayoutParams2.bottomMargin);
                transcriptListView.setLayoutParams(marginLayoutParams2);
                return;
            case 22:
                ((vg41) obj).m85395K();
                return;
            case 23:
                view.removeOnLayoutChangeListener(this);
                ((vf71) obj).m85349a(view);
                return;
            case 24:
                view.removeOnLayoutChangeListener(this);
                x4b.m89850i((View) ((x4b) obj).f258037b);
                return;
            case 25:
                view.removeOnLayoutChangeListener(this);
                wnl wnlVar = (wnl) obj;
                ((View) wnlVar.f253205c).setPivotX(0.0f);
                ((View) wnlVar.f253205c).setPivotY(view.getMeasuredHeight());
                return;
            case 26:
                view.removeOnLayoutChangeListener(this);
                k491 k491Var = (k491) obj;
                k491Var.f119157h = new i291(view.getWidth(), new vr11(k491Var.getPaint(), 20), 2);
                return;
            case 27:
                view.removeOnLayoutChangeListener(this);
                ((wa31) obj).invoke(view);
                return;
            case 28:
                ((rjc1) obj).m75640t();
                return;
            default:
                fpc1 fpc1Var = (fpc1) obj;
                if (fpc1Var.f71803c != null) {
                    fpc1Var.m42325a();
                    return;
                }
                return;
        }
    }

    public kk6(u7q u7qVar, xmm0 xmm0Var) {
        this.f123516a = 18;
        this.f123517b = u7qVar;
    }
}
