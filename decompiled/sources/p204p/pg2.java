package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class pg2 implements vg2 {

    /* JADX INFO: renamed from: a */
    public final String f177203a;

    public pg2(String str) {
        this.f177203a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pg2) && wj50.m88271j(this.f177203a, ((pg2) obj).f177203a);
    }

    public final int hashCode() {
        return this.f177203a.hashCode();
    }
}
