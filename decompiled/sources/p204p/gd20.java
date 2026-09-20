package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gd20 {

    /* JADX INFO: renamed from: a */
    public final Boolean f78712a;

    public gd20(Boolean bool) {
        this.f78712a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gd20) && wj50.m88271j(this.f78712a, ((gd20) obj).f78712a);
    }

    public final int hashCode() {
        Boolean bool = this.f78712a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }
}
