package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class i7h1 {

    /* JADX INFO: renamed from: a */
    public final Class f99563a;

    /* JADX INFO: renamed from: b */
    public final Class f99564b;

    public /* synthetic */ i7h1(Class cls, Class cls2) {
        this.f99563a = cls;
        this.f99564b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i7h1)) {
            return false;
        }
        i7h1 i7h1Var = (i7h1) obj;
        return i7h1Var.f99563a.equals(this.f99563a) && i7h1Var.f99564b.equals(this.f99564b);
    }

    public final int hashCode() {
        return Objects.hash(this.f99563a, this.f99564b);
    }

    public final String toString() {
        String simpleName = this.f99563a.getSimpleName();
        String simpleName2 = this.f99564b.getSimpleName();
        return dq60.m36618r(new StringBuilder(simpleName.length() + 22 + simpleName2.length()), simpleName, " with primitive type: ", simpleName2);
    }
}
