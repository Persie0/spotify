package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class fs21 implements gs21 {

    /* JADX INFO: renamed from: a */
    public final String f72753a;

    /* JADX INFO: renamed from: b */
    public final Object f72754b;

    public fs21(String str, List list) {
        this.f72753a = str;
        this.f72754b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs21)) {
            return false;
        }
        fs21 fs21Var = (fs21) obj;
        return this.f72753a.equals(fs21Var.f72753a) && this.f72754b.equals(fs21Var.f72754b);
    }

    public final int hashCode() {
        return this.f72754b.hashCode() + (this.f72753a.hashCode() * 31);
    }
}
