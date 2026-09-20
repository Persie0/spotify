package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kf21 implements tf21 {

    /* JADX INFO: renamed from: a */
    public final List f122047a;

    public kf21(List list) {
        this.f122047a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kf21) && wj50.m88271j(this.f122047a, ((kf21) obj).f122047a);
    }

    public final int hashCode() {
        return this.f122047a.hashCode();
    }
}
