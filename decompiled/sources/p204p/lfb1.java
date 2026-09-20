package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lfb1 {

    /* JADX INFO: renamed from: a */
    public final uj5 f132884a;

    /* JADX INFO: renamed from: b */
    public final uj5 f132885b;

    /* JADX INFO: renamed from: c */
    public final uj5 f132886c;

    public lfb1(uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3) {
        this.f132884a = uj5Var;
        this.f132885b = uj5Var2;
        this.f132886c = uj5Var3;
    }

    /* JADX INFO: renamed from: a */
    public abstract mfb1 mo58850a();

    /* JADX INFO: renamed from: b */
    public final Class m58851b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        uj5 uj5Var = this.f132886c;
        Class cls2 = (Class) uj5Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(s571.m77252k(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        uj5Var.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: c */
    public final Method m58852c(String str) throws NoSuchMethodException {
        uj5 uj5Var = this.f132884a;
        Method method = (Method) uj5Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, lfb1.class.getClassLoader()).getDeclaredMethod("read", lfb1.class);
        uj5Var.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: d */
    public final Method m58853d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        uj5 uj5Var = this.f132885b;
        Method method = (Method) uj5Var.get(name);
        if (method != null) {
            return method;
        }
        Class clsM58851b = m58851b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM58851b.getDeclaredMethod("write", cls, lfb1.class);
        uj5Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo58854e(int i);

    /* JADX INFO: renamed from: f */
    public final int m58855f(int i, int i2) {
        return !mo58854e(i2) ? i : ((mfb1) this).f143021e.readInt();
    }

    /* JADX INFO: renamed from: g */
    public final Parcelable m58856g(int i, Parcelable parcelable) {
        if (!mo58854e(i)) {
            return parcelable;
        }
        return ((mfb1) this).f143021e.readParcelable(mfb1.class.getClassLoader());
    }

    /* JADX INFO: renamed from: h */
    public final nfb1 m58857h() {
        String string = ((mfb1) this).f143021e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (nfb1) m58852c(string).invoke(null, mo58850a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo58858i(int i);

    /* JADX INFO: renamed from: j */
    public final void m58859j(int i, int i2) {
        mo58858i(i2);
        ((mfb1) this).f143021e.writeInt(i);
    }

    /* JADX INFO: renamed from: k */
    public final void m58860k(int i, Parcelable parcelable) {
        mo58858i(i);
        ((mfb1) this).f143021e.writeParcelable(parcelable, 0);
    }

    /* JADX INFO: renamed from: l */
    public final void m58861l(nfb1 nfb1Var) {
        if (nfb1Var == null) {
            ((mfb1) this).f143021e.writeString(null);
            return;
        }
        try {
            ((mfb1) this).f143021e.writeString(m58851b(nfb1Var.getClass()).getName());
            mfb1 mfb1VarMo58850a = mo58850a();
            try {
                m58853d(nfb1Var.getClass()).invoke(null, nfb1Var, mfb1VarMo58850a);
                Parcel parcel = mfb1VarMo58850a.f143021e;
                int i = mfb1VarMo58850a.f143025i;
                if (i >= 0) {
                    int i2 = mfb1VarMo58850a.f143020d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(nfb1Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
