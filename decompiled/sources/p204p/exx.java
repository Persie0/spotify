package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class exx {

    /* JADX INFO: renamed from: a */
    public final List f63870a;

    public exx(List list) {
        this.f63870a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof exx) && wj50.m88271j(this.f63870a, ((exx) obj).f63870a);
    }

    public final int hashCode() {
        return this.f63870a.hashCode();
    }
}
