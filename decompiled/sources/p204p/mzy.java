package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mzy extends pzy {

    /* JADX INFO: renamed from: a */
    public final String f148836a;

    /* JADX INFO: renamed from: b */
    public final int f148837b;

    public mzy(String str, int i) {
        this.f148836a = str;
        this.f148837b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzy)) {
            return false;
        }
        mzy mzyVar = (mzy) obj;
        return wj50.m88271j(this.f148836a, mzyVar.f148836a) && this.f148837b == mzyVar.f148837b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f148837b) + (this.f148836a.hashCode() * 31);
    }
}
