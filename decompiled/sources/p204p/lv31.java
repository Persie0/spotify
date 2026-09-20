package p204p;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class lv31 {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences.Editor f137211a;

    /* JADX INFO: renamed from: b */
    public final h15 f137212b;

    /* JADX INFO: renamed from: c */
    public final boolean f137213c;

    /* JADX INFO: renamed from: d */
    public final utu0 f137214d;

    /* JADX INFO: renamed from: e */
    public boolean f137215e;

    public lv31(SharedPreferences.Editor editor, h15 h15Var, boolean z, utu0 utu0Var) {
        this.f137211a = editor;
        this.f137212b = h15Var;
        this.f137213c = z;
        this.f137214d = utu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m60048a(fv31 fv31Var, boolean z) {
        this.f137211a.putBoolean(fv31Var.f73630a, z);
        m60056i(1);
    }

    /* JADX INFO: renamed from: b */
    public final void m60049b(fv31 fv31Var, int i) {
        this.f137211a.putInt(fv31Var.f73630a, i);
        m60056i(4);
    }

    /* JADX INFO: renamed from: c */
    public final void m60050c(fv31 fv31Var, long j) {
        this.f137211a.putLong(fv31Var.f73630a, j);
        m60056i(8);
    }

    /* JADX INFO: renamed from: d */
    public final void m60051d(fv31 fv31Var, String str) {
        this.f137211a.putString(fv31Var.f73630a, str);
        m60056i(str != null ? str.length() * 2 : 0);
    }

    /* JADX INFO: renamed from: e */
    public final void m60052e(fv31 fv31Var, Set set) {
        this.f137211a.putStringSet(fv31Var.f73630a, set);
        int length = 0;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                length += ((String) it.next()).length() * 2;
            }
        }
        m60056i(length);
    }

    /* JADX INFO: renamed from: f */
    public final void m60053f(fv31 fv31Var) {
        this.f137211a.remove(fv31Var.f73630a);
        if (!this.f137213c || this.f137212b == null) {
            return;
        }
        new h751(3, 0, 0L, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m60054g() {
        if (this.f137215e) {
            throw new IllegalStateException("Must not use the same Editor instance twice");
        }
        this.f137211a.apply();
        this.f137215e = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m60055h() {
        if (this.f137215e) {
            throw new IllegalStateException("Must not use the same Editor instance twice");
        }
        boolean z = this.f137213c;
        SharedPreferences.Editor editor = this.f137211a;
        if (!z || this.f137212b == null) {
            editor.commit();
        } else {
            Object obj = this.f137214d.f233995a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            p0b1 p0b1Var = new p0b1(System.currentTimeMillis() - jCurrentTimeMillis, Boolean.valueOf(editor.commit()));
            boolean zBooleanValue = ((Boolean) p0b1Var.m68693a()).booleanValue();
            long jM68694b = p0b1Var.m68694b();
            if (!zBooleanValue) {
                int i = 2;
                new h751(i, 0, jM68694b, new f751("fail when committing sharedpreferences", 1));
            }
        }
        this.f137215e = true;
    }

    /* JADX INFO: renamed from: i */
    public final void m60056i(int i) {
        if (!this.f137213c || this.f137212b == null) {
            return;
        }
        new h751(2, i, 0L, null);
    }
}
