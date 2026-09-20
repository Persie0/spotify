package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class oq10 {

    /* JADX INFO: renamed from: a */
    public final List f168053a;

    public oq10(List list) {
        this.f168053a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oq10) && wj50.m88271j(this.f168053a, ((oq10) obj).f168053a);
    }

    public final int hashCode() {
        return this.f168053a.hashCode();
    }
}
