package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class w9i extends nai {

    /* JADX INFO: renamed from: a */
    public final List f249182a;

    public w9i(List list) {
        this.f249182a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w9i) && wj50.m88271j(this.f249182a, ((w9i) obj).f249182a);
    }

    public final int hashCode() {
        return this.f249182a.hashCode();
    }
}
