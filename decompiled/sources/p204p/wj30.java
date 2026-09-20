package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface wj30 extends ts30 {
    Boolean boolValue(String str);

    boolean boolValue(String str, boolean z);

    wj30 bundle(String str);

    wj30[] bundleArray(String str);

    Double doubleValue(String str);

    Object get(String str);

    int intValue(String str, int i);

    Integer intValue(String str);

    Set keySet();

    long longValue(String str, long j);

    Long longValue(String str);

    String string(String str);

    String string(String str, String str2);

    String[] stringArray(String str);

    vj30 toBuilder();
}
