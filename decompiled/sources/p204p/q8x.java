package p204p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public enum q8x {
    ENTERED(0),
    REJECTED_CLIENT(1),
    DROPPED(2),
    PERSISTED(3),
    REJECTED_BACKEND(4),
    DELIVERED(5),
    DELETED(6),
    UNKNOWN(-1);


    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f186420b;

    /* JADX INFO: renamed from: c */
    public static final Set f186421c;

    /* JADX INFO: renamed from: d */
    public static final int f186422d;

    /* JADX INFO: renamed from: a */
    public final int f186429a;

    static {
        q8x[] q8xVarArrValues = values();
        int iM31820L = c95.m31820L(q8xVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L < 16 ? 16 : iM31820L);
        for (q8x q8xVar : q8xVarArrValues) {
            linkedHashMap.put(Integer.valueOf(q8xVar.f186429a), q8xVar);
        }
        f186420b = linkedHashMap;
        q8x[] q8xVarArrValues2 = values();
        ArrayList arrayList = new ArrayList();
        for (q8x q8xVar2 : q8xVarArrValues2) {
            if (q8xVar2 != UNKNOWN) {
                arrayList.add(q8xVar2);
            }
        }
        Set setM43736n1 = g6f.m43736n1(arrayList);
        f186421c = setM43736n1;
        f186422d = setM43736n1.size();
    }

    q8x(int i) {
        this.f186429a = i;
    }
}
