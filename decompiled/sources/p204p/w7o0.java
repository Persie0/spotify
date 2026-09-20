package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class w7o0 extends y7o0 {

    /* JADX INFO: renamed from: a */
    public final String f248726a;

    public w7o0(String str) {
        this.f248726a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w7o0) && wj50.m88271j(this.f248726a, ((w7o0) obj).f248726a);
    }

    public final int hashCode() {
        return this.f248726a.hashCode();
    }
}
