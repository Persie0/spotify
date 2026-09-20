package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class en21 implements fn21 {

    /* JADX INFO: renamed from: a */
    public final List f61053a;

    public en21(List list) {
        this.f61053a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof en21) && wj50.m88271j(this.f61053a, ((en21) obj).f61053a);
    }

    public final int hashCode() {
        return this.f61053a.hashCode();
    }
}
