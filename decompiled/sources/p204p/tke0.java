package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class tke0 extends uke0 {

    /* JADX INFO: renamed from: a */
    public final String f221127a;

    public tke0(String str) {
        this.f221127a = str;
    }

    @Override // p204p.uke0
    /* JADX INFO: renamed from: a */
    public final String mo78374a() {
        return this.f221127a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tke0) && wj50.m88271j(this.f221127a, ((tke0) obj).f221127a);
    }

    public final int hashCode() {
        return this.f221127a.hashCode();
    }
}
