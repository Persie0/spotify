package p204p;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bov0 {

    /* JADX INFO: renamed from: a */
    public static final List f29260a;

    /* JADX INFO: renamed from: b */
    public static final Map f29261b;

    /* JADX INFO: renamed from: c */
    public static final Map f29262c;

    /* JADX INFO: renamed from: d */
    public static final Map f29263d;

    static {
        jqv0 jqv0Var = qpv0.f191387a;
        int i = 0;
        List<up60> listM46715L = h6f.m46715L(jqv0Var.mo54112b(Boolean.TYPE), jqv0Var.mo54112b(Byte.TYPE), jqv0Var.mo54112b(Character.TYPE), jqv0Var.mo54112b(Double.TYPE), jqv0Var.mo54112b(Float.TYPE), jqv0Var.mo54112b(Integer.TYPE), jqv0Var.mo54112b(Long.TYPE), jqv0Var.mo54112b(Short.TYPE));
        f29260a = listM46715L;
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM46715L, 10));
        for (up60 up60Var : listM46715L) {
            arrayList.add(pft0.m69840u(mif1.m61886u(up60Var), mif1.m61887v(up60Var)));
        }
        f29261b = kkc0.m56705r0(arrayList);
        List<up60> list = f29260a;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(list, 10));
        for (up60 up60Var2 : list) {
            arrayList2.add(pft0.m69840u(mif1.m61887v(up60Var2), mif1.m61886u(up60Var2)));
        }
        f29262c = kkc0.m56705r0(arrayList2);
        List listM46715L2 = h6f.m46715L(eh00.class, gh00.class, th00.class, vh00.class, xh00.class, zh00.class, bi00.class, ci00.class, di00.class, ei00.class, fh00.class, hh00.class, ih00.class, jh00.class, kh00.class, lh00.class, mh00.class, nh00.class, oh00.class, ph00.class, rh00.class, sh00.class, zi00.class);
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(listM46715L2, 10));
        for (Object obj : listM46715L2) {
            int i2 = i + 1;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            arrayList3.add(pft0.m69840u((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f29263d = kkc0.m56705r0(arrayList3);
    }

    /* JADX INFO: renamed from: a */
    public static final vfe m30093a(Class cls) {
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException(dq60.m36610j(cls, "Can't compute ClassId for primitive type: "));
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException(dq60.m36610j(cls, "Can't compute ClassId for array type: "));
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null && cls.getSimpleName().length() != 0) {
            Class<?> declaringClass = cls.getDeclaringClass();
            return declaringClass != null ? m30093a(declaringClass).m85356d(qti0.m73841e(cls.getSimpleName())) : uc5.m82743x(new y400(cls.getName()));
        }
        y400 y400Var = new y400(cls.getName());
        return new vfe(y400Var.m92786b(), jfg1.m53199v(y400Var.f269048a.m95306g()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public static final String m30094b(Class cls) {
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return cls.getName().replace('.', '/');
            }
            return "L" + cls.getName().replace('.', '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException(dq60.m36610j(cls, "Unsupported primitive type: "));
    }

    /* JADX INFO: renamed from: c */
    public static final List m30095c(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return lau.f131415a;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() == null) {
            return bk5.m29620k1(parameterizedType.getActualTypeArguments());
        }
        return btz0.m30496T(btz0.m30483G(hrl0.f94480i, btz0.m30487K(type, hrl0.f94479h)));
    }

    /* JADX INFO: renamed from: d */
    public static final ClassLoader m30096d(Class cls) {
        ClassLoader classLoader = cls.getClassLoader();
        return classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }
}
