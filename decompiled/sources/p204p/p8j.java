package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class p8j {

    /* JADX INFO: renamed from: a */
    public final String f174968a;

    /* JADX INFO: renamed from: b */
    public final List f174969b;

    public p8j(String str, ro80 ro80Var) {
        this.f174968a = str;
        this.f174969b = ro80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8j)) {
            return false;
        }
        p8j p8jVar = (p8j) obj;
        return wj50.m88271j(this.f174968a, p8jVar.f174968a) && wj50.m88271j(this.f174969b, p8jVar.f174969b);
    }

    public final int hashCode() {
        return this.f174969b.hashCode() + (this.f174968a.hashCode() * 31);
    }
}
