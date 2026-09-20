package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uqk0 extends zqk0 {

    /* JADX INFO: renamed from: a */
    public final List f233065a;

    public uqk0(List list) {
        this.f233065a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uqk0) && wj50.m88271j(this.f233065a, ((uqk0) obj).f233065a);
    }

    public final int hashCode() {
        return this.f233065a.hashCode();
    }
}
