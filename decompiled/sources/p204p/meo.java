package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class meo {

    /* JADX INFO: renamed from: a */
    public final List f142779a;

    /* JADX INFO: renamed from: b */
    public final boolean f142780b;

    /* JADX INFO: renamed from: c */
    public final boolean f142781c;

    /* JADX INFO: renamed from: d */
    public final boolean f142782d;

    /* JADX INFO: renamed from: e */
    public final boolean f142783e;

    /* JADX INFO: renamed from: f */
    public final boolean f142784f;

    public meo(List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f142779a = list;
        this.f142780b = z;
        this.f142781c = z2;
        this.f142782d = z3;
        this.f142783e = z4;
        this.f142784f = z5;
    }

    /* JADX INFO: renamed from: a */
    public static meo m61577a(meo meoVar, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            list = meoVar.f142779a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            z = meoVar.f142780b;
        }
        boolean z6 = z;
        if ((i & 4) != 0) {
            z2 = meoVar.f142781c;
        }
        boolean z7 = z2;
        if ((i & 8) != 0) {
            z3 = meoVar.f142782d;
        }
        boolean z8 = z3;
        if ((i & 16) != 0) {
            z4 = meoVar.f142783e;
        }
        boolean z9 = z4;
        if ((i & 32) != 0) {
            z5 = meoVar.f142784f;
        }
        meoVar.getClass();
        return new meo(list2, z6, z7, z8, z9, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof meo)) {
            return false;
        }
        meo meoVar = (meo) obj;
        return wj50.m88271j(this.f142779a, meoVar.f142779a) && this.f142780b == meoVar.f142780b && this.f142781c == meoVar.f142781c && this.f142782d == meoVar.f142782d && this.f142783e == meoVar.f142783e && this.f142784f == meoVar.f142784f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f142784f) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f142779a.hashCode() * 31, 31, this.f142780b), 31, this.f142781c), 31, this.f142782d), 31, this.f142783e);
    }
}
