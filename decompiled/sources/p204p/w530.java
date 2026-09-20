package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class w530 implements z530 {

    /* JADX INFO: renamed from: a */
    public final String f247981a;

    public w530(String str) {
        this.f247981a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w530) && wj50.m88271j(this.f247981a, ((w530) obj).f247981a);
    }

    public final int hashCode() {
        return this.f247981a.hashCode();
    }
}
