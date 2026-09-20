package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class obb1 {

    /* JADX INFO: renamed from: a */
    public final String f163598a;

    public obb1(String str) {
        this.f163598a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof obb1) && wj50.m88271j(this.f163598a, ((obb1) obj).f163598a);
    }

    public final int hashCode() {
        return this.f163598a.hashCode();
    }
}
