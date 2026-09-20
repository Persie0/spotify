package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yv40 implements aw40 {

    /* JADX INFO: renamed from: a */
    public final String f276566a;

    public yv40(String str) {
        this.f276566a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yv40) && wj50.m88271j(this.f276566a, ((yv40) obj).f276566a);
    }

    public final int hashCode() {
        return this.f276566a.hashCode();
    }
}
