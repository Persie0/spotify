package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class knz0 implements lnz0 {

    /* JADX INFO: renamed from: a */
    public final List f124490a;

    public knz0(List list) {
        this.f124490a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof knz0) && wj50.m88271j(this.f124490a, ((knz0) obj).f124490a);
    }

    public final int hashCode() {
        return this.f124490a.hashCode();
    }
}
