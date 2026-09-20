package p204p;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.tooltipsimpl.TooltipContentView;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class zbq {

    /* JADX INFO: renamed from: a */
    public final String f281364a;

    /* JADX INFO: renamed from: b */
    public final dzp f281365b;

    /* JADX INFO: renamed from: c */
    public final gh00 f281366c;

    /* JADX INFO: renamed from: d */
    public final gh00 f281367d;

    /* JADX INFO: renamed from: e */
    public final eh00 f281368e;

    /* JADX INFO: renamed from: f */
    public final int f281369f;

    /* JADX INFO: renamed from: g */
    public final int f281370g;

    /* JADX INFO: renamed from: h */
    public final int f281371h;

    /* JADX INFO: renamed from: i */
    public final boolean f281372i;

    /* JADX INFO: renamed from: l */
    public View f281375l;

    /* JADX INFO: renamed from: m */
    public View f281376m;

    /* JADX INFO: renamed from: n */
    public eh00 f281377n;

    /* JADX INFO: renamed from: o */
    public szp f281378o;

    /* JADX INFO: renamed from: p */
    public czp f281379p;

    /* JADX INFO: renamed from: q */
    public View f281380q;

    /* JADX INFO: renamed from: r */
    public View f281381r;

    /* JADX INFO: renamed from: s */
    public int f281382s;

    /* JADX INFO: renamed from: t */
    public long f281383t;

    /* JADX INFO: renamed from: j */
    public final Handler f281373j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k */
    public final eph f281374k = new eph(this, 14);

    /* JADX INFO: renamed from: u */
    public final kk6 f281384u = new kk6(this, 10);

    public zbq(String str, dzp dzpVar, gh00 gh00Var, gh00 gh00Var2, eh00 eh00Var, int i, int i2, int i3, boolean z) {
        this.f281364a = str;
        this.f281365b = dzpVar;
        this.f281366c = gh00Var;
        this.f281367d = gh00Var2;
        this.f281368e = eh00Var;
        this.f281369f = i;
        this.f281370g = i2;
        this.f281371h = i3;
        this.f281372i = z;
        this.f281382s = i3;
    }

    /* JADX INFO: renamed from: b */
    public static final void m95870b(zbq zbqVar, View view, TooltipContentView tooltipContentView, View view2, int i) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setPivotY(0.0f);
        view.setPivotX(0.0f);
        Rect rectM95871g = m95871g(view2);
        Rect rectM95871g2 = m95871g(view);
        float dimension = tooltipContentView.getContext().getResources().getDimension(R.dimen.nudge_round_corners);
        int i2 = uqg1.m83800x(tooltipContentView.getContext()) ? -1 : 1;
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0 || iM38547C == 1) {
            float fCenterX = rectM95871g.centerX() - rectM95871g2.centerX();
            float measuredWidth = (tooltipContentView.getMeasuredWidth() / 2.0f) - dimension;
            float fAbs = Math.abs(fCenterX);
            if (measuredWidth > fAbs) {
                measuredWidth = fAbs;
            }
            float fSignum = Math.signum(fCenterX) * measuredWidth;
            float measuredHeight = tooltipContentView.getMeasuredHeight() / 2.0f;
            view.setTranslationX(fSignum * i2);
            if (i != 1) {
                measuredHeight *= -1;
            }
            view.setTranslationY(measuredHeight);
            return;
        }
        if (iM38547C != 2 && iM38547C != 3) {
            throw new NoWhenBranchMatchedException();
        }
        float fCenterY = rectM95871g.centerY() - rectM95871g2.centerY();
        float measuredHeight2 = (tooltipContentView.getMeasuredHeight() / 2.0f) - dimension;
        float fAbs2 = Math.abs(fCenterY);
        if (measuredHeight2 > fAbs2) {
            measuredHeight2 = fAbs2;
        }
        float fSignum2 = Math.signum(fCenterY) * measuredHeight2;
        float measuredWidth2 = tooltipContentView.getMeasuredWidth() / 2.0f;
        view.setTranslationY(fSignum2);
        float f = i2;
        if (i != 3) {
            measuredWidth2 *= -1;
        }
        view.setTranslationX(f * measuredWidth2);
    }

    /* JADX INFO: renamed from: g */
    public static Rect m95871g(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX INFO: renamed from: c */
    public final void m95872c(View view, int i, int i2) {
        int i3 = 1;
        int i4 = uqg1.m83800x(view.getContext()) ? -1 : 1;
        int i5 = uqg1.m83800x(view.getContext()) ? i2 : 0;
        if (uqg1.m83800x(view.getContext())) {
            i2 = 0;
        }
        int i6 = this.f281371h;
        int iM38547C = edb.m38547C(i6);
        if (iM38547C == 0 || iM38547C == 1) {
            i3 = i6;
        } else if (iM38547C != 2) {
            if (iM38547C != 3) {
                throw new NoWhenBranchMatchedException();
            }
            float f = i2;
            if (view.getX() + (i * i4) > f) {
                i3 = 3;
            } else if (view.getX() + ((view.getMeasuredWidth() + i) * i4) <= f) {
                i3 = 4;
            }
        } else if (view.getX() + (i * i4) < i5) {
            i3 = 4;
        } else if (view.getX() + ((view.getMeasuredWidth() + i) * i4) <= i2) {
            i3 = 3;
        }
        this.f281382s = i3;
    }

    /* JADX INFO: renamed from: d */
    public final void m95873d(View view) {
        View view2 = this.f281375l;
        if (view2 != null && view2.getParent() != null) {
            View view3 = this.f281375l;
            wj50.m88279p(view3);
            ((ViewGroup) view3.getParent()).removeView(this.f281375l);
        }
        Activity activity = this.f281365b.f54705a;
        czp czpVar = new czp(this.f281370g, activity);
        this.f281379p = czpVar;
        this.f281381r = view;
        View view4 = this.f281375l;
        oqe oqeVar = new oqe(this, czpVar, view, 29);
        View view5 = czpVar.f43608d;
        if (view5 != null) {
            czpVar.f43609e = oqeVar;
            view5.addOnLayoutChangeListener(czpVar.f43610f);
        }
        TooltipContentView tooltipContentViewM34457b = czpVar.m34457b();
        h6j h6jVar = new h6j(-2, -2);
        h6jVar.f88118P = czpVar.f43607c;
        h6jVar.f88145i = 0;
        h6jVar.f88151l = 0;
        tooltipContentViewM34457b.removeAllViews();
        tooltipContentViewM34457b.addView(view4, h6jVar);
        tooltipContentViewM34457b.measure(-2, -2);
        PopupWindow popupWindow = czpVar.f43606b;
        popupWindow.getContentView().measure(-2, -2);
        popupWindow.setHeight(-2);
        popupWindow.setWidth(popupWindow.getContentView().getMeasuredWidth());
        if (this.f281372i) {
            popupWindow.setOutsideTouchable(true);
            popupWindow.setTouchInterceptor(new azp(czpVar, 0));
        }
        View contentView = popupWindow.getContentView();
        this.f281376m = contentView;
        this.f281380q = contentView.findViewById(R.id.nudge_arrow);
        contentView.setOnClickListener(new xbq(this, 0));
        ((TooltipContentView) popupWindow.getContentView().findViewById(R.id.nudge_content)).setOnSwipeDownListener(new ybq(this, 0));
        popupWindow.setOnDismissListener(new bzp(new ybq(this, 1), 0));
        czpVar.f43611g = new ybq(this, 2);
        pqm0 pqm0VarM95874e = m95874e(contentView, view, this.f281382s);
        m95872c(contentView, ((Number) pqm0VarM95874e.f180350a).intValue(), view.getContext().getResources().getDisplayMetrics().widthPixels);
        int i = this.f281382s;
        if (i != this.f281371h) {
            pqm0VarM95874e = m95874e(contentView, view, i);
        }
        int iIntValue = ((Number) pqm0VarM95874e.f180350a).intValue();
        int iIntValue2 = ((Number) pqm0VarM95874e.f180351b).intValue();
        long j = this.f281383t;
        if (j > 0) {
            this.f281373j.postDelayed(this.f281374k, j);
        }
        if (activity.isFinishing()) {
            Logger.m3966b("tooltip won't be shown - activity is finishing", new Object[0]);
        } else {
            try {
                popupWindow.showAsDropDown(view, iIntValue, iIntValue2);
            } catch (RuntimeException e) {
                Logger.m3966b("tooltip won't be shown - exception thrown: " + e, new Object[0]);
            }
        }
        szp szpVar = this.f281378o;
        if (szpVar != null) {
            szpVar.invoke(this);
        }
        view.addOnLayoutChangeListener(this.f281384u);
    }

    /* JADX INFO: renamed from: e */
    public final pqm0 m95874e(View view, View view2, int i) {
        int iCenterX;
        Rect rectM95871g = m95871g(view2);
        Resources resources = view.getContext().getResources();
        int i2 = this.f281369f;
        int iM72083N = q3d0.m72083N(resources.getDimension(i2));
        int i3 = uqg1.m83800x(view.getContext()) ? -1 : 1;
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0 || iM38547C == 1) {
            iCenterX = rectM95871g.centerX() - ((view.getMeasuredWidth() / 2) + rectM95871g.left);
        } else if (iM38547C == 2) {
            iCenterX = (-1) * (view.getMeasuredWidth() + iM72083N) * i3;
        } else {
            if (iM38547C != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iCenterX = (rectM95871g.width() + iM72083N) * i3;
        }
        int measuredHeight = view.getMeasuredHeight();
        int iM72083N2 = q3d0.m72083N(view.getContext().getResources().getDimension(i2));
        int iM38547C2 = edb.m38547C(i);
        if (iM38547C2 == 0) {
            iM72083N2 = -(rectM95871g.height() + measuredHeight + iM72083N2);
        } else if (iM38547C2 != 1) {
            if (iM38547C2 != 2 && iM38547C2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iM72083N2 = -((rectM95871g.height() + measuredHeight) / 2);
        }
        return new pqm0(Integer.valueOf(iCenterX), Integer.valueOf(iM72083N2));
    }

    /* JADX INFO: renamed from: f */
    public final void m95875f() {
        czp czpVar = this.f281379p;
        if (czpVar != null) {
            PopupWindow popupWindow = czpVar.f43606b;
            View view = czpVar.f43608d;
            if (view != null) {
                view.removeOnLayoutChangeListener(czpVar.f43610f);
            }
            if (czpVar.f43605a.isFinishing()) {
                Logger.m3966b("tooltip won't be dismissed - activity is finishing", new Object[0]);
            } else if (popupWindow.isShowing()) {
                try {
                    popupWindow.dismiss();
                } catch (RuntimeException e) {
                    Logger.m3966b("tooltip won't be dismissed - exception thrown: " + e, new Object[0]);
                }
            }
        }
        this.f281373j.removeCallbacks(this.f281374k);
        View view2 = this.f281381r;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(this.f281384u);
        }
        this.f281380q = null;
        this.f281381r = null;
        this.f281379p = null;
    }

    /* JADX INFO: renamed from: h */
    public final void m95876h(lqk lqkVar) {
        this.f281377n = lqkVar;
    }

    /* JADX INFO: renamed from: j */
    public final void m95878j(szp szpVar) {
        this.f281378o = szpVar;
    }

    /* JADX INFO: renamed from: i */
    public final void m95877i(r7q r7qVar) {
    }
}
