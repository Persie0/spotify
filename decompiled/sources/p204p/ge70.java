package p204p;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public final class ge70 implements sxf {

    /* JADX INFO: renamed from: a */
    public final xr50 f79041a;

    /* JADX INFO: renamed from: b */
    public final TextView f79042b;

    /* JADX INFO: renamed from: c */
    public final int f79043c;

    /* JADX INFO: renamed from: d */
    public final int f79044d;

    /* JADX INFO: renamed from: e */
    public final int f79045e;

    /* JADX INFO: renamed from: f */
    public final int f79046f;

    /* JADX INFO: renamed from: g */
    public final int f79047g;

    /* JADX INFO: renamed from: h */
    public final int f79048h;

    public ge70(xr50 xr50Var) {
        this.f79041a = xr50Var;
        TextView textView = xr50Var.f265268b;
        this.f79042b = textView;
        TextView textView2 = xr50Var.f265269c;
        this.f79043c = textView2.getMaxLines();
        this.f79044d = textView2.getTextAlignment();
        this.f79045e = textView.getPaddingStart();
        this.f79046f = textView.getPaddingEnd();
        this.f79047g = textView.getPaddingTop();
        this.f79048h = textView.getPaddingBottom();
    }

    @Override // p204p.clc1
    public final View getView() {
        return this.f79042b;
    }
}
