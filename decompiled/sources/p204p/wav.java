package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class wav implements xav {

    /* JADX INFO: renamed from: a */
    public final List f249629a;

    public wav(List list) {
        this.f249629a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wav) && wj50.m88271j(this.f249629a, ((wav) obj).f249629a);
    }

    public final int hashCode() {
        return this.f249629a.hashCode();
    }
}
