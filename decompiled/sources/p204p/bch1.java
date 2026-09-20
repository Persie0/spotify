package p204p;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bch1 {

    /* JADX INFO: renamed from: a */
    public static final char[] f25893a;

    static {
        char[] cArr = new char[80];
        f25893a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m28746a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m28746a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m28746a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m28748c(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            jah1 jah1Var = jah1.f110469c;
            sb.append(zuj0.m97037B(new jah1(((String) obj).getBytes(rbh1.f197602a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof jah1) {
            sb.append(": \"");
            sb.append(zuj0.m97037B((jah1) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof gbh1) {
            sb.append(" {");
            m28747b((gbh1) obj, sb, i + 2);
            sb.append("\n");
            m28748c(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        m28746a(sb, i3, "key", entry.getKey());
        m28746a(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m28748c(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0200  */
    /* JADX INFO: renamed from: b */
    public static void m28747b(gbh1 gbh1Var, StringBuilder sb, int i) {
        int i2;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = gbh1Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m28746a(sb, i, strSubstring.substring(0, strSubstring.length() - 4), gbh1.m44224i(method2, gbh1Var, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m28746a(sb, i, strSubstring.substring(0, strSubstring.length() - 3), gbh1.m44224i(method, gbh1Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM44224i = gbh1.m44224i(method4, gbh1Var, new Object[0]);
                    if (method5 == null) {
                        if (objM44224i instanceof Boolean) {
                            if (((Boolean) objM44224i).booleanValue()) {
                                m28746a(sb, i, strSubstring, objM44224i);
                            }
                        } else if (objM44224i instanceof Integer) {
                            if (((Integer) objM44224i).intValue() != 0) {
                                m28746a(sb, i, strSubstring, objM44224i);
                            }
                        } else if (objM44224i instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM44224i).floatValue()) != 0) {
                                m28746a(sb, i, strSubstring, objM44224i);
                            }
                        } else if (!(objM44224i instanceof Double)) {
                            if (objM44224i instanceof String) {
                                zEquals = objM44224i.equals("");
                            } else if (objM44224i instanceof jah1) {
                                zEquals = objM44224i.equals(jah1.f110469c);
                            } else if (objM44224i instanceof r9h1) {
                                if (objM44224i != ((gbh1) ((gbh1) ((r9h1) objM44224i)).mo24628j(6, null))) {
                                    m28746a(sb, i, strSubstring, objM44224i);
                                }
                            } else if (!(objM44224i instanceof Enum) || ((Enum) objM44224i).ordinal() != 0) {
                                m28746a(sb, i, strSubstring, objM44224i);
                            }
                            if (!zEquals) {
                                m28746a(sb, i, strSubstring, objM44224i);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objM44224i).doubleValue()) != 0) {
                            m28746a(sb, i, strSubstring, objM44224i);
                        }
                    } else if (((Boolean) gbh1.m44224i(method5, gbh1Var, new Object[0])).booleanValue()) {
                        m28746a(sb, i, strSubstring, objM44224i);
                    }
                }
            }
            i2 = 3;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m28748c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f25893a, 0, i2);
            i -= i2;
        }
    }
}
