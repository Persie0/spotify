package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes11.dex */
public enum jb70 {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);


    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f110679b;

    /* JADX INFO: renamed from: a */
    public final int f110687a;

    static {
        jb70[] jb70VarArrValues = values();
        int iM31820L = c95.m31820L(jb70VarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L < 16 ? 16 : iM31820L);
        for (jb70 jb70Var : jb70VarArrValues) {
            linkedHashMap.put(Integer.valueOf(jb70Var.f110687a), jb70Var);
        }
        f110679b = linkedHashMap;
    }

    jb70(int i) {
        this.f110687a = i;
    }
}
