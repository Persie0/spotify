package p204p;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class ojv0 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public dkv0 f166147a;

    /* JADX INFO: renamed from: b */
    public final Rect f166148b;

    /* JADX INFO: renamed from: c */
    public boolean f166149c;

    /* JADX INFO: renamed from: d */
    public boolean f166150d;

    public ojv0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166148b = new Rect();
        this.f166149c = true;
        this.f166150d = false;
    }

    public ojv0(int i, int i2) {
        super(i, i2);
        this.f166148b = new Rect();
        this.f166149c = true;
        this.f166150d = false;
    }

    public ojv0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f166148b = new Rect();
        this.f166149c = true;
        this.f166150d = false;
    }

    public ojv0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f166148b = new Rect();
        this.f166149c = true;
        this.f166150d = false;
    }

    public ojv0(ojv0 ojv0Var) {
        super((ViewGroup.LayoutParams) ojv0Var);
        this.f166148b = new Rect();
        this.f166149c = true;
        this.f166150d = false;
    }
}
