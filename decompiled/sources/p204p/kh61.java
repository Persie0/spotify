package p204p;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class kh61 implements bc20 {

    /* JADX INFO: renamed from: b */
    public static final ArrayList f122535b = new ArrayList(50);

    /* JADX INFO: renamed from: a */
    public final Handler f122536a;

    public kh61(Handler handler) {
        this.f122536a = handler;
    }

    /* JADX INFO: renamed from: e */
    public static jh61 m56383e() {
        jh61 jh61Var;
        ArrayList arrayList = f122535b;
        synchronized (arrayList) {
            try {
                jh61Var = arrayList.isEmpty() ? new jh61() : (jh61) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jh61Var;
    }

    /* JADX INFO: renamed from: a */
    public final jh61 m56384a(int i) {
        jh61 jh61VarM56383e = m56383e();
        jh61VarM56383e.f112345a = this.f122536a.obtainMessage(i);
        return jh61VarM56383e;
    }

    /* JADX INFO: renamed from: b */
    public final jh61 m56385b(int i, int i2, int i3) {
        jh61 jh61VarM56383e = m56383e();
        jh61VarM56383e.f112345a = this.f122536a.obtainMessage(i, i2, i3);
        return jh61VarM56383e;
    }

    /* JADX INFO: renamed from: c */
    public final jh61 m56386c(int i, int i2, Object obj, int i3) {
        jh61 jh61VarM56383e = m56383e();
        jh61VarM56383e.f112345a = this.f122536a.obtainMessage(i, i2, i3, obj);
        return jh61VarM56383e;
    }

    /* JADX INFO: renamed from: d */
    public final jh61 m56387d(int i, Object obj) {
        jh61 jh61VarM56383e = m56383e();
        jh61VarM56383e.f112345a = this.f122536a.obtainMessage(i, obj);
        return jh61VarM56383e;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m56388f(Runnable runnable) {
        return this.f122536a.post(runnable);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m56389g(Runnable runnable, long j) {
        return this.f122536a.postDelayed(runnable, j);
    }

    /* JADX INFO: renamed from: h */
    public final void m56390h() {
        this.f122536a.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: i */
    public final void m56391i(int i) {
        c95.m31843i(i != 0);
        this.f122536a.removeMessages(i);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m56392j(int i) {
        return this.f122536a.sendEmptyMessage(i);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m56393k(int i, int i2) {
        return this.f122536a.sendEmptyMessageDelayed(i, i2);
    }
}
