package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w9b {

    /* JADX INFO: renamed from: a */
    public final int f249135a;

    /* JADX INFO: renamed from: b */
    public final String f249136b;

    /* JADX INFO: renamed from: c */
    public final String f249137c;

    public w9b(int i, String str, String str2) {
        this.f249135a = i;
        this.f249136b = str;
        this.f249137c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9b)) {
            return false;
        }
        w9b w9bVar = (w9b) obj;
        return this.f249135a == w9bVar.f249135a && this.f249136b.equals(w9bVar.f249136b) && this.f249137c.equals(w9bVar.f249137c);
    }

    public final int hashCode() {
        return this.f249137c.hashCode() + s571.m77243b(edb.m38547C(this.f249135a) * 31, 31, this.f249136b);
    }
}
