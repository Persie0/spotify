package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class d6y implements kwh0 {

    /* JADX INFO: renamed from: a */
    public final List f45921a;

    public /* synthetic */ d6y() {
        this(lau.f131415a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d6y) && wj50.m88271j(this.f45921a, ((d6y) obj).f45921a);
    }

    public final int hashCode() {
        return this.f45921a.hashCode();
    }

    public d6y(List list) {
        this.f45921a = list;
    }
}
