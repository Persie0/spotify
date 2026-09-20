package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import p204p.b2u0;
import p204p.d6j;
import p204p.edb;
import p204p.mif1;
import p204p.pt60;
import p204p.wu60;

/* JADX INFO: loaded from: classes3.dex */
public class KeyTrigger extends pt60 {

    /* JADX INFO: renamed from: w */
    public float f631w;

    /* JADX INFO: renamed from: e */
    public float f613e = 0.1f;

    /* JADX INFO: renamed from: f */
    public int f614f = -1;

    /* JADX INFO: renamed from: g */
    public int f615g = -1;

    /* JADX INFO: renamed from: h */
    public int f616h = -1;

    /* JADX INFO: renamed from: i */
    public RectF f617i = new RectF();

    /* JADX INFO: renamed from: j */
    public RectF f618j = new RectF();

    /* JADX INFO: renamed from: k */
    public HashMap f619k = new HashMap();

    /* JADX INFO: renamed from: l */
    public String f620l = null;

    /* JADX INFO: renamed from: m */
    public int f621m = -1;

    /* JADX INFO: renamed from: n */
    public String f622n = null;

    /* JADX INFO: renamed from: o */
    public String f623o = null;

    /* JADX INFO: renamed from: p */
    public int f624p = -1;

    /* JADX INFO: renamed from: q */
    public int f625q = -1;

    /* JADX INFO: renamed from: r */
    public View f626r = null;

    /* JADX INFO: renamed from: s */
    public boolean f627s = true;

    /* JADX INFO: renamed from: t */
    public boolean f628t = true;

    /* JADX INFO: renamed from: u */
    public boolean f629u = true;

    /* JADX INFO: renamed from: v */
    public float f630v = Float.NaN;

    /* JADX INFO: renamed from: x */
    public boolean f632x = false;

    public KeyTrigger() {
        this.f181056d = new HashMap();
    }

    /* JADX INFO: renamed from: i */
    public static void m323i(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // p204p.pt60
    /* JADX INFO: renamed from: a */
    public final void mo316a(HashMap map) {
        throw null;
    }

    @Override // p204p.pt60
    /* JADX INFO: renamed from: b */
    public final pt60 clone() {
        KeyTrigger keyTrigger = new KeyTrigger();
        super.m70909c(this);
        keyTrigger.f620l = this.f620l;
        keyTrigger.f621m = this.f621m;
        keyTrigger.f622n = this.f622n;
        keyTrigger.f623o = this.f623o;
        keyTrigger.f624p = this.f624p;
        keyTrigger.f625q = this.f625q;
        keyTrigger.f626r = this.f626r;
        keyTrigger.f613e = this.f613e;
        keyTrigger.f627s = this.f627s;
        keyTrigger.f628t = this.f628t;
        keyTrigger.f629u = this.f629u;
        keyTrigger.f630v = this.f630v;
        keyTrigger.f631w = this.f631w;
        keyTrigger.f632x = this.f632x;
        keyTrigger.f617i = this.f617i;
        keyTrigger.f618j = this.f618j;
        keyTrigger.f619k = this.f619k;
        return keyTrigger;
    }

    @Override // p204p.pt60
    /* JADX INFO: renamed from: d */
    public final void mo318d(HashSet hashSet) {
    }

    @Override // p204p.pt60
    /* JADX INFO: renamed from: e */
    public final void mo319e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b2u0.f22705i);
        SparseIntArray sparseIntArray = wu60.f255112a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = wu60.f255112a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f622n = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.f623o = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.f620l = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.f613e = typedArrayObtainStyledAttributes.getFloat(index, this.f613e);
                    break;
                case 6:
                    this.f624p = typedArrayObtainStyledAttributes.getResourceId(index, this.f624p);
                    break;
                case 7:
                    if (MotionLayout.f633V1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f181054b);
                        this.f181054b = resourceId;
                        if (resourceId == -1) {
                            this.f181055c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f181055c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f181054b = typedArrayObtainStyledAttributes.getResourceId(index, this.f181054b);
                    }
                    break;
                case 8:
                    int integer = typedArrayObtainStyledAttributes.getInteger(index, this.f181053a);
                    this.f181053a = integer;
                    this.f630v = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.f625q = typedArrayObtainStyledAttributes.getResourceId(index, this.f625q);
                    break;
                case 10:
                    this.f632x = typedArrayObtainStyledAttributes.getBoolean(index, this.f632x);
                    break;
                case 11:
                    this.f621m = typedArrayObtainStyledAttributes.getResourceId(index, this.f621m);
                    break;
                case 12:
                    this.f616h = typedArrayObtainStyledAttributes.getResourceId(index, this.f616h);
                    break;
                case 13:
                    this.f614f = typedArrayObtainStyledAttributes.getResourceId(index, this.f614f);
                    break;
                case 14:
                    this.f615g = typedArrayObtainStyledAttributes.getResourceId(index, this.f615g);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d7  */
    /* JADX INFO: renamed from: g */
    public final void m324g(View view, float f) {
        boolean z;
        boolean z2;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        boolean z6 = false;
        if (this.f625q != -1) {
            if (this.f626r == null) {
                this.f626r = ((ViewGroup) view.getParent()).findViewById(this.f625q);
            }
            m323i(this.f617i, this.f626r, this.f632x);
            m323i(this.f618j, view, this.f632x);
            if (this.f617i.intersect(this.f618j)) {
                if (this.f627s) {
                    this.f627s = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.f629u) {
                    this.f629u = false;
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f628t = true;
            } else {
                if (this.f627s) {
                    z = false;
                } else {
                    this.f627s = true;
                    z = true;
                }
                if (this.f628t) {
                    this.f628t = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f629u = true;
                boolean z7 = z3;
                z4 = false;
                z6 = z7;
            }
            z5 = z4;
        } else {
            if (this.f627s) {
                float f6 = this.f630v;
                if ((this.f631w - f6) * (f - f6) < 0.0f) {
                    this.f627s = false;
                    z = true;
                }
                if (this.f628t) {
                    f4 = this.f630v;
                    f5 = f - f4;
                    if ((this.f631w - f4) * f5 >= 0.0f && f5 < 0.0f) {
                        this.f628t = false;
                        z2 = true;
                    }
                    if (this.f629u) {
                        f2 = this.f630v;
                        f3 = f - f2;
                        if ((this.f631w - f2) * f3 >= 0.0f && f3 > 0.0f) {
                            this.f629u = false;
                        }
                        z6 = z2;
                    } else if (Math.abs(f - this.f630v) > this.f613e) {
                        this.f629u = true;
                    }
                    z5 = false;
                    z6 = z2;
                } else if (Math.abs(f - this.f630v) > this.f613e) {
                    this.f628t = true;
                }
                z2 = false;
                if (this.f629u) {
                    f2 = this.f630v;
                    f3 = f - f2;
                    if ((this.f631w - f2) * f3 >= 0.0f) {
                    }
                    z6 = z2;
                } else if (Math.abs(f - this.f630v) > this.f613e) {
                    this.f629u = true;
                }
                z5 = false;
                z6 = z2;
            } else if (Math.abs(f - this.f630v) > this.f613e) {
                this.f627s = true;
            }
            z = false;
            if (this.f628t) {
                f4 = this.f630v;
                f5 = f - f4;
                if ((this.f631w - f4) * f5 >= 0.0f) {
                }
                if (this.f629u) {
                    f2 = this.f630v;
                    f3 = f - f2;
                    if ((this.f631w - f2) * f3 >= 0.0f) {
                    }
                    z6 = z2;
                } else if (Math.abs(f - this.f630v) > this.f613e) {
                    this.f629u = true;
                }
                z5 = false;
                z6 = z2;
            } else if (Math.abs(f - this.f630v) > this.f613e) {
                this.f628t = true;
            }
            z2 = false;
            if (this.f629u) {
                f2 = this.f630v;
                f3 = f - f2;
                if ((this.f631w - f2) * f3 >= 0.0f) {
                }
                z6 = z2;
            } else if (Math.abs(f - this.f630v) > this.f613e) {
                this.f629u = true;
            }
            z5 = false;
            z6 = z2;
        }
        this.f631w = f;
        if (z6 || z || z5) {
            ((MotionLayout) view.getParent()).getClass();
        }
        View viewFindViewById = this.f621m == -1 ? view : ((MotionLayout) view.getParent()).findViewById(this.f621m);
        if (z6) {
            String str = this.f622n;
            if (str != null) {
                m325h(viewFindViewById, str);
            }
            if (this.f614f != -1) {
                ((MotionLayout) view.getParent()).m343R(this.f614f, viewFindViewById);
            }
        }
        if (z5) {
            String str2 = this.f623o;
            if (str2 != null) {
                m325h(viewFindViewById, str2);
            }
            if (this.f615g != -1) {
                ((MotionLayout) view.getParent()).m343R(this.f615g, viewFindViewById);
            }
        }
        if (z) {
            String str3 = this.f620l;
            if (str3 != null) {
                m325h(viewFindViewById, str3);
            }
            if (this.f616h != -1) {
                ((MotionLayout) view.getParent()).m343R(this.f616h, viewFindViewById);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m325h(View view, String str) {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
            if (this.f619k.containsKey(str)) {
                method = (Method) this.f619k.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, null);
                    this.f619k.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f619k.put(str, null);
                    view.getClass();
                    mif1.m61891z(view);
                    return;
                }
            }
            try {
                method.invoke(view, null);
                return;
            } catch (Exception unused2) {
                view.getClass();
                mif1.m61891z(view);
                return;
            }
        }
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f181056d.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                d6j d6jVar = (d6j) this.f181056d.get(str2);
                if (d6jVar != null) {
                    Class<?> cls = view.getClass();
                    String strM38564m = d6jVar.f45705b;
                    if (!d6jVar.f45704a) {
                        strM38564m = edb.m38564m("set", strM38564m);
                    }
                    try {
                        int iM38547C = edb.m38547C(d6jVar.f45706c);
                        Class cls2 = Integer.TYPE;
                        Class cls3 = Float.TYPE;
                        switch (iM38547C) {
                            case 0:
                            case 7:
                                cls.getMethod(strM38564m, cls2).invoke(view, Integer.valueOf(d6jVar.f45707d));
                                break;
                            case 1:
                                cls.getMethod(strM38564m, cls3).invoke(view, Float.valueOf(d6jVar.f45708e));
                                break;
                            case 2:
                                cls.getMethod(strM38564m, cls2).invoke(view, Integer.valueOf(d6jVar.f45711h));
                                break;
                            case 3:
                                Method method2 = cls.getMethod(strM38564m, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(d6jVar.f45711h);
                                method2.invoke(view, colorDrawable);
                                break;
                            case 4:
                                cls.getMethod(strM38564m, CharSequence.class).invoke(view, d6jVar.f45709f);
                                break;
                            case 5:
                                cls.getMethod(strM38564m, Boolean.TYPE).invoke(view, Boolean.valueOf(d6jVar.f45710g));
                                break;
                            case 6:
                                cls.getMethod(strM38564m, cls3).invoke(view, Float.valueOf(d6jVar.f45708e));
                                break;
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused3) {
                    }
                }
            }
        }
    }
}
