package p204p;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class imk0 extends kv30 implements tv30 {

    /* JADX INFO: renamed from: l */
    public final Object f103724l;

    public imk0(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 4);
        this.f103724l = obj;
    }

    /* JADX INFO: renamed from: c2 */
    public static tv30 m51105c2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof tv30 ? (tv30) iInterfaceQueryLocalInterface : new lif1(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 2);
    }

    /* JADX INFO: renamed from: d2 */
    public static Object m51106d2(tv30 tv30Var) {
        if (tv30Var instanceof imk0) {
            return ((imk0) tv30Var).f103724l;
        }
        IBinder iBinderAsBinder = tv30Var.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            throw new IllegalArgumentException(s571.m77248g(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
        }
        ig31.m50506x(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
