package p204p;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.podcastplaybackspeed.uiusecases.wheelcontrol.WheelControlElementContainer;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class yqd1 extends hjv0 {

    /* JADX INFO: renamed from: X */
    public final int f275196X;

    /* JADX INFO: renamed from: Y */
    public final LinkedHashMap f275197Y;

    /* JADX INFO: renamed from: d */
    public final int f275198d;

    /* JADX INFO: renamed from: e */
    public final int f275199e;

    /* JADX INFO: renamed from: f */
    public final int f275200f;

    /* JADX INFO: renamed from: h */
    public final Integer f275202h;

    /* JADX INFO: renamed from: i */
    public final qe70 f275203i;

    /* JADX INFO: renamed from: g */
    public final int f275201g = 50;

    /* JADX INFO: renamed from: t */
    public int f275204t = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public yqd1(Resources resources, int i, int i2, int i3, Integer num, int i4, gh00 gh00Var) {
        this.f275198d = i;
        this.f275199e = i2;
        this.f275200f = i3;
        this.f275202h = num;
        this.f275203i = (qe70) gh00Var;
        this.f275196X = resources.getDimensionPixelSize(i4);
        nzv nzvVar = wqd1.f254024g;
        int iM31820L = c95.m31820L(i6f.m49804T(nzvVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L < 16 ? 16 : iM31820L);
        C2042k7 c2042k7 = new C2042k7(nzvVar, 0);
        while (c2042k7.hasNext()) {
            Object next = c2042k7.next();
            linkedHashMap.put(next, Integer.valueOf(resources.getDimensionPixelSize(((wqd1) next).f254025a)));
        }
        this.f275197Y = linkedHashMap;
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: e */
    public final int mo1617e() {
        return ((this.f275199e - this.f275198d) / this.f275200f) + 1;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [p.gh00, p.qe70] */
    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) {
        Integer num;
        g7d1 g7d1Var = ((xqd1) dkv0Var).f264970S0;
        int i2 = (this.f275200f * i) + this.f275198d;
        int i3 = this.f275201g;
        int i4 = i2 % i3;
        wqd1 wqd1Var = wqd1.f254020c;
        if (i4 != 0 && (num = this.f275202h) != null) {
            wqd1Var = i2 % num.intValue() == 0 ? wqd1.f254021d : wqd1.f254022e;
        }
        ((TextView) g7d1Var.f77249d).setText(i2 % i3 == 0 ? (CharSequence) this.f275203i.invoke(Integer.valueOf(i2)) : null);
        View view = (View) g7d1Var.f77248c;
        int iIntValue = ((Number) kkc0.m56692e0(wqd1Var, this.f275197Y)).intValue();
        if (view.getLayoutParams().height != iIntValue) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = iIntValue;
            view.setLayoutParams(layoutParams);
        }
        view.setAlpha(wqd1Var.f254026b);
        view.setBackgroundColor(i == this.f275204t ? vtg1.m86387n(view, R.attr.baseTextBrightAccent) : vtg1.m86387n(view, R.attr.baseTextBase));
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        View viewM25591c = adn.m25591c(viewGroup, R.layout.wheel_control_element, viewGroup, false);
        int i2 = R.id.wheel_control_element_marker;
        View viewM85629k = vie1.m85629k(viewM25591c, R.id.wheel_control_element_marker);
        if (viewM85629k != null) {
            i2 = R.id.wheel_control_element_marker_slot;
            if (((FrameLayout) vie1.m85629k(viewM25591c, R.id.wheel_control_element_marker_slot)) != null) {
                i2 = R.id.wheel_control_label;
                TextView textView = (TextView) vie1.m85629k(viewM25591c, R.id.wheel_control_label);
                if (textView != null) {
                    WheelControlElementContainer wheelControlElementContainer = (WheelControlElementContainer) viewM25591c;
                    g7d1 g7d1Var = new g7d1(wheelControlElementContainer, viewM85629k, textView, 1);
                    wheelControlElementContainer.setMinimumWidth(this.f275196X);
                    return new xqd1(g7d1Var);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c.getResources().getResourceName(i2)));
    }
}
