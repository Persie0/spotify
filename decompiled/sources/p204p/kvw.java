package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kvw implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f126970a;

    /* JADX INFO: renamed from: b */
    public final Exception f126971b;

    /* JADX INFO: renamed from: c */
    public final String f126972c;

    public kvw(Exception exc, String str, String str2) {
        this.f126970a = str;
        this.f126971b = exc;
        this.f126972c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvw)) {
            return false;
        }
        kvw kvwVar = (kvw) obj;
        return wj50.m88271j(this.f126970a, kvwVar.f126970a) && this.f126971b.equals(kvwVar.f126971b) && wj50.m88271j(this.f126972c, kvwVar.f126972c);
    }

    public final int hashCode() {
        int iHashCode = (this.f126971b.hashCode() + (this.f126970a.hashCode() * 31)) * 31;
        String str = this.f126972c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
