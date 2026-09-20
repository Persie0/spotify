package p204p;

import com.squareup.moshi.JsonDataException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
abstract class nm41 {

    /* JADX INFO: renamed from: a */
    public static final hk60.InterfaceC1945e f155277a = new C2172c();

    /* JADX INFO: renamed from: b */
    static final hk60<Boolean> f155278b = new C2173d();

    /* JADX INFO: renamed from: c */
    static final hk60<Byte> f155279c = new C2174e();

    /* JADX INFO: renamed from: d */
    static final hk60<Character> f155280d = new C2175f();

    /* JADX INFO: renamed from: e */
    static final hk60<Double> f155281e = new C2176g();

    /* JADX INFO: renamed from: f */
    static final hk60<Float> f155282f = new C2177h();

    /* JADX INFO: renamed from: g */
    static final hk60<Integer> f155283g = new C2178i();

    /* JADX INFO: renamed from: h */
    static final hk60<Long> f155284h = new C2179j();

    /* JADX INFO: renamed from: i */
    static final hk60<Short> f155285i = new C2180k();

    /* JADX INFO: renamed from: j */
    static final hk60<String> f155286j = new C2170a();

    /* JADX INFO: renamed from: p.nm41$a */
    public class C2170a extends hk60<String> {
        public String toString() {
            return "JsonAdapter(String)";
        }

        @Override // p204p.hk60
        public String fromJson(xl60 xl60Var) {
            return xl60Var.mo51087y();
        }

        @Override // p204p.hk60
        public void toJson(rm60 rm60Var, String str) {
            rm60Var.mo56887N(str);
        }
    }

    /* JADX INFO: renamed from: p.nm41$b */
    public static /* synthetic */ class C2171b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f155287a;

        static {
            int[] iArr = new int[xl60.EnumC2579c.values().length];
            f155287a = iArr;
            try {
                iArr[xl60.EnumC2579c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f155287a[xl60.EnumC2579c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f155287a[xl60.EnumC2579c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f155287a[xl60.EnumC2579c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f155287a[xl60.EnumC2579c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f155287a[xl60.EnumC2579c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: p.nm41$c */
    public class C2172c implements hk60.InterfaceC1945e {
        @Override // p204p.hk60.InterfaceC1945e
        public hk60<?> create(Type type, Set<? extends Annotation> set, p0i0 p0i0Var) throws NoSuchMethodException {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return nm41.f155278b;
            }
            if (type == Byte.TYPE) {
                return nm41.f155279c;
            }
            if (type == Character.TYPE) {
                return nm41.f155280d;
            }
            if (type == Double.TYPE) {
                return nm41.f155281e;
            }
            if (type == Float.TYPE) {
                return nm41.f155282f;
            }
            if (type == Integer.TYPE) {
                return nm41.f155283g;
            }
            if (type == Long.TYPE) {
                return nm41.f155284h;
            }
            if (type == Short.TYPE) {
                return nm41.f155285i;
            }
            if (type == Boolean.class) {
                return nm41.f155278b.nullSafe();
            }
            if (type == Byte.class) {
                return nm41.f155279c.nullSafe();
            }
            if (type == Character.class) {
                return nm41.f155280d.nullSafe();
            }
            if (type == Double.class) {
                return nm41.f155281e.nullSafe();
            }
            if (type == Float.class) {
                return nm41.f155282f.nullSafe();
            }
            if (type == Integer.class) {
                return nm41.f155283g.nullSafe();
            }
            if (type == Long.class) {
                return nm41.f155284h.nullSafe();
            }
            if (type == Short.class) {
                return nm41.f155285i.nullSafe();
            }
            if (type == String.class) {
                return nm41.f155286j.nullSafe();
            }
            if (type == Object.class) {
                return new C2182m(p0i0Var).nullSafe();
            }
            Class<?> clsM62454g = mp91.m62454g(type);
            hk60<?> hk60VarM40450d = f0b1.m40450d(p0i0Var, type, clsM62454g);
            if (hk60VarM40450d != null) {
                return hk60VarM40450d;
            }
            if (clsM62454g.isEnum()) {
                return new C2181l(clsM62454g).nullSafe();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: p.nm41$d */
    public class C2173d extends hk60<Boolean> {
        @Override // p204p.hk60
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean fromJson(xl60 xl60Var) {
            return Boolean.valueOf(xl60Var.mo51080n());
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(rm60 rm60Var, Boolean bool) {
            rm60Var.mo56888P(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* JADX INFO: renamed from: p.nm41$e */
    public class C2174e extends hk60<Byte> {
        @Override // p204p.hk60
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte fromJson(xl60 xl60Var) {
            return Byte.valueOf((byte) nm41.m64786a(xl60Var, "a byte", -128, 255));
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(rm60 rm60Var, Byte b) {
            rm60Var.mo56885L(b.intValue() & 255);
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* JADX INFO: renamed from: p.nm41$f */
    public class C2175f extends hk60<Character> {
        @Override // p204p.hk60
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character fromJson(xl60 xl60Var) {
            String strMo51087y = xl60Var.mo51087y();
            if (strMo51087y.length() <= 1) {
                return Character.valueOf(strMo51087y.charAt(0));
            }
            throw new JsonDataException(edb.m38566o("Expected a char but was ", dq60.m36608h('\"', "\"", strMo51087y), " at path ", xl60Var.m91387h()));
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(rm60 rm60Var, Character ch) {
            rm60Var.mo56887N(ch.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* JADX INFO: renamed from: p.nm41$g */
    public class C2176g extends hk60<Double> {
        @Override // p204p.hk60
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double fromJson(xl60 xl60Var) {
            return Double.valueOf(xl60Var.mo51081o());
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(rm60 rm60Var, Double d) {
            rm60Var.mo56884K(d.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* JADX INFO: renamed from: p.nm41$h */
    public class C2177h extends hk60<Float> {
        @Override // p204p.hk60
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float fromJson(xl60 xl60Var) {
            float fMo51081o = (float) xl60Var.mo51081o();
            if (xl60Var.m91388k() || !Float.isInfinite(fMo51081o)) {
                return Float.valueOf(fMo51081o);
            }
            throw new JsonDataException("JSON forbids NaN and infinities: " + fMo51081o + " at path " + xl60Var.m91387h());
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(rm60 rm60Var, Float f) {
            f.getClass();
            rm60Var.mo56886M(f);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* JADX INFO: renamed from: p.nm41$i */
    public class C2178i extends hk60<Integer> {
        @Override // p204p.hk60
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer fromJson(xl60 xl60Var) {
            return Integer.valueOf(xl60Var.mo51082p());
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(rm60 rm60Var, Integer num) {
            rm60Var.mo56885L(num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* JADX INFO: renamed from: p.nm41$j */
    public class C2179j extends hk60<Long> {
        @Override // p204p.hk60
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long fromJson(xl60 xl60Var) {
            return Long.valueOf(xl60Var.mo51083r());
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(rm60 rm60Var, Long l) {
            rm60Var.mo56885L(l.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* JADX INFO: renamed from: p.nm41$k */
    public class C2180k extends hk60<Short> {
        @Override // p204p.hk60
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Short fromJson(xl60 xl60Var) {
            return Short.valueOf((short) nm41.m64786a(xl60Var, "a short", -32768, 32767));
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(rm60 rm60Var, Short sh) {
            rm60Var.mo56885L(sh.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* JADX INFO: renamed from: p.nm41$l */
    public static final class C2181l<T extends Enum<T>> extends hk60<T> {

        /* JADX INFO: renamed from: a */
        private final Class<T> f155288a;

        /* JADX INFO: renamed from: b */
        private final String[] f155289b;

        /* JADX INFO: renamed from: c */
        private final T[] f155290c;

        /* JADX INFO: renamed from: d */
        private final xl60.C2578b f155291d;

        public C2181l(Class<T> cls) {
            this.f155288a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.f155290c = enumConstants;
                this.f155289b = new String[enumConstants.length];
                int i = 0;
                while (true) {
                    T[] tArr = this.f155290c;
                    if (i >= tArr.length) {
                        this.f155291d = xl60.C2578b.m91389a(this.f155289b);
                        return;
                    } else {
                        String strName = tArr[i].name();
                        this.f155289b[i] = f0b1.m40459m(strName, cls.getField(strName));
                        i++;
                    }
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError("Missing field in ".concat(cls.getName()), e);
            }
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public T fromJson(xl60 xl60Var) {
            int iMo51072L = xl60Var.mo51072L(this.f155291d);
            if (iMo51072L != -1) {
                return this.f155290c[iMo51072L];
            }
            String strM91387h = xl60Var.m91387h();
            throw new JsonDataException("Expected one of " + Arrays.asList(this.f155289b) + " but was " + xl60Var.mo51087y() + " at path " + strM91387h);
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(rm60 rm60Var, T t) {
            rm60Var.mo56887N(this.f155289b[t.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f155288a.getName() + ")";
        }
    }

    /* JADX INFO: renamed from: p.nm41$m */
    public static final class C2182m extends hk60<Object> {

        /* JADX INFO: renamed from: a */
        private final p0i0 f155292a;

        /* JADX INFO: renamed from: b */
        private final hk60<List> f155293b;

        /* JADX INFO: renamed from: c */
        private final hk60<Map> f155294c;

        /* JADX INFO: renamed from: d */
        private final hk60<String> f155295d;

        /* JADX INFO: renamed from: e */
        private final hk60<Double> f155296e;

        /* JADX INFO: renamed from: f */
        private final hk60<Boolean> f155297f;

        public C2182m(p0i0 p0i0Var) {
            this.f155292a = p0i0Var;
            this.f155293b = p0i0Var.m68703c(List.class);
            this.f155294c = p0i0Var.m68703c(Map.class);
            this.f155295d = p0i0Var.m68703c(String.class);
            this.f155296e = p0i0Var.m68703c(Double.class);
            this.f155297f = p0i0Var.m68703c(Boolean.class);
        }

        /* JADX INFO: renamed from: a */
        private Class<?> m64805a(Class<?> cls) {
            if (Map.class.isAssignableFrom(cls)) {
                return Map.class;
            }
            return Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        @Override // p204p.hk60
        public Object fromJson(xl60 xl60Var) {
            switch (C2171b.f155287a[xl60Var.mo51068B().ordinal()]) {
                case 1:
                    return this.f155293b.fromJson(xl60Var);
                case 2:
                    return this.f155294c.fromJson(xl60Var);
                case 3:
                    return this.f155295d.fromJson(xl60Var);
                case 4:
                    return this.f155296e.fromJson(xl60Var);
                case 5:
                    return this.f155297f.fromJson(xl60Var);
                case 6:
                    return xl60Var.mo51085t();
                default:
                    throw new IllegalStateException("Expected a value but was " + xl60Var.mo51068B() + " at path " + xl60Var.m91387h());
            }
        }

        @Override // p204p.hk60
        public void toJson(rm60 rm60Var, Object obj) {
            Class<?> cls = obj.getClass();
            if (cls != Object.class) {
                this.f155292a.m68705e(m64805a(cls), f0b1.f64586a).toJson(rm60Var, obj);
            } else {
                rm60Var.mo56891e();
                rm60Var.mo56893i();
            }
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m64786a(xl60 xl60Var, String str, int i, int i2) {
        int iMo51082p = xl60Var.mo51082p();
        if (iMo51082p >= i && iMo51082p <= i2) {
            return iMo51082p;
        }
        String strM91387h = xl60Var.m91387h();
        StringBuilder sbM38571t = edb.m38571t(iMo51082p, "Expected ", str, " but was ", " at path ");
        sbM38571t.append(strM91387h);
        throw new JsonDataException(sbM38571t.toString());
    }
}
