package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kvr extends mvr {

    /* JADX INFO: renamed from: a */
    public final String f126930a;

    /* JADX INFO: renamed from: b */
    public final String f126931b;

    /* JADX INFO: renamed from: c */
    public final int f126932c;

    public kvr(String str, String str2, int i) {
        this.f126930a = str;
        this.f126931b = str2;
        this.f126932c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvr)) {
            return false;
        }
        kvr kvrVar = (kvr) obj;
        return wj50.m88271j(this.f126930a, kvrVar.f126930a) && wj50.m88271j(this.f126931b, kvrVar.f126931b) && this.f126932c == kvrVar.f126932c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f126932c) + s571.m77243b(this.f126930a.hashCode() * 31, 31, this.f126931b);
    }
}
