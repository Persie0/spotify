package p204p;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0110a;

/* JADX INFO: loaded from: classes3.dex */
public final class yvl0 extends d180 {
    @Override // p204p.d180
    /* JADX INFO: renamed from: d */
    public final int mo34595d(View view) {
        ojv0 ojv0Var = (ojv0) view.getLayoutParams();
        ((AbstractC0110a) this.f44187b).getClass();
        return AbstractC0110a.m1078L(view) + ((ViewGroup.MarginLayoutParams) ojv0Var).bottomMargin;
    }

    @Override // p204p.d180
    /* JADX INFO: renamed from: e */
    public final int mo34596e(View view) {
        ojv0 ojv0Var = (ojv0) view.getLayoutParams();
        ((AbstractC0110a) this.f44187b).getClass();
        return AbstractC0110a.m1080N(view) + ((ViewGroup.MarginLayoutParams) ojv0Var).topMargin + ((ViewGroup.MarginLayoutParams) ojv0Var).bottomMargin;
    }

    @Override // p204p.d180
    /* JADX INFO: renamed from: f */
    public final int mo34597f(View view) {
        ojv0 ojv0Var = (ojv0) view.getLayoutParams();
        return ((AbstractC0110a) this.f44187b).m1101O(view) + ((ViewGroup.MarginLayoutParams) ojv0Var).leftMargin + ((ViewGroup.MarginLayoutParams) ojv0Var).rightMargin;
    }

    @Override // p204p.d180
    /* JADX INFO: renamed from: g */
    public final int mo34598g(View view) {
        ojv0 ojv0Var = (ojv0) view.getLayoutParams();
        ((AbstractC0110a) this.f44187b).getClass();
        return AbstractC0110a.m1082Q(view) - ((ViewGroup.MarginLayoutParams) ojv0Var).topMargin;
    }

    @Override // p204p.d180
    /* JADX INFO: renamed from: h */
    public final int mo34599h() {
        return ((AbstractC0110a) this.f44187b).f1289N0;
    }

    @Override // p204p.d180
    /* JADX INFO: renamed from: i */
    public final int mo34600i() {
        AbstractC0110a abstractC0110a = (AbstractC0110a) this.f44187b;
        return abstractC0110a.f1289N0 - abstractC0110a.getPaddingBottom();
    }

    @Override // p204p.d180
    /* JADX INFO: renamed from: j */
    public final int mo34601j() {
        return ((AbstractC0110a) this.f44187b).getPaddingBottom();
    }

    @Override // p204p.d180
    /* JADX INFO: renamed from: k */
    public final int mo34602k() {
        return ((AbstractC0110a) this.f44187b).f1287L0;
    }

    @Override // p204p.d180
    /* JADX INFO: renamed from: l */
    public final int mo34603l() {
        return ((AbstractC0110a) this.f44187b).f1292Z;
    }

    @Override // p204p.d180
    /* JADX INFO: renamed from: m */
    public final int mo34604m() {
        return ((AbstractC0110a) this.f44187b).getPaddingTop();
    }

    @Override // p204p.d180
    /* JADX INFO: renamed from: n */
    public final int mo34605n() {
        AbstractC0110a abstractC0110a = (AbstractC0110a) this.f44187b;
        return (abstractC0110a.f1289N0 - abstractC0110a.getPaddingTop()) - abstractC0110a.getPaddingBottom();
    }

    @Override // p204p.d180
    /* JADX INFO: renamed from: p */
    public final int mo34607p(View view) {
        AbstractC0110a abstractC0110a = (AbstractC0110a) this.f44187b;
        Rect rect = (Rect) this.f44188c;
        abstractC0110a.m1110Y(rect, view);
        return rect.bottom;
    }

    @Override // p204p.d180
    /* JADX INFO: renamed from: q */
    public final int mo34608q(View view) {
        AbstractC0110a abstractC0110a = (AbstractC0110a) this.f44187b;
        Rect rect = (Rect) this.f44188c;
        abstractC0110a.m1110Y(rect, view);
        return rect.top;
    }

    @Override // p204p.d180
    /* JADX INFO: renamed from: r */
    public final void mo34609r(int i) {
        ((AbstractC0110a) this.f44187b).mo1055f0(i);
    }
}
