package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a680 {

    /* JADX INFO: renamed from: a */
    public final List f12711a;

    public a680(List list) {
        this.f12711a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a680) && wj50.m88271j(this.f12711a, ((a680) obj).f12711a);
    }

    public final int hashCode() {
        return this.f12711a.hashCode();
    }

    public /* synthetic */ a680() {
        this(lau.f131415a);
    }
}
