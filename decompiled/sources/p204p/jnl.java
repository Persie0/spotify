package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jnl implements knl {

    /* JADX INFO: renamed from: a */
    public final String f114128a;

    /* JADX INFO: renamed from: b */
    public final String f114129b;

    public jnl(String str, String str2) {
        this.f114128a = str;
        this.f114129b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnl)) {
            return false;
        }
        jnl jnlVar = (jnl) obj;
        return wj50.m88271j(this.f114128a, jnlVar.f114128a) && wj50.m88271j(this.f114129b, jnlVar.f114129b);
    }

    public final int hashCode() {
        String str = this.f114128a;
        return this.f114129b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
