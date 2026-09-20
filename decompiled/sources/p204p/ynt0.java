package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ynt0 {

    /* JADX INFO: renamed from: a */
    public final boolean f274502a;

    /* JADX INFO: renamed from: b */
    public final m7y f274503b;

    /* JADX INFO: renamed from: c */
    public final boolean f274504c;

    public ynt0(boolean z, m7y m7yVar, boolean z2) {
        this.f274502a = z;
        this.f274503b = m7yVar;
        this.f274504c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynt0)) {
            return false;
        }
        ynt0 ynt0Var = (ynt0) obj;
        return this.f274502a == ynt0Var.f274502a && wj50.m88271j(this.f274503b, ynt0Var.f274503b) && this.f274504c == ynt0Var.f274504c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f274504c) + ((this.f274503b.hashCode() + (Boolean.hashCode(this.f274502a) * 31)) * 31);
    }
}
