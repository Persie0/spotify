package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class gw60 implements sw60 {

    /* JADX INFO: renamed from: a */
    public final String f84944a;

    public gw60(String str) {
        this.f84944a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gw60) && wj50.m88271j(this.f84944a, ((gw60) obj).f84944a);
    }

    public final int hashCode() {
        return this.f84944a.hashCode();
    }
}
