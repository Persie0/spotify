package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class r03 {

    /* JADX INFO: renamed from: a */
    public final List f194350a;

    public r03(List list) {
        this.f194350a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r03) && wj50.m88271j(this.f194350a, ((r03) obj).f194350a);
    }

    public final int hashCode() {
        return this.f194350a.hashCode();
    }
}
