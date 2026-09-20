package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class l9l {

    /* JADX INFO: renamed from: a */
    public final Integer f131142a;

    /* JADX INFO: renamed from: b */
    public final List f131143b;

    public l9l(Integer num, List list) {
        this.f131142a = num;
        this.f131143b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9l)) {
            return false;
        }
        l9l l9lVar = (l9l) obj;
        return wj50.m88271j(this.f131142a, l9lVar.f131142a) && wj50.m88271j(this.f131143b, l9lVar.f131143b);
    }

    public final int hashCode() {
        Integer num = this.f131142a;
        return this.f131143b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }
}
