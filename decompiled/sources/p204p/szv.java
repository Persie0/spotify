package p204p;

import com.squareup.moshi.JsonDataException;
import java.lang.Enum;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class szv<T extends Enum<T>> extends hk60<T> {

    /* JADX INFO: renamed from: a */
    final Class<T> f215678a;

    /* JADX INFO: renamed from: b */
    final String[] f215679b;

    /* JADX INFO: renamed from: c */
    final T[] f215680c;

    /* JADX INFO: renamed from: d */
    final xl60.C2578b f215681d;

    /* JADX INFO: renamed from: e */
    final boolean f215682e;

    /* JADX INFO: renamed from: f */
    final T f215683f;

    public szv(Class<T> cls, T t, boolean z) {
        this.f215678a = cls;
        this.f215683f = t;
        this.f215682e = z;
        try {
            T[] enumConstants = cls.getEnumConstants();
            this.f215680c = enumConstants;
            this.f215679b = new String[enumConstants.length];
            int i = 0;
            while (true) {
                T[] tArr = this.f215680c;
                if (i >= tArr.length) {
                    this.f215681d = xl60.C2578b.m91389a(this.f215679b);
                    return;
                } else {
                    String strName = tArr[i].name();
                    this.f215679b[i] = f0b1.m40459m(strName, cls.getField(strName));
                    i++;
                }
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T extends Enum<T>> szv<T> m79762a(Class<T> cls) {
        return new szv<>(cls, null, false);
    }

    @Override // p204p.hk60
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T fromJson(xl60 xl60Var) {
        int iMo51072L = xl60Var.mo51072L(this.f215681d);
        if (iMo51072L != -1) {
            return this.f215680c[iMo51072L];
        }
        String strM91387h = xl60Var.m91387h();
        if (this.f215682e) {
            if (xl60Var.mo51068B() == xl60.EnumC2579c.STRING) {
                xl60Var.mo51074Q();
                return this.f215683f;
            }
            throw new JsonDataException("Expected a string but was " + xl60Var.mo51068B() + " at path " + strM91387h);
        }
        throw new JsonDataException("Expected one of " + Arrays.asList(this.f215679b) + " but was " + xl60Var.mo51087y() + " at path " + strM91387h);
    }

    @Override // p204p.hk60
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void toJson(rm60 rm60Var, T t) {
        if (t == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56887N(this.f215679b[t.ordinal()]);
    }

    /* JADX INFO: renamed from: d */
    public szv<T> m79765d(T t) {
        return new szv<>(this.f215678a, t, true);
    }

    public String toString() {
        return "EnumJsonAdapter(" + this.f215678a.getName() + ")";
    }
}
