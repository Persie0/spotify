package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ewt {

    /* JADX INFO: renamed from: a */
    public final List f63600a;

    public ewt(List list) {
        this.f63600a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ewt) && wj50.m88271j(this.f63600a, ((ewt) obj).f63600a);
    }

    public final int hashCode() {
        return this.f63600a.hashCode();
    }
}
