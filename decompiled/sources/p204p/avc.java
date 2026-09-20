package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public enum avc {
    TRACK("track"),
    /* JADX INFO: Fake field, exist only in values array */
    ALBUM("album"),
    /* JADX INFO: Fake field, exist only in values array */
    ARTIST("artist");


    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f20153b;

    /* JADX INFO: renamed from: a */
    public final String f20156a;

    static {
        avc[] avcVarArrValues = values();
        int iM31820L = c95.m31820L(avcVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L < 16 ? 16 : iM31820L);
        for (avc avcVar : avcVarArrValues) {
            linkedHashMap.put(avcVar.f20156a, avcVar);
        }
        f20153b = linkedHashMap;
    }

    avc(String str) {
        this.f20156a = str;
    }
}
