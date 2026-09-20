package p204p;

/* JADX INFO: renamed from: p.ue */
/* JADX INFO: loaded from: classes11.dex */
public final class C2450ue implements InterfaceC2530we {

    /* JADX INFO: renamed from: a */
    public final CharSequence f229351a;

    public C2450ue(String str) {
        this.f229351a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2450ue) && wj50.m88271j(this.f229351a, ((C2450ue) obj).f229351a);
    }

    public final int hashCode() {
        return (this.f229351a.hashCode() + (Integer.hashCode(32) * 31)) * 31;
    }
}
