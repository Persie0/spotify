package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w4z implements c5z {

    /* JADX INFO: renamed from: a */
    public final String f247923a;

    public w4z(String str) {
        this.f247923a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w4z) && wj50.m88271j(this.f247923a, ((w4z) obj).f247923a);
    }

    public final int hashCode() {
        return this.f247923a.hashCode();
    }
}
