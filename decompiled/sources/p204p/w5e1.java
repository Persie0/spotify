package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class w5e1 implements l6e1 {

    /* JADX INFO: renamed from: a */
    public final String f248074a;

    public w5e1(String str) {
        this.f248074a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w5e1) && wj50.m88271j(this.f248074a, ((w5e1) obj).f248074a);
    }

    public final int hashCode() {
        return this.f248074a.hashCode();
    }
}
