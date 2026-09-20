package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class d72 extends e72 {

    /* JADX INFO: renamed from: c */
    public final List f45953c;

    public d72(List list) {
        this.f45953c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d72) && wj50.m88271j(this.f45953c, ((d72) obj).f45953c);
    }

    public final int hashCode() {
        return this.f45953c.hashCode();
    }
}
