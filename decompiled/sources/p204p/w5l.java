package p204p;

import android.app.Activity;
import android.os.Bundle;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w5l {

    /* JADX INFO: renamed from: e */
    public static long f248106e = -1;

    /* JADX INFO: renamed from: a */
    public Object f248107a;

    /* JADX INFO: renamed from: b */
    public Object f248108b;

    /* JADX INFO: renamed from: c */
    public Object f248109c;

    /* JADX INFO: renamed from: d */
    public final Object f248110d;

    public w5l() {
        this.f248110d = new ArrayList();
    }

    /* JADX INFO: renamed from: e */
    public static long m87247e(View view) {
        Field field = ylq.f274073a;
        if (f248106e < 0) {
            Window window = (view != null ? view.getContext() : null) instanceof Activity ? ((Activity) view.getContext()).getWindow() : null;
            float f = 60.0f;
            float refreshRate = window != null ? window.getWindowManager().getDefaultDisplay().getRefreshRate() : 60.0f;
            if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
                f = refreshRate;
            }
            f248106e = (long) ((1000 / f) * 1000000);
        }
        return f248106e;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public rt91 m87248a() {
        ArrayList arrayList = (ArrayList) this.f248110d;
        st91 st91Var = (st91) this.f248108b;
        if (st91Var == null) {
            st91Var = st91.f213865b;
        }
        st91 st91Var2 = st91Var;
        zt91 zt91Var = (zt91) this.f248107a;
        if (zt91Var != null) {
            arrayList.addAll(zt91Var.mo30507a());
            ArrayList arrayListM66850s = ofg1.m66850s(st91Var2.f213866a);
            if (!arrayListM66850s.isEmpty()) {
                arrayList.addAll(arrayListM66850s);
            }
            Long l = (Long) this.f248109c;
            return mo65684b(zt91Var, st91Var2, l != null ? l.longValue() : 0L, arrayList);
        }
        long jLongValue = 0;
        zt91 zt91Var2 = zt91.f286105i;
        Long l2 = (Long) this.f248109c;
        if (l2 != null) {
            jLongValue = l2.longValue();
        }
        arrayList.add("No location!");
        return mo65684b(zt91Var2, st91Var2, jLongValue, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public abstract rt91 mo65684b(zt91 zt91Var, st91 st91Var, long j, ArrayList arrayList);

    /* JADX INFO: renamed from: c */
    public void m87249c(long j) {
        this.f248109c = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: d */
    public WeakReference m87250d() {
        return (WeakReference) this.f248107a;
    }

    /* JADX INFO: renamed from: f */
    public long mo77765f(FrameMetrics frameMetrics) {
        Field field = ylq.f274073a;
        return ((Long) ylq.f274073a.get((Choreographer) this.f248108b)).longValue();
    }

    /* JADX INFO: renamed from: g */
    public tln0 m87251g() {
        return (tln0) this.f248109c;
    }

    /* JADX INFO: renamed from: h */
    public ArrayList m87252h() {
        return (ArrayList) this.f248110d;
    }

    /* JADX INFO: renamed from: i */
    public void m87253i(zt91 zt91Var) {
        this.f248107a = zt91Var;
    }

    /* JADX INFO: renamed from: j */
    public void m87254j(st91 st91Var) {
        this.f248108b = st91Var;
    }

    public w5l(pc60 pc60Var, View view) {
        this.f248107a = new WeakReference(view);
        this.f248108b = Choreographer.getInstance();
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        Object tag = view.getTag(R.id.metricsStateHolder);
        if (tag == null) {
            tag = new tln0();
            view.setTag(R.id.metricsStateHolder, tag);
        }
        this.f248109c = (tln0) tag;
        ArrayList arrayList = new ArrayList();
        this.f248110d = arrayList;
        new i900(arrayList);
    }

    public w5l(String str, Bundle bundle, Bundle bundle2, sti stiVar) {
        this.f248107a = str;
        this.f248108b = bundle;
        this.f248109c = bundle2;
        this.f248110d = stiVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
