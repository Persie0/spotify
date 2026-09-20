package p204p;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public enum kxq {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);


    /* JADX INFO: renamed from: b */
    public static final Set f127541b;

    /* JADX INFO: renamed from: c */
    public static final Set f127542c;

    /* JADX INFO: renamed from: a */
    public final boolean f127550a;

    static {
        kxq[] kxqVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (kxq kxqVar : kxqVarArrValues) {
            if (kxqVar.f127550a) {
                arrayList.add(kxqVar);
            }
        }
        f127541b = g6f.m43736n1(arrayList);
        f127542c = bk5.m29624m1(values());
    }

    kxq(boolean z) {
        this.f127550a = z;
    }
}
