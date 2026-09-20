package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ur21 implements wr21 {

    /* JADX INFO: renamed from: a */
    public final List f233189a;

    public ur21(List list) {
        this.f233189a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ur21) && wj50.m88271j(this.f233189a, ((ur21) obj).f233189a);
    }

    public final int hashCode() {
        return this.f233189a.hashCode();
    }
}
