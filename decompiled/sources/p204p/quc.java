package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class quc {

    /* JADX INFO: renamed from: a */
    public final UUID f192635a;

    /* JADX INFO: renamed from: b */
    public final Integer f192636b;

    public quc(UUID uuid, Integer num) {
        this.f192635a = uuid;
        this.f192636b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof quc)) {
            return false;
        }
        quc qucVar = (quc) obj;
        return wj50.m88271j(this.f192635a, qucVar.f192635a) && wj50.m88271j(this.f192636b, qucVar.f192636b);
    }

    public final int hashCode() {
        int iHashCode = this.f192635a.hashCode() * 31;
        Integer num = this.f192636b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
