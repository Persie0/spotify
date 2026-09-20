package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class d6j {

    /* JADX INFO: renamed from: a */
    public boolean f45704a = false;

    /* JADX INFO: renamed from: b */
    public String f45705b;

    /* JADX INFO: renamed from: c */
    public int f45706c;

    /* JADX INFO: renamed from: d */
    public int f45707d;

    /* JADX INFO: renamed from: e */
    public float f45708e;

    /* JADX INFO: renamed from: f */
    public String f45709f;

    /* JADX INFO: renamed from: g */
    public boolean f45710g;

    /* JADX INFO: renamed from: h */
    public int f45711h;

    public d6j(d6j d6jVar, Object obj) {
        this.f45705b = d6jVar.f45705b;
        this.f45706c = d6jVar.f45706c;
        m35121g(obj);
    }

    /* JADX INFO: renamed from: a */
    public static HashMap m35115a(View view, HashMap map) {
        HashMap map2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            d6j d6jVar = (d6j) map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new d6j(d6jVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new d6j(d6jVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: e */
    public static void m35116e(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), b2u0.f22700d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i = 0;
        boolean z = false;
        Object objValueOf = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i4 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i4 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i4 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i3 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i3;
                            }
                        }
                        i = 7;
                    }
                }
                i = i4;
            }
        }
        if (string != null && objValueOf != null) {
            d6j d6jVar = new d6j();
            d6jVar.f45705b = string;
            d6jVar.f45706c = i;
            d6jVar.f45704a = z;
            d6jVar.m35121g(objValueOf);
            map.put(string, d6jVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: f */
    public static void m35117f(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String strM38564m : map.keySet()) {
            d6j d6jVar = (d6j) map.get(strM38564m);
            if (!d6jVar.f45704a) {
                strM38564m = edb.m38564m("set", strM38564m);
            }
            try {
                int iM38547C = edb.m38547C(d6jVar.f45706c);
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (iM38547C) {
                    case 0:
                        cls.getMethod(strM38564m, cls3).invoke(view, Integer.valueOf(d6jVar.f45707d));
                        break;
                    case 1:
                        cls.getMethod(strM38564m, cls2).invoke(view, Float.valueOf(d6jVar.f45708e));
                        break;
                    case 2:
                        cls.getMethod(strM38564m, cls3).invoke(view, Integer.valueOf(d6jVar.f45711h));
                        break;
                    case 3:
                        Method method = cls.getMethod(strM38564m, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(d6jVar.f45711h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(strM38564m, CharSequence.class).invoke(view, d6jVar.f45709f);
                        break;
                    case 5:
                        cls.getMethod(strM38564m, Boolean.TYPE).invoke(view, Boolean.valueOf(d6jVar.f45710g));
                        break;
                    case 6:
                        cls.getMethod(strM38564m, cls2).invoke(view, Float.valueOf(d6jVar.f45708e));
                        break;
                    case 7:
                        cls.getMethod(strM38564m, cls3).invoke(view, Integer.valueOf(d6jVar.f45707d));
                        break;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m35118b() {
        switch (edb.m38547C(this.f45706c)) {
            case 0:
                return this.f45707d;
            case 1:
            case 6:
                return this.f45708e;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.f45710g ? 1.0f : 0.0f;
            default:
                return Float.NaN;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m35119c(float[] fArr) {
        switch (edb.m38547C(this.f45706c)) {
            case 0:
                fArr[0] = this.f45707d;
                return;
            case 1:
                fArr[0] = this.f45708e;
                return;
            case 2:
            case 3:
                int i = this.f45711h;
                int i2 = (i >> 24) & 255;
                float fPow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i2 / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                fArr[0] = this.f45710g ? 1.0f : 0.0f;
                return;
            case 6:
                fArr[0] = this.f45708e;
                return;
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m35120d() {
        int iM38547C = edb.m38547C(this.f45706c);
        return (iM38547C == 2 || iM38547C == 3) ? 4 : 1;
    }

    /* JADX INFO: renamed from: g */
    public final void m35121g(Object obj) {
        switch (edb.m38547C(this.f45706c)) {
            case 0:
            case 7:
                this.f45707d = ((Integer) obj).intValue();
                break;
            case 1:
                this.f45708e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f45711h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f45709f = (String) obj;
                break;
            case 5:
                this.f45710g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f45708e = ((Float) obj).floatValue();
                break;
        }
    }
}
