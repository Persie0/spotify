package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class w581 {

    /* JADX INFO: renamed from: a */
    public final String f248030a;

    /* JADX INFO: renamed from: b */
    public final String f248031b;

    /* JADX INFO: renamed from: c */
    public final int f248032c;

    public w581(String str, String str2, int i) {
        this.f248030a = str;
        this.f248031b = str2;
        this.f248032c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w581)) {
            return false;
        }
        w581 w581Var = (w581) obj;
        return wj50.m88271j(this.f248030a, w581Var.f248030a) && wj50.m88271j(this.f248031b, w581Var.f248031b) && this.f248032c == w581Var.f248032c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f248032c) + s571.m77243b(this.f248030a.hashCode() * 31, 31, this.f248031b);
    }
}
