package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class job0 implements kob0 {

    /* JADX INFO: renamed from: a */
    public final fk80 f114383a;

    public job0(fk80 fk80Var) {
        this.f114383a = fk80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof job0) && wj50.m88271j(this.f114383a, ((job0) obj).f114383a);
    }

    public final int hashCode() {
        fk80 fk80Var = this.f114383a;
        if (fk80Var == null) {
            return 0;
        }
        return Integer.hashCode(fk80Var.f70497a);
    }
}
