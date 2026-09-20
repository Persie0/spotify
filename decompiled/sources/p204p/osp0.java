package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class osp0 implements qsp0 {

    /* JADX INFO: renamed from: a */
    public final String f168856a;

    public osp0(String str) {
        this.f168856a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof osp0) && wj50.m88271j(this.f168856a, ((osp0) obj).f168856a);
    }

    public final int hashCode() {
        return this.f168856a.hashCode();
    }
}
