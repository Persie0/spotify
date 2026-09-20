package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class c870 extends z770 {

    /* JADX INFO: renamed from: a */
    public final String f35129a;

    public c870(String str) {
        this.f35129a = str;
    }

    @Override // p204p.z770
    /* JADX INFO: renamed from: a */
    public final Object mo25032a() {
        return this.f35129a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c870) && wj50.m88271j(this.f35129a, ((c870) obj).f35129a);
    }

    public final int hashCode() {
        return this.f35129a.hashCode();
    }
}
