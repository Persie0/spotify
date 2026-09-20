package p204p;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.spotify.music.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class yhe0 implements uhd1 {

    /* JADX INFO: renamed from: X */
    public final Object f272842X;

    /* JADX INFO: renamed from: a */
    public final boolean f272843a;

    /* JADX INFO: renamed from: b */
    public boolean f272844b;

    /* JADX INFO: renamed from: c */
    public final int f272845c;

    /* JADX INFO: renamed from: d */
    public int f272846d;

    /* JADX INFO: renamed from: e */
    public final Object f272847e;

    /* JADX INFO: renamed from: f */
    public final Object f272848f;

    /* JADX INFO: renamed from: g */
    public Object f272849g;

    /* JADX INFO: renamed from: h */
    public Object f272850h;

    /* JADX INFO: renamed from: i */
    public Object f272851i;

    /* JADX INFO: renamed from: t */
    public Object f272852t;

    public yhe0(lb81 lb81Var, boolean z, boolean z2, int i, int i2, Integer num, Integer num2, th00 th00Var, gh00 gh00Var, gh00 gh00Var2, eh00 eh00Var) {
        this.f272847e = lb81Var;
        this.f272843a = z;
        this.f272844b = z2;
        this.f272845c = i;
        this.f272846d = i2;
        this.f272848f = num;
        this.f272849g = num2;
        this.f272850h = th00Var;
        this.f272851i = gh00Var;
        this.f272852t = gh00Var2;
        this.f272842X = eh00Var;
    }

    /* JADX INFO: renamed from: a */
    public whe0 m93650a() {
        Context context = (Context) this.f272847e;
        if (((whe0) this.f272851i) == null) {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            xhe0.m90969a(defaultDisplay, point);
            whe0 m9cVar = Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new m9c(context, (View) this.f272849g, this.f272845c, this.f272843a) : new pm41((Context) this.f272847e, (zge0) this.f272848f, (View) this.f272849g, this.f272845c, this.f272843a);
            m9cVar.mo61202j((zge0) this.f272848f);
            m9cVar.mo61207r((bzp) this.f272842X);
            m9cVar.mo61203l((View) this.f272849g);
            m9cVar.mo28114d((gie0) this.f272850h);
            m9cVar.mo61204o(this.f272844b);
            m9cVar.mo61205p(this.f272846d);
            this.f272851i = m9cVar;
        }
        return (whe0) this.f272851i;
    }

    /* JADX INFO: renamed from: b */
    public boolean m93651b() {
        whe0 whe0Var = (whe0) this.f272851i;
        return whe0Var != null && whe0Var.mo42574a();
    }

    /* JADX INFO: renamed from: c */
    public void mo92784c() {
        this.f272851i = null;
        PopupWindow.OnDismissListener onDismissListener = (PopupWindow.OnDismissListener) this.f272852t;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m93652d(boolean z) {
        ((gh00) this.f272852t).invoke(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: e */
    public void m93653e(int i, boolean z) {
        ((th00) this.f272850h).invoke(Integer.valueOf(i), Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: f */
    public void m93654f(boolean z) {
        ((gh00) this.f272851i).invoke(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: g */
    public void m93655g(int i, int i2, boolean z, boolean z2) {
        whe0 whe0VarM93650a = m93650a();
        whe0VarM93650a.mo61208s(z2);
        if (z) {
            int i3 = this.f272846d;
            View view = (View) this.f272849g;
            WeakHashMap weakHashMap = mec1.f142677a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                i -= ((View) this.f272849g).getWidth();
            }
            whe0VarM93650a.mo61206q(i);
            whe0VarM93650a.mo61209t(i2);
            int i4 = (int) ((((Context) this.f272847e).getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            whe0VarM93650a.f251340a = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        whe0VarM93650a.mo42575m();
    }

    public yhe0(Context context, zge0 zge0Var, View view, boolean z, int i, int i2) {
        this.f272846d = 8388611;
        this.f272842X = new bzp(this, 1);
        this.f272847e = context;
        this.f272848f = zge0Var;
        this.f272849g = view;
        this.f272843a = z;
        this.f272845c = i;
    }
}
