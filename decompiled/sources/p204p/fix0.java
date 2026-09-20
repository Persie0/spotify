package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fix0 {

    /* JADX INFO: renamed from: a */
    public final o7w0 f70011a;

    /* JADX INFO: renamed from: b */
    public final eix0 f70012b;

    /* JADX INFO: renamed from: c */
    public final eix0 f70013c;

    public fix0(o7w0 o7w0Var, eix0 eix0Var, eix0 eix0Var2) {
        this.f70011a = o7w0Var;
        this.f70012b = eix0Var;
        this.f70013c = eix0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fix0)) {
            return false;
        }
        fix0 fix0Var = (fix0) obj;
        return this.f70011a.equals(fix0Var.f70011a) && this.f70012b.equals(fix0Var.f70012b) && this.f70013c.equals(fix0Var.f70013c);
    }

    public final int hashCode() {
        return this.f70013c.hashCode() + ((this.f70012b.hashCode() + (this.f70011a.hashCode() * 31)) * 31);
    }
}
