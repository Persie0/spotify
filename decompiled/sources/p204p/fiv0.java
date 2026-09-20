package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class fiv0 {

    /* JADX INFO: renamed from: a */
    public final String f69996a;

    /* JADX INFO: renamed from: b */
    public final String f69997b;

    /* JADX INFO: renamed from: c */
    public final Map f69998c;

    public fiv0(String str, String str2, Map map) {
        this.f69996a = str;
        this.f69997b = str2;
        this.f69998c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fiv0)) {
            return false;
        }
        fiv0 fiv0Var = (fiv0) obj;
        return wj50.m88271j(this.f69996a, fiv0Var.f69996a) && wj50.m88271j(this.f69997b, fiv0Var.f69997b) && wj50.m88271j(this.f69998c, fiv0Var.f69998c);
    }

    public final int hashCode() {
        return this.f69998c.hashCode() + s571.m77243b(this.f69996a.hashCode() * 31, 31, this.f69997b);
    }
}
