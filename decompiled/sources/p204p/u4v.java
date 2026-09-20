package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u4v {

    /* JADX INFO: renamed from: a */
    public final int f226805a;

    /* JADX INFO: renamed from: b */
    public final boolean f226806b;

    /* JADX INFO: renamed from: c */
    public final String f226807c;

    /* JADX INFO: renamed from: d */
    public final boolean f226808d;

    public u4v(String str, int i, boolean z, boolean z2) {
        this.f226805a = i;
        this.f226806b = z;
        this.f226807c = str;
        this.f226808d = z2;
    }

    /* JADX INFO: renamed from: a */
    public static u4v m82366a(u4v u4vVar, int i, String str, int i2) {
        if ((i2 & 1) != 0) {
            i = u4vVar.f226805a;
        }
        boolean z = (i2 & 2) != 0 ? u4vVar.f226806b : true;
        if ((i2 & 4) != 0) {
            str = u4vVar.f226807c;
        }
        boolean z2 = (i2 & 8) != 0 ? u4vVar.f226808d : true;
        u4vVar.getClass();
        return new u4v(str, i, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4v)) {
            return false;
        }
        u4v u4vVar = (u4v) obj;
        return this.f226805a == u4vVar.f226805a && this.f226806b == u4vVar.f226806b && wj50.m88271j(this.f226807c, u4vVar.f226807c) && this.f226808d == u4vVar.f226808d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f226808d) + s571.m77243b(s571.m77245d(edb.m38547C(this.f226805a) * 31, 31, this.f226806b), 31, this.f226807c);
    }
}
