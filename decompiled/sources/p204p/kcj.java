package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class kcj extends ncj {

    /* JADX INFO: renamed from: a */
    public final List f121496a;

    public kcj(List list) {
        this.f121496a = list;
    }

    /* JADX INFO: renamed from: a */
    public final List m56054a() {
        return this.f121496a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcj) && wj50.m88271j(this.f121496a, ((kcj) obj).f121496a);
    }

    public final int hashCode() {
        return this.f121496a.hashCode();
    }
}
