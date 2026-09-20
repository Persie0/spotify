package p204p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ox31 {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f170863a;

    /* JADX INFO: renamed from: b */
    public static final ArrayList f170864b;

    /* JADX INFO: renamed from: c */
    public static final Object f170865c;

    /* JADX INFO: renamed from: d */
    public static final LinkedHashMap f170866d;

    /* JADX INFO: renamed from: e */
    public static final Set f170867e;

    /* JADX INFO: renamed from: f */
    public static final Set f170868f;

    /* JADX INFO: renamed from: g */
    public static final lx31 f170869g;

    /* JADX INFO: renamed from: h */
    public static final Object f170870h;

    /* JADX INFO: renamed from: i */
    public static final LinkedHashMap f170871i;

    /* JADX INFO: renamed from: j */
    public static final HashSet f170872j;

    /* JADX INFO: renamed from: k */
    public static final LinkedHashMap f170873k;

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, java.util.Map] */
    static {
        Set setM29624m1 = bk5.m29624m1(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(i6f.m49804T(setM29624m1, 10));
        Iterator it = setM29624m1.iterator();
        while (it.hasNext()) {
            arrayList.add(zi5.m96195f("java/util/Collection", (String) it.next(), "Ljava/util/Collection;", oo60.BOOLEAN.m67453c()));
        }
        f170863a = arrayList;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((lx31) it2.next()).f137715e);
        }
        f170864b = arrayList2;
        ArrayList arrayList3 = f170863a;
        ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((lx31) it3.next()).f137712b.m73844b());
        }
        String strConcat = "java/util/".concat("Collection");
        oo60 oo60Var = oo60.BOOLEAN;
        lx31 lx31VarM96195f = zi5.m96195f(strConcat, "contains", "Ljava/lang/Object;", oo60Var.m67453c());
        nx31 nx31Var = nx31.f159351d;
        pqm0 pqm0Var = new pqm0(lx31VarM96195f, nx31Var);
        pqm0 pqm0Var2 = new pqm0(zi5.m96195f("java/util/".concat("Collection"), "remove", "Ljava/lang/Object;", oo60Var.m67453c()), nx31Var);
        pqm0 pqm0Var3 = new pqm0(zi5.m96195f("java/util/".concat("Map"), "containsKey", "Ljava/lang/Object;", oo60Var.m67453c()), nx31Var);
        pqm0 pqm0Var4 = new pqm0(zi5.m96195f("java/util/".concat("Map"), "containsValue", "Ljava/lang/Object;", oo60Var.m67453c()), nx31Var);
        pqm0 pqm0Var5 = new pqm0(zi5.m96195f("java/util/".concat("Map"), "remove", "Ljava/lang/Object;Ljava/lang/Object;", oo60Var.m67453c()), nx31Var);
        pqm0 pqm0Var6 = new pqm0(zi5.m96195f("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), nx31.f159352e);
        lx31 lx31VarM96195f2 = zi5.m96195f("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        nx31 nx31Var2 = nx31.f159349b;
        pqm0 pqm0Var7 = new pqm0(lx31VarM96195f2, nx31Var2);
        pqm0 pqm0Var8 = new pqm0(zi5.m96195f("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), nx31Var2);
        String strConcat2 = "java/util/".concat("List");
        oo60 oo60Var2 = oo60.INT;
        lx31 lx31VarM96195f3 = zi5.m96195f(strConcat2, "indexOf", "Ljava/lang/Object;", oo60Var2.m67453c());
        nx31 nx31Var3 = nx31.f159350c;
        Map mapM56695h0 = kkc0.m56695h0(pqm0Var, pqm0Var2, pqm0Var3, pqm0Var4, pqm0Var5, pqm0Var6, pqm0Var7, pqm0Var8, new pqm0(lx31VarM96195f3, nx31Var3), new pqm0(zi5.m96195f("java/util/".concat("List"), "lastIndexOf", "Ljava/lang/Object;", oo60Var2.m67453c()), nx31Var3));
        f170865c = mapM56695h0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(mapM56695h0.size()));
        for (Map.Entry entry : mapM56695h0.entrySet()) {
            linkedHashMap.put(((lx31) entry.getKey()).f137715e, entry.getValue());
        }
        f170866d = linkedHashMap;
        LinkedHashSet linkedHashSetM77309l0 = s601.m77309l0(f170865c.keySet(), f170863a);
        ArrayList arrayList5 = new ArrayList(i6f.m49804T(linkedHashSetM77309l0, 10));
        Iterator it4 = linkedHashSetM77309l0.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((lx31) it4.next()).f137712b);
        }
        f170867e = g6f.m43736n1(arrayList5);
        ArrayList arrayList6 = new ArrayList(i6f.m49804T(linkedHashSetM77309l0, 10));
        Iterator it5 = linkedHashSetM77309l0.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((lx31) it5.next()).f137715e);
        }
        f170868f = g6f.m43736n1(arrayList6);
        oo60 oo60Var3 = oo60.INT;
        lx31 lx31VarM96195f4 = zi5.m96195f("java/util/List", "removeAt", oo60Var3.m67453c(), "Ljava/lang/Object;");
        f170869g = lx31VarM96195f4;
        Map mapM56695h1 = kkc0.m56695h0(new pqm0(zi5.m96195f("java/lang/".concat("Number"), "toByte", "", oo60.BYTE.m67453c()), qti0.m73841e("byteValue")), new pqm0(zi5.m96195f("java/lang/".concat("Number"), "toShort", "", oo60.SHORT.m67453c()), qti0.m73841e("shortValue")), new pqm0(zi5.m96195f("java/lang/".concat("Number"), "toInt", "", oo60Var3.m67453c()), qti0.m73841e("intValue")), new pqm0(zi5.m96195f("java/lang/".concat("Number"), "toLong", "", oo60.LONG.m67453c()), qti0.m73841e("longValue")), new pqm0(zi5.m96195f("java/lang/".concat("Number"), "toFloat", "", oo60.FLOAT.m67453c()), qti0.m73841e("floatValue")), new pqm0(zi5.m96195f("java/lang/".concat("Number"), "toDouble", "", oo60.DOUBLE.m67453c()), qti0.m73841e("doubleValue")), new pqm0(lx31VarM96195f4, qti0.m73841e("remove")), new pqm0(zi5.m96195f("java/lang/".concat("CharSequence"), "get", oo60Var3.m67453c(), oo60.CHAR.m67453c()), qti0.m73841e("charAt")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicInteger"), "load", "", "I"), qti0.m73841e("get")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicInteger"), "store", "I", "V"), qti0.m73841e("set")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicInteger"), "exchange", "I", "I"), qti0.m73841e("getAndSet")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicInteger"), "fetchAndAdd", "I", "I"), qti0.m73841e("getAndAdd")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicInteger"), "addAndFetch", "I", "I"), qti0.m73841e("addAndGet")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicLong"), "load", "", "J"), qti0.m73841e("get")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicLong"), "store", "J", "V"), qti0.m73841e("set")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicLong"), "exchange", "J", "J"), qti0.m73841e("getAndSet")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicLong"), "fetchAndAdd", "J", "J"), qti0.m73841e("getAndAdd")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicLong"), "addAndFetch", "J", "J"), qti0.m73841e("addAndGet")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicBoolean"), "load", "", "Z"), qti0.m73841e("get")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicBoolean"), "store", "Z", "V"), qti0.m73841e("set")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicBoolean"), "exchange", "Z", "Z"), qti0.m73841e("getAndSet")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicReference"), "load", "", "Ljava/lang/Object;"), qti0.m73841e("get")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicReference"), "store", "Ljava/lang/Object;", "V"), qti0.m73841e("set")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), qti0.m73841e("getAndSet")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "loadAt", "I", "I"), qti0.m73841e("get")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "storeAt", "II", "V"), qti0.m73841e("set")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "exchangeAt", "II", "I"), qti0.m73841e("getAndSet")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), qti0.m73841e("compareAndSet")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), qti0.m73841e("getAndAdd")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), qti0.m73841e("addAndGet")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicLongArray"), "loadAt", "I", "J"), qti0.m73841e("get")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicLongArray"), "storeAt", "IJ", "V"), qti0.m73841e("set")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicLongArray"), "exchangeAt", "IJ", "J"), qti0.m73841e("getAndSet")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), qti0.m73841e("compareAndSet")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), qti0.m73841e("getAndAdd")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), qti0.m73841e("addAndGet")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), qti0.m73841e("get")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), qti0.m73841e("set")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), qti0.m73841e("getAndSet")), new pqm0(zi5.m96195f("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), qti0.m73841e("compareAndSet")));
        f170870h = mapM56695h1;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c95.m31820L(mapM56695h1.size()));
        for (Map.Entry entry2 : mapM56695h1.entrySet()) {
            linkedHashMap2.put(((lx31) entry2.getKey()).f137715e, entry2.getValue());
        }
        f170871i = linkedHashMap2;
        ?? r0 = f170870h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r0.entrySet()) {
            lx31 lx31Var = (lx31) entry3.getKey();
            qti0 qti0Var = (qti0) entry3.getValue();
            linkedHashSet.add(lx31Var.f137711a + '.' + (qti0Var + '(' + lx31Var.f137713c + ')' + lx31Var.f137714d));
        }
        Set setKeySet = f170870h.keySet();
        HashSet hashSet = new HashSet();
        Iterator it6 = setKeySet.iterator();
        while (it6.hasNext()) {
            hashSet.add(((lx31) it6.next()).f137712b);
        }
        f170872j = hashSet;
        Set<Map.Entry> setEntrySet = f170870h.entrySet();
        ArrayList<pqm0> arrayList7 = new ArrayList(i6f.m49804T(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new pqm0(((lx31) entry4.getKey()).f137712b, entry4.getValue()));
        }
        int iM31820L = c95.m31820L(i6f.m49804T(arrayList7, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM31820L);
        for (pqm0 pqm0Var9 : arrayList7) {
            linkedHashMap3.put((qti0) pqm0Var9.f180351b, (qti0) pqm0Var9.f180350a);
        }
        f170873k = linkedHashMap3;
    }
}
