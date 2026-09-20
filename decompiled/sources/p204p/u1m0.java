package p204p;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes4.dex */
public final class u1m0 {

    /* JADX INFO: renamed from: a */
    public eh00 f225863a;

    /* JADX INFO: renamed from: b */
    public jp1 f225864b;

    /* JADX INFO: renamed from: c */
    public final int f225865c;

    /* JADX INFO: renamed from: d */
    public float f225866d;

    /* JADX INFO: renamed from: e */
    public float f225867e;

    /* JADX INFO: renamed from: f */
    public boolean f225868f;

    /* JADX INFO: renamed from: g */
    public boolean f225869g;

    /* JADX INFO: renamed from: h */
    public MotionEvent f225870h;

    /* JADX INFO: renamed from: i */
    public boolean f225871i;

    public u1m0(Activity activity) {
        int scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        this.f225865c = scaledTouchSlop * scaledTouchSlop;
    }
}
