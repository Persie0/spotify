package p204p;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ap91 extends xo91 {

    /* JADX INFO: renamed from: L0 */
    public final Method f17855L0;

    /* JADX INFO: renamed from: X */
    public final Method f17856X;

    /* JADX INFO: renamed from: Y */
    public final Method f17857Y;

    /* JADX INFO: renamed from: Z */
    public final Method f17858Z;

    /* JADX INFO: renamed from: h */
    public final Class f17859h;

    /* JADX INFO: renamed from: i */
    public final Constructor f17860i;

    /* JADX INFO: renamed from: t */
    public final Method f17861t;

    public ap91() throws NoSuchMethodException {
        Method methodMo26665L1;
        Constructor<?> constructor;
        Method methodM26661K1;
        Method method;
        Method method2;
        Method method3;
        super(21);
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM26661K1 = m26661K1(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo26665L1 = mo26665L1(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            methodMo26665L1 = null;
            constructor = null;
            methodM26661K1 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f17859h = cls;
        this.f17860i = constructor;
        this.f17861t = methodM26661K1;
        this.f17856X = method;
        this.f17857Y = method2;
        this.f17858Z = method3;
        this.f17855L0 = methodMo26665L1;
    }

    /* JADX INFO: renamed from: K1 */
    public static Method m26661K1(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: H1 */
    public final boolean m26662H1(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f17861t.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: I1 */
    public Typeface mo26663I1(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f17859h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f17855L0.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: J1 */
    public final boolean m26664J1(Object obj) {
        try {
            return ((Boolean) this.f17857Y.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: L1 */
    public Method mo26665L1(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p204p.xo91, p204p.AbstractC1806e9
    /* JADX INFO: renamed from: M0 */
    public final Typeface mo26666M0(Context context, xzz xzzVar, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        if (this.f17861t == null) {
            return super.mo26666M0(context, xzzVar, resources, i);
        }
        try {
            objNewInstance = this.f17860i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            yzz[] yzzVarArr = xzzVar.f267824a;
            int length = yzzVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                yzz yzzVar = yzzVarArr[i2];
                Context context2 = context;
                if (m26662H1(context2, objNewInstance, yzzVar.f277916a, yzzVar.f277920e, yzzVar.f277917b, yzzVar.f277918c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(yzzVar.f277919d))) {
                    i2++;
                    context = context2;
                } else {
                    try {
                        this.f17858Z.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            if (m26664J1(objNewInstance)) {
                return mo26663I1(objNewInstance);
            }
        }
        return null;
    }

    @Override // p204p.xo91, p204p.AbstractC1806e9
    /* JADX INFO: renamed from: N0 */
    public final Typeface mo26667N0(Context context, o000[] o000VarArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceMo26663I1;
        boolean zBooleanValue;
        if (o000VarArr.length >= 1) {
            try {
                if (this.f17861t != null) {
                    HashMap map = new HashMap();
                    for (o000 o000Var : o000VarArr) {
                        if (o000Var.f160202f == 0) {
                            Uri uri = o000Var.f160197a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, q0f1.m71822J(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f17860i.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = o000VarArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method = this.f17858Z;
                            if (i2 >= length) {
                                if (!z) {
                                    method.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!m26664J1(objNewInstance) || (typefaceMo26663I1 = mo26663I1(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceMo26663I1, i);
                            }
                            o000 o000Var2 = o000VarArr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(o000Var2.f160197a);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.f17856X.invoke(objNewInstance, byteBuffer, Integer.valueOf(o000Var2.f160198b), null, Integer.valueOf(o000Var2.f160199c), Integer.valueOf(o000Var2.f160200d ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method.invoke(objNewInstance, null);
                                    break;
                                }
                                z = true;
                            }
                            i2++;
                            z = z;
                        }
                    }
                } else {
                    o000 o000VarMo33554U0 = mo33554U0(o000VarArr, i);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(o000VarMo33554U0.f160197a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(o000VarMo33554U0.f160199c).setItalic(o000VarMo33554U0.f160200d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: Q0 */
    public final Typeface mo26668Q0(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        if (this.f17861t == null) {
            return super.mo26668Q0(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.f17860i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!m26662H1(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f17858Z.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (m26664J1(objNewInstance)) {
                return mo26663I1(objNewInstance);
            }
        }
        return null;
    }

    @Override // p204p.xo91, p204p.AbstractC1806e9
    /* JADX INFO: renamed from: S0 */
    public Typeface mo26669S0(Context context, Typeface typeface, int i, boolean z) {
        Typeface typefaceM91669a;
        try {
            typefaceM91669a = xpd1.m91669a(typeface, i, z);
        } catch (RuntimeException unused) {
            typefaceM91669a = null;
        }
        return typefaceM91669a == null ? super.mo26669S0(context, typeface, i, z) : typefaceM91669a;
    }
}
