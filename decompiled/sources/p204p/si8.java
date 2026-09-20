package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class si8 extends wjg1 {

    /* JADX INFO: renamed from: c */
    public final String f209374c;

    public si8(String str) {
        this.f209374c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof si8) && wj50.m88271j(this.f209374c, ((si8) obj).f209374c);
    }

    public final int hashCode() {
        return this.f209374c.hashCode();
    }
}
