package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hqk extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public eqk f94198a;

    /* JADX INFO: renamed from: b */
    public boolean f94199b;

    /* JADX INFO: renamed from: c */
    public int f94200c;

    /* JADX INFO: renamed from: d */
    public int f94201d;

    /* JADX INFO: renamed from: e */
    public final int f94202e;

    /* JADX INFO: renamed from: f */
    public int f94203f;

    /* JADX INFO: renamed from: g */
    public int f94204g;

    /* JADX INFO: renamed from: h */
    public int f94205h;

    /* JADX INFO: renamed from: i */
    public int f94206i;

    /* JADX INFO: renamed from: j */
    public int f94207j;

    /* JADX INFO: renamed from: k */
    public View f94208k;

    /* JADX INFO: renamed from: l */
    public View f94209l;

    /* JADX INFO: renamed from: m */
    public boolean f94210m;

    /* JADX INFO: renamed from: n */
    public boolean f94211n;

    /* JADX INFO: renamed from: o */
    public boolean f94212o;

    /* JADX INFO: renamed from: p */
    public final Rect f94213p;

    public hqk(int i, int i2) {
        super(i, i2);
        this.f94199b = false;
        this.f94200c = 0;
        this.f94201d = 0;
        this.f94202e = -1;
        this.f94203f = -1;
        this.f94204g = 0;
        this.f94205h = 0;
        this.f94213p = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m48292a(int i) {
        if (i == 0) {
            return this.f94210m;
        }
        if (i != 1) {
            return false;
        }
        return this.f94211n;
    }

    /* JADX INFO: renamed from: b */
    public final void m48293b(eqk eqkVar) {
        eqk eqkVar2 = this.f94198a;
        if (eqkVar2 != eqkVar) {
            if (eqkVar2 != null) {
                eqkVar2.mo1588f();
            }
            this.f94198a = eqkVar;
            this.f94199b = true;
            if (eqkVar != null) {
                eqkVar.mo1587c(this);
            }
        }
    }

    public hqk(Context context, AttributeSet attributeSet) {
        eqk eqkVar;
        super(context, attributeSet);
        this.f94199b = false;
        this.f94200c = 0;
        this.f94201d = 0;
        this.f94202e = -1;
        this.f94203f = -1;
        this.f94204g = 0;
        this.f94205h = 0;
        this.f94213p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m2u0.f139465b);
        this.f94200c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f94203f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f94201d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f94202e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f94204g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f94205h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f94199b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f744U0;
            if (TextUtils.isEmpty(string)) {
                eqkVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f744U0;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f746W0;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f745V0);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    eqkVar = (eqk) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(edb.m38564m("Could not inflate Behavior subclass ", string), e);
                }
            }
            this.f94198a = eqkVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        eqk eqkVar2 = this.f94198a;
        if (eqkVar2 != null) {
            eqkVar2.mo1587c(this);
        }
    }

    public hqk(hqk hqkVar) {
        super((ViewGroup.MarginLayoutParams) hqkVar);
        this.f94199b = false;
        this.f94200c = 0;
        this.f94201d = 0;
        this.f94202e = -1;
        this.f94203f = -1;
        this.f94204g = 0;
        this.f94205h = 0;
        this.f94213p = new Rect();
    }

    public hqk(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f94199b = false;
        this.f94200c = 0;
        this.f94201d = 0;
        this.f94202e = -1;
        this.f94203f = -1;
        this.f94204g = 0;
        this.f94205h = 0;
        this.f94213p = new Rect();
    }

    public hqk(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f94199b = false;
        this.f94200c = 0;
        this.f94201d = 0;
        this.f94202e = -1;
        this.f94203f = -1;
        this.f94204g = 0;
        this.f94205h = 0;
        this.f94213p = new Rect();
    }
}
