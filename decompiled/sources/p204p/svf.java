package p204p;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class svf {

    /* JADX INFO: renamed from: a */
    public final String f214420a;

    /* JADX INFO: renamed from: b */
    public final Set f214421b;

    /* JADX INFO: renamed from: c */
    public final Set f214422c;

    /* JADX INFO: renamed from: d */
    public final int f214423d;

    /* JADX INFO: renamed from: e */
    public final int f214424e;

    /* JADX INFO: renamed from: f */
    public final rwf f214425f;

    /* JADX INFO: renamed from: g */
    public final Set f214426g;

    public svf(String str, Set set, Set set2, int i, int i2, rwf rwfVar, Set set3) {
        this.f214420a = str;
        this.f214421b = Collections.unmodifiableSet(set);
        this.f214422c = Collections.unmodifiableSet(set2);
        this.f214423d = i;
        this.f214424e = i2;
        this.f214425f = rwfVar;
        this.f214426g = Collections.unmodifiableSet(set3);
    }

    /* JADX INFO: renamed from: a */
    public static hvf m79442a(Class cls) {
        return new hvf(cls, new Class[0]);
    }

    /* JADX INFO: renamed from: b */
    public static hvf m79443b(eht0 eht0Var) {
        return new hvf(eht0Var, new eht0[0]);
    }

    /* JADX INFO: renamed from: c */
    public static svf m79444c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(eht0.m39004a(cls));
        for (Class cls2 : clsArr) {
            bga.m29092n(cls2, "Null interface");
            hashSet.add(eht0.m39004a(cls2));
        }
        return new svf(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new dvf(obj, 0), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f214421b.toArray()) + ">{" + this.f214423d + ", type=" + this.f214424e + ", deps=" + Arrays.toString(this.f214422c.toArray()) + "}";
    }
}
