package p204p;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class sn60 {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashSet f210827a = s601.m77308k0("java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;", alq0.m26361g("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"));

    /* JADX INFO: renamed from: b */
    public static final LinkedHashSet f210828b;

    /* JADX INFO: renamed from: c */
    public static final LinkedHashSet f210829c;

    /* JADX INFO: renamed from: d */
    public static final LinkedHashSet f210830d;

    /* JADX INFO: renamed from: e */
    public static final LinkedHashSet f210831e;

    /* JADX INFO: renamed from: f */
    public static final LinkedHashSet f210832f;

    /* JADX INFO: renamed from: g */
    public static final LinkedHashSet f210833g;

    static {
        List<oo60> listM46715L = h6f.m46715L(oo60.BOOLEAN, oo60.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (oo60 oo60Var : listM46715L) {
            y400 y400Var = oo60Var.f167495d;
            if (y400Var == null) {
                oo60.m67451a(15);
                throw null;
            }
            String strM73844b = y400Var.f269048a.m95306g().m73844b();
            String[] strArr = {oo60Var.f167493b + "Value()" + oo60Var.m67453c()};
            String strConcat = "java/lang/".concat(strM73844b);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, 1);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (String str : strArr2) {
                linkedHashSet2.add(strConcat + '.' + str);
            }
            j6f.m52564V(linkedHashSet2, linkedHashSet);
        }
        f210828b = s601.m77309l0(s601.m77309l0(s601.m77309l0(s601.m77309l0(s601.m77309l0(s601.m77309l0(linkedHashSet, alq0.m26361g("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), alq0.m26360f("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), alq0.m26360f("Double", "isInfinite()Z", "isNaN()Z")), alq0.m26360f("Float", "isInfinite()Z", "isNaN()Z")), alq0.m26360f("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), alq0.m26360f("CharSequence", "isEmpty()Z"));
        f210829c = alq0.m26361g("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f210830d = s601.m77309l0(s601.m77309l0(s601.m77309l0(s601.m77309l0(s601.m77309l0(s601.m77309l0(alq0.m26360f("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), alq0.m26361g("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), alq0.m26360f("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), alq0.m26360f("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), alq0.m26361g("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), alq0.m26361g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), alq0.m26361g("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f210831e = s601.m77309l0(s601.m77309l0(alq0.m26361g("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), alq0.m26361g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), alq0.m26361g("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        oo60 oo60Var2 = oo60.BOOLEAN;
        oo60 oo60Var3 = oo60.BYTE;
        List listM46715L2 = h6f.m46715L(oo60Var2, oo60Var3, oo60.DOUBLE, oo60.FLOAT, oo60Var3, oo60.INT, oo60.LONG, oo60.SHORT);
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Iterator it = listM46715L2.iterator();
        while (it.hasNext()) {
            y400 y400Var2 = ((oo60) it.next()).f167495d;
            if (y400Var2 == null) {
                oo60.m67451a(15);
                throw null;
            }
            String strM73844b2 = y400Var2.f269048a.m95306g().m73844b();
            String[] strArrM26358c = alq0.m26358c("Ljava/lang/String;");
            j6f.m52564V(alq0.m26360f(strM73844b2, (String[]) Arrays.copyOf(strArrM26358c, strArrM26358c.length)), linkedHashSet3);
        }
        String[] strArrM26358c2 = alq0.m26358c("D");
        LinkedHashSet linkedHashSetM77309l0 = s601.m77309l0(linkedHashSet3, alq0.m26360f("Float", (String[]) Arrays.copyOf(strArrM26358c2, strArrM26358c2.length)));
        String[] strArrM26358c3 = alq0.m26358c("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f210832f = s601.m77309l0(linkedHashSetM77309l0, alq0.m26360f("String", (String[]) Arrays.copyOf(strArrM26358c3, strArrM26358c3.length)));
        String[] strArrM26358c4 = alq0.m26358c("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f210833g = alq0.m26360f("Throwable", (String[]) Arrays.copyOf(strArrM26358c4, strArrM26358c4.length));
    }
}
