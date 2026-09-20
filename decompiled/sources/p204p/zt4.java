package p204p;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class zt4 implements pec1 {

    /* JADX INFO: renamed from: a */
    public final ViewConfiguration f286050a;

    public zt4(ViewConfiguration viewConfiguration) {
        this.f286050a = viewConfiguration;
    }

    @Override // p204p.pec1
    /* JADX INFO: renamed from: a */
    public final long mo51230a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // p204p.pec1
    /* JADX INFO: renamed from: b */
    public final long mo51231b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // p204p.pec1
    /* JADX INFO: renamed from: c */
    public final float mo69718c() {
        return this.f286050a.getScaledMinimumFlingVelocity();
    }

    @Override // p204p.pec1
    /* JADX INFO: renamed from: d */
    public final float mo69719d() {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC1665af.m25790u(this.f286050a);
        }
        return 2.0f;
    }

    @Override // p204p.pec1
    /* JADX INFO: renamed from: f */
    public final float mo69720f() {
        return this.f286050a.getScaledMaximumFlingVelocity();
    }

    @Override // p204p.pec1
    /* JADX INFO: renamed from: g */
    public final float mo51233g() {
        return this.f286050a.getScaledTouchSlop();
    }

    @Override // p204p.pec1
    /* JADX INFO: renamed from: h */
    public final float mo69721h() {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC1665af.m25789t(this.f286050a);
        }
        return 16.0f;
    }
}
