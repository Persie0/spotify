package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class w901 implements x901 {

    /* JADX INFO: renamed from: a */
    public final String f249048a;

    public w901(String str) {
        this.f249048a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w901) && wj50.m88271j(this.f249048a, ((w901) obj).f249048a);
    }

    public final int hashCode() {
        return this.f249048a.hashCode();
    }
}
