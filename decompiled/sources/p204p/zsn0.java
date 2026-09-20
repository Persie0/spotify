package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zsn0 implements btn0 {

    /* JADX INFO: renamed from: a */
    public final List f285980a;

    public zsn0(List list) {
        this.f285980a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zsn0) && wj50.m88271j(this.f285980a, ((zsn0) obj).f285980a);
    }

    public final int hashCode() {
        return this.f285980a.hashCode();
    }
}
