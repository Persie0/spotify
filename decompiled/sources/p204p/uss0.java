package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class uss0 implements wss0 {

    /* JADX INFO: renamed from: a */
    public final List f233682a;

    public uss0(List list) {
        this.f233682a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uss0) && wj50.m88271j(this.f233682a, ((uss0) obj).f233682a);
    }

    public final int hashCode() {
        return this.f233682a.hashCode();
    }
}
