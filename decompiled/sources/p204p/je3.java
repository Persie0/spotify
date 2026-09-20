package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class je3 extends ig3 {

    /* JADX INFO: renamed from: a */
    public final List f111442a;

    public je3(List list) {
        this.f111442a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof je3) && wj50.m88271j(this.f111442a, ((je3) obj).f111442a);
    }

    public final int hashCode() {
        return this.f111442a.hashCode();
    }
}
