package p204p;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gsa {

    /* JADX INFO: renamed from: a */
    public static final ArrayMap f83920a;

    /* JADX INFO: renamed from: b */
    public static final ArrayMap f83921b;

    static {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(Boolean.class, "bool");
        arrayMap.put(Byte.class, "byte");
        arrayMap.put(Short.class, "short");
        arrayMap.put(Integer.class, "int");
        arrayMap.put(Long.class, "long");
        arrayMap.put(Double.class, "double");
        arrayMap.put(Float.class, "float");
        arrayMap.put(String.class, "string");
        arrayMap.put(Parcelable.class, "parcelable");
        arrayMap.put(Map.class, "map");
        arrayMap.put(List.class, "list");
        arrayMap.put(IconCompat.class, "image");
        f83920a = arrayMap;
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put(0, "primitive");
        arrayMap2.put(1, "iInterface");
        arrayMap2.put(9, "iBinder");
        arrayMap2.put(2, "map");
        arrayMap2.put(3, "set");
        arrayMap2.put(4, "list");
        arrayMap2.put(5, "object");
        arrayMap2.put(6, "image");
        f83921b = arrayMap2;
    }

    /* JADX INFO: renamed from: a */
    public static void m45627a(Bundle bundle, AbstractCollection abstractCollection, esa esaVar) throws fsa {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList == null) {
            throw new fsa("Bundle is missing the collection", esaVar);
        }
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            abstractCollection.add(m45632f((Bundle) ((Parcelable) it.next()), esaVar));
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m45628b(Bundle bundle, esa esaVar) throws fsa {
        String string = bundle.getString("tag_value");
        if (string == null) {
            throw new fsa(s571.m77251j("Missing enum name [", string, "]"), esaVar);
        }
        String string2 = bundle.getString("tag_class_name");
        if (string2 == null) {
            throw new fsa(s571.m77251j("Missing enum className [", string2, "]"), esaVar);
        }
        try {
            return m45633g(Class.forName(string2), "valueOf", esaVar).invoke(null, string);
        } catch (ClassNotFoundException e) {
            throw new fsa(s571.m77251j("Enum class [", string2, "] not found"), esaVar, e);
        } catch (IllegalArgumentException e2) {
            throw new fsa(dq60.m36615o("Enum value [", string, "] does not exist in enum class [", string2, "]"), esaVar, e2);
        } catch (ReflectiveOperationException e3) {
            throw new fsa(s571.m77251j("Enum of class [", string2, "] missing valueOf method"), esaVar, e3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m45629c(Bundle bundle, esa esaVar) throws fsa {
        IBinder binder = bundle.getBinder("tag_value");
        if (binder == null) {
            throw new fsa("Bundle is missing the binder", esaVar);
        }
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new fsa("Bundle is missing IInterface class name", esaVar);
        }
        try {
            Object objInvoke = m45633g(Class.forName(string), "asInterface", esaVar).invoke(null, binder);
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new fsa("Failed to get interface from binder", esaVar);
        } catch (ClassNotFoundException e) {
            throw new fsa("Binder for unknown IInterface: ".concat(string), esaVar, e);
        } catch (ReflectiveOperationException e2) {
            throw new fsa("Method to create IInterface from a Binder is not accessible for interface: ".concat(string), esaVar, e2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static HashMap m45630d(Bundle bundle, esa esaVar) throws fsa {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList == null) {
            throw new fsa("Bundle is missing the map", esaVar);
        }
        HashMap map = new HashMap();
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = (Bundle) ((Parcelable) it.next());
            Bundle bundle3 = bundle2.getBundle("tag_1");
            Bundle bundle4 = bundle2.getBundle("tag_2");
            if (bundle3 == null) {
                throw new fsa("Bundle is missing key", esaVar);
            }
            map.put(m45632f(bundle3, esaVar), bundle4 == null ? null : m45632f(bundle4, esaVar));
        }
        return map;
    }

    /* JADX INFO: renamed from: e */
    public static Object m45631e(Bundle bundle, esa esaVar) throws fsa {
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new fsa("Bundle is missing the class name", esaVar);
        }
        try {
            Class<?> cls = Class.forName(string);
            if (!cls.isAnnotationPresent(rzb.class)) {
                throw new fsa("Invalid class not marked as CarProtocol: ".concat(string), esaVar);
            }
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            Object objNewInstance = declaredConstructor.newInstance(null);
            for (Field field : m45634h(cls)) {
                field.setAccessible(true);
                String str = field.getDeclaringClass().getName() + field.getName();
                Object obj = bundle.get(str);
                if (obj == null) {
                    obj = bundle.get(str.replaceAll("androidx.core.graphics.drawable.IconCompat", "android.support.v4.graphics.drawable.IconCompat"));
                }
                if (obj instanceof Bundle) {
                    field.set(objNewInstance, m45632f((Bundle) obj, esaVar));
                } else if (obj == null && Log.isLoggable("CarApp.Bun", 3)) {
                    field.toString();
                }
            }
            return objNewInstance;
        } catch (ClassNotFoundException e) {
            throw new fsa("Object for unknown class: ".concat(string), esaVar, e);
        } catch (IllegalArgumentException e2) {
            throw new fsa("Failed to deserialize class: ".concat(string), esaVar, e2);
        } catch (NoSuchMethodException e3) {
            throw new fsa("Object missing no args constructor: ".concat(string), esaVar, e3);
        } catch (ReflectiveOperationException e4) {
            throw new fsa("Constructor or field is not accessible: ".concat(string), esaVar, e4);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Object m45632f(Bundle bundle, esa esaVar) {
        ClassLoader classLoader = gsa.class.getClassLoader();
        Objects.requireNonNull(classLoader);
        bundle.setClassLoader(classLoader);
        int i = bundle.getInt("tag_class_type");
        String str = (String) f83921b.get(Integer.valueOf(bundle.getInt("tag_class_type")));
        if (str == null) {
            str = "unknown";
        }
        esa esaVar2 = new esa(bundle, str, (ArrayDeque) esaVar.f62319c);
        try {
            try {
                switch (i) {
                    case 0:
                        Object obj = bundle.get("tag_value");
                        if (obj == null) {
                            throw new fsa("Bundle is missing the primitive value", esaVar2);
                        }
                        esaVar2.close();
                        return obj;
                    case 1:
                        Object objM45629c = m45629c(bundle, esaVar2);
                        esaVar2.close();
                        return objM45629c;
                    case 2:
                        HashMap mapM45630d = m45630d(bundle, esaVar2);
                        esaVar2.close();
                        return mapM45630d;
                    case 3:
                        HashSet hashSet = new HashSet();
                        m45627a(bundle, hashSet, esaVar2);
                        esaVar2.close();
                        return hashSet;
                    case 4:
                        ArrayList arrayList = new ArrayList();
                        m45627a(bundle, arrayList, esaVar2);
                        esaVar2.close();
                        return arrayList;
                    case 5:
                        Object objM45631e = m45631e(bundle, esaVar2);
                        esaVar2.close();
                        return objM45631e;
                    case 6:
                        Bundle bundle2 = bundle.getBundle("tag_value");
                        if (bundle2 == null) {
                            throw new fsa("IconCompat bundle is null", esaVar2);
                        }
                        IconCompat iconCompatM387a = IconCompat.m387a(bundle2);
                        if (iconCompatM387a == null) {
                            throw new fsa("Failed to create IconCompat from bundle", esaVar2);
                        }
                        esaVar2.close();
                        return iconCompatM387a;
                    case 7:
                        Object objM45628b = m45628b(bundle, esaVar2);
                        esaVar2.close();
                        return objM45628b;
                    case 8:
                        String string = bundle.getString("tag_value");
                        if (string == null) {
                            throw new fsa("Class is missing the class name", esaVar2);
                        }
                        try {
                            Class<?> cls = Class.forName(string);
                            esaVar2.close();
                            return cls;
                        } catch (ClassNotFoundException e) {
                            throw new fsa("Class name is unknown: ".concat(string), esaVar2, e);
                        }
                    case 9:
                        IBinder binder = bundle.getBinder("tag_value");
                        if (binder == null) {
                            throw new fsa("Bundle is missing the binder", esaVar2);
                        }
                        esaVar2.close();
                        return binder;
                    case 10:
                        nsn0 nsn0VarM65570a = nsn0.m65570a(bundle);
                        esaVar2.close();
                        return nsn0VarM65570a;
                    default:
                        throw new fsa("Unsupported class type in bundle: " + i, esaVar2);
                }
            } catch (Throwable th) {
                esaVar2.close();
                throw th;
            }
            esaVar2.close();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    /* JADX INFO: renamed from: g */
    public static Method m45633g(Class cls, String str, esa esaVar) throws fsa {
        if (cls == null || cls == Object.class) {
            throw new fsa("No method " + str + " in class " + cls, esaVar);
        }
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return m45633g(cls.getSuperclass(), str, esaVar);
    }

    /* JADX INFO: renamed from: h */
    public static ArrayList m45634h(Class cls) {
        ArrayList arrayList = new ArrayList();
        if (cls != null && cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            arrayList.addAll(m45634h(cls.getSuperclass()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static String m45635i(Class cls) {
        String str = (String) f83920a.get(cls);
        if (str == null) {
            if (List.class.isAssignableFrom(cls)) {
                return "<List>";
            }
            if (Map.class.isAssignableFrom(cls)) {
                return "<Map>";
            }
            if (Set.class.isAssignableFrom(cls)) {
                return "<Set>";
            }
        }
        return str == null ? cls.getSimpleName() : str;
    }

    /* JADX INFO: renamed from: j */
    public static Bundle m45636j(Collection collection, esa esaVar) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(m45641o(it.next(), "<item " + i + ">", esaVar));
            i++;
        }
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    /* JADX INFO: renamed from: k */
    public static Bundle m45637k(Object obj, esa esaVar) throws fsa {
        Bundle bundle = new Bundle(3);
        bundle.putInt("tag_class_type", 7);
        try {
            bundle.putString("tag_value", (String) m45633g(obj.getClass(), "name", esaVar).invoke(obj, null));
            bundle.putString("tag_class_name", obj.getClass().getName());
            return bundle;
        } catch (ReflectiveOperationException e) {
            throw new fsa("Enum missing name method", esaVar, e);
        }
    }

    /* JADX INFO: renamed from: l */
    public static Bundle m45638l(Map map, esa esaVar) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle2 = new Bundle(2);
            bundle2.putBundle("tag_1", m45641o(entry.getKey(), "<key " + i + ">", esaVar));
            if (entry.getValue() != null) {
                bundle2.putBundle("tag_2", m45641o(entry.getValue(), "<value " + i + ">", esaVar));
            }
            i++;
            arrayList.add(bundle2);
        }
        bundle.putInt("tag_class_type", 2);
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    /* JADX INFO: renamed from: m */
    public static Bundle m45639m(Object obj, esa esaVar) throws fsa {
        String name = obj.getClass().getName();
        if (!obj.getClass().isAnnotationPresent(rzb.class)) {
            throw new fsa("Invalid class not marked as CarProtocol: ".concat(name), esaVar);
        }
        try {
            obj.getClass().getDeclaredConstructor(null);
            ArrayList<Field> arrayListM45634h = m45634h(obj.getClass());
            Bundle bundle = new Bundle(arrayListM45634h.size() + 2);
            bundle.putInt("tag_class_type", 5);
            bundle.putString("tag_class_name", name);
            for (Field field : arrayListM45634h) {
                field.setAccessible(true);
                String strM77250i = s571.m77250i(field.getDeclaringClass().getName(), field.getName());
                try {
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        bundle.putParcelable(strM77250i, m45641o(obj2, field.getName(), esaVar));
                    }
                } catch (IllegalAccessException e) {
                    throw new fsa(edb.m38564m("Field is not accessible: ", strM77250i), esaVar, e);
                }
            }
            return bundle;
        } catch (NoSuchMethodException e2) {
            throw new fsa("Class to deserialize is missing a no args constructor: ".concat(name), esaVar, e2);
        }
    }

    /* JADX INFO: renamed from: n */
    public static Bundle m45640n(Object obj, esa esaVar) throws fsa {
        Bundle bundle = new Bundle(2);
        bundle.putInt("tag_class_type", 0);
        if (obj instanceof Boolean) {
            bundle.putBoolean("tag_value", ((Boolean) obj).booleanValue());
            return bundle;
        }
        if (obj instanceof Byte) {
            bundle.putByte("tag_value", ((Byte) obj).byteValue());
            return bundle;
        }
        if (obj instanceof Character) {
            bundle.putChar("tag_value", ((Character) obj).charValue());
            return bundle;
        }
        if (obj instanceof Short) {
            bundle.putShort("tag_value", ((Short) obj).shortValue());
            return bundle;
        }
        if (obj instanceof Integer) {
            bundle.putInt("tag_value", ((Integer) obj).intValue());
            return bundle;
        }
        if (obj instanceof Long) {
            bundle.putLong("tag_value", ((Long) obj).longValue());
            return bundle;
        }
        if (obj instanceof Double) {
            bundle.putDouble("tag_value", ((Double) obj).doubleValue());
            return bundle;
        }
        if (obj instanceof Float) {
            bundle.putFloat("tag_value", ((Float) obj).floatValue());
            return bundle;
        }
        if (obj instanceof String) {
            bundle.putString("tag_value", (String) obj);
            return bundle;
        }
        if (!(obj instanceof Parcelable)) {
            throw new fsa("Unsupported primitive type: ".concat(obj.getClass().getName()), esaVar);
        }
        bundle.putParcelable("tag_value", (Parcelable) obj);
        return bundle;
    }

    /* JADX INFO: renamed from: o */
    public static Bundle m45641o(Object obj, String str, esa esaVar) throws csa {
        ArrayDeque arrayDeque = (ArrayDeque) esaVar.f62319c;
        if (obj != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (((dsa) it.next()).f52525a == obj) {
                    throw new csa("Found cycle while bundling type ".concat(obj.getClass().getSimpleName()), esaVar);
                }
            }
        }
        esa esaVar2 = new esa(obj, str, arrayDeque);
        try {
            if (obj == null) {
                throw new fsa("Bundling of null object is not supported", esaVar2);
            }
            if (obj instanceof IconCompat) {
                Bundle bundle = new Bundle(2);
                bundle.putInt("tag_class_type", 6);
                bundle.putBundle("tag_value", ((IconCompat) obj).m399m());
                esaVar2.close();
                return bundle;
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Short) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof String) && !(obj instanceof Parcelable)) {
                if (obj instanceof IInterface) {
                    IInterface iInterface = (IInterface) obj;
                    Bundle bundle2 = new Bundle(3);
                    String name = iInterface.getClass().getName();
                    bundle2.putInt("tag_class_type", 1);
                    bundle2.putBinder("tag_value", iInterface.asBinder());
                    bundle2.putString("tag_class_name", name);
                    esaVar2.close();
                    return bundle2;
                }
                if (obj instanceof IBinder) {
                    Bundle bundle3 = new Bundle(2);
                    bundle3.putInt("tag_class_type", 9);
                    bundle3.putBinder("tag_value", (IBinder) obj);
                    esaVar2.close();
                    return bundle3;
                }
                if (obj instanceof Map) {
                    Bundle bundleM45638l = m45638l((Map) obj, esaVar2);
                    esaVar2.close();
                    return bundleM45638l;
                }
                if (obj instanceof List) {
                    Bundle bundleM45636j = m45636j((List) obj, esaVar2);
                    bundleM45636j.putInt("tag_class_type", 4);
                    esaVar2.close();
                    return bundleM45636j;
                }
                if (obj instanceof Set) {
                    Bundle bundleM45636j2 = m45636j((Set) obj, esaVar2);
                    bundleM45636j2.putInt("tag_class_type", 3);
                    esaVar2.close();
                    return bundleM45636j2;
                }
                if (obj.getClass().isEnum()) {
                    Bundle bundleM45637k = m45637k(obj, esaVar2);
                    esaVar2.close();
                    return bundleM45637k;
                }
                if (obj instanceof Class) {
                    Bundle bundle4 = new Bundle(2);
                    bundle4.putInt("tag_class_type", 8);
                    bundle4.putString("tag_value", ((Class) obj).getName());
                    esaVar2.close();
                    return bundle4;
                }
                if (obj.getClass().isArray()) {
                    throw new fsa("Object serializing contains an array, use a list or a set instead", esaVar2);
                }
                if (!(obj instanceof nsn0)) {
                    Bundle bundleM45639m = m45639m(obj, esaVar2);
                    esaVar2.close();
                    return bundleM45639m;
                }
                Bundle bundleM65578i = ((nsn0) obj).m65578i();
                bundleM65578i.putInt("tag_class_type", 10);
                esaVar2.close();
                return bundleM65578i;
            }
            Bundle bundleM45640n = m45640n(obj, esaVar2);
            esaVar2.close();
            return bundleM45640n;
        } catch (Throwable th) {
            try {
                esaVar2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
