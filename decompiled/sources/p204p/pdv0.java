package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class pdv0 implements udv0 {

    /* JADX INFO: renamed from: a */
    public final List f176552a;

    public pdv0(List list) {
        this.f176552a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pdv0) && wj50.m88271j(this.f176552a, ((pdv0) obj).f176552a);
    }

    public final int hashCode() {
        return this.f176552a.hashCode();
    }
}
