package p204p;

import android.os.Build;
import android.view.View;
import com.spotify.music.R;
import java.io.Serializable;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s2v {

    /* JADX INFO: renamed from: a */
    public int f205073a;

    /* JADX INFO: renamed from: b */
    public int f205074b;

    /* JADX INFO: renamed from: c */
    public int f205075c;

    /* JADX INFO: renamed from: d */
    public final Serializable f205076d;

    public s2v(int i, int i2, int i3, Integer num) {
        this.f205073a = i;
        this.f205074b = i2;
        this.f205075c = i3;
        this.f205076d = num;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m77097a(Boolean bool, Boolean bool2) {
        return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
    }

    /* JADX INFO: renamed from: b */
    public void m77098b() {
        if (((mec0) this.f205076d).f142674h != this.f205075c) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo77099c(View view);

    /* JADX INFO: renamed from: d */
    public abstract void mo77100d(View view, Object obj);

    /* JADX INFO: renamed from: e */
    public Object m77101e(View view) {
        if (Build.VERSION.SDK_INT >= this.f205074b) {
            return mo77099c(view);
        }
        Object tag = view.getTag(this.f205073a);
        if (((Class) this.f205076d).isInstance(tag)) {
            return tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public int m77102f() {
        return this.f205073a;
    }

    /* JADX INFO: renamed from: g */
    public int m77103g() {
        return this.f205074b;
    }

    /* JADX INFO: renamed from: h */
    public mec0 m77104h() {
        return (mec0) this.f205076d;
    }

    public boolean hasNext() {
        return this.f205073a < ((mec0) this.f205076d).f142672f;
    }

    /* JADX INFO: renamed from: i */
    public void m77105i() {
        while (true) {
            int i = this.f205073a;
            mec0 mec0Var = (mec0) this.f205076d;
            if (i >= mec0Var.f142672f || mec0Var.f142669c[i] >= 0) {
                return;
            } else {
                this.f205073a = i + 1;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m77106j(View view, Object obj) {
        C2647ze c2647ze;
        if (Build.VERSION.SDK_INT >= this.f205074b) {
            mo77100d(view, obj);
            return;
        }
        if (mo77109n(m77101e(view), obj)) {
            View.AccessibilityDelegate accessibilityDelegateM61553e = mec1.m61553e(view);
            if (accessibilityDelegateM61553e == null) {
                c2647ze = null;
            } else {
                c2647ze = accessibilityDelegateM61553e instanceof C2610ye ? ((C2610ye) accessibilityDelegateM61553e).f271884a : new C2647ze(accessibilityDelegateM61553e);
            }
            if (c2647ze == null) {
                c2647ze = new C2647ze();
            }
            mec1.m61564p(view, c2647ze);
            view.setTag(this.f205073a, obj);
            mec1.m61556h(view, this.f205075c);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m77107k(int i) {
        this.f205073a = i;
    }

    /* JADX INFO: renamed from: l */
    public void m77108l(int i) {
        this.f205074b = i;
    }

    /* JADX INFO: renamed from: n */
    public abstract boolean mo77109n(Object obj, Object obj2);

    public void remove() {
        mec0 mec0Var = (mec0) this.f205076d;
        m77098b();
        if (this.f205074b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        mec0Var.m61541c();
        mec0Var.m61548j(this.f205074b);
        this.f205074b = -1;
        this.f205075c = mec0Var.f142674h;
    }

    public s2v(mec0 mec0Var) {
        this.f205076d = mec0Var;
        this.f205074b = -1;
        this.f205075c = mec0Var.f142674h;
        m77105i();
    }

    public s2v() {
        this(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28);
    }

    public s2v(int i, Class cls, int i2, int i3) {
        this.f205073a = i;
        this.f205076d = cls;
        this.f205075c = i2;
        this.f205074b = i3;
    }
}
