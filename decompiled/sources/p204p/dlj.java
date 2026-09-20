package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dlj {

    /* JADX INFO: renamed from: a */
    public final boolean f50218a;

    /* JADX INFO: renamed from: b */
    public final g8m f50219b;

    /* JADX INFO: renamed from: c */
    public final g4a f50220c;

    public dlj(boolean z, g8m g8mVar, g4a g4aVar) {
        this.f50218a = z;
        this.f50219b = g8mVar;
        this.f50220c = g4aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlj)) {
            return false;
        }
        dlj dljVar = (dlj) obj;
        return this.f50218a == dljVar.f50218a && wj50.m88271j(this.f50219b, dljVar.f50219b) && wj50.m88271j(this.f50220c, dljVar.f50220c);
    }

    public final int hashCode() {
        int iHashCode = (this.f50219b.hashCode() + (Boolean.hashCode(this.f50218a) * 31)) * 31;
        g4a g4aVar = this.f50220c;
        return iHashCode + (g4aVar == null ? 0 : g4aVar.hashCode());
    }
}
