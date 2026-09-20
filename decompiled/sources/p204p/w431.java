package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class w431 implements x431 {

    /* JADX INFO: renamed from: a */
    public final List f247697a;

    public w431(List list) {
        this.f247697a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w431) && wj50.m88271j(this.f247697a, ((w431) obj).f247697a);
    }

    public final int hashCode() {
        return this.f247697a.hashCode();
    }
}
