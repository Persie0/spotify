package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class uca1 implements wca1 {

    /* JADX INFO: renamed from: a */
    public final List f228986a;

    public uca1(List list) {
        this.f228986a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uca1) && wj50.m88271j(this.f228986a, ((uca1) obj).f228986a);
    }

    public final int hashCode() {
        return this.f228986a.hashCode();
    }
}
