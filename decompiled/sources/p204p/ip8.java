package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ip8 implements rp8 {

    /* JADX INFO: renamed from: a */
    public final w9s f104400a;

    public ip8(w9s w9sVar) {
        this.f104400a = w9sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ip8) && this.f104400a == ((ip8) obj).f104400a;
    }

    public final int hashCode() {
        return this.f104400a.hashCode();
    }
}
