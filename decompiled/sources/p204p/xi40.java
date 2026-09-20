package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class xi40 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final String f261762a;

    public xi40(String str) {
        this.f261762a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xi40) && wj50.m88271j(this.f261762a, ((xi40) obj).f261762a);
    }

    public final int hashCode() {
        return this.f261762a.hashCode();
    }
}
